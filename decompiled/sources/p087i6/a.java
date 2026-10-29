package p087i6;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.nothing.wallpaper.common.log.c;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22186a = new a();

    private a() {
    }

    public static /* synthetic */ boolean b(a aVar, Context context, Intent intent, Bundle bundle, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            bundle = null;
        }
        if ((i11 & 8) != 0) {
            i10 = p.f22208a;
        }
        return aVar.a(context, intent, bundle, i10);
    }

    public final boolean a(Context context, Intent intent, Bundle bundle, int i10) {
        n.h(context, "context");
        n.h(intent, "intent");
        try {
            context.startActivity(intent, bundle);
            e = null;
        } catch (ActivityNotFoundException | NullPointerException | SecurityException e10) {
            e = e10;
        }
        if (e != null) {
            if (i10 > 0) {
                Toast.makeText(context, i10, 0).show();
            }
            c.f("ActivityJumper", "startActivitySafely: Unable to launch intent = " + intent + ", exception is " + e.getMessage());
        }
        return e == null;
    }
}
