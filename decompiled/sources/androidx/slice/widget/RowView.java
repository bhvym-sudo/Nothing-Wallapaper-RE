package androidx.slice.widget;

import android.R;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.graphics.drawable.IconCompat;
import androidx.slice.SliceItem;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class RowView extends SliceChildView implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final boolean f13782p0 = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private LinearLayout f13783A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private LinearLayout f13784B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private LinearLayout f13785C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private TextView f13786D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private TextView f13787E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private TextView f13788F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private View f13789G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private ArrayMap f13790H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private ArrayMap f13791I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private LinearLayout f13792J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private View f13793K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private ProgressBar f13794L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private ProgressBar f13795M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    protected Set f13796N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f13797O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    int f13798P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    e f13799Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private p112l1.e f13800R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private SliceItem f13801S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f13802T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private List f13803U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private boolean f13804V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f13805W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    boolean f13806a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    boolean f13807b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    boolean f13808c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    Handler f13809d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    long f13810e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    int f13811f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    int f13812g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private SliceItem f13813h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f13814i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f13815j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f13816k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f13817l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f13818m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    Runnable f13819n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private SeekBar.OnSeekBarChangeListener f13820o0;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Button f13821q;

        a(Button button) {
            this.f13821q = button;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                RowView.this.getClass();
                RowView rowView = RowView.this;
                rowView.f13797O = rowView.f13799Q.k().b(RowView.this.getContext(), null);
                RowView rowView2 = RowView.this;
                if (rowView2.f13797O) {
                    SliceActionView.b bVar = rowView2.f13851y;
                    if (bVar != null) {
                        bVar.a(rowView2.f13799Q.k(), RowView.this.f13798P);
                    }
                    RowView rowView3 = RowView.this;
                    rowView3.f13796N.add(rowView3.f13799Q.k());
                    this.f13821q.setVisibility(8);
                }
                RowView.this.o();
            } catch (PendingIntent.CanceledException e10) {
                Log.e("RowView", "PendingIntent for slice cannot be sent", e10);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RowView.this.l();
            RowView.this.f13808c0 = false;
        }
    }

    class c implements SeekBar.OnSeekBarChangeListener {
        c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z9) {
            RowView rowView = RowView.this;
            rowView.f13811f0 = i10 + rowView.f13812g0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            RowView rowView2 = RowView.this;
            long j9 = rowView2.f13810e0;
            if (j9 != 0 && jCurrentTimeMillis - j9 > 200) {
                rowView2.f13808c0 = false;
                rowView2.f13809d0.removeCallbacks(rowView2.f13819n0);
                RowView.this.l();
            } else {
                if (rowView2.f13808c0) {
                    return;
                }
                rowView2.f13808c0 = true;
                rowView2.f13809d0.postDelayed(rowView2.f13819n0, 200L);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            RowView.this.f13806a0 = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            RowView rowView = RowView.this;
            rowView.f13806a0 = false;
            if (rowView.f13808c0 || rowView.f13807b0) {
                rowView.f13808c0 = false;
                rowView.f13807b0 = false;
                rowView.f13809d0.removeCallbacks(rowView.f13819n0);
                RowView rowView2 = RowView.this;
                int progress = seekBar.getProgress();
                RowView rowView3 = RowView.this;
                rowView2.f13811f0 = progress + rowView3.f13812g0;
                rowView3.l();
            }
        }
    }

    public RowView(Context context) {
        super(context);
        this.f13790H = new ArrayMap();
        this.f13791I = new ArrayMap();
        this.f13796N = new HashSet();
        this.f13819n0 = new b();
        this.f13820o0 = new c();
        this.f13815j0 = getContext().getResources().getDimensionPixelSize(p122m1.b.f23111l);
        this.f13814i0 = getContext().getResources().getDimensionPixelSize(p122m1.b.f23119t);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(p122m1.d.f23137j, (ViewGroup) this, false);
        this.f13783A = linearLayout;
        addView(linearLayout);
        this.f13784B = (LinearLayout) findViewById(p122m1.c.f23122c);
        this.f13785C = (LinearLayout) findViewById(R.id.content);
        this.f13786D = (TextView) findViewById(R.id.title);
        this.f13787E = (TextView) findViewById(R.id.summary);
        this.f13788F = (TextView) findViewById(p122m1.c.f23123d);
        this.f13789G = findViewById(p122m1.c.f23121b);
        this.f13795M = (ProgressBar) findViewById(p122m1.c.f23120a);
        k.i(getContext(), this.f13795M);
        this.f13792J = (LinearLayout) findViewById(R.id.widget_frame);
        this.f13816k0 = context.getResources().getDimensionPixelSize(p122m1.b.f23115p);
    }

    private void d(p112l1.e eVar, int i10, ViewGroup viewGroup, boolean z9) {
        SliceActionView sliceActionView = new SliceActionView(getContext());
        viewGroup.addView(sliceActionView);
        if (viewGroup.getVisibility() == 8) {
            viewGroup.setVisibility(0);
        }
        boolean zB = eVar.b();
        androidx.slice.widget.a aVar = new androidx.slice.widget.a(getMode(), !zB ? 1 : 0, zB ? 3 : 0, this.f13798P);
        if (z9) {
            aVar.d(0, 0, 1);
        }
        sliceActionView.c(eVar, aVar, null, i10, this.f13851y);
        if (this.f13796N.contains(eVar.f())) {
            sliceActionView.setLoading(true);
        }
        if (zB) {
            this.f13790H.put(eVar, sliceActionView);
        } else {
            this.f13791I.put(eVar, sliceActionView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View, android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.slice.widget.RowView, androidx.slice.widget.SliceChildView] */
    private boolean e(SliceItem sliceItem, int i10, boolean z9) {
        IconCompat iconCompatF;
        SliceItem sliceItem2;
        boolean zN;
        ?? r9 = z9 ? this.f13784B : this.f13792J;
        if ("slice".equals(sliceItem.d()) || "action".equals(sliceItem.d())) {
            if (sliceItem.n("shortcut")) {
                d(new p112l1.e(sliceItem), i10, r9, z9);
                return true;
            }
            if (sliceItem.j().e().size() == 0) {
                return false;
            }
            sliceItem = (SliceItem) sliceItem.j().e().get(0);
        }
        ?? textView = 0;
        if ("image".equals(sliceItem.d())) {
            iconCompatF = sliceItem.f();
            zN = sliceItem.n("no_tint");
            sliceItem2 = null;
        } else {
            if ("long".equals(sliceItem.d())) {
                sliceItem2 = sliceItem;
                iconCompatF = null;
            } else {
                iconCompatF = null;
                sliceItem2 = null;
            }
            zN = false;
        }
        if (iconCompatF != null) {
            textView = new ImageView(getContext());
            textView.setImageDrawable(iconCompatF.n(getContext()));
            if (!zN && i10 != -1) {
                textView.setColorFilter(i10);
            }
            r9.addView(textView);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            int i11 = this.f13814i0;
            layoutParams.width = i11;
            layoutParams.height = i11;
            textView.setLayoutParams(layoutParams);
            int i12 = !zN ? this.f13815j0 / 2 : 0;
            textView.setPadding(i12, i12, i12, i12);
        } else if (sliceItem2 != null) {
            textView = new TextView(getContext());
            textView.setText(k.g(getContext(), sliceItem.h()));
            j jVar = this.f13852z;
            if (jVar != null) {
                textView.setTextSize(0, jVar.h());
                textView.setTextColor(this.f13852z.g());
            }
            r9.addView(textView);
        }
        return textView != 0;
    }

    private void f(SliceItem sliceItem) {
        Drawable drawableN;
        if (this.f13809d0 == null) {
            this.f13809d0 = new Handler();
        }
        boolean zEquals = "action".equals(sliceItem.d());
        ProgressBar seekBar = zEquals ? new SeekBar(getContext()) : new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
        Drawable drawableR = p201u0.a.r(seekBar.getProgressDrawable());
        int i10 = this.f13844r;
        if (i10 != -1 && drawableR != null) {
            p201u0.a.n(drawableR, i10);
            seekBar.setProgressDrawable(drawableR);
        }
        SliceItem sliceItemP = p112l1.f.p(sliceItem, "int", "max");
        if (sliceItemP != null) {
            seekBar.setMax(sliceItemP.g() - this.f13812g0);
        }
        seekBar.setProgress(this.f13811f0);
        seekBar.setVisibility(0);
        addView(seekBar);
        this.f13794L = seekBar;
        if (zEquals) {
            SliceItem sliceItemF = this.f13799Q.f();
            SeekBar seekBar2 = (SeekBar) this.f13794L;
            if (sliceItemF != null && sliceItemF.f() != null && (drawableN = sliceItemF.f().n(getContext())) != null) {
                seekBar2.setThumb(drawableN);
            }
            Drawable drawableR2 = p201u0.a.r(seekBar2.getThumb());
            int i11 = this.f13844r;
            if (i11 != -1 && drawableR2 != null) {
                p201u0.a.n(drawableR2, i11);
                seekBar2.setThumb(drawableR2);
            }
            seekBar2.setOnSeekBarChangeListener(this.f13820o0);
        }
        q();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    private void g(boolean z9) {
        String string;
        CharSequence charSequenceI;
        if (this.f13799Q == null) {
            return;
        }
        SliceItem sliceItemO = getMode() == 1 ? this.f13799Q.o() : this.f13799Q.n();
        if (this.f13845s) {
            long j9 = this.f13846t;
            if (j9 == -1 || (charSequenceI = i(j9)) == null) {
                string = null;
            } else {
                string = getResources().getString(p122m1.f.f23144b, charSequenceI);
            }
        } else {
            string = null;
        }
        CharSequence charSequenceL = sliceItemO != null ? sliceItemO.l() : null;
        boolean z10 = !TextUtils.isEmpty(charSequenceL) || (sliceItemO != null && sliceItemO.n("partial"));
        if (z10) {
            this.f13787E.setText(charSequenceL);
            j jVar = this.f13852z;
            if (jVar != null) {
                this.f13787E.setTextSize(0, this.f13802T ? jVar.e() : jVar.h());
                this.f13787E.setTextColor(this.f13852z.g());
                this.f13787E.setPadding(0, this.f13802T ? this.f13852z.m() : this.f13852z.n(), 0, 0);
            }
        }
        if (string != null) {
            if (!TextUtils.isEmpty(charSequenceL)) {
                string = " · " + ((Object) string);
            }
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new StyleSpan(2), 0, string.length(), 0);
            this.f13788F.setText(spannableString);
            j jVar2 = this.f13852z;
            if (jVar2 != null) {
                this.f13788F.setTextSize(0, this.f13802T ? jVar2.e() : jVar2.h());
                this.f13788F.setTextColor(this.f13852z.g());
            }
        }
        this.f13788F.setVisibility(TextUtils.isEmpty(string) ? 8 : 0);
        this.f13787E.setVisibility(z10 ? 0 : 8);
        int i10 = ((this.f13798P <= 0 && !this.f13805W) || z9 || !z10 || !TextUtils.isEmpty(string)) ? 1 : 2;
        this.f13787E.setSingleLine(i10 == 1);
        this.f13787E.setMaxLines(i10);
        this.f13787E.requestLayout();
        this.f13788F.requestLayout();
    }

    private int getRowContentHeight() {
        int smallHeight = (getMode() == 1 || this.f13804V) ? getSmallHeight() : getActualHeight();
        return this.f13794L != null ? smallHeight - this.f13816k0 : smallHeight;
    }

    private void h(SliceItem sliceItem) {
        if (sliceItem == null) {
            this.f13812g0 = 0;
            this.f13811f0 = 0;
            return;
        }
        this.f13813h0 = sliceItem;
        SliceItem sliceItemP = p112l1.f.p(sliceItem, "int", "min");
        int iG = sliceItemP != null ? sliceItemP.g() : 0;
        this.f13812g0 = iG;
        SliceItem sliceItemP2 = p112l1.f.p(this.f13813h0, "int", "value");
        if (sliceItemP2 != null) {
            this.f13811f0 = sliceItemP2.g() - iG;
        }
    }

    private CharSequence i(long j9) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j9;
        if (jCurrentTimeMillis > 31449600000L) {
            int i10 = (int) (jCurrentTimeMillis / 31449600000L);
            return getResources().getQuantityString(p122m1.e.f23142c, i10, Integer.valueOf(i10));
        }
        if (jCurrentTimeMillis > 86400000) {
            int i11 = (int) (jCurrentTimeMillis / 86400000);
            return getResources().getQuantityString(p122m1.e.f23140a, i11, Integer.valueOf(i11));
        }
        if (jCurrentTimeMillis <= 60000) {
            return null;
        }
        int i12 = (int) (jCurrentTimeMillis / 60000);
        return getResources().getQuantityString(p122m1.e.f23141b, i12, Integer.valueOf(i12));
    }

    private void j(boolean z9) {
        boolean z10 = z9 && this.f13806a0;
        if (!z10) {
            k();
        }
        if (this.f13799Q.g() != null) {
            setLayoutDirection(this.f13799Q.g().g());
        }
        if (this.f13799Q.s()) {
            n();
            return;
        }
        CharSequence charSequenceD = this.f13799Q.d();
        if (charSequenceD != null) {
            this.f13785C.setContentDescription(charSequenceD);
        }
        SliceItem sliceItemM = this.f13799Q.m();
        this.f13801S = sliceItemM;
        boolean zE = sliceItemM != null && this.f13798P > 0;
        if (zE) {
            zE = e(sliceItemM, this.f13844r, true);
        }
        this.f13784B.setVisibility(zE ? 0 : 8);
        SliceItem sliceItemP = this.f13799Q.p();
        if (sliceItemP != null) {
            this.f13786D.setText(sliceItemP.l());
        }
        j jVar = this.f13852z;
        if (jVar != null) {
            this.f13786D.setTextSize(0, this.f13802T ? jVar.f() : jVar.k());
            this.f13786D.setTextColor(this.f13852z.j());
        }
        this.f13786D.setVisibility(sliceItemP != null ? 0 : 8);
        g(sliceItemP != null);
        SliceItem sliceItemI = this.f13799Q.i();
        if (sliceItemI != null && sliceItemI != this.f13801S) {
            p112l1.e eVar = new p112l1.e(sliceItemI);
            this.f13800R = eVar;
            if (eVar.b()) {
                d(this.f13800R, this.f13844r, this.f13792J, false);
                m(this.f13783A, true);
                return;
            }
        }
        SliceItem sliceItemJ = this.f13799Q.j();
        if (sliceItemJ == null) {
            p();
            o();
            return;
        }
        if (this.f13800R != null) {
            m(this.f13783A, true);
        }
        if (z10) {
            this.f13813h0 = sliceItemJ;
        } else {
            h(sliceItemJ);
            f(sliceItemJ);
        }
    }

    private void k() {
        this.f13783A.setVisibility(0);
        setLayoutDirection(2);
        m(this.f13783A, false);
        m(this.f13785C, false);
        this.f13784B.removeAllViews();
        this.f13792J.removeAllViews();
        this.f13792J.setVisibility(8);
        this.f13786D.setText((CharSequence) null);
        this.f13787E.setText((CharSequence) null);
        this.f13788F.setText((CharSequence) null);
        this.f13788F.setVisibility(8);
        this.f13790H.clear();
        this.f13791I.clear();
        this.f13800R = null;
        this.f13801S = null;
        this.f13789G.setVisibility(8);
        View view = this.f13793K;
        if (view != null) {
            this.f13783A.removeView(view);
            this.f13793K = null;
        }
        this.f13806a0 = false;
        this.f13807b0 = false;
        this.f13813h0 = null;
        this.f13812g0 = 0;
        this.f13811f0 = 0;
        this.f13810e0 = 0L;
        this.f13809d0 = null;
        ProgressBar progressBar = this.f13794L;
        if (progressBar != null) {
            removeView(progressBar);
            this.f13794L = null;
        }
        this.f13795M.setVisibility(8);
    }

    private void m(View view, boolean z9) {
        view.setOnClickListener(z9 ? this : null);
        view.setBackground(z9 ? k.f(getContext(), R.attr.selectableItemBackground) : null);
        view.setClickable(z9);
    }

    private void n() {
        Button button = (Button) LayoutInflater.from(getContext()).inflate(p122m1.d.f23135h, (ViewGroup) this, false);
        button.setOnClickListener(new a(button));
        int i10 = this.f13844r;
        if (i10 != -1) {
            button.setTextColor(i10);
        }
        this.f13793K = button;
        this.f13783A.addView(button);
        if (this.f13796N.contains(this.f13799Q.k())) {
            this.f13797O = true;
            button.setVisibility(8);
            o();
        }
    }

    private void p() {
        if (this.f13799Q == null) {
            return;
        }
        this.f13792J.removeAllViews();
        List listE = this.f13799Q.e();
        List list = this.f13803U;
        if (list != null) {
            listE = list;
        }
        if (this.f13798P == 0 && this.f13801S != null && listE.isEmpty()) {
            listE.add(this.f13801S);
        }
        boolean z9 = false;
        SliceItem sliceItem = null;
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 0; i11 < listE.size(); i11++) {
            SliceItem sliceItemF = listE.get(i11) instanceof SliceItem ? (SliceItem) listE.get(i11) : ((p112l1.e) listE.get(i11)).f();
            if (i10 < 3 && e(sliceItemF, this.f13844r, false)) {
                if (sliceItem == null && p112l1.f.h(sliceItemF, "action") != null) {
                    sliceItem = sliceItemF;
                }
                i10++;
                if (i10 == 1) {
                    z10 = !this.f13790H.isEmpty() && p112l1.f.e(sliceItemF.j(), "image") == null;
                }
            }
        }
        int i12 = 8;
        this.f13792J.setVisibility(i10 > 0 ? 0 : 8);
        View view = this.f13789G;
        if (this.f13800R != null && z10) {
            i12 = 0;
        }
        view.setVisibility(i12);
        SliceItem sliceItem2 = this.f13801S;
        boolean z11 = (sliceItem2 == null || p112l1.f.h(sliceItem2, "action") == null) ? false : true;
        boolean z12 = sliceItem != null;
        if (this.f13800R != null) {
            m(this.f13783A, true);
        } else if (z12 != z11 && (i10 == 1 || z11)) {
            if (!this.f13790H.isEmpty()) {
                this.f13800R = (p112l1.e) this.f13790H.keySet().iterator().next();
            } else if (!this.f13791I.isEmpty() && this.f13791I.size() == 1) {
                this.f13800R = ((SliceActionView) this.f13791I.valueAt(0)).getAction();
            }
            m(this.f13783A, true);
            z9 = true;
        }
        p112l1.e eVar = this.f13800R;
        if (eVar == null || z9 || !this.f13796N.contains(eVar.f())) {
            return;
        }
        this.f13797O = true;
    }

    private void q() {
        int i10;
        int i11;
        int i12;
        ProgressBar progressBar = this.f13794L;
        if (progressBar != null) {
            int intrinsicWidth = progressBar instanceof SeekBar ? ((SeekBar) progressBar).getThumb().getIntrinsicWidth() : 0;
            e eVar = this.f13799Q;
            int i13 = (eVar == null || eVar.h() <= 0) ? this.f13848v : 0;
            if (intrinsicWidth != 0 && (i10 = this.f13847u) >= (i11 = intrinsicWidth / 2) && (i12 = this.f13849w) >= i11) {
                this.f13794L.setPadding(i10, i13, i12, this.f13850x);
            } else {
                int i14 = intrinsicWidth != 0 ? intrinsicWidth / 2 : 0;
                this.f13794L.setPadding(this.f13847u + i14, i13, this.f13849w + i14, this.f13850x);
            }
        }
    }

    @Override // androidx.slice.widget.SliceChildView
    public void a() {
        this.f13799Q = null;
        this.f13796N.clear();
        k();
    }

    @Override // androidx.slice.widget.SliceChildView
    public void b(int i10, int i11, int i12, int i13) {
        super.b(i10, i11, i12, i13);
        this.f13783A.setPadding(i10, i11, i12, i13);
        if (this.f13794L != null) {
            q();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    @Override // androidx.slice.widget.SliceChildView
    public void c(SliceItem sliceItem, boolean z9, int i10, int i11, SliceView.d dVar) {
        boolean z10;
        e eVar;
        setSliceActionListener(dVar);
        if (sliceItem == null || (eVar = this.f13799Q) == null || !eVar.t()) {
            z10 = false;
        } else {
            e eVar2 = this.f13799Q;
            p092j1.c cVar = eVar2 != null ? new p092j1.c(eVar2.k()) : null;
            boolean zEquals = this.f13799Q.k().j().f().equals(sliceItem.j().f());
            boolean zEquals2 = new p092j1.c(sliceItem.j()).equals(cVar);
            if (zEquals && zEquals2) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        this.f13797O = false;
        this.f13802T = z9;
        this.f13799Q = new e(getContext(), sliceItem, this.f13802T);
        this.f13798P = i10;
        j(z10);
    }

    @Override // androidx.slice.widget.SliceChildView
    public int getActualHeight() {
        if (this.f13804V) {
            return getSmallHeight();
        }
        e eVar = this.f13799Q;
        if (eVar == null || !eVar.t()) {
            return 0;
        }
        return this.f13799Q.c(this.f13818m0);
    }

    @Override // androidx.slice.widget.SliceChildView
    public int getSmallHeight() {
        e eVar = this.f13799Q;
        if (eVar == null || !eVar.t()) {
            return 0;
        }
        return this.f13799Q.l(this.f13818m0);
    }

    void l() {
        if (this.f13813h0 != null) {
            try {
                this.f13810e0 = System.currentTimeMillis();
                this.f13813h0.a(getContext(), new Intent().addFlags(268435456).putExtra("android.app.slice.extra.RANGE_VALUE", this.f13811f0));
            } catch (PendingIntent.CanceledException e10) {
                Log.e("RowView", "PendingIntent for slice cannot be sent", e10);
            }
        }
    }

    void o() {
        this.f13795M.setVisibility(this.f13797O ? 0 : 8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        SliceActionView.b bVar;
        p112l1.e eVar = this.f13800R;
        if (eVar == null || eVar.d() == null) {
            return;
        }
        SliceActionView sliceActionView = this.f13800R.b() ? (SliceActionView) this.f13790H.get(this.f13800R) : (SliceActionView) this.f13791I.get(this.f13800R);
        if (sliceActionView != null && !(view instanceof SliceActionView)) {
            sliceActionView.a();
            return;
        }
        if (this.f13798P == 0) {
            performClick();
            return;
        }
        try {
            boolean zB = this.f13800R.d().b(getContext(), null);
            this.f13797O = zB;
            if (zB && (bVar = this.f13851y) != null) {
                bVar.a(this.f13800R.f(), this.f13798P);
                this.f13796N.add(this.f13800R.f());
            }
            o();
        } catch (PendingIntent.CanceledException e10) {
            Log.e("RowView", "PendingIntent for slice cannot be sent", e10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14 = this.f13847u + this.f13849w;
        LinearLayout linearLayout = this.f13783A;
        linearLayout.layout(0, 0, linearLayout.getMeasuredWidth() + i14, getRowContentHeight());
        if (this.f13794L != null) {
            int rowContentHeight = getRowContentHeight() + ((this.f13816k0 - this.f13817l0) / 2);
            int i15 = this.f13817l0 + rowContentHeight;
            ProgressBar progressBar = this.f13794L;
            progressBar.layout(0, rowContentHeight, progressBar.getMeasuredWidth(), i15);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int smallHeight = getMode() == 1 ? getSmallHeight() : getActualHeight();
        int rowContentHeight = getRowContentHeight();
        if (rowContentHeight != 0) {
            this.f13783A.setVisibility(0);
            measureChild(this.f13783A, i10, View.MeasureSpec.makeMeasureSpec(rowContentHeight, BasicMeasure.EXACTLY));
        } else {
            this.f13783A.setVisibility(8);
        }
        if (this.f13794L != null) {
            measureChild(this.f13794L, i10, f13782p0 ? View.MeasureSpec.makeMeasureSpec(this.f13816k0, BasicMeasure.EXACTLY) : View.MeasureSpec.makeMeasureSpec(0, 0));
            this.f13817l0 = this.f13794L.getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(smallHeight, BasicMeasure.EXACTLY));
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setAllowTwoLines(boolean z9) {
        this.f13805W = z9;
        if (this.f13799Q != null) {
            j(true);
        }
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setLastUpdated(long j9) {
        super.setLastUpdated(j9);
        e eVar = this.f13799Q;
        if (eVar != null) {
            g(eVar.p() != null && TextUtils.isEmpty(this.f13799Q.p().l()));
        }
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setLoadingActions(Set<SliceItem> set) {
        if (set == null) {
            this.f13796N.clear();
            this.f13797O = false;
        } else {
            this.f13796N = set;
        }
        p();
        o();
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setMaxSmallHeight(int i10) {
        this.f13818m0 = i10;
        if (this.f13799Q != null) {
            j(true);
        }
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setShowLastUpdated(boolean z9) {
        super.setShowLastUpdated(z9);
        if (this.f13799Q != null) {
            j(true);
        }
    }

    public void setSingleItem(boolean z9) {
        this.f13804V = z9;
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setSliceActions(List<p112l1.d> list) {
        this.f13803U = list;
        if (this.f13799Q != null) {
            p();
        }
    }

    @Override // androidx.slice.widget.SliceChildView
    public void setTint(int i10) {
        super.setTint(i10);
        if (this.f13799Q != null) {
            j(true);
        }
    }
}
