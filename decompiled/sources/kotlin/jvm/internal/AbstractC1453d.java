package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: kotlin.jvm.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1453d implements C8.b, Serializable {
    public static final Object NO_RECEIVER = a.f22792q;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient C8.b reflected;
    private final String signature;

    /* JADX INFO: renamed from: kotlin.jvm.internal.d$a */
    private static class a implements Serializable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final a f22792q = new a();

        private a() {
        }
    }

    protected AbstractC1453d(Object obj, Class cls, String str, String str2, boolean z9) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z9;
    }

    @Override // C8.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // C8.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public C8.b compute() {
        C8.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        C8.b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    protected abstract C8.b computeReflected();

    @Override // C8.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C8.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? F.c(cls) : F.b(cls);
    }

    @Override // C8.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected C8.b getReflected() {
        C8.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new p209u8.b();
    }

    @Override // C8.b
    public C8.l getReturnType() {
        getReflected().getReturnType();
        return null;
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // C8.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // C8.b
    public C8.m getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // C8.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // C8.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // C8.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
