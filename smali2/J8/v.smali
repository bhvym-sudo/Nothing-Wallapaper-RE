.class public final LJ8/v;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"

# interfaces
.implements LI8/g;
.implements Lkotlin/coroutines/jvm/internal/e;


# instance fields
.field public final q:LI8/g;

.field public final r:Lm8/i;

.field public final s:I

.field private t:Lm8/i;

.field private u:Lm8/e;


# direct methods
.method public constructor <init>(LI8/g;Lm8/i;)V
    .registers 5

    sget-object v0, LJ8/r;->q:LJ8/r;

    sget-object v1, Lm8/j;->q:Lm8/j;

    invoke-direct {p0, v0, v1}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;Lm8/i;)V

    iput-object p1, p0, LJ8/v;->q:LI8/g;

    iput-object p2, p0, LJ8/v;->r:Lm8/i;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-instance v0, LJ8/u;

    invoke-direct {v0}, LJ8/u;-><init>()V

    invoke-interface {p2, p1, v0}, Lm8/i;->U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, LJ8/v;->s:I

    return-void
.end method

.method public static synthetic s(ILm8/i$b;)I
    .registers 2

    invoke-static {p0, p1}, LJ8/v;->v(ILm8/i$b;)I

    move-result p0

    return p0
.end method

.method private final u(Lm8/i;Lm8/i;Ljava/lang/Object;)V
    .registers 5

    instance-of v0, p2, LJ8/m;

    if-eqz v0, :cond_9

    check-cast p2, LJ8/m;

    invoke-direct {p0, p2, p3}, LJ8/v;->x(LJ8/m;Ljava/lang/Object;)V

    :cond_9
    invoke-static {p0, p1}, LJ8/y;->b(LJ8/v;Lm8/i;)V

    return-void
.end method

.method private static final v(ILm8/i$b;)I
    .registers 2

    add-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private final w(Lm8/e;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-interface {p1}, Lm8/e;->getContext()Lm8/i;

    move-result-object v0

    invoke-static {v0}, LF8/A0;->j(Lm8/i;)V

    iget-object v1, p0, LJ8/v;->t:Lm8/i;

    if-eq v1, v0, :cond_10

    invoke-direct {p0, v0, v1, p2}, LJ8/v;->u(Lm8/i;Lm8/i;Ljava/lang/Object;)V

    iput-object v0, p0, LJ8/v;->t:Lm8/i;

    :cond_10
    iput-object p1, p0, LJ8/v;->u:Lm8/e;

    invoke-static {}, LJ8/w;->a()Lv8/q;

    move-result-object p1

    iget-object v0, p0, LJ8/v;->q:LI8/g;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, p2, p0}, Lv8/q;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_33

    const/4 p2, 0x0

    iput-object p2, p0, LJ8/v;->u:Lm8/e;

    :cond_33
    return-object p1
.end method

.method private final x(LJ8/m;Ljava/lang/Object;)V
    .registers 5

    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, LJ8/m;->r:Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", but then emission attempt of value \'"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LE8/i;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 4

    :try_start_0
    invoke-direct {p0, p2, p1}, LJ8/v;->w(Lm8/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_4
    .catchall {:try_start_0 .. :try_end_4} :catchall_17

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_d

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_d
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_14

    return-object p0

    :cond_14
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :catchall_17
    move-exception p1

    new-instance v0, LJ8/m;

    invoke-interface {p2}, Lm8/e;->getContext()Lm8/i;

    move-result-object p2

    invoke-direct {v0, p1, p2}, LJ8/m;-><init>(Ljava/lang/Throwable;Lm8/i;)V

    iput-object v0, p0, LJ8/v;->t:Lm8/i;

    throw p1
.end method

.method public getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .registers 2

    iget-object p0, p0, LJ8/v;->u:Lm8/e;

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

    iget-object p0, p0, LJ8/v;->t:Lm8/i;

    if-nez p0, :cond_6

    sget-object p0, Lm8/j;->q:Lm8/j;

    :cond_6
    return-object p0
.end method

.method public getStackTraceElement()Ljava/lang/StackTraceElement;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method protected invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {p1}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_11

    new-instance v1, LJ8/m;

    invoke-virtual {p0}, LJ8/v;->getContext()Lm8/i;

    move-result-object v2

    invoke-direct {v1, v0, v2}, LJ8/m;-><init>(Ljava/lang/Throwable;Lm8/i;)V

    iput-object v1, p0, LJ8/v;->t:Lm8/i;

    :cond_11
    iget-object p0, p0, LJ8/v;->u:Lm8/e;

    if-eqz p0, :cond_18

    invoke-interface {p0, p1}, Lm8/e;->resumeWith(Ljava/lang/Object;)V

    :cond_18
    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public releaseIntercepted()V
    .registers 1

    invoke-super {p0}, Lkotlin/coroutines/jvm/internal/d;->releaseIntercepted()V

    return-void
.end method
