.class public abstract LJ8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ8/q;


# instance fields
.field public final q:Lm8/i;

.field public final r:I

.field public final s:LH8/a;


# direct methods
.method public constructor <init>(Lm8/i;ILH8/a;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ8/e;->q:Lm8/i;

    iput p2, p0, LJ8/e;->r:I

    iput-object p3, p0, LJ8/e;->s:LH8/a;

    return-void
.end method

.method static synthetic i(LJ8/e;LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 5

    new-instance v0, LJ8/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, LJ8/e$a;-><init>(LI8/g;LJ8/e;Lm8/e;)V

    invoke-static {v0, p2}, LF8/M;->e(Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_11

    return-object p0

    :cond_11
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public a(LI8/g;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, LJ8/e;->i(LJ8/e;LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public e(Lm8/i;ILH8/a;)LI8/f;
    .registers 5

    iget-object v0, p0, LJ8/e;->q:Lm8/i;

    invoke-interface {p1, v0}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p1

    sget-object v0, LH8/a;->q:LH8/a;

    if-eq p3, v0, :cond_b

    goto :goto_25

    :cond_b
    iget p3, p0, LJ8/e;->r:I

    const/4 v0, -0x3

    if-ne p3, v0, :cond_11

    goto :goto_23

    :cond_11
    if-ne p2, v0, :cond_15

    :goto_13
    move p2, p3

    goto :goto_23

    :cond_15
    const/4 v0, -0x2

    if-ne p3, v0, :cond_19

    goto :goto_23

    :cond_19
    if-ne p2, v0, :cond_1c

    goto :goto_13

    :cond_1c
    add-int/2addr p2, p3

    if-ltz p2, :cond_20

    goto :goto_23

    :cond_20
    const p2, 0x7fffffff

    :goto_23
    iget-object p3, p0, LJ8/e;->s:LH8/a;

    :goto_25
    iget-object v0, p0, LJ8/e;->q:Lm8/i;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_36

    iget v0, p0, LJ8/e;->r:I

    if-ne p2, v0, :cond_36

    iget-object v0, p0, LJ8/e;->s:LH8/a;

    if-ne p3, v0, :cond_36

    return-object p0

    :cond_36
    invoke-virtual {p0, p1, p2, p3}, LJ8/e;->k(Lm8/i;ILH8/a;)LJ8/e;

    move-result-object p0

    return-object p0
.end method

.method protected f()Ljava/lang/String;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method protected abstract j(LH8/t;Lm8/e;)Ljava/lang/Object;
.end method

.method protected abstract k(Lm8/i;ILH8/a;)LJ8/e;
.end method

.method public m()LI8/f;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public final n()Lv8/p;
    .registers 3

    new-instance v0, LJ8/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LJ8/e$b;-><init>(LJ8/e;Lm8/e;)V

    return-object v0
.end method

.method public final o()I
    .registers 2

    iget p0, p0, LJ8/e;->r:I

    const/4 v0, -0x3

    if-ne p0, v0, :cond_6

    const/4 p0, -0x2

    :cond_6
    return p0
.end method

.method public p(LF8/L;)LH8/v;
    .registers 11

    iget-object v1, p0, LJ8/e;->q:Lm8/i;

    invoke-virtual {p0}, LJ8/e;->o()I

    move-result v2

    iget-object v3, p0, LJ8/e;->s:LH8/a;

    sget-object v4, LF8/N;->s:LF8/N;

    invoke-virtual {p0}, LJ8/e;->n()Lv8/p;

    move-result-object v6

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v8}, LH8/r;->d(LF8/L;Lm8/i;ILH8/a;LF8/N;Lv8/l;Lv8/p;ILjava/lang/Object;)LH8/v;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 11

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, LJ8/e;->f()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_f

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_f
    iget-object v1, p0, LJ8/e;->q:Lm8/i;

    sget-object v2, Lm8/j;->q:Lm8/j;

    if-eq v1, v2, :cond_2b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "context="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LJ8/e;->q:Lm8/i;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2b
    iget v1, p0, LJ8/e;->r:I

    const/4 v2, -0x3

    if-eq v1, v2, :cond_46

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "capacity="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LJ8/e;->r:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_46
    iget-object v1, p0, LJ8/e;->s:LH8/a;

    sget-object v2, LH8/a;->q:LH8/a;

    if-eq v1, v2, :cond_62

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onBufferOverflow="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LJ8/e;->s:LH8/a;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_62
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LF8/P;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x5b

    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const-string v1, ", "

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Li8/s;->a0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lv8/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x5d

    invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
