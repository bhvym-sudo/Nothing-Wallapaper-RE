package p064g3;

import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f21187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Long f21190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f21192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21194h;

    public o(List list, String str, String str2, Long l9, int i10, String str3, String str4, boolean z9) {
        this.f21187a = list;
        this.f21188b = str;
        this.f21189c = str2;
        this.f21190d = l9;
        this.f21191e = i10;
        this.f21192f = str3;
        this.f21193g = str4;
        this.f21194h = z9;
    }

    public final String a() {
        return this.f21188b;
    }

    public final List b() {
        return this.f21187a;
    }

    public final String c() {
        return this.f21189c;
    }

    public final String d() {
        return this.f21193g;
    }

    public final Long e() {
        return this.f21190d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return n.d(this.f21187a, oVar.f21187a) && n.d(this.f21188b, oVar.f21188b) && n.d(this.f21189c, oVar.f21189c) && n.d(this.f21190d, oVar.f21190d) && this.f21191e == oVar.f21191e && n.d(this.f21192f, oVar.f21192f) && n.d(this.f21193g, oVar.f21193g) && this.f21194h == oVar.f21194h;
    }

    public final int f() {
        return this.f21191e;
    }

    public final String g() {
        return this.f21192f;
    }

    public final boolean h() {
        return this.f21194h;
    }

    public int hashCode() {
        List list = this.f21187a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f21188b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21189c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l9 = this.f21190d;
        int iHashCode4 = (((iHashCode3 + (l9 == null ? 0 : l9.hashCode())) * 31) + Integer.hashCode(this.f21191e)) * 31;
        String str3 = this.f21192f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21193g;
        return ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.f21194h);
    }

    public String toString() {
        return "StaticWallpaperPrefMetadata(attributions=" + this.f21187a + ", actionUrl=" + this.f21188b + ", collectionId=" + this.f21189c + ", hashCode=" + this.f21190d + ", managerId=" + this.f21191e + ", remoteId=" + this.f21192f + ", effectInfo=" + this.f21193g + ", supportDepth=" + this.f21194h + ")";
    }
}
