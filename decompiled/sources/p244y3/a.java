package p244y3;

import H3.r;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import java.util.List;
import p064g3.x;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected Activity f30190q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected View f30191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected View f30192s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected ImageView f30193t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected ImageView f30194u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected TextView f30195v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected x f30196w;

    a(Activity activity, int i10, int i11, View view) {
        super(view);
        this.f30190q = activity;
        this.f30191r = view.findViewById(R.id.tile);
        this.f30193t = (ImageView) view.findViewById(R.id.thumbnail);
        this.f30194u = (ImageView) view.findViewById(R.id.overlay_icon);
        this.f30195v = (TextView) view.findViewById(R.id.title);
        this.f30192s = view.findViewById(R.id.wallpaper_container);
        this.f30191r.getLayoutParams().width = i11;
        this.f30192s.getLayoutParams().height = i10;
    }

    public void d(x xVar) {
        this.f30196w = xVar;
        String strP = xVar.p(this.f30190q);
        List listE = xVar.e(this.f30190q);
        String str = listE.size() > 0 ? (String) listE.get(0) : null;
        if (strP != null) {
            this.f30195v.setText(strP);
            this.f30195v.setVisibility(0);
            this.f30191r.setContentDescription(strP);
        } else if (str != null) {
            String strJ = xVar.j(this.f30190q);
            View view = this.f30191r;
            if (strJ != null) {
                str = strJ;
            }
            view.setContentDescription(str);
        }
        Drawable drawableM = xVar.m(this.f30190q);
        if (drawableM != null) {
            this.f30194u.setImageDrawable(drawableM);
            return;
        }
        com.android.wallpaper.asset.a aVarO = xVar.o(this.f30190q.getApplicationContext());
        Activity activity = this.f30190q;
        aVarO.n(activity, this.f30193t, r.a(activity, android.R.attr.colorSecondary));
    }
}
