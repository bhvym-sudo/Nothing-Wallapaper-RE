.class public abstract Le6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()Landroid/graphics/Typeface;
    .registers 2

    const-string v0, "NDot55"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public static b()Landroid/graphics/Typeface;
    .registers 2

    const-string v0, "NDot57"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public static c()Landroid/graphics/Typeface;
    .registers 2

    const-string v0, "NDot77JPExtended"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public static d()Landroid/graphics/Typeface;
    .registers 2

    invoke-static {}, Le6/a;->e()Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    return-object v0

    :cond_9
    invoke-static {}, Le6/a;->e()Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ja"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-static {}, Le6/a;->c()Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0

    :cond_24
    invoke-static {}, Le6/a;->a()Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public static e()Z
    .registers 1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/nothing/utils/Utils;->isSupportNdot(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
