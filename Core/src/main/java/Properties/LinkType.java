package Properties;

import Utils.Utility;

public enum LinkType {
    YOUTUBE, INSTAGRAM, OTHER;

    public static LinkType getLinkType(String link) {
        if (Utility.isYoutube(link)) {
            return YOUTUBE;
        } else if (Utility.isInstagram(link)) {
            return INSTAGRAM;
        } else {
            return OTHER;
        }
    }
}
