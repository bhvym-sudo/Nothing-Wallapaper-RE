package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class G extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f10792c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList f10793d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f10794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f10795b;

    private G(Context context) {
        super(context);
        if (!P.c()) {
            this.f10794a = new I(this, context.getResources());
            this.f10795b = null;
            return;
        }
        P p9 = new P(this, context.getResources());
        this.f10794a = p9;
        Resources.Theme themeNewTheme = p9.newTheme();
        this.f10795b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof G) || (context.getResources() instanceof I) || (context.getResources() instanceof P) || !P.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f10792c) {
            try {
                ArrayList arrayList = f10793d;
                if (arrayList == null) {
                    f10793d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f10793d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f10793d.remove(size);
                        }
                    }
                    for (int size2 = f10793d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f10793d.get(size2);
                        G g10 = weakReference2 != null ? (G) weakReference2.get() : null;
                        if (g10 != null && g10.getBaseContext() == context) {
                            return g10;
                        }
                    }
                }
                G g11 = new G(context);
                f10793d.add(new WeakReference(g11));
                return g11;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f10794a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f10794a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f10795b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f10795b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
