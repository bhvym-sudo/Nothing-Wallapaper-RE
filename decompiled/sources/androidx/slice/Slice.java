package androidx.slice;

import B0.i;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.app.slice.SliceManager;
import android.content.Context;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Slice implements p192t1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SliceSpec f13681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    SliceItem[] f13682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String[] f13683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f13684d;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f13685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList f13686b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ArrayList f13687c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private SliceSpec f13688d;

        public a(Uri uri) {
            this.f13685a = uri;
        }

        public a a(PendingIntent pendingIntent, Slice slice, String str) {
            i.e(pendingIntent);
            i.e(slice);
            this.f13686b.add(new SliceItem(pendingIntent, slice, "action", str, (String[]) slice.d().toArray(new String[slice.d().size()])));
            return this;
        }

        public a b(List list) {
            return c((String[]) list.toArray(new String[list.size()]));
        }

        public a c(String... strArr) {
            this.f13687c.addAll(Arrays.asList(strArr));
            return this;
        }

        public a d(IconCompat iconCompat, String str, List list) {
            i.e(iconCompat);
            return Slice.h(iconCompat) ? e(iconCompat, str, (String[]) list.toArray(new String[list.size()])) : this;
        }

        public a e(IconCompat iconCompat, String str, String... strArr) {
            i.e(iconCompat);
            if (Slice.h(iconCompat)) {
                this.f13686b.add(new SliceItem(iconCompat, "image", str, strArr));
            }
            return this;
        }

        public a f(int i10, String str, List list) {
            return g(i10, str, (String[]) list.toArray(new String[list.size()]));
        }

        public a g(int i10, String str, String... strArr) {
            this.f13686b.add(new SliceItem(Integer.valueOf(i10), "int", str, strArr));
            return this;
        }

        public a h(long j9, String str, List list) {
            return i(j9, str, (String[]) list.toArray(new String[list.size()]));
        }

        public a i(long j9, String str, String... strArr) {
            this.f13686b.add(new SliceItem(Long.valueOf(j9), "long", str, strArr));
            return this;
        }

        public a j(RemoteInput remoteInput, String str, List list) {
            i.e(remoteInput);
            return k(remoteInput, str, (String[]) list.toArray(new String[list.size()]));
        }

        public a k(RemoteInput remoteInput, String str, String... strArr) {
            i.e(remoteInput);
            this.f13686b.add(new SliceItem(remoteInput, "input", str, strArr));
            return this;
        }

        public a l(Slice slice, String str) {
            i.e(slice);
            this.f13686b.add(new SliceItem(slice, "slice", str, (String[]) slice.d().toArray(new String[slice.d().size()])));
            return this;
        }

        public a m(CharSequence charSequence, String str, List list) {
            return n(charSequence, str, (String[]) list.toArray(new String[list.size()]));
        }

        public a n(CharSequence charSequence, String str, String... strArr) {
            this.f13686b.add(new SliceItem(charSequence, "text", str, strArr));
            return this;
        }

        public Slice o() {
            ArrayList arrayList = this.f13686b;
            ArrayList arrayList2 = this.f13687c;
            return new Slice(arrayList, (String[]) arrayList2.toArray(new String[arrayList2.size()]), this.f13685a, this.f13688d);
        }

        public a p(SliceSpec sliceSpec) {
            this.f13688d = sliceSpec;
            return this;
        }
    }

    Slice(ArrayList arrayList, String[] strArr, Uri uri, SliceSpec sliceSpec) {
        this.f13682b = new SliceItem[0];
        this.f13683c = strArr;
        this.f13682b = (SliceItem[]) arrayList.toArray(new SliceItem[arrayList.size()]);
        this.f13684d = uri.toString();
        this.f13681a = sliceSpec;
    }

    public static void a(StringBuilder sb, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        sb.append('(');
        int length = strArr.length - 1;
        for (int i10 = 0; i10 < length; i10++) {
            sb.append(strArr[i10]);
            sb.append(", ");
        }
        sb.append(strArr[length]);
        sb.append(")");
    }

    public static Slice b(Context context, Uri uri, Set set) {
        return c(context, uri, set);
    }

    private static Slice c(Context context, Uri uri, Set set) {
        return b.c(((SliceManager) context.getSystemService(SliceManager.class)).bindSlice(uri, b.b(set)), context);
    }

    static boolean h(IconCompat iconCompat) {
        if (iconCompat == null) {
            return false;
        }
        if (iconCompat.f12164a != 2 || iconCompat.i() != 0) {
            return true;
        }
        throw new IllegalArgumentException("Failed to add icon, invalid resource id: " + iconCompat.i());
    }

    public List d() {
        return Arrays.asList(this.f13683c);
    }

    public List e() {
        return Arrays.asList(this.f13682b);
    }

    public Uri f() {
        return Uri.parse(this.f13684d);
    }

    public boolean g(String str) {
        return androidx.slice.a.a(this.f13683c, str);
    }

    public String i(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("Slice ");
        String[] strArr = this.f13683c;
        if (strArr.length > 0) {
            a(sb, strArr);
            sb.append(' ');
        }
        sb.append('[');
        sb.append(this.f13684d);
        sb.append("] {\n");
        String str2 = str + "  ";
        int i10 = 0;
        while (true) {
            SliceItem[] sliceItemArr = this.f13682b;
            if (i10 >= sliceItemArr.length) {
                sb.append(str);
                sb.append('}');
                return sb.toString();
            }
            sb.append(sliceItemArr[i10].r(str2));
            i10++;
        }
    }

    public String toString() {
        return i("");
    }

    public Slice() {
        this.f13682b = new SliceItem[0];
        this.f13683c = new String[0];
    }
}
