package p005a4;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class b extends Exception {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected final Status f9825q;

    public b(Status status) {
        super(status.b() + ": " + (status.c() != null ? status.c() : ""));
        this.f9825q = status;
    }

    public Status a() {
        return this.f9825q;
    }
}
