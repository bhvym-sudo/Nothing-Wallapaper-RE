.class final LJ8/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm8/e;
.implements Lkotlin/coroutines/jvm/internal/e;


# instance fields
.field private final q:Lm8/e;

.field private final r:Lm8/i;


# direct methods
.method public constructor <init>(Lm8/e;Lm8/i;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ8/A;->q:Lm8/e;

    iput-object p2, p0, LJ8/A;->r:Lm8/i;

    return-void
.end method


# virtual methods
.method public getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .registers 2

    iget-object p0, p0, LJ8/A;->q:Lm8/e;

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

    iget-object p0, p0, LJ8/A;->r:Lm8/i;

    return-object p0
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .registers 2

    iget-object p0, p0, LJ8/A;->q:Lm8/e;

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
