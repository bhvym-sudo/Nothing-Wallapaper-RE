package androidx.slice;

import android.app.slice.SliceManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import androidx.collection.C1021a;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.slice.widget.g;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class e extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1021a f13720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1021a f13721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SliceManager f13722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f13723f;

    e(Context context) {
        this(context, (SliceManager) context.getSystemService(SliceManager.class));
    }

    private boolean j(String str) {
        String str2 = (String) this.f13721d.get(str);
        if (str2 == null) {
            ProviderInfo providerInfoResolveContentProvider = this.f13706b.getPackageManager().resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                return false;
            }
            str2 = providerInfoResolveContentProvider.packageName;
            this.f13721d.put(str, str2);
        }
        return l(str2);
    }

    private boolean k(Intent intent) {
        if (intent.getComponent() != null) {
            return l(intent.getComponent().getPackageName());
        }
        if (intent.getPackage() != null) {
            return l(intent.getPackage());
        }
        if (intent.getData() != null) {
            return j(intent.getData().getAuthority());
        }
        return false;
    }

    private boolean l(String str) {
        Boolean bool = (Boolean) this.f13720c.get(str);
        if (bool == null) {
            try {
                Boolean boolValueOf = Boolean.valueOf((this.f13706b.getPackageManager().getApplicationInfo(str, 0).flags & BasicMeasure.EXACTLY) != 0);
                this.f13720c.put(str, boolValueOf);
                bool = boolValueOf;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return bool.booleanValue();
    }

    @Override // androidx.slice.c
    public Slice a(Intent intent) {
        if (k(intent)) {
            return null;
        }
        return b.c(this.f13722e.bindSlice(intent, this.f13723f), this.f13706b);
    }

    @Override // androidx.slice.c
    public Slice b(Uri uri) {
        if (j(uri.getAuthority())) {
            return null;
        }
        return b.c(this.f13722e.bindSlice(uri, this.f13723f), this.f13706b);
    }

    @Override // androidx.slice.c
    public void d(Uri uri) {
        this.f13722e.pinSlice(uri, this.f13723f);
    }

    @Override // androidx.slice.c
    public void f(Uri uri) {
        if (this.f13722e.getPinnedSlices().contains(uri)) {
            this.f13722e.unpinSlice(uri);
        }
    }

    e(Context context, SliceManager sliceManager) {
        super(context);
        this.f13720c = new C1021a();
        this.f13721d = new C1021a();
        this.f13722e = sliceManager;
        this.f13723f = b.b(g.f13981c);
    }
}
