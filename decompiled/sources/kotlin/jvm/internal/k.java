package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k extends AbstractC1453d implements j, C8.e {
    private final int arity;
    private final int flags;

    public k(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // kotlin.jvm.internal.AbstractC1453d
    protected C8.b computeReflected() {
        return F.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return getName().equals(kVar.getName()) && getSignature().equals(kVar.getSignature()) && this.flags == kVar.flags && this.arity == kVar.arity && n.d(getBoundReceiver(), kVar.getBoundReceiver()) && n.d(getOwner(), kVar.getOwner());
        }
        if (obj instanceof C8.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.j
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // C8.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // C8.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // C8.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // C8.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // C8.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        C8.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.AbstractC1453d
    public C8.e getReflected() {
        return (C8.e) super.getReflected();
    }
}
