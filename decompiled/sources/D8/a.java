package D8;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f1135a;

    public a(h sequence) {
        kotlin.jvm.internal.n.h(sequence, "sequence");
        this.f1135a = new AtomicReference(sequence);
    }

    @Override // D8.h
    public Iterator iterator() {
        h hVar = (h) this.f1135a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
