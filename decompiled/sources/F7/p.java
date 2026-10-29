package F7;

import E7.S;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import p044e3.H0;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends ListAdapter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.android.launcher3.f f1781q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final S f1782r;

    public static final class a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final H0 f1783q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final com.android.launcher3.f f1784r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final S f1785s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(final H0 binding, com.android.launcher3.f deviceProfile, S s9) {
            super(binding.o());
            kotlin.jvm.internal.n.h(binding, "binding");
            kotlin.jvm.internal.n.h(deviceProfile, "deviceProfile");
            this.f1783q = binding;
            this.f1784r = deviceProfile;
            this.f1785s = s9;
            ImageView imageView = binding.f19854w;
            imageView.setHapticFeedbackEnabled(false);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: F7.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p.a.e(this.f1777q, binding, view);
                }
            });
            imageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: F7.o
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return p.a.d(this.f1779a, binding, view);
                }
            });
            binding.f19854w.setMaxHeight(deviceProfile.f15555X);
            binding.f19854w.setMaxWidth(deviceProfile.f15555X);
            FrameLayout previewContainer = binding.f19853v;
            kotlin.jvm.internal.n.g(previewContainer, "previewContainer");
            ViewGroup.LayoutParams layoutParams = previewContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = deviceProfile.f15561b0;
            previewContainer.setLayoutParams(layoutParams);
        }

        public static boolean d(a aVar, H0 h10, View view) {
            S s9 = aVar.f1785s;
            if (s9 == null) {
                return true;
            }
            ImageView previewImg = h10.f19854w;
            kotlin.jvm.internal.n.g(previewImg, "previewImg");
            s9.j(previewImg);
            return true;
        }

        public static void e(a aVar, H0 h10, View view) {
            S s9 = aVar.f1785s;
            if (s9 != null) {
                ImageView previewImg = h10.f19854w;
                kotlin.jvm.internal.n.g(previewImg, "previewImg");
                s9.d(previewImg);
            }
        }

        public final void f(com.nothing.launcher.card.j info) {
            kotlin.jvm.internal.n.h(info, "info");
            H0 h10 = this.f1783q;
            h10.f19854w.setTag(new com.nothing.launcher.card.m(info));
            ImageView imageView = h10.f19854w;
            Context context = imageView.getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            imageView.setContentDescription(info.x0(context));
            Rect rectL = this.f1784r.l(info.B0(), info.C0());
            ImageView imageView2 = h10.f19854w;
            Context context2 = imageView2.getContext();
            kotlin.jvm.internal.n.g(context2, "getContext(...)");
            imageView2.setImageBitmap(info.t0(context2, rectL));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.android.launcher3.f deviceProfile, S s9) {
        super(new q());
        kotlin.jvm.internal.n.h(deviceProfile, "deviceProfile");
        this.f1781q = deviceProfile;
        this.f1782r = s9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i10) {
        kotlin.jvm.internal.n.h(holder, "holder");
        com.nothing.launcher.card.j jVar = (com.nothing.launcher.card.j) getItem(i10);
        if (holder instanceof a) {
            kotlin.jvm.internal.n.e(jVar);
            ((a) holder).f(jVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.n.h(parent, "parent");
        H0 h0C = H0.C(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.n.g(h0C, "inflate(...)");
        return new a(h0C, this.f1781q, this.f1782r);
    }
}
