package Preferences;

import java.util.prefs.Preferences;

import static Preferences.Labels.LAST_DLP_UPDATE_TIME;
import static Preferences.Labels.LAST_FOLDER;

public class Set {
    private static final Set INSTANCE = new Set();
    protected final Preferences preferences = Labels.PREFERENCES;

    protected static Set getInstance() {
        return INSTANCE;
    }

    public void lastDLPUpdateTime(long value) {
        AppSettings.clear.lastDLPUpdateTime();
        preferences.putLong(LAST_DLP_UPDATE_TIME, value);
    }

    public void lastFolder(String lastFolderPath) {
        AppSettings.clear.lastFolder();
        preferences.put(LAST_FOLDER, lastFolderPath);
    }
}
