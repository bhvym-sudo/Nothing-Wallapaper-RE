.class final Lh8/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh8/h;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh8/s$a;
    }
.end annotation


# static fields
.field public static final t:Lh8/s$a;

.field private static final u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile q:Lv8/a;

.field private volatile r:Ljava/lang/Object;

.field private final s:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lh8/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh8/s$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lh8/s;->t:Lh8/s$a;

    const-class v0, Ljava/lang/Object;

    const-string v1, "r"

    const-class v2, Lh8/s;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lh8/s;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lv8/a;)V
    .registers 3

    const-string v0, "initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/s;->q:Lv8/a;

    sget-object p1, Lh8/y;->a:Lh8/y;

    iput-object p1, p0, Lh8/s;->r:Ljava/lang/Object;

    iput-object p1, p0, Lh8/s;->s:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Z
    .registers 2

    iget-object p0, p0, Lh8/s;->r:Ljava/lang/Object;

    sget-object v0, Lh8/y;->a:Lh8/y;

    if-eq p0, v0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public getValue()Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, Lh8/s;->r:Ljava/lang/Object;

    sget-object v1, Lh8/y;->a:Lh8/y;

    if-eq v0, v1, :cond_7

    return-object v0

    :cond_7
    iget-object v0, p0, Lh8/s;->q:Lv8/a;

    if-eqz v0, :cond_1b

    invoke-interface {v0}, Lv8/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lh8/s;->u:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v2, p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1b

    const/4 v1, 0x0

    iput-object v1, p0, Lh8/s;->q:Lv8/a;

    return-object v0

    :cond_1b
    iget-object p0, p0, Lh8/s;->r:Ljava/lang/Object;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, Lh8/s;->a()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Lh8/s;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_f
    const-string p0, "Lazy value not initialized yet."

    return-object p0
.end method
