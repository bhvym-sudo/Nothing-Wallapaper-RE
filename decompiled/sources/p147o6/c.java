package p147o6;

import com.bumptech.glide.TransitionOptions;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends TransitionOptions {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f23446q = new a(null);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final c a(int i10) {
            return new c().c(i10);
        }

        private a() {
        }
    }

    public final c c(int i10) {
        return d(new b.a(i10));
    }

    public final c d(b.a builder) {
        n.h(builder, "builder");
        return e(builder.a());
    }

    public final c e(b drawableCrossFadeFactory) {
        n.h(drawableCrossFadeFactory, "drawableCrossFadeFactory");
        TransitionOptions transitionOptionsTransition = transition(drawableCrossFadeFactory);
        n.g(transitionOptionsTransition, "transition(...)");
        return (c) transitionOptionsTransition;
    }

    @Override // com.bumptech.glide.TransitionOptions
    public boolean equals(Object obj) {
        return (obj instanceof c) && super.equals(obj);
    }

    @Override // com.bumptech.glide.TransitionOptions
    public int hashCode() {
        return super.hashCode();
    }
}
