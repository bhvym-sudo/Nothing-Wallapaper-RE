package androidx.core.graphics.drawable;

import B0.i;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f12163k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f12165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f12166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f12167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f12170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f12171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f12172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f12173j;

    static class a {
        static IconCompat a(Context context, Icon icon) {
            int iD = d(icon);
            if (iD == 2) {
                String strC = c(icon);
                try {
                    return IconCompat.h(IconCompat.k(context, strC), strC, b(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            }
            if (iD == 4) {
                return IconCompat.f(e(icon));
            }
            if (iD == 6) {
                return IconCompat.c(e(icon));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f12165b = icon;
            return iconCompat;
        }

        static int b(Object obj) {
            return c.a(obj);
        }

        static String c(Object obj) {
            return c.b(obj);
        }

        static int d(Object obj) {
            return c.c(obj);
        }

        static Uri e(Object obj) {
            return c.d(obj);
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon g(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f12164a) {
                case -1:
                    return (Icon) iconCompat.f12165b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f12165b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.j(), iconCompat.f12168e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f12165b, iconCompat.f12168e, iconCompat.f12169f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f12165b);
                    break;
                case 5:
                    iconCreateWithBitmap = b.a((Bitmap) iconCompat.f12165b);
                    break;
                case 6:
                    iconCreateWithBitmap = d.a(iconCompat.m());
                    break;
            }
            ColorStateList colorStateList = iconCompat.f12170g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f12171h;
            if (mode != IconCompat.f12163k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    static class b {
        static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f12164a = -1;
        this.f12166c = null;
        this.f12167d = null;
        this.f12168e = 0;
        this.f12169f = 0;
        this.f12170g = null;
        this.f12171h = f12163k;
        this.f12172i = null;
    }

    public static IconCompat b(Context context, Icon icon) {
        i.e(icon);
        return a.a(context, icon);
    }

    public static IconCompat c(Uri uri) {
        B0.d.c(uri);
        return d(uri.toString());
    }

    public static IconCompat d(String str) {
        B0.d.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f12165b = str;
        return iconCompat;
    }

    public static IconCompat e(Bitmap bitmap) {
        B0.d.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f12165b = bitmap;
        return iconCompat;
    }

    public static IconCompat f(Uri uri) {
        B0.d.c(uri);
        return g(uri.toString());
    }

    public static IconCompat g(String str) {
        B0.d.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f12165b = str;
        return iconCompat;
    }

    public static IconCompat h(Resources resources, String str, int i10) {
        B0.d.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f12168e = i10;
        if (resources != null) {
            try {
                iconCompat.f12165b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f12165b = str;
        }
        iconCompat.f12173j = str;
        return iconCompat;
    }

    static Resources k(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e10);
            return null;
        }
    }

    private static String s(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public void a(Context context) {
        Object obj;
        if (this.f12164a != 2 || (obj = this.f12165b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String strJ = j();
            int identifier = k(context, strJ).getIdentifier(str4, str3, str5);
            if (this.f12168e != identifier) {
                Log.i("IconCompat", "Id has changed for " + strJ + " " + str);
                this.f12168e = identifier;
            }
        }
    }

    public int i() {
        int i10 = this.f12164a;
        if (i10 == -1) {
            return a.b(this.f12165b);
        }
        if (i10 == 2) {
            return this.f12168e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String j() {
        int i10 = this.f12164a;
        if (i10 == -1) {
            return a.c(this.f12165b);
        }
        if (i10 == 2) {
            String str = this.f12173j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f12165b).split(":", -1)[0] : this.f12173j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int l() {
        int i10 = this.f12164a;
        return i10 == -1 ? a.d(this.f12165b) : i10;
    }

    public Uri m() {
        int i10 = this.f12164a;
        if (i10 == -1) {
            return a.e(this.f12165b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f12165b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public Drawable n(Context context) {
        a(context);
        return a.f(r(context), context);
    }

    public void o() {
        this.f12171h = PorterDuff.Mode.valueOf(this.f12172i);
        switch (this.f12164a) {
            case -1:
                Parcelable parcelable = this.f12167d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f12165b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f12167d;
                if (parcelable2 != null) {
                    this.f12165b = parcelable2;
                    return;
                }
                byte[] bArr = this.f12166c;
                this.f12165b = bArr;
                this.f12164a = 3;
                this.f12168e = 0;
                this.f12169f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f12166c, Charset.forName("UTF-16"));
                this.f12165b = str;
                if (this.f12164a == 2 && this.f12173j == null) {
                    this.f12173j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f12165b = this.f12166c;
                return;
        }
    }

    public void p(boolean z9) {
        this.f12172i = this.f12171h.name();
        switch (this.f12164a) {
            case -1:
                if (z9) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f12167d = (Parcelable) this.f12165b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z9) {
                    this.f12167d = (Parcelable) this.f12165b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f12165b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f12166c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f12166c = ((String) this.f12165b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f12166c = (byte[]) this.f12165b;
                return;
            case 4:
            case 6:
                this.f12166c = this.f12165b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Icon q() {
        return r(null);
    }

    public Icon r(Context context) {
        return a.g(this, context);
    }

    public String toString() {
        if (this.f12164a == -1) {
            return String.valueOf(this.f12165b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(s(this.f12164a));
        switch (this.f12164a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f12165b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f12165b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f12173j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(i())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f12168e);
                if (this.f12169f != 0) {
                    sb.append(" off=");
                    sb.append(this.f12169f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f12165b);
                break;
        }
        if (this.f12170g != null) {
            sb.append(" tint=");
            sb.append(this.f12170g);
        }
        if (this.f12171h != f12163k) {
            sb.append(" mode=");
            sb.append(this.f12171h);
        }
        sb.append(")");
        return sb.toString();
    }

    IconCompat(int i10) {
        this.f12166c = null;
        this.f12167d = null;
        this.f12168e = 0;
        this.f12169f = 0;
        this.f12170g = null;
        this.f12171h = f12163k;
        this.f12172i = null;
        this.f12164a = i10;
    }
}
