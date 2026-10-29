package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import p032d1.c;
import p032d1.f;
import p032d1.g;
import p181s0.k;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private CharSequence[] f13493Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private CharSequence[] f13494a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private String f13495b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private String f13496c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f13497d0;

    public static final class a implements Preference.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f13498a;

        private a() {
        }

        public static a b() {
            if (f13498a == null) {
                f13498a = new a();
            }
            return f13498a;
        }

        @Override // androidx.preference.Preference.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.L()) ? listPreference.f().getString(f.f19433a) : listPreference.L();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f19537x, i10, i11);
        this.f13493Z = k.o(typedArrayObtainStyledAttributes, g.f19434A, g.f19539y);
        this.f13494a0 = k.o(typedArrayObtainStyledAttributes, g.f19436B, g.f19541z);
        int i12 = g.f19438C;
        if (k.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            G(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.f19450I, i10, i11);
        this.f13496c0 = k.m(typedArrayObtainStyledAttributes2, g.f19524q0, g.f19466Q);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private int O() {
        return J(this.f13495b0);
    }

    public int J(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f13494a0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f13494a0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] K() {
        return this.f13493Z;
    }

    public CharSequence L() {
        CharSequence[] charSequenceArr;
        int iO = O();
        if (iO < 0 || (charSequenceArr = this.f13493Z) == null) {
            return null;
        }
        return charSequenceArr[iO];
    }

    public CharSequence[] M() {
        return this.f13494a0;
    }

    public String N() {
        return this.f13495b0;
    }

    public void P(String str) {
        boolean zEquals = TextUtils.equals(this.f13495b0, str);
        if (zEquals && this.f13497d0) {
            return;
        }
        this.f13495b0 = str;
        this.f13497d0 = true;
        F(str);
        if (zEquals) {
            return;
        }
        v();
    }

    @Override // androidx.preference.Preference
    public CharSequence p() {
        if (q() != null) {
            return q().a(this);
        }
        CharSequence charSequenceL = L();
        CharSequence charSequenceP = super.p();
        String str = this.f13496c0;
        if (str != null) {
            if (charSequenceL == null) {
                charSequenceL = "";
            }
            String str2 = String.format(str, charSequenceL);
            if (!TextUtils.equals(str2, charSequenceP)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceP;
    }

    @Override // androidx.preference.Preference
    protected Object z(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, c.f19422b, R.attr.dialogPreferenceStyle));
    }
}
