package p218v7;

import F8.I;
import I8.InterfaceC0880f;
import kotlin.jvm.internal.n;
import p129m8.e;
import p208u7.c;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p208u7.a f28534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I f28535b;

    public a(p208u7.a client, I backgroundDispatcher) {
        n.h(client, "client");
        n.h(backgroundDispatcher, "backgroundDispatcher");
        this.f28534a = client;
        this.f28535b = backgroundDispatcher;
    }

    public final Object a(c cVar, e eVar) {
        return this.f28534a.e(cVar, eVar);
    }

    public final InterfaceC0880f b() {
        return this.f28534a.h();
    }

    public final boolean c() {
        return this.f28534a.f();
    }
}
