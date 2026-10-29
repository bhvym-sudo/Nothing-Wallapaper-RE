package p058f7;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final Intent a() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName("com.android.settings", "com.android.settings.SubSettings");
        intent.putExtra(":settings:show_fragment", "com.nothing.settings.lockscreen.LockscreenAndAodSettings");
        return intent;
    }

    public static final Intent b() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName("com.android.settings", "com.android.settings.SubSettings");
        intent.putExtra(":settings:show_fragment", "com.nothing.settings.display.lockscreen.LockScreenShortcutFragment");
        return intent;
    }

    public static final Intent c() {
        Intent intent = new Intent();
        intent.setClassName("com.nothing.systemuitool", "com.nothing.systemuitool.WidgetPickerActivity");
        return intent;
    }
}
