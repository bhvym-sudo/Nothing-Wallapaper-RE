package e9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f20286a = Logger.getLogger("okio.Okio");

    public static final z b(File file) {
        kotlin.jvm.internal.n.h(file, "<this>");
        return o.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        kotlin.jvm.internal.n.h(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? E8.i.S(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final z d(File file, boolean z9) {
        kotlin.jvm.internal.n.h(file, "<this>");
        return o.g(new FileOutputStream(file, z9));
    }

    public static final z e(OutputStream outputStream) {
        kotlin.jvm.internal.n.h(outputStream, "<this>");
        return new s(outputStream, new C());
    }

    public static final z f(Socket socket) throws IOException {
        kotlin.jvm.internal.n.h(socket, "<this>");
        A a10 = new A(socket);
        OutputStream outputStream = socket.getOutputStream();
        kotlin.jvm.internal.n.g(outputStream, "getOutputStream(...)");
        return a10.z(new s(outputStream, a10));
    }

    public static /* synthetic */ z g(File file, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        return o.f(file, z9);
    }

    public static final B h(File file) {
        kotlin.jvm.internal.n.h(file, "<this>");
        return new n(new FileInputStream(file), C.f20236e);
    }

    public static final B i(InputStream inputStream) {
        kotlin.jvm.internal.n.h(inputStream, "<this>");
        return new n(inputStream, new C());
    }

    public static final B j(Socket socket) throws IOException {
        kotlin.jvm.internal.n.h(socket, "<this>");
        A a10 = new A(socket);
        InputStream inputStream = socket.getInputStream();
        kotlin.jvm.internal.n.g(inputStream, "getInputStream(...)");
        return a10.A(new n(inputStream, a10));
    }
}
