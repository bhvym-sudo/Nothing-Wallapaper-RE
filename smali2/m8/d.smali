.class public final Lm8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm8/i;
.implements Ljava/io/Serializable;


# instance fields
.field private final q:Lm8/i;

.field private final r:Lm8/i$b;


# direct methods
.method public constructor <init>(Lm8/i;Lm8/i$b;)V
    .registers 4

    const-string v0, "left"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm8/d;->q:Lm8/i;

    iput-object p2, p0, Lm8/d;->r:Lm8/i$b;

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;Lm8/i$b;)Ljava/lang/String;
    .registers 2

    invoke-static {p0, p1}, Lm8/d;->h(Ljava/lang/String;Lm8/i$b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lm8/i$b;)Z
    .registers 3

    invoke-interface {p1}, Lm8/i$b;->getKey()Lm8/i$c;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm8/d;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p0

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private final e(Lm8/d;)Z
    .registers 3

    :goto_0
    iget-object v0, p1, Lm8/d;->r:Lm8/i$b;

    invoke-direct {p0, v0}, Lm8/d;->d(Lm8/i$b;)Z

    move-result v0

    if-nez v0, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    iget-object p1, p1, Lm8/d;->q:Lm8/i;

    instance-of v0, p1, Lm8/d;

    if-eqz v0, :cond_13

    check-cast p1, Lm8/d;

    goto :goto_0

    :cond_13
    const-string v0, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lm8/i$b;

    invoke-direct {p0, p1}, Lm8/d;->d(Lm8/i$b;)Z

    move-result p0

    return p0
.end method

.method private final g()I
    .registers 3

    const/4 v0, 0x2

    :goto_1
    iget-object p0, p0, Lm8/d;->q:Lm8/i;

    instance-of v1, p0, Lm8/d;

    if-eqz v1, :cond_a

    check-cast p0, Lm8/d;

    goto :goto_b

    :cond_a
    const/4 p0, 0x0

    :goto_b
    if-nez p0, :cond_e

    return v0

    :cond_e
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method private static final h(Ljava/lang/String;Lm8/i$b;)Ljava/lang/String;
    .registers 3

    const-string v0, "acc"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_15

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;
    .registers 4

    const-string v0, "operation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm8/d;->q:Lm8/i;

    invoke-interface {v0, p1, p2}, Lm8/i;->U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p1

    iget-object p0, p0, Lm8/d;->r:Lm8/i$b;

    invoke-interface {p2, p1, p0}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public b(Lm8/i$c;)Lm8/i$b;
    .registers 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_5
    iget-object v0, p0, Lm8/d;->r:Lm8/i$b;

    invoke-interface {v0, p1}, Lm8/i$b;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v0

    if-eqz v0, :cond_e

    return-object v0

    :cond_e
    iget-object p0, p0, Lm8/d;->q:Lm8/i;

    instance-of v0, p0, Lm8/d;

    if-eqz v0, :cond_17

    check-cast p0, Lm8/d;

    goto :goto_5

    :cond_17
    invoke-interface {p0, p1}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 4

    if-eq p0, p1, :cond_1b

    instance-of v0, p1, Lm8/d;

    if-eqz v0, :cond_19

    check-cast p1, Lm8/d;

    invoke-direct {p1}, Lm8/d;->g()I

    move-result v0

    invoke-direct {p0}, Lm8/d;->g()I

    move-result v1

    if-ne v0, v1, :cond_19

    invoke-direct {p1, p0}, Lm8/d;->e(Lm8/d;)Z

    move-result p0

    if-eqz p0, :cond_19

    goto :goto_1b

    :cond_19
    const/4 p0, 0x0

    return p0

    :cond_1b
    :goto_1b
    const/4 p0, 0x1

    return p0
.end method

.method public hashCode()I
    .registers 2

    iget-object v0, p0, Lm8/d;->q:Lm8/i;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object p0, p0, Lm8/d;->r:Lm8/i$b;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public t0(Lm8/i$c;)Lm8/i;
    .registers 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm8/d;->r:Lm8/i$b;

    invoke-interface {v0, p1}, Lm8/i$b;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v0

    if-eqz v0, :cond_10

    iget-object p0, p0, Lm8/d;->q:Lm8/i;

    return-object p0

    :cond_10
    iget-object v0, p0, Lm8/d;->q:Lm8/i;

    invoke-interface {v0, p1}, Lm8/i;->t0(Lm8/i$c;)Lm8/i;

    move-result-object p1

    iget-object v0, p0, Lm8/d;->q:Lm8/i;

    if-ne p1, v0, :cond_1b

    return-object p0

    :cond_1b
    sget-object v0, Lm8/j;->q:Lm8/j;

    if-ne p1, v0, :cond_22

    iget-object p0, p0, Lm8/d;->r:Lm8/i$b;

    return-object p0

    :cond_22
    new-instance v0, Lm8/d;

    iget-object p0, p0, Lm8/d;->r:Lm8/i$b;

    invoke-direct {v0, p1, p0}, Lm8/d;-><init>(Lm8/i;Lm8/i$b;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    new-instance v1, Lm8/c;

    invoke-direct {v1}, Lm8/c;-><init>()V

    const-string v2, ""

    invoke-virtual {p0, v2, v1}, Lm8/d;->U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public z(Lm8/i;)Lm8/i;
    .registers 2

    invoke-static {p0, p1}, Lm8/i$a;->b(Lm8/i;Lm8/i;)Lm8/i;

    move-result-object p0

    return-object p0
.end method
