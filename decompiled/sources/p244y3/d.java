package p244y3;

import H3.AbstractC0856f;
import H3.t;
import I3.p;
import I3.y;
import android.app.ProgressDialog;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArraySet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.o;
import androidx.cardview.widget.CardView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.lifecycle.InterfaceC1163x;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.MemoryCategory;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p064g3.A;
import p064g3.AbstractC1356a;
import p064g3.InterfaceC1357b;
import p064g3.r;
import p064g3.x;
import p074h3.H;
import p074h3.I;
import p074h3.O;
import p074h3.W;
import p084i3.A0;
import p084i3.B0;
import p084i3.r0;

/* JADX INFO: loaded from: classes.dex */
public class d extends com.android.wallpaper.picker.a implements r0, B0.b, A0.a {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final String f30198K = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    O f30199A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    boolean f30200B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    O.a f30201C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ProgressDialog f30202D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f30203E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private ContentLoadingProgressBar f30204F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private InterfaceC1357b f30205G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private B0 f30206H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private WallpaperManager f30207I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Set f30208J;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    RecyclerView f30209v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    C0745d f30210w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    r f30211x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    List f30212y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    Point f30213z;

    class a implements p064g3.c {
        a() {
        }

        @Override // p064g3.c
        public void a() {
            AbstractC1356a abstractC1356aF = d.this.f30205G.f(d.this.getArguments().getString("category_collection_id"));
            if (abstractC1356aF == null || (abstractC1356aF instanceof r)) {
                d dVar = d.this;
                r rVar = (r) abstractC1356aF;
                dVar.f30211x = rVar;
                if (rVar != null) {
                    dVar.M0();
                    return;
                }
                AbstractC0856f.e("IndividualPickerFrgmnt", "Failed to find the category.", dVar.getContext());
                d.this.F0().w();
                Toast.makeText(d.this.getContext(), R.string.collection_not_exist_msg, 0).show();
            }
        }

        @Override // p064g3.c
        public void b(AbstractC1356a abstractC1356a) {
        }
    }

    class b implements A {
        b() {
        }

        @Override // p064g3.A
        public void a(List list) {
            AbstractActivityC1136v activity;
            d dVar = d.this;
            dVar.f30200B = true;
            dVar.P0();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d.this.f30212y.add((x) it.next());
            }
            d.this.K0();
            C0745d c0745d = d.this.f30210w;
            if (c0745d != null) {
                c0745d.notifyDataSetChanged();
            }
            if (!list.isEmpty() || (activity = d.this.getActivity()) == null) {
                return;
            }
            activity.finish();
        }
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f30217b;

