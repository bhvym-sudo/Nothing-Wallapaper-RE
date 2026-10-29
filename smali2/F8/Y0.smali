.class public abstract LF8/Y0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JLF8/V;LF8/x0;)LF8/W0;
    .registers 5

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Timed out waiting for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, LF8/W0;

    invoke-direct {p1, p0, p3}, LF8/W0;-><init>(Ljava/lang/String;LF8/x0;)V

    return-object p1
.end method

.method private static final b(LF8/X0;Lv8/p;)Ljava/lang/Object;
    .registers 6

    iget-object v0, p0, LK8/z;->t:Lm8/e;

    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object v0

    invoke-static {v0}, LF8/W;->c(Lm8/i;)LF8/V;

    move-result-object v0

    iget-wide v1, p0, LF8/X0;->u:J

    invoke-virtual {p0}, LF8/a;->getContext()Lm8/i;

    move-result-object v3

    invoke-interface {v0, v1, v2, p0, v3}, LF8/V;->W0(JLjava/lang/Runnable;Lm8/i;)LF8/d0;

    move-result-object v0

    invoke-static {p0, v0}, LF8/A0;->h(LF8/x0;LF8/d0;)LF8/d0;

    invoke-static {p0, p0, p1}, LL8/b;->c(LK8/z;Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(JLv8/p;Lm8/e;)Ljava/lang/Object;
    .registers 11

    instance-of v0, p3, LF8/Y0$a;

    if-eqz v0, :cond_13

    move-object v0, p3

    check-cast v0, LF8/Y0$a;

    iget v1, v0, LF8/Y0$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LF8/Y0$a;->u:I

    goto :goto_18

    :cond_13
    new-instance v0, LF8/Y0$a;

    invoke-direct {v0, p3}, LF8/Y0$a;-><init>(Lm8/e;)V

    :goto_18
    iget-object p3, v0, LF8/Y0$a;->t:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LF8/Y0$a;->u:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_3c

    if-ne v2, v4, :cond_34

    iget-object p0, v0, LF8/Y0$a;->s:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/internal/E;

    iget-object p1, v0, LF8/Y0$a;->r:Ljava/lang/Object;

    check-cast p1, Lv8/p;

    :try_start_2e
    invoke-static {p3}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_31
    .catch LF8/W0; {:try_start_2e .. :try_end_31} :catch_32

    return-object p3

    :catch_32
    move-exception p1

    goto :goto_6f

    :cond_34
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3c
    invoke-static {p3}, Lh8/r;->b(Ljava/lang/Object;)V

    const-wide/16 v5, 0x0

    cmp-long p3, p0, v5

    if-gtz p3, :cond_46

    return-object v3

    :cond_46
    new-instance p3, Lkotlin/jvm/internal/E;

    invoke-direct {p3}, Lkotlin/jvm/internal/E;-><init>()V

    :try_start_4b
    iput-object p2, v0, LF8/Y0$a;->r:Ljava/lang/Object;

    iput-object p3, v0, LF8/Y0$a;->s:Ljava/lang/Object;

    iput-wide p0, v0, LF8/Y0$a;->q:J

    iput v4, v0, LF8/Y0$a;->u:I

    new-instance v2, LF8/X0;

    invoke-direct {v2, p0, p1, v0}, LF8/X0;-><init>(JLm8/e;)V

    iput-object v2, p3, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    invoke-static {v2, p2}, LF8/Y0;->b(LF8/X0;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_6b

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V
    :try_end_67
    .catch LF8/W0; {:try_start_4b .. :try_end_67} :catch_68

    goto :goto_6b

    :catch_68
    move-exception p1

    move-object p0, p3

    goto :goto_6f

    :cond_6b
    :goto_6b
    if-ne p0, v1, :cond_6e

    return-object v1

    :cond_6e
    return-object p0

    :goto_6f
    iget-object p2, p1, LF8/W0;->q:LF8/x0;

    iget-object p0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    if-ne p2, p0, :cond_76

    return-object v3

    :cond_76
    throw p1
.end method
