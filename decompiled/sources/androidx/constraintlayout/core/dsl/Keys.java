package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Keys {
    protected void append(StringBuilder sb, String str, int i10) {
        if (i10 != Integer.MIN_VALUE) {
            sb.append(str);
            sb.append(":'");
            sb.append(i10);
            sb.append("',\n");
        }
    }

    protected String unpack(String[] strArr) {
        StringBuilder sb = new StringBuilder("[");
        int i10 = 0;
        while (i10 < strArr.length) {
            sb.append(i10 == 0 ? "'" : ",'");
            sb.append(strArr[i10]);
            sb.append("'");
            i10++;
        }
        sb.append("]");
        return sb.toString();
    }

    protected void append(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(str);
            sb.append(":'");
            sb.append(str2);
            sb.append("',\n");
        }
    }

    protected void append(StringBuilder sb, String str, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(f10);
        sb.append(",\n");
    }

    protected void append(StringBuilder sb, String str, String[] strArr) {
        if (strArr != null) {
            sb.append(str);
            sb.append(":");
            sb.append(unpack(strArr));
            sb.append(",\n");
        }
    }

    protected void append(StringBuilder sb, String str, float[] fArr) {
        if (fArr != null) {
            sb.append(str);
            sb.append("percentWidth:");
            sb.append(Arrays.toString(fArr));
            sb.append(",\n");
        }
    }
}
