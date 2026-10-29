package com.airbnb.lottie.model;

/* JADX INFO: loaded from: classes.dex */
public class DocumentData {
    public float baselineShift;
    public int color;
    public String fontName;
    public Justification justification;
    public float lineHeight;
    public float size;
    public int strokeColor;
    public boolean strokeOverFill;
    public float strokeWidth;
    public String text;
    public int tracking;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f10, Justification justification, int i10, float f11, float f12, int i11, int i12, float f13, boolean z9) {
        set(str, str2, f10, justification, i10, f11, f12, i11, i12, f13, z9);
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.text.hashCode() * 31) + this.fontName.hashCode()) * 31) + this.size)) * 31) + this.justification.ordinal()) * 31) + this.tracking;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.lineHeight);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.color;
    }

    public void set(String str, String str2, float f10, Justification justification, int i10, float f11, float f12, int i11, int i12, float f13, boolean z9) {
        this.text = str;
        this.fontName = str2;
        this.size = f10;
        this.justification = justification;
        this.tracking = i10;
        this.lineHeight = f11;
        this.baselineShift = f12;
        this.color = i11;
        this.strokeColor = i12;
        this.strokeWidth = f13;
        this.strokeOverFill = z9;
    }

    public DocumentData() {
    }
}
