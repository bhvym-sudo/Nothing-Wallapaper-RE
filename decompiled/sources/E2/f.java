package E2;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.android.launcher3.h;
import com.nothing.launcher.card.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final View.OnLongClickListener f1270a = new View.OnLongClickListener() { // from class: E2.c
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return f.g(view);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final View.OnLongClickListener f1271b = new View.OnLongClickListener() { // from class: E2.d
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return f.f(view);
        }
    };

    public static /* synthetic */ void c(View view, h.a aVar, boolean z9) {
    }

    public static void d(View view, com.android.launcher3.views.f fVar, C2.b bVar, p253z2.e eVar) {
        fVar.M().f0(new p233x2.a(view, bVar, fVar.getCellPosMapper().a(bVar)), eVar);
    }

    public static boolean e(com.android.launcher3.views.f fVar) {
        return (fVar == null || fVar.p().y()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean f(View view) {
        ImageView imageView;
        Drawable drawable;
        if (!(view instanceof ImageView) || (drawable = (imageView = (ImageView) view).getDrawable()) == null) {
            return false;
        }
        com.android.launcher3.views.f fVar = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(view.getContext());
        if (!e(fVar)) {
            return false;
        }
        com.android.launcher3.g gVar = new com.android.launcher3.g() { // from class: E2.e
            @Override // com.android.launcher3.g
            public final void k(View view2, h.a aVar, boolean z9) {
                f.c(view2, aVar, z9);
            }
        };
        n nVar = new n(view);
        int[] iArr = new int[2];
        fVar.J().j(imageView, iArr);
        Rect rect = new Rect();
        rect.left = (imageView.getWidth() - drawable.getIntrinsicWidth()) / 2;
        rect.right = imageView.getWidth() - rect.left;
        rect.top = (imageView.getHeight() - drawable.getIntrinsicHeight()) / 2;
        rect.bottom = imageView.getHeight() - rect.top;
        nVar.c(imageView.getDrawable(), rect, new Point(iArr[0], iArr[1]), gVar, new p253z2.e());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(View view) {
        com.android.launcher3.views.f fVar = (com.android.launcher3.views.f) com.android.launcher3.views.f.y(view.getContext());
        if (!e(fVar) || !(view.getTag() instanceof C2.b)) {
            return false;
        }
        d(view, fVar, (C2.b) view.getTag(), new p253z2.e());
        return true;
    }
}
