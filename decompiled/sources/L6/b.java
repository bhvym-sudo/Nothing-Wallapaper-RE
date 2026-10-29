package L6;

import F8.AbstractC0816i;
import F8.L;
import O5.g;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import com.google.gson.Gson;
import com.nothing.onlineconfig.ConfigGrabber;
import com.nothing.onlineconfig.ConfigObserver;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.common.log.c;
import com.nothing.wallpaper.onlineconfig.DepthConfig;
import com.nothing.wallpaper.onlineconfig.WallpaperOnlineConfig;
import com.nothing.wallpaper.onlineconfig.WallpaperOnlineConfigBean;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import org.json.JSONArray;
import p079h8.A;
import p079h8.q;
import p079h8.r;
import p089i8.AbstractC1444s;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f4805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile WallpaperOnlineConfig f4806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ConfigObserver f4807d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f4804a = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConfigObserver.ConfigUpdater f4808e = new ConfigObserver.ConfigUpdater() { // from class: L6.a
        public final void updateConfig(JSONArray jSONArray) {
            b.l(jSONArray);
        }
    };

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4809q;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f4809q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            b.f4804a.f();
            return A.f21846a;
        }
    }

    /* JADX INFO: renamed from: L6.b$b, reason: collision with other inner class name */
    static final class C0164b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4810q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ JSONArray f4811r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0164b(JSONArray jSONArray, e eVar) {
            super(2, eVar);
            this.f4811r = jSONArray;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C0164b(this.f4811r, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((C0164b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f4810q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            b bVar = b.f4804a;
            JSONArray jSONArray = this.f4811r;
            n.e(jSONArray);
            bVar.k(jSONArray);
            return A.f21846a;
        }
    }

    private b() {
    }

    private final WallpaperOnlineConfig e(Context context) {
        List<WallpaperOnlineConfig> content;
        try {
            WallpaperOnlineConfigBean wallpaperOnlineConfigBeanJ = j(new InputStreamReader(context.getResources().openRawResource(R.raw.wallpaper_online_config)));
            if (wallpaperOnlineConfigBeanJ == null || (content = wallpaperOnlineConfigBeanJ.getContent()) == null) {
                return null;
            }
            return (WallpaperOnlineConfig) AbstractC1444s.U(content);
        } catch (Resources.NotFoundException e10) {
            c.f("RemoteConfigController", "getLocaleConfigs -> NotFoundException -> " + e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        Object objB;
        DepthConfig depthConfig;
        Context context = f4805b;
        A a10 = null;
        if (context == null) {
            n.r("appContext");
            context = null;
        }
        f4806c = e(context);
        WallpaperOnlineConfig wallpaperOnlineConfig = f4806c;
        Integer version = wallpaperOnlineConfig != null ? wallpaperOnlineConfig.getVersion() : null;
        WallpaperOnlineConfig wallpaperOnlineConfig2 = f4806c;
        c.d("RemoteConfigController", "getRemoteConfig local version = " + version + ", depthOverlapRate = " + ((wallpaperOnlineConfig2 == null || (depthConfig = wallpaperOnlineConfig2.getDepthConfig()) == null) ? null : depthConfig.getDepthOverlapRate()));
        try {
            q.a aVar = q.f21862r;
            Context context2 = f4805b;
            if (context2 == null) {
                n.r("appContext");
                context2 = null;
            }
            JSONArray jSONArrayGrabConfig = new ConfigGrabber(context2, "wallpaper_config").grabConfig();
            if (jSONArrayGrabConfig != null) {
                k(jSONArrayGrabConfig);
                a10 = A.f21846a;
            }
            objB = q.b(a10);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            c.f("RemoteConfigController", "getRemoteConfig remote grab fail: " + thD);
        }
    }

    private final int g(WallpaperOnlineConfig wallpaperOnlineConfig) {
        Integer version;
        if (wallpaperOnlineConfig == null || (version = wallpaperOnlineConfig.getVersion()) == null) {
            return -1;
        }
        return version.intValue();
    }

    private final WallpaperOnlineConfigBean i(JSONArray jSONArray) {
        try {
            return (WallpaperOnlineConfigBean) new Gson().fromJson("{\"content\": " + jSONArray + "}", WallpaperOnlineConfigBean.class);
        } catch (Exception e10) {
            c.f("RemoteConfigController", "parseConfigFromJsonArray -> Exception -> " + e10.getMessage());
            return null;
        }
    }

    private final WallpaperOnlineConfigBean j(Reader reader) {
        try {
            WallpaperOnlineConfigBean wallpaperOnlineConfigBean = (WallpaperOnlineConfigBean) new Gson().fromJson(reader, WallpaperOnlineConfigBean.class);
            c.d("RemoteConfigController", "parseConfigFromReader configs = " + wallpaperOnlineConfigBean);
            try {
                return wallpaperOnlineConfigBean;
            } catch (IOException e10) {
                return wallpaperOnlineConfigBean;
            }
        } catch (Exception e11) {
            c.f("RemoteConfigController", "parseConfigFromReader Exception: " + e11.getMessage());
            try {
                return null;
            } catch (IOException e12) {
                return null;
            }
        } finally {
            try {
                reader.close();
            } catch (IOException e13) {
                c.f("RemoteConfigController", "parseConfigFromReader IOException:  " + e13.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(JSONArray jSONArray) {
        List<WallpaperOnlineConfig> content;
        if (jSONArray == null || jSONArray.length() <= 0) {
            c.d("RemoteConfigController", "wallpaperUpdater: jsonArray is null or empty.");
            return;
        }
        WallpaperOnlineConfigBean wallpaperOnlineConfigBeanI = i(jSONArray);
        WallpaperOnlineConfig wallpaperOnlineConfig = (wallpaperOnlineConfigBeanI == null || (content = wallpaperOnlineConfigBeanI.getContent()) == null) ? null : (WallpaperOnlineConfig) AbstractC1444s.U(content);
        c.d("RemoteConfigController", "updateOnlineConfig jsonArray = " + jSONArray + " newConfig = " + wallpaperOnlineConfig);
        if (g(wallpaperOnlineConfig) <= g(f4806c)) {
            c.d("RemoteConfigController", "updateOnlineConfig: keep current config");
            return;
        }
        f4806c = wallpaperOnlineConfig;
        c.d("RemoteConfigController", "updateOnlineConfig: use remote config, version=" + (wallpaperOnlineConfig != null ? wallpaperOnlineConfig.getVersion() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(JSONArray jSONArray) {
        AbstractC0816i.d(g.j(), null, null, new C0164b(jSONArray, null), 3, null);
    }

    public final float d() {
        DepthConfig depthConfig;
        Float depthOverlapRate;
        WallpaperOnlineConfig wallpaperOnlineConfig = f4806c;
        if (wallpaperOnlineConfig == null || (depthConfig = wallpaperOnlineConfig.getDepthConfig()) == null || (depthOverlapRate = depthConfig.getDepthOverlapRate()) == null) {
            return 0.25f;
        }
        return depthOverlapRate.floatValue();
    }

    public final void h(Context context) {
        Object objB;
        n.h(context, "context");
        f4805b = context.getApplicationContext();
        try {
            q.a aVar = q.f21862r;
            Context context2 = f4805b;
            if (context2 == null) {
                n.r("appContext");
                context2 = null;
            }
            Context context3 = f4805b;
            if (context3 == null) {
                n.r("appContext");
                context3 = null;
            }
            ConfigObserver configObserver = new ConfigObserver(context2, new Handler(context3.getMainLooper()), f4808e, "wallpaper_config");
            configObserver.register();
            f4807d = configObserver;
            objB = q.b(A.f21846a);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            c.f("RemoteConfigController", "init failed: " + thD.getMessage());
        }
        AbstractC0816i.d(g.j(), null, null, new a(null), 3, null);
    }
}
