package L0;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class q extends n implements K {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4511q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4512r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f4513s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f4515u;

        a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4513s = obj;
            this.f4515u |= Integer.MIN_VALUE;
            return q.this.d(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(File file, A serializer) {
        super(file, serializer);
        kotlin.jvm.internal.n.h(file, "file");
        kotlin.jvm.internal.n.h(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // L0.K
    public Object d(Object obj, p129m8.e eVar) throws IOException {
        a aVar;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f4515u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f4515u = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj2 = aVar.f4513s;
        Object objE = p139n8.b.e();
        int i11 = aVar.f4515u;
        if (i11 == 0) {
            p079h8.r.b(obj2);
            f();
            FileOutputStream fileOutputStream2 = new FileOutputStream(g());
            try {
                A aH = h();
                I i12 = new I(fileOutputStream2);
                aVar.f4511q = fileOutputStream2;
                aVar.f4512r = fileOutputStream2;
                aVar.f4515u = 1;
                if (aH.b(obj, i12, aVar) == objE) {
                    return objE;
                }
                fileOutputStream = fileOutputStream2;
                closeable = fileOutputStream;
            } catch (Throwable th) {
                th = th;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) aVar.f4512r;
            closeable = (Closeable) aVar.f4511q;
            try {
                p079h8.r.b(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    p189s8.b.a(closeable, th);
                    throw th3;
                }
            }
        }
        fileOutputStream.getFD().sync();
        p079h8.A a10 = p079h8.A.f21846a;
        p189s8.b.a(closeable, null);
        return p079h8.A.f21846a;
    }
}
