package com.nothing.cardwidget.mediaplayer.view;

import F8.L;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.nothing.cardwidget.mediaplayer.view.ViewPagerAdapter$loadAlbumDrawable$1$1$1", f = "ViewPagerAdapter.kt", l = {}, m = "invokeSuspend")
final class ViewPagerAdapter$loadAlbumDrawable$1$1$1 extends kotlin.coroutines.jvm.internal.l implements p219v8.p {
    final /* synthetic */ Drawable $it;
    final /* synthetic */ p219v8.l $listener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewPagerAdapter$loadAlbumDrawable$1$1$1(p219v8.l lVar, Drawable drawable, p129m8.e<? super ViewPagerAdapter$loadAlbumDrawable$1$1$1> eVar) {
        super(2, eVar);
        this.$listener = lVar;
        this.$it = drawable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final p129m8.e<p079h8.A> create(Object obj, p129m8.e<?> eVar) {
        return new ViewPagerAdapter$loadAlbumDrawable$1$1$1(this.$listener, this.$it, eVar);
    }

    @Override // p219v8.p
    public final Object invoke(L l9, p129m8.e<? super p079h8.A> eVar) {
        return ((ViewPagerAdapter$loadAlbumDrawable$1$1$1) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        p139n8.b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p079h8.r.b(obj);
        this.$listener.f(this.$it);
        return p079h8.A.f21846a;
    }
}
