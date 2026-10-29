package p039d8;

import android.content.Context;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f19745a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f19746b;

    public static class a {
        public static void a(String str, String str2) {
            if (d.f19745a) {
                Log.d(str, str2);
            }
        }

        public static void b(String str, String str2) {
            Log.e(str, str2);
        }

        public static void c(String str, String str2) {
            Log.i(str, str2);
        }

        public static void d(String str, String str2) {
            Log.w(str, str2);
        }
    }

    public static String a(File file) throws Throwable {
        if (file == null || !file.exists()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    } catch (Exception e10) {
                        e = e10;
                        bufferedReader = bufferedReader2;
                        e.printStackTrace();
                        bufferedReader.close();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        try {
                            bufferedReader.close();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
            } catch (Exception e12) {
                e = e12;
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        return sb.toString();
    }

    public static void b(String str, String str2) throws Throwable {
        if (!f19745a) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    Context context = f19746b;
                    if (context != null && context.getCacheDir() != null) {
                        File file = new File(f19746b.getCacheDir().getAbsolutePath() + "/" + str);
                        StringBuilder sb = new StringBuilder();
                        sb.append("writeFile file path:");
                        sb.append(file.getAbsolutePath());
                        a.a("Util", sb.toString());
                        if (file.exists()) {
                            file.delete();
                        }
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            fileOutputStream2.write(str2.getBytes());
                            fileOutputStream = fileOutputStream2;
                        } catch (Exception e10) {
                            fileOutputStream = fileOutputStream2;
                            e = e10;
                            a.b("Util", e.toString());
                            fileOutputStream.close();
                            return;
                        } catch (Throwable th) {
                            fileOutputStream = fileOutputStream2;
                            th = th;
                            try {
                                fileOutputStream.close();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                            throw th;
                        }
                    }
                    fileOutputStream.close();
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    public static boolean d() {
        return f19745a;
    }
}
