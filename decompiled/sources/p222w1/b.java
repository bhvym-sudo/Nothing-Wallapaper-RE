package p222w1;

import android.content.Context;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f28549a = {"ic_wifi_signal_3", "ic_qs_bluetooth", "ic_qs_dnd", "ic_qs_flashlight", "ic_qs_auto_rotate", "ic_qs_battery_saver", "ic_signal_cellular_3_4_bar", "ic_battery_80_24dp"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f28550b = new ArrayList();

    static String a(Context context) {
        return context.getString(R.string.launcher_overlayable_package);
    }

    static String[] b(Context context) {
        ArrayList arrayList = f28550b;
        if (arrayList.isEmpty()) {
            arrayList.addAll(Arrays.asList("android", "com.android.settings", "com.android.systemui"));
            arrayList.add(a(context));
            arrayList.add(context.getPackageName());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
