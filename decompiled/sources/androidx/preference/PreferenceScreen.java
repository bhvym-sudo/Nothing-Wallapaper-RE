package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import p032d1.c;
import p181s0.k;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f13541b0;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k.a(context, c.f19426f, R.attr.preferenceScreenStyle));
        this.f13541b0 = true;
    }

    @Override // androidx.preference.Preference
    protected void x() {
        if (i() == null && h() == null && K() != 0) {
            o();
            throw null;
        }
    }
}
