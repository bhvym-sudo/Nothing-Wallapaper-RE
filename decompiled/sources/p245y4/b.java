package p245y4;

import K4.d;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import java.util.Locale;
import p225w4.c;
import p225w4.h;
import p225w4.i;
import p225w4.j;
import p225w4.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f30248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f30249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float f30250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f30251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final float f30252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final float f30253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final float f30254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f30255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f30256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f30257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f30258k;

    b(Context context, int i10, int i11, int i12, a aVar) {
        a aVar2 = new a();
        this.f30249b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i10 != 0) {
            aVar.f30279q = i10;
        }
        TypedArray typedArrayA = a(context, aVar.f30279q, i11, i12);
        Resources resources = context.getResources();
        this.f30250c = typedArrayA.getDimensionPixelSize(k.f29027K, -1);
        this.f30256i = context.getResources().getDimensionPixelSize(c.f28741L);
        this.f30257j = context.getResources().getDimensionPixelSize(c.f28743N);
        this.f30251d = typedArrayA.getDimensionPixelSize(k.f29117U, -1);
        int i13 = k.f29099S;
        int i14 = c.f28778n;
        this.f30252e = typedArrayA.getDimension(i13, resources.getDimension(i14));
        int i15 = k.f29144X;
        int i16 = c.f28779o;
        this.f30254g = typedArrayA.getDimension(i15, resources.getDimension(i16));
        this.f30253f = typedArrayA.getDimension(k.f29018J, resources.getDimension(i14));
        this.f30255h = typedArrayA.getDimension(k.f29108T, resources.getDimension(i16));
        boolean z9 = true;
        this.f30258k = typedArrayA.getInt(k.f29212e0, 1);
        aVar2.f30287y = aVar.f30287y == -2 ? 255 : aVar.f30287y;
        if (aVar.f30259A != -2) {
            aVar2.f30259A = aVar.f30259A;
        } else {
            int i17 = k.f29202d0;
            if (typedArrayA.hasValue(i17)) {
                aVar2.f30259A = typedArrayA.getInt(i17, 0);
            } else {
                aVar2.f30259A = -1;
            }
        }
        if (aVar.f30288z != null) {
            aVar2.f30288z = aVar.f30288z;
        } else {
            int i18 = k.f29054N;
            if (typedArrayA.hasValue(i18)) {
                aVar2.f30288z = typedArrayA.getString(i18);
            }
        }
        aVar2.f30263E = aVar.f30263E;
        aVar2.f30264F = aVar.f30264F == null ? context.getString(i.f28887j) : aVar.f30264F;
        aVar2.f30265G = aVar.f30265G == 0 ? h.f28875a : aVar.f30265G;
        aVar2.f30266H = aVar.f30266H == 0 ? i.f28892o : aVar.f30266H;
        if (aVar.f30268J != null && !aVar.f30268J.booleanValue()) {
            z9 = false;
        }
        aVar2.f30268J = Boolean.valueOf(z9);
        aVar2.f30260B = aVar.f30260B == -2 ? typedArrayA.getInt(k.f29182b0, -2) : aVar.f30260B;
        aVar2.f30261C = aVar.f30261C == -2 ? typedArrayA.getInt(k.f29192c0, -2) : aVar.f30261C;
        aVar2.f30283u = Integer.valueOf(aVar.f30283u == null ? typedArrayA.getResourceId(k.f29036L, j.f28904a) : aVar.f30283u.intValue());
        aVar2.f30284v = Integer.valueOf(aVar.f30284v == null ? typedArrayA.getResourceId(k.f29045M, 0) : aVar.f30284v.intValue());
        aVar2.f30285w = Integer.valueOf(aVar.f30285w == null ? typedArrayA.getResourceId(k.f29126V, j.f28904a) : aVar.f30285w.intValue());
        aVar2.f30286x = Integer.valueOf(aVar.f30286x == null ? typedArrayA.getResourceId(k.f29135W, 0) : aVar.f30286x.intValue());
        aVar2.f30280r = Integer.valueOf(aVar.f30280r == null ? G(context, typedArrayA, k.f28999H) : aVar.f30280r.intValue());
        aVar2.f30282t = Integer.valueOf(aVar.f30282t == null ? typedArrayA.getResourceId(k.f29063O, j.f28908e) : aVar.f30282t.intValue());
        if (aVar.f30281s != null) {
            aVar2.f30281s = aVar.f30281s;
        } else {
            int i19 = k.f29072P;
            if (typedArrayA.hasValue(i19)) {
                aVar2.f30281s = Integer.valueOf(G(context, typedArrayA, i19));
            } else {
                aVar2.f30281s = Integer.valueOf(new d(context, aVar2.f30282t.intValue()).i().getDefaultColor());
            }
        }
        aVar2.f30267I = Integer.valueOf(aVar.f30267I == null ? typedArrayA.getInt(k.f29009I, 8388661) : aVar.f30267I.intValue());
        aVar2.f30269K = Integer.valueOf(aVar.f30269K == null ? typedArrayA.getDimensionPixelSize(k.f29090R, resources.getDimensionPixelSize(c.f28742M)) : aVar.f30269K.intValue());
        aVar2.f30270L = Integer.valueOf(aVar.f30270L == null ? typedArrayA.getDimensionPixelSize(k.f29081Q, resources.getDimensionPixelSize(c.f28780p)) : aVar.f30270L.intValue());
        aVar2.f30271M = Integer.valueOf(aVar.f30271M == null ? typedArrayA.getDimensionPixelOffset(k.f29153Y, 0) : aVar.f30271M.intValue());
        aVar2.f30272N = Integer.valueOf(aVar.f30272N == null ? typedArrayA.getDimensionPixelOffset(k.f29222f0, 0) : aVar.f30272N.intValue());
        aVar2.f30273O = Integer.valueOf(aVar.f30273O == null ? typedArrayA.getDimensionPixelOffset(k.f29162Z, aVar2.f30271M.intValue()) : aVar.f30273O.intValue());
        aVar2.f30274P = Integer.valueOf(aVar.f30274P == null ? typedArrayA.getDimensionPixelOffset(k.f29232g0, aVar2.f30272N.intValue()) : aVar.f30274P.intValue());
        aVar2.f30277S = Integer.valueOf(aVar.f30277S == null ? typedArrayA.getDimensionPixelOffset(k.f29172a0, 0) : aVar.f30277S.intValue());
        aVar2.f30275Q = Integer.valueOf(aVar.f30275Q == null ? 0 : aVar.f30275Q.intValue());
        aVar2.f30276R = Integer.valueOf(aVar.f30276R == null ? 0 : aVar.f30276R.intValue());
        aVar2.f30278T = Boolean.valueOf(aVar.f30278T == null ? typedArrayA.getBoolean(k.f28989G, false) : aVar.f30278T.booleanValue());
        typedArrayA.recycle();
        if (aVar.f30262D == null) {
            aVar2.f30262D = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar2.f30262D = aVar.f30262D;
        }
        this.f30248a = aVar;
    }

    private static int G(Context context, TypedArray typedArray, int i10) {
        return K4.c.a(context, typedArray, i10).getDefaultColor();
    }

    private TypedArray a(Context context, int i10, int i11, int i12) {
        AttributeSet attributeSetI;
        int styleAttribute;
        if (i10 != 0) {
            attributeSetI = com.google.android.material.drawable.a.i(context, i10, "badge");
            styleAttribute = attributeSetI.getStyleAttribute();
        } else {
            attributeSetI = null;
            styleAttribute = 0;
        }
        return com.google.android.material.internal.k.i(context, attributeSetI, k.f28979F, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    int A() {
        return this.f30249b.f30274P.intValue();
    }

    int B() {
        return this.f30249b.f30272N.intValue();
    }

    boolean C() {
        return this.f30249b.f30259A != -1;
    }

    boolean D() {
        return this.f30249b.f30288z != null;
    }

    boolean E() {
        return this.f30249b.f30278T.booleanValue();
    }

    boolean F() {
        return this.f30249b.f30268J.booleanValue();
    }

    void H(int i10) {
        this.f30248a.f30287y = i10;
        this.f30249b.f30287y = i10;
    }

    int b() {
        return this.f30249b.f30275Q.intValue();
    }

    int c() {
        return this.f30249b.f30276R.intValue();
    }

    int d() {
        return this.f30249b.f30287y;
    }

    int e() {
        return this.f30249b.f30280r.intValue();
    }

    int f() {
        return this.f30249b.f30267I.intValue();
    }

    int g() {
        return this.f30249b.f30269K.intValue();
    }

    int h() {
        return this.f30249b.f30284v.intValue();
    }

    int i() {
        return this.f30249b.f30283u.intValue();
    }

    int j() {
        return this.f30249b.f30281s.intValue();
    }

    int k() {
        return this.f30249b.f30270L.intValue();
    }

    int l() {
        return this.f30249b.f30286x.intValue();
    }

    int m() {
        return this.f30249b.f30285w.intValue();
    }

    int n() {
        return this.f30249b.f30266H;
    }

    CharSequence o() {
        return this.f30249b.f30263E;
    }

    CharSequence p() {
        return this.f30249b.f30264F;
    }

    int q() {
        return this.f30249b.f30265G;
    }

    int r() {
        return this.f30249b.f30273O.intValue();
    }

    int s() {
        return this.f30249b.f30271M.intValue();
    }

    int t() {
        return this.f30249b.f30277S.intValue();
    }

    int u() {
        return this.f30249b.f30260B;
    }

    int v() {
        return this.f30249b.f30261C;
    }

    int w() {
        return this.f30249b.f30259A;
    }

    Locale x() {
        return this.f30249b.f30262D;
    }

    String y() {
        return this.f30249b.f30288z;
    }

    int z() {
        return this.f30249b.f30282t.intValue();
    }

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0747a();

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private int f30259A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private int f30260B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private int f30261C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private Locale f30262D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private CharSequence f30263E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private CharSequence f30264F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f30265G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private int f30266H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private Integer f30267I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private Boolean f30268J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private Integer f30269K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private Integer f30270L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private Integer f30271M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private Integer f30272N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Integer f30273O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        private Integer f30274P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        private Integer f30275Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        private Integer f30276R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private Integer f30277S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private Boolean f30278T;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f30279q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Integer f30280r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Integer f30281s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Integer f30282t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Integer f30283u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Integer f30284v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Integer f30285w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private Integer f30286x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f30287y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private String f30288z;

        /* JADX INFO: renamed from: y4.b$a$a, reason: collision with other inner class name */
        class C0747a implements Parcelable.Creator {
            C0747a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
            this.f30287y = 255;
            this.f30259A = -2;
            this.f30260B = -2;
            this.f30261C = -2;
            this.f30268J = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f30279q);
            parcel.writeSerializable(this.f30280r);
            parcel.writeSerializable(this.f30281s);
            parcel.writeSerializable(this.f30282t);
            parcel.writeSerializable(this.f30283u);
            parcel.writeSerializable(this.f30284v);
            parcel.writeSerializable(this.f30285w);
            parcel.writeSerializable(this.f30286x);
            parcel.writeInt(this.f30287y);
            parcel.writeString(this.f30288z);
            parcel.writeInt(this.f30259A);
            parcel.writeInt(this.f30260B);
            parcel.writeInt(this.f30261C);
            CharSequence charSequence = this.f30263E;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f30264F;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f30265G);
            parcel.writeSerializable(this.f30267I);
            parcel.writeSerializable(this.f30269K);
            parcel.writeSerializable(this.f30270L);
            parcel.writeSerializable(this.f30271M);
            parcel.writeSerializable(this.f30272N);
            parcel.writeSerializable(this.f30273O);
            parcel.writeSerializable(this.f30274P);
            parcel.writeSerializable(this.f30277S);
            parcel.writeSerializable(this.f30275Q);
            parcel.writeSerializable(this.f30276R);
            parcel.writeSerializable(this.f30268J);
            parcel.writeSerializable(this.f30262D);
            parcel.writeSerializable(this.f30278T);
        }

        a(Parcel parcel) {
            this.f30287y = 255;
            this.f30259A = -2;
            this.f30260B = -2;
            this.f30261C = -2;
            this.f30268J = Boolean.TRUE;
            this.f30279q = parcel.readInt();
            this.f30280r = (Integer) parcel.readSerializable();
            this.f30281s = (Integer) parcel.readSerializable();
            this.f30282t = (Integer) parcel.readSerializable();
            this.f30283u = (Integer) parcel.readSerializable();
            this.f30284v = (Integer) parcel.readSerializable();
            this.f30285w = (Integer) parcel.readSerializable();
            this.f30286x = (Integer) parcel.readSerializable();
            this.f30287y = parcel.readInt();
            this.f30288z = parcel.readString();
            this.f30259A = parcel.readInt();
            this.f30260B = parcel.readInt();
            this.f30261C = parcel.readInt();
            this.f30263E = parcel.readString();
            this.f30264F = parcel.readString();
            this.f30265G = parcel.readInt();
            this.f30267I = (Integer) parcel.readSerializable();
            this.f30269K = (Integer) parcel.readSerializable();
            this.f30270L = (Integer) parcel.readSerializable();
            this.f30271M = (Integer) parcel.readSerializable();
            this.f30272N = (Integer) parcel.readSerializable();
            this.f30273O = (Integer) parcel.readSerializable();
            this.f30274P = (Integer) parcel.readSerializable();
            this.f30277S = (Integer) parcel.readSerializable();
            this.f30275Q = (Integer) parcel.readSerializable();
            this.f30276R = (Integer) parcel.readSerializable();
            this.f30268J = (Boolean) parcel.readSerializable();
            this.f30262D = (Locale) parcel.readSerializable();
            this.f30278T = (Boolean) parcel.readSerializable();
        }
    }
}
