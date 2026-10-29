package p058f7;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final Intent a() {
        Intent intent = new Intent("com.nothing.launcher.screen_layout_config");
        intent.setPackage("com.nothing.launcher");
        return intent;
    }

    public static final Intent b() {
        Intent intent = new Intent("com.nothing.launcher.icon_pack_picker");
        intent.setPackage("com.nothing.launcher");
        return intent;
    }
}
