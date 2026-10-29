package Q2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.B;
import p079h8.A;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public abstract class y implements O2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6811a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f6812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final O2.f f6813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f6814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f6815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f6816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f6817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f6818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List f6819i;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final List a(O2.v settings) {
            kotlin.jvm.internal.n.h(settings, "settings");
            return kotlin.jvm.internal.n.d(settings.h(), "DIGITAL_CLOCK_FLEX") ? O2.n.f5787h.a(y.f6812b, y.f6813c) : y.f6812b;
        }

        private a() {
        }
    }

    static {
        z zVar = z.f6820a;
        H2.a aVarD = H2.g.d();
        O2.c cVar = O2.c.Float;
        O2.n nVarB = zVar.b(aVarD, cVar, Float.valueOf(400.0f), "Weight", "Glyph Weight");
        H2.g gVar = H2.g.f2356a;
        O2.n nVarB2 = zVar.b(gVar.e(), cVar, Float.valueOf(80.0f), "Width", "Glyph Width");
        H2.a aVarB = gVar.b();
        O2.c cVar2 = O2.c.Boolean;
        f6812b = AbstractC1444s.n(nVarB, nVarB2, zVar.b(aVarB, cVar2, Float.valueOf(100.0f), "Round", "Glyph Roundness"), zVar.b(gVar.c(), cVar2, Float.valueOf(0.0f), "Slant", "Glyph Slant"));
        f6813c = new O2.f(new p219v8.l() { // from class: Q2.w
            @Override // p219v8.l
            public final Object f(Object obj) {
                return y.j((O2.f) obj);
            }
        });
        f6814d = 8;
        f6815e = 30.0f;
        f6816f = 12.5f;
        f6817g = 800.0f;
        f6818h = -100.0f;
        ArrayList arrayList = new ArrayList();
        final B b10 = new B();
        b10.f22776q = 800.0f;
        final B b11 = new B();
        b11.f22776q = 30.0f;
        int i10 = 1;
        while (true) {
            arrayList.add(new O2.f(new p219v8.l() { // from class: Q2.x
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return y.i(b10, b11, (O2.f) obj);
                }
            }));
            b10.f22776q += f6818h;
            b11.f22776q += f6816f;
            if (i10 == 8) {
                f6819i = arrayList;
                return;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A i(B b10, B b11, O2.f ClockAxisStyle) {
        kotlin.jvm.internal.n.h(ClockAxisStyle, "$this$ClockAxisStyle");
        z zVar = z.f6820a;
        zVar.a(ClockAxisStyle, H2.g.d(), Float.valueOf(b10.f22776q));
        H2.g gVar = H2.g.f2356a;
        zVar.a(ClockAxisStyle, gVar.e(), Float.valueOf(b11.f22776q));
        H2.a aVarB = gVar.b();
        Float fValueOf = Float.valueOf(0.0f);
        zVar.a(ClockAxisStyle, aVarB, fValueOf);
        zVar.a(ClockAxisStyle, gVar.c(), fValueOf);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A j(O2.f ClockAxisStyle) {
        kotlin.jvm.internal.n.h(ClockAxisStyle, "$this$ClockAxisStyle");
        z zVar = z.f6820a;
        zVar.a(ClockAxisStyle, H2.g.d(), Float.valueOf(600.0f));
        H2.g gVar = H2.g.f2356a;
        H2.a aVarE = gVar.e();
        Float fValueOf = Float.valueOf(100.0f);
        zVar.a(ClockAxisStyle, aVarE, fValueOf);
        zVar.a(ClockAxisStyle, gVar.b(), fValueOf);
        zVar.a(ClockAxisStyle, gVar.c(), Float.valueOf(0.0f));
        return A.f21846a;
    }
}
