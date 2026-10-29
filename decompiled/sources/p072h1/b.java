package p072h1;

import E8.i;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.jvm.internal.n;
import p062g1.q;
import p079h8.A;
import p089i8.AbstractC1444s;
import p142o1.g;
import p142o1.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(g db) throws IOException {
        n.h(db, "db");
        List listC = AbstractC1444s.c();
        Cursor cursorF0 = db.f0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorF0.moveToNext()) {
            try {
                listC.add(cursorF0.getString(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p189s8.b.a(cursorF0, th);
                    throw th2;
                }
            }
        }
        A a10 = A.f21846a;
        p189s8.b.a(cursorF0, null);
        for (String triggerName : AbstractC1444s.a(listC)) {
            n.g(triggerName, "triggerName");
            if (i.M(triggerName, "room_fts_content_sync_", false, 2, null)) {
                db.q("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    public static final Cursor b(q db, j sqLiteQuery, boolean z9, CancellationSignal cancellationSignal) {
        n.h(db, "db");
        n.h(sqLiteQuery, "sqLiteQuery");
        Cursor cursorX = db.x(sqLiteQuery, cancellationSignal);
        if (!z9 || !(cursorX instanceof AbstractWindowedCursor)) {
            return cursorX;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorX;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? a.a(cursorX) : cursorX;
    }

    public static final int c(File databaseFile) throws IOException {
        n.h(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            p189s8.b.a(channel, null);
            return i10;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p189s8.b.a(channel, th);
                throw th2;
            }
        }
    }
}
