.class final LD6/b$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD6/b;->A0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LD6/b;

.field final synthetic s:Landroid/app/WallpaperColors;


# direct methods
.method constructor <init>(LD6/b;Landroid/app/WallpaperColors;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LD6/b$d;->r:LD6/b;

    iput-object p2, p0, LD6/b$d;->s:Landroid/app/WallpaperColors;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, LD6/b$d;

    iget-object v0, p0, LD6/b$d;->r:LD6/b;

    iget-object p0, p0, LD6/b$d;->s:Landroid/app/WallpaperColors;

    invoke-direct {p1, v0, p0, p2}, LD6/b$d;-><init>(LD6/b;Landroid/app/WallpaperColors;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LD6/b$d;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/b$d;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/b$d;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 11

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LD6/b$d;->q:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_1e

    if-eq v1, v3, :cond_1a

    if-ne v1, v2, :cond_12

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_77

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1a
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_32

    :cond_1e
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LD6/b$d;->r:LD6/b;

    invoke-static {p1}, LD6/b;->B(LD6/b;)LI8/z;

    move-result-object p1

    iget-object v1, p0, LD6/b$d;->s:Landroid/app/WallpaperColors;

    iput v3, p0, LD6/b$d;->q:I

    invoke-interface {p1, v1, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_32

    goto :goto_76

    :cond_32
    :goto_32
    iget-object p1, p0, LD6/b$d;->r:LD6/b;

    invoke-static {p1}, LD6/b;->f(LD6/b;)LD6/p;

    move-result-object p1

    const/4 v1, 0x0

    if-nez p1, :cond_41

    const-string p1, "colorCalculator"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p1, v1

    :cond_41
    invoke-virtual {p1}, LD6/p;->k()LD6/a$b;

    move-result-object p1

    if-eqz p1, :cond_77

    iget-object v3, p0, LD6/b$d;->r:LD6/b;

    iget-object v4, p0, LD6/b$d;->s:Landroid/app/WallpaperColors;

    invoke-static {v3}, LD6/b;->K(LD6/b;)LI8/z;

    move-result-object v5

    new-instance v6, Lh8/o;

    new-instance v7, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-virtual {p1}, LD6/a$b;->b()F

    move-result v8

    invoke-virtual {p1}, LD6/a$b;->a()Landroid/graphics/PointF;

    move-result-object p1

    invoke-static {v3}, LD6/b;->z(LD6/b;)Landroid/graphics/Point;

    move-result-object v3

    if-nez v3, :cond_67

    const-string v3, "viewSize"

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_68

    :cond_67
    move-object v1, v3

    :goto_68
    invoke-direct {v7, v8, p1, v1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;-><init>(FLandroid/graphics/PointF;Landroid/graphics/Point;)V

    invoke-direct {v6, v7, v4}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput v2, p0, LD6/b$d;->q:I

    invoke-interface {v5, v6, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_77

    :goto_76
    return-object v0

    :cond_77
    :goto_77
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
