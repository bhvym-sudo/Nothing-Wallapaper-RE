.class public LH8/q;
.super LH8/e;
.source "SourceFile"


# instance fields
.field private final C:I

.field private final D:LH8/a;


# direct methods
.method public constructor <init>(ILH8/a;Lv8/l;)V
    .registers 4

    invoke-direct {p0, p1, p3}, LH8/e;-><init>(ILv8/l;)V

    iput p1, p0, LH8/q;->C:I

    iput-object p2, p0, LH8/q;->D:LH8/a;

    sget-object p0, LH8/a;->q:LH8/a;

    if-eq p2, p0, :cond_2f

    const/4 p0, 0x1

    if-lt p1, p0, :cond_f

    return-void

    :cond_f
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Buffered channel capacity must be at least 1, but "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " was specified"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2f
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "This implementation does not support suspension for senders, use "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class p1, LH8/e;

    invoke-static {p1}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object p1

    invoke-interface {p1}, LC8/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " instead"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic t1(LH8/q;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 5

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, LH8/q;->v1(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, LH8/k$a;

    if-eqz v0, :cond_25

    invoke-static {p2}, LH8/k;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    iget-object p2, p0, LH8/e;->r:Lv8/l;

    if-eqz p2, :cond_20

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p2, p1, v1, v0, v1}, LK8/w;->c(Lv8/l;Ljava/lang/Object;LK8/P;ILjava/lang/Object;)LK8/P;

    move-result-object p1

    if-eqz p1, :cond_20

    invoke-virtual {p0}, LH8/e;->l0()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p1, p0}, Lh8/c;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw p1

    :cond_20
    invoke-virtual {p0}, LH8/e;->l0()Ljava/lang/Throwable;

    move-result-object p0

    throw p0

    :cond_25
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final u1(Ljava/lang/Object;Z)Ljava/lang/Object;
    .registers 5

    invoke-super {p0, p1}, LH8/e;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LH8/k;->i(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    invoke-static {v0}, LH8/k;->h(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    goto :goto_2a

    :cond_11
    if-eqz p2, :cond_21

    iget-object p0, p0, LH8/e;->r:Lv8/l;

    if-eqz p0, :cond_21

    const/4 p2, 0x2

    const/4 v0, 0x0

    invoke-static {p0, p1, v0, p2, v0}, LK8/w;->c(Lv8/l;Ljava/lang/Object;LK8/P;ILjava/lang/Object;)LK8/P;

    move-result-object p0

    if-nez p0, :cond_20

    goto :goto_21

    :cond_20
    throw p0

    :cond_21
    :goto_21
    sget-object p0, LH8/k;->b:LH8/k$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LH8/k$b;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2a
    :goto_2a
    return-object v0
.end method

.method private final v1(Ljava/lang/Object;Z)Ljava/lang/Object;
    .registers 5

    iget-object v0, p0, LH8/q;->D:LH8/a;

    sget-object v1, LH8/a;->s:LH8/a;

    if-ne v0, v1, :cond_b

    invoke-direct {p0, p1, p2}, LH8/q;->u1(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_b
    invoke-virtual {p0, p1}, LH8/e;->j1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public n(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, LH8/q;->t1(LH8/q;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public p(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LH8/q;->v1(Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method protected z0()Z
    .registers 2

    iget-object p0, p0, LH8/q;->D:LH8/a;

    sget-object v0, LH8/a;->r:LH8/a;

    if-ne p0, v0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method
