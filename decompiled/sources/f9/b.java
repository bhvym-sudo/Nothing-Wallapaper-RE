package f9;

import e9.C1350e;
import e9.h;
import kotlin.jvm.internal.n;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f20887a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(byte[] bArr, int i10) {
        int i11;
        int i12;
        byte b10;
        int i13 = 1;
        int length = bArr.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < length) {
            byte b11 = bArr[i14];
            if (b11 >= 0) {
                int i17 = i16 + 1;
                if (i16 == i10) {
                    break;
                }
                if ((b11 != 10 && b11 != 13 && ((b11 >= 0 && b11 < 32) || (127 <= b11 && b11 < 160))) || b11 == 65533) {
                    return -1;
                }
                i15 += b11 < 65536 ? i13 : 2;
                i14 += i13;
                while (true) {
                    i16 = i17;
                    if (i14 >= length || (b10 = bArr[i14]) < 0) {
                        break;
                    }
                    i14 += i13;
                    i17 = i16 + 1;
                    if (i16 == i10) {
                        return i15;
                    }
                    if ((b10 != 10 && b10 != 13 && ((b10 >= 0 && b10 < 32) || (127 <= b10 && b10 < 160))) || b10 == 65533) {
                        return -1;
                    }
                    i15 += b10 < 65536 ? i13 : 2;
                }
                A a10 = A.f21846a;
                i11 = i13;
                i13 = i11;
            } else {
                i11 = i13;
                if ((b11 >> 5) == -2) {
                    int i18 = i14 + 1;
                    if (length <= i18) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    byte b12 = bArr[i18];
                    if ((b12 & 192) != 128) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    int i19 = (b12 ^ 3968) ^ (b11 << 6);
                    if (i19 < 128) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    i12 = i16 + 1;
                    if (i16 == i10) {
                        break;
                    }
                    if ((i19 != 10 && i19 != 13 && ((i19 >= 0 && i19 < 32) || (127 <= i19 && i19 < 160))) || i19 == 65533) {
                        return -1;
                    }
                    i15 += i19 < 65536 ? i11 : 2;
                    A a11 = A.f21846a;
                    i14 += 2;
                    i16 = i12;
                } else if ((b11 >> 4) == -2) {
                    int i20 = i14 + 2;
                    if (length <= i20) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    byte b13 = bArr[i14 + 1];
                    if ((b13 & 192) != 128) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    byte b14 = bArr[i20];
                    if ((b14 & 192) != 128) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    int i21 = ((b14 ^ (-123008)) ^ (b13 << 6)) ^ (b11 << 12);
                    if (i21 < 2048) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    if (55296 <= i21 && i21 < 57344) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    i12 = i16 + 1;
                    if (i16 == i10) {
                        break;
                    }
                    if ((i21 != 10 && i21 != 13 && ((i21 >= 0 && i21 < 32) || (127 <= i21 && i21 < 160))) || i21 == 65533) {
                        return -1;
                    }
                    i15 += i21 < 65536 ? i11 : 2;
                    A a12 = A.f21846a;
                    i14 += 3;
                    i16 = i12;
                } else {
                    if ((b11 >> 3) != -2) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    int i22 = i14 + 3;
                    if (length <= i22) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    byte b15 = bArr[i14 + 1];
                    if ((b15 & 192) != 128) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    byte b16 = bArr[i14 + 2];
                    if ((b16 & 192) != 128) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    byte b17 = bArr[i22];
                    if ((b17 & 192) != 128) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    int i23 = (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12)) ^ (b11 << 18);
                    if (i23 > 1114111) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    if (55296 <= i23 && i23 < 57344) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    if (i23 < 65536) {
                        if (i16 == i10) {
                            break;
                        }
                        return -1;
                    }
                    i12 = i16 + 1;
                    if (i16 == i10) {
                        break;
                    }
                    if ((i23 != 10 && i23 != 13 && ((i23 >= 0 && i23 < 32) || (127 <= i23 && i23 < 160))) || i23 == 65533) {
                        return -1;
                    }
                    i15 += i23 < 65536 ? i11 : 2;
                    A a13 = A.f21846a;
                    i14 += 4;
                    i16 = i12;
                }
                i13 = i11;
            }
        }
        return i15;
    }

    public static final void d(h hVar, C1350e buffer, int i10, int i11) {
        n.h(hVar, "<this>");
        n.h(buffer, "buffer");
        buffer.k0(hVar.i(), i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    public static final char[] f() {
        return f20887a;
    }
}
