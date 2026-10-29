package androidx.slice;

import android.app.PendingIntent;
import android.os.Parcelable;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
public class SliceItemHolder implements p192t1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    p192t1.a f13694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Parcelable f13695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f13696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f13697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f13698e;

    public SliceItemHolder() {
    }

    public Object a(String str) {
        str.getClass();
        switch (str) {
            case "action":
                return new B0.e(this.f13695b, (Slice) this.f13694a);
            case "int":
                return Integer.valueOf(this.f13697d);
            case "long":
                return Long.valueOf(this.f13698e);
            case "text":
                String str2 = this.f13696c;
                return (str2 == null || str2.length() == 0) ? "" : p251z0.b.a(this.f13696c, 0);
            case "image":
            case "slice":
                return this.f13694a;
            case "input":
                return this.f13695b;
            default:
                throw new IllegalArgumentException("Unrecognized format " + str);
        }
    }

    public SliceItemHolder(String str, Object obj, boolean z9) {
        str.getClass();
        switch (str) {
            case "action":
                B0.e eVar = (B0.e) obj;
                Object obj2 = eVar.f328a;
                if (obj2 instanceof PendingIntent) {
                    if (z9) {
                        throw new IllegalArgumentException("Cannot write PendingIntent to stream");
                    }
                    this.f13695b = (Parcelable) obj2;
                } else if (!z9) {
                    throw new IllegalArgumentException("Cannot write callback to parcel");
                }
                this.f13694a = (p192t1.a) eVar.f329b;
                return;
            case "int":
                this.f13697d = ((Integer) obj).intValue();
                return;
            case "long":
                this.f13698e = ((Long) obj).longValue();
                return;
            case "text":
                this.f13696c = obj instanceof Spanned ? p251z0.b.b((Spanned) obj, 0) : (String) obj;
                return;
            case "image":
            case "slice":
                this.f13694a = (p192t1.a) obj;
                return;
            case "input":
                if (z9) {
                    throw new IllegalArgumentException("Cannot write RemoteInput to stream");
                }
                this.f13695b = (Parcelable) obj;
                return;
            default:
                return;
        }
    }
}
