package p137n6;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import kotlin.jvm.internal.n;
import p058f7.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final ResolveInfo a(PackageManager packageManager) {
        n.h(packageManager, "<this>");
        return packageManager.resolveActivity(a.a(), ArrayPool.STANDARD_BUFFER_SIZE_BYTES);
    }

    public static final ResolveInfo b(PackageManager packageManager) {
        n.h(packageManager, "<this>");
        return packageManager.resolveActivity(a.b(), ArrayPool.STANDARD_BUFFER_SIZE_BYTES);
    }
}
