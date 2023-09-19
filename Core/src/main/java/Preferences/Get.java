package Preferences;

import java.nio.file.Paths;
import java.util.prefs.Preferences;

import static Preferences.Labels.*;

public class Get {
    protected final Preferences preferences = Labels.PREFERENCES;
    private static final Get INSTANCE = new Get();

    protected static Get getInstance() {
        return INSTANCE;
    }

    public long lastDLPUpdateTime() {
        return preferences.getLong(LAST_DLP_UPDATE_TIME, 1000L);
    }

    public String lastDownloadFolder() {
        String defaultPath = Paths.get(System.getProperty("user.home"), "Downloads").toAbsolutePath().toString();
        return preferences.get(LAST_FOLDER, defaultPath);
    }
}
