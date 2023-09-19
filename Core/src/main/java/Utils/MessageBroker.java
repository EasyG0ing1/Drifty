package Utils;

import Properties.MessageCategory;
import Properties.MessageType;
import java.io.PrintStream;
import static Properties.MessageCategory.LOG;

/**
 * The MessageBroker class is responsible for sending different types of messages to the appropriate channels.
 */
public class MessageBroker {
    protected final Logger logger;
    private PrintStream output = new PrintStream(System.out);

    public MessageBroker(PrintStream consoleOutput) {
        output = consoleOutput;
        logger = Logger.getInstance();
    }

    public MessageBroker() {
        logger = Logger.getInstance();
    }

    public void msgDownloadInfo(String message) {
        sendMessage(message, MessageType.INFO, MessageCategory.DOWNLOAD);
    }

    public void msgDownloadError(String message) {
        sendMessage(message, MessageType.ERROR, MessageCategory.DOWNLOAD);
    }

    public void msgLinkInfo(String message) {
        sendMessage(message, MessageType.INFO, MessageCategory.LINK);
    }

    public void msgLinkError(String message) {
        sendMessage(message, MessageType.ERROR, MessageCategory.LINK);
    }

    public void msgLogInfo(String message) {
        sendMessage(message, MessageType.INFO, MessageCategory.LOG);
    }

    public void msgLogError(String message) {
        sendMessage(message, MessageType.ERROR, MessageCategory.LOG);
    }

    public void msgLogWarning(String message) {
        sendMessage(message, MessageType.WARN, MessageCategory.LOG);
    }

    public void msgInitInfo(String message) {
        sendMessage(message, MessageType.INFO, MessageCategory.INITIALIZATION);
    }

    public void msgInitError(String message) {sendMessage(message, MessageType.ERROR, MessageCategory.INITIALIZATION);}

    public void msgDirInfo(String message) {
        sendMessage(message, MessageType.INFO, MessageCategory.DIRECTORY);
    }

    public void msgDirError(String message) {
        sendMessage(message, MessageType.ERROR, MessageCategory.DIRECTORY);
    }

    public void msgFilenameInfo(String message) {
        sendMessage(message, MessageType.INFO, MessageCategory.FILENAME);
    }

    public void msgFilenameError(String message) {
        sendMessage(message, MessageType.ERROR, MessageCategory.FILENAME);
    }

    public void msgBatchInfo(String message) {
        sendMessage(message, MessageType.INFO, MessageCategory.BATCH);
    }

    public void msgBatchError(String message) {
        sendMessage(message, MessageType.ERROR, MessageCategory.BATCH);
    }

    public void msgStyleInfo(String message) {
        sendMessage(message, MessageType.INFO, MessageCategory.STYLE);
    }

    protected void sendMessage(String message, MessageType messageType, MessageCategory messageCategory) {
        if (!messageCategory.equals(LOG)) {
            output.println(message);
        }
        logger.log(messageType, message);
    }
}