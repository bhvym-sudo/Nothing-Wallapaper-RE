package D7;

import F2.AbstractC0797d;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.android.launcher3.g;
import com.nothing.wallpaper.R;
import java.util.function.Consumer;
import p248y7.u;
import p253z2.e;
import p253z2.h;
import p253z2.j;

/* JADX INFO: loaded from: classes2.dex */
public class c extends com.android.launcher3.dragndrop.a {
    public c(u uVar) {
        super(uVar);
    }

    public static /* synthetic */ void F(MotionEvent motionEvent) {
    }

    @Override // com.android.launcher3.dragndrop.a
    protected h C(Drawable drawable, View view, j jVar, int i10, int i11, g gVar, C2.b bVar, Rect rect, float f10, float f11, e eVar) {
        this.f15517u = eVar;
        Point point = eVar.f30656c;
        if (point != null) {
            Point point2 = this.f15519w;
            Point point3 = this.f15518v;
            int i12 = point.x;
            point3.x = i12;
            point2.x = i12;
            int i13 = point.y;
            point3.y = i13;
            point2.y = i13;
        }
        Point point4 = this.f15518v;
        int i14 = point4.x - i10;
        int i15 = point4.y - i11;
        int i16 = rect == null ? 0 : rect.left;
        int i17 = rect == null ? 0 : rect.top;
        this.f15508B = null;
        com.android.launcher3.h.a aVar = new com.android.launcher3.h.a(((u) this.f15513q).getApplicationContext());
        this.f15521y = aVar;
        aVar.f15605m = jVar;
        this.f15517u.getClass();
        this.f15511E = false;
        float dimensionPixelSize = this.f15511E ? ((u) this.f15513q).getResources().getDimensionPixelSize(R.dimen.pre_drag_view_scale) : 0.0f;
        com.android.launcher3.h.a aVar2 = this.f15521y;
        d dVar = drawable != null ? new d((u) this.f15513q, drawable, i14, i15, f10, f11, dimensionPixelSize) : new d((u) this.f15513q, view, view.getMeasuredWidth(), view.getMeasuredHeight(), i14, i15, f10, f11, dimensionPixelSize);
        aVar2.f15598f = dVar;
        com.android.launcher3.h.a aVar3 = this.f15521y;
        aVar3.f15597e = false;
        Point point5 = this.f15518v;
        aVar3.f15595c = point5.x - (i10 + i16);
        aVar3.f15596d = point5.y - (i11 + i17);
        this.f15516t = com.android.launcher3.dragndrop.b.a(this, this.f15517u, new Consumer() { // from class: D7.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c.F((MotionEvent) obj);
            }
        });
        if (!this.f15517u.f30654a) {
            this.f15521y.f15604l = p213v2.d.d(dVar);
        }
        com.android.launcher3.h.a aVar4 = this.f15521y;
        aVar4.f15601i = gVar;
        aVar4.f15599g = bVar;
        aVar4.f15600h = bVar.f();
        this.f15517u.getClass();
        if (rect != null) {
            dVar.setDragRegion(new Rect(rect));
        }
        ((u) this.f15513q).J().performHapticFeedback(0);
        Point point6 = this.f15519w;
        dVar.q(point6.x, point6.y);
        this.f15510D = 0;
        if (this.f15511E) {
            this.f15517u.getClass();
        } else {
            i();
        }
        Point point7 = this.f15519w;
        x(point7.x, point7.y);
        if (!((u) this.f15513q).A() && eVar.f30656c == null) {
            AbstractC0797d.f1557e.c(new Runnable() { // from class: D7.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1134q.j();
                }
            });
        }
        return dVar;
    }

    @Override // com.android.launcher3.dragndrop.a
    protected void r() {
    }

    @Override // com.android.launcher3.dragndrop.a
    protected com.android.launcher3.h u(int[] iArr) {
        ((u) this.f15513q).J().p(((u) this.f15513q).M(), iArr);
        return ((u) this.f15513q).M();
    }
}
