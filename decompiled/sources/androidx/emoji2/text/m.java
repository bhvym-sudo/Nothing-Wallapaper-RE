package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.Optimizer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Q0.b f12832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f12833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f12834c = new a(Optimizer.OPTIMIZATION_GROUPING);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Typeface f12835d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f12836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o f12837b;

        private a() {
            this(1);
        }

        a a(int i10) {
            SparseArray sparseArray = this.f12836a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        final o b() {
            return this.f12837b;
        }

        void c(o oVar, int i10, int i11) {
            a aVarA = a(oVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f12836a.put(oVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(oVar, i10 + 1, i11);
            } else {
                aVarA.f12837b = oVar;
            }
        }

        a(int i10) {
            this.f12836a = new SparseArray(i10);
        }
    }

    private m(Typeface typeface, Q0.b bVar) {
        this.f12835d = typeface;
        this.f12832a = bVar;
        this.f12833b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(Q0.b bVar) {
        int iK = bVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            o oVar = new o(this, i10);
            Character.toChars(oVar.f(), this.f12833b, i10 * 2);
            h(oVar);
        }
    }

    public static m b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            p231x0.k.a("EmojiCompat.MetadataRepo.create");
            return new m(typeface, l.b(byteBuffer));
        } finally {
            p231x0.k.b();
        }
    }

    public char[] c() {
        return this.f12833b;
    }

    public Q0.b d() {
        return this.f12832a;
    }

    int e() {
        return this.f12832a.l();
    }

    a f() {
        return this.f12834c;
    }

    Typeface g() {
        return this.f12835d;
    }

    void h(o oVar) {
        B0.i.f(oVar, "emoji metadata cannot be null");
        B0.i.b(oVar.c() > 0, "invalid metadata codepoint length");
        this.f12834c.c(oVar, 0, oVar.c() - 1);
    }
}
