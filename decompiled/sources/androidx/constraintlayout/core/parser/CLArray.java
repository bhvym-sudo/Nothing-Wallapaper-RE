package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toFormattedJSON(int i10, int i11) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i11 > 0 || json.length() + i10 >= CLElement.sMaxLine) {
            sb.append("[\n");
            boolean z9 = true;
            for (CLElement cLElement : this.mElements) {
                if (z9) {
                    z9 = false;
                } else {
                    sb.append(",\n");
                }
                addIndent(sb, CLElement.sBaseIndent + i10);
                sb.append(cLElement.toFormattedJSON(CLElement.sBaseIndent + i10, i11 - 1));
            }
            sb.append("\n");
            addIndent(sb, i10);
            sb.append("]");
        } else {
            sb.append(json);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "[");
        boolean z9 = true;
        for (int i10 = 0; i10 < this.mElements.size(); i10++) {
            if (z9) {
                z9 = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.mElements.get(i10).toJSON());
        }
        return ((Object) sb) + "]";
    }
}
