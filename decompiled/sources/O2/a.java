package O2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f5768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5769b;

    public a(Long l9, String str) {
        this.f5768a = l9;
        this.f5769b = str;
    }

    public final Long a() {
        return this.f5768a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.n.d(this.f5768a, aVar.f5768a) && kotlin.jvm.internal.n.d(this.f5769b, aVar.f5769b);
    }

    public int hashCode() {
        Long l9 = this.f5768a;
        int iHashCode = (l9 == null ? 0 : l9.hashCode()) * 31;
        String str = this.f5769b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "AlarmData(nextAlarmMillis=" + this.f5768a + ", descriptionId=" + this.f5769b + ")";
    }
}
