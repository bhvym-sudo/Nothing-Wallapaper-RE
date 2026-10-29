.class public abstract LJ8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LI8/g;[LI8/f;Lv8/a;Lv8/q;Lm8/e;)Ljava/lang/Object;
    .registers 11

    new-instance v0, LJ8/l$a;

    const/4 v5, 0x0

    move-object v4, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, LJ8/l$a;-><init>([LI8/f;Lv8/a;Lv8/q;LI8/g;Lm8/e;)V

    invoke-static {v0, p4}, LJ8/o;->a(Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_15

    return-object p0

    :cond_15
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
