package R0;

import B0.i;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f6952a;

    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f6953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f6954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f6955c = true;

        a(TextView textView) {
            this.f6953a = textView;
            this.f6954b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f6954b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f6954b;
            return inputFilterArr2;
        }

        private SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayG.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f6953a.setFilters(a(this.f6953a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }

        @Override // R0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f6955c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // R0.f.b
        public boolean b() {
            return this.f6955c;
        }

        @Override // R0.f.b
        void c(boolean z9) {
            if (z9) {
                l();
            }
        }

        @Override // R0.f.b
        void d(boolean z9) {
            this.f6955c = z9;
            l();
            k();
        }

        @Override // R0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f6955c ? m(transformationMethod) : j(transformationMethod);
        }

        void i(boolean z9) {
            this.f6955c = z9;
        }

        void l() {
            this.f6953a.setTransformationMethod(e(this.f6953a.getTransformationMethod()));
        }
    }

    static class b {
        b() {
        }

        abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        abstract void c(boolean z9);

        abstract void d(boolean z9);

        abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    private static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f6956a;

        c(TextView textView) {
            this.f6956a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.e.i();
        }

        @Override // R0.f.b
        InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f6956a.a(inputFilterArr);
        }

        @Override // R0.f.b
        public boolean b() {
            return this.f6956a.b();
        }

        @Override // R0.f.b
        void c(boolean z9) {
            if (f()) {
                return;
            }
            this.f6956a.c(z9);
        }

        @Override // R0.f.b
        void d(boolean z9) {
            if (f()) {
                this.f6956a.i(z9);
            } else {
                this.f6956a.d(z9);
            }
        }

        @Override // R0.f.b
        TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f6956a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z9) {
        i.f(textView, "textView cannot be null");
        if (z9) {
            this.f6952a = new a(textView);
        } else {
            this.f6952a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f6952a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f6952a.b();
    }

    public void c(boolean z9) {
        this.f6952a.c(z9);
    }

    public void d(boolean z9) {
        this.f6952a.d(z9);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f6952a.e(transformationMethod);
    }
}
