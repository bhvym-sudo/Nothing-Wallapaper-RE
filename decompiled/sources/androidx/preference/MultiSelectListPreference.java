package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;
import p032d1.c;
import p032d1.g;
import p181s0.k;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private CharSequence[] f13499Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private CharSequence[] f13500a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Set f13501b0;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f13501b0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f19440D, i10, i11);
        this.f13499Z = k.o(typedArrayObtainStyledAttributes, g.f19446G, g.f19442E);
        this.f13500a0 = k.o(typedArrayObtainStyledAttributes, g.f19448H, g.f19444F);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected Object z(TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f19422b, R.attr.dialogPreferenceStyle));
    }
}
