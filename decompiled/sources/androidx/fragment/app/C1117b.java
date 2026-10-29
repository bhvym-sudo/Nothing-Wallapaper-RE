package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC1157q;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1117b implements Parcelable {
    public static final Parcelable.Creator<C1117b> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    final CharSequence f13056A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final ArrayList f13057B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final ArrayList f13058C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final boolean f13059D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int[] f13060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final ArrayList f13061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final int[] f13062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final int[] f13063t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final int f13064u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final String f13065v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final int f13066w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final int f13067x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final CharSequence f13068y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final int f13069z;

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1117b createFromParcel(Parcel parcel) {
            return new C1117b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1117b[] newArray(int i10) {
            return new C1117b[i10];
        }
    }

    C1117b(C1116a c1116a) {
        int size = c1116a.f12988c.size();
        this.f13060q = new int[size * 6];
        if (!c1116a.f12994i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f13061r = new ArrayList(size);
        this.f13062s = new int[size];
        this.f13063t = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            S.a aVar = (S.a) c1116a.f12988c.get(i11);
            int i12 = i10 + 1;
            this.f13060q[i10] = aVar.f13005a;
            ArrayList arrayList = this.f13061r;
            AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q = aVar.f13006b;
            arrayList.add(abstractComponentCallbacksC1132q != null ? abstractComponentCallbacksC1132q.mWho : null);
            int[] iArr = this.f13060q;
            iArr[i12] = aVar.f13007c ? 1 : 0;
            iArr[i10 + 2] = aVar.f13008d;
            iArr[i10 + 3] = aVar.f13009e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f13010f;
            i10 += 6;
            iArr[i13] = aVar.f13011g;
            this.f13062s[i11] = aVar.f13012h.ordinal();
            this.f13063t[i11] = aVar.f13013i.ordinal();
        }
        this.f13064u = c1116a.f12993h;
        this.f13065v = c1116a.f12996k;
        this.f13066w = c1116a.f13052v;
        this.f13067x = c1116a.f12997l;
        this.f13068y = c1116a.f12998m;
        this.f13069z = c1116a.f12999n;
        this.f13056A = c1116a.f13000o;
        this.f13057B = c1116a.f13001p;
        this.f13058C = c1116a.f13002q;
        this.f13059D = c1116a.f13003r;
    }

    private void a(C1116a c1116a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z9 = true;
            if (i10 >= this.f13060q.length) {
                c1116a.f12993h = this.f13064u;
                c1116a.f12996k = this.f13065v;
                c1116a.f12994i = true;
                c1116a.f12997l = this.f13067x;
                c1116a.f12998m = this.f13068y;
                c1116a.f12999n = this.f13069z;
                c1116a.f13000o = this.f13056A;
                c1116a.f13001p = this.f13057B;
                c1116a.f13002q = this.f13058C;
                c1116a.f13003r = this.f13059D;
                return;
            }
            S.a aVar = new S.a();
            int i12 = i10 + 1;
            aVar.f13005a = this.f13060q[i10];
            if (J.L0(2)) {
                Log.v("FragmentManager", "Instantiate " + c1116a + " op #" + i11 + " base fragment #" + this.f13060q[i12]);
            }
            aVar.f13012h = AbstractC1157q.b.values()[this.f13062s[i11]];
            aVar.f13013i = AbstractC1157q.b.values()[this.f13063t[i11]];
            int[] iArr = this.f13060q;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z9 = false;
            }
            aVar.f13007c = z9;
            int i14 = iArr[i13];
            aVar.f13008d = i14;
            int i15 = iArr[i10 + 3];
            aVar.f13009e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar.f13010f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar.f13011g = i18;
            c1116a.f12989d = i14;
            c1116a.f12990e = i15;
            c1116a.f12991f = i17;
            c1116a.f12992g = i18;
            c1116a.f(aVar);
            i11++;
        }
    }

    public C1116a b(J j9) {
        C1116a c1116a = new C1116a(j9);
        a(c1116a);
        c1116a.f13052v = this.f13066w;
        for (int i10 = 0; i10 < this.f13061r.size(); i10++) {
            String str = (String) this.f13061r.get(i10);
            if (str != null) {
                ((S.a) c1116a.f12988c.get(i10)).f13006b = j9.h0(str);
            }
        }
        c1116a.x(1);
        return c1116a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f13060q);
        parcel.writeStringList(this.f13061r);
        parcel.writeIntArray(this.f13062s);
        parcel.writeIntArray(this.f13063t);
        parcel.writeInt(this.f13064u);
        parcel.writeString(this.f13065v);
        parcel.writeInt(this.f13066w);
        parcel.writeInt(this.f13067x);
        TextUtils.writeToParcel(this.f13068y, parcel, 0);
        parcel.writeInt(this.f13069z);
        TextUtils.writeToParcel(this.f13056A, parcel, 0);
        parcel.writeStringList(this.f13057B);
        parcel.writeStringList(this.f13058C);
        parcel.writeInt(this.f13059D ? 1 : 0);
    }

    C1117b(Parcel parcel) {
        this.f13060q = parcel.createIntArray();
        this.f13061r = parcel.createStringArrayList();
        this.f13062s = parcel.createIntArray();
        this.f13063t = parcel.createIntArray();
        this.f13064u = parcel.readInt();
        this.f13065v = parcel.readString();
        this.f13066w = parcel.readInt();
        this.f13067x = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f13068y = (CharSequence) creator.createFromParcel(parcel);
        this.f13069z = parcel.readInt();
        this.f13056A = (CharSequence) creator.createFromParcel(parcel);
        this.f13057B = parcel.createStringArrayList();
        this.f13058C = parcel.createStringArrayList();
        this.f13059D = parcel.readInt() != 0;
    }
}
