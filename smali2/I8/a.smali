.class public abstract LI8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/f;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, LI8/a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/a$a;

    iget v1, v0, LI8/a$a;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/a$a;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/a$a;

    invoke-direct {v0, p0, p2}, LI8/a$a;-><init>(LI8/a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/a$a;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/a$a;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_37

    if-ne v2, v3, :cond_2f

    iget-object p0, v0, LI8/a$a;->q:Ljava/lang/Object;

    check-cast p0, LJ8/v;

    :try_start_29
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_2c
    .catchall {:try_start_29 .. :try_end_2c} :catchall_2d

    goto :goto_4f

    :catchall_2d
    move-exception p1

    goto :goto_57

    :cond_2f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_37
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    new-instance p2, LJ8/v;

    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object v2

    invoke-direct {p2, p1, v2}, LJ8/v;-><init>(LI8/g;Lm8/i;)V

    :try_start_43
    iput-object p2, v0, LI8/a$a;->q:Ljava/lang/Object;

    iput v3, v0, LI8/a$a;->t:I

    invoke-virtual {p0, p2, v0}, LI8/a;->f(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_4b
    .catchall {:try_start_43 .. :try_end_4b} :catchall_55

    if-ne p0, v1, :cond_4e

    return-object v1

    :cond_4e
    move-object p0, p2

    :goto_4f
    invoke-virtual {p0}, LJ8/v;->releaseIntercepted()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :catchall_55
    move-exception p1

    move-object p0, p2

    :goto_57
    invoke-virtual {p0}, LJ8/v;->releaseIntercepted()V

    throw p1
.end method

.method public abstract f(LI8/g;Lm8/e;)Ljava/lang/Object;
.end method
