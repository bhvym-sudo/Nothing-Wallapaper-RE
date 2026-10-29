.class public final LJ8/h;
.super LJ8/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(LI8/f;Lm8/i;ILH8/a;)V
    .registers 5

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, LJ8/g;-><init>(LI8/f;Lm8/i;ILH8/a;)V

    return-void
.end method

.method public synthetic constructor <init>(LI8/f;Lm8/i;ILH8/a;ILkotlin/jvm/internal/h;)V
    .registers 7

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_6

    .line 1
    sget-object p2, Lm8/j;->q:Lm8/j;

    :cond_6
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_b

    const/4 p3, -0x3

    :cond_b
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_11

    .line 2
    sget-object p4, LH8/a;->q:LH8/a;

    .line 3
    :cond_11
    invoke-direct {p0, p1, p2, p3, p4}, LJ8/h;-><init>(LI8/f;Lm8/i;ILH8/a;)V

    return-void
.end method


# virtual methods
.method protected k(Lm8/i;ILH8/a;)LJ8/e;
    .registers 5

    new-instance v0, LJ8/h;

    iget-object p0, p0, LJ8/g;->t:LI8/f;

    invoke-direct {v0, p0, p1, p2, p3}, LJ8/h;-><init>(LI8/f;Lm8/i;ILH8/a;)V

    return-object v0
.end method

.method public m()LI8/f;
    .registers 1

    iget-object p0, p0, LJ8/g;->t:LI8/f;

    return-object p0
.end method

.method protected t(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LJ8/g;->t:LI8/f;

    invoke-interface {p0, p1, p2}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_d

    return-object p0

    :cond_d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
