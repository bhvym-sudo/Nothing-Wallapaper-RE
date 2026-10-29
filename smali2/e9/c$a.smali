.class final Le9/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Le9/c$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Le9/c$a;Le9/c;JZ)V
    .registers 5

    invoke-direct {p0, p1, p2, p3, p4}, Le9/c$a;->f(Le9/c;JZ)V

    return-void
.end method

.method public static final synthetic b(Le9/c$a;Le9/c;)V
    .registers 2

    invoke-direct {p0, p1}, Le9/c$a;->g(Le9/c;)V

    return-void
.end method

.method private final f(Le9/c;JZ)V
    .registers 9

    invoke-static {}, Le9/c;->k()Le9/c;

    move-result-object v0

    if-nez v0, :cond_16

    new-instance v0, Le9/c;

    invoke-direct {v0}, Le9/c;-><init>()V

    invoke-static {v0}, Le9/c;->r(Le9/c;)V

    new-instance v0, Le9/c$b;

    invoke-direct {v0}, Le9/c$b;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_16
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, p2, v2

    if-eqz v2, :cond_30

    if-eqz p4, :cond_30

    invoke-virtual {p1}, Le9/C;->c()J

    move-result-wide v2

    sub-long/2addr v2, v0

    invoke-static {p2, p3, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, Le9/c;->u(Le9/c;J)V

    goto :goto_40

    :cond_30
    if-eqz v2, :cond_37

    add-long/2addr p2, v0

    invoke-static {p1, p2, p3}, Le9/c;->u(Le9/c;J)V

    goto :goto_40

    :cond_37
    if-eqz p4, :cond_81

    invoke-virtual {p1}, Le9/C;->c()J

    move-result-wide p2

    invoke-static {p1, p2, p3}, Le9/c;->u(Le9/c;J)V

    :goto_40
    invoke-static {p1, v0, v1}, Le9/c;->q(Le9/c;J)J

    move-result-wide p2

    invoke-static {}, Le9/c;->k()Le9/c;

    move-result-object p4

    invoke-static {p4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    :goto_4b
    invoke-static {p4}, Le9/c;->o(Le9/c;)Le9/c;

    move-result-object v2

    if-eqz v2, :cond_69

    invoke-static {p4}, Le9/c;->o(Le9/c;)Le9/c;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {v2, v0, v1}, Le9/c;->q(Le9/c;J)J

    move-result-wide v2

    cmp-long v2, p2, v2

    if-gez v2, :cond_61

    goto :goto_69

    :cond_61
    invoke-static {p4}, Le9/c;->o(Le9/c;)Le9/c;

    move-result-object p4

    invoke-static {p4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    goto :goto_4b

    :cond_69
    :goto_69
    invoke-static {p4}, Le9/c;->o(Le9/c;)Le9/c;

    move-result-object p2

    invoke-static {p1, p2}, Le9/c;->s(Le9/c;Le9/c;)V

    invoke-static {p4, p1}, Le9/c;->s(Le9/c;Le9/c;)V

    invoke-static {}, Le9/c;->k()Le9/c;

    move-result-object p1

    if-ne p4, p1, :cond_80

    invoke-virtual {p0}, Le9/c$a;->d()Ljava/util/concurrent/locks/Condition;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/concurrent/locks/Condition;->signal()V

    :cond_80
    return-void

    :cond_81
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method private final g(Le9/c;)V
    .registers 3

    invoke-static {}, Le9/c;->k()Le9/c;

    move-result-object p0

    :goto_4
    if-eqz p0, :cond_1d

    invoke-static {p0}, Le9/c;->o(Le9/c;)Le9/c;

    move-result-object v0

    if-ne v0, p1, :cond_18

    invoke-static {p1}, Le9/c;->o(Le9/c;)Le9/c;

    move-result-object v0

    invoke-static {p0, v0}, Le9/c;->s(Le9/c;Le9/c;)V

    const/4 p0, 0x0

    invoke-static {p1, p0}, Le9/c;->s(Le9/c;Le9/c;)V

    return-void

    :cond_18
    invoke-static {p0}, Le9/c;->o(Le9/c;)Le9/c;

    move-result-object p0

    goto :goto_4

    :cond_1d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "node was not found in the queue"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final c()Le9/c;
    .registers 7

    invoke-static {}, Le9/c;->k()Le9/c;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {v0}, Le9/c;->o(Le9/c;)Le9/c;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_3f

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-virtual {p0}, Le9/c$a;->d()Ljava/util/concurrent/locks/Condition;

    move-result-object p0

    invoke-static {}, Le9/c;->l()J

    move-result-wide v4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, v4, v5, v0}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    invoke-static {}, Le9/c;->k()Le9/c;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p0}, Le9/c;->o(Le9/c;)Le9/c;

    move-result-object p0

    if-nez p0, :cond_3e

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long/2addr v4, v2

    invoke-static {}, Le9/c;->m()J

    move-result-wide v2

    cmp-long p0, v4, v2

    if-ltz p0, :cond_3e

    invoke-static {}, Le9/c;->k()Le9/c;

    move-result-object p0

    return-object p0

    :cond_3e
    return-object v1

    :cond_3f
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Le9/c;->q(Le9/c;J)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-lez v4, :cond_57

    invoke-virtual {p0}, Le9/c$a;->d()Ljava/util/concurrent/locks/Condition;

    move-result-object p0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, v2, v3, v0}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    return-object v1

    :cond_57
    invoke-static {}, Le9/c;->k()Le9/c;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {v0}, Le9/c;->o(Le9/c;)Le9/c;

    move-result-object v2

    invoke-static {p0, v2}, Le9/c;->s(Le9/c;Le9/c;)V

    invoke-static {v0, v1}, Le9/c;->s(Le9/c;Le9/c;)V

    const/4 p0, 0x2

    invoke-static {v0, p0}, Le9/c;->t(Le9/c;I)V

    return-object v0
.end method

.method public final d()Ljava/util/concurrent/locks/Condition;
    .registers 1

    invoke-static {}, Le9/c;->j()Ljava/util/concurrent/locks/Condition;

    move-result-object p0

    return-object p0
.end method

.method public final e()Ljava/util/concurrent/locks/ReentrantLock;
    .registers 1

    invoke-static {}, Le9/c;->n()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object p0

    return-object p0
.end method
