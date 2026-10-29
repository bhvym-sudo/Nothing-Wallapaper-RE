package p037d6;

import O2.g;
import O2.h;
import O2.i;
import O2.j;
import O2.r;
import O2.w;
import O2.y;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.nothing.systemui.shared.clocks.view.D;
import java.util.TimeZone;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f19651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f19652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f19653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f19654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f19655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f19656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f19657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f19658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f19659i;

    public b(Context context, f clockType, LayoutInflater layoutInflater, r rVar) {
        n.h(context, "context");
        n.h(clockType, "clockType");
        n.h(layoutInflater, "layoutInflater");
        this.f19656f = "clock_alignment";
        this.f19657g = "clock_text_size";
        this.f19658h = 1;
        this.f19659i = 1;
        FrameLayout frameLayout = new FrameLayout(context);
        w wVar = clockType == f.f19685t ? w.PER_SECOND : w.PER_MINUTE;
        View viewInflate = layoutInflater.inflate(clockType.f(), (ViewGroup) frameLayout, false);
        n.f(viewInflate, "null cannot be cast to non-null type com.nothing.systemui.shared.clocks.view.NTClockView");
        this.f19651a = new d((D) viewInflate, "lockscreen_clock_view", wVar, null, false, 16, null);
        View viewInflate2 = layoutInflater.inflate(clockType.f(), (ViewGroup) frameLayout, false);
        n.f(viewInflate2, "null cannot be cast to non-null type com.nothing.systemui.shared.clocks.view.NTClockView");
        this.f19652b = new d((D) viewInflate2, "lockscreen_clock_view_large", null, null, false, 28, null);
        View viewInflate3 = layoutInflater.inflate(clockType.f(), (ViewGroup) frameLayout, false);
        n.f(viewInflate3, "null cannot be cast to non-null type com.nothing.systemui.shared.clocks.view.NTClockView");
        this.f19653c = new d((D) viewInflate3, "lockscreen_clock_snapview", wVar, null, true);
        this.f19654d = new c(d().getView(), c().getView());
        String string = context.getString(clockType.e());
        n.g(string, "getString(...)");
        this.f19655e = new g(string, "", "", false, false, 24, null);
    }

    @Override // O2.h
    public g a() {
        return this.f19655e;
    }

    @Override // O2.h
    public j b() {
        return this.f19654d;
    }

    @Override // O2.h
    public void f(boolean z9, float f10, float f11, i iVar) {
        Log.d("NTClockController", "initialize() isDarkTheme = " + z9 + ", dozeFraction = " + f10 + ", foldFraction = " + f11 + ", clockListener = " + iVar);
        d().h(new a(d().getView(), f10, f11));
        e().b().c(y.b(e().e(), z9, null, 2, null));
        d().b().c(y.b(d().e(), z9, null, 2, null));
        j jVarB = b();
        TimeZone timeZone = TimeZone.getDefault();
        n.g(timeZone, "getDefault(...)");
        jVarB.f(timeZone);
        d().b().b();
        e().b().b();
        c().b().c(y.b(c().e(), z9, null, 2, null));
        c().b().b();
        d().b().a(true, true, true);
        e().b().a(true, true, true);
        c().b().a(true, true, true);
    }

    @Override // O2.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d e() {
        return this.f19652b;
    }

    @Override // O2.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public d d() {
        return this.f19651a;
    }

    @Override // O2.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public d c() {
        return this.f19653c;
    }
}
