.class public final Lm8/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm8/e;
.implements Lkotlin/coroutines/jvm/internal/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm8/k$a;
    }
.end annotation


# static fields
.field private static final r:Lm8/k$a;

.field private static final s:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private final q:Lm8/e;

.field private volatile result:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lm8/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm8/k$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lm8/k;->r:Lm8/k$a;

    const-class v0, Ljava/lang/Object;

    const-string v1, "result"

    const-class v2, Lm8/k;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lm8/k;->s:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lm8/e;)V
    .registers 3

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    sget-object v0, Ln8/a;->r:Ln8/a;

    invoke-direct {p0, p1, v0}, Lm8/k;-><init>(Lm8/e;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lm8/e;Ljava/lang/Object;)V
    .registers 4

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lm8/k;->q:Lm8/e;

    .line 3
    iput-object p2, p0, Lm8/k;->result:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, Lm8/k;->result:Ljava/lang/Object;

    sget-object v1, Ln8/a;->r:Ln8/a;

    if-ne v0, v1, :cond_19

    sget-object v0, Lm8/k;->s:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_17
    iget-object v0, p0, Lm8/k;->result:Ljava/lang/Object;

    :cond_19
    sget-object p0, Ln8/a;->s:Ln8/a;

    if-ne v0, p0, :cond_22

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_22
    instance-of p0, v0, Lh8/q$b;

    if-nez p0, :cond_27

    return-object v0

    :cond_27
    check-cast v0, Lh8/q$b;

    iget-object p0, v0, Lh8/q$b;->q:Ljava/lang/Throwable;

    throw p0
.end method

.method public getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .registers 2

    iget-object p0, p0, Lm8/k;->q:Lm8/e;

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/e;

    if-eqz v0, :cond_9

    check-cast p0, Lkotlin/coroutines/jvm/internal/e;

    return-object p0

    :cond_9
    const/4 p0, 0x0

    return-object p0
.end method

.method public getContext()Lm8/i;
    .registers 1

    iget-object p0, p0, Lm8/k;->q:Lm8/e;

    invoke-interface {p0}, Lm8/e;->getContext()Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .registers 5

    :cond_0
    iget-object v0, p0, Lm8/k;->result:Ljava/lang/Object;

    sget-object v1, Ln8/a;->r:Ln8/a;

    if-ne v0, v1, :cond_f

    sget-object v0, Lm8/k;->s:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_f
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_29

    sget-object v0, Lm8/k;->s:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Ln8/a;->s:Ln8/a;

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lm8/k;->q:Lm8/e;

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_29
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Already resumed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SafeContinuation for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lm8/k;->q:Lm8/e;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
