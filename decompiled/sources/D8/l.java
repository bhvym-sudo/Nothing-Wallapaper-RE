package D8;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p219v8.p f1164a;

        public a(p219v8.p pVar) {
            this.f1164a = pVar;
        }

        @Override // D8.h
        public Iterator iterator() {
            return l.a(this.f1164a);
        }
    }

    public static Iterator a(p219v8.p block) {
        kotlin.jvm.internal.n.h(block, "block");
        i iVar = new i();
        iVar.l(p139n8.b.a(block, iVar, iVar));
        return iVar;
    }

    public static h b(p219v8.p block) {
        kotlin.jvm.internal.n.h(block, "block");
        return new a(block);
    }
}
