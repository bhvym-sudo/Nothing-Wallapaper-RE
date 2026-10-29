package p183s2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.customization.picker.settings.ui.view.MoreSettingsSectionView;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p064g3.f;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Context context, View view) {
        context.startActivity(new Intent("android.settings.LOCK_SCREEN_SETTINGS"));
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        n.h(context, "context");
        return true;
    }

    @Override // p064g3.f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public MoreSettingsSectionView f(final Context context) {
        n.h(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.more_settings_section_view, (ViewGroup) null);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: s2.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.i(context, view);
            }
        });
        n.f(viewInflate, "null cannot be cast to non-null type com.android.customization.picker.settings.ui.view.MoreSettingsSectionView");
        return (MoreSettingsSectionView) viewInflate;
    }
}
