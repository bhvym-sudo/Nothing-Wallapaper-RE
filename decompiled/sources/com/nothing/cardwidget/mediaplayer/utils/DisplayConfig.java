package com.nothing.cardwidget.mediaplayer.utils;

/* JADX INFO: loaded from: classes2.dex */
public final class DisplayConfig {
    public static final DisplayConfig INSTANCE = new DisplayConfig();

    public static final class Common {
        public static final Common INSTANCE = new Common();
        public static final int MARGIN_PARENT_NEXT_PREVIOUS_ICON = 81;
        public static final int MARGIN_TOP_END_MUSIC_APP_ICON = 11;
        public static final int PADDING_MUSIC_APP_ICON = 26;
        public static final int STANDARD_AUTHORIZE_GUIDE_TEXT_SIZE = 53;
        public static final int STANDARD_MUSIC_APP_ICON_SIZE = 126;
        public static final int STANDARD_MUSIC_DEFAULT_ICON_HEIGHT = 168;
        public static final int STANDARD_MUSIC_DEFAULT_ICON_WIDTH = 189;
        public static final int STANDARD_NORMAL_CARD_SIZE = 452;

        private Common() {
        }
    }

    public static final class FirstPage {
        public static final FirstPage INSTANCE = new FirstPage();
        public static final int MARGIN_START_BOTTOM_MUSIC_WAVEFORM = 11;
        public static final int STANDARD_MUSIC_WAVEFORM_SIZE = 126;

        private FirstPage() {
        }
    }

    public static final class SecondPage {
        public static final SecondPage INSTANCE = new SecondPage();
        public static final int MARGIN_HORIZONTAL_MUSIC_NAME_LAYOUT = 42;
        public static final int MARGIN_TOP_LEFT_ALBUM_SMALL_ICON = 42;
        public static final int MARGIN_TOP_MUSIC_NAME_LAYOUT = 32;
        public static final int STANDARD_ALBUM_NAME_TEXT_SIZE = 37;
        public static final int STANDARD_ALBUM_SMALL_ICON_SIZE = 184;
        public static final int STANDARD_MUSIC_NAME_TEXT_SIZE = 42;

        private SecondPage() {
        }
    }

    private DisplayConfig() {
    }
}