        c(Context context, int i10) {
            this.f30216a = context;
            this.f30217b = i10;
        }
    }

    /* JADX INFO: renamed from: y3.d$d, reason: collision with other inner class name */
    class C0745d extends RecyclerView.Adapter {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final List f30219q;

        C0745d(List list) {
            this.f30219q = list;
        }

        private RecyclerView.ViewHolder d(ViewGroup viewGroup) {
            return new f(d.this.getActivity(), d.this.f30213z.y, LayoutInflater.from(d.this.getActivity()).inflate(R.layout.grid_item_image, viewGroup, false));
        }

        private RecyclerView.ViewHolder e(ViewGroup viewGroup) {
            LayoutInflater.from(d.this.getActivity()).inflate(R.layout.grid_item_my_photos, viewGroup, false);
            d.this.getActivity();
            o.a(d.this.getActivity());
            throw null;
        }

        protected boolean f(x xVar) {
            return d.this.f30208J.contains(xVar.r());
        }

        void g(RecyclerView.ViewHolder viewHolder, int i10) {
            if (d.this.f30211x.l()) {
                i10--;
            }
            x xVar = (x) this.f30219q.get(i10);
            xVar.b(viewHolder.itemView.getContext());
            ((p244y3.a) viewHolder).d(xVar);
            boolean zF = f(xVar);
            ((CardView) viewHolder.itemView.findViewById(R.id.wallpaper_container)).setRadius(d.this.getResources().getDimension(d.this.H0() ? R.dimen.grid_item_all_radius : R.dimen.grid_item_all_radius_small));
            h(viewHolder, R.drawable.wallpaper_check_circle_24dp, zF);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            boolean zL = d.this.f30211x.l();
            int size = this.f30219q.size();
            return zL ? size + 1 : size;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i10) {
            return (d.this.f30211x.l() && !d.this.I0() && i10 == 0) ? 3 : 2;
        }

        protected void h(RecyclerView.ViewHolder viewHolder, int i10, boolean z9) {
            ImageView imageView = (ImageView) viewHolder.itemView.findViewById(R.id.indicator_icon);
            if (!z9) {
                imageView.setVisibility(8);
                return;
            }
            float dimension = d.this.H0() ? d.this.getResources().getDimension(R.dimen.grid_item_badge_margin) : d.this.getResources().getDimension(R.dimen.grid_item_badge_margin_small);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
            int i11 = (int) dimension;
            layoutParams.setMargins(i11, i11, i11, i11);
            imageView.setLayoutParams(layoutParams);
            imageView.setBackgroundResource(i10);
            imageView.setVisibility(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType == 2) {
                g(viewHolder, i10);
                return;
            }
            if (itemViewType == 3) {
                ((p244y3.e) viewHolder).f();
                return;
            }
            Log.e("IndividualPickerFrgmnt", "Unsupported viewType " + itemViewType + " in IndividualAdapter");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            if (i10 == 2) {
                return d(viewGroup);
            }
            if (i10 == 3) {
                return e(viewGroup);
            }
            Log.e("IndividualPickerFrgmnt", "Unsupported viewType " + i10 + " in IndividualAdapter");
            return null;
        }
    }

    public interface e {
        void F(int i10);

        void G();

        void b(CharSequence charSequence);

        boolean d();

        void w();
    }

    private Set B0() {
        W wF = I.a().f(getContext());
        WallpaperInfo wallpaperInfo = this.f30207I.getWallpaperInfo();
        ArraySet arraySet = new ArraySet();
        String serviceName = wallpaperInfo != null ? wallpaperInfo.getServiceName() : wF.i();
        if (!TextUtils.isEmpty(serviceName)) {
            arraySet.add(serviceName);
        }
        boolean z9 = this.f30207I.getWallpaperId(2) >= 0;
        String strW = wF.W();
        if (z9 && !TextUtils.isEmpty(strW)) {
            arraySet.add(strW);
        }
        return arraySet;
    }

    private int C0() {
        return H0() ? getResources().getDimensionPixelSize(R.dimen.featured_wallpaper_grid_edge_space) : getResources().getDimensionPixelSize(R.dimen.wallpaper_grid_edge_space);
    }

    private int D0() {
        return H0() ? getResources().getDimensionPixelSize(R.dimen.grid_item_featured_individual_padding_bottom) : getResources().getDimensionPixelSize(R.dimen.grid_item_individual_padding_bottom);
    }

    private int E0() {
        return H0() ? getResources().getDimensionPixelSize(R.dimen.grid_item_featured_individual_padding_horizontal) : getResources().getDimensionPixelSize(R.dimen.grid_item_individual_padding_horizontal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e F0() {
        InterfaceC1163x parentFragment = getParentFragment();
        return parentFragment != null ? (e) parentFragment : (e) getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(String str, int i10) {
        if (i10 != 3 || this.f30211x.a(str)) {
            A0(true);
        }
    }

    public static d L0(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("category_collection_id", str);
        d dVar = new d();
        dVar.setArguments(bundle);
        return dVar;
    }

    public static /* synthetic */ WindowInsets v0(View view, WindowInsets windowInsets) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    void A0(boolean z9) {
        this.f30212y.clear();
        this.f30200B = false;
        P0();
        this.f30211x.o(getActivity().getApplicationContext(), new b(), z9);
    }

    @Override // i3.B0.b
    public void D(int i10) {
        j(i10);
    }

    int G0() {
        AbstractActivityC1136v activity = getActivity();
        if (activity == null) {
            return 1;
        }
        return H0() ? t.k(activity) : t.m(activity);
    }

    boolean H0() {
        List list = this.f30212y;
        return list != null && list.size() <= 8;
    }

    boolean I0() {
        return false;
    }

    protected void K0() {
        if (this.f30209v == null || this.f30211x == null || getContext() == null) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.f30209v.getLayoutManager();
        boolean z9 = (gridLayoutManager == null || gridLayoutManager.getSpanCount() == G0()) ? false : true;
        if (this.f30210w == null || z9) {
            int itemDecorationCount = this.f30209v.getItemDecorationCount();
            for (int i10 = 0; i10 < itemDecorationCount; i10++) {
                this.f30209v.removeItemDecorationAt(i10);
            }
            this.f30209v.addItemDecoration(new p(E0(), D0()));
            int iC0 = C0();
            RecyclerView recyclerView = this.f30209v;
            recyclerView.setPadding(iC0, recyclerView.getPaddingTop(), iC0, this.f30209v.getPaddingBottom());
            this.f30213z = H0() ? t.e(getActivity()) : t.f(getActivity());
            N0();
            RecyclerView recyclerView2 = this.f30209v;
            RecyclerView recyclerView3 = this.f30209v;
            o.a(getParentFragment());
            recyclerView2.setAccessibilityDelegateCompat(new y(recyclerView3, null, G0()));
        }
    }

    protected void M0() {
        if (F0() == null) {
            return;
        }
        if (F0().d()) {
            F0().b(this.f30211x.h());
        } else {
            n0(this.f30211x.h());
        }
        this.f30211x.i();
        if (this.f15945t != null && I0()) {
            s0(R.menu.individual_picker_menu);
        }
        A0(false);
        if (this.f30211x.m()) {
            O.a aVar = new O.a() { // from class: y3.c
                @Override // h3.O.a
                public final void a(String str, int i10) {
                    this.f30197a.J0(str, i10);
                }
            };
            this.f30201C = aVar;
            this.f30199A.a(aVar, "android.service.wallpaper.WallpaperService");
        }
    }

    void N0() {
        C0745d c0745d = new C0745d(this.f30212y);
        this.f30210w = c0745d;
        this.f30209v.setAdapter(c0745d);
        this.f30209v.setLayoutManager(new GridLayoutManager(getActivity(), G0()));
    }

    public void O0() {
        A0 a10 = new A0();
        a10.setTargetFragment(this, 1);
        a10.r0(getFragmentManager(), "start_rotation_dialog");
    }

    void P0() {
        ContentLoadingProgressBar contentLoadingProgressBar = this.f30204F;
        if (contentLoadingProgressBar == null) {
            return;
        }
        if (this.f30200B) {
            contentLoadingProgressBar.e();
        } else {
            contentLoadingProgressBar.h();
        }
    }

    @Override // p084i3.r0
    public void j(int i10) {
        if (!I0()) {
            Log.e("IndividualPickerFrgmnt", "Rotation is not enabled for this category " + this.f30211x.h());
            return;
        }
        if (!this.f30203E) {
            ProgressDialog progressDialog = new ProgressDialog(getActivity(), R.style.LightDialogTheme);
            this.f30202D = progressDialog;
            progressDialog.setTitle(f30198K);
            this.f30202D.setMessage(getResources().getString(R.string.start_rotation_progress_message));
            this.f30202D.setIndeterminate(true);
            this.f30202D.show();
        }
        new c(getActivity().getApplicationContext(), i10);
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H hA = I.a();
        Context applicationContext = getContext().getApplicationContext();
        this.f30207I = WallpaperManager.getInstance(applicationContext);
        this.f30199A = hA.s(applicationContext);
        this.f30212y = new ArrayList();
        if (bundle != null && bundle.getInt("IndividualPickerFragment.NIGHT_MODE") != (getResources().getConfiguration().uiMode & 48)) {
            Glide.get(getContext()).clearMemory();
        }
        InterfaceC1357b interfaceC1357bA = hA.a(applicationContext);
        this.f30205G = interfaceC1357bA;
        interfaceC1357bA.c(new a(), false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_individual_picker, viewGroup, false);
        if (F0().d()) {
            viewInflate.findViewById(R.id.header_bar).setVisibility(8);
            p0(true);
            if (I0()) {
                F0().F(R.menu.individual_picker_menu);
            }
        } else {
            q0(viewInflate);
            if (I0()) {
                s0(R.menu.individual_picker_menu);
            }
            r rVar = this.f30211x;
            if (rVar != null) {
                n0(rVar.h());
            }
        }
        this.f30208J = B0();
        this.f30209v = (RecyclerView) viewInflate.findViewById(R.id.wallpaper_grid);
        this.f30204F = (ContentLoadingProgressBar) viewInflate.findViewById(R.id.loading_indicator);
        P0();
        K0();
        this.f30209v.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: y3.b
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return d.v0(view, windowInsets);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroy() {
        super.onDestroy();
        ProgressDialog progressDialog = this.f30202D;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        O.a aVar = this.f30201C;
        if (aVar != null) {
            this.f30199A.b(aVar);
        }
    }

    @Override // com.android.wallpaper.picker.a, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        super.onDestroyView();
        F0().G();
    }

    @Override // com.android.wallpaper.picker.a, android.widget.Toolbar.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.daily_rotation) {
            return super.onMenuItemClick(menuItem);
        }
        O0();
        return true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onResume() {
        super.onResume();
        I.a().f(getActivity()).j(new Date().getTime());
        Glide.get(getActivity()).setMemoryCategory(MemoryCategory.NORMAL);
        B0 b10 = this.f30206H;
        if (b10 != null) {
            b10.r0(getFragmentManager(), "start_rotation_error_dialog");
            this.f30206H = null;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("IndividualPickerFragment.NIGHT_MODE", getResources().getConfiguration().uiMode & 48);
    }

    @Override // i3.A0.a
    public void t(DialogInterface dialogInterface) {
    }
}
