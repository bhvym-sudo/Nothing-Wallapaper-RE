package C7;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0032a f667k = new C0032a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Drawable f671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f675h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Intent f676i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Intent f677j;

    /* JADX INFO: renamed from: C7.a$a, reason: collision with other inner class name */
    public static final class C0032a {
        public /* synthetic */ C0032a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final a a(Context context) {
            n.h(context, "context");
            String string = context.getString(R.string.shortcut_app_none);
            n.g(string, "getString(...)");
            Drawable drawable = context.getDrawable(R.drawable.ic_shortcut_none);
            n.e(drawable);
            return new a("none", string, "", drawable, false, true, "", "", null, null);
        }

        private C0032a() {
        }
    }

    public a(String id, String name, String summary, Drawable iconDrawable, boolean z9, boolean z10, String enablementExplanation, String str, Intent intent, Intent intent2) {
        n.h(id, "id");
        n.h(name, "name");
        n.h(summary, "summary");
        n.h(iconDrawable, "iconDrawable");
        n.h(enablementExplanation, "enablementExplanation");
        this.f668a = id;
        this.f669b = name;
        this.f670c = summary;
        this.f671d = iconDrawable;
        this.f672e = z9;
        this.f673f = z10;
        this.f674g = enablementExplanation;
        this.f675h = str;
        this.f676i = intent;
        this.f677j = intent2;
    }

    public final String a() {
        return this.f674g;
    }

    public final Drawable b() {
        return this.f671d;
    }

    public final String c() {
        return this.f668a;
    }

    public final String d() {
        return this.f669b;
    }

    public final boolean e() {
        return this.f673f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.d(this.f668a, aVar.f668a) && n.d(this.f669b, aVar.f669b) && n.d(this.f670c, aVar.f670c) && n.d(this.f671d, aVar.f671d) && this.f672e == aVar.f672e && this.f673f == aVar.f673f && n.d(this.f674g, aVar.f674g) && n.d(this.f675h, aVar.f675h) && n.d(this.f676i, aVar.f676i) && n.d(this.f677j, aVar.f677j);
    }

    public final boolean f() {
        return this.f672e;
    }

    public final void g(boolean z9) {
        this.f672e = z9;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.f668a.hashCode() * 31) + this.f669b.hashCode()) * 31) + this.f670c.hashCode()) * 31) + this.f671d.hashCode()) * 31) + Boolean.hashCode(this.f672e)) * 31) + Boolean.hashCode(this.f673f)) * 31) + this.f674g.hashCode()) * 31;
        String str = this.f675h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Intent intent = this.f676i;
        int iHashCode3 = (iHashCode2 + (intent == null ? 0 : intent.hashCode())) * 31;
        Intent intent2 = this.f677j;
        return iHashCode3 + (intent2 != null ? intent2.hashCode() : 0);
    }

    public String toString() {
        return "ShortcutInfo(id=" + this.f668a + ", name=" + this.f669b + ", summary=" + this.f670c + ", iconDrawable=" + this.f671d + ", isSelected=" + this.f672e + ", isEnabled=" + this.f673f + ", enablementExplanation=" + this.f674g + ", enablementActionText=" + this.f675h + ", enablementActionIntent=" + this.f676i + ", configureIntent=" + this.f677j + ")";
    }
}
