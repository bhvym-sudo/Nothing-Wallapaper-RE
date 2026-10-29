package p147o6;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.request.transition.TransitionFactory;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements TransitionFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p147o6.a f23444b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f23445a;

        public a(int i10) {
            this.f23445a = i10;
        }

        public final b a() {
            return new b(this.f23445a);
        }
    }

    public b(int i10) {
        this.f23443a = i10;
    }

    private final p147o6.a a() {
        if (this.f23444b == null) {
            this.f23444b = new p147o6.a(this.f23443a);
        }
        return this.f23444b;
    }

    @Override // com.bumptech.glide.request.transition.TransitionFactory
    public Transition build(DataSource dataSource, boolean z9) {
        n.h(dataSource, "dataSource");
        p147o6.a aVarA = a();
        n.e(aVarA);
        return aVarA;
    }
}
