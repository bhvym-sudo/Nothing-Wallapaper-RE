package p036d5;

import Y4.b;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: d5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1305d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f19575a;

    public C1305d(b bVar) {
        this.f19575a = bVar;
    }

    public Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.f19575a.get();
    }
}
