package p161q0;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.appcompat.app.o;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f23863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j.d f23864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f23865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f23866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f23867f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f23868g = new Bundle();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RemoteViews f23870i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Builder e(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder f(Notification.Builder builder, boolean z9) {
            return builder.setGroupSummary(z9);
        }

        static Notification.Builder g(Notification.Builder builder, boolean z9) {
            return builder.setLocalOnly(z9);
        }

        static Notification.Builder h(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z9) {
            return builder.setAllowGeneratedReplies(z9);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z9) {
            return builder.setColorized(z9);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j9) {
            return builder.setTimeoutAfter(j9);
        }
    }

    static class f {
        static Notification.Action.Builder a(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z9) {
            return builder.setAllowSystemGeneratedContextualActions(z9);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z9) {
            return builder.setContextual(z9);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z9) {
            return builder.setAuthenticationRequired(z9);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    k(j.d dVar) {
        this.f23864c = dVar;
        Context context = dVar.f23832a;
        this.f23862a = context;
        Notification.Builder builderA = e.a(context, dVar.f23821K);
        this.f23863b = builderA;
        Notification notification = dVar.f23828R;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f23840i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f23836e).setContentText(dVar.f23837f).setContentInfo(dVar.f23842k).setContentIntent(dVar.f23838g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f23839h, (notification.flags & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0).setNumber(dVar.f23843l).setProgress(dVar.f23851t, dVar.f23852u, dVar.f23853v);
        IconCompat iconCompat = dVar.f23841j;
        c.b(builderA, iconCompat == null ? null : iconCompat.r(context));
        builderA.setSubText(dVar.f23848q).setUsesChronometer(dVar.f23846o).setPriority(dVar.f23844m);
        Iterator it = dVar.f23833b.iterator();
        while (it.hasNext()) {
            b((j.a) it.next());
        }
        Bundle bundle = dVar.f23814D;
        if (bundle != null) {
            this.f23868g.putAll(bundle);
        }
        this.f23865d = dVar.f23818H;
        this.f23866e = dVar.f23819I;
        this.f23863b.setShowWhen(dVar.f23845n);
        a.g(this.f23863b, dVar.f23857z);
        a.e(this.f23863b, dVar.f23854w);
        a.h(this.f23863b, dVar.f23856y);
        a.f(this.f23863b, dVar.f23855x);
        this.f23869h = dVar.f23825O;
        b.b(this.f23863b, dVar.f23813C);
        b.c(this.f23863b, dVar.f23815E);
        b.f(this.f23863b, dVar.f23816F);
        b.d(this.f23863b, dVar.f23817G);
        b.e(this.f23863b, notification.sound, notification.audioAttributes);
        ArrayList arrayList = dVar.f23831U;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                b.a(this.f23863b, (String) it2.next());
            }
        }
        this.f23870i = dVar.f23820J;
        if (dVar.f23835d.size() > 0) {
            Bundle bundle2 = dVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i10 = 0; i10 < dVar.f23835d.size(); i10++) {
                bundle4.putBundle(Integer.toString(i10), l.a((j.a) dVar.f23835d.get(i10)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f23868g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        Object obj = dVar.f23830T;
        if (obj != null) {
            c.c(this.f23863b, obj);
        }
        this.f23863b.setExtras(dVar.f23814D);
        d.e(this.f23863b, dVar.f23850s);
        RemoteViews remoteViews = dVar.f23818H;
        if (remoteViews != null) {
            d.c(this.f23863b, remoteViews);
        }
        RemoteViews remoteViews2 = dVar.f23819I;
        if (remoteViews2 != null) {
            d.b(this.f23863b, remoteViews2);
        }
        RemoteViews remoteViews3 = dVar.f23820J;
        if (remoteViews3 != null) {
            d.d(this.f23863b, remoteViews3);
        }
        e.b(this.f23863b, dVar.f23822L);
        e.e(this.f23863b, dVar.f23849r);
        e.f(this.f23863b, dVar.f23823M);
        e.g(this.f23863b, dVar.f23824N);
        e.d(this.f23863b, dVar.f23825O);
        if (dVar.f23812B) {
            e.c(this.f23863b, dVar.f23811A);
        }
        if (!TextUtils.isEmpty(dVar.f23821K)) {
            this.f23863b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it3 = dVar.f23834c.iterator();
        if (it3.hasNext()) {
            o.a(it3.next());
            throw null;
        }
        g.a(this.f23863b, dVar.f23827Q);
        g.b(this.f23863b, j.c.a(null));
        int i11 = dVar.f23826P;
        if (i11 != 0) {
            h.b(this.f23863b, i11);
        }
        if (dVar.f23829S) {
            if (this.f23864c.f23855x) {
                this.f23869h = 2;
            } else {
                this.f23869h = 1;
            }
            this.f23863b.setVibrate(null);
            this.f23863b.setSound(null);
            int i12 = notification.defaults & (-4);
            notification.defaults = i12;
            this.f23863b.setDefaults(i12);
            if (TextUtils.isEmpty(this.f23864c.f23854w)) {
                a.e(this.f23863b, "silent");
            }
            e.d(this.f23863b, this.f23869h);
        }
    }

    private void b(j.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.q() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : p.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        f.a(builderA, aVar.f());
        g.c(builderA, aVar.j());
        h.a(builderA, aVar.i());
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f23863b, a.d(builderA));
    }

    @Override // p161q0.i
    public Notification.Builder a() {
        return this.f23863b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        j.e eVar = this.f23864c.f23847p;
        if (eVar != null) {
            eVar.b(this);
        }
        RemoteViews remoteViewsE = eVar != null ? eVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f23864c.f23818H;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (eVar != null && (remoteViewsD = eVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (eVar != null && (remoteViewsF = this.f23864c.f23847p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (eVar != null && (bundleA = j.a(notificationD)) != null) {
            eVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        return this.f23863b.build();
    }
}
