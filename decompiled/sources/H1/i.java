package H1;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import com.nothing.wallpaper.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p074h3.I;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static i f2328e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f2329a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f2330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f2331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K1.b f2332d;

    public interface a {
        void a(boolean z9);
    }

    private i(ContentResolver contentResolver, j jVar, K1.b bVar) {
        this.f2330b = contentResolver;
        this.f2331c = jVar;
        this.f2332d = bVar;
    }

    public static i f(Context context) {
        if (f2328e == null) {
            Context applicationContext = context.getApplicationContext();
            f2328e = new i(applicationContext.getContentResolver(), new j(applicationContext, applicationContext.getString(R.string.themed_icon_metadata_key)), (K1.b) I.a().f(applicationContext));
        }
        return f2328e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(a aVar) {
        aVar.a(this.f2332d.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(final a aVar) {
        Cursor cursorQuery = this.f2330b.query(this.f2331c.a("icon_themed"), null, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToNext()) {
                    final boolean z9 = true;
                    if (cursorQuery.getInt(cursorQuery.getColumnIndex("boolean_value")) != 1) {
                        z9 = false;
                    }
                    if (this.f2332d.n() != z9) {
                        this.f2332d.f0(z9);
                    }
                    if (aVar != null) {
                        l(new Runnable() { // from class: H1.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                aVar.a(z9);
                            }
                        });
                    }
                    cursorQuery.close();
                    return;
                }
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        if (aVar != null) {
            l(new Runnable() { // from class: H1.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2326q.i(aVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(boolean z9) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("boolean_value", Boolean.valueOf(z9));
        if (this.f2330b.update(this.f2331c.a("icon_themed"), contentValues, null, null) == 1) {
            this.f2332d.f0(z9);
        }
    }

    private void l(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    public void e(final a aVar) {
        this.f2329a.submit(new Runnable() { // from class: H1.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f2322q.j(aVar);
            }
        });
    }

    public boolean g() {
        return this.f2331c.b();
    }

    public boolean h() {
        return this.f2332d.n();
    }

    public void m(final boolean z9) {
        this.f2329a.submit(new Runnable() { // from class: H1.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f2320q.k(z9);
            }
        });
    }
}
