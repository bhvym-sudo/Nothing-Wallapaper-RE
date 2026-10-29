package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.b f13603a = androidx.concurrent.futures.b.o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f13604b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f13605c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f13606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f13607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f13608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f13609d;

        b(int i10, int i11, long j9, long j10) {
            this.f13606a = i10;
            this.f13607b = i11;
            this.f13608c = j9;
            this.f13609d = j10;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f13606a);
                dataOutputStream.writeInt(this.f13607b);
                dataOutputStream.writeLong(this.f13608c);
                dataOutputStream.writeLong(this.f13609d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f13607b == bVar.f13607b && this.f13608c == bVar.f13608c && this.f13606a == bVar.f13606a && this.f13609d == bVar.f13609d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f13607b), Long.valueOf(this.f13608c), Integer.valueOf(this.f13606a), Long.valueOf(this.f13609d));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f13610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f13611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f13612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f13613d;

        c(int i10, boolean z9, boolean z10, boolean z11) {
            this.f13610a = i10;
            this.f13612c = z10;
            this.f13611b = z9;
            this.f13613d = z11;
        }
    }

    private static long a(Context context) {
        return a.a(context.getApplicationContext().getPackageManager(), context).lastUpdateTime;
    }

    private static c b(int i10, boolean z9, boolean z10, boolean z11) {
        c cVar = new c(i10, z9, z10, z11);
        f13605c = cVar;
        f13603a.m(cVar);
        return f13605c;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:21:0x002d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    static c c(Context context, boolean z9) {
        int i10;
        boolean z10;
        File file;
        boolean z11;
        File file2;
        long length;
        boolean z12;
        File file3;
        b bVarA;
        b bVar;
        int i11;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        c cVar;
        if (!z9 && (cVar = f13605c) != null) {
            return cVar;
        }
        synchronized (f13604b) {
            if (z9) {
                i10 = 0;
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                if (assetFileDescriptorOpenFd.getLength() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                assetFileDescriptorOpenFd.close();
                file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length2 = file.length();
                if (file.exists()) {
                    z11 = false;
                } else {
                    z11 = false;
                }
                file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                length = file2.length();
                if (file2.exists()) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                long jA = a(context);
                file3 = new File(context.getFilesDir(), "profileInstalled");
                if (file3.exists()) {
                    bVarA = b.a(file3);
                } else {
                    bVarA = null;
                }
                if (bVarA == null) {
                    if (!z10) {
                        i10 = 327680;
                    } else if (z11) {
                        i10 = 1;
                    } else if (z12) {
                        i10 = 2;
                    }
                } else if (!z10) {
                    i10 = 327680;
                } else if (z11) {
                    i10 = 1;
                } else if (z12) {
                    i10 = 2;
                }
                if (z9) {
                    i10 = 2;
                }
                if (bVarA != null) {
                    i10 = 3;
                }
                int i12 = i10;
                bVar = new b(1, i12, jA, length);
                if (bVarA != null) {
                    bVar.b(file3);
                } else {
                    bVar.b(file3);
                }
                return b(i12, z11, z12, z10);
            }
            c cVar2 = f13605c;
            if (cVar2 != null) {
                return cVar2;
            }
            i10 = 0;
            try {
                assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                try {
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th) {
                    if (assetFileDescriptorOpenFd == null) {
                        throw th;
                    }
                    try {
                        assetFileDescriptorOpenFd.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException unused) {
                z10 = false;
            }
            file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
            long length3 = file.length();
            if (file.exists() || length3 <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
            length = file2.length();
            if (file2.exists() || length <= 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            try {
                long jA2 = a(context);
                file3 = new File(context.getFilesDir(), "profileInstalled");
                if (file3.exists()) {
                    try {
                        bVarA = b.a(file3);
                    } catch (IOException unused2) {
                        return b(131072, z11, z12, z10);
                    }
                } else {
                    bVarA = null;
                }
                if (bVarA == null && bVarA.f13608c == jA2 && (i11 = bVarA.f13607b) != 2) {
                    i10 = i11;
                } else if (!z10) {
                    i10 = 327680;
                } else if (z11) {
                    i10 = 1;
                } else if (z12) {
                    i10 = 2;
                }
                if (z9 && z12 && i10 != 1) {
                    i10 = 2;
                }
                if (bVarA != null && bVarA.f13607b == 2 && i10 == 1 && length3 < bVarA.f13609d) {
                    i10 = 3;
                }
                int i13 = i10;
                bVar = new b(1, i13, jA2, length);
                if (bVarA != null || !bVarA.equals(bVar)) {
                    try {
                        bVar.b(file3);
                    } catch (IOException unused3) {
                        i13 = 196608;
                    }
                }
                return b(i13, z11, z12, z10);
            } catch (PackageManager.NameNotFoundException unused4) {
                return b(ArrayPool.STANDARD_BUFFER_SIZE_BYTES, z11, z12, z10);
            }
            throw th;
        }
    }
}
