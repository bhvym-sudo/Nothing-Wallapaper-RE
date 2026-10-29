package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z extends AbstractC1453d implements C8.k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f22804q;

    public z(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f22804q = (i10 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.AbstractC1453d
    public C8.b compute() {
        return this.f22804q ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            return getOwner().equals(zVar.getOwner()) && getName().equals(zVar.getName()) && getSignature().equals(zVar.getSignature()) && n.d(getBoundReceiver(), zVar.getBoundReceiver());
        }
        if (obj instanceof C8.k) {
            return obj.equals(compute());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC1453d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C8.k getReflected() {
        if (this.f22804q) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (C8.k) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        C8.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
