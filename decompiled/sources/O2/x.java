package O2;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5826c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f5827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f5828b;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public x(View view) {
        kotlin.jvm.internal.n.h(view, "view");
        this.f5827a = view;
        this.f5828b = AbstractC1444s.e(view);
    }

    public final View a() {
        return this.f5827a;
    }

    public List b() {
        return this.f5828b;
    }
}
