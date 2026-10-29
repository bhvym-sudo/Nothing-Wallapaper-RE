package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f13572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f13573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.c f13574c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f13576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f13577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f13578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f13579h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c[] f13581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f13582k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f13580i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f13575d = d();

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f13572a = assetManager;
        this.f13573b = executor;
        this.f13574c = cVar;
        this.f13577f = str;
        this.f13578g = str2;
        this.f13579h = str3;
        this.f13576e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) {
        try {
            InputStream inputStreamG = g(this.f13572a, this.f13579h);
            if (inputStreamG == null) {
                if (inputStreamG != null) {
                    inputStreamG.close();
                }
                return null;
            }
            try {
                this.f13581j = g.r(inputStreamG, g.p(inputStreamG, g.f13602b), bArr, cVarArr);
                inputStreamG.close();
                return this;
            } catch (Throwable th) {
                try {
                    inputStreamG.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException e10) {
            this.f13574c.b(9, e10);
        } catch (IOException e11) {
            this.f13574c.b(7, e11);
        } catch (IllegalStateException e12) {
            this.f13581j = null;
            this.f13574c.b(8, e12);
        }
    }

    private void c() {
        if (!this.f13580i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        return i.f13614a;
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f13578g);
        } catch (FileNotFoundException e10) {
            this.f13574c.b(6, e10);
            return null;
        } catch (IOException e11) {
            this.f13574c.b(7, e11);
            return null;
        }
    }

    private InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f13574c.a(5, null);
            }
            return null;
        }
    }

    private c[] i(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        c[] cVarArrX = g.x(inputStream, g.p(inputStream, g.f13601a), this.f13577f);
                        try {
                            return cVarArrX;
                        } catch (IOException e10) {
                            return cVarArrX;
                        }
                    } catch (IOException e11) {
                        this.f13574c.b(7, e11);
                        return null;
                    }
                } catch (IllegalStateException e12) {
                    this.f13574c.b(8, e12);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e13) {
                this.f13574c.b(7, e13);
                inputStream.close();
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e14) {
                this.f13574c.b(7, e14);
            }
        }
    }

    private static boolean j() {
        return true;
    }

    private void k(final int i10, final Object obj) {
        this.f13573b.execute(new Runnable() { // from class: e1.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f19773q.f13574c.b(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f13575d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f13576e.exists()) {
            try {
                if (!this.f13576e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f13576e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f13580i = true;
        return true;
    }

    public b h() {
        b bVarB;
        c();
        if (this.f13575d != null) {
            InputStream inputStreamF = f(this.f13572a);
            if (inputStreamF != null) {
                this.f13581j = i(inputStreamF);
            }
            c[] cVarArr = this.f13581j;
            if (cVarArr != null && j() && (bVarB = b(cVarArr, this.f13575d)) != null) {
                return bVarB;
            }
        }
        return this;
    }

    public b l() {
        c[] cVarArr = this.f13581j;
        byte[] bArr = this.f13575d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g.F(byteArrayOutputStream, bArr);
                    if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                        this.f13574c.b(5, null);
                        this.f13581j = null;
                        byteArrayOutputStream.close();
                        return this;
                    }
                    this.f13582k = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    this.f13581j = null;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e10) {
                this.f13574c.b(7, e10);
            } catch (IllegalStateException e11) {
                this.f13574c.b(8, e11);
            }
        }
        return this;
    }

    public boolean m() {
        byte[] bArr = this.f13582k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f13576e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                d.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                this.f13582k = null;
                                this.f13581j = null;
                                return true;
                            } catch (Throwable th) {
                                if (fileLockTryLock != null) {
                                    try {
                                        fileLockTryLock.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            } catch (FileNotFoundException e10) {
                k(6, e10);
                this.f13582k = null;
                this.f13581j = null;
                return false;
            } catch (IOException e11) {
                k(7, e11);
                this.f13582k = null;
                this.f13581j = null;
                return false;
            }
        } catch (Throwable th9) {
            this.f13582k = null;
            this.f13581j = null;
            throw th9;
        }
    }
}
