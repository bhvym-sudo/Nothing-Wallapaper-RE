package com.nothing.cardwidget.mediaplayer.view;

import F8.L;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.coroutines.jvm.internal.f(c = "com.nothing.cardwidget.mediaplayer.view.MediaPlayerContainerView$recordEnabledWidget$1$1", f = "MediaPlayerContainerView.kt", l = {}, m = "invokeSuspend")
final class MediaPlayerContainerView$recordEnabledWidget$1$1 extends kotlin.coroutines.jvm.internal.l implements p219v8.p {
    final /* synthetic */ int $it;
    int label;
    final /* synthetic */ MediaPlayerContainerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaPlayerContainerView$recordEnabledWidget$1$1(int i10, MediaPlayerContainerView mediaPlayerContainerView, p129m8.e<? super MediaPlayerContainerView$recordEnabledWidget$1$1> eVar) {
        super(2, eVar);
        this.$it = i10;
        this.this$0 = mediaPlayerContainerView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final p129m8.e<p079h8.A> create(Object obj, p129m8.e<?> eVar) {
        return new MediaPlayerContainerView$recordEnabledWidget$1$1(this.$it, this.this$0, eVar);
    }

    @Override // p219v8.p
    public final Object invoke(L l9, p129m8.e<? super p079h8.A> eVar) {
        return ((MediaPlayerContainerView$recordEnabledWidget$1$1) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        p139n8.b.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p079h8.r.b(obj);
        Bundle bundle = new Bundle();
        bundle.putInt("set_enabled_widget_id", this.$it);
        this.this$0.callRemoteService(bundle);
        return p079h8.A.f21846a;
    }
}
