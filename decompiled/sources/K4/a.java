package K4;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f4090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0141a f4091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4092c;

    /* JADX INFO: renamed from: K4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0141a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0141a interfaceC0141a, Typeface typeface) {
        this.f4090a = typeface;
        this.f4091b = interfaceC0141a;
    }

    private void d(Typeface typeface) {
        if (this.f4092c) {
            return;
        }
        this.f4091b.a(typeface);
    }

    @Override // K4.f
    public void a(int i10) {
        d(this.f4090a);
    }

    @Override // K4.f
    public void b(Typeface typeface, boolean z9) {
        d(typeface);
    }

    public void c() {
        this.f4092c = true;
    }
}
