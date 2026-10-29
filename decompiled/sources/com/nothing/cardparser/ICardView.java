package com.nothing.cardparser;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import p079h8.A;
import p079h8.o;
import p129m8.e;
import p216v5.a;
import p226w5.f;
import p226w5.u;

/* JADX INFO: loaded from: classes.dex */
public interface ICardView {

    public static final class DefaultImpls {
        public static /* synthetic */ o apply$default(ICardView iCardView, Context context, ViewGroup viewGroup, f fVar, a aVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apply");
            }
            if ((i10 & 8) != 0) {
                aVar = null;
            }
            return iCardView.apply(context, viewGroup, fVar, aVar);
        }

        public static /* synthetic */ CancellationSignal applyAsync$default(ICardView iCardView, Context context, ViewGroup viewGroup, u uVar, f fVar, a aVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyAsync");
            }
            if ((i10 & 16) != 0) {
                aVar = null;
            }
            return iCardView.applyAsync(context, viewGroup, uVar, fVar, aVar);
        }

        public static /* synthetic */ Object applyViewDataChanged$default(ICardView iCardView, String str, Context context, View view, View view2, ViewGroup viewGroup, f fVar, a aVar, e eVar, int i10, Object obj) {
            if (obj == null) {
                return iCardView.applyViewDataChanged(str, context, view, view2, viewGroup, fVar, (i10 & 64) != 0 ? null : aVar, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyViewDataChanged");
        }
    }

    o apply(Context context, ViewGroup viewGroup, f fVar, a aVar);

    CancellationSignal applyAsync(Context context, ViewGroup viewGroup, u uVar, f fVar, a aVar);

    Object applyViewDataChanged(String str, Context context, View view, View view2, ViewGroup viewGroup, f fVar, a aVar, e<? super A> eVar);

    boolean checkHasUpdatePeriodMinute(String str);

    List<String> getBroadcastConfig();

    Bundle getExtraInfo();

    Integer getPeriodTime();

    void onBroadcastReceive(String str);

    void onCancelAnim();

    void onEndAnim();

    void onHostConfigChanged(Configuration configuration);

    void onHostViewPeriodTimeUp();

    void onHostViewResume();

    void onHostViewStop();

    void onPauseAnim();

    void onResumeAnim();

    void onStartAnim();

    void registerAnimListener();

    void switchCardStyle(int i10);

    void unregisterAnimListener();

    void updateViewInfoJson(String str);
}
