package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import p032d1.c;
import p032d1.g;
import p181s0.k;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private final a f13478Y;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
            if (CheckBoxPreference.this.d(Boolean.valueOf(z9))) {
                CheckBoxPreference.this.K(z9);
            } else {
                compoundButton.setChecked(!z9);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void P(View view) {
        boolean z9 = view instanceof CompoundButton;
        if (z9) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f13564T);
        }
        if (z9) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f13478Y);
        }
    }

    private void Q(View view) {
        if (((AccessibilityManager) f().getSystemService("accessibility")).isEnabled()) {
            P(view.findViewById(R.id.checkbox));
            O(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    protected void C(View view) {
        super.C(view);
        Q(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f13478Y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f19489b, i10, i11);
        N(k.m(typedArrayObtainStyledAttributes, g.f19505h, g.f19492c));
        M(k.m(typedArrayObtainStyledAttributes, g.f19503g, g.f19495d));
        L(k.b(typedArrayObtainStyledAttributes, g.f19501f, g.f19498e, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f19421a, R.attr.checkBoxPreferenceStyle));
    }
}
