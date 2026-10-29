package Q7;

import android.content.Context;
import android.graphics.Bitmap;
import com.nothing.wallpaper.common.bitmap.BitmapOpaqueUtil;
import com.nothing.wallpaper.segmenter.Segmenter;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Segmenter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0250a f6887c = new C0250a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f6889b;

    /* JADX INFO: renamed from: Q7.a$a, reason: collision with other inner class name */
    public static final class C0250a {
        public /* synthetic */ C0250a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0250a() {
        }
    }

    public static final class b implements f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p079h8.o f6890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Segmenter.a f6891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f6892c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Bitmap f6893d;

        b(p079h8.o oVar, Segmenter.a aVar, a aVar2, Bitmap bitmap) {
            this.f6890a = oVar;
            this.f6891b = aVar;
            this.f6892c = aVar2;
            this.f6893d = bitmap;
        }

        @Override // Q7.f.a
        public void a() {
            com.nothing.wallpaper.common.log.c.o("MLKitSegmenter", "onSegment failure");
            if (!((Boolean) this.f6890a.d()).booleanValue()) {
                ((Bitmap) this.f6890a.c()).recycle();
            }
            this.f6891b.a(Segmenter.FailReason.SubjectNull.INSTANCE);
        }

        @Override // Q7.f.a
        public void b(p076h5.c subject) {
            kotlin.jvm.internal.n.h(subject, "subject");
            com.nothing.wallpaper.common.log.c.k("MLKitSegmenter", "onSegment success bitmap:" + subject.a());
            Bitmap bitmapA = subject.a();
            if (bitmapA != null) {
                a aVar = this.f6892c;
                Bitmap bitmap = this.f6893d;
                try {
                    aVar.g(bitmapA, subject.b(), bitmap.getWidth(), bitmap.getHeight(), this.f6890a, this.f6891b);
                    bitmapA.recycle();
                } catch (Throwable th) {
                    bitmapA.recycle();
                    throw th;
                }
            } else {
                Segmenter.a aVar2 = this.f6891b;
                com.nothing.wallpaper.common.log.c.o("MLKitSegmenter", "segment bitmap is null!");
                aVar2.a(Segmenter.FailReason.SubjectNull.INSTANCE);
            }
            if (((Boolean) this.f6890a.d()).booleanValue()) {
                return;
            }
            ((Bitmap) this.f6890a.c()).recycle();
        }
    }

    public a(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        this.f6888a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Bitmap bitmap, FloatBuffer floatBuffer, int i10, int i11, p079h8.o oVar, Segmenter.a aVar) {
        if (BitmapOpaqueUtil.f18426a.j(bitmap, 0)) {
            com.nothing.wallpaper.common.log.c.o("MLKitSegmenter", "segment bitmap is transparent!");
            aVar.a(Segmenter.FailReason.SubjectTransparent.INSTANCE);
            return;
        }
        Bitmap bitmapH = h(this.f6888a, (Bitmap) oVar.c(), bitmap, floatBuffer);
        p079h8.o oVarD = p097j6.d.d(bitmapH, i10, i11);
        if (!((Boolean) oVarD.d()).booleanValue()) {
            bitmapH.recycle();
        }
        aVar.b((Bitmap) oVarD.c());
    }

    private final Bitmap h(Context context, Bitmap bitmap, Bitmap bitmap2, FloatBuffer floatBuffer) {
        return p097j6.a.n(context, bitmap, bitmap2, floatBuffer, new j6.a.c(true, 8, 1, 3, 5, 1, true, 3, true, 6, 4, 100, 0.15f, 0.95f, 0, 0, 0, 0.0f, false, false, false, 245760, null));
    }

    @Override // com.nothing.wallpaper.segmenter.Segmenter
    public void a() {
        com.nothing.wallpaper.common.log.c.d("MLKitSegmenter", "init segmenter");
        if (this.f6889b == null) {
            this.f6889b = new s(this.f6888a);
        }
    }

    @Override // com.nothing.wallpaper.segmenter.Segmenter
    public void b(Segmenter.b listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        s sVar = this.f6889b;
        if (sVar != null) {
            sVar.r(listener);
        }
    }

    @Override // com.nothing.wallpaper.segmenter.Segmenter
    public Segmenter.ModuleState c() {
        Segmenter.ModuleState moduleStateY;
        s sVar = this.f6889b;
        return (sVar == null || (moduleStateY = sVar.y()) == null) ? Segmenter.ModuleState.UnaAvailable.INSTANCE : moduleStateY;
    }

    @Override // com.nothing.wallpaper.segmenter.Segmenter
    public void close() {
        com.nothing.wallpaper.common.log.c.d("MLKitSegmenter", "close segmenter");
        s sVar = this.f6889b;
        if (sVar != null) {
            sVar.O();
            sVar.w();
        }
        this.f6889b = null;
    }

    @Override // com.nothing.wallpaper.segmenter.Segmenter
    public boolean d(Bitmap bitmap, Segmenter.a listener) {
        kotlin.jvm.internal.n.h(bitmap, "bitmap");
        kotlin.jvm.internal.n.h(listener, "listener");
        if (this.f6889b == null || bitmap.isRecycled()) {
            com.nothing.wallpaper.common.log.c.f("MLKitSegmenter", "segment fail, segmenter is null, isRecycled is " + bitmap.isRecycled());
            listener.a(Segmenter.FailReason.InputNull.INSTANCE);
            return false;
        }
        p079h8.o oVarE = p097j6.d.e(bitmap, 24117248L);
        if (oVarE == null) {
            com.nothing.wallpaper.common.log.c.f("MLKitSegmenter", "scale bitmap to max memory error!");
            listener.a(Segmenter.FailReason.InputNull.INSTANCE);
            return false;
        }
        s sVar = this.f6889b;
        if (sVar != null) {
            return sVar.I((Bitmap) oVarE.c(), new b(oVarE, listener, this, bitmap));
        }
        return false;
    }

    @Override // com.nothing.wallpaper.segmenter.Segmenter
    public void e(Segmenter.b listener) {
        kotlin.jvm.internal.n.h(listener, "listener");
        s sVar = this.f6889b;
        if (sVar != null) {
            sVar.N(listener);
        }
    }
}
