package p084i3;

import H3.AbstractC0851a;
import J6.i;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.nothing.wallpaper.R;
import java.util.Objects;
import p064g3.x;
import p074h3.F;
import p074h3.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class D0 {

    public interface a {
        void a(CharSequence charSequence, Intent intent);
    }

    public static void b(Context context, x xVar, final a aVar) {
        String strC = xVar.c(context);
        final String string = context.getString(Objects.equals(xVar.g(context), i.y(context)) ? R.string.nt_save : R.string.explore);
        if (strC == null || strC.isEmpty()) {
            aVar.a(string, null);
        } else {
            I.a().j(context).a(Uri.parse(xVar.c(context)), new F.a() { // from class: i3.C0
                @Override // h3.F.a
                public final void a(Intent intent) {
                    aVar.a(string, intent);
                }
            });
        }
    }

    public static boolean c(Context context, Intent intent) {
        return (intent == null || AbstractC0851a.j(context)) ? false : true;
    }
}
