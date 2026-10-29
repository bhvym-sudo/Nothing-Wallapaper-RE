package androidx.slice.widget;

import android.app.slice.SliceMetrics;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SliceMetrics f13989a;

    i(Context context, Uri uri) {
        this.f13989a = new SliceMetrics(context, uri);
    }

    @Override // androidx.slice.widget.h
    protected void b() {
        this.f13989a.logHidden();
    }

    @Override // androidx.slice.widget.h
    protected void c() {
        this.f13989a.logVisible();
    }
}
