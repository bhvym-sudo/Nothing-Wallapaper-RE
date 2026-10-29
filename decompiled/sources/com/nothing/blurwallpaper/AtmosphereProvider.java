package com.nothing.blurwallpaper;

import android.app.WallpaperColors;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import com.nothing.blurwallpaper.AtmosphereProvider;
import com.nothing.wallpaper.common.log.FileLog;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import kotlin.jvm.internal.AbstractC1457h;
import org.json.JSONArray;
import org.json.JSONException;
import p079h8.A;
import p079h8.i;
import p166q5.n;
import p166q5.v;

/* JADX INFO: loaded from: classes.dex */
public final class AtmosphereProvider extends ContentProvider {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f17657r = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p079h8.h f17658q = i.b(new p219v8.a() { // from class: q5.a
        @Override // p219v8.a
        public final Object invoke() {
            return AtmosphereProvider.f();
        }
    });

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    private final void c(String str) {
        com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereProvider", "clean preview for " + str + ".");
        n.f25056a.f(str);
        c.f17732v.a(str);
    }

    private final UriMatcher d() {
        return (UriMatcher) this.f17658q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A e(Uri uri, Context context) {
        com.nothing.wallpaper.common.log.c.k("BLUR-AtmosphereProvider", "notifyChange:" + uri);
        context.getContentResolver().notifyChange(uri, null);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UriMatcher f() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("com.nothing.blurwallpaper.AtmosphereProvider", "final", 1);
        return uriMatcher;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        kotlin.jvm.internal.n.h(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (printWriter == null) {
            return;
        }
        super.dump(fileDescriptor, printWriter, strArr);
        Context context = getContext();
        if (context != null) {
            v.f25076a.b(context, printWriter);
        }
        try {
            FileLog.flushAll(printWriter);
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        kotlin.jvm.internal.n.h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        kotlin.jvm.internal.n.h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
        kotlin.jvm.internal.n.h(uri, "uri");
        kotlin.jvm.internal.n.h(mode, "mode");
        Context context = getContext();
        if (context == null || d().match(uri) != 1) {
            return null;
        }
        String string = v.f25076a.d(context).getString("final_image_path", null);
        if (string != null) {
            return ParcelFileDescriptor.open(new File(string), ParcelFileDescriptor.parseMode(mode));
        }
        throw new FileNotFoundException("No files supported by provider at " + uri);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        kotlin.jvm.internal.n.h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        kotlin.jvm.internal.n.h(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public int update(final Uri uri, ContentValues contentValues, Bundle bundle) throws JSONException {
        kotlin.jvm.internal.n.h(uri, "uri");
        final Context context = getContext();
        if (context == null) {
            return 0;
        }
        if (bundle != null) {
            if (bundle.containsKey("preview_uris")) {
                String string = bundle.getString("preview_uris");
                com.nothing.wallpaper.common.log.c.d("BLUR-AtmosphereProvider", "update: preview " + string + ".");
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string2 = jSONArray.getString(i10);
                    IBinder binder = bundle.getBinder(string2);
                    p097j6.f fVarA = binder != null ? j6.f.a.a(binder) : null;
                    kotlin.jvm.internal.n.e(string2);
                    c.j(c.f17732v.b(context, p117l6.a.f22963e.c(string2)), new c.b(string2, fVarA != null ? fVarA.get() : null, null, true), null, 2, null);
                }
            } else if (bundle.containsKey("final_uri")) {
                String string3 = bundle.getString("final_uri");
                if (string3 == null) {
                    com.nothing.wallpaper.common.log.c.f("BLUR-AtmosphereProvider", "can't get final key.");
                    return 0;
                }
                p117l6.a.C0583a c0583a = p117l6.a.f22963e;
                c(c0583a.b(string3).c());
                FileLog.d("BLUR-AtmosphereProvider", "update: final " + string3 + ".");
                IBinder binder2 = bundle.getBinder("blur_messenger");
                c.b bVar = new c.b(string3, null, binder2 != null ? i6.g.a.a(binder2) : null, false);
                WallpaperColors wallpaperColors = (WallpaperColors) bundle.getParcelable("final_colors", WallpaperColors.class);
                if (wallpaperColors != null) {
                    v.f25076a.e(context, wallpaperColors);
                }
                c.f17732v.b(context, c0583a.c(string3)).i(bVar, new p219v8.a() { // from class: q5.b
                    @Override // p219v8.a
                    public final Object invoke() {
                        return AtmosphereProvider.e(uri, context);
                    }
                });
            }
        }
        if (contentValues != null && contentValues.containsKey("clean_preview")) {
            String asString = contentValues.getAsString("clean_preview");
            kotlin.jvm.internal.n.e(asString);
            c(asString);
        }
        return 0;
    }
}
