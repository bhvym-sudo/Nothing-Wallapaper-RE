package p074h3;

import C6.g;
import H3.AbstractC0853c;
import H3.k;
import H3.s;
import J6.e;
import android.app.WallpaperColors;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.WindowManager;
import com.android.wallpaper.asset.o;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import org.json.JSONException;
import p014b3.f;
import p064g3.x;
import p098j7.j;

/* JADX INFO: renamed from: h3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1383x implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WallpaperManager f21739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W f21740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final T f21741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f21742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC1362b f21743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b0 f21744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1363c f21745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private x f21746i;

    /* JADX INFO: renamed from: h3.x$a */
    class a implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ U.a f21747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f21748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21749c;

        a(U.a aVar, x xVar, int i10) {
            this.f21747a = aVar;
            this.f21748b = xVar;
            this.f21749c = i10;
        }

        @Override // com.android.wallpaper.asset.o.a
        public void a(InputStream inputStream) {
            if (inputStream == null) {
                this.f21747a.a(null);
            } else {
                C1383x.this.q(this.f21748b, inputStream, this.f21749c, this.f21747a);
            }
        }
    }

    /* JADX INFO: renamed from: h3.x$b */
    class b implements com.android.wallpaper.asset.a.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ U.a f21751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f21752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21753c;

        b(U.a aVar, x xVar, int i10) {
            this.f21751a = aVar;
            this.f21752b = xVar;
            this.f21753c = i10;
        }

        @Override // com.android.wallpaper.asset.a.d
        public void a(Bitmap bitmap) {
            if (bitmap == null) {
                this.f21751a.a(null);
            } else {
                C1383x.this.r(this.f21752b, bitmap, null, null, null, this.f21753c, this.f21751a);
            }
        }
    }

    /* JADX INFO: renamed from: h3.x$c */
    class c implements InterfaceC1362b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f21755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f21756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ U.a f21757c;

        c(x xVar, int i10, U.a aVar) {
            this.f21755a = xVar;
            this.f21756b = i10;
            this.f21757c = aVar;
        }

        @Override // p074h3.InterfaceC1362b.a
        public void a(Throwable th) {
            this.f21757c.a(th);
        }

        @Override // p074h3.InterfaceC1362b.a
        public void b(Bitmap bitmap) {
            C1383x.this.b(this.f21755a, bitmap, null, null, null, this.f21756b, this.f21757c);
        }
    }

    public C1383x(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f21738a = applicationContext;
        H hA = I.a();
        this.f21739b = (WallpaperManager) context.getSystemService("wallpaper");
        this.f21740c = hA.f(context);
        this.f21741d = T.a();
        this.f21742e = hA.e(context);
        this.f21743f = I.a().t();
        this.f21744g = I.a().l(applicationContext);
        this.f21745h = hA.k(context);
    }

    public static boolean m(Bitmap bitmap, ByteArrayOutputStream byteArrayOutputStream) {
        return bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(x xVar, InputStream inputStream, int i10, U.a aVar) {
        new d(xVar, inputStream, i10, aVar).execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(x xVar, Bitmap bitmap, Bitmap bitmap2, e eVar, WallpaperColors wallpaperColors, int i10, U.a aVar) {
        new d(xVar, bitmap, bitmap2, eVar, wallpaperColors, i10, aVar).execute(new Void[0]);
    }

    @Override // p074h3.U
    public void a(int i10) {
        WallpaperInfo wallpaperInfo = this.f21739b.getWallpaperInfo();
        x xVar = this.f21746i;
        WallpaperInfo wallpaperInfoQ = xVar != null ? xVar.q() : null;
        if (wallpaperInfo == null || wallpaperInfoQ == null || !wallpaperInfo.getServiceName().equals(wallpaperInfoQ.getServiceName())) {
            this.f21746i = null;
        } else {
            x xVar2 = this.f21746i;
            s(xVar2, xVar2.l(), i10);
        }
    }

    @Override // p074h3.U
    public void b(x xVar, Bitmap bitmap, Bitmap bitmap2, e eVar, WallpaperColors wallpaperColors, int i10, U.a aVar) {
        r(xVar, bitmap, bitmap2, eVar, wallpaperColors, i10, aVar);
    }

    @Override // p074h3.U
    public void c(x xVar, com.android.wallpaper.asset.a aVar, Rect rect, float f10, int i10, U.a aVar2) {
        if (rect == null && (aVar instanceof o)) {
            ((o) aVar).E(new a(aVar2, xVar, i10));
        } else {
            if (rect != null) {
                this.f21743f.a(aVar, f10, rect, false, new c(xVar, i10, aVar2));
                return;
            }
            Point pointE = s.a().e(((WindowManager) this.f21738a.getSystemService("window")).getDefaultDisplay());
            aVar.f(pointE.x, pointE.y, new b(aVar2, xVar, i10));
        }
    }

    @Override // p074h3.U
    public void e(x xVar) {
        this.f21746i = xVar;
    }

    public boolean n(int i10, p064g3.o oVar) {
        if (i10 == 0 || i10 == 2) {
            this.f21740c.a();
            this.f21740c.t(oVar);
        }
        if (i10 == 1 || i10 == 2) {
            this.f21740c.w();
            this.f21740c.Q(oVar);
        }
        return true;
    }

    public int o(Bitmap bitmap, boolean z9, int i10) {
        try {
            return this.f21739b.setBitmap(bitmap, null, z9, i10);
        } catch (IOException unused) {
            Log.e("WallpaperPersister", "unable to set wallpaper");
            return 0;
        }
    }

    public int p(Bitmap bitmap, boolean z9, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (m(bitmap, byteArrayOutputStream)) {
            return t(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), z9, i10);
        }
        Log.e("WallpaperPersister", "unable to compress wallpaper");
        return o(bitmap, z9, i10);
    }

    public void s(x xVar, String str, int i10) {
        WallpaperInfo wallpaperInfoQ = xVar.q();
        boolean z9 = false;
        if (G6.e.i(xVar) && xVar.t() && !xVar.s()) {
            z9 = true;
        }
        if (i10 == 0 || i10 == 2) {
            this.f21740c.a();
            this.f21740c.P(z9);
            this.f21740c.i0(wallpaperInfoQ.getServiceName());
            this.f21740c.F(str);
            this.f21740c.K(xVar.g(this.f21738a));
            this.f21740c.o(1);
            this.f21740c.d();
        }
        if (i10 == 1 || i10 == 2) {
            this.f21740c.w();
            this.f21740c.c0(z9);
            this.f21740c.Z(wallpaperInfoQ.getServiceName());
            this.f21740c.q(str);
            this.f21740c.e(xVar.g(this.f21738a));
        }
    }

    public int t(InputStream inputStream, boolean z9, int i10) {
        try {
            return this.f21739b.setStream(inputStream, null, z9, i10);
        } catch (IOException unused) {
            Log.e("WallpaperPersister", "unable to write stream to wallpaper manager");
            return 0;
        }
    }

    /* JADX INFO: renamed from: h3.x$d */
    private class d extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f21759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f21760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final U.a f21761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Bitmap f21762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f21763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private InputStream f21764f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Point f21765g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Point f21766h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private WallpaperColors f21767i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private e f21768j;

        d(x xVar, Bitmap bitmap, Bitmap bitmap2, e eVar, WallpaperColors wallpaperColors, int i10, U.a aVar) {
            this.f21759a = xVar;
            this.f21763e = bitmap;
            this.f21762d = bitmap2;
            this.f21760b = i10;
            this.f21761c = aVar;
            this.f21767i = wallpaperColors;
            this.f21768j = eVar;
        }

        private void a() {
            C1383x.this.f21740c.O(C1383x.this.f21740c.x());
            C1383x.this.f21740c.l(C1383x.this.f21740c.f());
            C1383x.this.f21740c.e(C1383x.this.f21740c.U());
            C1383x.this.f21740c.k0(C1383x.this.f21739b.getWallpaperId(2));
            C1383x.this.f21740c.c0(C1383x.this.f21740c.k());
        }

        private List c(g gVar, int i10) throws JSONException {
            String str;
            ArrayList arrayList = new ArrayList(2);
            g.a aVar = g.f648e;
            g gVarA = aVar.a(C1383x.this.f21740c.X());
            String strD = gVarA == null ? null : gVarA.d();
            g gVarA2 = aVar.a(C1383x.this.f21740c.g());
            String strD2 = gVarA2 != null ? gVarA2.d() : null;
            StringBuilder sb = new StringBuilder("setImageWallpaperMetadata-effect-info: ");
            sb.append("lastHome=");
            sb.append(strD);
            sb.append(",");
            sb.append("lastLock=");
            sb.append(strD2);
            sb.append(",");
            if (gVar != null) {
                String strD3 = gVar.d();
                sb.append("newImage=");
                sb.append(strD3);
                sb.append(",");
                if (i10 != 0) {
                    if (i10 == 1) {
                        sb.append("destination=");
                        sb.append("LOCK");
                        sb.append(",");
                        str = strD3;
                        strD3 = strD;
                    } else if (i10 != 2) {
                        strD3 = strD;
                    } else {
                        sb.append("destination=");
                        sb.append("BOTH");
                        sb.append(",");
                        str = strD3;
                    }
                    if (!Objects.equals(strD, strD3) && !Objects.equals(strD, str)) {
                        arrayList.add(strD);
                        sb.append("delete=");
                        sb.append("homeImage=");
                        sb.append(strD);
                        sb.append(",");
                    }
                    if (!Objects.equals(strD2, strD3) && !Objects.equals(strD2, str)) {
                        arrayList.add(strD2);
                        sb.append("delete=");
                        sb.append("lockImage=");
                        sb.append(strD2);
                        sb.append(",");
                    }
                } else {
                    sb.append("destination=");
                    sb.append("HOME");
                    sb.append(",");
                }
                str = strD2;
                if (!Objects.equals(strD, strD3)) {
                    arrayList.add(strD);
                    sb.append("delete=");
                    sb.append("homeImage=");
                    sb.append(strD);
                    sb.append(",");
                }
                if (!Objects.equals(strD2, strD3)) {
                    arrayList.add(strD2);
                    sb.append("delete=");
                    sb.append("lockImage=");
                    sb.append(strD2);
                    sb.append(",");
                }
            } else if (i10 == 0) {
                arrayList.add(strD);
                sb.append("destination=");
                sb.append("HOME");
                sb.append(",");
                sb.append("delete=");
                sb.append("homeImage=");
                sb.append(strD);
                sb.append(",");
            } else if (i10 == 1) {
                arrayList.add(strD2);
                sb.append("destination=");
                sb.append("LOCK");
                sb.append(",");
                sb.append("delete=");
                sb.append("lockImage=");
                sb.append(strD2);
                sb.append(",");
            } else if (i10 == 2) {
                arrayList.add(strD);
                arrayList.add(strD2);
                sb.append("destination=");
                sb.append("BOTH");
                sb.append(",");
                sb.append("delete=");
                sb.append("homeImage=");
                sb.append(strD);
                sb.append(",");
                sb.append("delete=");
                sb.append("lockImage=");
                sb.append(strD2);
                sb.append(",");
            }
            arrayList.removeIf(new Predicate() { // from class: h3.y
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return TextUtils.isEmpty((String) obj);
                }
            });
            com.nothing.wallpaper.common.log.c.d("WallpaperPersister", sb.toString());
            return arrayList;
        }

        private void e(int i10, int i11, long j9, WallpaperColors wallpaperColors, g gVar, boolean z9) {
            String strC = gVar != null ? gVar.c() : null;
            C1383x c1383x = C1383x.this;
            c1383x.n(i10, new p064g3.o(this.f21759a.e(c1383x.f21738a), this.f21759a.c(C1383x.this.f21738a), this.f21759a.g(C1383x.this.f21738a), Long.valueOf(j9), i11, this.f21759a.r(), strC, z9));
            String strValueOf = TextUtils.isEmpty(this.f21759a.r()) ? String.valueOf(j9) : this.f21759a.r();
            if (i10 == 0 || i10 == 2) {
                C1383x.this.f21740c.s(1, strValueOf, this.f21759a, this.f21763e, wallpaperColors);
                C1383x.this.f21740c.o(1);
                C1383x.this.f21740c.d();
            }
            if (i10 == 1 || i10 == 2) {
                C1383x.this.f21740c.s(2, strValueOf, this.f21759a, this.f21763e, wallpaperColors);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:52:0x0122  */
        /* JADX WARN: Code duplicated, block: B:53:0x0124  */
        /* JADX WARN: Code duplicated, block: B:57:0x0147  */
        /* JADX WARN: Code duplicated, block: B:60:0x015b  */
        /* JADX WARN: Code duplicated, block: B:63:0x0162  */
        /* JADX WARN: Code duplicated, block: B:68:0x017d  */
        /* JADX WARN: Code duplicated, block: B:72:0x01a0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:73:0x01a2  */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) throws JSONException {
            int i10;
            int i11;
            int iT;
            g gVarK;
            List listC;
            int i12;
            int iD;
            WallpaperColors wallpaperColorsFromBitmap;
            List listE;
            String str;
            int iC;
            int i13 = this.f21760b;
            if (i13 == 0) {
                i10 = 1;
            } else {
                i10 = i13 == 1 ? 2 : 3;
            }
            boolean zB = C1383x.this.f21744g.b();
            boolean z9 = false;
            boolean z10 = this.f21759a.f() == 1;
            Bitmap bitmap = this.f21763e;
            if (bitmap == null) {
                InputStream inputStream = this.f21764f;
                if (inputStream != null) {
                    iT = C1383x.this.t(inputStream, z10, i10);
                } else {
                    Log.e("WallpaperPersister", "Both the wallpaper bitmap and input stream are null so we're unable to set any kind of wallpaper here.");
                    i11 = 0;
                }
                Log.d("WallpaperPersister", "Set wallpaper id:" + i11 + " depth:" + this.f21762d + " destination:" + this.f21760b);
                if (this.f21760b != 0) {
                    if (this.f21762d != null || i11 == 0) {
                        iC = 0;
                    } else {
                        iC = p137n6.e.c(C1383x.this.f21739b, this.f21762d, z10, C1383x.this.f21738a.getUserId(), i10, i11);
                    }
                    if (this.f21762d != null && i11 != 0 && iC != 0) {
                        z9 = true;
                    }
                    Log.d("WallpaperPersister", "set depth wallpaper state:" + z9 + " depth wallpaper id:" + iC);
                    j.Q0(C1383x.this.f21738a, z9);
                }
                gVarK = this.f21759a.k();
                if (i11 > 0) {
                    if (gVarK != null) {
                        gVarK.a();
                        com.nothing.wallpaper.common.log.c.f("WallpaperPersister", "set wallpaper to system failed, do effectInfo failed.");
                    }
                    return Boolean.FALSE;
                }
                listC = c(gVarK, this.f21760b);
                if (this.f21760b == 0 && C1383x.this.f21740c.L() == 2 && !zB) {
                    a();
                }
                C1383x.this.f21739b.forgetLoadedWallpaper();
                i12 = this.f21760b;
                if (i12 == 2) {
                    iD = 1;
                } else {
                    iD = U.d(i12);
                }
                Bitmap bitmap2 = ((BitmapDrawable) C1383x.this.f21739b.getDrawable(iD)).getBitmap();
                this.f21763e = bitmap2;
                int i14 = this.f21760b;
                long jD = f.d(bitmap2);
                wallpaperColorsFromBitmap = this.f21767i;
                if (wallpaperColorsFromBitmap == null) {
                    wallpaperColorsFromBitmap = WallpaperColors.fromBitmap(this.f21763e);
                }
                e(i14, i11, jD, wallpaperColorsFromBitmap, gVarK, this.f21759a.t());
                if (gVarK != null) {
                    gVarK.b(listC);
                }
                if (this.f21760b != 1) {
                    listE = this.f21759a.e(C1383x.this.f21738a);
                    if (listE != null || listE.isEmpty()) {
                        str = "null";
                    } else {
                        str = (String) listE.getFirst();
                    }
                    Settings.System.putString(C1383x.this.f21738a.getContentResolver(), "cur_wallpaper_name", str);
                    Settings.System.putInt(C1383x.this.f21738a.getContentResolver(), "cur_wallpaper_id", i11);
                }
                return Boolean.TRUE;
            }
            Point point = this.f21765g;
            if (point != null) {
                this.f21763e = AbstractC0853c.a(bitmap, point);
            }
            Point point2 = this.f21766h;
            if (point2 != null) {
                this.f21763e = Bitmap.createScaledBitmap(this.f21763e, point2.x, point2.y, true);
            }
            iT = I6.a.b(this.f21768j, C1383x.this, this.f21763e, z10, i10);
            if (I6.a.a(iT)) {
                com.nothing.wallpaper.common.log.c.k("WallpaperPersister", "SetWallpaperTask#doInBackground: quick set with cache successfully");
            } else {
                com.nothing.wallpaper.common.log.c.k("WallpaperPersister", "SetWallpaperTask#doInBackground: go aosp");
                iT = C1383x.this.p(this.f21763e, z10, i10);
            }
            i11 = iT;
            Log.d("WallpaperPersister", "Set wallpaper id:" + i11 + " depth:" + this.f21762d + " destination:" + this.f21760b);
            if (this.f21760b != 0) {
                if (this.f21762d != null) {
                    iC = 0;
                } else {
                    iC = 0;
                }
                if (this.f21762d != null) {
                    z9 = true;
                }
                Log.d("WallpaperPersister", "set depth wallpaper state:" + z9 + " depth wallpaper id:" + iC);
                j.Q0(C1383x.this.f21738a, z9);
            }
            gVarK = this.f21759a.k();
            if (i11 > 0) {
                if (gVarK != null) {
                    gVarK.a();
                    com.nothing.wallpaper.common.log.c.f("WallpaperPersister", "set wallpaper to system failed, do effectInfo failed.");
                }
                return Boolean.FALSE;
            }
            listC = c(gVarK, this.f21760b);
            if (this.f21760b == 0) {
                a();
            }
            C1383x.this.f21739b.forgetLoadedWallpaper();
            i12 = this.f21760b;
            if (i12 == 2) {
                iD = 1;
            } else {
                iD = U.d(i12);
            }
            Bitmap bitmap3 = ((BitmapDrawable) C1383x.this.f21739b.getDrawable(iD)).getBitmap();
            this.f21763e = bitmap3;
            int i15 = this.f21760b;
            long jD2 = f.d(bitmap3);
            wallpaperColorsFromBitmap = this.f21767i;
            if (wallpaperColorsFromBitmap == null) {
                wallpaperColorsFromBitmap = WallpaperColors.fromBitmap(this.f21763e);
            }
            e(i15, i11, jD2, wallpaperColorsFromBitmap, gVarK, this.f21759a.t());
            if (gVarK != null) {
                gVarK.b(listC);
            }
            if (this.f21760b != 1) {
                listE = this.f21759a.e(C1383x.this.f21738a);
                if (listE != null) {
                    str = "null";
                } else {
                    str = "null";
                }
                Settings.System.putString(C1383x.this.f21738a.getContentResolver(), "cur_wallpaper_name", str);
                Settings.System.putInt(C1383x.this.f21738a.getContentResolver(), "cur_wallpaper_id", i11);
            }
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            InputStream inputStream = this.f21764f;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    Log.e("WallpaperPersister", "Failed to close input stream " + e10);
                    this.f21761c.a(e10);
                    return;
                }
            }
            if (!bool.booleanValue()) {
                this.f21761c.a(null);
            } else {
                this.f21761c.b(this.f21759a, this.f21760b);
                C1383x.this.f21741d.b();
            }
        }

        d(x xVar, InputStream inputStream, int i10, U.a aVar) {
            this.f21759a = xVar;
            this.f21764f = inputStream;
            this.f21760b = i10;
            this.f21761c = aVar;
        }
    }
}
