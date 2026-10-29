.class abstract Ln8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lv8/p;Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->a(Lm8/e;)Lm8/e;

    move-result-object p2

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/a;

    if-eqz v0, :cond_19

    check-cast p0, Lkotlin/coroutines/jvm/internal/a;

    invoke-virtual {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    return-object p0

    :cond_19
    invoke-interface {p2}, Lm8/e;->getContext()Lm8/i;

    move-result-object v0

    sget-object v1, Lm8/j;->q:Lm8/j;

    if-ne v0, v1, :cond_27

    new-instance v0, Ln8/c$a;

    invoke-direct {v0, p2, p0, p1}, Ln8/c$a;-><init>(Lm8/e;Lv8/p;Ljava/lang/Object;)V

    return-object v0

    :cond_27
    new-instance v1, Ln8/c$b;

    invoke-direct {v1, p2, v0, p0, p1}, Ln8/c$b;-><init>(Lm8/e;Lm8/i;Lv8/p;Ljava/lang/Object;)V

    return-object v1
.end method

.method private static final b(Lm8/e;)Lm8/e;
    .registers 3

    invoke-interface {p0}, Lm8/e;->getContext()Lm8/i;

    move-result-object v0

    sget-object v1, Lm8/j;->q:Lm8/j;

    if-ne v0, v1, :cond_e

    new-instance v0, Ln8/c$c;

    invoke-direct {v0, p0}, Ln8/c$c;-><init>(Lm8/e;)V

    return-object v0

    :cond_e
    new-instance v1, Ln8/c$d;

    invoke-direct {v1, p0, v0}, Ln8/c$d;-><init>(Lm8/e;Lm8/i;)V

    return-object v1
.end method

.method public static c(Lm8/e;)Lm8/e;
    .registers 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/d;

    if-eqz v0, :cond_d

    move-object v0, p0

    check-cast v0, Lkotlin/coroutines/jvm/internal/d;

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    if-eqz v0, :cond_18

    invoke-virtual {v0}, Lkotlin/coroutines/jvm/internal/d;->intercepted()Lm8/e;

    move-result-object v0

    if-nez v0, :cond_17

    goto :goto_18

    :cond_17
    return-object v0

    :cond_18
    :goto_18
    return-object p0
.end method

.method public static d(Lv8/p;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->a(Lm8/e;)Lm8/e;

    move-result-object p2

    invoke-static {p2}, Ln8/c;->b(Lm8/e;)Lm8/e;

    move-result-object p2

    const/4 v0, 0x2

    invoke-static {p0, v0}, Lkotlin/jvm/internal/I;->d(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv8/p;

    invoke-interface {p0, p1, p2}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
