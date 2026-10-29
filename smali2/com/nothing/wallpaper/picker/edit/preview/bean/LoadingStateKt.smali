.class public final Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a()J
    .registers 2

    const-wide/16 v0, 0xe6

    return-wide v0
.end method

.method public static final getLoadingSilenceDelay(Z)J
    .registers 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    if-eqz p0, :cond_5

    const-wide/16 v0, 0x1f4

    return-wide v0

    :cond_5
    invoke-static {}, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingStateKt;->a()J

    move-result-wide v0

    return-wide v0
.end method
