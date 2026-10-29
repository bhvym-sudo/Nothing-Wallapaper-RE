package T1;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f7412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7413c;

    public a(String clockId, boolean z9, String contentDescription) {
        n.h(clockId, "clockId");
        n.h(contentDescription, "contentDescription");
        this.f7411a = clockId;
        this.f7412b = z9;
        this.f7413c = contentDescription;
    }

    public final String a() {
        return this.f7411a;
    }

    public final String b() {
        return this.f7413c;
    }

    public final boolean c() {
        return this.f7412b;
    }
}
