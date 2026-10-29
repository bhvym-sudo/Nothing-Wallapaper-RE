package p074h3;

import A6.c;
import C6.g;
import G6.e;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.android.launcher3.w;
import com.nothing.wallpaper.R;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import org.json.JSONException;
import p014b3.f;
import p064g3.l;
import p064g3.y;
import p237x6.q;

/* JADX INFO: loaded from: classes.dex */
public class C implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final W f21612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WallpaperManager f21613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0 f21614d;

    private class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X.a f21615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WallpaperManager f21616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f21617c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f21618d;

        public a(X.a aVar) {
            this.f21615a = aVar;
            this.f21616b = WallpaperManager.getInstance(C.this.f21611a);
        }

        private void a() throws JSONException {
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            ArrayList arrayList = new ArrayList(2);
            final ArrayList arrayList2 = new ArrayList(2);
            StringBuilder sb = new StringBuilder("clearEffectInfoCache: ");
            sb.append("\n   using:");
            WallpaperInfo wallpaperInfo = this.f21616b.getWallpaperInfo();
            g.a aVar = g.f648e;
            g gVarA = aVar.a(C.this.f21612b.X());
            if (gVarA != null) {
                z9 = (wallpaperInfo == null && f()) ? false : true;
                sb.append("home=");
                sb.append(gVarA.d());
                sb.append(",");
                String strD = gVarA.d();
                if (z9) {
                    arrayList.add(strD);
                    C.this.f21612b.T(null);
                } else {
                    arrayList2.add(strD);
                }
            } else {
                z9 = true;
            }
            g gVarA2 = aVar.a(C.this.f21612b.R());
            if (gVarA2 != null) {
                z10 = wallpaperInfo == null || !e.h(wallpaperInfo);
                sb.append("homeLive=");
                sb.append(gVarA2.d());
                sb.append(",");
                String strD2 = gVarA2.d();
                if (z10) {
                    arrayList.add(strD2);
                    C.this.f21612b.e0(null);
                } else {
                    arrayList2.add(strD2);
                }
            } else {
                z10 = true;
            }
            WallpaperInfo wallpaperInfo2 = this.f21616b.getWallpaperInfo(2);
            g gVarA3 = aVar.a(C.this.f21612b.g());
            if (gVarA3 != null) {
                z11 = wallpaperInfo2 == null && this.f21616b.getWallpaperId(2) < 0 && !z9 && gVarA.d().equals(gVarA3.d());
                z12 = (z11 || (wallpaperInfo2 == null && j())) ? false : true;
                sb.append("lock=");
                sb.append(gVarA3.d());
                sb.append(",");
                String strD3 = gVarA3.d();
                if (z12) {
                    arrayList.add(strD3);
                    C.this.f21612b.v(null);
                } else {
                    arrayList2.add(strD3);
                }
            } else {
                z11 = false;
                z12 = true;
            }
            g gVarA4 = aVar.a(C.this.f21612b.N());
            if (gVarA4 != null) {
                if (wallpaperInfo2 == null && gVarA2 != null && gVarA2.equals(gVarA4) && z10) {
                    z13 = true;
                } else {
                    z13 = !(wallpaperInfo2 == null || e.h(wallpaperInfo2)) || (wallpaperInfo2 == null && this.f21616b.getWallpaperId(2) > 0);
                }
                sb.append("lockLive=");
                sb.append(gVarA4.d());
                sb.append(",");
                String strD4 = gVarA4.d();
                if (z13) {
                    arrayList.add(strD4);
                    C.this.f21612b.b(null);
                } else {
                    arrayList2.add(strD4);
                }
            } else {
                z13 = true;
            }
            arrayList.removeIf(new Predicate() { // from class: h3.B
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return arrayList2.contains((String) obj);
                }
            });
            q qVarO = ((K1.a) I.a()).o(C.this.f21611a);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                qVarO.p((String) it.next());
            }
            c cVar = new c(C.this.f21611a);
            if (gVarA2 != null) {
                try {
                    cVar.O0(gVarA2.d());
                } catch (Throwable th) {
                    try {
                        cVar.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            if (z10) {
                C.this.f21612b.B();
                cVar.I();
            }
            cVar.close();
            sb.append("\n");
            sb.append("   delHome=");
            sb.append(z9);
            sb.append(", delLiveHome=");
            sb.append(z10);
            sb.append("\n");
            sb.append("   isLockBothUsed=");
            sb.append(z11);
            sb.append(", delLock=");
            sb.append(z12);
            sb.append(", delLiveLock=");
            sb.append(z13);
            sb.append("\n");
            sb.append("   deletes=");
            sb.append(arrayList);
            sb.append(", uses=");
            sb.append(arrayList2);
            com.nothing.wallpaper.common.log.c.d("DefaultWPRefresher", sb.toString());
        }

        private long c() throws Throwable {
            if (this.f21617c == 0 && C.this.f21614d.b()) {
                Bitmap bitmapD = d();
                this.f21617c = bitmapD != null ? f.d(bitmapD) : 0L;
            }
            return this.f21617c;
        }

        private Bitmap d() throws Throwable {
            Bitmap bitmap;
            ParcelFileDescriptor wallpaperFile = this.f21616b.getWallpaperFile(2);
            FileInputStream fileInputStream = null;
            Bitmap bitmapDecodeStream = null;
            fileInputStream = null;
            try {
                if (wallpaperFile == null) {
                    return null;
                }
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(wallpaperFile.getFileDescriptor());
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream2);
                        wallpaperFile.close();
                        try {
                            fileInputStream2.close();
                            return bitmapDecodeStream;
                        } catch (IOException unused) {
                            Log.e("DefaultWPRefresher", "IO exception when closing input stream for lock screen WP.");
                            return bitmapDecodeStream;
                        }
                    } catch (IOException unused2) {
                        bitmap = bitmapDecodeStream;
                        fileInputStream = fileInputStream2;
                        Log.e("DefaultWPRefresher", "IO exception when closing the file descriptor.");
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused3) {
                                Log.e("DefaultWPRefresher", "IO exception when closing input stream for lock screen WP.");
                            }
                        }
                        return bitmap;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                    }
                } catch (IOException unused4) {
                    bitmap = null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused5) {
                    Log.e("DefaultWPRefresher", "IO exception when closing input stream for lock screen WP.");
                }
            }
            throw th;
        }

        private boolean e() {
            List listX = C.this.f21612b.x();
            return listX.get(0) == null && listX.get(1) == null && listX.get(2) == null;
        }

        private boolean f() {
            return C.this.f21612b.y() == this.f21616b.getWallpaperId(1);
        }

        private boolean g() {
            this.f21618d = this.f21616b.getWallpaperInfo().getServiceName();
            return this.f21618d.equals(C.this.f21612b.A());
        }

        private boolean h() {
            return this.f21616b.getWallpaperInfo() == null ? f() : g();
        }

        private boolean i() {
            List listG = C.this.f21612b.G();
            return listG.get(0) == null && listG.get(1) == null && listG.get(2) == null;
        }

        private boolean j() {
            long jD = C.this.f21612b.D();
            if (jD == 0) {
                return C.this.f21612b.b0() == this.f21616b.getWallpaperId(2);
            }
            return jD == c();
        }

        private boolean k() {
            return this.f21616b.getWallpaperInfo(2).getServiceName().equals(C.this.f21612b.C());
        }

        private boolean l() {
            return this.f21616b.getWallpaperInfo(2) == null ? j() : k();
        }

        private void n() {
            WallpaperInfo wallpaperInfo = this.f21616b.getWallpaperInfo();
            if (wallpaperInfo == null) {
                C.this.f21612b.h(Arrays.asList(C.this.f21611a.getResources().getString(R.string.fallback_wallpaper_title)));
                C.this.f21612b.I(this.f21616b.getWallpaperId(1));
            } else {
                C.this.f21612b.h(Arrays.asList(wallpaperInfo.loadLabel(C.this.f21611a.getPackageManager()).toString()));
                C.this.f21612b.i0(this.f21618d);
            }
            C.this.f21612b.o(1);
            C.this.f21612b.d();
        }

        private void o() {
            C.this.f21612b.O(Arrays.asList(C.this.f21611a.getResources().getString(R.string.fallback_wallpaper_title)));
            C.this.f21612b.k0(this.f21616b.getWallpaperId(2));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List doInBackground(Void... voidArr) throws JSONException {
            a();
            ArrayList arrayList = new ArrayList();
            WallpaperInfo wallpaperInfo = this.f21616b.getWallpaperInfo(1);
            boolean z9 = wallpaperInfo == null;
            if (!h() || (z9 && e())) {
                C.this.f21612b.a();
                n();
            }
            boolean zB = C.this.f21614d.b();
            boolean z10 = wallpaperInfo != null && e.h(wallpaperInfo);
            if (z9) {
                arrayList.add(new y(C.this.f21612b.x(), C.this.f21612b.f(), C.this.f21612b.U(), null, C.this.f21612b.i(), C.this.f21612b.X(), C.this.f21612b.M(), C.this.f21612b.k()));
            } else {
                if (w.f15765i) {
                    arrayList.add(new l(wallpaperInfo, null, this.f21616b.getWallpaperInstance(1).getDescription(), z10 ? C.this.f21612b.S() : null, z10 ? C.this.f21612b.u() : null, z10 ? C.this.f21612b.H() : null, z10 ? C.this.f21612b.J() : null, C.this.f21612b.R(), C.this.f21612b.z(), C.this.f21612b.k()));
                } else {
                    arrayList.add(new l(wallpaperInfo, null, z10 ? C.this.f21612b.S() : null, z10 ? C.this.f21612b.u() : null, z10 ? C.this.f21612b.H() : null, z10 ? C.this.f21612b.J() : null, C.this.f21612b.R(), C.this.f21612b.z(), C.this.f21612b.k()));
                }
            }
            if (!zB) {
                return arrayList;
            }
            WallpaperInfo wallpaperInfo2 = this.f21616b.getWallpaperInfo(2);
            boolean z11 = wallpaperInfo2 == null;
            if (!l() || (z11 && i())) {
                C.this.f21612b.w();
                o();
            }
            if (z11 || !p024c3.a.b()) {
                arrayList.add(new y(C.this.f21612b.G(), C.this.f21612b.r(), C.this.f21612b.E(), null, C.this.f21612b.W(), C.this.f21612b.g(), C.this.f21612b.a0(), C.this.f21612b.h0()));
                return arrayList;
            }
            if (w.f15765i) {
                arrayList.add(new l(wallpaperInfo2, null, this.f21616b.getWallpaperInstance(2).getDescription(), null, null, null, null, null, C.this.f21612b.V(), C.this.f21612b.h0()));
                return arrayList;
            }
            arrayList.add(new l(wallpaperInfo2, null, null, null, null, null, null, C.this.f21612b.V(), C.this.f21612b.h0()));
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List list) {
            if (list.size() > 2) {
                Log.e("DefaultWPRefresher", "Got more than 2 WallpaperMetadata objects - only home and (optionally) lock are permitted.");
            } else {
                this.f21615a.a((y) list.get(0), list.size() > 1 ? (y) list.get(1) : null, C.this.f21612b.L());
            }
        }
    }

    public C(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f21611a = applicationContext;
        H hA = I.a();
        this.f21612b = hA.f(applicationContext);
        this.f21614d = hA.l(context);
        this.f21613c = (WallpaperManager) context.getSystemService("wallpaper");
    }

    @Override // p074h3.X
    public void a(X.a aVar) {
        new a(aVar).execute(new Void[0]);
    }
}
