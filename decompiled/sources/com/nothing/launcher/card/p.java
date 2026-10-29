package com.nothing.launcher.card;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import android.view.View;
import android.widget.Toast;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends com.nothing.cardhost.f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private p219v8.p f18144A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private p219v8.l f18145B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final SparseArray f18146C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Context f18147z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, p219v8.p pVar, p219v8.l lVar) {
        super(context, 1, null, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18147z = context;
        this.f18144A = pVar;
        this.f18145B = lVar;
        this.f18146C = new SparseArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(F5.m mVar, p pVar, int i10, View view) {
        p219v8.p pVar2;
        if (((mVar == null || mVar.d() != 3) && (mVar == null || mVar.d() != 2)) || (pVar2 = pVar.f18144A) == null) {
            return;
        }
        pVar2.invoke(Integer.valueOf(i10), mVar);
    }

    @Override // com.nothing.cardhost.f
    public void A() {
        super.A();
        this.f18146C.clear();
    }

    @Override // com.nothing.cardhost.f
    public void D(int i10) {
        super.D(i10);
        this.f18146C.remove(i10);
    }

    @Override // com.nothing.cardhost.f
    public void S(int i10) {
        super.S(i10);
        p219v8.l lVar = this.f18145B;
        if (lVar != null) {
            lVar.f(Integer.valueOf(i10));
        }
    }

    @Override // com.nothing.cardhost.f
    public com.nothing.cardhost.g U(Context context, final int i10, final F5.m mVar, boolean z9) {
        kotlin.jvm.internal.n.h(context, "context");
        s sVar = new s(context, this.f18145B);
        sVar.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.launcher.card.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.x0(mVar, this, i10, view);
            }
        });
        this.f18146C.put(i10, sVar);
        return sVar;
    }

    @Override // com.nothing.cardhost.f
    public void r0() {
        super.r0();
        A();
        this.f18145B = null;
        this.f18144A = null;
    }

    public final void y0(float f10) {
        SparseArray sparseArray = this.f18146C;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sparseArray.keyAt(i10);
            ((s) sparseArray.valueAt(i10)).setDeleteIconAlpha(f10);
        }
    }

    public final void z0(p030d.c launcher, int i10, F5.m metaInfo) {
        kotlin.jvm.internal.n.h(launcher, "launcher");
        kotlin.jvm.internal.n.h(metaInfo, "metaInfo");
        try {
            String strM = metaInfo.m();
            if (strM == null) {
                return;
            }
            Intent intent = new Intent("com.nothing.action.APPWIDGET_CONFIGURE");
            intent.putExtra("widget_id", i10);
            intent.putExtra("host_packagename", this.f18147z.getPackageName());
            intent.setComponent(new ComponentName(metaInfo.H(), strM));
            launcher.b(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.f18147z, com.android.launcher3.t.f15698b, 0).show();
            launcher.a().c(0, null);
        }
    }
}
