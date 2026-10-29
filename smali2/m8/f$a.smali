.class public abstract Lm8/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lm8/f;Lm8/i$c;)Lm8/i$b;
    .registers 4

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lm8/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_1e

    check-cast p1, Lm8/b;

    invoke-interface {p0}, Lm8/i$b;->getKey()Lm8/i$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm8/b;->a(Lm8/i$c;)Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-virtual {p1, p0}, Lm8/b;->b(Lm8/i$b;)Lm8/i$b;

    move-result-object p0

    if-eqz p0, :cond_1d

    return-object p0

    :cond_1d
    return-object v1

    :cond_1e
    sget-object v0, Lm8/f;->l:Lm8/f$b;

    if-ne v0, p1, :cond_28

    const-string p1, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_28
    return-object v1
.end method

.method public static b(Lm8/f;Lm8/i$c;)Lm8/i;
    .registers 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lm8/b;

    if-eqz v0, :cond_1e

    check-cast p1, Lm8/b;

    invoke-interface {p0}, Lm8/i$b;->getKey()Lm8/i$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm8/b;->a(Lm8/i$c;)Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-virtual {p1, p0}, Lm8/b;->b(Lm8/i$b;)Lm8/i$b;

    move-result-object p1

    if-eqz p1, :cond_1d

    sget-object p0, Lm8/j;->q:Lm8/j;

    :cond_1d
    return-object p0

    :cond_1e
    sget-object v0, Lm8/f;->l:Lm8/f$b;

    if-ne v0, p1, :cond_24

    sget-object p0, Lm8/j;->q:Lm8/j;

    :cond_24
    return-object p0
.end method
