.class public abstract LV5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/content/Context;II)Landroid/util/Size;
    .registers 5

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/android/launcher3/views/f;->y(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    check-cast p0, Lcom/android/launcher3/views/f;

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object p0

    const-string v0, "getDeviceProfile(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/android/launcher3/f;->G:Landroid/graphics/Rect;

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    invoke-static {p0, p1, p2, v1}, LV5/a;->c(Lcom/android/launcher3/f;IILandroid/graphics/Point;)Landroid/util/Size;

    move-result-object p0

    new-instance p1, Landroid/util/Size;

    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result p2

    iget v1, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr p2, v1

    iget v1, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr p2, v1

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    iget v1, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr p0, v1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p0, v0

    invoke-direct {p1, p2, p0}, Landroid/util/Size;-><init>(II)V

    return-object p1
.end method

.method public static final b(Landroid/content/Context;II)Landroid/os/Bundle;
    .registers 5

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, LV5/a;->a(Landroid/content/Context;II)Landroid/util/Size;

    move-result-object p0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "span_x"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "span_y"

    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result p1

    const-string p2, "width"

    invoke-virtual {v0, p2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "height"

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    invoke-virtual {v0, p1, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method private static final c(Lcom/android/launcher3/f;IILandroid/graphics/Point;)Landroid/util/Size;
    .registers 7

    if-nez p3, :cond_7

    new-instance p3, Landroid/graphics/Point;

    invoke-direct {p3}, Landroid/graphics/Point;-><init>()V

    :cond_7
    add-int/lit8 v0, p1, -0x1

    iget-object v1, p0, Lcom/android/launcher3/f;->w:Landroid/graphics/Point;

    iget v2, v1, Landroid/graphics/Point;->x:I

    mul-int/2addr v0, v2

    add-int/lit8 v2, p2, -0x1

    iget v1, v1, Landroid/graphics/Point;->y:I

    mul-int/2addr v2, v1

    iget-object p0, p0, Lcom/android/launcher3/f;->K:Landroid/graphics/Point;

    iget v1, p0, Landroid/graphics/Point;->x:I

    iget p0, p0, Landroid/graphics/Point;->y:I

    invoke-virtual {p3, v1, p0}, Landroid/graphics/Point;->set(II)V

    new-instance p0, Landroid/util/Size;

    iget v1, p3, Landroid/graphics/Point;->x:I

    mul-int/2addr p1, v1

    add-int/2addr p1, v0

    iget p3, p3, Landroid/graphics/Point;->y:I

    mul-int/2addr p2, p3

    add-int/2addr p2, v2

    invoke-direct {p0, p1, p2}, Landroid/util/Size;-><init>(II)V

    return-object p0
.end method

.method private static final d(Landroid/os/Bundle;Landroid/os/Bundle;)Z
    .registers 3

    if-eqz p0, :cond_7

    :try_start_2
    invoke-static {p0}, LV5/a;->e(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p0

    goto :goto_8

    :cond_7
    const/4 p0, 0x0

    :goto_8
    invoke-static {p1}, LV5/a;->e(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_10} :catch_11

    return p0

    :catch_11
    move-exception p0

    const-string p1, "CardWidgetSizes"

    const-string v0, "sameOptions"

    invoke-static {p1, v0, p0}, Lcom/nothing/wallpaper/common/log/c;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static final e(Landroid/os/Bundle;)Ljava/lang/String;
    .registers 6

    const-string v0, "span_x"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "span_y"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v2, "width"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v3, "height"

    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CardOption:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/nothing/cardhost/g;Landroid/content/Context;II)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_8

    goto :goto_e

    :cond_8
    invoke-virtual {p0}, Lcom/nothing/cardhost/g;->getAppWidgetId()I

    move-result p0

    if-gtz p0, :cond_f

    :goto_e
    return-void

    :cond_f
    invoke-static {p1, p2, p3}, LV5/a;->b(Landroid/content/Context;II)Landroid/os/Bundle;

    move-result-object p2

    sget-object p3, LF5/l;->g:LF5/l$a;

    invoke-virtual {p3, p1}, LF5/l$a;->a(Landroid/content/Context;)LF5/l;

    move-result-object p1

    invoke-virtual {p1, p0}, LF5/l;->m(I)Landroid/os/Bundle;

    move-result-object p3

    if-eqz p3, :cond_27

    invoke-static {p3, p2}, LV5/a;->d(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    move-result p3

    const/4 v0, 0x1

    if-ne p3, v0, :cond_27

    return-void

    :cond_27
    invoke-virtual {p1, p0, p2}, LF5/l;->o(ILandroid/os/Bundle;)V

    return-void
.end method
