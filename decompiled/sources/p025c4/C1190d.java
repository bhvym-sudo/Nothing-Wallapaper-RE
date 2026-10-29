package p025c4;

import android.accounts.Account;
import android.view.View;
import androidx.appcompat.app.o;
import androidx.collection.C1022b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: c4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1190d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Account f15131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f15132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f15133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f15134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f15135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f15136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f15137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f15138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p195t4.a f15139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f15140j;

    /* JADX INFO: renamed from: c4.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Account f15141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C1022b f15142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f15143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f15144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p195t4.a f15145e = p195t4.a.f27918k;

        public C1190d a() {
            return new C1190d(this.f15141a, this.f15142b, null, 0, null, this.f15143c, this.f15144d, this.f15145e, false);
        }

        public a b(String str) {
            this.f15143c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f15142b == null) {
                this.f15142b = new C1022b();
            }
            this.f15142b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f15141a = account;
            return this;
        }

        public final a e(String str) {
            this.f15144d = str;
            return this;
        }
    }

    public C1190d(Account account, Set set, Map map, int i10, View view, String str, String str2, p195t4.a aVar, boolean z9) {
        this.f15131a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f15132b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f15134d = map;
        this.f15136f = view;
        this.f15135e = i10;
        this.f15137g = str;
        this.f15138h = str2;
        this.f15139i = aVar == null ? p195t4.a.f27918k : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            o.a(it.next());
            throw null;
        }
        this.f15133c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f15131a;
    }

    public Account b() {
        Account account = this.f15131a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set c() {
        return this.f15133c;
    }

    public String d() {
        return this.f15137g;
    }

    public Set e() {
        return this.f15132b;
    }

    public final p195t4.a f() {
        return this.f15139i;
    }

    public final Integer g() {
        return this.f15140j;
    }

    public final String h() {
        return this.f15138h;
    }

    public final void i(Integer num) {
        this.f15140j = num;
    }
}
