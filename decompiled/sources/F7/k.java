package F7;

import E7.S;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClipCardView;
import com.nothing.widget.ui.NtSwitch;
import kotlin.jvm.internal.AbstractC1457h;
import p044e3.B0;
import p044e3.z0;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends ListAdapter {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f1761s = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.android.launcher3.f f1762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final S f1763r;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final z0 f1764q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final com.android.launcher3.f f1765r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final S f1766s;

        static final class a implements Runnable {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ z0 f1767q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f1768r;

            a(z0 z0Var, b bVar) {
                this.f1767q = z0Var;
                this.f1768r = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.g(this.f1767q, this.f1768r);
            }
        }

        /* JADX INFO: renamed from: F7.k$b$b, reason: collision with other inner class name */
        public static final class ViewOnLayoutChangeListenerC0071b implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z0 f1769a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f1770b;

            public ViewOnLayoutChangeListenerC0071b(z0 z0Var, b bVar) {
                this.f1769a = z0Var;
                this.f1770b = bVar;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                view.removeOnLayoutChangeListener(this);
                z0 z0Var = this.f1769a;
                z0Var.f20178y.post(new a(z0Var, this.f1770b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(final z0 binding, com.android.launcher3.f deviceProfile, S s9) {
            super(binding.o());
            kotlin.jvm.internal.n.h(binding, "binding");
            kotlin.jvm.internal.n.h(deviceProfile, "deviceProfile");
            this.f1764q = binding;
            this.f1765r = deviceProfile;
            this.f1766s = s9;
            CardView cardView = binding.f20175v;
            kotlin.jvm.internal.n.g(cardView, "cardView");
            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i10 = deviceProfile.f15557Z;
            marginLayoutParams.leftMargin = i10;
            marginLayoutParams.rightMargin = i10;
            cardView.setLayoutParams(marginLayoutParams);
            TextView expandTips = binding.f20176w;
            kotlin.jvm.internal.n.g(expandTips, "expandTips");
            ViewGroup.LayoutParams layoutParams2 = expandTips.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            int i11 = deviceProfile.f15557Z;
            marginLayoutParams2.leftMargin = i11;
            marginLayoutParams2.rightMargin = i11;
            expandTips.setLayoutParams(marginLayoutParams2);
            binding.f20175v.setOnClickListener(new View.OnClickListener() { // from class: F7.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k.b.d(binding, this, view);
                }
            });
        }

        public static void d(z0 z0Var, b bVar, View view) {
            if (z0Var.f20178y.isLaidOut()) {
                g(z0Var, bVar);
                return;
            }
            z0Var.f20178y.requestLayout();
            NtSwitch switchView = z0Var.f20178y;
            kotlin.jvm.internal.n.g(switchView, "switchView");
            if (!switchView.isLaidOut() || switchView.isLayoutRequested()) {
                switchView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0071b(z0Var, bVar));
            } else {
                z0Var.f20178y.post(new a(z0Var, bVar));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(z0 z0Var, b bVar) {
            z0Var.f20178y.toggle();
            Object tag = bVar.itemView.getTag();
            S5.c cVar = tag instanceof S5.c ? (S5.c) tag : null;
            if (cVar != null) {
                cVar.d(z0Var.f20178y.isChecked());
            }
            S s9 = bVar.f1766s;
            if (s9 != null) {
                s9.a(z0Var.f20178y.isChecked());
            }
        }

        public final void f(S5.c info) {
            kotlin.jvm.internal.n.h(info, "info");
            this.itemView.setTag(info);
            this.f1764q.f20178y.setChecked(info.b());
        }
    }

    public static final class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final B0 f1771q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final com.android.launcher3.f f1772r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final S f1773s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(B0 binding, com.android.launcher3.f deviceProfile, S s9) {
            super(binding.o());
            kotlin.jvm.internal.n.h(binding, "binding");
            kotlin.jvm.internal.n.h(deviceProfile, "deviceProfile");
            this.f1771q = binding;
            this.f1772r = deviceProfile;
            this.f1773s = s9;
            ClipCardView cardView = binding.f19805v;
            kotlin.jvm.internal.n.g(cardView, "cardView");
            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i10 = deviceProfile.f15555X;
            marginLayoutParams.width = i10;
            marginLayoutParams.height = i10;
            marginLayoutParams.topMargin = deviceProfile.f15557Z;
            cardView.setLayoutParams(marginLayoutParams);
            ImageView imageView = binding.f19807x;
            imageView.setTranslationX(deviceProfile.f15559a0);
            imageView.setTranslationY(deviceProfile.f15559a0);
            binding.f19805v.setOnClickListener(new View.OnClickListener() { // from class: F7.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k.c.d(this.f1776q, view);
                }
            });
        }

        public static void d(c cVar, View view) {
            S s9;
            Object tag = cVar.itemView.getTag();
            S5.a aVar = tag instanceof S5.a ? (S5.a) tag : null;
            if (aVar == null || (s9 = cVar.f1773s) == null) {
                return;
            }
            s9.v(new p258z7.c(aVar.d(), aVar.h(), 0L, 4, null));
        }

        public final void e(S5.a metaInfo) {
            kotlin.jvm.internal.n.h(metaInfo, "metaInfo");
            this.itemView.setTag(metaInfo);
            B0 b10 = this.f1771q;
            TextView textView = b10.f19808y;
            Context context = textView.getContext();
            kotlin.jvm.internal.n.g(context, "getContext(...)");
            textView.setText(metaInfo.a(context));
            b10.f19805v.setContentDescription(b10.f19808y.getText());
            Context context2 = b10.f19806w.getContext();
            kotlin.jvm.internal.n.g(context2, "getContext(...)");
            Drawable drawableB = metaInfo.b(context2);
            if (drawableB != null) {
                b10.f19806w.setImageDrawable(drawableB);
            }
            Glide.with(this.itemView).load((Object) metaInfo).diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).into(b10.f19807x);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.android.launcher3.f deviceProfile, S s9) {
        super(new F7.a());
        kotlin.jvm.internal.n.h(deviceProfile, "deviceProfile");
        this.f1762q = deviceProfile;
        this.f1763r = s9;
    }

    public final boolean d(int i10) {
        return getItemViewType(i10) == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return !(((S5.d) getItem(i10)) instanceof S5.c) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i10) {
        kotlin.jvm.internal.n.h(holder, "holder");
        if (holder instanceof c) {
            Object item = getItem(i10);
            kotlin.jvm.internal.n.f(item, "null cannot be cast to non-null type com.nothing.launcher.card.data.CardGroupMetaInfo");
            ((c) holder).e((S5.a) item);
        } else if (holder instanceof b) {
            Object item2 = getItem(i10);
            kotlin.jvm.internal.n.f(item2, "null cannot be cast to non-null type com.nothing.launcher.card.data.HeadGroupMetaInfo");
            ((b) holder).f((S5.c) item2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.n.h(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i10 == 0) {
            z0 z0VarC = z0.C(layoutInflaterFrom, parent, false);
            kotlin.jvm.internal.n.g(z0VarC, "inflate(...)");
            return new b(z0VarC, this.f1762q, this.f1763r);
        }
        B0 b0C = B0.C(layoutInflaterFrom, parent, false);
        kotlin.jvm.internal.n.g(b0C, "inflate(...)");
        return new c(b0C, this.f1762q, this.f1763r);
    }
}
