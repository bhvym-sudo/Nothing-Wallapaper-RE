.class public final LK8/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK8/q$a;,
        LK8/q$b;
    }
.end annotation


# static fields
.field public static final e:LK8/q$a;

.field private static final synthetic f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field private static final synthetic g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

.field public static final h:LK8/D;


# instance fields
.field private volatile synthetic _next$volatile:Ljava/lang/Object;

.field private volatile synthetic _state$volatile:J

.field private final a:I

.field private final b:Z

.field private final c:I

.field private final synthetic d:Ljava/util/concurrent/atomic/AtomicReferenceArray;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, LK8/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LK8/q$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LK8/q;->e:LK8/q$a;

    const-class v0, Ljava/lang/Object;

    const-string v1, "_next$volatile"

    const-class v2, LK8/q;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LK8/q;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "_state$volatile"

    invoke-static {v2, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, LK8/q;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    new-instance v0, LK8/D;

    const-string v1, "REMOVE_FROZEN"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LK8/q;->h:LK8/D;

    return-void
.end method

.method public constructor <init>(IZ)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LK8/q;->a:I

    iput-boolean p2, p0, LK8/q;->b:Z

    add-int/lit8 p2, p1, -0x1

    iput p2, p0, LK8/q;->c:I

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object v0, p0, LK8/q;->d:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const p0, 0x3fffffff    # 1.9999999f

    const-string v0, "Check failed."

    if-gt p2, p0, :cond_24

    and-int p0, p1, p2

    if-nez p0, :cond_1e

    return-void

    :cond_1e
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_24
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final b(J)LK8/q;
    .registers 9

    new-instance v0, LK8/q;

    iget v1, p0, LK8/q;->a:I

    mul-int/lit8 v1, v1, 0x2

    iget-boolean v2, p0, LK8/q;->b:Z

    invoke-direct {v0, v1, v2}, LK8/q;-><init>(IZ)V

    const-wide/32 v1, 0x3fffffff

    and-long/2addr v1, p1

    long-to-int v1, v1

    const-wide v2, 0xfffffffc0000000L

    and-long/2addr v2, p1

    const/16 v4, 0x1e

    shr-long/2addr v2, v4

    long-to-int v2, v2

    :goto_1a
    iget v3, p0, LK8/q;->c:I

    and-int v4, v1, v3

    and-int/2addr v3, v2

    if-eq v4, v3, :cond_40

    invoke-direct {p0}, LK8/q;->f()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v3

    iget v4, p0, LK8/q;->c:I

    and-int/2addr v4, v1

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_33

    new-instance v3, LK8/q$b;

    invoke-direct {v3, v1}, LK8/q$b;-><init>(I)V

    :cond_33
    invoke-direct {v0}, LK8/q;->f()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v4

    iget v5, v0, LK8/q;->c:I

    and-int/2addr v5, v1

    invoke-virtual {v4, v5, v3}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1a

    :cond_40
    invoke-static {}, LK8/q;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p0

    sget-object v1, LK8/q;->e:LK8/q$a;

    const-wide/high16 v2, 0x1000000000000000L

    invoke-virtual {v1, p1, p2, v2, v3}, LK8/q$a;->d(JJ)J

    move-result-wide p1

    invoke-virtual {p0, v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->set(Ljava/lang/Object;J)V

    return-object v0
.end method

.method private final c(J)LK8/q;
    .registers 7

    invoke-static {}, LK8/q;->h()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LK8/q;

    if-eqz v1, :cond_d

    return-object v1

    :cond_d
    invoke-static {}, LK8/q;->h()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p0, p1, p2}, LK8/q;->b(J)LK8/q;

    move-result-object v3

    invoke-virtual {v1, p0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_4
.end method

.method private final e(ILjava/lang/Object;)LK8/q;
    .registers 5

    invoke-direct {p0}, LK8/q;->f()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v0

    iget v1, p0, LK8/q;->c:I

    and-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, LK8/q$b;

    if-eqz v1, :cond_20

    check-cast v0, LK8/q$b;

    iget v0, v0, LK8/q$b;->a:I

    if-ne v0, p1, :cond_20

    invoke-direct {p0}, LK8/q;->f()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v0

    iget v1, p0, LK8/q;->c:I

    and-int/2addr p1, v1

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-object p0

    :cond_20
    const/4 p0, 0x0

    return-object p0
.end method

.method private final synthetic f()Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .registers 1

    iget-object p0, p0, LK8/q;->d:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    return-object p0
.end method

.method private static final synthetic h()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LK8/q;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private static final synthetic i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;
    .registers 1

    sget-object v0, LK8/q;->g:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-object v0
.end method

.method private final k()J
    .registers 11

    invoke-static {}, LK8/q;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide/high16 v4, 0x1000000000000000L

    and-long v6, v2, v4

    const-wide/16 v8, 0x0

    cmp-long v1, v6, v8

    if-eqz v1, :cond_13

    return-wide v2

    :cond_13
    or-long/2addr v4, v2

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p0

    if-eqz p0, :cond_1c

    return-wide v4

    :cond_1c
    move-object p0, v1

    goto :goto_4
.end method

.method private final n(II)LK8/q;
    .registers 10

    invoke-static {}, LK8/q;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p1

    :goto_4
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide/32 v0, 0x3fffffff

    and-long/2addr v0, v2

    long-to-int v6, v0

    const-wide/high16 v0, 0x1000000000000000L

    and-long/2addr v0, v2

    const-wide/16 v4, 0x0

    cmp-long v0, v0, v4

    if-eqz v0, :cond_1b

    invoke-virtual {p0}, LK8/q;->l()LK8/q;

    move-result-object p0

    return-object p0

    :cond_1b
    invoke-static {}, LK8/q;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sget-object v1, LK8/q;->e:LK8/q$a;

    invoke-virtual {v1, v2, v3, p2}, LK8/q$a;->b(JI)J

    move-result-wide v4

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p0

    if-eqz p0, :cond_38

    invoke-direct {v1}, LK8/q;->f()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object p0

    iget p1, v1, LK8/q;->c:I

    and-int/2addr p1, v6

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-object p2

    :cond_38
    move-object p0, v1

    goto :goto_4
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)I
    .registers 14

    invoke-static {}, LK8/q;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :cond_4
    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    const-wide/high16 v1, 0x3000000000000000L    # 1.727233711018889E-77

    and-long/2addr v1, v3

    const-wide/16 v7, 0x0

    cmp-long v1, v1, v7

    if-eqz v1, :cond_18

    sget-object p0, LK8/q;->e:LK8/q$a;

    invoke-virtual {p0, v3, v4}, LK8/q$a;->a(J)I

    move-result p0

    return p0

    :cond_18
    const-wide/32 v1, 0x3fffffff

    and-long/2addr v1, v3

    long-to-int v1, v1

    const-wide v5, 0xfffffffc0000000L

    and-long/2addr v5, v3

    const/16 v2, 0x1e

    shr-long/2addr v5, v2

    long-to-int v9, v5

    iget v10, p0, LK8/q;->c:I

    add-int/lit8 v2, v9, 0x2

    and-int/2addr v2, v10

    and-int v5, v1, v10

    const/4 v6, 0x1

    if-ne v2, v5, :cond_32

    return v6

    :cond_32
    iget-boolean v2, p0, LK8/q;->b:Z

    const v5, 0x3fffffff    # 1.9999999f

    if-nez v2, :cond_53

    invoke-direct {p0}, LK8/q;->f()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v2

    and-int v11, v9, v10

    invoke-virtual {v2, v11}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_53

    iget v2, p0, LK8/q;->a:I

    const/16 v3, 0x400

    if-lt v2, v3, :cond_52

    sub-int/2addr v9, v1

    and-int v1, v9, v5

    shr-int/lit8 v2, v2, 0x1

    if-le v1, v2, :cond_4

    :cond_52
    return v6

    :cond_53
    add-int/lit8 v1, v9, 0x1

    and-int/2addr v1, v5

    move v2, v1

    invoke-static {}, LK8/q;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    sget-object v5, LK8/q;->e:LK8/q$a;

    invoke-virtual {v5, v3, v4, v2}, LK8/q$a;->c(JI)J

    move-result-wide v5

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p0

    if-eqz p0, :cond_8d

    invoke-direct {v2}, LK8/q;->f()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object p0

    and-int v0, v9, v10

    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    move-object p0, v2

    :cond_72
    invoke-static {}, LK8/q;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/high16 v2, 0x1000000000000000L

    and-long/2addr v0, v2

    cmp-long v0, v0, v7

    if-eqz v0, :cond_8b

    invoke-virtual {p0}, LK8/q;->l()LK8/q;

    move-result-object p0

    invoke-direct {p0, v9, p1}, LK8/q;->e(ILjava/lang/Object;)LK8/q;

    move-result-object p0

    if-nez p0, :cond_72

    :cond_8b
    const/4 p0, 0x0

    return p0

    :cond_8d
    move-object p0, v2

    goto/16 :goto_4
.end method

.method public final d()Z
    .registers 13

    invoke-static {}, LK8/q;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v2

    const-wide/high16 v4, 0x2000000000000000L

    and-long v6, v2, v4

    const-wide/16 v8, 0x0

    cmp-long v1, v6, v8

    const/4 v6, 0x1

    if-eqz v1, :cond_14

    return v6

    :cond_14
    const-wide/high16 v10, 0x1000000000000000L

    and-long/2addr v10, v2

    cmp-long v1, v10, v8

    if-eqz v1, :cond_1d

    const/4 p0, 0x0

    return p0

    :cond_1d
    or-long/2addr v4, v2

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p0

    if-eqz p0, :cond_26

    return v6

    :cond_26
    move-object p0, v1

    goto :goto_4
.end method

.method public final g()I
    .registers 5

    invoke-static {}, LK8/q;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/32 v2, 0x3fffffff

    and-long/2addr v2, v0

    long-to-int p0, v2

    const-wide v2, 0xfffffffc0000000L

    and-long/2addr v0, v2

    const/16 v2, 0x1e

    shr-long/2addr v0, v2

    long-to-int v0, v0

    sub-int/2addr v0, p0

    const p0, 0x3fffffff    # 1.9999999f

    and-int/2addr p0, v0

    return p0
.end method

.method public final j()Z
    .registers 5

    invoke-static {}, LK8/q;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v0

    const-wide/32 v2, 0x3fffffff

    and-long/2addr v2, v0

    long-to-int p0, v2

    const-wide v2, 0xfffffffc0000000L

    and-long/2addr v0, v2

    const/16 v2, 0x1e

    shr-long/2addr v0, v2

    long-to-int v0, v0

    if-ne p0, v0, :cond_1b

    const/4 p0, 0x1

    return p0

    :cond_1b
    const/4 p0, 0x0

    return p0
.end method

.method public final l()LK8/q;
    .registers 3

    invoke-direct {p0}, LK8/q;->k()J

    move-result-wide v0

    invoke-direct {p0, v0, v1}, LK8/q;->c(J)LK8/q;

    move-result-object p0

    return-object p0
.end method

.method public final m()Ljava/lang/Object;
    .registers 12

    invoke-static {}, LK8/q;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    :cond_4
    :goto_4
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->get(Ljava/lang/Object;)J

    move-result-wide v3

    const-wide/high16 v1, 0x1000000000000000L

    and-long/2addr v1, v3

    const-wide/16 v5, 0x0

    cmp-long v1, v1, v5

    if-eqz v1, :cond_14

    sget-object p0, LK8/q;->h:LK8/D;

    return-object p0

    :cond_14
    const-wide/32 v1, 0x3fffffff

    and-long/2addr v1, v3

    long-to-int v7, v1

    const-wide v1, 0xfffffffc0000000L

    and-long/2addr v1, v3

    const/16 v5, 0x1e

    shr-long/2addr v1, v5

    long-to-int v1, v1

    iget v2, p0, LK8/q;->c:I

    and-int/2addr v1, v2

    and-int/2addr v2, v7

    const/4 v8, 0x0

    if-ne v1, v2, :cond_2b

    return-object v8

    :cond_2b
    invoke-direct {p0}, LK8/q;->f()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object v1

    iget v2, p0, LK8/q;->c:I

    and-int/2addr v2, v7

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_3d

    iget-boolean v1, p0, LK8/q;->b:Z

    if-eqz v1, :cond_4

    return-object v8

    :cond_3d
    instance-of v1, v9, LK8/q$b;

    if-eqz v1, :cond_42

    return-object v8

    :cond_42
    add-int/lit8 v1, v7, 0x1

    const v2, 0x3fffffff    # 1.9999999f

    and-int v10, v1, v2

    invoke-static {}, LK8/q;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v1

    sget-object v2, LK8/q;->e:LK8/q$a;

    invoke-virtual {v2, v3, v4, v10}, LK8/q$a;->b(JI)J

    move-result-wide v5

    move-object v2, p0

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p0

    if-eqz p0, :cond_65

    invoke-direct {v2}, LK8/q;->f()Ljava/util/concurrent/atomic/AtomicReferenceArray;

    move-result-object p0

    iget v0, v2, LK8/q;->c:I

    and-int/2addr v0, v7

    invoke-virtual {p0, v0, v8}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->set(ILjava/lang/Object;)V

    return-object v9

    :cond_65
    iget-boolean p0, v2, LK8/q;->b:Z

    if-eqz p0, :cond_71

    move-object p0, v2

    :cond_6a
    invoke-direct {p0, v7, v10}, LK8/q;->n(II)LK8/q;

    move-result-object p0

    if-nez p0, :cond_6a

    return-object v9

    :cond_71
    move-object p0, v2

    goto :goto_4
.end method
