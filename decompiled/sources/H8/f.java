package H8;

import F8.InterfaceC0822l;
import K8.D;
import K8.G;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f2599a = new l(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f2600b = G.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f2601c = G.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f2602d = new D("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final D f2603e = new D("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final D f2604f = new D("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final D f2605g = new D("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final D f2606h = new D("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final D f2607i = new D("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final D f2608j = new D("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final D f2609k = new D("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final D f2610l = new D("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final D f2611m = new D("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final D f2612n = new D("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final D f2613o = new D("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final D f2614p = new D("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final D f2615q = new D("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final D f2616r = new D("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final D f2617s = new D("NO_CLOSE_CAUSE");

    /* synthetic */ class a extends kotlin.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f2618q = new a();

        a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final l g(long j9, l lVar) {
            return f.x(j9, lVar);
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return g(((Number) obj).longValue(), (l) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(InterfaceC0822l interfaceC0822l, Object obj, p219v8.q qVar) {
        Object objR = interfaceC0822l.r(obj, null, qVar);
        if (objR == null) {
            return false;
        }
        interfaceC0822l.t(objR);
        return true;
    }

    static /* synthetic */ boolean C(InterfaceC0822l interfaceC0822l, Object obj, p219v8.q qVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            qVar = null;
        }
        return B(interfaceC0822l, obj, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(long j9, boolean z9) {
        return (z9 ? 4611686018427387904L : 0L) + j9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long w(long j9, int i10) {
        return (((long) i10) << 60) + j9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l x(long j9, l lVar) {
        return new l(j9, lVar, lVar.y(), 0);
    }

    public static final C8.e y() {
        return a.f2618q;
    }

    public static final D z() {
        return f2610l;
    }
}
