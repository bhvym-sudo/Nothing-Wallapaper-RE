package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.t0;
import kotlin.jvm.internal.o;
import p079h8.A;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements t0 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final View f12045O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private l f12046P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private l f12047Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private l f12048R;

    static final class a extends o implements p219v8.a {
        a() {
            super(0);
        }

        public final void a() {
            ViewFactoryHolder.this.getReleaseBlock().f(ViewFactoryHolder.this.f12045O);
            ViewFactoryHolder.this.j();
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return A.f21846a;
        }
    }

    static final class b extends o implements p219v8.a {
        b() {
            super(0);
        }

        public final void a() {
            ViewFactoryHolder.this.getResetBlock().f(ViewFactoryHolder.this.f12045O);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return A.f21846a;
        }
    }

    static final class c extends o implements p219v8.a {
        c() {
            super(0);
        }

        public final void a() {
            ViewFactoryHolder.this.getUpdateBlock().f(ViewFactoryHolder.this.f12045O);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return A.f21846a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(z.b.a aVar) {
    }

    public final P.a getDispatcher() {
        return null;
    }

    public final l getReleaseBlock() {
        return this.f12048R;
    }

    public final l getResetBlock() {
        return this.f12047Q;
    }

    @Override // androidx.compose.ui.platform.t0
    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final l getUpdateBlock() {
        return this.f12046P;
    }

    @Override // androidx.compose.ui.platform.t0
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(l lVar) {
        this.f12048R = lVar;
        setRelease(new a());
    }

    public final void setResetBlock(l lVar) {
        this.f12047Q = lVar;
        setReset(new b());
    }

    public final void setUpdateBlock(l lVar) {
        this.f12046P = lVar;
        setUpdate(new c());
    }
}
