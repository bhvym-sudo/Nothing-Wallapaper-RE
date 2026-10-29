package com.nothing.wallpaper.segmenter;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public interface Segmenter {

    @Keep
    public static abstract class FailReason implements Parcelable {

        @Keep
        public static final class InputNull extends FailReason {
            public static final InputNull INSTANCE = new InputNull();
            public static final Parcelable.Creator<InputNull> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final InputNull createFromParcel(Parcel parcel) {
                    n.h(parcel, "parcel");
                    parcel.readInt();
                    return InputNull.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final InputNull[] newArray(int i10) {
                    return new InputNull[i10];
                }
            }

            private InputNull() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                n.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Keep
        public static final class SubjectNull extends FailReason {
            public static final SubjectNull INSTANCE = new SubjectNull();
            public static final Parcelable.Creator<SubjectNull> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SubjectNull createFromParcel(Parcel parcel) {
                    n.h(parcel, "parcel");
                    parcel.readInt();
                    return SubjectNull.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SubjectNull[] newArray(int i10) {
                    return new SubjectNull[i10];
                }
            }

            private SubjectNull() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                n.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Keep
        public static final class SubjectTransparent extends FailReason {
            public static final SubjectTransparent INSTANCE = new SubjectTransparent();
            public static final Parcelable.Creator<SubjectTransparent> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SubjectTransparent createFromParcel(Parcel parcel) {
                    n.h(parcel, "parcel");
                    parcel.readInt();
                    return SubjectTransparent.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final SubjectTransparent[] newArray(int i10) {
                    return new SubjectTransparent[i10];
                }
            }

            private SubjectTransparent() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                n.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        public /* synthetic */ FailReason(AbstractC1457h abstractC1457h) {
            this();
        }

        public String toString() {
            String simpleName = getClass().getSimpleName();
            n.g(simpleName, "getSimpleName(...)");
            return simpleName;
        }

        private FailReason() {
        }
    }

    @Keep
    public static abstract class ModuleState implements Parcelable {

        @Keep
        public static final class Available extends ModuleState {
            public static final Available INSTANCE = new Available();
            public static final Parcelable.Creator<Available> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Available createFromParcel(Parcel parcel) {
                    n.h(parcel, "parcel");
                    parcel.readInt();
                    return Available.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Available[] newArray(int i10) {
                    return new Available[i10];
                }
            }

            private Available() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                n.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Keep
        public static final class Installing extends ModuleState {
            public static final Installing INSTANCE = new Installing();
            public static final Parcelable.Creator<Installing> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Installing createFromParcel(Parcel parcel) {
                    n.h(parcel, "parcel");
                    parcel.readInt();
                    return Installing.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Installing[] newArray(int i10) {
                    return new Installing[i10];
                }
            }

            private Installing() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                n.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Keep
        public static final class UnaAvailable extends ModuleState {
            public static final UnaAvailable INSTANCE = new UnaAvailable();
            public static final Parcelable.Creator<UnaAvailable> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UnaAvailable createFromParcel(Parcel parcel) {
                    n.h(parcel, "parcel");
                    parcel.readInt();
                    return UnaAvailable.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final UnaAvailable[] newArray(int i10) {
                    return new UnaAvailable[i10];
                }
            }

            private UnaAvailable() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                n.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        public /* synthetic */ ModuleState(AbstractC1457h abstractC1457h) {
            this();
        }

        public String toString() {
            String simpleName = getClass().getSimpleName();
            n.g(simpleName, "getSimpleName(...)");
            return simpleName;
        }

        private ModuleState() {
        }
    }

    public interface a {
        void a(FailReason failReason);

        void b(Bitmap bitmap);
    }

    public interface b {
        void a(ModuleState moduleState);
    }

    void a();

    void b(b bVar);

    ModuleState c();

    void close();

    boolean d(Bitmap bitmap, a aVar);

    void e(b bVar);
}
