package W;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    private static final void b(C0977t c0977t, InterfaceC0970l interfaceC0970l) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < c0977t.c()) {
            int i13 = i10 + 2;
            int iB = c0977t.b(i10) - c0977t.b(i13);
            int iB2 = c0977t.b(i10 + 1) - c0977t.b(i13);
            int iB3 = c0977t.b(i13);
            i10 += 3;
            while (i11 < iB) {
                interfaceC0970l.a(i12, i11);
                i11++;
            }
            while (i12 < iB2) {
                interfaceC0970l.d(i12);
                i12++;
            }
            while (true) {
                int i14 = iB3 - 1;
                if (iB3 > 0) {
                    interfaceC0970l.c(i11, i12);
                    i11++;
                    i12++;
                    iB3 = i14;
                }
            }
        }
    }

    private static final boolean c(int i10, int i11, int i12, int i13, InterfaceC0970l interfaceC0970l, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iB;
        int i15;
        int i16;
        int i17 = (i11 - i10) - (i13 - i12);
        boolean z9 = i17 % 2 == 0;
        int i18 = -i14;
        for (int i19 = i18; i19 <= i14; i19 += 2) {
            if (i19 == i18 || (i19 != i14 && AbstractC0964f.b(iArr2, i19 + 1) < AbstractC0964f.b(iArr2, i19 - 1))) {
                iB = AbstractC0964f.b(iArr2, i19 + 1);
                i15 = iB;
            } else {
                iB = AbstractC0964f.b(iArr2, i19 - 1);
                i15 = iB - 1;
            }
            int i20 = i13 - ((i11 - i15) - i19);
            int i21 = (i14 == 0 || i15 != iB) ? i20 : i20 + 1;
            while (true) {
                if (i15 <= i10 || i20 <= i12) {
                    break;
                }
                if (!interfaceC0970l.b(i15 - 1, i20 - 1)) {
                    break;
                }
                i15--;
                i20--;
            }
            AbstractC0964f.d(iArr2, i19, i15);
            if (z9 && (i16 = i17 - i19) >= i18 && i16 <= i14) {
                if (AbstractC0964f.b(iArr, i16) >= i15) {
                    f(i15, i20, iB, i21, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final C0977t d(int i10, int i11, InterfaceC0970l interfaceC0970l) {
        int i12 = ((i10 + i11) + 1) / 2;
        C0977t c0977t = new C0977t(i12 * 3);
        C0977t c0977t2 = new C0977t(i12 * 4);
        c0977t2.h(0, i10, 0, i11);
        int i13 = (i12 * 2) + 1;
        int[] iArrA = AbstractC0964f.a(new int[i13]);
        int[] iArrA2 = AbstractC0964f.a(new int[i13]);
        int[] iArrB = o0.b(new int[5]);
        while (c0977t2.d()) {
            int iF = c0977t2.f();
            int iF2 = c0977t2.f();
            int iF3 = c0977t2.f();
            int iF4 = c0977t2.f();
            InterfaceC0970l interfaceC0970l2 = interfaceC0970l;
            if (h(iF4, iF3, iF2, iF, interfaceC0970l2, iArrA, iArrA2, iArrB)) {
                if (o0.c(iArrB) > 0) {
                    o0.a(iArrB, c0977t);
                }
                c0977t2.h(iF4, o0.h(iArrB), iF2, o0.i(iArrB));
                c0977t2.h(o0.d(iArrB), iF3, o0.e(iArrB), iF);
            }
            interfaceC0970l = interfaceC0970l2;
        }
        c0977t.j();
        c0977t.g(i10, i11, 0);
        return c0977t;
    }

    public static final void e(int i10, int i11, InterfaceC0970l interfaceC0970l) {
        b(d(i10, i11, interfaceC0970l), interfaceC0970l);
    }

    public static final void f(int i10, int i11, int i12, int i13, boolean z9, int[] iArr) {
        iArr[0] = i10;
        iArr[1] = i11;
        iArr[2] = i12;
        iArr[3] = i13;
        iArr[4] = z9 ? 1 : 0;
    }

    private static final boolean g(int i10, int i11, int i12, int i13, InterfaceC0970l interfaceC0970l, int[] iArr, int[] iArr2, int i14, int[] iArr3) {
        int iB;
        int i15;
        int i16 = (i11 - i10) - (i13 - i12);
        boolean z9 = Math.abs(i16) % 2 == 1;
        int i17 = -i14;
        for (int i18 = i17; i18 <= i14; i18 += 2) {
            if (i18 == i17 || (i18 != i14 && AbstractC0964f.b(iArr, i18 + 1) > AbstractC0964f.b(iArr, i18 - 1))) {
                iB = AbstractC0964f.b(iArr, i18 + 1);
                i15 = iB;
            } else {
                iB = AbstractC0964f.b(iArr, i18 - 1);
                i15 = iB + 1;
            }
            int i19 = (i12 + (i15 - i10)) - i18;
            int i20 = (i14 == 0 || i15 != iB) ? i19 : i19 - 1;
            while (true) {
                if (i15 >= i11 || i19 >= i13) {
                    break;
                }
                if (!interfaceC0970l.b(i15, i19)) {
                    break;
                }
                i15++;
                i19++;
            }
            AbstractC0964f.d(iArr, i18, i15);
            if (z9) {
                int i21 = i16 - i18;
                if (i21 >= i17 + 1 && i21 <= i14 - 1) {
                    if (AbstractC0964f.b(iArr2, i21) <= i15) {
                        f(iB, i20, i15, i19, false, iArr3);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final boolean h(int i10, int i11, int i12, int i13, InterfaceC0970l interfaceC0970l, int[] iArr, int[] iArr2, int[] iArr3) {
        int i14 = i11 - i10;
        int i15 = i13 - i12;
        if (i14 >= 1 && i15 >= 1) {
            int i16 = ((i14 + i15) + 1) / 2;
            int[] iArr4 = iArr;
            AbstractC0964f.d(iArr4, 1, i10);
            int[] iArr5 = iArr2;
            AbstractC0964f.d(iArr5, 1, i11);
            int i17 = 0;
            while (i17 < i16) {
                if (g(i10, i11, i12, i13, interfaceC0970l, iArr4, iArr5, i17, iArr3) || c(i10, i11, i12, i13, interfaceC0970l, iArr, iArr2, i17, iArr3)) {
                    return true;
                }
                i17++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i10, int i11) {
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
    }
}
