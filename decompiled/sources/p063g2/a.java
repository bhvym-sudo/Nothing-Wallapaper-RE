package p063g2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC1163x;
import com.android.customization.picker.notifications.ui.view.NotificationSectionView;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p053f2.b;
import p064g3.f;

/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p073h2.a f21150q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC1163x f21151r;

    public a(p073h2.a viewModel, InterfaceC1163x lifecycleOwner) {
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        this.f21150q = viewModel;
        this.f21151r = lifecycleOwner;
    }

    @Override // p064g3.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NotificationSectionView f(Context context) {
        n.h(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.notification_section, (ViewGroup) null);
        n.f(viewInflate, "null cannot be cast to non-null type com.android.customization.picker.notifications.ui.view.NotificationSectionView");
        NotificationSectionView notificationSectionView = (NotificationSectionView) viewInflate;
        b.f20810a.b(notificationSectionView, this.f21150q, this.f21151r);
        return notificationSectionView;
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        n.h(context, "context");
        return true;
    }
}
