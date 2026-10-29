package Q0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f6588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f6589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f6591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f6592e = d.a();

    protected int a(int i10) {
        return i10 + this.f6589b.getInt(i10);
    }

    protected int b(int i10) {
        if (i10 < this.f6591d) {
            return this.f6589b.getShort(this.f6590c + i10);
        }
        return 0;
    }

    protected void c(int i10, ByteBuffer byteBuffer) {
        this.f6589b = byteBuffer;
        if (byteBuffer == null) {
            this.f6588a = 0;
            this.f6590c = 0;
            this.f6591d = 0;
        } else {
            this.f6588a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f6590c = i11;
            this.f6591d = this.f6589b.getShort(i11);
        }
    }

    protected int d(int i10) {
        int i11 = i10 + this.f6588a;
        return i11 + this.f6589b.getInt(i11) + 4;
    }

    protected int e(int i10) {
        int i11 = i10 + this.f6588a;
        return this.f6589b.getInt(i11 + this.f6589b.getInt(i11));
    }
}
