package p062g1;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.n;
import p072h1.b;
import p072h1.c;
import p142o1.g;
import p142o1.h;
import p162q1.a;

/* JADX INFO: loaded from: classes.dex */
public final class u implements h, g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f21128q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f21129r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final File f21130s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Callable f21131t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f21132u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final h f21133v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private f f21134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f21135x;

    public u(Context context, String str, File file, Callable callable, int i10, h delegate) {
        n.h(context, "context");
        n.h(delegate, "delegate");
        this.f21128q = context;
        this.f21129r = str;
        this.f21130s = file;
        this.f21131t = callable;
        this.f21132u = i10;
        this.f21133v = delegate;
    }

    private final void b(File file, boolean z9) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.f21129r != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f21128q.getAssets().open(this.f21129r));
            n.g(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.f21130s != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f21130s).getChannel();
            n.g(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable callable = this.f21131t;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel((InputStream) callable.call());
                n.g(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.f21128q.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        n.g(output, "output");
        c.a(readableByteChannelNewChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        n.g(intermediateFile, "intermediateFile");
        f(intermediateFile, z9);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final void f(File file, boolean z9) {
        f fVar = this.f21134w;
        if (fVar == null) {
            n.r("databaseConfiguration");
            fVar = null;
        }
        fVar.getClass();
    }

    private final void j(boolean z9) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databaseFile = this.f21128q.getDatabasePath(databaseName);
        f fVar = this.f21134w;
        f fVar2 = null;
        if (fVar == null) {
            n.r("databaseConfiguration");
            fVar = null;
        }
        a aVar = new a(databaseName, this.f21128q.getFilesDir(), fVar.f21053s);
        try {
            a.c(aVar, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    n.g(databaseFile, "databaseFile");
                    b(databaseFile, z9);
                    aVar.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                n.g(databaseFile, "databaseFile");
                int iC = b.c(databaseFile);
                if (iC == this.f21132u) {
                    aVar.d();
                    return;
                }
                f fVar3 = this.f21134w;
                if (fVar3 == null) {
                    n.r("databaseConfiguration");
                } else {
                    fVar2 = fVar3;
                }
                if (fVar2.a(iC, this.f21132u)) {
                    aVar.d();
                    return;
                }
                if (this.f21128q.deleteDatabase(databaseName)) {
                    try {
                        b(databaseFile, z9);
                    } catch (IOException e11) {
                        Log.w("ROOM", "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.d();
                return;
            } catch (IOException e12) {
                Log.w("ROOM", "Unable to read database version.", e12);
                aVar.d();
                return;
            }
        } catch (Throwable th) {
            aVar.d();
            throw th;
        }
        aVar.d();
        throw th;
    }

    @Override // p062g1.g
    public h a() {
        return this.f21133v;
    }

    @Override // p142o1.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        a().close();
        this.f21135x = false;
    }

    @Override // p142o1.h
    public g e0() {
        if (!this.f21135x) {
            j(true);
            this.f21135x = true;
        }
        return a().e0();
    }

    public final void g(f databaseConfiguration) {
        n.h(databaseConfiguration, "databaseConfiguration");
        this.f21134w = databaseConfiguration;
    }

    @Override // p142o1.h
    public String getDatabaseName() {
        return a().getDatabaseName();
    }

    @Override // p142o1.h
    public void setWriteAheadLoggingEnabled(boolean z9) {
        a().setWriteAheadLoggingEnabled(z9);
    }
}
