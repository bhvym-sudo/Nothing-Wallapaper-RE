package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected boolean f13564T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private CharSequence f13565U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private CharSequence f13566V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f13567W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f13568X;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    public boolean H() {
        boolean z9;
        if (this.f13568X) {
            z9 = this.f13564T;
        } else {
            z9 = !this.f13564T;
        }
        return z9 || super.H();
    }

    public boolean J() {
        return this.f13564T;
    }

    public void K(boolean z9) {
        boolean z10 = this.f13564T != z9;
        if (z10 || !this.f13567W) {
            this.f13564T = z9;
            this.f13567W = true;
            D(z9);
            if (z10) {
                w(H());
                v();
            }
        }
    }

    public void L(boolean z9) {
        this.f13568X = z9;
    }

    public void M(CharSequence charSequence) {
        this.f13566V = charSequence;
        if (J()) {
            return;
        }
        v();
    }

    public void N(CharSequence charSequence) {
        this.f13565U = charSequence;
        if (J()) {
            v();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    protected void O(View view) {
        boolean z9;
        int i10;
        CharSequence charSequenceP;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.f13564T || TextUtils.isEmpty(this.f13565U)) {
                if (this.f13564T || TextUtils.isEmpty(this.f13566V)) {
                    z9 = true;
                } else {
                    textView.setText(this.f13566V);
                }
                if (z9) {
                    charSequenceP = p();
                    if (!TextUtils.isEmpty(charSequenceP)) {
                        textView.setText(charSequenceP);
                        z9 = false;
                    }
                }
                i10 = z9 ? 8 : 0;
                if (i10 != textView.getVisibility()) {
                    textView.setVisibility(i10);
                }
            }
            textView.setText(this.f13565U);
            z9 = false;
            if (z9) {
                charSequenceP = p();
                if (!TextUtils.isEmpty(charSequenceP)) {
                    textView.setText(charSequenceP);
                    z9 = false;
                }
            }
            if (z9) {
            }
            if (i10 != textView.getVisibility()) {
                textView.setVisibility(i10);
            }
        }
    }

    @Override // androidx.preference.Preference
    protected void x() {
        super.x();
        boolean z9 = !J();
        if (d(Boolean.valueOf(z9))) {
            K(z9);
        }
    }

    @Override // androidx.preference.Preference
    protected Object z(TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
