package T5;

import com.android.launcher3.h;
import com.android.launcher3.views.f;
import kotlin.jvm.internal.n;
import p253z2.e;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements com.android.launcher3.dragndrop.a.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f f7682q;

    public a(f activityContext) {
        n.h(activityContext, "activityContext");
        this.f7682q = activityContext;
    }

    @Override // com.android.launcher3.dragndrop.a.b
    public void n(h.a aVar, e eVar) {
        this.f7682q.R().y0(0.0f);
    }

    @Override // com.android.launcher3.dragndrop.a.b
    public void t() {
        this.f7682q.R().y0(1.0f);
        this.f7682q.p().A(this);
    }
}
