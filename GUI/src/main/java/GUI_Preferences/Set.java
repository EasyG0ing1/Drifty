package GUI_Preferences;

import GUI_Support.Folders;
import GUI_Support.JobHistory;
import GUI_Support.Jobs;
import Properties.Program;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;
import org.hildan.fxgson.FxGson;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;

import static GUI_Preferences.Labels.FOLDERS;
import static GUI_Preferences.Labels.MAIN_AUTO_PASTE;
import static Properties.Program.JOB_FILE;
import static Properties.Program.JOB_HISTORY_FILE;

public class Set extends Preferences.Set {
    private static final Set INSTANCE = new Set();

    private Set() {}

    protected static Set getInstance() {
        return INSTANCE;
    }

    public void folders(Folders folders) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = FxGson.addFxSupport(gsonBuilder).setPrettyPrinting().create();
        String value = gson.toJson(folders);
        AppSettings.clear.folders();
        preferences.put(FOLDERS.toString(), value);
    }

    public void mainAutoPaste(boolean isMainAutoPasteEnabled) {
        AppSettings.clear.mainAutoPaste();
        preferences.putBoolean(MAIN_AUTO_PASTE.toString(), isMainAutoPasteEnabled);
    }

    public void Jobs(Jobs jobs) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = FxGson.addFxSupport(gsonBuilder).setPrettyPrinting().create();
        String value = gson.toJson(jobs);
        AppSettings.clear.jobs();
        Path jobBatchFile = Paths.get(Program.get(JOB_FILE));
        try {
            FileUtils.writeStringToFile(jobBatchFile.toFile(), value, Charset.defaultCharset());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void jobHistory(JobHistory jobHistory) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = FxGson.addFxSupport(gsonBuilder).setPrettyPrinting().create();
        String value = gson.toJson(jobHistory);
        Path jobHistoryFile = Paths.get(Program.get(JOB_HISTORY_FILE));
        try {
            FileUtils.writeStringToFile(jobHistoryFile.toFile(), value, Charset.defaultCharset());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
