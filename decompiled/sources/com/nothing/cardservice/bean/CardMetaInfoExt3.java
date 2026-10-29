package com.nothing.cardservice.bean;

import androidx.annotation.Keep;
import androidx.constraintlayout.core.widgets.Optimizer;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class CardMetaInfoExt3 {

    @SerializedName("aiWidgetMeta")
    private AiWidgetMetaInfo aiWidgetMetaInfo;

    @SerializedName("multiPreviewDesc")
    private int multiPreviewDesc;

    @SerializedName("order")
    private Integer order;

    @SerializedName("previewDesc")
    private int previewDesc;

    @SerializedName("sharaType")
    private int sharaType;

    @SerializedName("sharable")
    private int sharable;

    @SerializedName("shareApiLevel")
    private int shareApiLevel;

    @SerializedName("shortCuts")
    private String shortCuts;

    public CardMetaInfoExt3() {
        this(0, 0, 0, 0, null, 0, null, null, 255, null);
    }

    public static /* synthetic */ CardMetaInfoExt3 copy$default(CardMetaInfoExt3 cardMetaInfoExt3, int i10, int i11, int i12, int i13, String str, int i14, AiWidgetMetaInfo aiWidgetMetaInfo, Integer num, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i10 = cardMetaInfoExt3.previewDesc;
        }
        if ((i15 & 2) != 0) {
            i11 = cardMetaInfoExt3.multiPreviewDesc;
        }
        if ((i15 & 4) != 0) {
            i12 = cardMetaInfoExt3.sharable;
        }
        if ((i15 & 8) != 0) {
            i13 = cardMetaInfoExt3.sharaType;
        }
        if ((i15 & 16) != 0) {
            str = cardMetaInfoExt3.shortCuts;
        }
        if ((i15 & 32) != 0) {
            i14 = cardMetaInfoExt3.shareApiLevel;
        }
        if ((i15 & 64) != 0) {
            aiWidgetMetaInfo = cardMetaInfoExt3.aiWidgetMetaInfo;
        }
        if ((i15 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0) {
            num = cardMetaInfoExt3.order;
        }
        AiWidgetMetaInfo aiWidgetMetaInfo2 = aiWidgetMetaInfo;
        Integer num2 = num;
        String str2 = str;
        int i16 = i14;
        return cardMetaInfoExt3.copy(i10, i11, i12, i13, str2, i16, aiWidgetMetaInfo2, num2);
    }

    public final int component1() {
        return this.previewDesc;
    }

    public final int component2() {
        return this.multiPreviewDesc;
    }

    public final int component3() {
        return this.sharable;
    }

    public final int component4() {
        return this.sharaType;
    }

    public final String component5() {
        return this.shortCuts;
    }

    public final int component6() {
        return this.shareApiLevel;
    }

    public final AiWidgetMetaInfo component7() {
        return this.aiWidgetMetaInfo;
    }

    public final Integer component8() {
        return this.order;
    }

    public final CardMetaInfoExt3 copy(int i10, int i11, int i12, int i13, String str, int i14, AiWidgetMetaInfo aiWidgetMetaInfo, Integer num) {
        return new CardMetaInfoExt3(i10, i11, i12, i13, str, i14, aiWidgetMetaInfo, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardMetaInfoExt3)) {
            return false;
        }
        CardMetaInfoExt3 cardMetaInfoExt3 = (CardMetaInfoExt3) obj;
        return this.previewDesc == cardMetaInfoExt3.previewDesc && this.multiPreviewDesc == cardMetaInfoExt3.multiPreviewDesc && this.sharable == cardMetaInfoExt3.sharable && this.sharaType == cardMetaInfoExt3.sharaType && n.d(this.shortCuts, cardMetaInfoExt3.shortCuts) && this.shareApiLevel == cardMetaInfoExt3.shareApiLevel && n.d(this.aiWidgetMetaInfo, cardMetaInfoExt3.aiWidgetMetaInfo) && n.d(this.order, cardMetaInfoExt3.order);
    }

    public final AiWidgetMetaInfo getAiWidgetMetaInfo() {
        return this.aiWidgetMetaInfo;
    }

    public final int getMultiPreviewDesc() {
        return this.multiPreviewDesc;
    }

    public final Integer getOrder() {
        return this.order;
    }

    public final int getPreviewDesc() {
        return this.previewDesc;
    }

    public final int getSharaType() {
        return this.sharaType;
    }

    public final int getSharable() {
        return this.sharable;
    }

    public final int getShareApiLevel() {
        return this.shareApiLevel;
    }

    public final String getShortCuts() {
        return this.shortCuts;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.previewDesc) * 31) + Integer.hashCode(this.multiPreviewDesc)) * 31) + Integer.hashCode(this.sharable)) * 31) + Integer.hashCode(this.sharaType)) * 31;
        String str = this.shortCuts;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.shareApiLevel)) * 31;
        AiWidgetMetaInfo aiWidgetMetaInfo = this.aiWidgetMetaInfo;
        int iHashCode3 = (iHashCode2 + (aiWidgetMetaInfo == null ? 0 : aiWidgetMetaInfo.hashCode())) * 31;
        Integer num = this.order;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final void setAiWidgetMetaInfo(AiWidgetMetaInfo aiWidgetMetaInfo) {
        this.aiWidgetMetaInfo = aiWidgetMetaInfo;
    }

    public final void setMultiPreviewDesc(int i10) {
        this.multiPreviewDesc = i10;
    }

    public final void setOrder(Integer num) {
        this.order = num;
    }

    public final void setPreviewDesc(int i10) {
        this.previewDesc = i10;
    }

    public final void setSharaType(int i10) {
        this.sharaType = i10;
    }

    public final void setSharable(int i10) {
        this.sharable = i10;
    }

    public final void setShareApiLevel(int i10) {
        this.shareApiLevel = i10;
    }

    public final void setShortCuts(String str) {
        this.shortCuts = str;
    }

    public String toString() {
        return "CardMetaInfoExt3(previewDesc=" + this.previewDesc + ", multiPreviewDesc=" + this.multiPreviewDesc + ", sharable=" + this.sharable + ", sharaType=" + this.sharaType + ", shortCuts=" + this.shortCuts + ", shareApiLevel=" + this.shareApiLevel + ", aiWidgetMetaInfo=" + this.aiWidgetMetaInfo + ", order=" + this.order + ")";
    }

    public CardMetaInfoExt3(int i10, int i11, int i12, int i13, String str, int i14, AiWidgetMetaInfo aiWidgetMetaInfo, Integer num) {
        this.previewDesc = i10;
        this.multiPreviewDesc = i11;
        this.sharable = i12;
        this.sharaType = i13;
        this.shortCuts = str;
        this.shareApiLevel = i14;
        this.aiWidgetMetaInfo = aiWidgetMetaInfo;
        this.order = num;
    }

    public /* synthetic */ CardMetaInfoExt3(int i10, int i11, int i12, int i13, String str, int i14, AiWidgetMetaInfo aiWidgetMetaInfo, Integer num, int i15, AbstractC1457h abstractC1457h) {
        this((i15 & 1) != 0 ? 0 : i10, (i15 & 2) != 0 ? 0 : i11, (i15 & 4) != 0 ? 0 : i12, (i15 & 8) != 0 ? 2 : i13, (i15 & 16) != 0 ? null : str, (i15 & 32) != 0 ? 0 : i14, (i15 & 64) != 0 ? null : aiWidgetMetaInfo, (i15 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? -1 : num);
    }
}
