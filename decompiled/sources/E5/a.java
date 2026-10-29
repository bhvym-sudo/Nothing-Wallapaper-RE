package E5;

import E8.i;
import com.airbnb.lottie.BuildConfig;
import dalvik.system.PathClassLoader;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class a extends PathClassLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0046a f1283a = new C0046a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f1284b = AbstractC1444s.n("java.", "javax.", "android.", "androidx.viewpager2", "androidx.recyclerview", "androidx.constraintlayout", BuildConfig.LIBRARY_PACKAGE_NAME, "com.nothing.cardwidget", "com.nothing.cardservice.sharewidget", "com.bumptech.glide", "com.nothing.commBase.deferred", "com.nothing.aiwidget.IAIWidgetView", "com.nothing.aiwidget.OnTouchModeChangedListener", "com.nothing.aiwidget.OnTouchEventListener", "com.nothing.aiwidget.IAIWidgetLauncherClient", "com.nothing.classloader.hostprefrred");

    /* JADX INFO: renamed from: E5.a$a, reason: collision with other inner class name */
    public static final class C0046a {
        public /* synthetic */ C0046a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean a(String name) {
            n.h(name, "name");
            List list = a.f1284b;
            boolean z9 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (i.M(name, (String) it.next(), false, 2, null)) {
                        z9 = true;
                        break;
                    }
                }
            }
            return !z9;
        }

        private C0046a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String dexPath, String librarySearchPath, ClassLoader parent) {
        super(dexPath, librarySearchPath, parent);
        n.h(dexPath, "dexPath");
        n.h(librarySearchPath, "librarySearchPath");
        n.h(parent, "parent");
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String name) throws ClassNotFoundException {
        n.h(name, "name");
        Class<?> clsFindLoadedClass = findLoadedClass(name);
        if (clsFindLoadedClass == null) {
            if (f1283a.a(name)) {
                try {
                    clsFindLoadedClass = findClass(name);
                } catch (Exception unused) {
                }
            }
            if (clsFindLoadedClass == null) {
                clsFindLoadedClass = super.loadClass(name);
            }
        }
        n.e(clsFindLoadedClass);
        return clsFindLoadedClass;
    }
}
