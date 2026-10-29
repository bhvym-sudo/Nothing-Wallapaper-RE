package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import p032d1.c;
import p032d1.g;
import p181s0.k;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final a f13556Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private CharSequence f13557Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private CharSequence f13558a0;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
            if (SwitchPreference.this.d(Boolean.valueOf(z9))) {
                SwitchPreference.this.K(z9);
            } else {
                compoundButton.setChecked(!z9);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f13556Y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f19453J0, i10, i11);
        N(k.m(typedArrayObtainStyledAttributes, g.f19469R0, g.f19455K0));
        M(k.m(typedArrayObtainStyledAttributes, g.f19467Q0, g.f19457L0));
        Q(k.m(typedArrayObtainStyledAttributes, g.f19473T0, g.f19461N0));
        P(k.m(typedArrayObtainStyledAttributes, g.f19471S0, g.f19463O0));
        L(k.b(typedArrayObtainStyledAttributes, g.f19465P0, g.f19459M0, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void R(View view) {
        boolean z9 = view instanceof Switch;
        if (z9) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f13564T);
        }
        if (z9) {
            Switch r9 = (Switch) view;
            r9.setTextOn(this.f13557Z);
            r9.setTextOff(this.f13558a0);
            r9.setOnCheckedChangeListener(this.f13556Y);
        }
    }

    private void S(View view) {
        if (((AccessibilityManager) f().getSystemService("accessibility")).isEnabled()) {
            R(view.findViewById(R.id.switch_widget));
            O(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    protected void C(View view) {
        super.C(view);
        S(view);
    }

    public void P(CharSequence charSequence) {
        this.f13558a0 = charSequence;
        v();
    }

    public void Q(CharSequence charSequence) {
        this.f13557Z = charSequence;
        v();
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f19430j, R.attr.switchPreferenceStyle));
    }
}
