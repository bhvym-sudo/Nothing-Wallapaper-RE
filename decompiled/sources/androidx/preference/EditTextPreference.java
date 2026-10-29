package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import p032d1.c;
import p032d1.f;
import p032d1.g;
import p181s0.k;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private String f13491Z;

    public static final class a implements Preference.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f13492a;

        private a() {
        }

        public static a b() {
            if (f13492a == null) {
                f13492a = new a();
            }
            return f13492a;
        }

        @Override // androidx.preference.Preference.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.J()) ? editTextPreference.f().getString(f.f19433a) : editTextPreference.J();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f19533v, i10, i11);
        int i12 = g.f19535w;
        if (k.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            G(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public boolean H() {
        return TextUtils.isEmpty(this.f13491Z) || super.H();
    }

    public String J() {
        return this.f13491Z;
    }

    @Override // androidx.preference.Preference
    protected Object z(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f19424d, R.attr.editTextPreferenceStyle));
    }
}
