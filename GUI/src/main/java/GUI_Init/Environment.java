package GUI_Init;

import GUI_Utils.MessageBroker;

/**
 * A class representing the environment.
 * This class extends the Init.Environment class of the Core module.
 * The environment class provides access to the MessageBroker object designed specifically for the GUI.
 */
public class Environment extends Init.Environment {
    private static MessageBroker M;

    public static void setMessageBroker(MessageBroker messageBroker) {
        M = messageBroker;
        Init.Environment.setMessageBroker(messageBroker);
    }

    public static MessageBroker getMessageBroker() {
        return M;
    }
}
