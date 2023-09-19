module Core {
    requires com.google.gson;
    requires org.apache.commons.io;
    requires org.apache.commons.text;
    requires jproc;
    requires java.prefs;
    exports Init;
    exports Preferences;
    exports Properties;
    exports Support;
    exports Utils;
}