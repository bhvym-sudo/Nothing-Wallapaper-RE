package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLToken extends CLElement {
    int mIndex;
    char[] mTokenFalse;
    char[] mTokenNull;
    char[] mTokenTrue;
    Type mType;

    enum Type {
        UNKNOWN,
        TRUE,
        FALSE,
        NULL
    }

    public CLToken(char[] cArr) {
        super(cArr);
        this.mIndex = 0;
        this.mType = Type.UNKNOWN;
        this.mTokenTrue = "true".toCharArray();
        this.mTokenFalse = "false".toCharArray();
        this.mTokenNull = "null".toCharArray();
    }

    public static CLElement allocate(char[] cArr) {
        return new CLToken(cArr);
    }

    public boolean getBoolean() throws CLParsingException {
        Type type = this.mType;
        if (type == Type.TRUE) {
            return true;
        }
        if (type == Type.FALSE) {
            return false;
        }
        throw new CLParsingException("this token is not a boolean: <" + content() + ">", this);
    }

    public Type getType() {
        return this.mType;
    }

    public boolean isNull() throws CLParsingException {
        if (this.mType == Type.NULL) {
            return true;
        }
        throw new CLParsingException("this token is not a null: <" + content() + ">", this);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i10, int i11) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i10);
        sb.append(content());
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        if (!CLParser.sDebug) {
            return content();
        }
        return "<" + content() + ">";
    }

    public boolean validate(char c10, long j9) {
        int iOrdinal = this.mType.ordinal();
        boolean z9 = false;
        if (iOrdinal == 0) {
            char[] cArr = this.mTokenTrue;
            int i10 = this.mIndex;
            if (cArr[i10] == c10) {
                this.mType = Type.TRUE;
            } else if (this.mTokenFalse[i10] == c10) {
                this.mType = Type.FALSE;
            } else if (this.mTokenNull[i10] == c10) {
                this.mType = Type.NULL;
            }
            z9 = true;
        } else if (iOrdinal == 1) {
            char[] cArr2 = this.mTokenTrue;
            int i11 = this.mIndex;
            z9 = cArr2[i11] == c10;
            if (z9 && i11 + 1 == cArr2.length) {
                setEnd(j9);
            }
        } else if (iOrdinal == 2) {
            char[] cArr3 = this.mTokenFalse;
            int i12 = this.mIndex;
            z9 = cArr3[i12] == c10;
            if (z9 && i12 + 1 == cArr3.length) {
                setEnd(j9);
            }
        } else if (iOrdinal == 3) {
            char[] cArr4 = this.mTokenNull;
            int i13 = this.mIndex;
            z9 = cArr4[i13] == c10;
            if (z9 && i13 + 1 == cArr4.length) {
                setEnd(j9);
            }
        }
        this.mIndex++;
        return z9;
    }
}
