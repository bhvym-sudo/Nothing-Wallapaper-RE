package I5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.q;
import p079h8.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3119a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final ColorStateList a(Context context, int i10) {
            Object objB;
            n.h(context, "context");
            try {
                q.a aVar = q.f21862r;
                objB = q.b(context.getResources().getColorStateList(i10, null));
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th));
            }
            return (ColorStateList) (q.f(objB) ? null : objB);
        }

        public final Drawable b(Context context, int i10) {
            Object objB;
            n.h(context, "context");
            try {
                q.a aVar = q.f21862r;
                objB = q.b(p181s0.h.e(context.getResources(), i10, null));
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th));
            }
            return (Drawable) (q.f(objB) ? null : objB);
        }

        public final Icon c(Context context, int i10) {
            Object objB;
            n.h(context, "context");
            try {
                q.a aVar = q.f21862r;
                objB = q.b(Icon.createWithResource(context, i10));
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th));
            }
            if (q.f(objB)) {
                objB = null;
            }
            return (Icon) objB;
        }

        private a() {
        }
    }
}
