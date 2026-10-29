.class public abstract LF8/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lm8/e;)Ljava/lang/Object;
    .registers 5

    invoke-interface {p0}, Lm8/e;->getContext()Lm8/i;

    move-result-object v0

    invoke-static {v0}, LF8/A0;->j(Lm8/i;)V

    invoke-static {p0}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    instance-of v2, v1, LK8/h;

    if-eqz v2, :cond_12

    check-cast v1, LK8/h;

    goto :goto_13

    :cond_12
    const/4 v1, 0x0

    :goto_13
    if-nez v1, :cond_18

    sget-object v0, Lh8/A;->a:Lh8/A;

    goto :goto_49

    :cond_18
    iget-object v2, v1, LK8/h;->t:LF8/I;

    invoke-static {v2, v0}, LK8/i;->d(LF8/I;Lm8/i;)Z

    move-result v2

    if-eqz v2, :cond_26

    sget-object v2, Lh8/A;->a:Lh8/A;

    invoke-virtual {v1, v0, v2}, LK8/h;->n(Lm8/i;Ljava/lang/Object;)V

    goto :goto_45

    :cond_26
    new-instance v2, LF8/d1;

    invoke-direct {v2}, LF8/d1;-><init>()V

    invoke-interface {v0, v2}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object v0

    sget-object v3, Lh8/A;->a:Lh8/A;

    invoke-virtual {v1, v0, v3}, LK8/h;->n(Lm8/i;Ljava/lang/Object;)V

    iget-boolean v0, v2, LF8/d1;->r:Z

    if-eqz v0, :cond_45

    invoke-static {v1}, LK8/i;->e(LK8/h;)Z

    move-result v0

    if-eqz v0, :cond_43

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    goto :goto_49

    :cond_43
    move-object v0, v3

    goto :goto_49

    :cond_45
    :goto_45
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    :goto_49
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_52

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_52
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    if-ne v0, p0, :cond_59

    return-object v0

    :cond_59
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
