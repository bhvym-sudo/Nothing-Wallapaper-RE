package com.nothing.launcher.card.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class CardWidgetSimpleInfo {
    private final int cellX;
    private final int cellY;
    private final int id;
    private final long seq;
    private final int spanX;
    private final int spanY;

    public CardWidgetSimpleInfo(int i10, int i11, int i12, int i13, int i14, long j9) {
        this.id = i10;
        this.cellX = i11;
        this.cellY = i12;
        this.spanX = i13;
        this.spanY = i14;
        this.seq = j9;
    }

    public static /* synthetic */ CardWidgetSimpleInfo copy$default(CardWidgetSimpleInfo cardWidgetSimpleInfo, int i10, int i11, int i12, int i13, int i14, long j9, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i10 = cardWidgetSimpleInfo.id;
        }
        if ((i15 & 2) != 0) {
            i11 = cardWidgetSimpleInfo.cellX;
        }
        if ((i15 & 4) != 0) {
            i12 = cardWidgetSimpleInfo.cellY;
        }
        if ((i15 & 8) != 0) {
            i13 = cardWidgetSimpleInfo.spanX;
        }
        if ((i15 & 16) != 0) {
            i14 = cardWidgetSimpleInfo.spanY;
        }
        if ((i15 & 32) != 0) {
            j9 = cardWidgetSimpleInfo.seq;
        }
        long j10 = j9;
        int i16 = i14;
        int i17 = i12;
        return cardWidgetSimpleInfo.copy(i10, i11, i17, i13, i16, j10);
    }

    public final int component1() {
        return this.id;
    }

    public final int component2() {
        return this.cellX;
    }

    public final int component3() {
        return this.cellY;
    }

    public final int component4() {
        return this.spanX;
    }

    public final int component5() {
        return this.spanY;
    }

    public final long component6() {
        return this.seq;
    }

    public final CardWidgetSimpleInfo copy(int i10, int i11, int i12, int i13, int i14, long j9) {
        return new CardWidgetSimpleInfo(i10, i11, i12, i13, i14, j9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardWidgetSimpleInfo)) {
            return false;
        }
        CardWidgetSimpleInfo cardWidgetSimpleInfo = (CardWidgetSimpleInfo) obj;
        return this.id == cardWidgetSimpleInfo.id && this.cellX == cardWidgetSimpleInfo.cellX && this.cellY == cardWidgetSimpleInfo.cellY && this.spanX == cardWidgetSimpleInfo.spanX && this.spanY == cardWidgetSimpleInfo.spanY && this.seq == cardWidgetSimpleInfo.seq;
    }

    public final int getCellX() {
        return this.cellX;
    }

    public final int getCellY() {
        return this.cellY;
    }

    public final int getId() {
        return this.id;
    }

    public final long getSeq() {
        return this.seq;
    }

    public final int getSpanX() {
        return this.spanX;
    }

    public final int getSpanY() {
        return this.spanY;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.cellX)) * 31) + Integer.hashCode(this.cellY)) * 31) + Integer.hashCode(this.spanX)) * 31) + Integer.hashCode(this.spanY)) * 31) + Long.hashCode(this.seq);
    }

    public String toString() {
        return "CardWidgetSimpleInfo(id=" + this.id + ", cellX=" + this.cellX + ", cellY=" + this.cellY + ", spanX=" + this.spanX + ", spanY=" + this.spanY + ", seq=" + this.seq + ")";
    }
}
