.class public final LS5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS5/d;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/List;


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/util/List;)V
    .registers 6

    const-string v0, "pkgName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "widgetList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LS5/a;->a:I

    iput p2, p0, LS5/a;->b:I

    iput-object p3, p0, LS5/a;->c:Ljava/lang/String;

    iput-object p4, p0, LS5/a;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_5
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    iget-object v0, p0, LS5/a;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object p1

    const-string v0, "getResourcesForApplication(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LS5/a;->b:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_20
    .catchall {:try_start_5 .. :try_end_20} :catchall_21

    goto :goto_2c

    :catchall_21
    move-exception p1

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2c
    iget-object p0, p0, LS5/a;->c:Ljava/lang/String;

    invoke-static {p1}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_35

    move-object p1, p0

    :cond_35
    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public final b(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LS5/a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_f

    const/4 p0, 0x0

    return-object p0

    :cond_f
    iget-object v0, p0, LS5/a;->d:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/launcher/card/j;

    invoke-virtual {v0}, LF5/m;->n()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2a

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, p1, v1, v2}, Lcom/nothing/launcher/card/j;->F0(Landroid/content/Context;II)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_29

    goto :goto_2a

    :cond_29
    return-object v0

    :cond_2a
    :goto_2a
    sget-object v0, LS5/b;->d:LS5/b$a;

    iget-object v1, p0, LS5/a;->c:Ljava/lang/String;

    iget p0, p0, LS5/a;->a:I

    invoke-virtual {v0, v1, p0, p1}, LS5/b$a;->a(Ljava/lang/String;ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public final c()I
    .registers 1

    iget p0, p0, LS5/a;->a:I

    return p0
.end method

.method public final d()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LS5/a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final e(Landroid/content/Context;Lcom/android/launcher3/f;)Landroid/graphics/Bitmap;
    .registers 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dp"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LS5/a;->d:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_12
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/nothing/launcher/card/j;

    invoke-virtual {v2}, LF5/m;->l()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_12

    invoke-virtual {v2}, LF5/m;->k()I

    move-result v2

    if-ne v2, v4, :cond_12

    goto :goto_2f

    :cond_2e
    move-object v0, v1

    :goto_2f
    check-cast v0, Lcom/nothing/launcher/card/j;

    if-eqz v0, :cond_4c

    const/4 p0, 0x0

    invoke-virtual {v0}, LF5/m;->J()I

    move-result v1

    invoke-virtual {v0, p1, p0, v1}, Lcom/nothing/launcher/card/j;->F0(Landroid/content/Context;II)Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Lcom/nothing/launcher/card/j;->B0()I

    move-result p0

    invoke-virtual {v0}, Lcom/nothing/launcher/card/j;->C0()I

    move-result v1

    invoke-virtual {p2, p0, v1}, Lcom/android/launcher3/f;->l(II)Landroid/graphics/Rect;

    move-result-object p0

    invoke-virtual {v0, p1, p0}, Lcom/nothing/launcher/card/j;->t0(Landroid/content/Context;Landroid/graphics/Rect;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_4c
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, LS5/a;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, LS5/a;

    iget v1, p0, LS5/a;->a:I

    iget v3, p1, LS5/a;->a:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, LS5/a;->b:I

    iget v3, p1, LS5/a;->b:I

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, LS5/a;->c:Ljava/lang/String;

    iget-object v3, p1, LS5/a;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    return v2

    :cond_25
    iget-object p0, p0, LS5/a;->d:Ljava/util/List;

    iget-object p1, p1, LS5/a;->d:Ljava/util/List;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_30

    return v2

    :cond_30
    return v0
.end method

.method public final f()I
    .registers 1

    iget p0, p0, LS5/a;->b:I

    return p0
.end method

.method public final g()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LS5/a;->d:Ljava/util/List;

    return-object p0
.end method

.method public final h()Ljava/lang/String;
    .registers 3

    iget-object v0, p0, LS5/a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object p0, p0, LS5/a;->c:Ljava/lang/String;

    return-object p0

    :cond_b
    iget-object v0, p0, LS5/a;->c:Ljava/lang/String;

    iget-object p0, p0, LS5/a;->d:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/launcher/card/j;

    invoke-virtual {p0}, Lcom/nothing/launcher/card/j;->v0()Landroid/content/ComponentName;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public hashCode()I
    .registers 3

    iget v0, p0, LS5/a;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LS5/a;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LS5/a;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, LS5/a;->d:Ljava/util/List;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 6

    iget v0, p0, LS5/a;->a:I

    iget v1, p0, LS5/a;->b:I

    iget-object v2, p0, LS5/a;->c:Ljava/lang/String;

    iget-object p0, p0, LS5/a;->d:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CardGroupMetaInfo(groupId="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", titleRes="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", pkgName="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", widgetList="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
