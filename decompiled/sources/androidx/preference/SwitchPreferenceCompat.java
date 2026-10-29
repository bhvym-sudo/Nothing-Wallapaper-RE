package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import p032d1.c;
import p032d1.d;
import p032d1.g;
import p181s0.k;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final a f13560Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private CharSequence f13561Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private CharSequence f13562a0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
            if (SwitchPreferenceCompat.this.d(Boolean.valueOf(z9))) {
                SwitchPreferenceCompat.this.K(z9);
            } else {
                compoundButton.setChecked(!z9);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f13560Y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f19475U0, i10, i11);
        N(k.m(typedArrayObtainStyledAttributes, g.f19494c1, g.f19477V0));
        M(k.m(typedArrayObtainStyledAttributes, g.f19491b1, g.f19479W0));
        Q(k.m(typedArrayObtainStyledAttributes, g.f19500e1, g.f19483Y0));
        P(k.m(typedArrayObtainStyledAttributes, g.f19497d1, g.f19485Z0));
        L(k.b(typedArrayObtainStyledAttributes, g.f19488a1, g.f19481X0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void R(View view) {
        boolean z9 = view instanceof SwitchCompat;
        if (z9) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f13564T);
        }
        if (z9) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f13561Z);
            switchCompat.setTextOff(this.f13562a0);
            switchCompat.setOnCheckedChangeListener(this.f13560Y);
        }
    }

    private void S(View view) {
        if (((AccessibilityManager) f().getSystemService("accessibility")).isEnabled()) {
            R(view.findViewById(d.f19431a));
            O(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    protected void C(View view) {
        super.C(view);
        S(view);
    }

    public void P(CharSequence charSequence) {
        this.f13562a0 = charSequence;
        v();
    }

    public void Q(CharSequence charSequence) {
        this.f13561Z = charSequence;
        v();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f19429i);
    }
}
