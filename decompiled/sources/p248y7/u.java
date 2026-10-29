package p248y7;

import C2.b;
import F2.w;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import com.android.launcher3.Workspace;
import com.android.launcher3.dragndrop.DragLayer;
import com.android.launcher3.dragndrop.a;
import com.android.launcher3.m;
import com.android.launcher3.views.f;
import com.nothing.launcher.card.p;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends ContextWrapper implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f f30553q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, f activityContext) {
        super(context);
        n.h(context, "context");
        n.h(activityContext, "activityContext");
        this.f30553q = activityContext;
    }

    @Override // com.android.launcher3.views.f
    public boolean A() {
        return this.f30553q.A();
    }

    @Override // com.android.launcher3.views.f
    public DragLayer J() {
        DragLayer dragLayerJ = this.f30553q.J();
        n.g(dragLayerJ, "getDragLayer(...)");
        return dragLayerJ;
    }

    @Override // com.android.launcher3.views.f
    public com.android.launcher3.f K() {
        com.android.launcher3.f fVarK = this.f30553q.K();
        n.g(fVarK, "getDeviceProfile(...)");
        return fVarK;
    }

    @Override // com.android.launcher3.views.f
    public Workspace M() {
        Workspace workspaceM = this.f30553q.M();
        n.g(workspaceM, "getWorkspace(...)");
        return workspaceM;
    }

    @Override // com.android.launcher3.views.f
    public boolean O() {
        return this.f30553q.O();
    }

    @Override // com.android.launcher3.views.f
    public boolean Q() {
        return this.f30553q.Q();
    }

    @Override // com.android.launcher3.views.f
    public p R() {
        p pVarR = this.f30553q.R();
        n.g(pVarR, "getCardWidgetHost(...)");
        return pVarR;
    }

    @Override // com.android.launcher3.views.f
    public void U(m mVar, int[] iArr, int i10, int i11) {
        if (mVar != null) {
            mVar.f592D = 4;
        }
        this.f30553q.U(mVar, iArr, i10, i11);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String name) {
        n.h(name, "name");
        return n.d("layout_inflater", name) ? LayoutInflater.from(getBaseContext()).cloneInContext(this) : super.getSystemService(name);
    }

    @Override // com.android.launcher3.views.f
    public boolean h() {
        return this.f30553q.h();
    }

    @Override // com.android.launcher3.views.f
    public void k(b info) {
        n.h(info, "info");
        this.f30553q.k(info);
    }

    @Override // com.android.launcher3.views.f
    public void o(b itemInfo) {
        n.h(itemInfo, "itemInfo");
        this.f30553q.o(itemInfo);
    }

    @Override // com.android.launcher3.views.f
    public a p() {
        a aVarP = this.f30553q.p();
        n.g(aVarP, "getDragController(...)");
        return aVarP;
    }

    @Override // com.android.launcher3.views.f
    public w[] x() {
        w[] wVarArrX = this.f30553q.x();
        n.g(wVarArrX, "createTouchControllers(...)");
        return wVarArrX;
    }
}
