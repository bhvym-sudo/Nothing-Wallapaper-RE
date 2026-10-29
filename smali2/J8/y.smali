.class public abstract LJ8/y;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(LJ8/v;ILm8/i$b;)I
    .registers 3

    invoke-static {p0, p1, p2}, LJ8/y;->c(LJ8/v;ILm8/i$b;)I

    move-result p0

    return p0
.end method

.method public static final b(LJ8/v;Lm8/i;)V
    .registers 5

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v1, LJ8/x;

    invoke-direct {v1, p0}, LJ8/x;-><init>(LJ8/v;)V

    invoke-interface {p1, v0, v1}, Lm8/i;->U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v1, p0, LJ8/v;->s:I

    if-ne v0, v1, :cond_19

    return-void

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Flow invariant is violated:\n\t\tFlow was collected in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LJ8/v;->r:Lm8/i;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ",\n\t\tbut emission happened in "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ".\n\t\tPlease refer to \'flow\' documentation or use \'flowOn\' instead"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final c(LJ8/v;ILm8/i$b;)I
    .registers 5

    invoke-interface {p2}, Lm8/i$b;->getKey()Lm8/i$c;

    move-result-object v0

    iget-object p0, p0, LJ8/v;->r:Lm8/i;

    invoke-interface {p0, v0}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p0

    sget-object v1, LF8/x0;->e:LF8/x0$b;

    if-eq v0, v1, :cond_16

    if-eq p2, p0, :cond_13

    const/high16 p0, -0x80000000

    return p0

    :cond_13
    add-int/lit8 p1, p1, 0x1

    return p1

    :cond_16
    check-cast p0, LF8/x0;

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.Job"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, LF8/x0;

    invoke-static {p2, p0}, LJ8/y;->d(LF8/x0;LF8/x0;)LF8/x0;

    move-result-object p2

    if-ne p2, p0, :cond_2b

    if-nez p0, :cond_28

    return p1

    :cond_28
    add-int/lit8 p1, p1, 0x1

    return p1

    :cond_2b
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", expected child of "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final d(LF8/x0;LF8/x0;)LF8/x0;
    .registers 3

    :goto_0
    if-nez p0, :cond_4

    const/4 p0, 0x0

    return-object p0

    :cond_4
    if-ne p0, p1, :cond_7

    goto :goto_b

    :cond_7
    instance-of v0, p0, LK8/z;

    if-nez v0, :cond_c

    :goto_b
    return-object p0

    :cond_c
    check-cast p0, LK8/z;

    invoke-virtual {p0}, LF8/D0;->Z()LF8/x0;

    move-result-object p0

    goto :goto_0
.end method
