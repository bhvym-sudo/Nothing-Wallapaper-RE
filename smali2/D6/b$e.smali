.class final LD6/b$e;
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

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:LD6/b;


# direct methods
.method constructor <init>(LD6/b;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LD6/b$e;->s:LD6/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LD6/b$e;

    iget-object p0, p0, LD6/b$e;->s:LD6/b;

    invoke-direct {v0, p0, p2}, LD6/b$e;-><init>(LD6/b;Lm8/e;)V

    iput-object p1, v0, LD6/b$e;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LD6/b$e;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/b$e;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/b$e;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LD6/b$e;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_41

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LD6/b$e;->r:Ljava/lang/Object;

    check-cast p1, LF8/L;

    iget-object v1, p0, LD6/b$e;->s:LD6/b;

    invoke-static {v1}, LD6/b;->b(LD6/b;)LD6/h;

    move-result-object v1

    const/4 v3, 0x0

    if-nez v1, :cond_2d

    const-string v1, "bitmapStream"

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v3

    :cond_2d
    invoke-virtual {v1}, LD6/h;->g()LI8/z;

    move-result-object v1

    new-instance v4, LD6/b$e$a;

    iget-object v5, p0, LD6/b$e;->s:LD6/b;

    invoke-direct {v4, p1, v5, v3}, LD6/b$e$a;-><init>(LF8/L;LD6/b;Lm8/e;)V

    iput v2, p0, LD6/b$e;->q:I

    invoke-static {v1, v4, p0}, LI8/h;->i(LI8/f;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_41

    return-object v0

    :cond_41
    :goto_41
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
