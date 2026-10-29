package p123m2;

import android.content.Intent;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f23208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f23209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f23210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f23211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Intent f23212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Intent f23213h;

    public a(String id, String name, int i10, boolean z9, String enablementExplanation, String str, Intent intent, Intent intent2) {
        n.h(id, "id");
        n.h(name, "name");
        n.h(enablementExplanation, "enablementExplanation");
        this.f23206a = id;
        this.f23207b = name;
        this.f23208c = i10;
        this.f23209d = z9;
        this.f23210e = enablementExplanation;
        this.f23211f = str;
        this.f23212g = intent;
        this.f23213h = intent2;
    }

    public final Intent a() {
        return this.f23213h;
    }

    public final Intent b() {
        return this.f23212g;
    }

    public final String c() {
        return this.f23211f;
    }

    public final String d() {
        return this.f23210e;
    }

    public final int e() {
        return this.f23208c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.d(this.f23206a, aVar.f23206a) && n.d(this.f23207b, aVar.f23207b) && this.f23208c == aVar.f23208c && this.f23209d == aVar.f23209d && n.d(this.f23210e, aVar.f23210e) && n.d(this.f23211f, aVar.f23211f) && n.d(this.f23212g, aVar.f23212g) && n.d(this.f23213h, aVar.f23213h);
    }

    public final String f() {
        return this.f23206a;
    }

    public final String g() {
        return this.f23207b;
    }

    public final boolean h() {
        return this.f23209d;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f23206a.hashCode() * 31) + this.f23207b.hashCode()) * 31) + Integer.hashCode(this.f23208c)) * 31) + Boolean.hashCode(this.f23209d)) * 31) + this.f23210e.hashCode()) * 31;
        String str = this.f23211f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Intent intent = this.f23212g;
        int iHashCode3 = (iHashCode2 + (intent == null ? 0 : intent.hashCode())) * 31;
        Intent intent2 = this.f23213h;
        return iHashCode3 + (intent2 != null ? intent2.hashCode() : 0);
    }

    public String toString() {
        return "KeyguardQuickAffordancePickerAffordanceModel(id=" + this.f23206a + ", name=" + this.f23207b + ", iconResourceId=" + this.f23208c + ", isEnabled=" + this.f23209d + ", enablementExplanation=" + this.f23210e + ", enablementActionText=" + this.f23211f + ", enablementActionIntent=" + this.f23212g + ", configureIntent=" + this.f23213h + ")";
    }
}
