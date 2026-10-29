package p242y1;

import D1.c;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC1163x;
import com.android.customization.picker.grid.GridSectionView;
import com.nothing.wallpaper.R;
import java.util.List;
import java.util.function.Predicate;
import p064g3.f;

/* JADX INFO: loaded from: classes.dex */
public class i implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final e f30175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final f.a f30176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final I f30177s = new I() { // from class: y1.f
        @Override // androidx.lifecycle.I
        public final void b(Object obj) {
            this.f30172q.q(obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC1163x f30178t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f30179u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f30180v;

    class a implements w1.a.b {
        a() {
        }

        @Override // w1.a.b
        public void a(Throwable th) {
            if (th != null) {
                Log.e("GridSectionController", "Error loading grid options", th);
            }
            i.this.f30179u.setText(R.string.something_went_wrong);
            i.this.f30180v.setVisibility(8);
        }

        @Override // w1.a.b
        public void b(List list) {
            i.this.f30179u.setText(i.this.n(list).a());
        }
    }

    public i(e eVar, f.a aVar, InterfaceC1163x interfaceC1163x) {
        this.f30175q = eVar;
        this.f30176r = aVar;
        this.f30178t = interfaceC1163x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public p242y1.a n(List list) {
        return (p242y1.a) list.stream().filter(new Predicate() { // from class: y1.g
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f30173a.p((a) obj);
            }
        }).findAny().orElse((p242y1.a) list.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(View view) {
        this.f30176r.g(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean p(p242y1.a aVar) {
        return aVar.b(this.f30175q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Object obj) {
        r(true);
    }

    private void r(boolean z9) {
        this.f30175q.e(new a(), z9);
    }

    @Override // p064g3.f
    public void a() {
        if (this.f30175q.h()) {
            this.f30175q.g(null).m(this.f30177s);
        }
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        return this.f30175q.h();
    }

    @Override // p064g3.f
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public GridSectionView f(Context context) {
        GridSectionView gridSectionView = (GridSectionView) LayoutInflater.from(context).inflate(R.layout.grid_section_view, (ViewGroup) null);
        this.f30179u = (TextView) gridSectionView.findViewById(R.id.grid_section_description);
        this.f30180v = gridSectionView.findViewById(R.id.grid_section_tile);
        r(false);
        this.f30175q.g(null).h(this.f30178t, this.f30177s);
        gridSectionView.setOnClickListener(new View.OnClickListener() { // from class: y1.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f30174q.o(view);
            }
        });
        return gridSectionView;
    }
}
