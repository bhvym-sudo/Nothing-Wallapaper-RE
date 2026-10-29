package androidx.slice;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.format.DateUtils;
import androidx.appcompat.app.o;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SliceItem extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String[] f13689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f13690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f13691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f13692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    SliceItemHolder f13693e;

    public SliceItem(Object obj, String str, String str2, String[] strArr) {
        this.f13689a = strArr;
        this.f13690b = str;
        this.f13691c = str2;
        this.f13692d = obj;
    }

    private static String o(int i10) {
        if (i10 == 0) {
            return "LTR";
        }
        if (i10 == 1) {
            return "RTL";
        }
        if (i10 != 2) {
            return i10 != 3 ? Integer.toString(i10) : "LOCALE";
        }
        return "INHERIT";
    }

    public static String s(String str) {
        str.getClass();
        switch (str) {
            case "action":
                return "Action";
            case "int":
                return "Int";
            case "long":
                return "Long";
            case "text":
                return "Text";
            case "image":
                return "Image";
            case "input":
                return "RemoteInput";
            case "slice":
                return "Slice";
            default:
                return "Unrecognized format: " + str;
        }
    }

    public void a(Context context, Intent intent) throws PendingIntent.CanceledException {
        b(context, intent);
    }

    public boolean b(Context context, Intent intent) throws PendingIntent.CanceledException {
        Object obj = ((B0.e) this.f13692d).f328a;
        if (obj instanceof PendingIntent) {
            ((PendingIntent) obj).send(context, 0, intent, null, null);
            return false;
        }
        o.a(obj);
        throw null;
    }

    public PendingIntent c() {
        Object obj = ((B0.e) this.f13692d).f328a;
        if (obj instanceof PendingIntent) {
            return (PendingIntent) obj;
        }
        return null;
    }

    public String d() {
        return this.f13690b;
    }

    public List e() {
        return Arrays.asList(this.f13689a);
    }

    public IconCompat f() {
        return (IconCompat) this.f13692d;
    }

    public int g() {
        return ((Integer) this.f13692d).intValue();
    }

    public long h() {
        return ((Long) this.f13692d).longValue();
    }

    public RemoteInput i() {
        return (RemoteInput) this.f13692d;
    }

    public Slice j() {
        return "action".equals(d()) ? (Slice) ((B0.e) this.f13692d).f329b : (Slice) this.f13692d;
    }

    public String k() {
        return this.f13691c;
    }

    public CharSequence l() {
        return (CharSequence) this.f13692d;
    }

    public boolean m(String... strArr) {
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (a.a(this.f13689a, str)) {
                return true;
            }
        }
        return false;
    }

    public boolean n(String str) {
        return a.a(this.f13689a, str);
    }

    public void p() {
        this.f13692d = this.f13693e.a(this.f13690b);
        this.f13693e = null;
    }

    public void q(boolean z9) {
        this.f13693e = new SliceItemHolder(this.f13690b, this.f13692d, z9);
    }

    public String r(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(d());
        if (k() != null) {
            sb.append('<');
            sb.append(k());
            sb.append('>');
        }
        sb.append(' ');
        String[] strArr = this.f13689a;
        if (strArr.length > 0) {
            Slice.a(sb, strArr);
            sb.append(' ');
        }
        String str2 = str + "  ";
        String strD = d();
        strD.getClass();
        switch (strD) {
            case "action":
                Object obj = ((B0.e) this.f13692d).f328a;
                sb.append('[');
                sb.append(obj);
                sb.append("] ");
                sb.append("{\n");
                sb.append(j().i(str2));
                sb.append('\n');
                sb.append(str);
                sb.append('}');
                break;
            case "int":
                if (TypedValues.Custom.S_COLOR.equals(k())) {
                    int iG = g();
                    sb.append(String.format("a=0x%02x r=0x%02x g=0x%02x b=0x%02x", Integer.valueOf(Color.alpha(iG)), Integer.valueOf(Color.red(iG)), Integer.valueOf(Color.green(iG)), Integer.valueOf(Color.blue(iG))));
                    break;
                } else {
                    if (!"layout_direction".equals(k())) {
                        sb.append(g());
                    } else {
                        sb.append(o(g()));
                    }
                    break;
                }
                break;
            case "long":
                if ("millis".equals(k())) {
                    if (h() != -1) {
                        sb.append(DateUtils.getRelativeTimeSpanString(h(), Calendar.getInstance().getTimeInMillis(), 1000L, 262144));
                    } else {
                        sb.append("INFINITY");
                    }
                    break;
                } else {
                    sb.append(h());
                    sb.append('L');
                    break;
                }
                break;
            case "text":
                sb.append('\"');
                sb.append(l());
                sb.append('\"');
                break;
            case "image":
                sb.append(f());
                break;
            case "slice":
                sb.append("{\n");
                sb.append(j().i(str2));
                sb.append('\n');
                sb.append(str);
                sb.append('}');
                break;
            default:
                sb.append(s(d()));
                break;
        }
        sb.append("\n");
        return sb.toString();
    }

    public String toString() {
        return r("");
    }

    public SliceItem() {
        this.f13689a = new String[0];
    }

    public SliceItem(PendingIntent pendingIntent, Slice slice, String str, String str2, String[] strArr) {
        this(new B0.e(pendingIntent, slice), str, str2, strArr);
    }
}
