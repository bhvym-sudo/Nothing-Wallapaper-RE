package com.nothing.wallpaper.picker.edit.preview.bean;

import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LoadingState {

    @Keep
    public static final class End extends LoadingState {
        private final boolean success;

        public End(boolean z9) {
            super(null);
            this.success = z9;
        }

        public final boolean getSuccess() {
            return this.success;
        }
    }

    @Keep
    public static final class Loading extends LoadingState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    @Keep
    public static final class None extends LoadingState {
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    @Keep
    public static final class Silence extends LoadingState {
        public static final Silence INSTANCE = new Silence();

        private Silence() {
            super(null);
        }
    }

    public /* synthetic */ LoadingState(AbstractC1457h abstractC1457h) {
        this();
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        n.g(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    private LoadingState() {
    }
}
