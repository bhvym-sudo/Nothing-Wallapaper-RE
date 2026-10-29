package X7;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f9005x = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Context f9006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f9007r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ImageView f9008s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f9009t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f9010u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private FrameLayout f9011v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private AlertDialog f9012w;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9013a;

        static {
            int[] iArr = new int[W7.b.values().length];
            try {
                iArr[W7.b.Warning.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[W7.b.Prioritised.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9013a = iArr;
        }
    }

    public i(Context context, List buttons, boolean z9) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(buttons, "buttons");
        this.f9006q = context;
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f9006q);
        View viewInflate = LayoutInflater.from(this.f9006q).inflate(V7.c.f8226d, (ViewGroup) null);
        this.f9007r = viewInflate;
        kotlin.jvm.internal.n.e(viewInflate);
        l(viewInflate);
        g(this.f9006q, buttons, z9);
        builder.setView(this.f9007r);
        AlertDialog alertDialogCreate = builder.create();
        Window window = alertDialogCreate.getWindow();
        if (window != null) {
            window.setDecorFitsSystemWindows(false);
            window.getDecorView().setSystemUiVisibility(1792);
        }
        this.f9012w = alertDialogCreate;
        Window window2 = alertDialogCreate.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(p171r0.a.d(this.f9006q, V7.a.f8211a));
        }
        AlertDialog alertDialog = this.f9012w;
        if (alertDialog != null) {
            alertDialog.setOnCancelListener(this);
        }
    }

    private final int f(W7.b bVar) {
        int i10 = b.f9013a[bVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? V7.d.f8228b : V7.d.f8227a;
        }
        return V7.d.f8229c;
    }

    private final void g(Context context, final List list, boolean z9) {
        if (list.isEmpty()) {
            FrameLayout frameLayout = this.f9011v;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            }
            return;
        }
        FrameLayout frameLayout2 = this.f9011v;
        if (frameLayout2 != null) {
            frameLayout2.removeAllViews();
        }
        if (list.size() == 1) {
            View viewInflate = LayoutInflater.from(context).inflate(V7.c.f8224b, (ViewGroup) null);
            View viewRequireViewById = viewInflate.requireViewById(V7.b.f8219h);
            kotlin.jvm.internal.n.g(viewRequireViewById, "requireViewById(...)");
            TextView textView = (TextView) viewRequireViewById;
            textView.setText(((W7.a) list.get(0)).b());
            textView.setTextAppearance(f(((W7.a) list.get(0)).d()));
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: X7.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i.h(list, this, view);
                }
            });
            viewInflate.setClickable(((W7.a) list.get(0)).a());
            viewInflate.setAlpha(((W7.a) list.get(0)).a() ? 1.0f : 0.4f);
            FrameLayout frameLayout3 = this.f9011v;
            if (frameLayout3 != null) {
                frameLayout3.addView(viewInflate);
            }
        } else {
            View viewInflate2 = (z9 || s(list)) ? LayoutInflater.from(context).inflate(V7.c.f8225c, (ViewGroup) null) : LayoutInflater.from(context).inflate(V7.c.f8223a, (ViewGroup) null);
            int iMin = Math.min(3, list.size());
            final int i10 = 0;
            while (i10 < iMin) {
                boolean z10 = i10 == 0;
                boolean z11 = i10 == list.size() - 1;
                if (z10) {
                    View viewRequireViewById2 = viewInflate2.requireViewById(V7.b.f8221j);
                    kotlin.jvm.internal.n.g(viewRequireViewById2, "requireViewById(...)");
                    FrameLayout frameLayout4 = (FrameLayout) viewRequireViewById2;
                    View viewRequireViewById3 = viewInflate2.requireViewById(V7.b.f8220i);
                    kotlin.jvm.internal.n.g(viewRequireViewById3, "requireViewById(...)");
                    TextView textView2 = (TextView) viewRequireViewById3;
                    textView2.setText(((W7.a) list.get(i10)).b());
                    textView2.setTextAppearance(f(((W7.a) list.get(i10)).d()));
                    frameLayout4.setOnClickListener(new View.OnClickListener() { // from class: X7.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            i.i(list, i10, this, view);
                        }
                    });
                    frameLayout4.setClickable(((W7.a) list.get(i10)).a());
                    frameLayout4.setAlpha(((W7.a) list.get(i10)).a() ? 1.0f : 0.4f);
                } else if (z11) {
                    View viewRequireViewById4 = viewInflate2.requireViewById(V7.b.f8216e);
                    kotlin.jvm.internal.n.g(viewRequireViewById4, "requireViewById(...)");
                    FrameLayout frameLayout5 = (FrameLayout) viewRequireViewById4;
                    View viewRequireViewById5 = viewInflate2.requireViewById(V7.b.f8215d);
                    kotlin.jvm.internal.n.g(viewRequireViewById5, "requireViewById(...)");
                    TextView textView3 = (TextView) viewRequireViewById5;
                    textView3.setText(((W7.a) list.get(i10)).b());
                    textView3.setTextAppearance(f(((W7.a) list.get(i10)).d()));
                    frameLayout5.setOnClickListener(new View.OnClickListener() { // from class: X7.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            i.j(list, i10, this, view);
                        }
                    });
                    frameLayout5.setClickable(((W7.a) list.get(i10)).a());
                    frameLayout5.setAlpha(((W7.a) list.get(i10)).a() ? 1.0f : 0.4f);
                } else {
                    View viewRequireViewById6 = viewInflate2.requireViewById(V7.b.f8218g);
                    kotlin.jvm.internal.n.g(viewRequireViewById6, "requireViewById(...)");
                    FrameLayout frameLayout6 = (FrameLayout) viewRequireViewById6;
                    View viewRequireViewById7 = viewInflate2.requireViewById(V7.b.f8217f);
                    kotlin.jvm.internal.n.g(viewRequireViewById7, "requireViewById(...)");
                    TextView textView4 = (TextView) viewRequireViewById7;
                    textView4.setText(((W7.a) list.get(i10)).b());
                    textView4.setTextAppearance(f(((W7.a) list.get(i10)).d()));
                    frameLayout6.setOnClickListener(new View.OnClickListener() { // from class: X7.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            i.k(list, i10, this, view);
                        }
                    });
                    frameLayout6.setVisibility(0);
                    frameLayout6.setClickable(((W7.a) list.get(i10)).a());
                    frameLayout6.setAlpha(((W7.a) list.get(i10)).a() ? 1.0f : 0.4f);
                }
                i10++;
            }
            FrameLayout frameLayout7 = this.f9011v;
            if (frameLayout7 != null) {
                frameLayout7.addView(viewInflate2);
            }
        }
        FrameLayout frameLayout8 = this.f9011v;
        if (frameLayout8 != null) {
            frameLayout8.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(List infos, i this$0, View view) {
        kotlin.jvm.internal.n.h(infos, "$infos");
        kotlin.jvm.internal.n.h(this$0, "this$0");
        ((W7.a) infos.get(0)).c().invoke();
        AlertDialog alertDialog = this$0.f9012w;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(List infos, int i10, i this$0, View view) {
        kotlin.jvm.internal.n.h(infos, "$infos");
        kotlin.jvm.internal.n.h(this$0, "this$0");
        ((W7.a) infos.get(i10)).c().invoke();
        AlertDialog alertDialog = this$0.f9012w;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(List infos, int i10, i this$0, View view) {
        kotlin.jvm.internal.n.h(infos, "$infos");
        kotlin.jvm.internal.n.h(this$0, "this$0");
        ((W7.a) infos.get(i10)).c().invoke();
        AlertDialog alertDialog = this$0.f9012w;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(List infos, int i10, i this$0, View view) {
        kotlin.jvm.internal.n.h(infos, "$infos");
        kotlin.jvm.internal.n.h(this$0, "this$0");
        ((W7.a) infos.get(i10)).c().invoke();
        AlertDialog alertDialog = this$0.f9012w;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    private final void l(View view) {
        this.f9008s = (ImageView) view.requireViewById(V7.b.f8222k);
        this.f9009t = (TextView) view.requireViewById(V7.b.f8214c);
        this.f9010u = (TextView) view.requireViewById(V7.b.f8213b);
        this.f9011v = (FrameLayout) view.requireViewById(V7.b.f8212a);
    }

    private final boolean m(TextView textView) {
        Layout layout = textView.getLayout();
        if (layout == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i10 = 0; i10 < lineCount; i10++) {
            if (layout.getEllipsisCount(i10) > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean s(List list) {
        float f10;
        Y7.a.C0342a c0342a = Y7.a.f9377a;
        int iA = c0342a.a(this.f9006q.getResources().getConfiguration().screenWidthDp);
        float f11 = 2.0f;
        int iA2 = c0342a.a(2.0f);
        int iA3 = c0342a.a(16.0f);
        View viewRequireViewById = LayoutInflater.from(this.f9006q).inflate(V7.c.f8223a, (ViewGroup) null).requireViewById(V7.b.f8220i);
        kotlin.jvm.internal.n.g(viewRequireViewById, "requireViewById(...)");
        TextView textView = (TextView) viewRequireViewById;
        if (list.size() > 2) {
            f10 = (iA - (iA3 * 4)) - (iA2 * 2);
            f11 = 3.0f;
        } else {
            f10 = (iA - (iA3 * 4)) - iA2;
        }
        float f12 = (f10 / f11) - (iA3 * 2);
        int iMin = Math.min(3, list.size());
        for (int i10 = 0; i10 < iMin; i10++) {
            textView.setText(((W7.a) list.get(i10)).b());
            int i11 = (int) f12;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11, BasicMeasure.EXACTLY), 0);
            textView.layout(0, 0, i11, textView.getMeasuredHeight());
            if (m(textView)) {
                return true;
            }
        }
        return false;
    }

    public final AlertDialog e() {
        return this.f9012w;
    }

    public final void n(boolean z9) {
        AlertDialog alertDialog = this.f9012w;
        if (alertDialog != null) {
            alertDialog.setCancelable(z9);
        }
    }

    public final void o(boolean z9) {
        AlertDialog alertDialog = this.f9012w;
        if (alertDialog != null) {
            alertDialog.setCanceledOnTouchOutside(z9);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        AlertDialog alertDialog = this.f9012w;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public final void p(String content) {
        kotlin.jvm.internal.n.h(content, "content");
        TextView textView = this.f9010u;
        if (textView != null) {
            textView.setText(content);
        }
        TextView textView2 = this.f9010u;
        if (textView2 != null) {
            textView2.setVisibility(content.length() > 0 ? 0 : 8);
        }
    }

    public final void q(String title) {
        kotlin.jvm.internal.n.h(title, "title");
        title.length();
        TextView textView = this.f9009t;
        if (textView != null) {
            textView.setText(title);
        }
        TextView textView2 = this.f9009t;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    public final void r() {
        AlertDialog alertDialog = this.f9012w;
        if (alertDialog != null) {
            alertDialog.show();
        }
        AlertDialog alertDialog2 = this.f9012w;
        Window window = alertDialog2 != null ? alertDialog2.getWindow() : null;
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = -1;
            window.setAttributes(layoutParams);
        }
    }
}
