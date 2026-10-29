.class public abstract LG6/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroid/app/WallpaperColors;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Landroid/app/WallpaperColors;

    const/4 v1, 0x0

    invoke-static {v1}, Landroid/graphics/Color;->valueOf(I)Landroid/graphics/Color;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Landroid/app/WallpaperColors;-><init>(Landroid/graphics/Color;Landroid/graphics/Color;Landroid/graphics/Color;)V

    sput-object v0, LG6/h;->a:Landroid/app/WallpaperColors;

    return-void
.end method

.method public static final a()Landroid/app/WallpaperColors;
    .registers 1

    sget-object v0, LG6/h;->a:Landroid/app/WallpaperColors;

    return-object v0
.end method

.method public static final b(Landroid/app/WallpaperColors;)I
    .registers 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/WallpaperColors;->getPrimaryColor()Landroid/graphics/Color;

    move-result-object p0

    invoke-virtual {p0}, Landroid/graphics/Color;->toArgb()I

    move-result p0

    return p0
.end method

.method public static final c(Ljava/util/concurrent/Future;)Landroid/app/WallpaperColors;
    .registers 3

    const-string v0, "future"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_23

    :try_start_c
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg3/x$a;

    invoke-virtual {p0}, Lg3/x$a;->b()Landroid/app/WallpaperColors;

    move-result-object p0

    const-string v0, "getWallpaperColors(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LG6/h;->d(Landroid/app/WallpaperColors;)Z

    move-result v0
    :try_end_1f
    .catch Ljava/lang/InterruptedException; {:try_start_c .. :try_end_1f} :catch_2a
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_c .. :try_end_1f} :catch_2a

    if-eqz v0, :cond_22

    return-object v1

    :cond_22
    return-object p0

    :cond_23
    const-string p0, "WallpaperColors"

    const-string v0, "renderContentIfColorReady, colors is not ready."

    invoke-static {p0, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :catch_2a
    return-object v1
.end method

.method public static final d(Landroid/app/WallpaperColors;)Z
    .registers 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/WallpaperColors;->getPrimaryColor()Landroid/graphics/Color;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Color;->toArgb()I

    move-result v0

    if-nez v0, :cond_1d

    invoke-virtual {p0}, Landroid/app/WallpaperColors;->getSecondaryColor()Landroid/graphics/Color;

    move-result-object v0

    if-nez v0, :cond_1d

    invoke-virtual {p0}, Landroid/app/WallpaperColors;->getTertiaryColor()Landroid/graphics/Color;

    move-result-object p0

    if-nez p0, :cond_1d

    const/4 p0, 0x1

    return p0

    :cond_1d
    const/4 p0, 0x0

    return p0
.end method

.method public static final e(Landroid/app/WallpaperColors;Landroid/app/WallpaperColors;)Z
    .registers 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/WallpaperColors;->getColorHints()I

    move-result p0

    invoke-virtual {p1}, Landroid/app/WallpaperColors;->getColorHints()I

    move-result p1

    const/4 v0, 0x1

    and-int/2addr p0, v0

    const/4 v1, 0x0

    if-eqz p0, :cond_19

    move p0, v0

    goto :goto_1a

    :cond_19
    move p0, v1

    :goto_1a
    and-int/2addr p1, v0

    if-eqz p1, :cond_1f

    move p1, v0

    goto :goto_20

    :cond_1f
    move p1, v1

    :goto_20
    if-ne p0, p1, :cond_23

    return v0

    :cond_23
    return v1
.end method

.method public static final f(I)Z
    .registers 7

    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    move-result v0

    int-to-double v0, v0

    const-wide v2, 0x3fd322d0e5604189L    # 0.299

    mul-double/2addr v0, v2

    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    move-result v2

    int-to-double v2, v2

    const-wide v4, 0x3fe2c8b439581062L    # 0.587

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    move-result p0

    int-to-double v2, p0

    const-wide v4, 0x3fbd2f1a9fbe76c9L    # 0.114

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    const-wide/high16 v2, 0x4068000000000000L    # 192.0

    cmpg-double p0, v0, v2

    if-gtz p0, :cond_2b

    const/4 p0, 0x1

    return p0

    :cond_2b
    const/4 p0, 0x0

    return p0
.end method

.method public static final g(Landroid/app/WallpaperColors;)Z
    .registers 3

    const/4 v0, 0x1

    if-nez p0, :cond_4

    return v0

    :cond_4
    invoke-virtual {p0}, Landroid/app/WallpaperColors;->getColorHints()I

    move-result v1

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_d

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    if-nez v0, :cond_1d

    invoke-virtual {p0}, Landroid/app/WallpaperColors;->getPrimaryColor()Landroid/graphics/Color;

    move-result-object p0

    invoke-virtual {p0}, Landroid/graphics/Color;->toArgb()I

    move-result p0

    invoke-static {p0}, LG6/h;->f(I)Z

    move-result p0

    return p0

    :cond_1d
    return v0
.end method

.method public static final h(Landroid/app/WallpaperColors;)Z
    .registers 2

    const/4 v0, 0x1

    if-nez p0, :cond_4

    return v0

    :cond_4
    invoke-virtual {p0}, Landroid/app/WallpaperColors;->getColorHints()I

    move-result p0

    and-int/2addr p0, v0

    if-eqz p0, :cond_c

    return v0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public static final i(Ljava/lang/String;Landroid/app/WallpaperColors;)V
    .registers 6

    const-string v0, "msg"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_8

    return-void

    :cond_8
    invoke-virtual {p1}, Landroid/app/WallpaperColors;->getColorHints()I

    move-result v0

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_14

    move v1, v3

    goto :goto_15

    :cond_14
    move v1, v2

    :goto_15
    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1a

    move v2, v3

    :cond_1a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " :supportsDarkText="

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, ",isMainColorDark="

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p0, ",toString="

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "WallpaperColors"

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final j(Li3/M0;Landroid/app/WallpaperColors;)V
    .registers 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Li3/M0;->c()Landroid/app/WallpaperColors;

    move-result-object v0

    const-string v1, "WallpaperColors"

    if-nez p1, :cond_f

    if-eqz v0, :cond_1f

    :cond_f
    if-eqz p1, :cond_19

    if-eqz v0, :cond_19

    invoke-static {p1, v0}, LG6/h;->e(Landroid/app/WallpaperColors;Landroid/app/WallpaperColors;)Z

    move-result v0

    if-nez v0, :cond_1f

    :cond_19
    invoke-virtual {p0}, Li3/M0;->d()Z

    move-result v0

    if-nez v0, :cond_25

    :cond_1f
    const-string p0, "renderWithColorsIfNeed : same colors,return"

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "maybeRenderHomePreview :"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Li3/M0;->i(Landroid/app/WallpaperColors;)V

    invoke-virtual {p0}, Li3/M0;->f()V

    return-void
.end method
