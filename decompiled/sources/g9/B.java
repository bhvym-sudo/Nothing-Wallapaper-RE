package g9;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes2.dex */
final class B implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final A f21357a = new B();

    B() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (C.l(annotationArr, A.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f21357a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return A.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof A;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + A.class.getName() + "()";
    }
}
