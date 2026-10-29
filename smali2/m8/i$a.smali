.class public abstract Lm8/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Lm8/i;Lm8/i$b;)Lm8/i;
    .registers 2

    invoke-static {p0, p1}, Lm8/i$a;->c(Lm8/i;Lm8/i$b;)Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lm8/i;Lm8/i;)Lm8/i;
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm8/j;->q:Lm8/j;

    if-ne p1, v0, :cond_a

    return-object p0

    :cond_a
    new-instance v0, Lm8/h;

    invoke-direct {v0}, Lm8/h;-><init>()V

    invoke-interface {p1, p0, v0}, Lm8/i;->U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm8/i;

    return-object p0
.end method

.method private static c(Lm8/i;Lm8/i$b;)Lm8/i;
    .registers 5

    const-string v0, "acc"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lm8/i$b;->getKey()Lm8/i$c;

    move-result-object v0

    invoke-interface {p0, v0}, Lm8/i;->t0(Lm8/i$c;)Lm8/i;

    move-result-object p0

    sget-object v0, Lm8/j;->q:Lm8/j;

    if-ne p0, v0, :cond_17

    return-object p1

    :cond_17
    sget-object v1, Lm8/f;->l:Lm8/f$b;

    invoke-interface {p0, v1}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v2

    check-cast v2, Lm8/f;

    if-nez v2, :cond_27

    new-instance v0, Lm8/d;

    invoke-direct {v0, p0, p1}, Lm8/d;-><init>(Lm8/i;Lm8/i$b;)V

    return-object v0

    :cond_27
    invoke-interface {p0, v1}, Lm8/i;->t0(Lm8/i$c;)Lm8/i;

    move-result-object p0

    if-ne p0, v0, :cond_33

    new-instance p0, Lm8/d;

    invoke-direct {p0, p1, v2}, Lm8/d;-><init>(Lm8/i;Lm8/i$b;)V

    return-object p0

    :cond_33
    new-instance v0, Lm8/d;

    new-instance v1, Lm8/d;

    invoke-direct {v1, p0, p1}, Lm8/d;-><init>(Lm8/i;Lm8/i$b;)V

    invoke-direct {v0, v1, v2}, Lm8/d;-><init>(Lm8/i;Lm8/i$b;)V

    return-object v0
.end method
