package androidx.slice.widget;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.SliceItem;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ActionRow extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f13724q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f13725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final LinearLayout f13726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f13727t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f13728u;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ SliceItem f13729q;

        a(SliceItem sliceItem) {
            this.f13729q = sliceItem;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                this.f13729q.a(null, null);
            } catch (PendingIntent.CanceledException e10) {
                e10.printStackTrace();
            }
        }
    }

    class b implements View.OnClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ SliceItem f13731q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ SliceItem f13732r;

        b(SliceItem sliceItem, SliceItem sliceItem2) {
            this.f13731q = sliceItem;
            this.f13732r = sliceItem2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActionRow.this.e(view, this.f13731q, this.f13732r.i());
        }
    }

    public ActionRow(Context context, boolean z9) {
        super(context);
        this.f13728u = -16777216;
        this.f13727t = z9;
        this.f13724q = (int) TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics());
        this.f13725r = (int) TypedValue.applyDimension(1, 12.0f, context.getResources().getDisplayMetrics());
        LinearLayout linearLayout = new LinearLayout(context);
        this.f13726s = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(linearLayout);
    }

    private ImageView a(IconCompat iconCompat, boolean z9) {
        ImageView imageView = new ImageView(getContext());
        int i10 = this.f13725r;
        imageView.setPadding(i10, i10, i10, i10);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageDrawable(iconCompat.n(getContext()));
        if (z9) {
            androidx.core.widget.i.c(imageView, ColorStateList.valueOf(this.f13728u));
        }
        imageView.setBackground(k.f(getContext(), R.attr.selectableItemBackground));
        imageView.setTag(Boolean.valueOf(z9));
        b(imageView);
        return imageView;
    }

    private void b(View view) {
        LinearLayout linearLayout = this.f13726s;
        int i10 = this.f13724q;
        linearLayout.addView(view, new LinearLayout.LayoutParams(i10, i10, 1.0f));
    }

    private void c(int i10, Context context) {
        RemoteInputView remoteInputViewC = RemoteInputView.c(context, this);
        remoteInputViewC.setVisibility(4);
        addView(remoteInputViewC, new FrameLayout.LayoutParams(-1, -1));
        remoteInputViewC.setBackgroundColor(i10);
    }

    private RemoteInputView d(View view) {
        if (view == null) {
            return null;
        }
        return (RemoteInputView) view.findViewWithTag(RemoteInputView.f13765A);
    }

    private void f(SliceItem sliceItem, SliceItem sliceItem2, SliceItem sliceItem3) {
        if (sliceItem.i().getAllowFreeFormInput()) {
            a(sliceItem2.f(), !sliceItem2.n("no_tint")).setOnClickListener(new b(sliceItem3, sliceItem));
            c(this.f13728u, getContext());
        }
    }

    private void setColor(int i10) {
        this.f13728u = i10;
        for (int i11 = 0; i11 < this.f13726s.getChildCount(); i11++) {
            View childAt = this.f13726s.getChildAt(i11);
            if (((Integer) childAt.getTag()).intValue() == 0) {
                androidx.core.widget.i.c((ImageView) childAt, ColorStateList.valueOf(this.f13728u));
            }
        }
    }

    boolean e(View view, SliceItem sliceItem, RemoteInput remoteInput) {
        if (remoteInput == null) {
            return false;
        }
        RemoteInputView remoteInputViewD = null;
        for (ViewParent parent = view.getParent().getParent(); parent != null && (!(parent instanceof View) || (remoteInputViewD = d((View) parent)) == null); parent = parent.getParent()) {
        }
        if (remoteInputViewD == null) {
            return false;
        }
        int width = view.getWidth();
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.getLayout() != null) {
                width = Math.min(width, ((int) textView.getLayout().getLineWidth(0)) + textView.getCompoundPaddingLeft() + textView.getCompoundPaddingRight());
            }
        }
        int left = view.getLeft() + (width / 2);
        int top = view.getTop() + (view.getHeight() / 2);
        int width2 = remoteInputViewD.getWidth();
        int height = remoteInputViewD.getHeight() - top;
        int i10 = width2 - left;
        remoteInputViewD.i(left, top, Math.max(Math.max(left + top, left + height), Math.max(i10 + top, i10 + height)));
        remoteInputViewD.setAction(sliceItem);
        remoteInputViewD.h(new RemoteInput[]{remoteInput}, remoteInput);
        remoteInputViewD.b();
        return true;
    }

    public void g(List list, int i10) {
        IconCompat icon;
        removeAllViews();
        this.f13726s.removeAllViews();
        addView(this.f13726s);
        if (i10 != -1) {
            setColor(i10);
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                setVisibility(getChildCount() == 0 ? 8 : 0);
                return;
            }
            p112l1.d dVar = (p112l1.d) it.next();
            if (this.f13726s.getChildCount() >= 5) {
                return;
            }
            p112l1.e eVar = (p112l1.e) dVar;
            SliceItem sliceItemF = eVar.f();
            SliceItem sliceItemD = eVar.d();
            SliceItem sliceItemH = p112l1.f.h(sliceItemF, "input");
            SliceItem sliceItemH2 = p112l1.f.h(sliceItemF, "image");
            if (sliceItemH != null && sliceItemH2 != null) {
                f(sliceItemH, sliceItemH2, sliceItemD);
            } else if (dVar.getIcon() != null && (icon = dVar.getIcon()) != null && sliceItemD != null) {
                a(icon, dVar.c() == 0).setOnClickListener(new a(sliceItemD));
            }
        }
    }
}
