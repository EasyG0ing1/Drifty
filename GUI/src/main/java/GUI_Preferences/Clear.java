package GUI_Preferences;

import static GUI_Preferences.Labels.*;

public class Clear extends Preferences.Clear {
    private static final Clear INSTANCE = new Clear();

    private Clear() {}

    protected static Clear getInstance() {
        return INSTANCE;
    }

    public void folders() {
        preferences.remove(FOLDERS.toString());
    }

    public void mainAutoPaste() {
        preferences.remove(MAIN_AUTO_PASTE.toString());
    }

    public void jobs() {
        preferences.remove(JOBS.toString());
    }
}
