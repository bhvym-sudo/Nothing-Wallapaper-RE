package V8;

import P8.A;
import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f8253d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f8254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8256c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final k a(String statusLine) throws ProtocolException {
            A a10;
            int i10;
            String strSubstring;
            n.h(statusLine, "statusLine");
            if (E8.i.M(statusLine, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    a10 = A.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    a10 = A.HTTP_1_1;
                }
            } else {
                if (!E8.i.M(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                a10 = A.HTTP_1_0;
                i10 = 4;
            }
            int i11 = i10 + 3;
            if (statusLine.length() < i11) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String strSubstring2 = statusLine.substring(i10, i11);
                n.g(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i12 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i11) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i11) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i10 + 4);
                    n.g(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new k(a10, i12, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }

        private a() {
        }
    }

    public k(A protocol, int i10, String message) {
        n.h(protocol, "protocol");
        n.h(message, "message");
        this.f8254a = protocol;
        this.f8255b = i10;
        this.f8256c = message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f8254a == A.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f8255b);
        sb.append(' ');
        sb.append(this.f8256c);
        String string = sb.toString();
        n.g(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
