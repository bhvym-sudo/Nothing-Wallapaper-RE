package p226w5;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p189s8.b;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29544b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ResourcesLoader f29545a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final byte[] b(Context context, SparseIntArray sparseIntArray) throws IOException {
            InputStream inputStreamOpenRawResource = context.getResources().openRawResource(Resources.getSystem().getIdentifier("remote_views_color_resources", "raw", "android"));
            try {
                a aVar = f.f29544b;
                n.e(inputStreamOpenRawResource);
                byte[] byteArray = aVar.c(inputStreamOpenRawResource).toByteArray();
                A a10 = A.f21846a;
                b.a(inputStreamOpenRawResource, null);
                int length = byteArray.length - 1492;
                if (length < 0) {
                    Log.e("ColorResources", "ARSC file for theme colors is invalid.");
                    return null;
                }
                for (int i10 = R.color.system_neutral1_0; i10 < 17170525; i10++) {
                    int i11 = ((65535 & i10) * 16) + length;
                    int i12 = sparseIntArray.get(i10, context.getColor(i10));
                    for (int i13 = 0; i13 < 4; i13++) {
                        byteArray[i11 + i13] = (byte) (i12 & 255);
                        i12 >>= 8;
                    }
                }
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.a(inputStreamOpenRawResource, th);
                    throw th2;
                }
            }
        }

        private final ByteArrayOutputStream c(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(RecyclerView.ItemAnimator.FLAG_MOVED);
            byte[] bArr = new byte[4096];
            while (inputStream.available() > 0) {
                byteArrayOutputStream.write(bArr, 0, inputStream.read(bArr));
            }
            return byteArrayOutputStream;
        }

        public final f a(Context context, SparseIntArray colorMapping) throws Throwable {
            FileDescriptor fileDescriptorMemfd_create;
            n.h(context, "context");
            n.h(colorMapping, "colorMapping");
            AbstractC1457h abstractC1457h = null;
            try {
                byte[] bArrB = b(context, colorMapping);
                if (bArrB == null) {
                    return null;
                }
                try {
                    fileDescriptorMemfd_create = Os.memfd_create("remote_views_theme_colors.arsc", 0);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptorMemfd_create);
                        try {
                            fileOutputStream.write(bArrB);
                            ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
                            try {
                                ResourcesLoader resourcesLoader = new ResourcesLoader();
                                resourcesLoader.addProvider(ResourcesProvider.loadFromTable(parcelFileDescriptorDup, null));
                                f fVar = new f(resourcesLoader, abstractC1457h);
                                b.a(parcelFileDescriptorDup, null);
                                b.a(fileOutputStream, null);
                                if (fileDescriptorMemfd_create == null) {
                                    return fVar;
                                }
                                Os.close(fileDescriptorMemfd_create);
                                return fVar;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    b.a(parcelFileDescriptorDup, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                b.a(fileOutputStream, th3);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        if (fileDescriptorMemfd_create != null) {
                            Os.close(fileDescriptorMemfd_create);
                        }
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    fileDescriptorMemfd_create = null;
                }
            } catch (Exception e10) {
                Log.e("ColorResources", "Failed to setup the context for theme colors", e10);
                return null;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ f(ResourcesLoader resourcesLoader, AbstractC1457h abstractC1457h) {
        this(resourcesLoader);
    }

    public final void a(Context context) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return;
        }
        resources.addLoaders(this.f29545a);
    }

    private f(ResourcesLoader resourcesLoader) {
        this.f29545a = resourcesLoader;
    }
}
