package O5;

import F8.AbstractC0816i;
import F8.L;
import android.content.Context;
import android.os.Bundle;
import com.nothing.experience.AppTracking;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f5904a = new i();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        final /* synthetic */ String f5905A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f5906B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ String f5907C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ String f5908D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f5909E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final /* synthetic */ String f5910F;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5911q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Context f5912r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f5913s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f5914t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f5915u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ String f5916v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ int f5917w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ String f5918x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ String f5919y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ String f5920z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, String str, String str2, int i10, String str3, int i11, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, p129m8.e eVar) {
            super(2, eVar);
            this.f5912r = context;
            this.f5913s = str;
            this.f5914t = str2;
            this.f5915u = i10;
            this.f5916v = str3;
            this.f5917w = i11;
            this.f5918x = str4;
            this.f5919y = str5;
            this.f5920z = str6;
            this.f5905A = str7;
            this.f5906B = str8;
            this.f5907C = str9;
            this.f5908D = str10;
            this.f5909E = str11;
            this.f5910F = str12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new a(this.f5912r, this.f5913s, this.f5914t, this.f5915u, this.f5916v, this.f5917w, this.f5918x, this.f5919y, this.f5920z, this.f5905A, this.f5906B, this.f5907C, this.f5908D, this.f5909E, this.f5910F, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f5911q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            Bundle bundle = new Bundle();
            String str = this.f5914t;
            int i10 = this.f5915u;
            String str2 = this.f5916v;
            int i11 = this.f5917w;
            String str3 = this.f5918x;
            String str4 = this.f5919y;
            String str5 = this.f5920z;
            String str6 = this.f5905A;
            String str7 = this.f5906B;
            String str8 = this.f5907C;
            String str9 = this.f5908D;
            String str10 = this.f5909E;
            String str11 = this.f5910F;
            bundle.putInt(str, i10);
            bundle.putInt(str2, i11);
            bundle.putInt(str3, 1);
            bundle.putString(str4, str5);
            bundle.putString(str6, str7);
            bundle.putString(str8, str9);
            bundle.putString(str10, str11);
            i.f5904a.b(bundle);
            AppTracking appTracking = AppTracking.getInstance(this.f5912r);
            if (appTracking != null) {
                kotlin.coroutines.jvm.internal.b.a(appTracking.logProductEvent(this.f5913s, bundle));
            }
            return A.f21846a;
        }
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> setKeySet = bundle.keySet();
        n.g(setKeySet, "keySet(...)");
        for (String str : setKeySet) {
            Object obj = bundle.get(str);
            if (obj == null ? true : obj instanceof String) {
                String str2 = (String) obj;
                if (str2 != null && E8.i.S(str2, "*", false, 2, null)) {
                    n.f(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put(str, E8.i.I(str2, "*", "x", false, 4, null));
                }
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            bundle.remove(str3);
            bundle.putString(str3, str4);
        }
    }

    public final void c(Context context, int i10, int i11, String musicName, String artistName, String albumName, String musicAppPackageName) {
        n.h(context, "context");
        n.h(musicName, "musicName");
        n.h(artistName, "artistName");
        n.h(albumName, "albumName");
        n.h(musicAppPackageName, "musicAppPackageName");
        AbstractC0816i.d(g.j(), null, null, new a(context, "media_player_on_click", "widget_id", i10, "event", i11, "page", "music_name", musicName, "artist_name", artistName, "album_name", albumName, "music_app_package_name", musicAppPackageName, null), 3, null);
    }
}
