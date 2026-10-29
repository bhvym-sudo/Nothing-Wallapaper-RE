package p074h3;

import E8.g;
import E8.i;
import G6.h;
import android.app.WallpaperColors;
import android.app.backup.BackupManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import com.nothing.wallpaper.common.log.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONException;
import p064g3.k;
import p064g3.o;
import p064g3.x;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public abstract class A implements W {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f21604g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f21605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f21606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SharedPreferences f21607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BackupManager f21608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f21609f;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public A(Context context) {
        n.h(context, "context");
        this.f21605b = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("wallpaper", 0);
        n.g(sharedPreferences, "getSharedPreferences(...)");
        this.f21606c = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("wallpaper-nobackup", 0);
        n.g(sharedPreferences2, "getSharedPreferences(...)");
        this.f21607d = sharedPreferences2;
        this.f21608e = new BackupManager(context);
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: h3.z
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str) {
                A.x0(this.f21770a, sharedPreferences3, str);
            }
        };
        this.f21609f = onSharedPreferenceChangeListener;
        if (sharedPreferences2.getAll().isEmpty()) {
            Map<String, ?> all = sharedPreferences.getAll();
            n.g(all, "getAll(...)");
            if (!all.isEmpty()) {
                z0();
            }
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private final String A0(WallpaperColors wallpaperColors) {
        ArrayList arrayList = new ArrayList(4);
        Color primaryColor = wallpaperColors.getPrimaryColor();
        n.g(primaryColor, "getPrimaryColor(...)");
        arrayList.add(String.valueOf(primaryColor.toArgb()));
        Color secondaryColor = wallpaperColors.getSecondaryColor();
        if (secondaryColor != null) {
            arrayList.add(String.valueOf(secondaryColor.toArgb()));
        } else {
            arrayList.add("");
        }
        Color tertiaryColor = wallpaperColors.getTertiaryColor();
        if (tertiaryColor != null) {
            arrayList.add(String.valueOf(tertiaryColor.toArgb()));
        } else {
            arrayList.add("");
        }
        arrayList.add(String.valueOf(wallpaperColors.getColorHints()));
        return TextUtils.join(",", arrayList);
    }

    private final int o0() {
        String str = new SimpleDateFormat("yyyyMMdd", Locale.US).format(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime());
        n.g(str, "format(...)");
        return Integer.parseInt(str);
    }

    private final void t0(int i10) {
        this.f21607d.edit().putInt("app_launch_count", i10).apply();
    }

    private final void u0(int i10) {
        this.f21607d.edit().putInt("first_launch_date_since_setup", i10).apply();
    }

    private final void v0() {
        if (q0() == 0) {
            w0(o0());
        }
    }

    private final void w0(int i10) {
        this.f21607d.edit().putInt("first_wallpaper_apply_date_since_setup", i10).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(A a10, SharedPreferences sharedPreferences, String str) {
        a10.f21608e.dataChanged();
    }

    private final WallpaperColors y0(String str) {
        List listL;
        if (str == null || n.d(str, "")) {
            return null;
        }
        List listC = new g(",").c(str, 0);
        if (!listC.isEmpty()) {
            ListIterator listIterator = listC.listIterator(listC.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listL = AbstractC1444s.l();
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    listL = AbstractC1444s.o0(listC, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            listL = AbstractC1444s.l();
            break;
        }
        String[] strArr = (String[]) listL.toArray(new String[0]);
        Color colorValueOf = Color.valueOf(Integer.parseInt(strArr[0]));
        n.g(colorValueOf, "valueOf(...)");
        return new WallpaperColors(colorValueOf, strArr[1].length() > 0 ? Color.valueOf(Integer.parseInt(strArr[1])) : null, strArr[2].length() > 0 ? Color.valueOf(Integer.parseInt(strArr[2])) : null, Integer.parseInt(strArr[3]));
    }

    private final void z0() {
        SharedPreferences.Editor editorEdit = this.f21607d.edit();
        if (this.f21606c.contains("home_wallpaper_base_image_url")) {
            editorEdit.putString("home_wallpaper_base_image_url", this.f21606c.getString("home_wallpaper_base_image_url", null));
        }
        if (this.f21606c.contains("home_wallpaper_id")) {
            editorEdit.putInt("home_wallpaper_id", this.f21606c.getInt("home_wallpaper_id", 0));
        }
        if (this.f21606c.contains("home_wallpaper_remote_id")) {
            editorEdit.putString("home_wallpaper_remote_id", this.f21606c.getString("home_wallpaper_remote_id", null));
        }
        if (this.f21606c.contains("lock_wallpaper_id")) {
            editorEdit.putInt("lock_wallpaper_id", this.f21606c.getInt("lock_wallpaper_id", 0));
        }
        if (this.f21606c.contains("daily_rotation_timestamps")) {
            editorEdit.putString("daily_rotation_timestamps", this.f21606c.getString("daily_rotation_timestamps", null));
        }
        if (this.f21606c.contains("daily_wallpaper_enabled_timestamp")) {
            editorEdit.putLong("daily_wallpaper_enabled_timestamp", this.f21606c.getLong("daily_wallpaper_enabled_timestamp", -1L));
        }
        if (this.f21606c.contains("last_daily_log_timestamp")) {
            editorEdit.putLong("last_daily_log_timestamp", this.f21606c.getLong("last_daily_log_timestamp", 0L));
        }
        if (this.f21606c.contains("last_app_active_timestamp")) {
            editorEdit.putLong("last_app_active_timestamp", this.f21606c.getLong("last_app_active_timestamp", 0L));
        }
        if (this.f21606c.contains("last_rotation_status")) {
            editorEdit.putInt("last_rotation_status", this.f21606c.getInt("last_rotation_status", -1));
        }
        if (this.f21606c.contains("last_rotation_status_timestamp")) {
            editorEdit.putLong("last_rotation_status_timestamp", this.f21606c.getLong("last_rotation_status_timestamp", 0L));
        }
        if (this.f21606c.contains("last_sync_timestamp")) {
            editorEdit.putLong("last_sync_timestamp", this.f21606c.getLong("last_sync_timestamp", 0L));
        }
        if (this.f21606c.contains("pending_wallpaper_set_status")) {
            editorEdit.putInt("pending_wallpaper_set_status", this.f21606c.getInt("pending_wallpaper_set_status", 0));
        }
        if (this.f21606c.contains("pending_daily_wallpaper_update_status")) {
            editorEdit.putInt("pending_daily_wallpaper_update_status", this.f21606c.getInt("pending_daily_wallpaper_update_status", 0));
        }
        if (this.f21606c.contains("num_days_daily_rotation_failed")) {
            editorEdit.putInt("num_days_daily_rotation_failed", this.f21606c.getInt("num_days_daily_rotation_failed", 0));
        }
        if (this.f21606c.contains("num_days_daily_rotation_not_attempted")) {
            editorEdit.putInt("num_days_daily_rotation_not_attempted", this.f21606c.getInt("num_days_daily_rotation_not_attempted", 0));
        }
        if (this.f21606c.contains("home_wallpaper_service_name")) {
            editorEdit.putString("home_wallpaper_service_name", this.f21606c.getString("home_wallpaper_service_name", null));
        }
        editorEdit.apply();
    }

    @Override // p074h3.W
    public String A() {
        return this.f21607d.getString("home_wallpaper_service_name", null);
    }

    @Override // p074h3.W
    public void B() {
        SharedPreferences.Editor editorEdit = this.f21607d.edit();
        editorEdit.remove("home_live_effect_info");
        editorEdit.remove("home_live_wallpaper_colors");
        editorEdit.remove("lock_live_effect_info");
        editorEdit.remove("lock_live_wallpaper_colors");
        editorEdit.remove("blur_wallpaper_attribution_line_1");
        editorEdit.remove("blur_wallpaper_attribution_line_2");
        editorEdit.remove("blur_wallpaper_attribution_line_3");
        editorEdit.remove("blur_wallpaper_action_url");
        editorEdit.remove("blur_wallpaper_collection_id");
        editorEdit.remove("blur_wallpaper_id");
        editorEdit.apply();
    }

    @Override // p074h3.W
    public String C() {
        return this.f21607d.getString("lock_wallpaper_service_name", null);
    }

    @Override // p074h3.W
    public long D() {
        return this.f21606c.getLong("lock_wallpaper_hash_code", 0L);
    }

    @Override // p074h3.W
    public String E() {
        return this.f21606c.getString("lock_wallpaper_collection_id", null);
    }

    @Override // p074h3.W
    public void F(String str) {
        this.f21607d.edit().putString("home_wallpaper_effects", str).apply();
    }

    @Override // p074h3.W
    public List G() {
        return AbstractC1444s.n(this.f21606c.getString("lock_wallpaper_attribution_line_1", null), this.f21606c.getString("lock_wallpaper_attribution_line_2", null), this.f21606c.getString("lock_wallpaper_attribution_line_3", null));
    }

    @Override // p074h3.W
    public String H() {
        return this.f21607d.getString("blur_wallpaper_collection_id", null);
    }

    @Override // p074h3.W
    public void I(int i10) {
        this.f21607d.edit().putInt("home_wallpaper_id", i10).apply();
    }

    @Override // p074h3.W
    public String J() {
        return this.f21607d.getString("blur_wallpaper_id", null);
    }

    @Override // p074h3.W
    public void K(String str) {
        this.f21606c.edit().putString("home_wallpaper_collection_id", str).apply();
    }

    @Override // p074h3.W
    public int L() {
        return this.f21606c.getInt("wallpaper_presentation_mode", 1);
    }

    @Override // p074h3.W
    public WallpaperColors M() {
        String string = this.f21607d.getString("home_wallpaper_colors", null);
        if (string == null) {
            return null;
        }
        WallpaperColors wallpaperColorsY0 = y0(string);
        h.i("parse home colors value=" + string, wallpaperColorsY0);
        return wallpaperColorsY0;
    }

    @Override // p074h3.W
    public String N() {
        return this.f21607d.getString("lock_live_effect_info", null);
    }

    @Override // p074h3.W
    public void O(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f21606c.edit();
        int i10 = 0;
        for (Object obj : AbstractC1444s.o0(list, 3)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1444s.t();
            }
            String str = (String) obj;
            if (i10 == 0) {
                editorEdit.putString("lock_wallpaper_attribution_line_1", str);
            } else if (i10 == 1) {
                editorEdit.putString("lock_wallpaper_attribution_line_2", str);
            } else if (i10 == 2) {
                editorEdit.putString("lock_wallpaper_attribution_line_3", str);
            }
            i10 = i11;
        }
        editorEdit.apply();
    }

    @Override // p074h3.W
    public void P(boolean z9) {
        this.f21606c.edit().putBoolean("home_wallpaper_support_depth", z9).apply();
    }

    @Override // p074h3.W
    public void Q(o metadata) {
        n.h(metadata, "metadata");
        SharedPreferences.Editor editorEdit = this.f21606c.edit();
        List listB = metadata.b();
        List list = listB;
        if (list != null && !list.isEmpty()) {
            int i10 = 0;
            for (Object obj : AbstractC1444s.o0(listB, 3)) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC1444s.t();
                }
                String str = (String) obj;
                if (i10 == 0) {
                    editorEdit.putString("lock_wallpaper_attribution_line_1", str);
                } else if (i10 == 1) {
                    editorEdit.putString("lock_wallpaper_attribution_line_2", str);
                } else if (i10 == 2) {
                    editorEdit.putString("lock_wallpaper_attribution_line_3", str);
                }
                i10 = i11;
            }
        }
        editorEdit.putString("lock_wallpaper_action_url", metadata.a());
        editorEdit.putString("lock_wallpaper_collection_id", metadata.c());
        Long lE = metadata.e();
        if (lE != null) {
            editorEdit.putLong("lock_wallpaper_hash_code", lE.longValue());
        }
        editorEdit.putBoolean("lock_wallpaper_support_depth", metadata.h());
        editorEdit.apply();
        SharedPreferences.Editor editorEdit2 = this.f21607d.edit();
        editorEdit2.putInt("lock_wallpaper_id", metadata.f());
        editorEdit2.putString("lock_wallpaper_remote_id", metadata.g());
        if (metadata.d() != null) {
            editorEdit2.putString("lock_effect_info", metadata.d());
        }
        editorEdit2.apply();
    }

    @Override // p074h3.W
    public String R() {
        return this.f21607d.getString("home_live_effect_info", null);
    }

    @Override // p074h3.W
    public List S() {
        return AbstractC1444s.n(this.f21607d.getString("blur_wallpaper_attribution_line_1", null), this.f21607d.getString("blur_wallpaper_attribution_line_2", null), this.f21607d.getString("blur_wallpaper_attribution_line_3", null));
    }

    @Override // p074h3.W
    public void T(String str) {
        this.f21607d.edit().putString("home_effect_info", str).apply();
    }

    @Override // p074h3.W
    public String U() {
        return this.f21606c.getString("home_wallpaper_collection_id", null);
    }

    @Override // p074h3.W
    public WallpaperColors V() {
        String string = this.f21607d.getString("lock_live_wallpaper_colors", null);
        if (string == null) {
            return null;
        }
        WallpaperColors wallpaperColorsY0 = y0(string);
        h.i("parse lock live colors value=" + string, wallpaperColorsY0);
        return wallpaperColorsY0;
    }

    @Override // p074h3.W
    public String W() {
        return this.f21607d.getString("lock_wallpaper_remote_id", null);
    }

    @Override // p074h3.W
    public String X() {
        return this.f21607d.getString("home_effect_info", null);
    }

    @Override // p074h3.W
    public WallpaperColors Y(String storedWallpaperId) {
        n.h(storedWallpaperId, "storedWallpaperId");
        String string = this.f21607d.getString("preview_wallpaper_color_id" + storedWallpaperId, null);
        if (string == null || string.length() == 0) {
            return null;
        }
        List listD0 = i.D0(string, new String[]{","}, false, 0, 6, null);
        Color colorValueOf = Color.valueOf(Integer.parseInt((String) listD0.get(0)));
        n.g(colorValueOf, "valueOf(...)");
        return new WallpaperColors(colorValueOf, listD0.size() >= 2 ? Color.valueOf(Integer.parseInt((String) listD0.get(1))) : null, listD0.size() >= 3 ? Color.valueOf(Integer.parseInt((String) listD0.get(2))) : null, 4);
    }

    @Override // p074h3.W
    public void Z(String str) {
        this.f21607d.edit().putString("lock_wallpaper_service_name", str).apply();
    }

    @Override // p074h3.W
    public void a() {
        this.f21606c.edit().remove("home_wallpaper_attribution_line_1").remove("home_wallpaper_attribution_line_2").remove("home_wallpaper_attribution_line_3").remove("home_wallpaper_action_url").remove("home_wallpaper_collection_id").remove("home_wallpaper_hash_code").remove("home_wallpaper_support_depth").apply();
        this.f21607d.edit().remove("home_wallpaper_service_name").remove("home_wallpaper_effects").remove("home_wallpaper_id").remove("home_wallpaper_remote_id").remove("home_wallpaper_base_image_url").remove("home_effect_info").remove("home_wallpaper_colors").apply();
    }

    @Override // p074h3.W
    public WallpaperColors a0() {
        String string = this.f21607d.getString("lock_wallpaper_colors", null);
        if (string == null) {
            return null;
        }
        WallpaperColors wallpaperColorsY0 = y0(string);
        h.i("parse lock colors value=" + string, wallpaperColorsY0);
        return wallpaperColorsY0;
    }

    @Override // p074h3.W
    public void b(String str) {
        this.f21607d.edit().putString("lock_live_effect_info", str).apply();
    }

    @Override // p074h3.W
    public int b0() {
        return this.f21607d.getInt("lock_wallpaper_id", 0);
    }

    @Override // p074h3.W
    public String c() {
        return this.f21607d.getString("lock_wallpaper_recents_key", W.f21650a.a(W(), D()));
    }

    @Override // p074h3.W
    public void c0(boolean z9) {
        this.f21606c.edit().putBoolean("lock_wallpaper_support_depth", z9).apply();
    }

    @Override // p074h3.W
    public void d() {
        this.f21607d.edit().remove("daily_rotation_timestamps").remove("daily_wallpaper_enabled_timestamp").apply();
    }

    @Override // p074h3.W
    public String d0() {
        return this.f21607d.getString("home_wallpaper_recents_key", W.f21650a.a(i(), r0()));
    }

    @Override // p074h3.W
    public void e(String str) {
        this.f21606c.edit().putString("lock_wallpaper_collection_id", str).apply();
    }

    @Override // p074h3.W
    public void e0(String str) {
        this.f21607d.edit().putString("home_live_effect_info", str).apply();
    }

    @Override // p074h3.W
    public String f() {
        return this.f21606c.getString("home_wallpaper_action_url", null);
    }

    @Override // p074h3.W
    public String g() {
        return this.f21607d.getString("lock_effect_info", null);
    }

    @Override // p074h3.W
    public long g0() {
        return this.f21607d.getLong("last_daily_log_timestamp", 0L);
    }

    @Override // p074h3.W
    public void h(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f21606c.edit();
        int i10 = 0;
        for (Object obj : AbstractC1444s.o0(list, 3)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1444s.t();
            }
            String str = (String) obj;
            if (i10 == 0) {
                editorEdit.putString("home_wallpaper_attribution_line_1", str);
            } else if (i10 == 1) {
                editorEdit.putString("home_wallpaper_attribution_line_2", str);
            } else if (i10 == 2) {
                editorEdit.putString("home_wallpaper_attribution_line_3", str);
            }
            i10 = i11;
        }
        editorEdit.apply();
    }

    @Override // p074h3.W
    public boolean h0() {
        return this.f21606c.getBoolean("lock_wallpaper_support_depth", true);
    }

    @Override // p074h3.W
    public String i() {
        return this.f21607d.getString("home_wallpaper_remote_id", null);
    }

    @Override // p074h3.W
    public void i0(String str) {
        this.f21607d.edit().putString("home_wallpaper_service_name", str).apply();
        v0();
    }

    @Override // p074h3.W
    public void j(long j9) {
        this.f21607d.edit().putLong("last_app_active_timestamp", j9).apply();
    }

    @Override // p074h3.W
    public void j0(String str, WallpaperColors wallpaperColors) {
        if (str == null || wallpaperColors == null) {
            return;
        }
        Color primaryColor = wallpaperColors.getPrimaryColor();
        n.g(primaryColor, "getPrimaryColor(...)");
        String str2 = new String(String.valueOf(primaryColor.toArgb()));
        Color secondaryColor = wallpaperColors.getSecondaryColor();
        if (secondaryColor != null) {
            str2 = str2 + "," + secondaryColor.toArgb();
        }
        Color tertiaryColor = wallpaperColors.getTertiaryColor();
        if (tertiaryColor != null) {
            str2 = str2 + "," + tertiaryColor.toArgb();
        }
        this.f21607d.edit().putString("preview_wallpaper_color_id" + str, str2).apply();
    }

    @Override // p074h3.W
    public boolean k() {
        return this.f21606c.getBoolean("home_wallpaper_support_depth", true);
    }

    @Override // p074h3.W
    public void k0(int i10) {
        this.f21607d.edit().putInt("lock_wallpaper_id", i10).apply();
    }

    @Override // p074h3.W
    public void l(String str) {
        this.f21606c.edit().putString("lock_wallpaper_action_url", str).apply();
    }

    @Override // p074h3.W
    public void l0(int i10, String wallpaperId, k wallpaper, WallpaperColors colors) throws JSONException {
        n.h(wallpaperId, "wallpaperId");
        n.h(wallpaper, "wallpaper");
        n.h(colors, "colors");
        if (wallpaper instanceof J6.a) {
            C6.g gVarK = wallpaper.k();
            if (gVarK == null) {
                c.f("DefaultWallpaperPreferences", "storeLatestWallpaper: wallpaper is BlurLiveWallpaperInfo but EffectInfo is NULL.");
                B();
                return;
            }
            String strC = gVarK.c();
            String strA0 = A0(colors);
            SharedPreferences.Editor editorEdit = this.f21607d.edit();
            n.g(editorEdit, "edit(...)");
            editorEdit.putString("home_live_effect_info", strC);
            editorEdit.putString("lock_live_effect_info", strC);
            if (strA0 != null) {
                editorEdit.putString("home_live_wallpaper_colors", strA0);
                editorEdit.putString("lock_live_wallpaper_colors", strA0);
            }
            J6.a aVar = (J6.a) wallpaper;
            List listE = aVar.e(this.f21605b);
            List list = listE;
            if (list != null && !list.isEmpty()) {
                int i11 = 0;
                for (Object obj : AbstractC1444s.o0(listE, 3)) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC1444s.t();
                    }
                    String str = (String) obj;
                    if (i11 == 0) {
                        editorEdit.putString("blur_wallpaper_attribution_line_1", str);
                    } else if (i11 == 1) {
                        editorEdit.putString("blur_wallpaper_attribution_line_2", str);
                    } else if (i11 == 2) {
                        editorEdit.putString("blur_wallpaper_attribution_line_3", str);
                    }
                    i11 = i12;
                }
            }
            editorEdit.putString("blur_wallpaper_action_url", aVar.c(this.f21605b));
            editorEdit.putString("blur_wallpaper_collection_id", aVar.g(this.f21605b));
            editorEdit.putString("blur_wallpaper_id", aVar.r());
            editorEdit.apply();
        }
    }

    @Override // p074h3.W
    public void m() {
        if (p0() == 0) {
            u0(o0());
        }
        int iN0 = n0();
        if (iN0 < Integer.MAX_VALUE) {
            t0(iN0 + 1);
        }
    }

    public int n0() {
        return this.f21607d.getInt("app_launch_count", 0);
    }

    @Override // p074h3.W
    public void o(int i10) {
        this.f21606c.edit().putInt("wallpaper_presentation_mode", i10).apply();
    }

    @Override // p074h3.W
    public void p(int i10) {
        this.f21607d.edit().putInt("pending_wallpaper_set_status", i10).apply();
    }

    public int p0() {
        return this.f21607d.getInt("first_launch_date_since_setup", 0);
    }

    @Override // p074h3.W
    public void q(String str) {
        this.f21607d.edit().putString("lock_wallpaper_effects", str).apply();
    }

    public int q0() {
        return this.f21607d.getInt("first_wallpaper_apply_date_since_setup", 0);
    }

    @Override // p074h3.W
    public String r() {
        return this.f21606c.getString("lock_wallpaper_action_url", null);
    }

    public long r0() {
        return this.f21606c.getLong("home_wallpaper_hash_code", 0L);
    }

    @Override // p074h3.W
    public void s(int i10, String wallpaperId, x wallpaper, Bitmap croppedWallpaperBitmap, WallpaperColors colors) {
        n.h(wallpaperId, "wallpaperId");
        n.h(wallpaper, "wallpaper");
        n.h(croppedWallpaperBitmap, "croppedWallpaperBitmap");
        n.h(colors, "colors");
        String strA0 = A0(colors);
        SharedPreferences.Editor editorEdit = this.f21607d.edit();
        if ((i10 & 1) != 0 && strA0 != null) {
            editorEdit.putString("home_wallpaper_colors", strA0);
        }
        if ((i10 & 2) != 0 && strA0 != null) {
            editorEdit.putString("lock_wallpaper_colors", strA0);
        }
        editorEdit.apply();
    }

    protected final SharedPreferences s0() {
        return this.f21606c;
    }

    @Override // p074h3.W
    public void t(o metadata) {
        n.h(metadata, "metadata");
        SharedPreferences.Editor editorEdit = this.f21606c.edit();
        List listB = metadata.b();
        List list = listB;
        if (list != null && !list.isEmpty()) {
            int i10 = 0;
            for (Object obj : AbstractC1444s.o0(listB, 3)) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC1444s.t();
                }
                String str = (String) obj;
                if (i10 == 0) {
                    editorEdit.putString("home_wallpaper_attribution_line_1", str);
                } else if (i10 == 1) {
                    editorEdit.putString("home_wallpaper_attribution_line_2", str);
                } else if (i10 == 2) {
                    editorEdit.putString("home_wallpaper_attribution_line_3", str);
                }
                i10 = i11;
            }
        }
        editorEdit.putString("home_wallpaper_action_url", metadata.a());
        editorEdit.putString("home_wallpaper_collection_id", metadata.c());
        Long lE = metadata.e();
        if (lE != null) {
            editorEdit.putLong("home_wallpaper_hash_code", lE.longValue());
        }
        editorEdit.putBoolean("home_wallpaper_support_depth", metadata.h());
        editorEdit.apply();
        SharedPreferences.Editor editorEdit2 = this.f21607d.edit();
        editorEdit2.putInt("home_wallpaper_id", metadata.f());
        editorEdit2.putString("home_wallpaper_remote_id", metadata.g());
        if (metadata.d() != null) {
            editorEdit2.putString("home_effect_info", metadata.d());
        }
        editorEdit2.apply();
    }

    @Override // p074h3.W
    public String u() {
        return this.f21607d.getString("blur_wallpaper_action_url", null);
    }

    @Override // p074h3.W
    public void v(String str) {
        this.f21607d.edit().putString("lock_effect_info", str).apply();
    }

    @Override // p074h3.W
    public void w() {
        this.f21606c.edit().remove("lock_wallpaper_attribution_line_1").remove("lock_wallpaper_attribution_line_2").remove("lock_wallpaper_attribution_line_3").remove("lock_wallpaper_action_url").remove("lock_wallpaper_collection_id").remove("lock_wallpaper_hash_code").remove("lock_wallpaper_support_depth").apply();
        this.f21607d.edit().remove("lock_wallpaper_service_name").remove("lock_wallpaper_effects").remove("lock_wallpaper_id").remove("lock_wallpaper_remote_id").remove("lock_effect_info").remove("lock_wallpaper_colors").apply();
    }

    @Override // p074h3.W
    public List x() {
        return AbstractC1444s.n(this.f21606c.getString("home_wallpaper_attribution_line_1", null), this.f21606c.getString("home_wallpaper_attribution_line_2", null), this.f21606c.getString("home_wallpaper_attribution_line_3", null));
    }

    @Override // p074h3.W
    public int y() {
        return this.f21607d.getInt("home_wallpaper_id", 0);
    }

    @Override // p074h3.W
    public WallpaperColors z() {
        String string = this.f21607d.getString("home_live_wallpaper_colors", null);
        if (string == null) {
            return null;
        }
        WallpaperColors wallpaperColorsY0 = y0(string);
        h.i("parse home live colors value=" + string, wallpaperColorsY0);
        return wallpaperColorsY0;
    }
}
