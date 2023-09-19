package GUI_Support;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Screen;

import java.net.URL;
import java.util.Objects;

public class Constants extends Support.Constants {
    public static final String GUI_APPLICATION_STARTED = "Drifty GUI (Graphical User Interface) Application Started !";
    public static final String GUI_APPLICATION_TERMINATED = "Drifty GUI (Graphical User Interface) Application Terminated!";
    public static final String FAILED_READING_STREAM = "Failed to get I/O operations channel to read from the data stream !";
    private static final Rectangle2D SCREEN_SIZE = Screen.getPrimary().getBounds();
    public static final double SCREEN_WIDTH = SCREEN_SIZE.getWidth();
    public static final double SCREEN_HEIGHT = SCREEN_SIZE.getHeight();

    // CSS Files
    public static final URL SCENE_CSS = Constants.class.getResource("/CSS/Scene.css");
    public static final URL LIST_VIEW_CSS = Constants.class.getResource("/CSS/ListView.css");
    public static final URL TEXT_FIELD_CSS = Constants.class.getResource("/CSS/TextField.css");
    public static final URL CONTEXT_MENU_CSS = Constants.class.getResource("/CSS/ContextMenu.css");
    public static final URL LABEL_CSS = Constants.class.getResource("/CSS/Label.css");
    public static final URL CHECK_BOX_CSS = Constants.class.getResource("/CSS/CheckBox.css");
    public static final URL V_BOX_CSS = Constants.class.getResource("/CSS/VBox.css");
    public static final URL MENU_CSS = Constants.class.getResource("/CSS/Menu.css");
    public static final URL PROGRESS_BAR_CSS = Constants.class.getResource("/CSS/ProgressBar.css");
    public static final URL SCROLL_PANE_CSS = Constants.class.getResource("/CSS/ScrollPane.css");
    public static final URL BUTTON_CSS = Constants.class.getResource("/CSS/Button.css");

    // Font File
    public static final URL MONACO_TTF = Constants.class.getResource("/Fonts/Monaco.ttf");

    // Drifty GUI Images
    public static final URL DRIFTY_MAIN_PNG = Constants.class.getResource("/Backgrounds/DriftyMain.png");
    public static final URL SAVE_UP_PNG = Constants.class.getResource("/Buttons/Save/SaveUp.png");
    public static final URL SAVE_DOWN_PNG = Constants.class.getResource("/Buttons/Save/SaveDown.png");
    public static final URL START_UP_PNG = Constants.class.getResource("/Buttons/Start/StartUp.png");
    public static final URL START_DOWN_PNG = Constants.class.getResource("/Buttons/Start/StartDown.png");
    public static final URL LINK_PNG = Constants.class.getResource("/Labels/Link.png");
    public static final URL AUTO_PASTE_PNG = Constants.class.getResource("/Labels/AutoPaste.png");
    public static final URL DIRECTORY_PNG = Constants.class.getResource("/Labels/Directory.png");
    public static final URL FILENAME_PNG = Constants.class.getResource("/Labels/Filename.png");
    public static final URL DRIFTY_ICON = Constants.class.getResource("/Icons/AppIcon.png");
    public static final Image IMG_MAIN_GUI_BANNER = new Image(Objects.requireNonNull(DRIFTY_MAIN_PNG).toExternalForm());
    public static final Image IMG_LINK_LABEL = new Image(Objects.requireNonNull(LINK_PNG).toExternalForm());
    public static final Image IMG_DIR_LABEL = new Image(Objects.requireNonNull(DIRECTORY_PNG).toExternalForm());
    public static final Image IMG_FILENAME_LABEL = new Image(Objects.requireNonNull(FILENAME_PNG).toExternalForm());
    public static final Image IMG_AUTO_PASTE_LABEL = new Image(Objects.requireNonNull(AUTO_PASTE_PNG).toExternalForm());
    public static final Image IMG_START_UP = new Image(Objects.requireNonNull(START_UP_PNG).toExternalForm());
    public static final Image IMG_START_DOWN = new Image(Objects.requireNonNull(START_DOWN_PNG).toExternalForm());
    public static final Image IMG_SAVE_UP = new Image(Objects.requireNonNull(SAVE_UP_PNG).toExternalForm());
    public static final Image IMG_SAVE_DOWN = new Image(Objects.requireNonNull(SAVE_DOWN_PNG).toExternalForm());
    public static final Color GREEN = Color.rgb(0, 150, 0);
    public static final Color RED = Color.rgb(157, 0, 0);
    public static final Color PURPLE = Color.rgb(125, 0, 75);
    public static final Color HOTPINK = Color.rgb(255, 0, 175);
    public static final Color BLACK = Color.rgb(0, 0, 0);
    public static final Color YELLOW = Color.rgb(255, 255, 0);
    public static final Color BLUE = Color.rgb(0,100,255);
}
