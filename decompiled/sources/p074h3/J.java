package p074h3;

import H3.k;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class J implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21623a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    @Override // p074h3.L
    public Intent a(Intent intent) {
        n.h(intent, "intent");
        Intent intent2 = new Intent("android.settings.SETTINGS_EMBED_DEEP_LINK_ACTIVITY");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        intent2.putExtra("android.provider.extra.SETTINGS_EMBEDDED_DEEP_LINK_HIGHLIGHT_MENU_KEY", "top_level_wallpaper");
        intent2.putExtra("android.provider.extra.SETTINGS_EMBEDDED_DEEP_LINK_INTENT_URI", intent.toUri(1));
        return intent2;
    }

    @Override // p074h3.L
    public boolean b(Context context) {
        n.h(context, "context");
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.SET_WALLPAPER").setPackage(context.getPackageName());
        n.g(intent, "setPackage(...)");
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(a(intent), ArrayPool.STANDARD_BUFFER_SIZE_BYTES);
        return (resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo : null) != null && new k(context).m();
    }
}
