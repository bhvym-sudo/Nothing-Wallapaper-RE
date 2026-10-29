package p094j3;

import android.graphics.Rect;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p104k3.b;
import p219v8.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f22296a = new c();

    private c() {
    }

    private final void c(final View view) {
        view.post(new Runnable() { // from class: j3.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(View view) {
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.shortcut_error_dialog_button_touch_padding);
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= dimensionPixelSize;
        rect.bottom += dimensionPixelSize;
        view.setTouchDelegate(new TouchDelegate(rect, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(b bVar, View view) {
        a aVarC = bVar.c();
        if (aVarC != null) {
            aVarC.invoke();
        }
    }

    public final View e(ViewGroup parent, final b viewModel, int i10) {
        n.h(parent, "parent");
        n.h(viewModel, "viewModel");
        View viewInflate = LayoutInflater.from(new ContextThemeWrapper(parent.getContext(), viewModel.d().a())).inflate(i10, parent, false);
        n.e(viewInflate);
        c(viewInflate);
        View viewRequireViewById = viewInflate.requireViewById(R.id.text);
        n.g(viewRequireViewById, "requireViewById(...)");
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: j3.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.f(viewModel, view);
            }
        });
        p154p3.a.f23694a.a((TextView) viewRequireViewById, viewModel.e());
        return viewInflate;
    }
}
