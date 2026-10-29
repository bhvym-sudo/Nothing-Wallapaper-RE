package T6;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ViewTarget;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.creative.model.Wallpaper;
import java.io.File;
import kotlin.jvm.internal.n;
import p044e3.C;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends RecyclerView.ViewHolder implements a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C f7708q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private l f7709r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C binding, l lVar) {
        super(binding.o());
        n.h(binding, "binding");
        this.f7708q = binding;
        this.f7709r = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(i iVar, int i10, View view) {
        l lVar = iVar.f7709r;
        if (lVar != null) {
            lVar.f(Integer.valueOf(i10));
        }
    }

    @Override // T6.a
    public void a(float f10) {
        this.f7708q.f19809v.setAlpha(f10);
    }

    public final void e(Wallpaper data, final int i10, int i11, int i12) {
        ViewTarget viewTargetInto;
        n.h(data, "data");
        this.f7708q.f19810w.setOnClickListener(new View.OnClickListener() { // from class: T6.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.f(this.f7706q, i10, view);
            }
        });
        if ((i12 > 0) & (i11 > 0)) {
            ViewGroup.LayoutParams layoutParams = this.f7708q.f19810w.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.f7708q.f19811x.getLayoutParams();
            layoutParams.width = i11;
            layoutParams.height = i12;
            int dimensionPixelSize = this.itemView.getResources().getDimensionPixelSize(R.dimen.nt_creative_item_margin) * 2;
            layoutParams2.width = i11 - dimensionPixelSize;
            layoutParams2.height = i12 - dimensionPixelSize;
        }
        RequestOptions requestOptionsTransform = new RequestOptions().transform(new CenterCrop(), new RoundedCorners((int) this.itemView.getResources().getDimension(R.dimen.nt_creative_wallpaper_radius)));
        String link = data.getLink();
        if (link == null || link.length() == 0) {
            if (X6.c.a(data)) {
                this.f7708q.f19811x.setImageDrawable(new ColorDrawable(0));
                return;
            } else {
                n.e(Glide.with(this.itemView).load("").diskCacheStrategy(DiskCacheStrategy.NONE).apply((BaseRequestOptions<?>) requestOptionsTransform).transition(DrawableTransitionOptions.withCrossFade()).into(this.f7708q.f19811x));
                return;
            }
        }
        String str = U6.b.f7980a.b().get(data.getLink());
        if (str == null || str.length() == 0) {
            viewTargetInto = i10 == 0 ? Glide.with(this.itemView).load(data.getLink()).diskCacheStrategy(DiskCacheStrategy.NONE).apply((BaseRequestOptions<?>) requestOptionsTransform).transition(p147o6.c.f23446q.a(R.anim.anim_generated_wallpaper)).into(this.f7708q.f19811x) : Glide.with(this.itemView).load(data.getLink()).diskCacheStrategy(DiskCacheStrategy.NONE).apply((BaseRequestOptions<?>) requestOptionsTransform).transition(DrawableTransitionOptions.withCrossFade()).into(this.f7708q.f19811x);
        } else {
            viewTargetInto = i10 == 0 ? Glide.with(this.itemView).load(new File(str)).diskCacheStrategy(DiskCacheStrategy.NONE).apply((BaseRequestOptions<?>) requestOptionsTransform).transition(p147o6.c.f23446q.a(R.anim.anim_generated_wallpaper)).into(this.f7708q.f19811x) : Glide.with(this.itemView).load(new File(str)).diskCacheStrategy(DiskCacheStrategy.NONE).apply((BaseRequestOptions<?>) requestOptionsTransform).transition(DrawableTransitionOptions.withCrossFade()).into(this.f7708q.f19811x);
        }
        n.e(viewTargetInto);
    }
}
