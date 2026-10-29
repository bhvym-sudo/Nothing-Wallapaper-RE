package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1115z extends IOException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private P f12702q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f12703r;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z$a */
    public static class a extends C1115z {
        public a(String str) {
            super(str);
        }
    }

    public C1115z(String str) {
        super(str);
        this.f12702q = null;
    }

    static C1115z b() {
        return new C1115z("Protocol message end-group tag did not match expected tag.");
    }

    static C1115z c() {
        return new C1115z("Protocol message contained an invalid tag (zero).");
    }

    static C1115z d() {
        return new C1115z("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static C1115z f() {
        return new C1115z("CodedInputStream encountered a malformed varint.");
    }

    static C1115z g() {
        return new C1115z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C1115z h() {
        return new C1115z("Failed to parse the message.");
    }

    static C1115z i() {
        return new C1115z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static C1115z l() {
        return new C1115z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C1115z m() {
        return new C1115z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f12703r;
    }

    void j() {
        this.f12703r = true;
    }

    public C1115z k(P p9) {
        this.f12702q = p9;
        return this;
    }

    public C1115z(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f12702q = null;
    }
}
