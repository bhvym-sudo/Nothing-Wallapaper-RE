package androidx.versionedparcelable;

import android.os.IBinder;
import android.os.Parcelable;
import androidx.collection.C1021a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C1021a f14333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C1021a f14334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final C1021a f14335c;

    /* JADX INFO: renamed from: androidx.versionedparcelable.a$a, reason: collision with other inner class name */
    class C0421a extends ObjectInputStream {
        C0421a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    public a(C1021a c1021a, C1021a c1021a2, C1021a c1021a3) {
        this.f14333a = c1021a;
        this.f14334b = c1021a2;
        this.f14335c = c1021a3;
    }

    private void T(Serializable serializable) {
        if (serializable == null) {
            U(null);
            return;
        }
        String name = serializable.getClass().getName();
        U(name);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(serializable);
            objectOutputStream.close();
            J(byteArrayOutputStream.toByteArray());
        } catch (IOException e10) {
            throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e10);
        }
    }

    private void a0(p192t1.a aVar) {
        try {
            U(c(aVar.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(aVar.getClass().getSimpleName() + " does not have a Parcelizer", e10);
        }
    }

    private Class c(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f14335c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f14335c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) throws NoSuchMethodException {
        Method method = (Method) this.f14333a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f14333a.put(str, declaredMethod);
        return declaredMethod;
    }

    private int e(Object obj) {
        if (obj instanceof String) {
            return 4;
        }
        if (obj instanceof Parcelable) {
            return 2;
        }
        if (obj instanceof p192t1.a) {
            return 1;
        }
        if (obj instanceof Serializable) {
            return 3;
        }
        if (obj instanceof IBinder) {
            return 5;
        }
        if (obj instanceof Integer) {
            return 7;
        }
        if (obj instanceof Float) {
            return 8;
        }
        throw new IllegalArgumentException(obj.getClass().getName() + " cannot be VersionedParcelled");
    }

    private Method f(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.f14334b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsC = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsC.getDeclaredMethod("write", cls, a.class);
        this.f14334b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    protected abstract IBinder A();

    protected p192t1.a B() {
        String strY = y();
        if (strY == null) {
            return null;
        }
        return q(strY, b());
    }

    public p192t1.a C(p192t1.a aVar, int i10) {
        return !p(i10) ? aVar : B();
    }

    protected abstract void D(int i10);

    public void E(boolean z9, boolean z10) {
    }

    protected void F(Object[] objArr) {
        if (objArr == null) {
            N(-1);
            return;
        }
        int length = objArr.length;
        N(length);
        if (length > 0) {
            int i10 = 0;
            int iE = e(objArr[0]);
            N(iE);
            if (iE == 1) {
                while (i10 < length) {
                    Y((p192t1.a) objArr[i10]);
                    i10++;
                }
                return;
            }
            if (iE == 2) {
                while (i10 < length) {
                    R((Parcelable) objArr[i10]);
                    i10++;
                }
                return;
            }
            if (iE == 3) {
                while (i10 < length) {
                    T((Serializable) objArr[i10]);
                    i10++;
                }
            } else if (iE == 4) {
                while (i10 < length) {
                    U((String) objArr[i10]);
                    i10++;
                }
            } else {
                if (iE != 5) {
                    return;
                }
                while (i10 < length) {
                    W((IBinder) objArr[i10]);
                    i10++;
                }
            }
        }
    }

    public void G(Object[] objArr, int i10) {
        D(i10);
        F(objArr);
    }

    protected abstract void H(boolean z9);

    public void I(boolean z9, int i10) {
        D(i10);
        H(z9);
    }

    protected abstract void J(byte[] bArr);

    public void K(byte[] bArr, int i10) {
        D(i10);
        J(bArr);
    }

    protected abstract void L(CharSequence charSequence);

    public void M(CharSequence charSequence, int i10) {
        D(i10);
        L(charSequence);
    }

    protected abstract void N(int i10);

    public void O(int i10, int i11) {
        D(i11);
        N(i10);
    }

    protected abstract void P(long j9);

    public void Q(long j9, int i10) {
        D(i10);
        P(j9);
    }

    protected abstract void R(Parcelable parcelable);

    public void S(Parcelable parcelable, int i10) {
        D(i10);
        R(parcelable);
    }

    protected abstract void U(String str);

    public void V(String str, int i10) {
        D(i10);
        U(str);
    }

    protected abstract void W(IBinder iBinder);

    protected void X(p192t1.a aVar, a aVar2) {
        try {
            f(aVar.getClass()).invoke(null, aVar, aVar2);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (!(e13.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
            }
            throw ((RuntimeException) e13.getCause());
        }
    }

    protected void Y(p192t1.a aVar) {
        if (aVar == null) {
            U(null);
            return;
        }
        a0(aVar);
        a aVarB = b();
        X(aVar, aVarB);
        aVarB.a();
    }

    public void Z(p192t1.a aVar, int i10) {
        D(i10);
        Y(aVar);
    }

    protected abstract void a();

    protected abstract a b();

    public boolean g() {
        return false;
    }

    protected Object[] h(Object[] objArr) {
        int iR = r();
        if (iR < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(iR);
        if (iR != 0) {
            int iR2 = r();
            if (iR < 0) {
                return null;
            }
            if (iR2 == 1) {
                while (iR > 0) {
                    arrayList.add(B());
                    iR--;
                }
            } else if (iR2 == 2) {
                while (iR > 0) {
                    arrayList.add(v());
                    iR--;
                }
            } else if (iR2 == 3) {
                while (iR > 0) {
                    arrayList.add(x());
                    iR--;
                }
            } else if (iR2 == 4) {
                while (iR > 0) {
                    arrayList.add(y());
                    iR--;
                }
            } else if (iR2 == 5) {
                while (iR > 0) {
                    arrayList.add(A());
                    iR--;
                }
            }
        }
        return arrayList.toArray(objArr);
    }

    public Object[] i(Object[] objArr, int i10) {
        return !p(i10) ? objArr : h(objArr);
    }

    protected abstract boolean j();

    public boolean k(boolean z9, int i10) {
        return !p(i10) ? z9 : j();
    }

    protected abstract byte[] l();

    public byte[] m(byte[] bArr, int i10) {
        return !p(i10) ? bArr : l();
    }

    protected abstract CharSequence n();

    public CharSequence o(CharSequence charSequence, int i10) {
        return !p(i10) ? charSequence : n();
    }

    protected abstract boolean p(int i10);

    protected p192t1.a q(String str, a aVar) {
        try {
            return (p192t1.a) d(str).invoke(null, aVar);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    protected abstract int r();

    public int s(int i10, int i11) {
        return !p(i11) ? i10 : r();
    }

    protected abstract long t();

    public long u(long j9, int i10) {
        return !p(i10) ? j9 : t();
    }

    protected abstract Parcelable v();

    public Parcelable w(Parcelable parcelable, int i10) {
        return !p(i10) ? parcelable : v();
    }

    protected Serializable x() {
        String strY = y();
        if (strY == null) {
            return null;
        }
        try {
            return (Serializable) new C0421a(new ByteArrayInputStream(l())).readObject();
        } catch (IOException e10) {
            throw new RuntimeException("VersionedParcelable encountered IOException reading a Serializable object (name = " + strY + ")", e10);
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = " + strY + ")", e11);
        }
    }

    protected abstract String y();

    public String z(String str, int i10) {
        return !p(i10) ? str : y();
    }
}
