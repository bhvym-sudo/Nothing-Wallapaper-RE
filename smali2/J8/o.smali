.class public abstract LJ8/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lv8/p;Lm8/e;)Ljava/lang/Object;
    .registers 4

    new-instance v0, LJ8/n;

    invoke-interface {p1}, Lm8/e;->getContext()Lm8/i;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LJ8/n;-><init>(Lm8/i;Lm8/e;)V

    invoke-static {v0, v0, p0}, LL8/b;->b(LK8/z;Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_16

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_16
    return-object p0
.end method

.method public static final b(Lv8/q;)LI8/f;
    .registers 2

    new-instance v0, LJ8/o$a;

    invoke-direct {v0, p0}, LJ8/o$a;-><init>(Lv8/q;)V

    return-object v0
.end method
