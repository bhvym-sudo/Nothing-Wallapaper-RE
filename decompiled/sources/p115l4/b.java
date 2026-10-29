package p115l4;

import android.os.IBinder;
import java.lang.reflect.Field;
import p025c4.AbstractC1202p;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a.AbstractBinderC0582a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object f22931q;

    private b(Object obj) {
        this.f22931q = obj;
    }

    public static a X(Object obj) {
        return new b(obj);
    }

    public static Object e(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f22931q;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        AbstractC1202p.i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}
