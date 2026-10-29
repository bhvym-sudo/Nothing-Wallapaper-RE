package G6;

import E8.i;
import android.content.Context;
import android.util.Pair;
import java.io.PrintWriter;
import java.util.List;
import kotlin.jvm.internal.n;
import p064g3.k;
import p064g3.x;
import p074h3.H;
import p074h3.I;
import p074h3.InterfaceC1363c;
import p079h8.q;
import p079h8.r;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static final void a(Context context, PrintWriter writer) {
        n.h(context, "context");
        n.h(writer, "writer");
        H hA = I.a();
        n.f(hA, "null cannot be cast to non-null type com.android.customization.module.CustomizationInjector");
        InterfaceC1363c interfaceC1363cK = ((K1.a) hA).k(context);
        writer.println("CurrentWallpaperInfo: from cache");
        Pair pairB = interfaceC1363cK.b();
        if (pairB == null) {
            return;
        }
        x xVar = (x) pairB.first;
        if (xVar != null) {
            writer.println("    home " + d(xVar, context));
        }
        x xVar2 = (x) pairB.second;
        if (xVar2 != null) {
            writer.println("    lock " + d(xVar2, context));
        }
    }

    public static final String b(int i10) {
        if (i10 == 0) {
            return "home";
        }
        if (i10 != 1) {
            return i10 != 2 ? "error" : "both";
        }
        return "lock";
    }

    public static final String c(x xVar, Context context) {
        Object objB;
        n.h(xVar, "<this>");
        n.h(context, "context");
        try {
            q.a aVar = q.f21862r;
            objB = q.b(xVar.e(context));
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        if (q.d(objB) != null) {
            objB = AbstractC1444s.l();
        }
        List<String> list = (List) objB;
        StringBuilder sb = new StringBuilder();
        sb.append(xVar.r());
        n.e(list);
        for (String str : list) {
            n.e(str);
            if (!i.f0(str)) {
                sb.append('|');
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static final String d(x xVar, Context context) {
        String str;
        n.h(xVar, "<this>");
        n.h(context, "context");
        if (xVar instanceof k) {
            str = ",component:" + ((k) xVar).q();
        } else {
            str = "";
        }
        String simpleName = xVar.getClass().getSimpleName();
        String strG = xVar.g(context);
        String strR = xVar.r();
        boolean zT = xVar.t();
        boolean zS = xVar.s();
        C6.g gVarK = xVar.k();
        return simpleName + "[" + strG + " id:" + strR + " depth:" + zT + " glass:" + zS + " effect:" + (gVarK != null ? gVarK.c() : null) + " " + str + "]";
    }
}
