package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.H;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class AlertController {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    NestedScrollView f9991A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Drawable f9993C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ImageView f9994D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private TextView f9995E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private TextView f9996F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private View f9997G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    ListAdapter f9998H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f10000J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f10001K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    int f10002L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    int f10003M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f10004N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f10005O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f10006P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    Handler f10008R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final k f10011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f10012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f10014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f10015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f10016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f10017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10018i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f10019j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f10021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f10022m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f10024o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f10025p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f10026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f10027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f10028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f10029t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f10030u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f10031v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f10032w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f10033x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f10034y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f10035z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10023n = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f9992B = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f9999I = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f10007Q = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f10009S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f10036q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final int f10037r;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p050f.j.f20608c2);
            this.f10037r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p050f.j.f20613d2, -1);
            this.f10036q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p050f.j.f20618e2, -1);
        }

        public void a(boolean z9, boolean z10) {
            if (z10 && z9) {
                return;
            }
            setPadding(getPaddingLeft(), z9 ? getPaddingTop() : this.f10036q, getPaddingRight(), z10 ? getPaddingBottom() : this.f10037r);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f10024o && (message3 = alertController.f10026q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f10028s || (message2 = alertController.f10030u) == null) {
                messageObtain = (view != alertController.f10032w || (message = alertController.f10034y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f10008R.obtainMessage(1, alertController2.f10011b).sendToTarget();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f10039A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f10040B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f10041C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f10042D;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public boolean[] f10044F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f10045G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f10046H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f10048J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public Cursor f10049K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public String f10050L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public String f10051M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f10052N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f10054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f10055b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f10057d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f10059f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f10060g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f10061h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f10062i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f10063j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f10064k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f10065l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f10066m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f10067n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f10068o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f10069p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f10070q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f10072s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f10073t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f10074u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f10075v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f10076w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f10077x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f10078y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f10079z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10056c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10058e = 0;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f10043E = false;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f10047I = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public boolean f10053O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f10071r = true;

        class a extends ArrayAdapter {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ RecycleListView f10080q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f10080q = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.f10044F;
                if (zArr != null && zArr[i10]) {
                    this.f10080q.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0359b extends CursorAdapter {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private final int f10082q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private final int f10083r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ RecycleListView f10084s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ AlertController f10085t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0359b(Context context, Cursor cursor, boolean z9, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z9);
                this.f10084s = recycleListView;
                this.f10085t = alertController;
                Cursor cursor2 = getCursor();
                this.f10082q = cursor2.getColumnIndexOrThrow(b.this.f10050L);
                this.f10083r = cursor2.getColumnIndexOrThrow(b.this.f10051M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f10082q));
                this.f10084s.setItemChecked(cursor.getPosition(), cursor.getInt(this.f10083r) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f10055b.inflate(this.f10085t.f10003M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ AlertController f10087q;

            c(AlertController alertController) {
                this.f10087q = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j9) {
                b.this.f10077x.onClick(this.f10087q.f10011b, i10);
                if (b.this.f10046H) {
                    return;
                }
                this.f10087q.f10011b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ RecycleListView f10089q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ AlertController f10090r;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f10089q = recycleListView;
                this.f10090r = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j9) {
                boolean[] zArr = b.this.f10044F;
                if (zArr != null) {
                    zArr[i10] = this.f10089q.isItemChecked(i10);
                }
                b.this.f10048J.onClick(this.f10090r.f10011b, i10, this.f10089q.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f10054a = context;
            this.f10055b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f10055b.inflate(alertController.f10002L, (ViewGroup) null);
            if (!this.f10045G) {
                bVar = this;
                alertController2 = alertController;
                int i10 = bVar.f10046H ? alertController2.f10004N : alertController2.f10005O;
                if (bVar.f10049K != null) {
                    dVar = new SimpleCursorAdapter(bVar.f10054a, i10, bVar.f10049K, new String[]{bVar.f10050L}, new int[]{R.id.text1});
                } else {
                    dVar = bVar.f10076w;
                    if (dVar == null) {
                        dVar = new d(bVar.f10054a, i10, R.id.text1, bVar.f10075v);
                    }
                }
            } else if (this.f10049K == null) {
                bVar = this;
                dVar = bVar.new a(this.f10054a, alertController.f10003M, R.id.text1, this.f10075v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0359b(bVar.f10054a, bVar.f10049K, false, recycleListView, alertController2);
            }
            alertController2.f9998H = dVar;
            alertController2.f9999I = bVar.f10047I;
            if (bVar.f10077x != null) {
                recycleListView.setOnItemClickListener(bVar.new c(alertController2));
            } else if (bVar.f10048J != null) {
                recycleListView.setOnItemClickListener(bVar.new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.f10052N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.f10046H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.f10045G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f10016g = recycleListView;
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f10060g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f10059f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f10057d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i10 = this.f10056c;
                if (i10 != 0) {
                    alertController.l(i10);
                }
                int i11 = this.f10058e;
                if (i11 != 0) {
                    alertController.l(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f10061h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f10062i;
            if (charSequence3 == null && this.f10063j == null) {
                alertController2 = alertController;
            } else {
                alertController.j(-1, charSequence3, this.f10064k, null, this.f10063j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f10065l;
            if (charSequence4 != null || this.f10066m != null) {
                alertController2.j(-2, charSequence4, this.f10067n, null, this.f10066m);
            }
            CharSequence charSequence5 = this.f10068o;
            if (charSequence5 != null || this.f10069p != null) {
                alertController2.j(-3, charSequence5, this.f10070q, null, this.f10069p);
            }
            if (this.f10075v != null || this.f10049K != null || this.f10076w != null) {
                b(alertController2);
            }
            View view2 = this.f10079z;
            if (view2 != null) {
                if (this.f10043E) {
                    alertController2.s(view2, this.f10039A, this.f10040B, this.f10041C, this.f10042D);
                    return;
                } else {
                    alertController2.r(view2);
                    return;
                }
            }
            int i12 = this.f10078y;
            if (i12 != 0) {
                alertController2.q(i12);
            }
        }
    }

    private static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference f10092a;

        public c(DialogInterface dialogInterface) {
            this.f10092a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f10092a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, k kVar, Window window) {
        this.f10010a = context;
        this.f10011b = kVar;
        this.f10012c = window;
        this.f10008R = new c(kVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p050f.j.f20511F, p050f.a.f20347m, 0);
        this.f10000J = typedArrayObtainStyledAttributes.getResourceId(p050f.j.f20515G, 0);
        this.f10001K = typedArrayObtainStyledAttributes.getResourceId(p050f.j.f20523I, 0);
        this.f10002L = typedArrayObtainStyledAttributes.getResourceId(p050f.j.f20531K, 0);
        this.f10003M = typedArrayObtainStyledAttributes.getResourceId(p050f.j.f20535L, 0);
        this.f10004N = typedArrayObtainStyledAttributes.getResourceId(p050f.j.f20543N, 0);
        this.f10005O = typedArrayObtainStyledAttributes.getResourceId(p050f.j.f20527J, 0);
        this.f10006P = typedArrayObtainStyledAttributes.getBoolean(p050f.j.f20539M, true);
        this.f10013d = typedArrayObtainStyledAttributes.getDimensionPixelSize(p050f.j.f20519H, 0);
        typedArrayObtainStyledAttributes.recycle();
        kVar.l(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i10 = this.f10001K;
        return (i10 != 0 && this.f10007Q == 1) ? i10 : this.f10000J;
    }

    private void o(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f10012c.findViewById(p050f.f.f20450u);
        View viewFindViewById2 = this.f10012c.findViewById(p050f.f.f20449t);
        H.x0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f10024o = button;
        button.setOnClickListener(this.f10009S);
        if (TextUtils.isEmpty(this.f10025p) && this.f10027r == null) {
            this.f10024o.setVisibility(8);
            i10 = 0;
        } else {
            this.f10024o.setText(this.f10025p);
            Drawable drawable = this.f10027r;
            if (drawable != null) {
                int i11 = this.f10013d;
                drawable.setBounds(0, 0, i11, i11);
                this.f10024o.setCompoundDrawables(this.f10027r, null, null, null);
            }
            this.f10024o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f10028s = button2;
        button2.setOnClickListener(this.f10009S);
        if (TextUtils.isEmpty(this.f10029t) && this.f10031v == null) {
            this.f10028s.setVisibility(8);
        } else {
            this.f10028s.setText(this.f10029t);
            Drawable drawable2 = this.f10031v;
            if (drawable2 != null) {
                int i12 = this.f10013d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f10028s.setCompoundDrawables(this.f10031v, null, null, null);
            }
            this.f10028s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f10032w = button3;
        button3.setOnClickListener(this.f10009S);
        if (TextUtils.isEmpty(this.f10033x) && this.f10035z == null) {
            this.f10032w.setVisibility(8);
        } else {
            this.f10032w.setText(this.f10033x);
            Drawable drawable3 = this.f10035z;
            if (drawable3 != null) {
                int i13 = this.f10013d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f10032w.setCompoundDrawables(this.f10035z, null, null, null);
            }
            this.f10032w.setVisibility(0);
            i10 |= 4;
        }
        if (y(this.f10010a)) {
            if (i10 == 1) {
                b(this.f10024o);
            } else if (i10 == 2) {
                b(this.f10028s);
            } else if (i10 == 4) {
                b(this.f10032w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f10012c.findViewById(p050f.f.f20451v);
        this.f9991A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f9991A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f9996F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f10015f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f9991A.removeView(this.f9996F);
        if (this.f10016g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f9991A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f9991A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f10016g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View viewInflate = this.f10017h;
        if (viewInflate == null) {
            viewInflate = this.f10018i != 0 ? LayoutInflater.from(this.f10010a).inflate(this.f10018i, viewGroup, false) : null;
        }
        boolean z9 = viewInflate != null;
        if (!z9 || !a(viewInflate)) {
            this.f10012c.setFlags(131072, 131072);
        }
        if (!z9) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f10012c.findViewById(p050f.f.f20443n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f10023n) {
            frameLayout.setPadding(this.f10019j, this.f10020k, this.f10021l, this.f10022m);
        }
        if (this.f10016g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        if (this.f9997G != null) {
            viewGroup.addView(this.f9997G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f10012c.findViewById(p050f.f.f20428E).setVisibility(8);
            return;
        }
        this.f9994D = (ImageView) this.f10012c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f10014e) || !this.f10006P) {
            this.f10012c.findViewById(p050f.f.f20428E).setVisibility(8);
            this.f9994D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f10012c.findViewById(p050f.f.f20439j);
        this.f9995E = textView;
        textView.setText(this.f10014e);
        int i10 = this.f9992B;
        if (i10 != 0) {
            this.f9994D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f9993C;
        if (drawable != null) {
            this.f9994D.setImageDrawable(drawable);
        } else {
            this.f9995E.setPadding(this.f9994D.getPaddingLeft(), this.f9994D.getPaddingTop(), this.f9994D.getPaddingRight(), this.f9994D.getPaddingBottom());
            this.f9994D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f10012c.findViewById(p050f.f.f20448s);
        int i10 = p050f.f.f20429F;
        View viewFindViewById4 = viewFindViewById3.findViewById(i10);
        int i11 = p050f.f.f20442m;
        View viewFindViewById5 = viewFindViewById3.findViewById(i11);
        int i12 = p050f.f.f20440k;
        View viewFindViewById6 = viewFindViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(p050f.f.f20444o);
        v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i10);
        View viewFindViewById8 = viewGroup.findViewById(i11);
        View viewFindViewById9 = viewGroup.findViewById(i12);
        ViewGroup viewGroupH = h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupH2 = h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupH3 = h(viewFindViewById9, viewFindViewById6);
        u(viewGroupH2);
        t(viewGroupH3);
        w(viewGroupH);
        boolean z9 = viewGroup.getVisibility() != 8;
        boolean z10 = (viewGroupH == null || viewGroupH.getVisibility() == 8) ? 0 : 1;
        boolean z11 = (viewGroupH3 == null || viewGroupH3.getVisibility() == 8) ? false : true;
        if (!z11 && viewGroupH2 != null && (viewFindViewById2 = viewGroupH2.findViewById(p050f.f.f20424A)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z10 != 0) {
            NestedScrollView nestedScrollView = this.f9991A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f10015f == null && this.f10016g == null) ? null : viewGroupH.findViewById(p050f.f.f20427D);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupH2 != null && (viewFindViewById = viewGroupH2.findViewById(p050f.f.f20425B)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f10016g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z10, z11);
        }
        if (!z9) {
            View view = this.f10016g;
            if (view == null) {
                view = this.f9991A;
            }
            if (view != null) {
                o(viewGroupH2, view, z10 | (z11 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f10016g;
        if (listView2 == null || (listAdapter = this.f9998H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.f9999I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p050f.a.f20346l, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f10010a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f10016g;
    }

    public void e() {
        this.f10011b.setContentView(i());
        x();
    }

    public boolean f(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f9991A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f9991A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public void j(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f10008R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f10033x = charSequence;
            this.f10034y = message;
            this.f10035z = drawable;
        } else if (i10 == -2) {
            this.f10029t = charSequence;
            this.f10030u = message;
            this.f10031v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f10025p = charSequence;
            this.f10026q = message;
            this.f10027r = drawable;
        }
    }

    public void k(View view) {
        this.f9997G = view;
    }

    public void l(int i10) {
        this.f9993C = null;
        this.f9992B = i10;
        ImageView imageView = this.f9994D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f9994D.setImageResource(this.f9992B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.f9993C = drawable;
        this.f9992B = 0;
        ImageView imageView = this.f9994D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f9994D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f10015f = charSequence;
        TextView textView = this.f9996F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f10014e = charSequence;
        TextView textView = this.f9995E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i10) {
        this.f10017h = null;
        this.f10018i = i10;
        this.f10023n = false;
    }

    public void r(View view) {
        this.f10017h = view;
        this.f10018i = 0;
        this.f10023n = false;
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        this.f10017h = view;
        this.f10018i = 0;
        this.f10023n = true;
        this.f10019j = i10;
        this.f10020k = i11;
        this.f10021l = i12;
        this.f10022m = i13;
    }
}
