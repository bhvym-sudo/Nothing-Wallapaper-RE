package p197t6;

import android.content.Context;
import kotlin.jvm.internal.n;
import p034d3.a;
import p079h8.h;
import p079h8.i;
import p087i6.e;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f27937d = i.b(new p219v8.a() { // from class: t6.a
        @Override // p219v8.a
        public final Object invoke() {
            return Boolean.valueOf(c.A());
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f27938e = i.b(new p219v8.a() { // from class: t6.b
        @Override // p219v8.a
        public final Object invoke() {
            return Boolean.valueOf(c.B());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A() {
        return p007a6.a.a("NTF_DEEP_EFFECT_WALLPAPER");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B() {
        return p007a6.a.a("NTF_DYNAMIC_CLOCKFACE_TRANSITION");
    }

    private final boolean v() {
        return ((Boolean) this.f27937d.getValue()).booleanValue();
    }

    private final boolean w() {
        return ((Boolean) this.f27938e.getValue()).booleanValue();
    }

    @Override // p034d3.a
    public boolean e(Context context) {
        n.h(context, "context");
        return false;
    }

    @Override // p034d3.a
    public boolean g(Context context) {
        n.h(context, "context");
        return !l();
    }

    @Override // p034d3.a
    public boolean l() {
        return true;
    }

    @Override // p034d3.a
    public boolean m() {
        return s();
    }

    @Override // p034d3.a
    public boolean p() {
        return v();
    }

    @Override // p034d3.a
    public boolean q() {
        return w();
    }

    @Override // p034d3.a
    public boolean r() {
        return true;
    }

    @Override // p034d3.a
    public boolean s() {
        return true;
    }

    public final boolean x() {
        return true;
    }

    public final boolean y() {
        return !l();
    }

    public final boolean z() {
        return !e.l();
    }
}
