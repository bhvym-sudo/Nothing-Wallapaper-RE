package p061g0;

import E0.a;
import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.emoji2.text.e;
import java.util.concurrent.Executor;
import p031d0.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {
    public static final Executor d(final Choreographer choreographer) {
        return new Executor() { // from class: g0.C
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                E.e(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: g0.D
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j9) {
                E.f(runnable, j9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, long j9) {
        runnable.run();
    }

    private static final boolean g(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final void h(EditorInfo editorInfo, k kVar, y yVar) {
        int iD = kVar.d();
        j.a aVar = j.f20938b;
        int i10 = 6;
        if (j.l(iD, aVar.a())) {
            if (!kVar.g()) {
                i10 = 0;
            }
        } else if (j.l(iD, aVar.e())) {
            i10 = 1;
        } else if (j.l(iD, aVar.c())) {
            i10 = 2;
        } else if (j.l(iD, aVar.d())) {
            i10 = 5;
        } else if (j.l(iD, aVar.f())) {
            i10 = 7;
        } else if (j.l(iD, aVar.g())) {
            i10 = 3;
        } else if (j.l(iD, aVar.h())) {
            i10 = 4;
        } else if (!j.l(iD, aVar.b())) {
            throw new IllegalStateException("invalid ImeAction");
        }
        editorInfo.imeOptions = i10;
        kVar.f();
        int iE = kVar.e();
        q.a aVar2 = q.f20967a;
        if (q.k(iE, aVar2.h())) {
            editorInfo.inputType = 1;
        } else if (q.k(iE, aVar2.a())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (q.k(iE, aVar2.d())) {
            editorInfo.inputType = 2;
        } else if (q.k(iE, aVar2.g())) {
            editorInfo.inputType = 3;
        } else if (q.k(iE, aVar2.i())) {
            editorInfo.inputType = 17;
        } else if (q.k(iE, aVar2.c())) {
            editorInfo.inputType = 33;
        } else if (q.k(iE, aVar2.f())) {
            editorInfo.inputType = 129;
        } else if (q.k(iE, aVar2.e())) {
            editorInfo.inputType = 18;
        } else {
            if (!q.k(iE, aVar2.b())) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!kVar.g() && g(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (j.l(kVar.d(), aVar.a())) {
                editorInfo.imeOptions |= BasicMeasure.EXACTLY;
            }
        }
        if (g(editorInfo.inputType, 1)) {
            int iC = kVar.c();
            p.a aVar3 = p.f20961a;
            if (p.f(iC, aVar3.a())) {
                editorInfo.inputType |= 4096;
            } else if (p.f(iC, aVar3.d())) {
                editorInfo.inputType |= 8192;
            } else if (p.f(iC, aVar3.c())) {
                editorInfo.inputType |= 16384;
            }
            if (kVar.b()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = n.j(yVar.c());
        editorInfo.initialSelEnd = n.g(yVar.c());
        a.a(editorInfo, yVar.d());
        editorInfo.imeOptions |= 33554432;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (e.i()) {
            e.c().v(editorInfo);
        }
    }
}
