.class final LU5/e$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU5/e;-><init>(Landroid/content/Context;LF8/L;LF8/I;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field synthetic s:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lm8/e;)V
    .registers 3

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p1, LI8/g;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lm8/e;

    invoke-virtual {p0, p1, p2, p3}, LU5/e$f;->s(LI8/g;Ljava/lang/Throwable;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LU5/e$f;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_36

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LU5/e$f;->r:Ljava/lang/Object;

    check-cast p1, LI8/g;

    iget-object v1, p0, LU5/e$f;->s:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    instance-of v3, v1, Ljava/io/IOException;

    if-eqz v3, :cond_39

    invoke-static {}, LO0/g;->a()LO0/f;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, p0, LU5/e$f;->r:Ljava/lang/Object;

    iput v2, p0, LU5/e$f;->q:I

    invoke-interface {p1, v1, p0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_36

    return-object v0

    :cond_36
    :goto_36
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_39
    throw v1
.end method

.method public final s(LI8/g;Ljava/lang/Throwable;Lm8/e;)Ljava/lang/Object;
    .registers 4

    new-instance p0, LU5/e$f;

    invoke-direct {p0, p3}, LU5/e$f;-><init>(Lm8/e;)V

    iput-object p1, p0, LU5/e$f;->r:Ljava/lang/Object;

    iput-object p2, p0, LU5/e$f;->s:Ljava/lang/Object;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LU5/e$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
