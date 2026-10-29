package p064g3;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p084i3.s0;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    public interface a {
        void P(String str);

        void g(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q);
    }

    default void a() {
    }

    default View c(View view, Context context) {
        n.h(view, "view");
        n.h(context, "context");
        return null;
    }

    default void d(Bundle savedInstanceState) {
        n.h(savedInstanceState, "savedInstanceState");
    }

    boolean e(Context context);

    s0 f(Context context);

    default s0 h(Context context, b params) {
        n.h(context, "context");
        n.h(params, "params");
        return f(context);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f21162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f21163b;

        public b(boolean z9, boolean z10) {
            this.f21162a = z9;
            this.f21163b = z10;
        }

        public final boolean a() {
            return this.f21163b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f21162a == bVar.f21162a && this.f21163b == bVar.f21163b;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f21162a) * 31) + Boolean.hashCode(this.f21163b);
        }

        public String toString() {
            return "ViewCreationParams(isOnLockScreen=" + this.f21162a + ", isConnectedHorizontallyToOtherSections=" + this.f21163b + ")";
        }

        public /* synthetic */ b(boolean z9, boolean z10, int i10, AbstractC1457h abstractC1457h) {
            this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? false : z10);
        }
    }
}
