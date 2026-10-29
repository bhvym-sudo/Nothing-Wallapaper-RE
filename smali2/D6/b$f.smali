.class final LD6/b$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD6/b;->y0(Lcom/nothing/wallpaper/effects/data/model/ViewScope;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LD6/b;

.field final synthetic s:Lcom/nothing/wallpaper/effects/data/model/ViewScope;


# direct methods
.method constructor <init>(LD6/b;Lcom/nothing/wallpaper/effects/data/model/ViewScope;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LD6/b$f;->r:LD6/b;

    iput-object p2, p0, LD6/b$f;->s:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, LD6/b$f;

    iget-object v0, p0, LD6/b$f;->r:LD6/b;

    iget-object p0, p0, LD6/b$f;->s:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-direct {p1, v0, p0, p2}, LD6/b$f;-><init>(LD6/b;Lcom/nothing/wallpaper/effects/data/model/ViewScope;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LD6/b$f;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/b$f;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/b$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/b$f;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LD6/b$f;->q:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_1e

    if-eq v1, v3, :cond_1a

    if-ne v1, v2, :cond_12

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_66

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1a
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4d

    :cond_1e
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LD6/b$f;->r:LD6/b;

    invoke-static {p1}, LD6/b;->G(LD6/b;)LI8/z;

    move-result-object p1

    invoke-interface {p1}, LI8/z;->g()V

    iget-object p1, p0, LD6/b$f;->r:LD6/b;

    invoke-static {p1}, LD6/b;->K(LD6/b;)LI8/z;

    move-result-object p1

    invoke-interface {p1}, LI8/z;->g()V

    iget-object p1, p0, LD6/b$f;->r:LD6/b;

    invoke-static {p1}, LD6/b;->B(LD6/b;)LI8/z;

    move-result-object p1

    invoke-interface {p1}, LI8/z;->g()V

    iget-object p1, p0, LD6/b$f;->r:LD6/b;

    invoke-virtual {p1}, LD6/b;->t0()LI8/z;

    move-result-object p1

    iget-object v1, p0, LD6/b$f;->s:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    iput v3, p0, LD6/b$f;->q:I

    invoke-interface {p1, v1, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4d

    goto :goto_65

    :cond_4d
    :goto_4d
    iget-object p1, p0, LD6/b$f;->r:LD6/b;

    invoke-static {p1}, LD6/b;->b(LD6/b;)LD6/h;

    move-result-object p1

    if-nez p1, :cond_5b

    const-string p1, "bitmapStream"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_5b
    iget-object v1, p0, LD6/b$f;->s:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    iput v2, p0, LD6/b$f;->q:I

    invoke-virtual {p1, v1, p0}, LD6/h;->e(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_66

    :goto_65
    return-object v0

    :cond_66
    :goto_66
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
