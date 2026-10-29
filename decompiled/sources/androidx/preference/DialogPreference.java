package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p032d1.c;
import p032d1.g;
import p181s0.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private CharSequence f13480T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private CharSequence f13481U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Drawable f13482V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private CharSequence f13483W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private CharSequence f13484X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int f13485Y;

    public DialogPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f19507i, i10, i11);
        String strM = k.m(typedArrayObtainStyledAttributes, g.f19527s, g.f19509j);
        this.f13480T = strM;
        if (strM == null) {
            this.f13480T = r();
        }
        this.f13481U = k.m(typedArrayObtainStyledAttributes, g.f19525r, g.f19511k);
        this.f13482V = k.c(typedArrayObtainStyledAttributes, g.f19521p, g.f19513l);
        this.f13483W = k.m(typedArrayObtainStyledAttributes, g.f19531u, g.f19515m);
        this.f13484X = k.m(typedArrayObtainStyledAttributes, g.f19529t, g.f19517n);
        this.f13485Y = k.l(typedArrayObtainStyledAttributes, g.f19523q, g.f19519o, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected void x() {
        o();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f19422b, R.attr.dialogPreferenceStyle));
    }
}
