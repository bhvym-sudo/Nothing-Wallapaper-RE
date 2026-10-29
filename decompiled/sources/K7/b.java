package K7;

import A3.f;
import F8.InterfaceC0807d0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC1163x;
import com.nothing.wallpaper.NTPickerApplication;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p079h8.A;
import p219v8.p;
import p219v8.s;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p254z3.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final int f4135A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final InterfaceC1163x f4136x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final p f4137y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f4138z;

    public static final class a extends p254z3.a.C0762a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            n.h(itemView, "itemView");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, InterfaceC1163x lifecycleOwner, p bindIcon) {
        super(i10, lifecycleOwner, null, null, bindIcon, 12, null);
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(bindIcon, "bindIcon");
        this.f4136x = lifecycleOwner;
        this.f4137y = bindIcon;
        this.f4135A = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A j(View borderView, View contentView, boolean z9, f.a animationSpec, boolean z10) {
        n.h(borderView, "borderView");
        n.h(contentView, "contentView");
        n.h(animationSpec, "animationSpec");
        p167q6.a.d(borderView, contentView, z9);
        return A.f21846a;
    }

    @Override // p254z3.a, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f */
    public void onBindViewHolder(p254z3.a.C0762a holder, int i10) {
        n.h(holder, "holder");
        InterfaceC0807d0 interfaceC0807d0D = holder.d();
        if (interfaceC0807d0D != null) {
            interfaceC0807d0D.dispose();
        }
        B3.a aVar = (B3.a) e().get(i10);
        if (((p013b2.a) aVar.d()) != null) {
            p pVar = this.f4137y;
            View viewRequireViewById = holder.itemView.requireViewById(R.id.foreground);
            n.g(viewRequireViewById, "requireViewById(...)");
            pVar.invoke(viewRequireViewById, aVar.d());
        }
        f fVar = f.f167a;
        View itemView = holder.itemView;
        n.g(itemView, "itemView");
        holder.e(f.l(fVar, itemView, aVar, this.f4136x, null, null, new s() { // from class: K7.a
            @Override // p219v8.s
            public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return b.j((View) obj, (View) obj2, ((Boolean) obj3).booleanValue(), (f.a) obj4, ((Boolean) obj5).booleanValue());
            }
        }, 24, null));
    }

    @Override // p254z3.a, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public p254z3.a.C0762a onCreateViewHolder(ViewGroup parent, int i10) {
        n.h(parent, "parent");
        if (i10 == this.f4138z) {
            return super.onCreateViewHolder(parent, i10);
        }
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.nt_color_option_bauhaus, parent, false);
        n.g(viewInflate, "inflate(...)");
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return n.d("Bauhaus", ((B3.a) e().get(i10)).e().a(NTPickerApplication.f18424q.a())) ? this.f4135A : this.f4138z;
    }
}
