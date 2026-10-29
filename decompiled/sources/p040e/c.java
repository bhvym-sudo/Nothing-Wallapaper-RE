package p040e;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p040e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19757a = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    @Override // p040e.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent input) {
        n.h(context, "context");
        n.h(input, "input");
        return input;
    }

    @Override // p040e.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public p030d.a c(int i10, Intent intent) {
        return new p030d.a(i10, intent);
    }
}
