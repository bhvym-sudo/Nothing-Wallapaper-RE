package J5;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0120a f3535a = new C0120a(null);

    /* JADX INFO: renamed from: J5.a$a, reason: collision with other inner class name */
    public static final class C0120a {
        public /* synthetic */ C0120a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a(Context context, String name) {
            n.h(context, "context");
            n.h(name, "name");
            return context.getResources().getIdentifier(name, "anim", context.getPackageName());
        }

        public final Animator b(Context context, AttributeSet attrs, int i10) {
            n.h(context, "context");
            n.h(attrs, "attrs");
            int attributeResourceValue = attrs.getAttributeResourceValue(i10, -1);
            if (attributeResourceValue != -1) {
                return AnimatorInflater.loadAnimator(context, attributeResourceValue);
            }
            return null;
        }

        public final int c(Context context, String name) {
            n.h(context, "context");
            n.h(name, "name");
            return context.getResources().getIdentifier(name, "attr", context.getPackageName());
        }

        public final boolean d(Context context, AttributeSet attrs, int i10, boolean z9) {
            n.h(context, "context");
            n.h(attrs, "attrs");
            int attributeResourceValue = attrs.getAttributeResourceValue(i10, -1);
            return attributeResourceValue != -1 ? context.getResources().getBoolean(attributeResourceValue) : attrs.getAttributeBooleanValue(i10, z9);
        }

        public final int e(Context context, AttributeSet attrs, int i10) {
            n.h(context, "context");
            n.h(attrs, "attrs");
            int attributeResourceValue = attrs.getAttributeResourceValue(i10, -1);
            return attributeResourceValue != -1 ? context.getResources().getColor(attributeResourceValue) : Color.parseColor(attrs.getAttributeValue(i10));
        }

        public final float f(Context context, AttributeSet attrs, int i10) {
            n.h(context, "context");
            n.h(attrs, "attrs");
            int attributeResourceValue = attrs.getAttributeResourceValue(i10, -1);
            if (attributeResourceValue != -1) {
                return context.getResources().getDimension(attributeResourceValue);
            }
            String attributeValue = attrs.getAttributeValue(i10);
            n.e(attributeValue);
            String strSubstring = attributeValue.substring(0, attributeValue.length() - 3);
            n.g(strSubstring, "substring(...)");
            return TypedValue.applyDimension(1, Float.parseFloat(strSubstring), context.getResources().getDisplayMetrics());
        }

        public final Drawable g(Context context, AttributeSet attrs, int i10) {
            n.h(context, "context");
            n.h(attrs, "attrs");
            int attributeResourceValue = attrs.getAttributeResourceValue(i10, -1);
            if (attributeResourceValue != -1) {
                return context.getResources().getDrawable(attributeResourceValue);
            }
            return null;
        }

        public final float h(Context context, AttributeSet attrs, int i10, float f10) {
            n.h(context, "context");
            n.h(attrs, "attrs");
            int attributeResourceValue = attrs.getAttributeResourceValue(i10, -1);
            return attributeResourceValue != -1 ? context.getResources().getFloat(attributeResourceValue) : attrs.getAttributeFloatValue(i10, f10);
        }

        public final int i(Context context, AttributeSet attrs, int i10, int i11) {
            n.h(context, "context");
            n.h(attrs, "attrs");
            int attributeResourceValue = attrs.getAttributeResourceValue(i10, -1);
            return attributeResourceValue != -1 ? context.getResources().getInteger(attributeResourceValue) : attrs.getAttributeIntValue(i10, i11);
        }

        public final String j(Context context, AttributeSet attrs, int i10) {
            n.h(context, "context");
            n.h(attrs, "attrs");
            int attributeResourceValue = attrs.getAttributeResourceValue(i10, -1);
            return attributeResourceValue != -1 ? context.getString(attributeResourceValue) : attrs.getAttributeValue(i10);
        }

        public final Map k(AttributeSet attributeSet, Map map) {
            n.h(map, "map");
            ArrayMap arrayMap = new ArrayMap();
            if (attributeSet != null) {
                int attributeCount = attributeSet.getAttributeCount();
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    if (!"http://schemas.android.com/apk/res/android".equals(attributeSet.getAttributeNamespace(i10))) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i10);
                        if (map.containsKey(Integer.valueOf(attributeNameResource))) {
                            Object obj = map.get(Integer.valueOf(attributeNameResource));
                            n.e(obj);
                            arrayMap.put(obj, Integer.valueOf(i10));
                        }
                    }
                }
            }
            return arrayMap;
        }

        private C0120a() {
        }
    }
}
