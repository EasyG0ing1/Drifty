package GUI_Utils;

import Main.GUI_Logic;
import Properties.MessageCategory;
import Properties.MessageType;
import javafx.scene.paint.Color;

import static GUI_Support.Constants.GREEN;
import static GUI_Support.Constants.RED;
import static GUI_Support.Constants.YELLOW;
import static Properties.MessageCategory.LOG;

public class MessageBroker extends Utils.MessageBroker {
    public MessageBroker() {
        super();
    }

    @Override
    protected void sendMessage(String message, MessageType messageType, MessageCategory messageCategory) {
        GUI_Logic ui;
        if (!messageCategory.equals(LOG)) {
            ui = GUI_Logic.INSTANCE;
        } else {
            ui = null;
        }
        if (!message.isEmpty()) {
            logger.log(messageType, message);
        }
        Color color = switch (messageType) {
            case ERROR -> RED;
            case INFO -> GREEN;
            default -> YELLOW;
        };
        switch (messageCategory) {
            case LINK -> ui.setLinkOutput(color, message);
            case FILENAME -> ui.setFilenameOutput(color, message);
            case DIRECTORY -> ui.setDirOutput(color, message);
            case DOWNLOAD -> ui.setDownloadOutput(color, message);
        }
    }
}
