package T6;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.creative.model.Prompt;
import java.security.SecureRandom;
import kotlin.jvm.internal.n;
import p044e3.A;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends RecyclerView.ViewHolder implements T6.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final A f7693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f7694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Handler f7695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private l f7696t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f7697u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f7698v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f7699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final p079h8.h f7700x;

    public static final class a implements RequestListener {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f7702r;

        a(String str) {
            this.f7702r = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(f fVar, String str) {
            fVar.p(str);
        }

        @Override // com.bumptech.glide.request.RequestListener
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean onResourceReady(Drawable resource, Object model, Target target, DataSource dataSource, boolean z9) {
            n.h(resource, "resource");
            n.h(model, "model");
            n.h(dataSource, "dataSource");
            return false;
        }

        @Override // com.bumptech.glide.request.RequestListener
        public boolean onLoadFailed(GlideException glideException, Object obj, Target target, boolean z9) {
            n.h(target, "target");
            com.nothing.wallpaper.common.log.c.f(f.this.f7697u, "onLoadFailed reload count:" + f.this.f7699w + " " + glideException);
            if (f.this.f7699w >= f.this.f7698v) {
                return false;
            }
            int iNextInt = f.this.o().nextInt(100);
            Handler handler = f.this.f7695s;
            final f fVar = f.this;
            final String str = this.f7702r;
            handler.postDelayed(new Runnable() { // from class: T6.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.a.b(fVar, str);
                }
            }, iNextInt);
            f.this.f7699w++;
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(A binding, boolean z9, Handler handler, l lVar) {
        super(binding.o());
        n.h(binding, "binding");
        n.h(handler, "handler");
        this.f7693q = binding;
        this.f7694r = z9;
        this.f7695s = handler;
        this.f7696t = lVar;
        this.f7697u = "NTCreativePromptHolder";
        this.f7698v = 10;
        this.f7700x = p079h8.i.b(new p219v8.a() { // from class: T6.d
            @Override // p219v8.a
            public final Object invoke() {
                return f.q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(f fVar, int i10, View view) {
        l lVar = fVar.f7696t;
        if (lVar != null) {
            lVar.f(Integer.valueOf(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SecureRandom o() {
        return (SecureRandom) this.f7700x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(String str) {
        Glide.with(this.itemView).load(str).apply((BaseRequestOptions<?>) new RequestOptions().transform(new CenterCrop(), new RoundedCorners((int) this.itemView.getResources().getDimension(R.dimen.nt_creative_prompt_radius)))).transition(DrawableTransitionOptions.withCrossFade()).addListener(new a(str)).into(this.f7693q.f19795v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SecureRandom q() {
        return new SecureRandom();
    }

    @Override // T6.a
    public void a(float f10) {
        this.f7693q.f19798y.setAlpha(1 - f10);
        this.f7693q.f19797x.setAlpha(f10);
    }

    public final void m(Prompt data, final int i10, boolean z9, int i11, int i12) {
        n.h(data, "data");
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        this.f7693q.f19796w.setOnClickListener(new View.OnClickListener() { // from class: T6.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.n(this.f7689q, i10, view);
            }
        });
        int dimensionPixelSize = this.f7693q.o().getResources().getDimensionPixelSize(R.dimen.nt_creative_frame_width);
        ViewGroup.LayoutParams layoutParams = this.f7693q.f19796w.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.f7693q.f19795v.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i12;
        int dimensionPixelSize2 = this.itemView.getResources().getDimensionPixelSize(R.dimen.nt_creative_item_margin);
        layoutParams2.width = i11 - (dimensionPixelSize2 * 2);
        int i13 = dimensionPixelSize / 2;
        layoutParams2.height = (i12 - dimensionPixelSize2) - ((dimensionPixelSize2 - i13) / 2);
        if (this.f7694r) {
            ConstraintLayout constraintLayout = this.f7693q.f19796w;
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), (this.f7693q.f19796w.getPaddingLeft() - i13) / 2, this.f7693q.f19796w.getPaddingRight(), this.f7693q.f19796w.getPaddingLeft());
        } else {
            ConstraintLayout constraintLayout2 = this.f7693q.f19796w;
            constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), this.f7693q.f19796w.getPaddingLeft(), this.f7693q.f19796w.getPaddingRight(), (this.f7693q.f19796w.getPaddingLeft() - i13) / 2);
        }
        String promptWordForLocale = data.getPromptWordForLocale();
        if (promptWordForLocale == null || promptWordForLocale.length() == 0) {
            this.f7693q.f19798y.setText(data.getPromptWordEn());
            this.f7693q.f19795v.setContentDescription(data.getPromptWordEn());
        } else {
            this.f7693q.f19798y.setText(data.getPromptWordForLocale());
            this.f7693q.f19795v.setContentDescription(data.getPromptWordForLocale());
        }
        if (z9) {
            this.f7693q.f19797x.setVisibility(0);
        } else {
            this.f7693q.f19797x.setVisibility(4);
        }
        p(data.getPhotoLink());
    }
}
