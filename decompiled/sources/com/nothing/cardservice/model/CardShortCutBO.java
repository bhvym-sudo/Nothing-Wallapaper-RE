package com.nothing.cardservice.model;

import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class CardShortCutBO {
    private final List<CardWidgetShortCut> shortcuts;

    public CardShortCutBO(List<CardWidgetShortCut> shortcuts) {
        n.h(shortcuts, "shortcuts");
        this.shortcuts = shortcuts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardShortCutBO copy$default(CardShortCutBO cardShortCutBO, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = cardShortCutBO.shortcuts;
        }
        return cardShortCutBO.copy(list);
    }

    public final List<CardWidgetShortCut> component1() {
        return this.shortcuts;
    }

    public final CardShortCutBO copy(List<CardWidgetShortCut> shortcuts) {
        n.h(shortcuts, "shortcuts");
        return new CardShortCutBO(shortcuts);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardShortCutBO) && n.d(this.shortcuts, ((CardShortCutBO) obj).shortcuts);
    }

    public final List<CardWidgetShortCut> getShortcuts() {
        return this.shortcuts;
    }

    public int hashCode() {
        return this.shortcuts.hashCode();
    }

    public String toString() {
        return "CardShortCutBO(shortcuts=" + this.shortcuts + ")";
    }
}
