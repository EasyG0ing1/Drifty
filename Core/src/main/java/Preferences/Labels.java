package Preferences;

import java.util.prefs.Preferences;

public interface Labels {
    Preferences PREFERENCES = Preferences.userNodeForPackage(Labels.class);
    String LAST_DLP_UPDATE_TIME = "LAST_DLP_UPDATE_TIME";
    String LAST_FOLDER = "LAST_FOLDER";
}
