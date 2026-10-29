package p236x5;

import B5.e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import p079h8.A;
import p206u5.c;
import p226w5.j;
import p226w5.p;

/* JADX INFO: loaded from: classes.dex */
public final class f implements p {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f29971t = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final JSONObject f29972q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final j f29973r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f29974s;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends ViewPager2.OnPageChangeCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f29976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f29977c;

        b(View view, e eVar) {
            this.f29976b = view;
            this.f29977c = eVar;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            f.this.f29973r.f(this.f29976b, i10, this.f29977c);
        }
    }

    public f(JSONObject infoJson, j actionHandler) {
        n.h(infoJson, "infoJson");
        n.h(actionHandler, "actionHandler");
        this.f29972q = infoJson;
        this.f29973r = actionHandler;
        this.f29974s = ((Number) c.c(infoJson, H5.j.f2545a.b(), -1)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(f this$0, View target, e simulatedResult, p216v5.a handler, View view) {
        n.h(this$0, "this$0");
        n.h(target, "$target");
        n.h(simulatedResult, "$simulatedResult");
        n.h(handler, "$handler");
        this$0.f29973r.k(target, simulatedResult, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(f this$0, View target, e simulatedResult, p216v5.a handler, View view) {
        n.h(this$0, "this$0");
        n.h(target, "$target");
        n.h(simulatedResult, "$simulatedResult");
        n.h(handler, "$handler");
        return this$0.f29973r.g(target, simulatedResult, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(f this$0, View target, e simulatedResult, p216v5.a handler, CompoundButton compoundButton, boolean z9) {
        n.h(this$0, "this$0");
        n.h(target, "$target");
        n.h(simulatedResult, "$simulatedResult");
        n.h(handler, "$handler");
        n.h(compoundButton, "<unused var>");
        this$0.f29973r.c(target, z9, simulatedResult, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(f this$0, View target, e simulatedResult, p216v5.a handler, AdapterView adapterView, View view, int i10, long j9) {
        n.h(this$0, "this$0");
        n.h(target, "$target");
        n.h(simulatedResult, "$simulatedResult");
        n.h(handler, "$handler");
        this$0.f29973r.a(target, i10, simulatedResult, handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(f this$0, View target, e simulatedResult, p216v5.a handler, AdapterView adapterView, View view, int i10, long j9) {
        n.h(this$0, "this$0");
        n.h(target, "$target");
        n.h(simulatedResult, "$simulatedResult");
        n.h(handler, "$handler");
        return this$0.f29973r.j(target, i10, simulatedResult, handler);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Object g(View view, ViewGroup viewGroup, p226w5.f fVar, final p216v5.a aVar, p226w5.n nVar, p129m8.e eVar) {
        final View viewFindViewById;
        int i10 = this.f29974s;
        if (-1 != i10 && (viewFindViewById = view.findViewById(i10)) != null) {
            Iterator<String> itKeys = this.f29972q.keys();
            n.g(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject = this.f29972q;
                n.e(next);
                final e eVar2 = new e(c.b(jSONObject, next));
                switch (next.hashCode()) {
                    case -1830599363:
                        if (next.equals("on_list_item_click") && (viewFindViewById instanceof AbsListView)) {
                            ((AbsListView) viewFindViewById).setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: x5.d
                                @Override // android.widget.AdapterView.OnItemClickListener
                                public final void onItemClick(AdapterView adapterView, View view2, int i11, long j9) {
                                    f.k(this.f29963q, viewFindViewById, eVar2, aVar, adapterView, view2, i11, j9);
                                }
                            });
                        }
                        break;
                    case -439330715:
                        if (next.equals("on_long_click")) {
                            viewFindViewById.setOnLongClickListener(new View.OnLongClickListener() { // from class: x5.b
                                @Override // android.view.View.OnLongClickListener
                                public final boolean onLongClick(View view2) {
                                    return f.i(this.f29955a, viewFindViewById, eVar2, aVar, view2);
                                }
                            });
                        }
                        break;
                    case 146232326:
                        if (next.equals("registerOnPageChangeCallback") && (viewFindViewById instanceof ViewPager2)) {
                            ((ViewPager2) viewFindViewById).registerOnPageChangeCallback(new b(viewFindViewById, eVar2));
                        }
                        break;
                    case 151268208:
                        if (next.equals("on_list_item_long_click") && (viewFindViewById instanceof AbsListView)) {
                            ((AbsListView) viewFindViewById).setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: x5.e
                                @Override // android.widget.AdapterView.OnItemLongClickListener
                                public final boolean onItemLongClick(AdapterView adapterView, View view2, int i11, long j9) {
                                    return f.l(this.f29967a, viewFindViewById, eVar2, aVar, adapterView, view2, i11, j9);
                                }
                            });
                        }
                        break;
                    case 1834095400:
                        if (next.equals("on_click")) {
                            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: x5.a
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    f.h(this.f29951q, viewFindViewById, eVar2, aVar, view2);
                                }
                            });
                        }
                        break;
                    case 1855915964:
                        if (next.equals("on_checked_changed") && (viewFindViewById instanceof CompoundButton)) {
                            ((CompoundButton) viewFindViewById).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: x5.c
                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                                    f.j(this.f29959q, viewFindViewById, eVar2, aVar, compoundButton, z9);
                                }
                            });
                        }
                        break;
                }
            }
        }
        return A.f21846a;
    }
}
