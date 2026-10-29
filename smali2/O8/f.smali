.class public LO8/f;
.super LO8/i;
.source "SourceFile"

# interfaces
.implements LO8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO8/f$a;
    }
.end annotation


# static fields
.field private static final synthetic i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private final h:Lv8/q;

.field private volatile synthetic owner$volatile:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "owner$volatile"

    const-class v2, LO8/f;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LO8/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Z)V
    .registers 3

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, LO8/i;-><init>(II)V

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    goto :goto_c

    :cond_8
    invoke-static {}, LO8/g;->c()LK8/D;

    move-result-object p1

    :goto_c
    iput-object p1, p0, LO8/f;->owner$volatile:Ljava/lang/Object;

    new-instance p1, LO8/b;

    invoke-direct {p1, p0}, LO8/b;-><init>(LO8/f;)V

    iput-object p1, p0, LO8/f;->h:Lv8/q;

    return-void
.end method

.method private final A(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 5

    invoke-static {p2}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v0

    invoke-static {v0}, LF8/p;->b(Lm8/e;)LF8/n;

    move-result-object v0

    :try_start_8
    new-instance v1, LO8/f$a;

    invoke-direct {v1, p0, v0, p1}, LO8/f$a;-><init>(LO8/f;LF8/n;Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, LO8/i;->e(LF8/l;)V
    :try_end_10
    .catchall {:try_start_8 .. :try_end_10} :catchall_27

    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1d

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_1d
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_24

    return-object p0

    :cond_24
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :catchall_27
    move-exception p0

    invoke-virtual {v0}, LF8/n;->P()V

    throw p0
.end method

.method private static final B(LO8/f;LN8/k;Ljava/lang/Object;Ljava/lang/Object;)Lv8/q;
    .registers 4

    new-instance p1, LO8/c;

    invoke-direct {p1, p0, p2}, LO8/c;-><init>(LO8/f;Ljava/lang/Object;)V

    return-object p1
.end method

.method private static final C(LO8/f;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;
    .registers 5

    invoke-virtual {p0, p1}, LO8/f;->b(Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final D(Ljava/lang/Object;)I
    .registers 5

    :goto_0
    invoke-virtual {p0}, LO8/i;->q()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LO8/f;->w()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p0, 0x0

    return p0

    :cond_f
    const/4 v0, 0x1

    if-nez p1, :cond_13

    return v0

    :cond_13
    invoke-direct {p0, p1}, LO8/f;->x(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v0, :cond_1e

    if-eq v1, v2, :cond_1d

    goto :goto_0

    :cond_1d
    return v0

    :cond_1e
    return v2
.end method

.method public static synthetic t(LO8/f;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;
    .registers 5

    invoke-static {p0, p1, p2, p3, p4}, LO8/f;->C(LO8/f;Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/Object;Lm8/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(LO8/f;LN8/k;Ljava/lang/Object;Ljava/lang/Object;)Lv8/q;
    .registers 4

    invoke-static {p0, p1, p2, p3}, LO8/f;->B(LO8/f;LN8/k;Ljava/lang/Object;Ljava/lang/Object;)Lv8/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    invoke-static {}, LO8/f;->w()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic w()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .registers 1

    sget-object v0, LO8/f;->i:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-object v0
.end method

.method private final x(Ljava/lang/Object;)I
    .registers 4

    :cond_0
    invoke-virtual {p0}, LO8/f;->y()Z

    move-result v0

    if-nez v0, :cond_8

    const/4 p0, 0x0

    return p0

    :cond_8
    invoke-static {}, LO8/f;->w()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LO8/g;->c()LK8/D;

    move-result-object v1

    if-eq v0, v1, :cond_0

    if-ne v0, p1, :cond_1a

    const/4 p0, 0x1

    return p0

    :cond_1a
    const/4 p0, 0x2

    return p0
.end method

.method static synthetic z(LO8/f;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-virtual {p0, p1}, LO8/f;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_9
    invoke-direct {p0, p1, p2}, LO8/f;->A(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_14

    return-object p0

    :cond_14
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .registers 4

    invoke-direct {p0, p1}, LO8/f;->D(Ljava/lang/Object;)I

    move-result p0

    const/4 v0, 0x1

    if-eqz p0, :cond_31

    if-eq p0, v0, :cond_2f

    const/4 v0, 0x2

    if-eq p0, v0, :cond_14

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "unexpected"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_14
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "This mutex is already locked by the specified owner: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2f
    const/4 p0, 0x0

    return p0

    :cond_31
    return v0
.end method

.method public b(Ljava/lang/Object;)V
    .registers 5

    :cond_0
    invoke-virtual {p0}, LO8/f;->y()Z

    move-result v0

    if-eqz v0, :cond_53

    invoke-static {}, LO8/f;->w()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LO8/g;->c()LK8/D;

    move-result-object v1

    if-eq v0, v1, :cond_0

    if-eq v0, p1, :cond_41

    if-nez p1, :cond_19

    goto :goto_41

    :cond_19
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "This mutex is locked by "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", but "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is expected"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_41
    :goto_41
    invoke-static {}, LO8/f;->w()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-static {}, LO8/g;->c()LK8/D;

    move-result-object v2

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LO8/i;->p()V

    return-void

    :cond_53
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "This mutex is not locked"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public c(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, LO8/f;->z(LO8/f;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Mutex@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LF8/P;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[isLocked="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LO8/f;->y()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",owner="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, LO8/f;->w()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public y()Z
    .registers 1

    invoke-virtual {p0}, LO8/i;->i()I

    move-result p0

    if-nez p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method
