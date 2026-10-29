package p043e2;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f19783a;

    public a(boolean z9) {
        this.f19783a = z9;
    }

    public final boolean a() {
        return this.f19783a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f19783a == ((a) obj).f19783a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f19783a);
    }

    public String toString() {
        return "NotificationSnapshotModel(isShowNotificationsOnLockScreenEnabled=" + this.f19783a + ")";
    }
}
