package H1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.I;
import com.android.customization.picker.themedicon.ThemedIconSectionView;
import com.nothing.wallpaper.R;
import p084i3.s0;

/* JADX INFO: loaded from: classes.dex */
public class d implements p064g3.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i f2314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final J1.a f2315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final J1.b f2316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final I f2317t = new I() { // from class: H1.a
        @Override // androidx.lifecycle.I
        public final void b(Object obj) {
            this.f2311q.l((Boolean) obj);
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ThemedIconSectionView f2318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f2319v;

    public d(i iVar, J1.a aVar, Bundle bundle, J1.b bVar) {
        this.f2319v = false;
        this.f2314q = iVar;
        this.f2315r = aVar;
        this.f2316s = bVar;
        if (bundle != null) {
            this.f2319v = bundle.getBoolean("SAVED_THEMED_ICON_ENABLED", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(boolean z9) {
        this.f2315r.c(z9);
        this.f2318u.getSwitch().setChecked(z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(Boolean bool) {
        if (this.f2318u.isAttachedToWindow()) {
            this.f2318u.getSwitch().setChecked(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(Context context, boolean z9) {
        if (context == null) {
            return;
        }
        this.f2314q.m(z9);
        this.f2315r.c(z9);
        this.f2316s.e(z9);
    }

    @Override // p064g3.f
    public void a() {
        this.f2315r.b().m(this.f2317t);
    }

    @Override // p064g3.f
    public void d(Bundle bundle) {
        ThemedIconSectionView themedIconSectionView = this.f2318u;
        if (themedIconSectionView != null) {
            bundle.putBoolean("SAVED_THEMED_ICON_ENABLED", themedIconSectionView.getSwitch().isChecked());
        }
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        return context != null && this.f2314q.g();
    }

    @Override // p064g3.f
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public ThemedIconSectionView f(Context context) {
        ThemedIconSectionView themedIconSectionView = (ThemedIconSectionView) LayoutInflater.from(context).inflate(R.layout.themed_icon_section_view, (ViewGroup) null);
        this.f2318u = themedIconSectionView;
        themedIconSectionView.setViewListener(new s0.a() { // from class: H1.b
            @Override // i3.s0.a
            public final void a(Context context2, boolean z9) {
                this.f2312a.m(context2, z9);
            }
        });
        this.f2318u.getSwitch().setChecked(this.f2319v);
        this.f2314q.e(new i.a() { // from class: H1.c
            @Override // H1.i.a
            public final void a(boolean z9) {
                this.f2313a.k(z9);
            }
        });
        this.f2315r.b().i(this.f2317t);
        return this.f2318u;
    }
}
