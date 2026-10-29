package p232x1;

import L2.p;
import android.app.WallpaperColors;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.nothing.wallpaper.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c implements p222w1.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Set f29690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile c f29691m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f29692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G1.a f29693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f29694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ContentResolver f29695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f29696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f29697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f29698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WallpaperColors f29699h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WallpaperColors f29700i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f29701j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f29702k;

    class a extends ContentObserver {
        a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z9, Uri uri) {
            super.onChange(z9, uri);
            if (TextUtils.equals(uri.getLastPathSegment(), "theme_customization_overlay_packages")) {
                Log.i("ColorCustomizationManager", "Resetting " + c.this.f29696e + ", " + c.this.f29698g + ", " + c.this.f29697f + " to null");
                c.this.f29696e = null;
                c.this.f29698g = null;
                c.this.f29697f = null;
                c.f(c.this);
            }
        }
    }

    public interface b {
    }

    static {
        HashSet hashSet = new HashSet();
        f29690l = hashSet;
        hashSet.add("android.theme.customization.system_palette");
        hashSet.add("android.theme.customization.accent_color");
        hashSet.add("android.theme.customization.color_source");
        hashSet.add("android.theme.customization.theme_style");
        hashSet.add("android.theme.customization.color_index");
    }

    c(i iVar, ContentResolver contentResolver, G1.a aVar, ExecutorService executorService) {
        this.f29692a = iVar;
        this.f29695d = contentResolver;
        this.f29694c = executorService;
        contentResolver.registerContentObserver(Settings.Secure.CONTENT_URI, true, new a(null));
        this.f29693b = aVar;
    }

    public static /* synthetic */ void b(boolean z9, p222w1.a.InterfaceC0718a interfaceC0718a) {
        if (z9) {
            interfaceC0718a.b();
        } else {
            interfaceC0718a.a(null);
        }
    }

    static /* bridge */ /* synthetic */ b f(c cVar) {
        cVar.getClass();
        return null;
    }

    private void k(final g gVar, final p222w1.a.InterfaceC0718a interfaceC0718a) {
        this.f29694c.submit(new Runnable() { // from class: x1.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f29685q.u(gVar, interfaceC0718a);
            }
        });
    }

    public static c q(Context context, G1.a aVar) {
        return r(context, aVar, Executors.newSingleThreadExecutor());
    }

    static c r(Context context, G1.a aVar, ExecutorService executorService) {
        if (f29691m == null) {
            synchronized (c.class) {
                try {
                    if (f29691m == null) {
                        Context applicationContext = context.getApplicationContext();
                        f29691m = new c(new j(applicationContext, applicationContext.getString(R.string.themes_stub_package)), applicationContext.getContentResolver(), aVar, executorService);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f29691m;
    }

    public static boolean t(Context context) {
        int i10;
        Map mapV = v(Settings.Secure.getString(context.getContentResolver(), "theme_customization_overlay_packages"));
        String str = (String) mapV.remove("android.theme.customization.theme_style");
        try {
            i10 = Integer.parseInt((String) mapV.remove("android.theme.customization.color_index"));
        } catch (NumberFormatException e10) {
            com.nothing.wallpaper.common.log.c.f("ColorCustomizationManager", "parseSettings, exception:" + e10.getMessage());
            i10 = -1;
        }
        return p.a(7).equals(str) && i10 == 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(g gVar, final p222w1.a.InterfaceC0718a interfaceC0718a) {
        JSONObject jSONObject;
        String strS = s();
        if (TextUtils.isEmpty(strS)) {
            strS = "{}";
        }
        final boolean z9 = false;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(strS);
            try {
                JSONObject jSONObjectC = gVar.c(true);
                Iterator it = f29690l.iterator();
                while (it.hasNext()) {
                    jSONObject.remove((String) it.next());
                }
                Iterator<String> itKeys = jSONObjectC.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectC.get(next));
                }
                jSONObject.put("android.theme.customization.color_source", gVar.e());
                jSONObject.put("android.theme.customization.color_index", String.valueOf(gVar.b()));
                jSONObject.put("android.theme.customization.theme_style", p.a(gVar.f()));
                if ("preset".equals(gVar.e())) {
                    jSONObject.remove("android.theme.customization.color_both");
                } else {
                    WallpaperColors wallpaperColors = this.f29700i;
                    jSONObject.put("android.theme.customization.color_both", wallpaperColors == null || wallpaperColors.equals(this.f29699h) ? "1" : "0");
                }
            } catch (JSONException e10) {
                e = e10;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                jSONObject = jSONObject2;
            }
        } catch (JSONException e11) {
            e = e11;
        }
        if (jSONObject != null && Settings.Secure.putString(this.f29695d, "theme_customization_overlay_packages", jSONObject.toString())) {
            z9 = true;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: x1.b
            @Override // java.lang.Runnable
            public final void run() {
                c.b(z9, interfaceC0718a);
            }
        });
    }

    private static Map v(String str) {
        HashMap map = new HashMap();
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArrayNames = jSONObject.names();
                if (jSONArrayNames != null) {
                    for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
                        String string = jSONArrayNames.getString(i10);
                        if (f29690l.contains(string)) {
                            try {
                                map.put(string, jSONObject.getString(string));
                            } catch (JSONException e10) {
                                Log.e("ColorCustomizationManager", "parseColorOverlays: " + e10.getLocalizedMessage(), e10);
                            }
                        }
                    }
                }
            } catch (JSONException e11) {
                Log.e("ColorCustomizationManager", "parseColorOverlays: " + e11.getLocalizedMessage(), e11);
            }
        }
        return map;
    }

    public void j(g gVar, p222w1.a.InterfaceC0718a interfaceC0718a) {
        k(gVar, interfaceC0718a);
    }

    public void l(w1.a.b bVar, boolean z9) {
        WallpaperColors wallpaperColors = this.f29700i;
        if (wallpaperColors != null && wallpaperColors.equals(this.f29699h)) {
            wallpaperColors = null;
        }
        this.f29692a.a(bVar, z9, this.f29699h, wallpaperColors);
    }

    public String m() {
        if (this.f29697f == null) {
            w(s());
        }
        return this.f29697f;
    }

    public int n() {
        if (this.f29701j == -1) {
            w(s());
        }
        return this.f29701j;
    }

    public Map o() {
        if (this.f29696e == null) {
            w(s());
        }
        return this.f29696e;
    }

    public String p() {
        if (this.f29698g == null) {
            w(s());
        }
        return this.f29698g;
    }

    public String s() {
        return Settings.Secure.getString(this.f29695d, "theme_customization_overlay_packages");
    }

    void w(String str) {
        Map mapV = v(str);
        this.f29697f = (String) mapV.remove("android.theme.customization.color_source");
        this.f29698g = (String) mapV.remove("android.theme.customization.theme_style");
        this.f29702k = (String) mapV.remove("android.theme.customization.theme_style");
        try {
            this.f29701j = Integer.parseInt((String) mapV.remove("android.theme.customization.color_index"));
        } catch (NumberFormatException e10) {
            com.nothing.wallpaper.common.log.c.f("ColorCustomizationManager", "parseSettings, exception:" + e10.getMessage());
            this.f29701j = 0;
        }
        this.f29696e = mapV;
    }

    public void x(WallpaperColors wallpaperColors, WallpaperColors wallpaperColors2) {
        this.f29699h = wallpaperColors;
        this.f29700i = wallpaperColors2;
    }
}
