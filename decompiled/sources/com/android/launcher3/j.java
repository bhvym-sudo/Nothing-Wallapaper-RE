package com.android.launcher3;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.FloatProperty;
import android.util.IntProperty;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final IntProperty f15618a = new c("drawableAlpha");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FloatProperty f15619b = new d("scale");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final IntProperty f15620c = new e("width");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final IntProperty f15621d = new f("height");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final IntProperty f15622e = new g("textColor");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final IntProperty f15623f = new h("hintTextColor");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FloatProperty f15624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FloatProperty f15625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final FloatProperty f15626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final IntProperty f15627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final FloatProperty f15628k;

    class a extends IntProperty {
        a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            if (view.getBackground() instanceof ColorDrawable) {
                return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
            }
            return 0;
        }

        @Override // android.util.IntProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, int i10) {
            view.setBackgroundColor(i10);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Integer num) {
            super.set(obj, num);
        }
    }

    class b extends FloatProperty {
        b(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ImageView imageView) {
            return Float.valueOf(imageView.getDrawable().getLevel() / 10000.0f);
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(ImageView imageView, float f10) {
            imageView.setImageLevel((int) (f10 * 10000.0f));
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Float f10) {
            super.set(obj, f10);
        }
    }

    class c extends IntProperty {
        c(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(Drawable drawable) {
            return Integer.valueOf(drawable.getAlpha());
        }

        @Override // android.util.IntProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(Drawable drawable, int i10) {
            drawable.setAlpha(i10);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Integer num) {
            super.set(obj, num);
        }
    }

    class d extends FloatProperty {
        d(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getScaleX());
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f10) {
            view.setScaleX(f10);
            view.setScaleY(f10);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Float f10) {
            super.set(obj, f10);
        }
    }

    class e extends IntProperty {
        e(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(ViewGroup.LayoutParams layoutParams) {
            return Integer.valueOf(layoutParams.width);
        }

        @Override // android.util.IntProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(ViewGroup.LayoutParams layoutParams, int i10) {
            layoutParams.width = i10;
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Integer num) {
            super.set(obj, num);
        }
    }

    class f extends IntProperty {
        f(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(ViewGroup.LayoutParams layoutParams) {
            return Integer.valueOf(layoutParams.height);
        }

        @Override // android.util.IntProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(ViewGroup.LayoutParams layoutParams, int i10) {
            layoutParams.height = i10;
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Integer num) {
            super.set(obj, num);
        }
    }

    class g extends IntProperty {
        g(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(TextView textView) {
            return Integer.valueOf(textView.getTextColors().getDefaultColor());
        }

        @Override // android.util.IntProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(TextView textView, int i10) {
            textView.setTextColor(i10);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Integer num) {
            super.set(obj, num);
        }
    }

    class h extends IntProperty {
        h(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(TextView textView) {
            return Integer.valueOf(textView.getHintTextColors().getDefaultColor());
        }

        @Override // android.util.IntProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(TextView textView, int i10) {
            textView.setHintTextColor(i10);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Integer num) {
            super.set(obj, num);
        }
    }

    class i extends FloatProperty {
        i(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getTranslationX());
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f10) {
            view.setTranslationX(f10);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Float f10) {
            super.set(obj, f10);
        }
    }

    /* JADX INFO: renamed from: com.android.launcher3.j$j, reason: collision with other inner class name */
    class C0445j extends FloatProperty {
        C0445j(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getTranslationY());
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f10) {
            view.setTranslationY(f10);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Float f10) {
            super.set(obj, f10);
        }
    }

    class k extends FloatProperty {
        k(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(view.getAlpha());
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(View view, float f10) {
            view.setAlpha(f10);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(Object obj, Float f10) {
            super.set(obj, f10);
        }
    }

    static {
        Property property = View.TRANSLATION_X;
        f15624g = property instanceof FloatProperty ? (FloatProperty) property : new i("translateX");
        Property property2 = View.TRANSLATION_Y;
        f15625h = property2 instanceof FloatProperty ? (FloatProperty) property2 : new C0445j("translateY");
        Property property3 = View.ALPHA;
        f15626i = property3 instanceof FloatProperty ? (FloatProperty) property3 : new k("alpha");
        f15627j = new a("backgroundColor");
        f15628k = new b("drawableRotationPercent");
    }
}
