package O2;

import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Drawable f5808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f5809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f5810f;

    public t(String id, String name, String description, Drawable thumbnail, boolean z9, List axes, b bVar) {
        kotlin.jvm.internal.n.h(id, "id");
        kotlin.jvm.internal.n.h(name, "name");
        kotlin.jvm.internal.n.h(description, "description");
        kotlin.jvm.internal.n.h(thumbnail, "thumbnail");
        kotlin.jvm.internal.n.h(axes, "axes");
        this.f5805a = id;
        this.f5806b = name;
        this.f5807c = description;
        this.f5808d = thumbnail;
        this.f5809e = z9;
        this.f5810f = axes;
    }

    public final String a() {
        return this.f5807c;
    }

    public final b b() {
        return null;
    }

    public final Drawable c() {
        return this.f5808d;
    }

    public final boolean d() {
        return this.f5809e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.n.d(this.f5805a, tVar.f5805a) && kotlin.jvm.internal.n.d(this.f5806b, tVar.f5806b) && kotlin.jvm.internal.n.d(this.f5807c, tVar.f5807c) && kotlin.jvm.internal.n.d(this.f5808d, tVar.f5808d) && this.f5809e == tVar.f5809e && kotlin.jvm.internal.n.d(this.f5810f, tVar.f5810f) && kotlin.jvm.internal.n.d(null, null);
    }

    public int hashCode() {
        return ((((((((((this.f5805a.hashCode() * 31) + this.f5806b.hashCode()) * 31) + this.f5807c.hashCode()) * 31) + this.f5808d.hashCode()) * 31) + Boolean.hashCode(this.f5809e)) * 31) + this.f5810f.hashCode()) * 31;
    }

    public String toString() {
        return "ClockPickerConfig(id=" + this.f5805a + ", name=" + this.f5806b + ", description=" + this.f5807c + ", thumbnail=" + this.f5808d + ", isReactiveToTone=" + this.f5809e + ", axes=" + this.f5810f + ", presetConfig=" + ((Object) null) + ")";
    }

    public /* synthetic */ t(String str, String str2, String str3, Drawable drawable, boolean z9, List list, b bVar, int i10, AbstractC1457h abstractC1457h) {
        this(str, str2, str3, drawable, (i10 & 16) != 0 ? true : z9, (i10 & 32) != 0 ? AbstractC1444s.l() : list, (i10 & 64) != 0 ? null : bVar);
    }
}
