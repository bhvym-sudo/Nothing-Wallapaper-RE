package p037d6;

import O2.j;
import O2.z;
import Y5.a;
import android.content.res.Resources;
import android.text.format.DateFormat;
import com.nothing.systemui.shared.clocks.view.D;
import java.util.TimeZone;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f19660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D f19661b;

    public c(D view, D d10) {
        n.h(view, "view");
        this.f19660a = view;
        this.f19661b = d10;
    }

    @Override // O2.j
    public void a(a aVar) {
        this.f19660a.y(aVar);
        D d10 = this.f19661b;
        if (d10 != null) {
            d10.y(aVar);
        }
    }

    @Override // O2.j
    public void b(boolean z9) {
        D.C(this.f19660a, z9, null, 2, null);
        D d10 = this.f19661b;
        if (d10 != null) {
            D.C(d10, z9, null, 2, null);
        }
    }

    @Override // O2.j
    public void c(O2.a data) {
        n.h(data, "data");
        this.f19660a.o(data);
        D d10 = this.f19661b;
        if (d10 != null) {
            d10.o(data);
        }
    }

    @Override // O2.j
    public void d(Resources resources) {
        n.h(resources, "resources");
    }

    @Override // O2.j
    public void e(z data) {
        n.h(data, "data");
    }

    @Override // O2.j
    public void f(TimeZone timeZone) {
        n.h(timeZone, "timeZone");
        this.f19660a.w(timeZone);
        D d10 = this.f19660a;
        D.C(d10, DateFormat.is24HourFormat(d10.getContext()), null, 2, null);
        D d11 = this.f19661b;
        if (d11 != null) {
            d11.w(timeZone);
        }
        D d12 = this.f19661b;
        if (d12 != null) {
            D.C(d12, DateFormat.is24HourFormat(this.f19660a.getContext()), null, 2, null);
        }
    }

    @Override // O2.j
    public void g(X5.a aVar) {
        this.f19660a.p(aVar);
        D d10 = this.f19661b;
        if (d10 != null) {
            d10.p(aVar);
        }
    }
}
