package p066g5;

import android.graphics.Bitmap;
import android.media.Image;
import java.nio.ByteBuffer;
import p025c4.AbstractC1202p;
import p025c4.C1195i;
import p115l4.a;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1195i f21282a = new C1195i("MLKitImageUtils", "");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f21283b = new b();

    private b() {
    }

    public static b b() {
        return f21283b;
    }

    public a a(p056f5.a aVar) throws Z4.a {
        int iD = aVar.d();
        if (iD == -1) {
            return p115l4.b.X((Bitmap) AbstractC1202p.i(aVar.b()));
        }
        if (iD != 17) {
            if (iD == 35) {
                return p115l4.b.X(aVar.f());
            }
            if (iD != 842094169) {
                throw new Z4.a("Unsupported image format: " + aVar.d(), 3);
            }
        }
        return p115l4.b.X((ByteBuffer) AbstractC1202p.i(aVar.c()));
    }

    public int c(p056f5.a aVar) {
        if (aVar.d() == -1) {
            return ((Bitmap) AbstractC1202p.i(aVar.b())).getAllocationByteCount();
        }
        if (aVar.d() == 17 || aVar.d() == 842094169) {
            return ((ByteBuffer) AbstractC1202p.i(aVar.c())).limit();
        }
        if (aVar.d() != 35) {
            return 0;
        }
        return (((Image.Plane[]) AbstractC1202p.i(aVar.g()))[0].getBuffer().limit() * 3) / 2;
    }
}
