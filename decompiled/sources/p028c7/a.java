package p028c7;

import android.content.Context;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p068g7.k;
import p068g7.m;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends FragmentStateAdapter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0437a f15234q = new C0437a(null);

    /* JADX INFO: renamed from: c7.a$a, reason: collision with other inner class name */
    public static final class C0437a {
        public /* synthetic */ C0437a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final String a(Context context, boolean z9) {
            n.h(context, "context");
            String string = context.getString(z9 ? R.string.lock_screen_tab : R.string.home_screen_tab);
            n.g(string, "getString(...)");
            return string;
        }

        public final int b(boolean z9) {
            return z9 ? R.string.lock_screen_tab : R.string.home_screen_tab;
        }

        public final boolean c(int i10) {
            return i10 == 0;
        }

        private C0437a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k parentFragment) {
        super(parentFragment);
        n.h(parentFragment, "parentFragment");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public AbstractComponentCallbacksC1132q createFragment(int i10) {
        return m.f21354s.a(f15234q.c(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 2;
    }
}
