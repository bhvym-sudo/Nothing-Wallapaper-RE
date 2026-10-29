package com.nothing.cardservice.model;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class CardWidgetShortCut {
    private final String action;
    private final String icon;
    private final int line;
    private final String targetPackage;
    private final String title;

    public CardWidgetShortCut(int i10, String title, String icon, String action, String targetPackage) {
        n.h(title, "title");
        n.h(icon, "icon");
        n.h(action, "action");
        n.h(targetPackage, "targetPackage");
        this.line = i10;
        this.title = title;
        this.icon = icon;
        this.action = action;
        this.targetPackage = targetPackage;
    }

    public static /* synthetic */ CardWidgetShortCut copy$default(CardWidgetShortCut cardWidgetShortCut, int i10, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cardWidgetShortCut.line;
        }
        if ((i11 & 2) != 0) {
            str = cardWidgetShortCut.title;
        }
        if ((i11 & 4) != 0) {
            str2 = cardWidgetShortCut.icon;
        }
        if ((i11 & 8) != 0) {
            str3 = cardWidgetShortCut.action;
        }
        if ((i11 & 16) != 0) {
            str4 = cardWidgetShortCut.targetPackage;
        }
        String str5 = str4;
        String str6 = str2;
        return cardWidgetShortCut.copy(i10, str, str6, str3, str5);
    }

    public final int component1() {
        return this.line;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.icon;
    }

    public final String component4() {
        return this.action;
    }

    public final String component5() {
        return this.targetPackage;
    }

    public final CardWidgetShortCut copy(int i10, String title, String icon, String action, String targetPackage) {
        n.h(title, "title");
        n.h(icon, "icon");
        n.h(action, "action");
        n.h(targetPackage, "targetPackage");
        return new CardWidgetShortCut(i10, title, icon, action, targetPackage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardWidgetShortCut)) {
            return false;
        }
        CardWidgetShortCut cardWidgetShortCut = (CardWidgetShortCut) obj;
        return this.line == cardWidgetShortCut.line && n.d(this.title, cardWidgetShortCut.title) && n.d(this.icon, cardWidgetShortCut.icon) && n.d(this.action, cardWidgetShortCut.action) && n.d(this.targetPackage, cardWidgetShortCut.targetPackage);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getLine() {
        return this.line;
    }

    public final String getTargetPackage() {
        return this.targetPackage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.line) * 31) + this.title.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.action.hashCode()) * 31) + this.targetPackage.hashCode();
    }

    public String toString() {
        return "CardWidgetShortCut(line=" + this.line + ", title=" + this.title + ", icon=" + this.icon + ", action=" + this.action + ", targetPackage=" + this.targetPackage + ")";
    }
}
