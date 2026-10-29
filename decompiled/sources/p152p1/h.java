package p152p1;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.n;
import p142o1.k;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g implements k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final SQLiteStatement f23690r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement delegate) {
        super(delegate);
        n.h(delegate, "delegate");
        this.f23690r = delegate;
    }

    @Override // p142o1.k
    public long a1() {
        return this.f23690r.executeInsert();
    }

    @Override // p142o1.k
    public int v() {
        return this.f23690r.executeUpdateDelete();
    }
}
