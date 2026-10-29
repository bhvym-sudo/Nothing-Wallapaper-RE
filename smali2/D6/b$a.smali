.class final LD6/b$a;
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

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:LD6/b;


# direct methods
.method constructor <init>(LD6/b;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LD6/b$a;->s:LD6/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LD6/b$a;

    iget-object p0, p0, LD6/b$a;->s:LD6/b;

    invoke-direct {v0, p0, p2}, LD6/b$a;-><init>(LD6/b;Lm8/e;)V

    iput-object p1, v0, LD6/b$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LD6/h$c;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/b$a;->s(LD6/h$c;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LD6/b$a;->q:I

    if-nez v0, :cond_93

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LD6/b$a;->r:Ljava/lang/Object;

    check-cast p1, LD6/h$c;

    invoke-virtual {p1}, LD6/h$c;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LC6/b;

    invoke-virtual {v3}, LC6/b;->c()LC6/a;

    move-result-object v3

    sget-object v4, LC6/a;->q:LC6/a;

    if-ne v3, v4, :cond_18

    goto :goto_30

    :cond_2f
    move-object v1, v2

    :goto_30
    check-cast v1, LC6/b;

    if-eqz v1, :cond_83

    iget-object v0, p0, LD6/b$a;->s:LD6/b;

    invoke-virtual {v1}, LC6/b;->a()LC6/i;

    move-result-object v3

    sget-object v4, Lv6/a;->m:Lv6/a;

    invoke-static {v3, v4}, LG6/f;->a(LC6/i;Lk6/c;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-virtual {v1}, LC6/b;->a()LC6/i;

    move-result-object v1

    invoke-virtual {v1}, LC6/i;->b()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :try_start_4c
    invoke-static {v0}, LD6/b;->f(LD6/b;)LD6/p;

    move-result-object v0

    if-nez v0, :cond_5a

    const-string v0, "colorCalculator"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_5b

    :catchall_58
    move-exception p0

    goto :goto_7b

    :cond_5a
    move-object v2, v0

    :goto_5b
    invoke-virtual {p1}, LD6/h$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    new-instance v0, LD6/a$b;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result v5

    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object p1

    invoke-direct {v0, v5, p1}, LD6/a$b;-><init>(FLandroid/graphics/PointF;)V

    invoke-virtual {v2, v3, v0}, LD6/p;->f(Landroid/graphics/Bitmap;LD6/a;)Landroid/app/WallpaperColors;

    move-result-object p1
    :try_end_72
    .catchall {:try_start_4c .. :try_end_72} :catchall_58

    if-nez v1, :cond_77

    invoke-virtual {v4, v3}, Lk6/e;->m(Ljava/lang/Object;)V

    :cond_77
    if-nez p1, :cond_7a

    goto :goto_83

    :cond_7a
    return-object p1

    :goto_7b
    if-nez v1, :cond_82

    sget-object p1, Lv6/a;->m:Lv6/a;

    invoke-virtual {p1, v3}, Lk6/e;->m(Ljava/lang/Object;)V

    :cond_82
    throw p0

    :cond_83
    :goto_83
    iget-object p0, p0, LD6/b$a;->s:LD6/b;

    invoke-static {p0}, LD6/b;->u(LD6/b;)Lq6/b;

    move-result-object p0

    const-string p1, "should calculator colors but didn\'t find CropType.Setter, return EMPTY_COLORS."

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    invoke-static {}, LG6/h;->a()Landroid/app/WallpaperColors;

    move-result-object p0

    return-object p0

    :cond_93
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(LD6/h$c;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LD6/b$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/b$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
