module GUI {
    requires Core;
    requires javafx.graphics;
    requires javafx.controls;
    requires org.apache.commons.text;
    requires org.apache.commons.io;
    requires com.google.gson;
    requires org.hildan.fxgson;
    requires java.prefs;

    exports GUI_Support;
    exports GUI_Utils;
    exports Main to javafx.graphics;
    exports Windows to javafx.graphics;

    opens GUI_Support to com.google.gson;
    opens Windows to com.google.gson;
}