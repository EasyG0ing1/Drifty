package CLI_Utils;

import Utils.ScannerFactory;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

import static CLI_Support.Constants.*;

public class Utility extends Utils.Utility {
    private static final Scanner SC = ScannerFactory.getInstance();

    public boolean yesNoValidation(String input, String printMessage) {
        while (input.isEmpty()) {
            System.out.println(ENTER_Y_OR_N);
            M.msgLogError(ENTER_Y_OR_N);
            System.out.print(printMessage);
            input = SC.nextLine().toLowerCase();
        }
        char choice = input.charAt(0);
        if (choice == 'y') {
            return true;
        } else if (choice == 'n') {
            return false;
        } else {
            System.out.println("Invalid input!");
            M.msgLogError("Invalid input!");
            System.out.print(printMessage);
            input = SC.nextLine().toLowerCase();
            yesNoValidation(input, printMessage);
        }
        return false;
    }

    public static String findFilenameInLink(String link) {
        String filename = "";
        if (isInstagram(link) || isYoutube(link)) {
            LinkedList<String> linkMetadataList = Utils.Utility.getLinkMetadata(link);
            for (String json : Objects.requireNonNull(linkMetadataList)) {
                filename = Utils.Utility.getFilenameFromJson(json);
            }
        } else {
            // Example: "example.com/file.txt" prints "Filename detected: file.txt"
            // example.com/file.json -> file.json
            String file = link.substring(link.lastIndexOf("/") + 1);
            if (file.isEmpty()) {
                M.msgFilenameError(AUTO_FILE_NAME_DETECTION_FAILED);
                return null;
            }
            int index = file.lastIndexOf(".");
            if (index < 0) {
                M.msgFilenameError(AUTO_FILE_NAME_DETECTION_FAILED);
                return null;
            }
            String extension = file.substring(index);
            // edge case 1: "example.com/."
            if (extension.length() == 1) {
                M.msgFilenameError(AUTO_FILE_NAME_DETECTION_FAILED);
                return null;
            }
            // file.png?width=200 -> file.png
            filename = file.split("([?])")[0];
            M.msgFilenameInfo(FILENAME_DETECTED + "\"" + filename + "\"");
        }
        return filename;
    }
}
