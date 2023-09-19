package Support;

public class Constants {
    public static final String APPLICATION_NAME = "Drifty";
    public static final String VERSION_NUMBER = "v2.0.0";
    public static final String PROJECT_WEBSITE = "https://saptarshisarkar12.github.io/Drifty/";
    public static final String DOWNLOADS_FILE_PATH = "Downloads";
    public static final String AUTO_FILE_NAME_DETECTION_FAILED = "Failed to detect the filename! Either the file name or the extension was missing in the url.\nThe url must be of the form of https://www.example.com/filename.extension.";
    public static final String AUTO_FILE_NAME_DETECTION_FAILED_YT_IG = "Failed to detect the filename! A default name will be used instead.";
    public static final String TRYING_TO_AUTO_DETECT_DOWNLOADS_FOLDER = "Trying to automatically detect default Downloads folder...";
    public static final String VIDEO_UNAVAILABLE = "The requested video is unavailable, it has been deleted from the platform.";
    public static final String PERMISSION_DENIED = "You do not have access to download the video, permission is denied.";
    public static final String DRIFTY_COMPONENT_NOT_EXECUTABLE = "A Drifty component (yt-dlp) is not marked as executable.";
    public static final String USER_HOME_PROPERTY = "user.home";
    public static final String FAILED_TO_RETRIEVE_DEFAULT_DOWNLOAD_FOLDER = "Failed to retrieve default download folder!";
    public static final String DEFAULT_FOLDER_DETECTED = "Default download folder detected : ";
    public static final String FILENAME_DETECTED = "Filename detected : ";
    public static final String FAILED_TO_CREATE_LOG = "Failed to create log : ";
    public static final String FILE_NOT_FOUND = "An error occurred! Requested file does not exist, please check the url.";
    public static final String FAILED_TO_CLEAR_LOG = "Failed to clear Log contents !";
    public static final String USER_INTERRUPTION = "User interrupted while downloading the YouTube Video!";
    public static final String ENTER_Y_OR_N = "Please enter Y for yes and N for no!";
    public static final String IO_ERROR_YOUTUBE = "An I/O error occurred while initialising YouTube video downloader! ";
    public static final String YT_DOWNLOAD_USER_INTERRUPT = "An I/O error occurred while initialising YouTube video downloader! ";
    /*
    Denoting a Constant with _F indicates that it needs to be used with String.format(), where %s is replaced with the
    string provided in String.format():
        String.format(CONSTANT_F, "String replacing %s")

    Multiple %s values can be used where each one is replaced in the constant using String.format() with more commas:
        String.Format(CONSTANT_F, "String One", "String Two", "String Three); etc.
     */
    public static final String DOWNLOADING_F = "Downloading \"%s\" ...";
    public static final String TRYING_TO_DOWNLOAD_F = "Trying to download \"%s\" ...";
    public static final String WRITE_ACCESS_DENIED_F = "Write Access To \"%s\" DENIED!";
    public static final String FAILED_CONNECTION_F = "Failed to connect to %s!";
    public static final String SUCCESSFULLY_DOWNLOADED_F = "Successfully downloaded %s!";
    public static final String FAILED_TO_DOWNLOAD_F = "Failed to download %s!";

    public static final long ONE_KILOBYTE = 1024;
    public static final long ONE_MEGABYTE = ONE_KILOBYTE * 1024;
    public static final long ONE_TENTH_MEGABYTE = ONE_MEGABYTE * 104;
    public static final long ONE_GIGABYTE = ONE_MEGABYTE * 1024;
    public static final long HALF_GIGABYTE = ONE_MEGABYTE * 512;
    public static final long QUARTER_GIGABYTE = ONE_MEGABYTE * 256;
    public static final long TWO_GIGABYTE = ONE_GIGABYTE * 2;
    public static final long THREE_GIGABYTE = ONE_GIGABYTE * 3;
    public static final long FOUR_GIGABYTE = ONE_GIGABYTE * 4;
    public static final long FIVE_GIGABYTE = ONE_GIGABYTE * 5;
}
