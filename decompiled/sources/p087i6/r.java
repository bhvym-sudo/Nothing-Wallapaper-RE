package p087i6;

import com.bumptech.glide.load.Key;
import com.nothing.wallpaper.common.log.c;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.UUID;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f22210a = new r();

    private r() {
    }

    public static final String a() {
        String string = UUID.randomUUID().toString();
        n.g(string, "toString(...)");
        return string;
    }

    public static final String b(String content) {
        n.h(content, "content");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Charset charsetForName = Charset.forName(Key.STRING_CHARSET_NAME);
            n.g(charsetForName, "forName(...)");
            byte[] bytes = content.getBytes(charsetForName);
            n.g(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b10 : bArrDigest) {
                int i10 = b10 & 255;
                if (i10 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i10));
            }
            return sb.toString();
        } catch (Exception e10) {
            c.f("SecurityUtil", "md5 exception:" + e10.getMessage());
            return null;
        }
    }
}
