package p049e8;

import p039d8.d;

/* JADX INFO: loaded from: classes2.dex */
public interface b {
    void a(String str);

    default void b(int i10) {
        d.a.d("IHapticEffectPerformer", "default setGain");
    }

    default void c(String str) {
        d.a.d("IHapticEffectPerformer", "default setSenderId(int[])");
    }

    default int d() {
        d.a.d("IHapticEffectPerformer", "default getRichTapCoreMajorVersion");
        return -1;
    }

    void stop();
}
