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
import static GUI_Preferences.Labels.ALWAYS_AUTO_PASTE;
import static Properties.Program.JOB_FILE;
import static Properties.Program.JOB_HISTORY_FILE;

public class Get extends Preferences.Get {
    private static final Get INSTANCE = new Get();

    private Get() {}

    protected static Get getInstance() {
        return INSTANCE;
    }

    public Folders folders() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = FxGson.addFxSupport(gsonBuilder).setPrettyPrinting().create();
        Folders folders = new Folders();
        String json = preferences.get(FOLDERS.toString(), "");
        if (!json.isEmpty()) {
            folders = gson.fromJson(json, Folders.class);
        }
        folders.checkFolders();
        return folders;
    }

    public boolean mainAutoPaste() {
        return preferences.getBoolean(MAIN_AUTO_PASTE.toString(), false);
    }

    public Jobs jobs() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = FxGson.addFxSupport(gsonBuilder).setPrettyPrinting().create();
        Jobs jobs;
        Path jobBatchFile = Paths.get(Program.get(JOB_FILE));
        try {
            String json = FileUtils.readFileToString(jobBatchFile.toFile(), Charset.defaultCharset());
            if (json != null && !json.isEmpty()) {
                jobs = gson.fromJson(json, Jobs.class);
                return jobs;
            }
        } catch (IOException ignored) {
        }
        return new Jobs();
    }

    public JobHistory jobHistory() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = FxGson.addFxSupport(gsonBuilder).setPrettyPrinting().create();
        JobHistory jobHistory;
        Path jobHistoryFile = Paths.get(Program.get(JOB_HISTORY_FILE));
        try {
            if (!jobHistoryFile.toFile().exists()) {
                jobHistory = new JobHistory();
                String json = gson.toJson(jobHistory);
                FileUtils.write(jobHistoryFile.toFile(), json, Charset.defaultCharset());
            }
            String json = FileUtils.readFileToString(jobHistoryFile.toFile(), Charset.defaultCharset());
            if (json != null && !json.isEmpty()) {
                jobHistory = gson.fromJson(json, JobHistory.class);
                return jobHistory;
            }
        } catch (IOException ignored) {
        }
        return new JobHistory();
    }

    public boolean alwaysAutoPaste() {
        return preferences.getBoolean(ALWAYS_AUTO_PASTE.toString(), false);
    }
}
