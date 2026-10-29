.class public final LJ8/j;
.super LJ8/e;
.source "SourceFile"


# instance fields
.field private final t:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;Lm8/i;ILH8/a;)V
    .registers 5

    .line 4
    invoke-direct {p0, p2, p3, p4}, LJ8/e;-><init>(Lm8/i;ILH8/a;)V

    .line 5
    iput-object p1, p0, LJ8/j;->t:Ljava/lang/Iterable;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Iterable;Lm8/i;ILH8/a;ILkotlin/jvm/internal/h;)V
    .registers 7

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_6

    .line 1
    sget-object p2, Lm8/j;->q:Lm8/j;

    :cond_6
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_b

    const/4 p3, -0x2

    :cond_b
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_11

    .line 2
    sget-object p4, LH8/a;->q:LH8/a;

    .line 3
    :cond_11
    invoke-direct {p0, p1, p2, p3, p4}, LJ8/j;-><init>(Ljava/lang/Iterable;Lm8/i;ILH8/a;)V

    return-void
.end method


# virtual methods
.method protected j(LH8/t;Lm8/e;)Ljava/lang/Object;
    .registers 10

    new-instance p2, LJ8/z;

    invoke-direct {p2, p1}, LJ8/z;-><init>(LH8/w;)V

    iget-object p0, p0, LJ8/j;->t:Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI8/f;

    new-instance v4, LJ8/j$a;

    const/4 v1, 0x0

    invoke-direct {v4, v0, p2, v1}, LJ8/j$a;-><init>(LI8/f;LJ8/z;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    goto :goto_b

    :cond_26
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method protected k(Lm8/i;ILH8/a;)LJ8/e;
    .registers 5

    new-instance v0, LJ8/j;

    iget-object p0, p0, LJ8/j;->t:Ljava/lang/Iterable;

    invoke-direct {v0, p0, p1, p2, p3}, LJ8/j;-><init>(Ljava/lang/Iterable;Lm8/i;ILH8/a;)V

    return-object v0
.end method

.method public p(LF8/L;)LH8/v;
    .registers 4

    iget-object v0, p0, LJ8/e;->q:Lm8/i;

    iget v1, p0, LJ8/e;->r:I

    invoke-virtual {p0}, LJ8/e;->n()Lv8/p;

    move-result-object p0

    invoke-static {p1, v0, v1, p0}, LH8/r;->c(LF8/L;Lm8/i;ILv8/p;)LH8/v;

    move-result-object p0

    return-object p0
.end method
