package p062g1;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.n;
import p142o1.h;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h.c f21037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q.e f21038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f21039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q.d f21041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f21042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f21043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Intent f21044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f21045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f21046l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f21047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f21048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final File f21049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Callable f21050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f21051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f21052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f21053s;

    public f(Context context, String str, h.c sqliteOpenHelperFactory, q.e migrationContainer, List list, boolean z9, q.d journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z10, boolean z11, Set set, String str2, File file, Callable callable, q.f fVar, List typeConverters, List autoMigrationSpecs) {
        n.h(context, "context");
        n.h(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        n.h(migrationContainer, "migrationContainer");
        n.h(journalMode, "journalMode");
        n.h(queryExecutor, "queryExecutor");
        n.h(transactionExecutor, "transactionExecutor");
        n.h(typeConverters, "typeConverters");
        n.h(autoMigrationSpecs, "autoMigrationSpecs");
        this.f21035a = context;
        this.f21036b = str;
        this.f21037c = sqliteOpenHelperFactory;
        this.f21038d = migrationContainer;
        this.f21039e = list;
        this.f21040f = z9;
        this.f21041g = journalMode;
        this.f21042h = queryExecutor;
        this.f21043i = transactionExecutor;
        this.f21044j = intent;
        this.f21045k = z10;
        this.f21046l = z11;
        this.f21047m = set;
        this.f21048n = str2;
        this.f21049o = file;
        this.f21050p = callable;
        this.f21051q = typeConverters;
        this.f21052r = autoMigrationSpecs;
        this.f21053s = intent != null;
    }

    public boolean a(int i10, int i11) {
        Set set;
        return (i10 <= i11 || !this.f21046l) && this.f21045k && ((set = this.f21047m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
