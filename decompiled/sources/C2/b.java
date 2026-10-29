package C2;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import android.os.UserHandle;
import android.provider.Settings;
import java.util.Optional;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final Uri f588E = Settings.Secure.getUriFor("nav_bar_kids_mode");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f589A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private ComponentName f590B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f602z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f593q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f594r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f595s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f596t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f597u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f598v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f599w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f600x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f601y = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f592D = -1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public UserHandle f591C = Process.myUserHandle();

    public void a(b bVar) {
        this.f593q = bVar.f593q;
        this.f602z = bVar.f602z;
        this.f595s = bVar.f595s;
        this.f596t = bVar.f596t;
        this.f597u = bVar.f597u;
        this.f598v = bVar.f598v;
        this.f599w = bVar.f599w;
        this.f600x = bVar.f600x;
        this.f601y = bVar.f601y;
        this.f591C = bVar.f591C;
        this.f589A = bVar.f589A;
        this.f590B = bVar.d();
        this.f592D = bVar.f592D;
    }

    protected String b() {
        return "id=" + this.f593q + " targetComponent=" + d() + " cell(" + this.f595s + "," + this.f596t + ") span(" + this.f597u + "," + this.f598v + ") minSpan(" + this.f599w + "," + this.f600x + ") rank=" + this.f601y + " user=" + this.f591C + " title=" + ((Object) this.f602z);
    }

    public Intent c() {
        return null;
    }

    public ComponentName d() {
        return (ComponentName) Optional.ofNullable(c()).map(new Function() { // from class: C2.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Intent) obj).getComponent();
            }
        }).orElse(this.f590B);
    }

    public int e() {
        return this.f593q;
    }

    public b f() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    public void g(ContentValues contentValues) {
        this.f594r = contentValues.getAsInteger("screen").intValue();
        this.f595s = contentValues.getAsInteger("cellX").intValue();
        this.f596t = contentValues.getAsInteger("cellY").intValue();
        this.f597u = contentValues.getAsInteger("spanX").intValue();
        this.f598v = contentValues.getAsInteger("spanY").intValue();
        this.f601y = contentValues.getAsInteger("rank").intValue();
    }

    public void j(ContentValues contentValues) {
        contentValues.put("screen", Integer.valueOf(this.f594r));
        contentValues.put("cellX", Integer.valueOf(this.f595s));
        contentValues.put("cellY", Integer.valueOf(this.f596t));
        contentValues.put("spanX", Integer.valueOf(this.f597u));
        contentValues.put("spanY", Integer.valueOf(this.f598v));
        contentValues.put("rank", Integer.valueOf(this.f601y));
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + b() + ")";
    }
}
