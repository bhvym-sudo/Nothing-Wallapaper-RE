package p025c4;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import p085i4.f;

/* JADX INFO: renamed from: c4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1199m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C1195i f15199b = new C1195i("LibraryVersion", "");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C1199m f15200c = new C1199m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f15201a = new ConcurrentHashMap();

    protected C1199m() {
    }

    public static C1199m a() {
        return f15200c;
    }

    public String b(String str) throws Throwable {
        String str2;
        AbstractC1202p.f(str, "Please provide a valid libraryName");
        if (this.f15201a.containsKey(str)) {
            return (String) this.f15201a.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                InputStream resourceAsStream = C1199m.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        f15199b.e("LibraryVersion", str + " version is " + property);
                    } else {
                        f15199b.f("LibraryVersion", "Failed to get app version for libraryName: " + str);
                    }
                    if (resourceAsStream != null) {
                        f.a(resourceAsStream);
                    }
                } catch (IOException e10) {
                    e = e10;
                    str2 = property;
                    inputStream = resourceAsStream;
                    f15199b.d("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
                    if (inputStream != null) {
                        f.a(inputStream);
                    }
                    property = str2;
                } catch (Throwable th) {
                    th = th;
                    inputStream = resourceAsStream;
                    if (inputStream != null) {
                        f.a(inputStream);
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                str2 = null;
            }
            if (property == null) {
                f15199b.b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                property = "UNKNOWN";
            }
            this.f15201a.put(str, property);
            return property;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
