.class final LH8/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH8/i;
.implements LF8/c1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private q:Ljava/lang/Object;

.field private r:LF8/n;

.field final synthetic s:LH8/e;


# direct methods
.method public constructor <init>(LH8/e;)V
    .registers 2

    iput-object p1, p0, LH8/e$a;->s:LH8/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LH8/f;->m()LK8/D;

    move-result-object p1

    iput-object p1, p0, LH8/e$a;->q:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic c(LH8/e$a;)V
    .registers 1

    invoke-direct {p0}, LH8/e$a;->h()V

    return-void
.end method

.method public static final synthetic d(LH8/e$a;LF8/n;)V
    .registers 2

    iput-object p1, p0, LH8/e$a;->r:LF8/n;

    return-void
.end method

.method public static final synthetic e(LH8/e$a;Ljava/lang/Object;)V
    .registers 2

    iput-object p1, p0, LH8/e$a;->q:Ljava/lang/Object;

    return-void
.end method

.method private final f(LH8/l;IJLm8/e;)Ljava/lang/Object;
    .registers 15

    iget-object v0, p0, LH8/e$a;->s:LH8/e;

    invoke-static {p5}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    invoke-static {v1}, LF8/p;->b(Lm8/e;)LF8/n;

    move-result-object v6

    :try_start_a
    invoke-static {p0, v6}, LH8/e$a;->d(LH8/e$a;LF8/n;)V

    move-object v5, p0

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    invoke-static/range {v0 .. v5}, LH8/e;->I(LH8/e;LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LH8/f;->r()LK8/D;

    move-result-object p1

    if-ne p0, p1, :cond_24

    invoke-static {v0, v5, v1, v2}, LH8/e;->D(LH8/e;LF8/c1;LH8/l;I)V

    goto/16 :goto_ce

    :catchall_20
    move-exception v0

    move-object p0, v0

    goto/16 :goto_dc

    :cond_24
    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-ne p0, p1, :cond_b8

    invoke-virtual {v0}, LH8/e;->o0()J

    move-result-wide p0

    cmp-long p0, v3, p0

    if-gez p0, :cond_37

    invoke-virtual {v1}, LK8/b;->b()V

    :cond_37
    invoke-static {}, LH8/e;->t()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LH8/l;

    :goto_41
    invoke-virtual {v0}, LH8/e;->w0()Z

    move-result p1

    if-eqz p1, :cond_4c

    invoke-static {v5}, LH8/e$a;->c(LH8/e$a;)V

    goto/16 :goto_ce

    :cond_4c
    invoke-static {}, LH8/e;->u()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v3

    sget p1, LH8/f;->b:I

    int-to-long v1, p1

    div-long v1, v3, v1

    int-to-long v7, p1

    rem-long v7, v3, v7

    long-to-int p1, v7

    iget-wide v7, p0, LK8/A;->s:J

    cmp-long p4, v7, v1

    if-eqz p4, :cond_6d

    invoke-static {v0, v1, v2, p0}, LH8/e;->o(LH8/e;JLH8/l;)LH8/l;

    move-result-object p4

    if-nez p4, :cond_6a

    goto :goto_41

    :cond_6a
    move-object v1, p4

    :goto_6b
    move v2, p1

    goto :goto_6f

    :cond_6d
    move-object v1, p0

    goto :goto_6b

    :goto_6f
    invoke-static/range {v0 .. v5}, LH8/e;->I(LH8/e;LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object p4, v1

    invoke-static {}, LH8/f;->r()LK8/D;

    move-result-object p1

    if-ne p0, p1, :cond_7e

    invoke-static {v0, v5, p4, v2}, LH8/e;->D(LH8/e;LF8/c1;LH8/l;I)V

    goto :goto_ce

    :cond_7e
    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object p1

    if-ne p0, p1, :cond_91

    invoke-virtual {v0}, LH8/e;->o0()J

    move-result-wide p0

    cmp-long p0, v3, p0

    if-gez p0, :cond_8f

    invoke-virtual {p4}, LK8/b;->b()V

    :cond_8f
    move-object p0, p4

    goto :goto_41

    :cond_91
    invoke-static {}, LH8/f;->s()LK8/D;

    move-result-object p1

    if-eq p0, p1, :cond_b0

    invoke-virtual {p4}, LK8/b;->b()V

    invoke-static {v5, p0}, LH8/e$a;->e(LH8/e$a;Ljava/lang/Object;)V

    invoke-static {v5, p3}, LH8/e$a;->d(LH8/e$a;LF8/n;)V

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, v0, LH8/e;->r:Lv8/l;

    if-eqz p2, :cond_ac

    invoke-static {v0, p2, p0}, LH8/e;->k(LH8/e;Lv8/l;Ljava/lang/Object;)Lv8/q;

    move-result-object p3

    :cond_ac
    :goto_ac
    invoke-virtual {v6, p1, p3}, LF8/n;->m(Ljava/lang/Object;Lv8/q;)V

    goto :goto_ce

    :cond_b0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unexpected"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b8
    invoke-virtual {v1}, LK8/b;->b()V

    invoke-static {v5, p0}, LH8/e$a;->e(LH8/e$a;Ljava/lang/Object;)V

    invoke-static {v5, p3}, LH8/e$a;->d(LH8/e$a;LF8/n;)V

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, v0, LH8/e;->r:Lv8/l;

    if-eqz p2, :cond_ac

    invoke-static {v0, p2, p0}, LH8/e;->k(LH8/e;Lv8/l;Ljava/lang/Object;)Lv8/q;

    move-result-object p3
    :try_end_cd
    .catchall {:try_start_a .. :try_end_cd} :catchall_20

    goto :goto_ac

    :goto_ce
    invoke-virtual {v6}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_db

    invoke-static {p5}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_db
    return-object p0

    :goto_dc
    invoke-virtual {v6}, LF8/n;->P()V

    throw p0
.end method

.method private final g()Z
    .registers 2

    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v0

    iput-object v0, p0, LH8/e$a;->q:Ljava/lang/Object;

    iget-object p0, p0, LH8/e$a;->s:LH8/e;

    invoke-virtual {p0}, LH8/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_10

    const/4 p0, 0x0

    return p0

    :cond_10
    invoke-static {p0}, LK8/C;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method

.method private final h()V
    .registers 3

    iget-object v0, p0, LH8/e$a;->r:LF8/n;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, LH8/e$a;->r:LF8/n;

    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v1

    iput-object v1, p0, LH8/e$a;->q:Ljava/lang/Object;

    iget-object p0, p0, LH8/e$a;->s:LH8/e;

    invoke-virtual {p0}, LH8/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_22

    sget-object p0, Lh8/q;->r:Lh8/q$a;

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_22
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lm8/e;)Ljava/lang/Object;
    .registers 12

    iget-object v0, p0, LH8/e$a;->q:Ljava/lang/Object;

    invoke-static {}, LH8/f;->m()LK8/D;

    move-result-object v1

    const/4 v2, 0x1

    if-eq v0, v1, :cond_13

    iget-object v0, p0, LH8/e$a;->q:Ljava/lang/Object;

    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v1

    if-eq v0, v1, :cond_13

    goto/16 :goto_7f

    :cond_13
    iget-object v3, p0, LH8/e$a;->s:LH8/e;

    invoke-static {}, LH8/e;->t()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LH8/l;

    :goto_1f
    invoke-virtual {v3}, LH8/e;->w0()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-direct {p0}, LH8/e$a;->g()Z

    move-result v2

    goto :goto_7f

    :cond_2a
    invoke-static {}, LH8/e;->u()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide v6

    sget v1, LH8/f;->b:I

    int-to-long v4, v1

    div-long v4, v6, v4

    int-to-long v8, v1

    rem-long v8, v6, v8

    long-to-int v1, v8

    iget-wide v8, v0, LK8/A;->s:J

    cmp-long v8, v8, v4

    if-eqz v8, :cond_48

    invoke-static {v3, v4, v5, v0}, LH8/e;->o(LH8/e;JLH8/l;)LH8/l;

    move-result-object v4

    if-nez v4, :cond_49

    goto :goto_1f

    :cond_48
    move-object v4, v0

    :cond_49
    const/4 v8, 0x0

    move v5, v1

    invoke-static/range {v3 .. v8}, LH8/e;->I(LH8/e;LH8/l;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LH8/f;->r()LK8/D;

    move-result-object v1

    if-eq v0, v1, :cond_84

    invoke-static {}, LH8/f;->h()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_68

    invoke-virtual {v3}, LH8/e;->o0()J

    move-result-wide v0

    cmp-long v0, v6, v0

    if-gez v0, :cond_66

    invoke-virtual {v4}, LK8/b;->b()V

    :cond_66
    move-object v0, v4

    goto :goto_1f

    :cond_68
    invoke-static {}, LH8/f;->s()LK8/D;

    move-result-object v1

    if-ne v0, v1, :cond_78

    move-object v9, p1

    move-wide v7, v6

    move v6, v5

    move-object v5, v4

    move-object v4, p0

    invoke-direct/range {v4 .. v9}, LH8/e$a;->f(LH8/l;IJLm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_78
    move-object v5, v4

    move-object v4, p0

    invoke-virtual {v5}, LK8/b;->b()V

    iput-object v0, v4, LH8/e$a;->q:Ljava/lang/Object;

    :goto_7f
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_84
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unreachable"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public b(LK8/A;I)V
    .registers 3

    iget-object p0, p0, LH8/e$a;->r:LF8/n;

    if-eqz p0, :cond_7

    invoke-virtual {p0, p1, p2}, LF8/n;->b(LK8/A;I)V

    :cond_7
    return-void
.end method

.method public final i(Ljava/lang/Object;)Z
    .registers 6

    iget-object v0, p0, LH8/e$a;->r:LF8/n;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, LH8/e$a;->r:LF8/n;

    iput-object p1, p0, LH8/e$a;->q:Ljava/lang/Object;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object p0, p0, LH8/e$a;->s:LH8/e;

    iget-object v3, p0, LH8/e;->r:Lv8/l;

    if-eqz v3, :cond_16

    invoke-static {p0, v3, p1}, LH8/e;->k(LH8/e;Lv8/l;Ljava/lang/Object;)Lv8/q;

    move-result-object v1

    :cond_16
    invoke-static {v0, v2, v1}, LH8/f;->u(LF8/l;Ljava/lang/Object;Lv8/q;)Z

    move-result p0

    return p0
.end method

.method public final j()V
    .registers 3

    iget-object v0, p0, LH8/e$a;->r:LF8/n;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, LH8/e$a;->r:LF8/n;

    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v1

    iput-object v1, p0, LH8/e$a;->q:Ljava/lang/Object;

    iget-object p0, p0, LH8/e$a;->s:LH8/e;

    invoke-virtual {p0}, LH8/e;->e0()Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_22

    sget-object p0, Lh8/q;->r:Lh8/q$a;

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_22
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v0, p0}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public next()Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, LH8/e$a;->q:Ljava/lang/Object;

    invoke-static {}, LH8/f;->m()LK8/D;

    move-result-object v1

    if-eq v0, v1, :cond_20

    invoke-static {}, LH8/f;->m()LK8/D;

    move-result-object v1

    iput-object v1, p0, LH8/e$a;->q:Ljava/lang/Object;

    invoke-static {}, LH8/f;->z()LK8/D;

    move-result-object v1

    if-eq v0, v1, :cond_15

    return-object v0

    :cond_15
    iget-object p0, p0, LH8/e$a;->s:LH8/e;

    invoke-static {p0}, LH8/e;->r(LH8/e;)Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, LK8/C;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0

    :cond_20
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "`hasNext()` has not been invoked"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
