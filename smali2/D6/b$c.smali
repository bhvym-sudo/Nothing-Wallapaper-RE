.class final LD6/b$c;
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


# direct methods
.method constructor <init>(LD6/b;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LD6/b$c;->r:LD6/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, LD6/b$c;

    iget-object p0, p0, LD6/b$c;->r:LD6/b;

    invoke-direct {p1, p0, p2}, LD6/b$c;-><init>(LD6/b;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LD6/b$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LD6/b$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LD6/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LD6/b$c;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LD6/b$c;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_3d

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LD6/b$c;->r:LD6/b;

    invoke-static {p1}, LD6/b;->g(LD6/b;)LD6/h;

    move-result-object p1

    const/4 v1, 0x0

    if-nez p1, :cond_29

    const-string p1, "colorStream"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p1, v1

    :cond_29
    invoke-virtual {p1}, LD6/h;->g()LI8/z;

    move-result-object p1

    new-instance v3, LD6/b$c$a;

    iget-object v4, p0, LD6/b$c;->r:LD6/b;

    invoke-direct {v3, v4, v1}, LD6/b$c$a;-><init>(LD6/b;Lm8/e;)V

    iput v2, p0, LD6/b$c;->q:I

    invoke-static {p1, v3, p0}, LI8/h;->i(LI8/f;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_3d

    return-object v0

    :cond_3d
    :goto_3d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
