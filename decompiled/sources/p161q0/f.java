package p161q0;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.P;
import androidx.core.view.AbstractC1078j;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.C1165z;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.O;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends Activity implements InterfaceC1163x, AbstractC1078j.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final P f23794q = new P(0, 1, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1165z f23795r = new C1165z(this);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x0038 A[RETURN] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final boolean J(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation")) {
                        return true;
                    }
                    break;
                case 100470631:
                    if (str.equals("--dump-dumpable")) {
                        return true;
                    }
                    break;
                case 472614934:
                    if (str.equals("--list-dumpables")) {
                        return true;
                    }
                    break;
                case 1159329357:
                    if (str.equals("--contentcapture")) {
                        return true;
                    }
                    break;
                case 1455016274:
                    if (str.equals("--autofill")) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    protected final boolean I(String[] strArr) {
        return !J(strArr);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        n.h(event, "event");
        View decorView = getWindow().getDecorView();
        n.g(decorView, "window.decorView");
        if (AbstractC1078j.a(decorView, event)) {
            return true;
        }
        return AbstractC1078j.b(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        n.h(event, "event");
        View decorView = getWindow().getDecorView();
        n.g(decorView, "window.decorView");
        if (AbstractC1078j.a(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    public AbstractC1157q getLifecycle() {
        return this.f23795r;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O.f13331r.b(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        n.h(outState, "outState");
        this.f23795r.n(AbstractC1157q.b.CREATED);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.core.view.AbstractC1078j.a
    public boolean z(KeyEvent event) {
        n.h(event, "event");
        return super.dispatchKeyEvent(event);
    }
}
