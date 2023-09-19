package Preferences;

import java.util.prefs.Preferences;

import static Preferences.Labels.LAST_DLP_UPDATE_TIME;
import static Preferences.Labels.LAST_FOLDER;

public class Clear { // This class is used to clear all the user preferences
    private static final Clear INSTANCE = new Clear();
    protected final Preferences preferences = Labels.PREFERENCES;

    protected static Clear getInstance() {
        return INSTANCE;
    }

    public void lastDLPUpdateTime() {
        preferences.remove(LAST_DLP_UPDATE_TIME);
    }

    public void lastFolder() {
        preferences.remove(LAST_FOLDER);
    }
}
