package p191t0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p181s0.e;

/* JADX INFO: loaded from: classes.dex */
abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f27874a = new ConcurrentHashMap();

    g() {
    }

    public abstract Typeface a(Context context, e.c cVar, Resources resources, int i10);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, y0.g.b[] bVarArr, int i10);

    public abstract Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10);

    public abstract Typeface d(Context context, Resources resources, int i10, String str, int i11);
}
