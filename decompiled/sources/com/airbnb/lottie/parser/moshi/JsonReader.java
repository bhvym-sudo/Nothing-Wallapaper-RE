package com.airbnb.lottie.parser.moshi;

import androidx.constraintlayout.core.widgets.Optimizer;
import e9.C1350e;
import e9.f;
import e9.g;
import e9.h;
import e9.r;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class JsonReader implements Closeable {
    private static final String[] REPLACEMENT_CHARS = new String[Optimizer.OPTIMIZATION_GRAPH_WRAP];
    boolean failOnUnknown;
    boolean lenient;
    int stackSize;
    int[] scopes = new int[32];
    String[] pathNames = new String[32];
    int[] pathIndices = new int[32];

    public static final class Options {
        final r doubleQuoteSuffix;
        final String[] strings;

        private Options(String[] strArr, r rVar) {
            this.strings = strArr;
            this.doubleQuoteSuffix = rVar;
        }

        public static Options of(String... strArr) {
            try {
                h[] hVarArr = new h[strArr.length];
                C1350e c1350e = new C1350e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    JsonReader.string(c1350e, strArr[i10]);
                    c1350e.readByte();
                    hVarArr[i10] = c1350e.w0();
                }
                return new Options((String[]) strArr.clone(), r.r(hVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            REPLACEMENT_CHARS[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    JsonReader() {
    }

    public static JsonReader of(g gVar) {
        return new JsonUtf8Reader(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void string(f fVar, String str) {
        String str2;
        String[] strArr = REPLACEMENT_CHARS;
        fVar.F(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        fVar.o0(str, i10, i11);
                    }
                    fVar.d0(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    fVar.o0(str, i10, i11);
                }
                fVar.d0(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            fVar.o0(str, i10, length);
        }
        fVar.F(34);
    }

    public abstract void beginArray();

    public abstract void beginObject();

    public abstract void endArray();

    public abstract void endObject();

    public final String getPath() {
        return JsonScope.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices);
    }

    public abstract boolean hasNext();

    public abstract boolean nextBoolean();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract String nextName();

    public abstract String nextString();

    public abstract Token peek();

    final void pushScope(int i10) {
        int i11 = this.stackSize;
        int[] iArr = this.scopes;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.scopes = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.pathNames;
            this.pathNames = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.pathIndices;
            this.pathIndices = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.scopes;
        int i12 = this.stackSize;
        this.stackSize = i12 + 1;
        iArr3[i12] = i10;
    }

    public abstract int selectName(Options options);

    public abstract void skipName();

    public abstract void skipValue();

    final JsonEncodingException syntaxError(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + getPath());
    }
}
