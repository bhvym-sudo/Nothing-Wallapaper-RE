package p011b0;

import kotlin.jvm.internal.o;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f14666a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final q f14667b = new q("TestTagsAsResourceId", false, a.f14669r);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f14668c = 8;

    static final class a extends o implements p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f14669r = new a();

        a() {
            super(2);
        }

        public final Boolean a(Boolean bool, boolean z9) {
            return bool;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Boolean) obj, ((Boolean) obj2).booleanValue());
        }
    }

    private n() {
    }

    public final q a() {
        return f14667b;
    }
}
