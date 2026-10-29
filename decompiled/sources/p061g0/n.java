package p061g0;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.B;
import kotlin.jvm.internal.o;
import p079h8.h;
import p079h8.i;
import p079h8.l;

/* JADX INFO: loaded from: classes.dex */
public final class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f20957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f20958b = i.a(l.NONE, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B f20959c;

    static final class a extends o implements p219v8.a {
        a() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = n.this.f20957a.getContext().getSystemService("input_method");
            kotlin.jvm.internal.n.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    }

    public n(View view) {
        this.f20957a = view;
        this.f20959c = new B(view);
    }

    private final InputMethodManager d() {
        return (InputMethodManager) this.f20958b.getValue();
    }

    @Override // p061g0.m
    public boolean a() {
        return d().isActive(this.f20957a);
    }

    @Override // p061g0.m
    public void b(CursorAnchorInfo cursorAnchorInfo) {
        d().updateCursorAnchorInfo(this.f20957a, cursorAnchorInfo);
    }
}
