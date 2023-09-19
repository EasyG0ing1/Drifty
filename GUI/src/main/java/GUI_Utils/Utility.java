package GUI_Utils;

import GUI_Init.Environment;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.apache.commons.text.StringEscapeUtils;

import java.net.URL;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static GUI_Support.Constants.*;

public class Utility extends Utils.Utility {
    public static boolean isExtractableLink(String link) {
        return isYoutube(link) || isInstagram(link);
    }

    public static String getURLFromJson(String jsonString) {
        String json = makePretty(jsonString);
        String regexLink = "(\"webpage_url\": \")(.+)(\")";
        String extractedUrl = "";
        Pattern p = Pattern.compile(regexLink);
        Matcher m = p.matcher(json);
        if (m.find()) {
            extractedUrl = StringEscapeUtils.unescapeJava(m.group(2));
        }
        return extractedUrl;
    }

    /*
    Methods for obtaining consistent Stages and Scenes
     */
    public static Stage getStage(String title, boolean isPrimaryStage) {
        Stage stage = new Stage();
        Image icon = new Image(Objects.requireNonNull(DRIFTY_ICON).toExternalForm());
        stage.getIcons().add(icon);
        stage.setTitle(title);
        if (isPrimaryStage) {
            stage.setOnCloseRequest(e -> {
                Environment.getMessageBroker().msgLogInfo(GUI_APPLICATION_TERMINATED);
                System.exit(0);
            });
            stage.setResizable(true);
        } else {
            stage.centerOnScreen();
        }
        return stage;
    }

    public static Scene getScene(Parent root) {
        Scene scene = new Scene(root);
        addCSS(scene, CHECK_BOX_CSS, CONTEXT_MENU_CSS, LABEL_CSS, LIST_VIEW_CSS, MENU_CSS, PROGRESS_BAR_CSS, SCENE_CSS, SCROLL_PANE_CSS, TEXT_FIELD_CSS, V_BOX_CSS, BUTTON_CSS);
        return scene;
    }

    public static Font getFont(double size) {
        return new Font(Objects.requireNonNull(MONACO_TTF).toExternalForm(), size);
    }

    public static void addCSS(Scene scene, URL ...css) {
        for (URL url : css) {
            scene.getStylesheets().add(url.toExternalForm());
        }
    }
}
