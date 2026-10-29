package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Configuration f10301f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f10303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f10304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f10305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f10306e;

    public d(Context context, int i10) {
        super(context);
        this.f10302a = i10;
    }

    private Resources b() {
        if (this.f10306e == null) {
            Configuration configuration = this.f10305d;
            if (configuration == null || d(configuration)) {
                this.f10306e = super.getResources();
            } else {
                this.f10306e = createConfigurationContext(this.f10305d).getResources();
            }
        }
        return this.f10306e;
    }

    private void c() {
        boolean z9 = this.f10303b == null;
        if (z9) {
            this.f10303b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f10303b.setTo(theme);
            }
        }
        e(this.f10303b, this.f10302a, z9);
    }

    private static boolean d(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f10301f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f10301f = configuration2;
        }
        return configuration.equals(f10301f);
    }

    public void a(Configuration configuration) {
        if (this.f10306e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f10305d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f10305d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    protected void e(Resources.Theme theme, int i10, boolean z9) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f10304c == null) {
            this.f10304c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f10304c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f10303b;
        if (theme != null) {
            return theme;
        }
        if (this.f10302a == 0) {
            this.f10302a = p050f.i.f20489d;
        }
        c();
        return this.f10303b;
    }

    public int getThemeResId() {
        return this.f10302a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f10302a != i10) {
            this.f10302a = i10;
            c();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f10303b = theme;
    }
}
