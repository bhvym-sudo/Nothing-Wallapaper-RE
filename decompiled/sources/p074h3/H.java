package p074h3;

import D3.c;
import H3.k;
import android.content.Context;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.lifecycle.InterfaceC1163x;
import com.android.wallpaper.picker.f;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.n;
import p010b.j;
import p034d3.a;
import p064g3.InterfaceC1357b;
import p064g3.v;
import p064g3.x;

/* JADX INFO: loaded from: classes.dex */
public interface H {
    U A(Context context);

    a C();

    InterfaceC1364d D(j jVar);

    f.a E();

    InterfaceC1357b a(Context context);

    AbstractComponentCallbacksC1132q b(Context context, x xVar, int i10, boolean z9, boolean z10, boolean z11, boolean z12);

    InterfaceC1361a c(Context context);

    M d(Context context);

    k e(Context context);

    W f(Context context);

    default Map g(Context context) {
        n.h(context, "context");
        return new HashMap();
    }

    String h();

    v i();

    F j(Context context);

    InterfaceC1363c k(Context context);

    b0 l(Context context);

    AbstractComponentCallbacksC1132q m(Context context, String str);

    p054f3.a n(Context context);

    p194t3.a p(Context context);

    S q(Context context);

    X r(Context context);

    O s(Context context);

    InterfaceC1362b t();

    G u();

    P v(Context context);

    c w(Context context, InterfaceC1163x interfaceC1163x);

    Q x();

    K y(Context context);

    E z();
}
