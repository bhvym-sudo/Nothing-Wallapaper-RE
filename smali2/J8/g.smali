.class public abstract LJ8/g;
.super LJ8/e;
.source "SourceFile"


# instance fields
.field protected final t:LI8/f;


# direct methods
.method public constructor <init>(LI8/f;Lm8/i;ILH8/a;)V
    .registers 5

    invoke-direct {p0, p2, p3, p4}, LJ8/e;-><init>(Lm8/i;ILH8/a;)V

    iput-object p1, p0, LJ8/g;->t:LI8/f;

    return-void
.end method

.method static synthetic q(LJ8/g;LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 7

    iget v0, p0, LJ8/e;->r:I

    const/4 v1, -0x3

    if-ne v0, v1, :cond_41

    invoke-interface {p2}, Lm8/e;->getContext()Lm8/i;

    move-result-object v0

    iget-object v1, p0, LJ8/e;->q:Lm8/i;

    invoke-static {v0, v1}, LF8/G;->k(Lm8/i;Lm8/i;)Lm8/i;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_23

    invoke-virtual {p0, p1, p2}, LJ8/g;->t(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_20

    return-object p0

    :cond_20
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_23
    sget-object v2, Lm8/f;->l:Lm8/f$b;

    invoke-interface {v1, v2}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v3

    invoke-interface {v0, v2}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_41

    invoke-direct {p0, p1, v1, p2}, LJ8/g;->s(LI8/g;Lm8/i;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3e

    return-object p0

    :cond_3e
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_41
    invoke-super {p0, p1, p2}, LJ8/e;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4c

    return-object p0

    :cond_4c
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method static synthetic r(LJ8/g;LH8/t;Lm8/e;)Ljava/lang/Object;
    .registers 4

    new-instance v0, LJ8/z;

    invoke-direct {v0, p1}, LJ8/z;-><init>(LH8/w;)V

    invoke-virtual {p0, v0, p2}, LJ8/g;->t(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_10

    return-object p0

    :cond_10
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final s(LI8/g;Lm8/i;Lm8/e;)Ljava/lang/Object;
    .registers 12

    invoke-interface {p3}, Lm8/e;->getContext()Lm8/i;

    move-result-object v0

    invoke-static {p1, v0}, LJ8/f;->a(LI8/g;Lm8/i;)LI8/g;

    move-result-object v2

    new-instance v4, LJ8/g$a;

    const/4 p1, 0x0

    invoke-direct {v4, p0, p1}, LJ8/g$a;-><init>(LJ8/g;Lm8/e;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    move-object v5, p3

    invoke-static/range {v1 .. v7}, LJ8/f;->c(Lm8/i;Ljava/lang/Object;Ljava/lang/Object;Lv8/p;Lm8/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, LJ8/g;->q(LJ8/g;LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method protected j(LH8/t;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, LJ8/g;->r(LJ8/g;LH8/t;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method protected abstract t(LI8/g;Lm8/e;)Ljava/lang/Object;
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LJ8/g;->t:LI8/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, LJ8/e;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
