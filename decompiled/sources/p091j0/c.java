package p091j0;

import android.text.style.TtsSpan;
import p031d0.p;
import p031d0.r;
import p079h8.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final TtsSpan a(p pVar) {
        if (pVar instanceof r) {
            return b((r) pVar);
        }
        throw new m();
    }

    public static final TtsSpan b(r rVar) {
        return new TtsSpan.VerbatimBuilder(rVar.a()).build();
    }
}
