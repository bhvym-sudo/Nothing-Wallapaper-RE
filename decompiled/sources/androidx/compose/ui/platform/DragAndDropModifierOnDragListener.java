package androidx.compose.ui.platform;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.C1022b;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class DragAndDropModifierOnDragListener implements View.OnDragListener, F.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p219v8.q f11703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F.d f11704b = new F.d(a.f11707r);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1022b f11705c = new C1022b(0, 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C.c f11706d = new W.M() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // W.M
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public F.d d() {
            return this.f11708b.f11704b;
        }

        @Override // W.M
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(F.d dVar) {
        }

        public int hashCode() {
            return this.f11708b.f11704b.hashCode();
        }
    };

    static final class a extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f11707r = new a();

        a() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F.f f(F.a aVar) {
            return null;
        }
    }

    public DragAndDropModifierOnDragListener(p219v8.q qVar) {
        this.f11703a = qVar;
    }

    @Override // F.b
    public boolean a(F.c cVar) {
        return this.f11705c.contains(cVar);
    }

    @Override // F.b
    public void b(F.c cVar) {
        this.f11705c.add(cVar);
    }

    public C.c d() {
        return this.f11706d;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        F.a aVar = new F.a(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean zH0 = this.f11704b.h0(aVar);
                Iterator<E> it = this.f11705c.iterator();
                while (it.hasNext()) {
                    ((F.c) it.next()).F(aVar);
                }
                return zH0;
            case 2:
                this.f11704b.t(aVar);
                return false;
            case 3:
                return this.f11704b.b(aVar);
            case 4:
                this.f11704b.w(aVar);
                return false;
            case 5:
                this.f11704b.x(aVar);
                return false;
            case 6:
                this.f11704b.B(aVar);
                return false;
            default:
                return false;
        }
    }
}
