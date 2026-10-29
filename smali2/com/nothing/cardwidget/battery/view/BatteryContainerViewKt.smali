.class public final Lcom/nothing/cardwidget/battery/view/BatteryContainerViewKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final isSingleBattery(LM5/a;)Z
    .registers 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LM5/a;->j()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1a

    invoke-virtual {p0}, LM5/a;->m()I

    move-result v0

    if-ne v0, v1, :cond_1a

    invoke-virtual {p0}, LM5/a;->l()I

    move-result p0

    if-eq p0, v1, :cond_1a

    const/4 p0, 0x1

    return p0

    :cond_1a
    const/4 p0, 0x0

    return p0
.end method
