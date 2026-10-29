package p242y1;

import H3.q;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.C;
import androidx.lifecycle.H;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.common.log.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f30182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f30183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f30184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f30185d;

    private static class a extends H {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final ContentResolver f30186l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Uri f30187m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ContentObserver f30188n;

        /* JADX INFO: renamed from: y1.j$a$a, reason: collision with other inner class name */
        class C0744a extends ContentObserver {
            C0744a(Handler handler) {
                super(handler);
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z9) {
                a.this.l(new Object());
            }
        }

        a(Context context, Uri uri, Handler handler) {
            this.f30186l = context.getContentResolver();
            this.f30187m = uri;
            this.f30188n = new C0744a(handler);
        }

        @Override // androidx.lifecycle.C
        protected void j() {
            try {
                this.f30186l.registerContentObserver(this.f30187m, true, this.f30188n);
            } catch (Exception e10) {
                c.f("LauncherGridOptionsProvider", "onActive register failed, msg:" + e10.getMessage());
            }
        }

        @Override // androidx.lifecycle.C
        protected void k() {
            this.f30186l.unregisterContentObserver(this.f30188n);
        }
    }

    public j(Context context, String str) {
        this.f30183b = new q(context, str);
        this.f30182a = context;
    }

    int a(String str) {
        if (this.f30183b.e("default_grid") == null) {
            return 0;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", str);
        return this.f30182a.getContentResolver().update(this.f30183b.e("default_grid"), contentValues, null, null);
    }

    boolean b() {
        return this.f30183b.i();
    }

    List c(boolean z9) {
        if (!b()) {
            return null;
        }
        List list = this.f30184c;
        if (list != null && !z9) {
            return list;
        }
        if (this.f30183b.e("list_options") == null) {
            return null;
        }
        ContentResolver contentResolver = this.f30182a.getContentResolver();
        String string = this.f30182a.getResources().getString(Resources.getSystem().getIdentifier("config_icon_mask", TypedValues.Custom.S_STRING, "android"));
        try {
            Cursor cursorQuery = contentResolver.query(this.f30183b.e("list_options"), null, null, null, null);
            try {
                this.f30184c = new ArrayList();
                while (cursorQuery.moveToNext()) {
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("name"));
                    int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("rows"));
                    int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex("cols"));
                    int i12 = cursorQuery.getInt(cursorQuery.getColumnIndex("preview_count"));
                    boolean z10 = Boolean.parseBoolean(cursorQuery.getString(cursorQuery.getColumnIndex("is_default")));
                    this.f30184c.add(new p242y1.a(this.f30182a.getString(R.string.grid_title_pattern, Integer.valueOf(i11), Integer.valueOf(i10)), string2, z10, i10, i11, this.f30183b.e("preview"), i12, string));
                }
                cursorQuery.close();
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
                return this.f30184c;
            }
        } catch (Exception unused) {
            this.f30184c = null;
        }
        return this.f30184c;
    }

    public C d(Handler handler) {
        if (this.f30183b.e("default_grid") == null) {
            return this.f30185d;
        }
        if (this.f30185d == null) {
            this.f30185d = new a(this.f30182a, this.f30183b.e("default_grid"), handler);
        }
        return this.f30185d;
    }
}
