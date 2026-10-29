package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f16864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f16865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f16866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f16867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final b f16868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f16869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final b f16870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Paint f16871h;

    c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(K4.b.d(context, p225w4.a.f28723z, i.class.getCanonicalName()), p225w4.k.f29058N3);
        this.f16864a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(p225w4.k.f29094R3, 0));
        this.f16870g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(p225w4.k.f29076P3, 0));
        this.f16865b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(p225w4.k.f29085Q3, 0));
        this.f16866c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(p225w4.k.f29103S3, 0));
        ColorStateList colorStateListA = K4.c.a(context, typedArrayObtainStyledAttributes, p225w4.k.f29112T3);
        this.f16867d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(p225w4.k.f29130V3, 0));
        this.f16868e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(p225w4.k.f29121U3, 0));
        this.f16869f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(p225w4.k.f29139W3, 0));
        Paint paint = new Paint();
        this.f16871h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
