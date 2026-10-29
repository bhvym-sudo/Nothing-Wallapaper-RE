package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1149i implements InterfaceC1160u {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC1148h f13413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC1160u f13414r;

    /* JADX INFO: renamed from: androidx.lifecycle.i$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13415a;

        static {
            int[] iArr = new int[AbstractC1157q.a.values().length];
            try {
                iArr[AbstractC1157q.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1157q.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1157q.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1157q.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1157q.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1157q.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1157q.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f13415a = iArr;
        }
    }

    public C1149i(InterfaceC1148h defaultLifecycleObserver, InterfaceC1160u interfaceC1160u) {
        kotlin.jvm.internal.n.h(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f13413q = defaultLifecycleObserver;
        this.f13414r = interfaceC1160u;
    }

    @Override // androidx.lifecycle.InterfaceC1160u
    public void onStateChanged(InterfaceC1163x source, AbstractC1157q.a event) {
        kotlin.jvm.internal.n.h(source, "source");
        kotlin.jvm.internal.n.h(event, "event");
        switch (a.f13415a[event.ordinal()]) {
            case 1:
                this.f13413q.g(source);
                break;
            case 2:
                this.f13413q.onStart(source);
                break;
            case 3:
                this.f13413q.b(source);
                break;
            case 4:
                this.f13413q.j(source);
                break;
            case 5:
                this.f13413q.onStop(source);
                break;
            case 6:
                this.f13413q.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1160u interfaceC1160u = this.f13414r;
        if (interfaceC1160u != null) {
            interfaceC1160u.onStateChanged(source, event);
        }
    }
}
