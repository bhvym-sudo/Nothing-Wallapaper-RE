package N5;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements N5.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f5369m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Icon f5373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Icon f5374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f5375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f5376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final PendingIntent f5377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte f5378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f5379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f5380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f5381l;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean a(Bundle data) {
            n.h(data, "data");
            return data.containsKey("musicName");
        }

        public final N5.a b(Bundle bundle) {
            n.h(bundle, "bundle");
            String string = bundle.getString("musicName");
            if (string == null) {
                string = "";
            }
            String str = string;
            String string2 = bundle.getString("artistName");
            String string3 = bundle.getString("albumName");
            Icon icon = (Icon) bundle.getParcelable("albumIcon", Icon.class);
            Icon icon2 = (Icon) bundle.getParcelable("appIcon", Icon.class);
            int i10 = bundle.getInt("musicDuration");
            String string4 = bundle.getString("packageName");
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent", PendingIntent.class);
            Byte b10 = bundle.getByte("playbackActions", (byte) -128);
            n.g(b10, "getByte(...)");
            return new b(str, string2, string3, icon, icon2, i10, string4, pendingIntent, b10.byteValue(), bundle.getString("album_art_uri"), bundle.getString("art_uri"), bundle.getString("display_icon_uri"));
        }

        private a() {
        }
    }

    public b(String musicName, String str, String str2, Icon icon, Icon icon2, int i10, String str3, PendingIntent pendingIntent, byte b10, String str4, String str5, String str6) {
        n.h(musicName, "musicName");
        this.f5370a = musicName;
        this.f5371b = str;
        this.f5372c = str2;
        this.f5373d = icon;
        this.f5374e = icon2;
        this.f5375f = i10;
        this.f5376g = str3;
        this.f5377h = pendingIntent;
        this.f5378i = b10;
        this.f5379j = str4;
        this.f5380k = str5;
        this.f5381l = str6;
    }

    public final Icon a() {
        return this.f5373d;
    }

    public final String b() {
        return this.f5379j;
    }

    public final String c() {
        return this.f5380k;
    }

    public final String d() {
        return this.f5381l;
    }

    public final int e() {
        int iHashCode = this.f5370a.hashCode();
        String str = this.f5371b;
        int iHashCode2 = iHashCode + ((str != null ? str.hashCode() : 0) * 31) + (String.valueOf(this.f5373d).hashCode() * 31);
        String str2 = this.f5372c;
        int iHashCode3 = iHashCode2 + ((str2 != null ? str2.hashCode() : 0) * 31);
        String str3 = this.f5376g;
        int iHashCode4 = iHashCode3 + ((str3 != null ? str3.hashCode() : 0) * 31);
        String str4 = this.f5379j;
        int iHashCode5 = iHashCode4 + ((str4 != null ? str4.hashCode() : 0) * 31);
        String str5 = this.f5380k;
        int iHashCode6 = iHashCode5 + ((str5 != null ? str5.hashCode() : 0) * 31);
        String str6 = this.f5381l;
        return iHashCode6 + ((str6 != null ? str6.hashCode() : 0) * 31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.d(this.f5370a, bVar.f5370a) && n.d(this.f5371b, bVar.f5371b) && n.d(this.f5372c, bVar.f5372c) && n.d(this.f5373d, bVar.f5373d) && n.d(this.f5374e, bVar.f5374e) && this.f5375f == bVar.f5375f && n.d(this.f5376g, bVar.f5376g) && n.d(this.f5377h, bVar.f5377h) && this.f5378i == bVar.f5378i && n.d(this.f5379j, bVar.f5379j) && n.d(this.f5380k, bVar.f5380k) && n.d(this.f5381l, bVar.f5381l);
    }

    public final String f() {
        return this.f5372c;
    }

    public final Icon g() {
        return this.f5374e;
    }

    public final String h() {
        return this.f5371b;
    }

    public int hashCode() {
        int iHashCode = this.f5370a.hashCode() * 31;
        String str = this.f5371b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5372c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Icon icon = this.f5373d;
        int iHashCode4 = (iHashCode3 + (icon == null ? 0 : icon.hashCode())) * 31;
        Icon icon2 = this.f5374e;
        int iHashCode5 = (((iHashCode4 + (icon2 == null ? 0 : icon2.hashCode())) * 31) + Integer.hashCode(this.f5375f)) * 31;
        String str3 = this.f5376g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PendingIntent pendingIntent = this.f5377h;
        int iHashCode7 = (((iHashCode6 + (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 31) + Byte.hashCode(this.f5378i)) * 31;
        String str4 = this.f5379j;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5380k;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5381l;
        return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public final PendingIntent i() {
        return this.f5377h;
    }

    public final String j() {
        return this.f5370a + "_" + this.f5372c + "_" + this.f5371b + "_" + this.f5376g;
    }

    public final String k() {
        return this.f5370a;
    }

    public final String l() {
        return this.f5376g;
    }

    public final byte m() {
        return this.f5378i;
    }

    public String toString() {
        String str = this.f5370a;
        String str2 = this.f5371b;
        String str3 = this.f5372c;
        Icon icon = this.f5373d;
        Icon icon2 = this.f5374e;
        int i10 = this.f5375f;
        String str4 = this.f5376g;
        PendingIntent pendingIntent = this.f5377h;
        byte b10 = this.f5378i;
        return "MusicMetaData(musicName=" + str + ", artistName=" + str2 + ", albumName=" + str3 + ", albumIcon=" + icon + ", appIcon=" + icon2 + ", musicDuration=" + i10 + ", packageName=" + str4 + ", launchPendingIntent=" + pendingIntent + ", supportPlaybackActions=" + ((int) b10) + ", albumIconUri1=" + this.f5379j + ", albumIconUri2=" + this.f5380k + ", albumIconUri3=" + this.f5381l + ")";
    }

    public /* synthetic */ b(String str, String str2, String str3, Icon icon, Icon icon2, int i10, String str4, PendingIntent pendingIntent, byte b10, String str5, String str6, String str7, int i11, AbstractC1457h abstractC1457h) {
        this(str, str2, str3, icon, icon2, (i11 & 32) != 0 ? 0 : i10, str4, (i11 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? null : pendingIntent, (i11 & 256) != 0 ? (byte) -128 : b10, (i11 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? null : str5, (i11 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? null : str6, (i11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : str7);
    }
}
