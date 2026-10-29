package p161q0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f23798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f23799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p[] f23800c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p[] f23801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f23802e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f23803f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f23804g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f23805h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f23806i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f23807j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f23808k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f23809l;

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.h(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f23808k;
        }

        public boolean b() {
            return this.f23802e;
        }

        public Bundle c() {
            return this.f23798a;
        }

        public IconCompat d() {
            int i10;
            if (this.f23799b == null && (i10 = this.f23806i) != 0) {
                this.f23799b = IconCompat.h(null, "", i10);
            }
            return this.f23799b;
        }

        public p[] e() {
            return this.f23800c;
        }

        public int f() {
            return this.f23804g;
        }

        public boolean g() {
            return this.f23803f;
        }

        public CharSequence h() {
            return this.f23807j;
        }

        public boolean i() {
            return this.f23809l;
        }

        public boolean j() {
            return this.f23805h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, p[] pVarArr, p[] pVarArr2, boolean z9, int i10, boolean z10, boolean z11, boolean z12) {
            this.f23803f = true;
            this.f23799b = iconCompat;
            if (iconCompat != null && iconCompat.l() == 2) {
                this.f23806i = iconCompat.i();
            }
            this.f23807j = d.d(charSequence);
            this.f23808k = pendingIntent;
            this.f23798a = bundle == null ? new Bundle() : bundle;
            this.f23800c = pVarArr;
            this.f23801d = pVarArr2;
            this.f23802e = z9;
            this.f23804g = i10;
            this.f23803f = z10;
            this.f23805h = z11;
            this.f23809l = z12;
        }
    }

    public static class b extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f23810e;

        @Override // q0.j.e
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // q0.j.e
        public void b(i iVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(iVar.a()).setBigContentTitle(this.f23859b).bigText(this.f23810e);
            if (this.f23861d) {
                bigTextStyleBigText.setSummaryText(this.f23860c);
            }
        }

        @Override // q0.j.e
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.f23810e = d.d(charSequence);
            return this;
        }
    }

    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected d f23858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f23859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f23860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f23861d = false;

        public void a(Bundle bundle) {
            if (this.f23861d) {
                bundle.putCharSequence("android.summaryText", this.f23860c);
            }
            CharSequence charSequence = this.f23859b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(i iVar);

        protected abstract String c();

        public RemoteViews d(i iVar) {
            return null;
        }

        public RemoteViews e(i iVar) {
            return null;
        }

        public RemoteViews f(i iVar) {
            return null;
        }

        public void g(d dVar) {
            if (this.f23858a != dVar) {
                this.f23858a = dVar;
                if (dVar != null) {
                    dVar.n(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static class d {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        boolean f23811A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        boolean f23812B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        String f23813C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        Bundle f23814D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        int f23815E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        int f23816F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        Notification f23817G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        RemoteViews f23818H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        RemoteViews f23819I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        RemoteViews f23820J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        String f23821K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        int f23822L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        String f23823M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        long f23824N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f23825O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        int f23826P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        boolean f23827Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        Notification f23828R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        boolean f23829S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        Object f23830T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public ArrayList f23831U;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f23832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f23833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f23834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f23835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f23836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f23837f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        PendingIntent f23838g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f23839h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        RemoteViews f23840i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        IconCompat f23841j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        CharSequence f23842k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f23843l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f23844m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f23845n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f23846o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        e f23847p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        CharSequence f23848q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f23849r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence[] f23850s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f23851t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f23852u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f23853v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        String f23854w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f23855x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        String f23856y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        boolean f23857z;

        public d(Context context, String str) {
            this.f23833b = new ArrayList();
            this.f23834c = new ArrayList();
            this.f23835d = new ArrayList();
            this.f23845n = true;
            this.f23857z = false;
            this.f23815E = 0;
            this.f23816F = 0;
            this.f23822L = 0;
            this.f23825O = 0;
            this.f23826P = 0;
            Notification notification = new Notification();
            this.f23828R = notification;
            this.f23832a = context;
            this.f23821K = str;
            notification.when = System.currentTimeMillis();
            this.f23828R.audioStreamType = -1;
            this.f23844m = 0;
            this.f23831U = new ArrayList();
            this.f23827Q = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void j(int i10, boolean z9) {
            if (z9) {
                Notification notification = this.f23828R;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.f23828R;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public d a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f23833b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new k(this).c();
        }

        public Bundle c() {
            if (this.f23814D == null) {
                this.f23814D = new Bundle();
            }
            return this.f23814D;
        }

        public d e(boolean z9) {
            j(16, z9);
            return this;
        }

        public d f(String str) {
            this.f23821K = str;
            return this;
        }

        public d g(PendingIntent pendingIntent) {
            this.f23838g = pendingIntent;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f23837f = d(charSequence);
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f23836e = d(charSequence);
            return this;
        }

        public d k(boolean z9) {
            this.f23857z = z9;
            return this;
        }

        public d l(int i10) {
            this.f23844m = i10;
            return this;
        }

        public d m(int i10) {
            this.f23828R.icon = i10;
            return this;
        }

        public d n(e eVar) {
            if (this.f23847p != eVar) {
                this.f23847p = eVar;
                if (eVar != null) {
                    eVar.g(this);
                }
            }
            return this;
        }

        public d o(CharSequence charSequence) {
            this.f23828R.tickerText = d(charSequence);
            return this;
        }

        public d p(long j9) {
            this.f23828R.when = j9;
            return this;
        }

        public d(Context context) {
            this(context, null);
        }
    }
}
