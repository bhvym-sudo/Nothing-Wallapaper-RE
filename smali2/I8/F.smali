.class public LI8/F;
.super LJ8/b;
.source "SourceFile"

# interfaces
.implements LI8/z;
.implements LI8/f;
.implements LJ8/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI8/F$a;,
        LI8/F$b;
    }
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private final u:I

.field private final v:I

.field private final w:LH8/a;

.field private x:[Ljava/lang/Object;

.field private y:J

.field private z:J


# direct methods
.method public constructor <init>(IILH8/a;)V
    .registers 4

    invoke-direct {p0}, LJ8/b;-><init>()V

    iput p1, p0, LI8/F;->u:I

    iput p2, p0, LI8/F;->v:I

    iput-object p3, p0, LI8/F;->w:LH8/a;

    return-void
.end method

.method private final A(LI8/H;Lm8/e;)Ljava/lang/Object;
    .registers 8

    new-instance v0, LF8/n;

    invoke-static {p2}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v0}, LF8/n;->G()V

    monitor-enter p0

    :try_start_e
    invoke-static {p0, p1}, LI8/F;->z(LI8/F;LI8/H;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-gez v1, :cond_1d

    iput-object v0, p1, LI8/H;->b:Lm8/e;

    goto :goto_28

    :catchall_1b
    move-exception p1

    goto :goto_42

    :cond_1d
    sget-object p1, Lh8/q;->r:Lh8/q$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    :goto_28
    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_2a
    .catchall {:try_start_e .. :try_end_2a} :catchall_1b

    monitor-exit p0

    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_38

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_38
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3f

    return-object p0

    :cond_3f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :goto_42
    monitor-exit p0

    throw p1
.end method

.method private final B(LI8/F$a;)V
    .registers 6

    monitor-enter p0

    :try_start_1
    iget-wide v0, p1, LI8/F$a;->r:J

    invoke-direct {p0}, LI8/F;->N()J

    move-result-wide v2
    :try_end_7
    .catchall {:try_start_1 .. :try_end_7} :catchall_2a

    cmp-long v0, v0, v2

    if-gez v0, :cond_d

    monitor-exit p0

    return-void

    :cond_d
    :try_start_d
    iget-object v0, p0, LI8/F;->x:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-wide v1, p1, LI8/F$a;->r:J

    invoke-static {v0, v1, v2}, LI8/G;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1
    :try_end_18
    .catchall {:try_start_d .. :try_end_18} :catchall_2a

    if-eq v1, p1, :cond_1c

    monitor-exit p0

    return-void

    :cond_1c
    :try_start_1c
    iget-wide v1, p1, LI8/F$a;->r:J

    sget-object p1, LI8/G;->a:LK8/D;

    invoke-static {v0, v1, v2, p1}, LI8/G;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-direct {p0}, LI8/F;->C()V

    sget-object p1, Lh8/A;->a:Lh8/A;
    :try_end_28
    .catchall {:try_start_1c .. :try_end_28} :catchall_2a

    monitor-exit p0

    return-void

    :catchall_2a
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private final C()V
    .registers 6

    iget v0, p0, LI8/F;->v:I

    if-nez v0, :cond_a

    iget v0, p0, LI8/F;->B:I

    const/4 v1, 0x1

    if-gt v0, v1, :cond_a

    goto :goto_3d

    :cond_a
    iget-object v0, p0, LI8/F;->x:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    :goto_f
    iget v1, p0, LI8/F;->B:I

    if-lez v1, :cond_3d

    invoke-direct {p0}, LI8/F;->N()J

    move-result-wide v1

    invoke-direct {p0}, LI8/F;->S()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    invoke-static {v0, v1, v2}, LI8/G;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, LI8/G;->a:LK8/D;

    if-ne v1, v2, :cond_3d

    iget v1, p0, LI8/F;->B:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LI8/F;->B:I

    invoke-direct {p0}, LI8/F;->N()J

    move-result-wide v1

    invoke-direct {p0}, LI8/F;->S()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, LI8/G;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_f

    :cond_3d
    :goto_3d
    return-void
.end method

.method static synthetic D(LI8/F;LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 11

    instance-of v0, p2, LI8/F$c;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LI8/F$c;

    iget v1, v0, LI8/F$c;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LI8/F$c;->w:I

    goto :goto_18

    :cond_13
    new-instance v0, LI8/F$c;

    invoke-direct {v0, p0, p2}, LI8/F$c;-><init>(LI8/F;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LI8/F$c;->u:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LI8/F$c;->w:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eqz v2, :cond_77

    const/4 p0, 0x1

    if-eq v2, p0, :cond_61

    if-eq v2, v4, :cond_4d

    if-ne v2, v3, :cond_45

    iget-object p0, v0, LI8/F$c;->t:Ljava/lang/Object;

    check-cast p0, LF8/x0;

    iget-object p1, v0, LI8/F$c;->s:Ljava/lang/Object;

    check-cast p1, LI8/H;

    iget-object v2, v0, LI8/F$c;->r:Ljava/lang/Object;

    check-cast v2, LI8/g;

    iget-object v5, v0, LI8/F$c;->q:Ljava/lang/Object;

    check-cast v5, LI8/F;

    :try_start_3b
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_3e
    .catchall {:try_start_3b .. :try_end_3e} :catchall_42

    :cond_3e
    move-object p2, v2

    move-object v2, p0

    move-object p0, v5

    goto :goto_8f

    :catchall_42
    move-exception p0

    goto/16 :goto_c4

    :cond_45
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4d
    iget-object p0, v0, LI8/F$c;->t:Ljava/lang/Object;

    check-cast p0, LF8/x0;

    iget-object p1, v0, LI8/F$c;->s:Ljava/lang/Object;

    check-cast p1, LI8/H;

    iget-object v2, v0, LI8/F$c;->r:Ljava/lang/Object;

    check-cast v2, LI8/g;

    iget-object v5, v0, LI8/F$c;->q:Ljava/lang/Object;

    check-cast v5, LI8/F;

    :try_start_5d
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_60
    .catchall {:try_start_5d .. :try_end_60} :catchall_42

    goto :goto_92

    :cond_61
    iget-object p0, v0, LI8/F$c;->s:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LI8/H;

    iget-object p0, v0, LI8/F$c;->r:Ljava/lang/Object;

    check-cast p0, LI8/g;

    iget-object v2, v0, LI8/F$c;->q:Ljava/lang/Object;

    check-cast v2, LI8/F;

    :try_start_6e
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_71
    .catchall {:try_start_6e .. :try_end_71} :catchall_74

    move-object p2, p0

    move-object p0, v2

    goto :goto_83

    :catchall_74
    move-exception p0

    move-object v5, v2

    goto :goto_c4

    :cond_77
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, LJ8/b;->j()LJ8/d;

    move-result-object p2

    check-cast p2, LI8/H;

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_83
    :try_start_83
    invoke-interface {v0}, Lm8/e;->getContext()Lm8/i;

    move-result-object v2

    sget-object v5, LF8/x0;->e:LF8/x0$b;

    invoke-interface {v2, v5}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v2

    check-cast v2, LF8/x0;
    :try_end_8f
    .catchall {:try_start_83 .. :try_end_8f} :catchall_c1

    :goto_8f
    move-object v5, p0

    move-object p0, v2

    move-object v2, p2

    :cond_92
    :goto_92
    :try_start_92
    invoke-direct {v5, p1}, LI8/F;->X(LI8/H;)Ljava/lang/Object;

    move-result-object p2

    sget-object v6, LI8/G;->a:LK8/D;

    if-ne p2, v6, :cond_ab

    iput-object v5, v0, LI8/F$c;->q:Ljava/lang/Object;

    iput-object v2, v0, LI8/F$c;->r:Ljava/lang/Object;

    iput-object p1, v0, LI8/F$c;->s:Ljava/lang/Object;

    iput-object p0, v0, LI8/F$c;->t:Ljava/lang/Object;

    iput v4, v0, LI8/F$c;->w:I

    invoke-direct {v5, p1, v0}, LI8/F;->A(LI8/H;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_92

    goto :goto_c0

    :cond_ab
    if-eqz p0, :cond_b0

    invoke-static {p0}, LF8/A0;->i(LF8/x0;)V

    :cond_b0
    iput-object v5, v0, LI8/F$c;->q:Ljava/lang/Object;

    iput-object v2, v0, LI8/F$c;->r:Ljava/lang/Object;

    iput-object p1, v0, LI8/F$c;->s:Ljava/lang/Object;

    iput-object p0, v0, LI8/F$c;->t:Ljava/lang/Object;

    iput v3, v0, LI8/F$c;->w:I

    invoke-interface {v2, p2, v0}, LI8/g;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p2
    :try_end_be
    .catchall {:try_start_92 .. :try_end_be} :catchall_42

    if-ne p2, v1, :cond_3e

    :goto_c0
    return-object v1

    :catchall_c1
    move-exception p2

    move-object v5, p0

    move-object p0, p2

    :goto_c4
    invoke-virtual {v5, p1}, LJ8/b;->n(LJ8/d;)V

    throw p0
.end method

.method private final E(J)V
    .registers 11

    invoke-static {p0}, LJ8/b;->f(LJ8/b;)I

    move-result v0

    if-eqz v0, :cond_27

    invoke-static {p0}, LJ8/b;->i(LJ8/b;)[LJ8/d;

    move-result-object v0

    if-eqz v0, :cond_27

    array-length v1, v0

    const/4 v2, 0x0

    :goto_e
    if-ge v2, v1, :cond_27

    aget-object v3, v0, v2

    if-eqz v3, :cond_24

    check-cast v3, LI8/H;

    iget-wide v4, v3, LI8/H;->a:J

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-ltz v6, :cond_24

    cmp-long v4, v4, p1

    if-gez v4, :cond_24

    iput-wide p1, v3, LI8/H;->a:J

    :cond_24
    add-int/lit8 v2, v2, 0x1

    goto :goto_e

    :cond_27
    iput-wide p1, p0, LI8/F;->z:J

    return-void
.end method

.method private final H()V
    .registers 5

    iget-object v0, p0, LI8/F;->x:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0}, LI8/F;->N()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, LI8/G;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    iget v0, p0, LI8/F;->A:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LI8/F;->A:I

    invoke-direct {p0}, LI8/F;->N()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iget-wide v2, p0, LI8/F;->y:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_22

    iput-wide v0, p0, LI8/F;->y:J

    :cond_22
    iget-wide v2, p0, LI8/F;->z:J

    cmp-long v2, v2, v0

    if-gez v2, :cond_2b

    invoke-direct {p0, v0, v1}, LI8/F;->E(J)V

    :cond_2b
    return-void
.end method

.method static synthetic I(LI8/F;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-virtual {p0, p1}, LI8/F;->h(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_9
    invoke-direct {p0, p1, p2}, LI8/F;->J(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_14

    return-object p0

    :cond_14
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final J(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 11

    new-instance v5, LF8/n;

    invoke-static {p2}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v0

    const/4 v6, 0x1

    invoke-direct {v5, v0, v6}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v5}, LF8/n;->G()V

    sget-object v7, LJ8/c;->a:[Lm8/e;

    monitor-enter p0

    :try_start_10
    invoke-static {p0, p1}, LI8/F;->y(LI8/F;Ljava/lang/Object;)Z

    move-result v0
    :try_end_14
    .catchall {:try_start_10 .. :try_end_14} :catchall_8a

    if-eqz v0, :cond_2c

    :try_start_16
    sget-object p1, Lh8/q;->r:Lh8/q$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v5, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    invoke-static {p0, v7}, LI8/F;->s(LI8/F;[Lm8/e;)[Lm8/e;

    move-result-object p1
    :try_end_25
    .catchall {:try_start_16 .. :try_end_25} :catchall_28

    const/4 v0, 0x0

    move-object v1, p0

    goto :goto_58

    :catchall_28
    move-exception v0

    move-object p1, v0

    move-object v1, p0

    goto :goto_8d

    :cond_2c
    :try_start_2c
    new-instance v0, LI8/F$a;

    invoke-static {p0}, LI8/F;->u(LI8/F;)J

    move-result-wide v1

    invoke-static {p0}, LI8/F;->w(LI8/F;)I

    move-result v3
    :try_end_36
    .catchall {:try_start_2c .. :try_end_36} :catchall_8a

    int-to-long v3, v3

    add-long v2, v1, v3

    move-object v1, p0

    move-object v4, p1

    :try_start_3b
    invoke-direct/range {v0 .. v5}, LI8/F$a;-><init>(LI8/F;JLjava/lang/Object;Lm8/e;)V

    invoke-static {v1, v0}, LI8/F;->r(LI8/F;Ljava/lang/Object;)V

    invoke-static {v1}, LI8/F;->v(LI8/F;)I

    move-result p0

    add-int/2addr p0, v6

    invoke-static {v1, p0}, LI8/F;->x(LI8/F;I)V

    invoke-static {v1}, LI8/F;->t(LI8/F;)I

    move-result p0

    if-nez p0, :cond_57

    invoke-static {v1, v7}, LI8/F;->s(LI8/F;[Lm8/e;)[Lm8/e;

    move-result-object v7
    :try_end_53
    .catchall {:try_start_3b .. :try_end_53} :catchall_54

    goto :goto_57

    :catchall_54
    move-exception v0

    :goto_55
    move-object p1, v0

    goto :goto_8d

    :cond_57
    :goto_57
    move-object p1, v7

    :goto_58
    monitor-exit v1

    if-eqz v0, :cond_5e

    invoke-static {v5, v0}, LF8/p;->a(LF8/l;LF8/d0;)V

    :cond_5e
    array-length p0, p1

    const/4 v0, 0x0

    :goto_60
    if-ge v0, p0, :cond_73

    aget-object v1, p1, v0

    if-eqz v1, :cond_71

    sget-object v2, Lh8/q;->r:Lh8/q$a;

    sget-object v2, Lh8/A;->a:Lh8/A;

    invoke-static {v2}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_71
    add-int/2addr v0, v6

    goto :goto_60

    :cond_73
    invoke-virtual {v5}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_80

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_80
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_87

    return-object p0

    :cond_87
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :catchall_8a
    move-exception v0

    move-object v1, p0

    goto :goto_55

    :goto_8d
    monitor-exit v1

    throw p1
.end method

.method private final K(Ljava/lang/Object;)V
    .registers 8

    invoke-direct {p0}, LI8/F;->S()I

    move-result v0

    iget-object v1, p0, LI8/F;->x:[Ljava/lang/Object;

    const/4 v2, 0x2

    if-nez v1, :cond_10

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {p0, v1, v3, v2}, LI8/F;->T([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v1

    goto :goto_19

    :cond_10
    array-length v3, v1

    if-lt v0, v3, :cond_19

    array-length v3, v1

    mul-int/2addr v3, v2

    invoke-direct {p0, v1, v0, v3}, LI8/F;->T([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v1

    :cond_19
    :goto_19
    invoke-direct {p0}, LI8/F;->N()J

    move-result-wide v2

    int-to-long v4, v0

    add-long/2addr v2, v4

    invoke-static {v1, v2, v3, p1}, LI8/G;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method private final L([Lm8/e;)[Lm8/e;
    .registers 12

    array-length v0, p1

    invoke-static {p0}, LJ8/b;->f(LJ8/b;)I

    move-result v1

    if-eqz v1, :cond_47

    invoke-static {p0}, LJ8/b;->i(LJ8/b;)[LJ8/d;

    move-result-object v1

    if-eqz v1, :cond_47

    array-length v2, v1

    const/4 v3, 0x0

    :goto_f
    if-ge v3, v2, :cond_47

    aget-object v4, v1, v3

    if-eqz v4, :cond_44

    check-cast v4, LI8/H;

    iget-object v5, v4, LI8/H;->b:Lm8/e;

    if-nez v5, :cond_1c

    goto :goto_44

    :cond_1c
    invoke-direct {p0, v4}, LI8/F;->W(LI8/H;)J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    if-ltz v6, :cond_44

    array-length v6, p1

    if-lt v0, v6, :cond_39

    array-length v6, p1

    const/4 v7, 0x2

    mul-int/2addr v6, v7

    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v6, "copyOf(...)"

    invoke-static {p1, v6}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_39
    move-object v6, p1

    check-cast v6, [Lm8/e;

    add-int/lit8 v7, v0, 0x1

    aput-object v5, v6, v0

    const/4 v0, 0x0

    iput-object v0, v4, LI8/H;->b:Lm8/e;

    move v0, v7

    :cond_44
    :goto_44
    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_47
    check-cast p1, [Lm8/e;

    return-object p1
.end method

.method private final M()J
    .registers 5

    invoke-direct {p0}, LI8/F;->N()J

    move-result-wide v0

    iget p0, p0, LI8/F;->A:I

    int-to-long v2, p0

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private final N()J
    .registers 5

    iget-wide v0, p0, LI8/F;->z:J

    iget-wide v2, p0, LI8/F;->y:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method private final P(J)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LI8/F;->x:[Ljava/lang/Object;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p0, p1, p2}, LI8/G;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    instance-of p1, p0, LI8/F$a;

    if-eqz p1, :cond_11

    check-cast p0, LI8/F$a;

    iget-object p0, p0, LI8/F$a;->s:Ljava/lang/Object;

    :cond_11
    return-object p0
.end method

.method private final Q()J
    .registers 5

    invoke-direct {p0}, LI8/F;->N()J

    move-result-wide v0

    iget v2, p0, LI8/F;->A:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget p0, p0, LI8/F;->B:I

    int-to-long v2, p0

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private final R()I
    .registers 5

    invoke-direct {p0}, LI8/F;->N()J

    move-result-wide v0

    iget v2, p0, LI8/F;->A:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-wide v2, p0, LI8/F;->y:J

    sub-long/2addr v0, v2

    long-to-int p0, v0

    return p0
.end method

.method private final S()I
    .registers 2

    iget v0, p0, LI8/F;->A:I

    iget p0, p0, LI8/F;->B:I

    add-int/2addr v0, p0

    return v0
.end method

.method private final T([Ljava/lang/Object;II)[Ljava/lang/Object;
    .registers 9

    if-lez p3, :cond_1d

    new-array p3, p3, [Ljava/lang/Object;

    iput-object p3, p0, LI8/F;->x:[Ljava/lang/Object;

    if-nez p1, :cond_9

    goto :goto_1c

    :cond_9
    invoke-direct {p0}, LI8/F;->N()J

    move-result-wide v0

    const/4 p0, 0x0

    :goto_e
    if-ge p0, p2, :cond_1c

    int-to-long v2, p0

    add-long/2addr v2, v0

    invoke-static {p1, v2, v3}, LI8/G;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p3, v2, v3, v4}, LI8/G;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 p0, p0, 0x1

    goto :goto_e

    :cond_1c
    :goto_1c
    return-object p3

    :cond_1d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Buffer size overflow"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final U(Ljava/lang/Object;)Z
    .registers 16

    invoke-virtual {p0}, LJ8/b;->o()I

    move-result v0

    if-nez v0, :cond_b

    invoke-direct {p0, p1}, LI8/F;->V(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_b
    iget v0, p0, LI8/F;->A:I

    iget v1, p0, LI8/F;->v:I

    const/4 v2, 0x1

    if-lt v0, v1, :cond_36

    iget-wide v0, p0, LI8/F;->z:J

    iget-wide v3, p0, LI8/F;->y:J

    cmp-long v0, v0, v3

    if-gtz v0, :cond_36

    iget-object v0, p0, LI8/F;->w:LH8/a;

    sget-object v1, LI8/F$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    if-eq v0, v2, :cond_34

    const/4 v1, 0x2

    if-eq v0, v1, :cond_33

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2d

    goto :goto_36

    :cond_2d
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0

    :cond_33
    return v2

    :cond_34
    const/4 p0, 0x0

    return p0

    :cond_36
    :goto_36
    invoke-direct {p0, p1}, LI8/F;->K(Ljava/lang/Object;)V

    iget p1, p0, LI8/F;->A:I

    add-int/2addr p1, v2

    iput p1, p0, LI8/F;->A:I

    iget v0, p0, LI8/F;->v:I

    if-le p1, v0, :cond_45

    invoke-direct {p0}, LI8/F;->H()V

    :cond_45
    invoke-direct {p0}, LI8/F;->R()I

    move-result p1

    iget v0, p0, LI8/F;->u:I

    if-le p1, v0, :cond_61

    iget-wide v0, p0, LI8/F;->y:J

    const-wide/16 v3, 0x1

    add-long v6, v0, v3

    iget-wide v8, p0, LI8/F;->z:J

    invoke-direct {p0}, LI8/F;->M()J

    move-result-wide v10

    invoke-direct {p0}, LI8/F;->Q()J

    move-result-wide v12

    move-object v5, p0

    invoke-direct/range {v5 .. v13}, LI8/F;->Y(JJJJ)V

    :cond_61
    return v2
.end method

.method private final V(Ljava/lang/Object;)Z
    .registers 8

    iget v0, p0, LI8/F;->u:I

    const/4 v1, 0x1

    if-nez v0, :cond_6

    return v1

    :cond_6
    invoke-direct {p0, p1}, LI8/F;->K(Ljava/lang/Object;)V

    iget p1, p0, LI8/F;->A:I

    add-int/2addr p1, v1

    iput p1, p0, LI8/F;->A:I

    iget v0, p0, LI8/F;->u:I

    if-le p1, v0, :cond_15

    invoke-direct {p0}, LI8/F;->H()V

    :cond_15
    invoke-direct {p0}, LI8/F;->N()J

    move-result-wide v2

    iget p1, p0, LI8/F;->A:I

    int-to-long v4, p1

    add-long/2addr v2, v4

    iput-wide v2, p0, LI8/F;->z:J

    return v1
.end method

.method private final W(LI8/H;)J
    .registers 8

    iget-wide v0, p1, LI8/H;->a:J

    invoke-direct {p0}, LI8/F;->M()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_b

    goto :goto_20

    :cond_b
    iget p1, p0, LI8/F;->v:I

    const-wide/16 v2, -0x1

    if-lez p1, :cond_12

    return-wide v2

    :cond_12
    invoke-direct {p0}, LI8/F;->N()J

    move-result-wide v4

    cmp-long p1, v0, v4

    if-lez p1, :cond_1b

    return-wide v2

    :cond_1b
    iget p0, p0, LI8/F;->B:I

    if-nez p0, :cond_20

    return-wide v2

    :cond_20
    :goto_20
    return-wide v0
.end method

.method private final X(LI8/H;)Ljava/lang/Object;
    .registers 10

    sget-object v0, LJ8/c;->a:[Lm8/e;

    monitor-enter p0

    :try_start_3
    invoke-direct {p0, p1}, LI8/F;->W(LI8/H;)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-gez v3, :cond_12

    sget-object p1, LI8/G;->a:LK8/D;

    goto :goto_24

    :catchall_10
    move-exception p1

    goto :goto_3c

    :cond_12
    iget-wide v3, p1, LI8/H;->a:J

    invoke-direct {p0, v1, v2}, LI8/F;->P(J)Ljava/lang/Object;

    move-result-object v0

    const-wide/16 v5, 0x1

    add-long/2addr v1, v5

    iput-wide v1, p1, LI8/H;->a:J

    invoke-virtual {p0, v3, v4}, LI8/F;->Z(J)[Lm8/e;

    move-result-object p1
    :try_end_21
    .catchall {:try_start_3 .. :try_end_21} :catchall_10

    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_24
    monitor-exit p0

    array-length p0, v0

    const/4 v1, 0x0

    :goto_27
    if-ge v1, p0, :cond_3b

    aget-object v2, v0, v1

    if-eqz v2, :cond_38

    sget-object v3, Lh8/q;->r:Lh8/q$a;

    sget-object v3, Lh8/A;->a:Lh8/A;

    invoke-static {v3}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v3}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_38
    add-int/lit8 v1, v1, 0x1

    goto :goto_27

    :cond_3b
    return-object p1

    :goto_3c
    monitor-exit p0

    throw p1
.end method

.method private final Y(JJJJ)V
    .registers 15

    invoke-static {p3, p4, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-direct {p0}, LI8/F;->N()J

    move-result-wide v2

    :goto_8
    cmp-long v4, v2, v0

    if-gez v4, :cond_19

    iget-object v4, p0, LI8/F;->x:[Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 v5, 0x0

    invoke-static {v4, v2, v3, v5}, LI8/G;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    goto :goto_8

    :cond_19
    iput-wide p1, p0, LI8/F;->y:J

    iput-wide p3, p0, LI8/F;->z:J

    sub-long p1, p5, v0

    long-to-int p1, p1

    iput p1, p0, LI8/F;->A:I

    sub-long/2addr p7, p5

    long-to-int p1, p7

    iput p1, p0, LI8/F;->B:I

    return-void
.end method

.method public static final synthetic q(LI8/F;LI8/F$a;)V
    .registers 2

    invoke-direct {p0, p1}, LI8/F;->B(LI8/F$a;)V

    return-void
.end method

.method public static final synthetic r(LI8/F;Ljava/lang/Object;)V
    .registers 2

    invoke-direct {p0, p1}, LI8/F;->K(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic s(LI8/F;[Lm8/e;)[Lm8/e;
    .registers 2

    invoke-direct {p0, p1}, LI8/F;->L([Lm8/e;)[Lm8/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t(LI8/F;)I
    .registers 1

    iget p0, p0, LI8/F;->v:I

    return p0
.end method

.method public static final synthetic u(LI8/F;)J
    .registers 3

    invoke-direct {p0}, LI8/F;->N()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic v(LI8/F;)I
    .registers 1

    iget p0, p0, LI8/F;->B:I

    return p0
.end method

.method public static final synthetic w(LI8/F;)I
    .registers 1

    invoke-direct {p0}, LI8/F;->S()I

    move-result p0

    return p0
.end method

.method public static final synthetic x(LI8/F;I)V
    .registers 2

    iput p1, p0, LI8/F;->B:I

    return-void
.end method

.method public static final synthetic y(LI8/F;Ljava/lang/Object;)Z
    .registers 2

    invoke-direct {p0, p1}, LI8/F;->U(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic z(LI8/F;LI8/H;)J
    .registers 2

    invoke-direct {p0, p1}, LI8/F;->W(LI8/H;)J

    move-result-wide p0

    return-wide p0
.end method


# virtual methods
.method protected F()LI8/H;
    .registers 1

    new-instance p0, LI8/H;

    invoke-direct {p0}, LI8/H;-><init>()V

    return-object p0
.end method

.method protected G(I)[LI8/H;
    .registers 2

    new-array p0, p1, [LI8/H;

    return-object p0
.end method

.method protected final O()Ljava/lang/Object;
    .registers 6

    iget-object v0, p0, LI8/F;->x:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-wide v1, p0, LI8/F;->y:J

    invoke-direct {p0}, LI8/F;->R()I

    move-result p0

    int-to-long v3, p0

    add-long/2addr v1, v3

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    invoke-static {v0, v1, v2}, LI8/G;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final Z(J)[Lm8/e;
    .registers 24

    move-object/from16 v0, p0

    iget-wide v1, v0, LI8/F;->z:J

    cmp-long v1, p1, v1

    if-lez v1, :cond_b

    sget-object v0, LJ8/c;->a:[Lm8/e;

    return-object v0

    :cond_b
    invoke-direct {v0}, LI8/F;->N()J

    move-result-wide v1

    iget v3, v0, LI8/F;->A:I

    int-to-long v3, v3

    add-long/2addr v3, v1

    iget v5, v0, LI8/F;->v:I

    const-wide/16 v6, 0x1

    if-nez v5, :cond_1e

    iget v5, v0, LI8/F;->B:I

    if-lez v5, :cond_1e

    add-long/2addr v3, v6

    :cond_1e
    invoke-static {v0}, LJ8/b;->f(LJ8/b;)I

    move-result v5

    if-eqz v5, :cond_44

    invoke-static {v0}, LJ8/b;->i(LJ8/b;)[LJ8/d;

    move-result-object v5

    if-eqz v5, :cond_44

    array-length v8, v5

    const/4 v10, 0x0

    :goto_2c
    if-ge v10, v8, :cond_44

    aget-object v11, v5, v10

    if-eqz v11, :cond_41

    check-cast v11, LI8/H;

    iget-wide v11, v11, LI8/H;->a:J

    const-wide/16 v13, 0x0

    cmp-long v13, v11, v13

    if-ltz v13, :cond_41

    cmp-long v13, v11, v3

    if-gez v13, :cond_41

    move-wide v3, v11

    :cond_41
    add-int/lit8 v10, v10, 0x1

    goto :goto_2c

    :cond_44
    iget-wide v10, v0, LI8/F;->z:J

    cmp-long v5, v3, v10

    if-gtz v5, :cond_4d

    sget-object v0, LJ8/c;->a:[Lm8/e;

    return-object v0

    :cond_4d
    invoke-direct {v0}, LI8/F;->M()J

    move-result-wide v10

    invoke-virtual {v0}, LJ8/b;->o()I

    move-result v5

    if-lez v5, :cond_64

    sub-long v12, v10, v3

    long-to-int v5, v12

    iget v8, v0, LI8/F;->B:I

    iget v12, v0, LI8/F;->v:I

    sub-int/2addr v12, v5

    invoke-static {v8, v12}, Ljava/lang/Math;->min(II)I

    move-result v5

    goto :goto_66

    :cond_64
    iget v5, v0, LI8/F;->B:I

    :goto_66
    sget-object v8, LJ8/c;->a:[Lm8/e;

    iget v12, v0, LI8/F;->B:I

    int-to-long v12, v12

    add-long/2addr v12, v10

    if-lez v5, :cond_b7

    new-array v8, v5, [Lm8/e;

    iget-object v14, v0, LI8/F;->x:[Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    move-wide/from16 p1, v6

    move-wide v6, v10

    const/4 v15, 0x0

    :goto_79
    cmp-long v16, v10, v12

    if-gez v16, :cond_b1

    invoke-static {v14, v10, v11}, LI8/G;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v9

    move-wide/from16 v17, v1

    sget-object v1, LI8/G;->a:LK8/D;

    if-eq v9, v1, :cond_a8

    const-string v2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter"

    invoke-static {v9, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, LI8/F$a;

    add-int/lit8 v2, v15, 0x1

    move-wide/from16 v19, v3

    iget-object v3, v9, LI8/F$a;->t:Lm8/e;

    aput-object v3, v8, v15

    invoke-static {v14, v10, v11, v1}, LI8/G;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    iget-object v1, v9, LI8/F$a;->s:Ljava/lang/Object;

    invoke-static {v14, v6, v7, v1}, LI8/G;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    add-long v3, v6, p1

    if-ge v2, v5, :cond_a5

    move v15, v2

    move-wide v6, v3

    goto :goto_aa

    :cond_a5
    move-wide v10, v3

    :goto_a6
    move-object v9, v8

    goto :goto_be

    :cond_a8
    move-wide/from16 v19, v3

    :goto_aa
    add-long v10, v10, p1

    move-wide/from16 v1, v17

    move-wide/from16 v3, v19

    goto :goto_79

    :cond_b1
    move-wide/from16 v17, v1

    move-wide/from16 v19, v3

    move-wide v10, v6

    goto :goto_a6

    :cond_b7
    move-wide/from16 v17, v1

    move-wide/from16 v19, v3

    move-wide/from16 p1, v6

    goto :goto_a6

    :goto_be
    sub-long v1, v10, v17

    long-to-int v1, v1

    invoke-virtual {v0}, LJ8/b;->o()I

    move-result v2

    if-nez v2, :cond_c9

    move-wide v3, v10

    goto :goto_cb

    :cond_c9
    move-wide/from16 v3, v19

    :goto_cb
    iget-wide v5, v0, LI8/F;->y:J

    iget v2, v0, LI8/F;->u:I

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    int-to-long v1, v1

    sub-long v1, v10, v1

    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    iget v5, v0, LI8/F;->v:I

    if-nez v5, :cond_f7

    cmp-long v5, v1, v12

    if-gez v5, :cond_f7

    iget-object v5, v0, LI8/F;->x:[Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {v5, v1, v2}, LI8/G;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, LI8/G;->a:LK8/D;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_f7

    add-long v10, v10, p1

    add-long v1, v1, p1

    :cond_f7
    move-wide v5, v10

    move-wide v7, v12

    invoke-direct/range {v0 .. v8}, LI8/F;->Y(JJJJ)V

    invoke-direct {v0}, LI8/F;->C()V

    array-length v1, v9

    if-nez v1, :cond_106

    const/4 v1, 0x1

    move/from16 v16, v1

    goto :goto_108

    :cond_106
    const/16 v16, 0x0

    :goto_108
    if-nez v16, :cond_10f

    invoke-direct {v0, v9}, LI8/F;->L([Lm8/e;)[Lm8/e;

    move-result-object v0

    return-object v0

    :cond_10f
    return-object v9
.end method

.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, LI8/F;->D(LI8/F;LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final a0()J
    .registers 5

    iget-wide v0, p0, LI8/F;->y:J

    iget-wide v2, p0, LI8/F;->z:J

    cmp-long v2, v0, v2

    if-gez v2, :cond_a

    iput-wide v0, p0, LI8/F;->z:J

    :cond_a
    return-wide v0
.end method

.method public b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, LI8/F;->I(LI8/F;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public c()Ljava/util/List;
    .registers 9

    monitor-enter p0

    :try_start_1
    invoke-direct {p0}, LI8/F;->R()I

    move-result v0

    if-nez v0, :cond_f

    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object v0
    :try_end_b
    .catchall {:try_start_1 .. :try_end_b} :catchall_d

    monitor-exit p0

    return-object v0

    :catchall_d
    move-exception v0

    goto :goto_2c

    :cond_f
    :try_start_f
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, p0, LI8/F;->x:[Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 v3, 0x0

    :goto_1a
    if-ge v3, v0, :cond_2a

    iget-wide v4, p0, LI8/F;->y:J

    int-to-long v6, v3

    add-long/2addr v4, v6

    invoke-static {v2, v4, v5}, LI8/G;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_27
    .catchall {:try_start_f .. :try_end_27} :catchall_d

    add-int/lit8 v3, v3, 0x1

    goto :goto_1a

    :cond_2a
    monitor-exit p0

    return-object v1

    :goto_2c
    monitor-exit p0

    throw v0
.end method

.method public e(Lm8/i;ILH8/a;)LI8/f;
    .registers 4

    invoke-static {p0, p1, p2, p3}, LI8/G;->e(LI8/E;Lm8/i;ILH8/a;)LI8/f;

    move-result-object p0

    return-object p0
.end method

.method public g()V
    .registers 11

    monitor-enter p0

    :try_start_1
    invoke-direct {p0}, LI8/F;->M()J

    move-result-wide v2

    iget-wide v4, p0, LI8/F;->z:J

    invoke-direct {p0}, LI8/F;->M()J

    move-result-wide v6

    invoke-direct {p0}, LI8/F;->Q()J

    move-result-wide v8
    :try_end_f
    .catchall {:try_start_1 .. :try_end_f} :catchall_1a

    move-object v1, p0

    :try_start_10
    invoke-direct/range {v1 .. v9}, LI8/F;->Y(JJJJ)V

    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_15
    .catchall {:try_start_10 .. :try_end_15} :catchall_17

    monitor-exit v1

    return-void

    :catchall_17
    move-exception v0

    :goto_18
    move-object p0, v0

    goto :goto_1d

    :catchall_1a
    move-exception v0

    move-object v1, p0

    goto :goto_18

    :goto_1d
    monitor-exit v1

    throw p0
.end method

.method public h(Ljava/lang/Object;)Z
    .registers 7

    const/4 v0, 0x1

    sget-object v1, LJ8/c;->a:[Lm8/e;

    monitor-enter p0

    :try_start_4
    invoke-direct {p0, p1}, LI8/F;->U(Ljava/lang/Object;)Z

    move-result p1

    const/4 v2, 0x0

    if-eqz p1, :cond_13

    invoke-direct {p0, v1}, LI8/F;->L([Lm8/e;)[Lm8/e;

    move-result-object v1
    :try_end_f
    .catchall {:try_start_4 .. :try_end_f} :catchall_11

    move p1, v0

    goto :goto_14

    :catchall_11
    move-exception p1

    goto :goto_2a

    :cond_13
    move p1, v2

    :goto_14
    monitor-exit p0

    array-length p0, v1

    :goto_16
    if-ge v2, p0, :cond_29

    aget-object v3, v1, v2

    if-eqz v3, :cond_27

    sget-object v4, Lh8/q;->r:Lh8/q$a;

    sget-object v4, Lh8/A;->a:Lh8/A;

    invoke-static {v4}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_27
    add-int/2addr v2, v0

    goto :goto_16

    :cond_29
    return p1

    :goto_2a
    monitor-exit p0

    throw p1
.end method

.method public bridge synthetic k()LJ8/d;
    .registers 1

    invoke-virtual {p0}, LI8/F;->F()LI8/H;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic m(I)[LJ8/d;
    .registers 2

    invoke-virtual {p0, p1}, LI8/F;->G(I)[LI8/H;

    move-result-object p0

    return-object p0
.end method
