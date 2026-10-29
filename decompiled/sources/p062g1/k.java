package p062g1;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f21057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f21058b;

    public k(q database) {
        n.h(database, "database");
        this.f21057a = database;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        n.g(setNewSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f21058b = setNewSetFromMap;
    }
}
