package p072h1;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final void a(ReadableByteChannel input, FileChannel output) throws IOException {
        n.h(input, "input");
        n.h(output, "output");
        try {
            output.transferFrom(input, 0L, Long.MAX_VALUE);
            output.force(false);
        } finally {
            input.close();
            output.close();
        }
    }
}
