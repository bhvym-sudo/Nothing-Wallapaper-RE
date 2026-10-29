.class public abstract LK8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LK8/D;

.field public static final b:LK8/D;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LK8/D;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LK8/i;->a:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LK8/i;->b:LK8/D;

    return-void
.end method

.method public static final synthetic a()LK8/D;
    .registers 1

    sget-object v0, LK8/i;->a:LK8/D;

    return-object v0
.end method

.method public static final b(Lm8/e;Ljava/lang/Object;)V
    .registers 8

    instance-of v0, p0, LK8/h;

    if-eqz v0, :cond_b2

    check-cast p0, LK8/h;

    invoke-static {p1}, LF8/C;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LK8/h;->t:LF8/I;

    invoke-virtual {p0}, LK8/h;->getContext()Lm8/i;

    move-result-object v2

    invoke-static {v1, v2}, LK8/i;->d(LF8/I;Lm8/i;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_26

    iput-object v0, p0, LK8/h;->v:Ljava/lang/Object;

    iput v2, p0, LF8/Z;->s:I

    iget-object p1, p0, LK8/h;->t:LF8/I;

    invoke-virtual {p0}, LK8/h;->getContext()Lm8/i;

    move-result-object v0

    invoke-static {p1, v0, p0}, LK8/i;->c(LF8/I;Lm8/i;Ljava/lang/Runnable;)V

    goto/16 :goto_ac

    :cond_26
    sget-object v1, LF8/V0;->a:LF8/V0;

    invoke-virtual {v1}, LF8/V0;->b()LF8/h0;

    move-result-object v1

    invoke-virtual {v1}, LF8/h0;->s1()Z

    move-result v3

    if-eqz v3, :cond_3b

    iput-object v0, p0, LK8/h;->v:Ljava/lang/Object;

    iput v2, p0, LF8/Z;->s:I

    invoke-virtual {v1, p0}, LF8/h0;->o1(LF8/Z;)V

    goto/16 :goto_ac

    :cond_3b
    invoke-virtual {v1, v2}, LF8/h0;->q1(Z)V

    :try_start_3e
    invoke-virtual {p0}, LK8/h;->getContext()Lm8/i;

    move-result-object v3

    sget-object v4, LF8/x0;->e:LF8/x0$b;

    invoke-interface {v3, v4}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v3

    check-cast v3, LF8/x0;

    if-eqz v3, :cond_69

    invoke-interface {v3}, LF8/x0;->a()Z

    move-result v4

    if-nez v4, :cond_69

    invoke-interface {v3}, LF8/x0;->K()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, LF8/Z;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    goto :goto_91

    :catchall_67
    move-exception p1

    goto :goto_a8

    :cond_69
    iget-object v0, p0, LK8/h;->u:Lm8/e;

    iget-object v3, p0, LK8/h;->w:Ljava/lang/Object;

    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object v4

    invoke-static {v4, v3}, LK8/K;->i(Lm8/i;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, LK8/K;->a:LK8/D;

    if-eq v3, v5, :cond_7e

    invoke-static {v0, v4, v3}, LF8/G;->m(Lm8/e;Lm8/i;Ljava/lang/Object;)LF8/a1;

    move-result-object v0
    :try_end_7d
    .catchall {:try_start_3e .. :try_end_7d} :catchall_67

    goto :goto_7f

    :cond_7e
    const/4 v0, 0x0

    :goto_7f
    :try_start_7f
    iget-object v5, p0, LK8/h;->u:Lm8/e;

    invoke-interface {v5, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_86
    .catchall {:try_start_7f .. :try_end_86} :catchall_9b

    if-eqz v0, :cond_8e

    :try_start_88
    invoke-virtual {v0}, LF8/a1;->Z0()Z

    move-result p1

    if-eqz p1, :cond_91

    :cond_8e
    invoke-static {v4, v3}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    :cond_91
    :goto_91
    invoke-virtual {v1}, LF8/h0;->v1()Z

    move-result p1
    :try_end_95
    .catchall {:try_start_88 .. :try_end_95} :catchall_67

    if-nez p1, :cond_91

    :goto_97
    invoke-virtual {v1, v2}, LF8/h0;->l1(Z)V

    goto :goto_ac

    :catchall_9b
    move-exception p1

    if-eqz v0, :cond_a4

    :try_start_9e
    invoke-virtual {v0}, LF8/a1;->Z0()Z

    move-result v0

    if-eqz v0, :cond_a7

    :cond_a4
    invoke-static {v4, v3}, LK8/K;->f(Lm8/i;Ljava/lang/Object;)V

    :cond_a7
    throw p1
    :try_end_a8
    .catchall {:try_start_9e .. :try_end_a8} :catchall_67

    :goto_a8
    :try_start_a8
    invoke-virtual {p0, p1}, LF8/Z;->g(Ljava/lang/Throwable;)V
    :try_end_ab
    .catchall {:try_start_a8 .. :try_end_ab} :catchall_ad

    goto :goto_97

    :goto_ac
    return-void

    :catchall_ad
    move-exception p0

    invoke-virtual {v1, v2}, LF8/h0;->l1(Z)V

    throw p0

    :cond_b2
    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(LF8/I;Lm8/i;Ljava/lang/Runnable;)V
    .registers 4

    :try_start_0
    invoke-virtual {p0, p1, p2}, LF8/I;->g1(Lm8/i;Ljava/lang/Runnable;)V
    :try_end_3
    .catchall {:try_start_0 .. :try_end_3} :catchall_4

    return-void

    :catchall_4
    move-exception p2

    new-instance v0, LF8/X;

    invoke-direct {v0, p2, p0, p1}, LF8/X;-><init>(Ljava/lang/Throwable;LF8/I;Lm8/i;)V

    throw v0
.end method

.method public static final d(LF8/I;Lm8/i;)Z
    .registers 4

    :try_start_0
    invoke-virtual {p0, p1}, LF8/I;->i1(Lm8/i;)Z

    move-result p0
    :try_end_4
    .catchall {:try_start_0 .. :try_end_4} :catchall_5

    return p0

    :catchall_5
    move-exception v0

    new-instance v1, LF8/X;

    invoke-direct {v1, v0, p0, p1}, LF8/X;-><init>(Ljava/lang/Throwable;LF8/I;Lm8/i;)V

    throw v1
.end method

.method public static final e(LK8/h;)Z
    .registers 6

    sget-object v0, Lh8/A;->a:Lh8/A;

    sget-object v1, LF8/V0;->a:LF8/V0;

    invoke-virtual {v1}, LF8/V0;->b()LF8/h0;

    move-result-object v1

    invoke-virtual {v1}, LF8/h0;->t1()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_10

    return v3

    :cond_10
    invoke-virtual {v1}, LF8/h0;->s1()Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_20

    iput-object v0, p0, LK8/h;->v:Ljava/lang/Object;

    iput v4, p0, LF8/Z;->s:I

    invoke-virtual {v1, p0}, LF8/h0;->o1(LF8/Z;)V

    move v3, v4

    goto :goto_35

    :cond_20
    invoke-virtual {v1, v4}, LF8/h0;->q1(Z)V

    :try_start_23
    invoke-virtual {p0}, LF8/Z;->run()V

    :cond_26
    invoke-virtual {v1}, LF8/h0;->v1()Z

    move-result v0
    :try_end_2a
    .catchall {:try_start_23 .. :try_end_2a} :catchall_30

    if-nez v0, :cond_26

    :goto_2c
    invoke-virtual {v1, v4}, LF8/h0;->l1(Z)V

    goto :goto_35

    :catchall_30
    move-exception v0

    :try_start_31
    invoke-virtual {p0, v0}, LF8/Z;->g(Ljava/lang/Throwable;)V
    :try_end_34
    .catchall {:try_start_31 .. :try_end_34} :catchall_36

    goto :goto_2c

    :goto_35
    return v3

    :catchall_36
    move-exception p0

    invoke-virtual {v1, v4}, LF8/h0;->l1(Z)V

    throw p0
.end method
