package androidx.slice.widget;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class GridRowView extends SliceChildView implements View.OnClickListener, View.OnTouchListener {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final int f13734P = p122m1.d.f23139l;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final int f13735Q = p122m1.d.f23136i;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f13736A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f13737B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f13738C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f13739D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f13740E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f13741F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f13742G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f13743H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private b f13744I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private LinearLayout f13745J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private View f13746K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    int f13747L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int[] f13748M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    boolean f13749N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f13750O;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            GridRowView gridRowView = GridRowView.this;
            gridRowView.f13747L = gridRowView.getMaxCells();
            GridRowView.this.k();
            GridRowView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            GridRowView.this.f13749N = false;
            return true;
        }
    }

    public GridRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13747L = -1;
        this.f13748M = new int[2];
        this.f13750O = new a();
        Resources resources = getContext().getResources();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f13745J = linearLayout;
        linearLayout.setOrientation(0);
        addView(this.f13745J, new FrameLayout.LayoutParams(-1, -1));
        this.f13745J.setGravity(16);
        this.f13741F = resources.getDimensionPixelSize(p122m1.b.f23111l);
        this.f13739D = resources.getDimensionPixelSize(p122m1.b.f23119t);
        this.f13738C = resources.getDimensionPixelSize(p122m1.b.f23105f);
        this.f13740E = resources.getDimensionPixelSize(p122m1.b.f23104e);
        this.f13742G = resources.getDimensionPixelSize(p122m1.b.f23103d);
        this.f13743H = resources.getDimensionPixelSize(p122m1.b.f23110k);
        View view = new View(getContext());
        this.f13746K = view;
        addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    private void d(b.a aVar, int i10, int i11) {
        ArrayList arrayList;
        int i12;
        int i13;
        int i14;
        int i15 = (getMode() == 1 && this.f13744I.l()) ? 1 : 2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        ArrayList<SliceItem> arrayListA = aVar.a();
        SliceItem sliceItemC = aVar.c();
        boolean z9 = arrayListA.size() == 1;
        if (z9 || getMode() != 1) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (SliceItem sliceItem : arrayListA) {
                if ("text".equals(sliceItem.d())) {
                    arrayList2.add(sliceItem);
                }
            }
            Iterator it = arrayList2.iterator();
            while (arrayList2.size() > i15) {
                if (!((SliceItem) it.next()).m("title", "large")) {
                    it.remove();
                }
            }
            arrayList = arrayList2;
        }
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        SliceItem sliceItem2 = null;
        boolean z10 = false;
        while (i16 < arrayListA.size()) {
            SliceItem sliceItem3 = (SliceItem) arrayListA.get(i16);
            String strD = sliceItem3.d();
            int i19 = i18;
            int iG = g(sliceItem2);
            if (i17 < i15) {
                if ("text".equals(strD)) {
                    i12 = i16;
                } else {
                    i12 = i16;
                    if ("long".equals(strD)) {
                    }
                    i16 = i12 + 1;
                }
                if (arrayList == null || arrayList.contains(sliceItem3)) {
                    i13 = i17;
                    i14 = i19;
                    if (e(sliceItem3, this.f13844r, linearLayout, iG, z9)) {
                        i17 = i13 + 1;
                        sliceItem2 = sliceItem3;
                        i18 = i14;
                        z10 = true;
                    }
                    i16 = i12 + 1;
                } else {
                    i13 = i17;
                    i14 = i19;
                }
                i18 = i14;
                i17 = i13;
                i16 = i12 + 1;
            } else {
                i12 = i16;
            }
            i14 = i19;
            i13 = i17;
            if (i14 < 1 && "image".equals(sliceItem3.d()) && e(sliceItem3, this.f13844r, linearLayout, 0, z9)) {
                i18 = i14 + 1;
                sliceItem2 = sliceItem3;
                i17 = i13;
                z10 = true;
            } else {
                i18 = i14;
                i17 = i13;
            }
            i16 = i12 + 1;
        }
        if (z10) {
            CharSequence charSequenceB = aVar.b();
            if (charSequenceB != null) {
                linearLayout.setContentDescription(charSequenceB);
            }
            this.f13745J.addView(linearLayout, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (i10 != i11 - 1) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
                marginLayoutParams.setMarginEnd(this.f13742G);
                linearLayout.setLayoutParams(marginLayoutParams);
            }
            if (sliceItemC != null) {
                androidx.slice.widget.a aVar2 = new androidx.slice.widget.a(getMode(), 1, 1, this.f13736A);
                aVar2.d(2, i10, i11);
                linearLayout.setTag(new Pair(sliceItemC, aVar2));
                h(linearLayout, true);
            }
        }
    }

    private boolean e(SliceItem sliceItem, int i10, ViewGroup viewGroup, int i11, boolean z9) {
        Drawable drawableN;
        ViewGroup.LayoutParams layoutParams;
        String strD = sliceItem.d();
        Object obj = null;
        obj = null;
        obj = null;
        if ("text".equals(strD) || "long".equals(strD)) {
            boolean zS = p112l1.f.s(sliceItem, "large", "title");
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(zS ? f13734P : f13735Q, (ViewGroup) null);
            j jVar = this.f13852z;
            if (jVar != null) {
                textView.setTextSize(0, zS ? jVar.c() : jVar.b());
                textView.setTextColor(zS ? this.f13852z.j() : this.f13852z.g());
            }
            textView.setText("long".equals(strD) ? k.g(getContext(), sliceItem.h()) : sliceItem.l());
            viewGroup.addView(textView);
            textView.setPadding(0, i11, 0, 0);
            obj = textView;
        } else if ("image".equals(strD) && sliceItem.f() != null && (drawableN = sliceItem.f().n(getContext())) != null) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(drawableN);
            if (sliceItem.n("large")) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                layoutParams = new LinearLayout.LayoutParams(-1, z9 ? -1 : this.f13738C);
            } else {
                boolean zN = sliceItem.n("no_tint");
                int i12 = !zN ? this.f13741F : this.f13739D;
                imageView.setScaleType(!zN ? ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP);
                layoutParams = new LinearLayout.LayoutParams(i12, i12);
            }
            if (i10 != -1 && !sliceItem.n("no_tint")) {
                imageView.setColorFilter(i10);
            }
            viewGroup.addView(imageView, layoutParams);
            obj = imageView;
        }
        return obj != null;
    }

    private void f(int i10) {
        ViewGroup viewGroup;
        TextView textView;
        LinearLayout linearLayout = this.f13745J;
        View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
        this.f13745J.removeView(childAt);
        SliceItem sliceItemJ = this.f13744I.j();
        int childCount = this.f13745J.getChildCount();
        int i11 = this.f13747L;
        if (("slice".equals(sliceItemJ.d()) || "action".equals(sliceItemJ.d())) && sliceItemJ.j().e().size() > 0) {
            d(new b.a(sliceItemJ), childCount, i11);
            return;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        if (this.f13744I.m()) {
            viewGroup = (FrameLayout) layoutInflaterFrom.inflate(p122m1.d.f23130c, (ViewGroup) this.f13745J, false);
            viewGroup.addView(childAt, 0, new FrameLayout.LayoutParams(-1, -1));
            textView = (TextView) viewGroup.findViewById(p122m1.c.f23127h);
        } else {
            viewGroup = (LinearLayout) layoutInflaterFrom.inflate(p122m1.d.f23129b, (ViewGroup) this.f13745J, false);
            textView = (TextView) viewGroup.findViewById(p122m1.c.f23127h);
            TextView textView2 = (TextView) viewGroup.findViewById(p122m1.c.f23126g);
            j jVar = this.f13852z;
            if (jVar != null) {
                textView2.setTextSize(0, jVar.c());
                textView2.setTextColor(this.f13852z.j());
            }
        }
        this.f13745J.addView(viewGroup, new LinearLayout.LayoutParams(0, -1, 1.0f));
        textView.setText(getResources().getString(p122m1.f.f23143a, Integer.valueOf(i10)));
        androidx.slice.widget.a aVar = new androidx.slice.widget.a(getMode(), 4, 1, this.f13736A);
        aVar.d(2, childCount, i11);
        viewGroup.setTag(new Pair(sliceItemJ, aVar));
        h(viewGroup, true);
    }

    private int g(SliceItem sliceItem) {
        j jVar;
        if (sliceItem == null) {
            return 0;
        }
        if ("image".equals(sliceItem.d())) {
            return this.f13743H;
        }
        if (("text".equals(sliceItem.d()) || "long".equals(sliceItem.d())) && (jVar = this.f13852z) != null) {
            return jVar.l();
        }
        return 0;
    }

    private int getExtraBottomPadding() {
        j jVar;
        b bVar = this.f13744I;
        if (bVar == null || !bVar.m() || (!(this.f13736A == this.f13737B - 1 || getMode() == 1) || (jVar = this.f13852z) == null)) {
            return 0;
        }
        return jVar.a();
    }

    private int getExtraTopPadding() {
        j jVar;
        b bVar = this.f13744I;
        if (bVar == null || !bVar.m() || this.f13736A != 0 || (jVar = this.f13852z) == null) {
            return 0;
        }
        return jVar.d();
    }

    private void h(View view, boolean z9) {
        view.setOnClickListener(z9 ? this : null);
        view.setBackground(z9 ? k.f(getContext(), R.attr.selectableItemBackgroundBorderless) : null);
        view.setClickable(z9);
    }

    private void i(boolean z9) {
        this.f13745J.setOnTouchListener(z9 ? this : null);
        this.f13745J.setOnClickListener(z9 ? this : null);
        this.f13746K.setBackground(z9 ? k.f(getContext(), R.attr.selectableItemBackground) : null);
        this.f13745J.setClickable(z9);
    }

    private void j(MotionEvent motionEvent) {
        this.f13746K.getLocationOnScreen(this.f13748M);
        this.f13746K.getBackground().setHotspot((int) (motionEvent.getRawX() - this.f13748M[0]), (int) (motionEvent.getRawY() - this.f13748M[1]));
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f13746K.setPressed(true);
        } else if (actionMasked == 3 || actionMasked == 1 || actionMasked == 2) {
            this.f13746K.setPressed(false);
        }
    }

    private boolean l() {
        b bVar = this.f13744I;
        if (bVar == null || !bVar.n()) {
            return true;
        }
        if (getWidth() != 0) {
            this.f13747L = getMaxCells();
            return false;
        }
        this.f13749N = true;
        getViewTreeObserver().addOnPreDrawListener(this.f13750O);
        return true;
    }

    @Override // androidx.slice.widget.SliceChildView
    public void a() {
        if (this.f13749N) {
            this.f13749N = false;
            getViewTreeObserver().removeOnPreDrawListener(this.f13750O);
        }
        this.f13745J.removeAllViews();
        setLayoutDirection(2);
        i(false);
    }

    @Override // androidx.slice.widget.SliceChildView
    public void b(int i10, int i11, int i12, int i13) {
        super.b(i10, i11, i12, i13);
        this.f13745J.setPadding(i10, i11 + getExtraTopPadding(), i12, i13 + getExtraBottomPadding());
    }

    @Override // androidx.slice.widget.SliceChildView
    public void c(SliceItem sliceItem, boolean z9, int i10, int i11, SliceView.d dVar) {
        a();
        setSliceActionListener(dVar);
        this.f13736A = i10;
        this.f13737B = i11;
        this.f13744I = new b(getContext(), sliceItem);
        if (!l()) {
            k();
        }
        this.f13745J.setPadding(this.f13847u, this.f13848v + getExtraTopPadding(), this.f13849w, this.f13850x + getExtraBottomPadding());
    }

    @Override // androidx.slice.widget.SliceChildView
    public int getActualHeight() {
        b bVar = this.f13744I;
        if (bVar == null) {
            return 0;
        }
        return bVar.b() + getExtraTopPadding() + getExtraBottomPadding();
    }

    int getMaxCells() {
        b bVar = this.f13744I;
        if (bVar == null || !bVar.n() || getWidth() == 0) {
            return -1;
        }
        if (this.f13744I.e().size() > 1) {
            return getWidth() / ((this.f13744I.g() == 2 ? this.f13738C : this.f13740E) + this.f13742G);
        }
        return 1;
    }

    @Override // androidx.slice.widget.SliceChildView
    public int getSmallHeight() {
        b bVar = this.f13744I;
        if (bVar == null) {
            return 0;
        }
        return bVar.k() + getExtraTopPadding() + getExtraBottomPadding();
    }

    void k() {
        b bVar = this.f13744I;
        if (bVar == null || !bVar.n()) {
            a();
            return;
        }
        if (l()) {
            return;
        }
        if (this.f13744I.h() != null) {
            setLayoutDirection(this.f13744I.h().g());
        }
        if (this.f13744I.d() != null) {
            this.f13745J.setTag(new Pair(this.f13744I.d(), new androidx.slice.widget.a(getMode(), 3, 1, this.f13736A)));
            i(true);
        }
        CharSequence charSequenceC = this.f13744I.c();
        if (charSequenceC != null) {
            this.f13745J.setContentDescription(charSequenceC);
        }
        ArrayList arrayListE = this.f13744I.e();
        if (this.f13744I.g() == 2) {
            this.f13745J.setGravity(48);
        } else {
            this.f13745J.setGravity(16);
        }
        int i10 = this.f13747L;
        boolean z9 = this.f13744I.j() != null;
        for (int i11 = 0; i11 < arrayListE.size(); i11++) {
            if (this.f13745J.getChildCount() >= i10) {
                if (z9) {
                    f(arrayListE.size() - i10);
                    return;
                }
                return;
            }
            d((b.a) arrayListE.get(i11), i11, Math.min(arrayListE.size(), i10));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        SliceItem sliceItemI;
        Pair pair = (Pair) view.getTag();
        SliceItem sliceItem = (SliceItem) pair.first;
        if (sliceItem == null || (sliceItemI = p112l1.f.i(sliceItem, "action", null, null)) == null) {
            return;
        }
        try {
            sliceItemI.a(null, null);
        } catch (PendingIntent.CanceledException e10) {
            Log.e("GridRowView", "PendingIntent for slice cannot be sent", e10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int smallHeight = getMode() == 1 ? getSmallHeight() : getActualHeight();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(smallHeight, BasicMeasure.EXACTLY);
        this.f13745J.getLayoutParams().height = smallHeight;
        super.onMeasure(i10, iMakeMeasureSpec);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        j(motionEvent);
        return false;
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setTint(int i10) {
        super.setTint(i10);
        if (this.f13744I != null) {
            a();
            k();
        }
    }
}
