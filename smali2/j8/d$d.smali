.class public abstract Lj8/d$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private final q:Lj8/d;

.field private r:I

.field private s:I

.field private t:I


# direct methods
.method public constructor <init>(Lj8/d;)V
    .registers 3

    const-string v0, "map"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/d$d;->q:Lj8/d;

    const/4 v0, -0x1

    iput v0, p0, Lj8/d$d;->s:I

    invoke-static {p1}, Lj8/d;->f(Lj8/d;)I

    move-result p1

    iput p1, p0, Lj8/d$d;->t:I

    invoke-virtual {p0}, Lj8/d$d;->g()V

    return-void
.end method


# virtual methods
.method public final a()V
    .registers 2

    iget-object v0, p0, Lj8/d$d;->q:Lj8/d;

    invoke-static {v0}, Lj8/d;->f(Lj8/d;)I

    move-result v0

    iget p0, p0, Lj8/d$d;->t:I

    if-ne v0, p0, :cond_b

    return-void

    :cond_b
    new-instance p0, Ljava/util/ConcurrentModificationException;

    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p0
.end method

.method public final c()I
    .registers 1

    iget p0, p0, Lj8/d$d;->r:I

    return p0
.end method

.method public final d()I
    .registers 1

    iget p0, p0, Lj8/d$d;->s:I

    return p0
.end method

.method public final f()Lj8/d;
    .registers 1

    iget-object p0, p0, Lj8/d$d;->q:Lj8/d;

    return-object p0
.end method

.method public final g()V
    .registers 3

    :goto_0
    iget v0, p0, Lj8/d$d;->r:I

    iget-object v1, p0, Lj8/d$d;->q:Lj8/d;

    invoke-static {v1}, Lj8/d;->d(Lj8/d;)I

    move-result v1

    if-ge v0, v1, :cond_1b

    iget-object v0, p0, Lj8/d$d;->q:Lj8/d;

    invoke-static {v0}, Lj8/d;->g(Lj8/d;)[I

    move-result-object v0

    iget v1, p0, Lj8/d$d;->r:I

    aget v0, v0, v1

    if-gez v0, :cond_1b

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lj8/d$d;->r:I

    goto :goto_0

    :cond_1b
    return-void
.end method

.method public final h(I)V
    .registers 2

    iput p1, p0, Lj8/d$d;->r:I

    return-void
.end method

.method public final hasNext()Z
    .registers 2

    iget v0, p0, Lj8/d$d;->r:I

    iget-object p0, p0, Lj8/d$d;->q:Lj8/d;

    invoke-static {p0}, Lj8/d;->d(Lj8/d;)I

    move-result p0

    if-ge v0, p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public final i(I)V
    .registers 2

    iput p1, p0, Lj8/d$d;->s:I

    return-void
.end method

.method public final remove()V
    .registers 4

    invoke-virtual {p0}, Lj8/d$d;->a()V

    iget v0, p0, Lj8/d$d;->s:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1f

    iget-object v0, p0, Lj8/d$d;->q:Lj8/d;

    invoke-virtual {v0}, Lj8/d;->n()V

    iget-object v0, p0, Lj8/d$d;->q:Lj8/d;

    iget v2, p0, Lj8/d$d;->s:I

    invoke-static {v0, v2}, Lj8/d;->i(Lj8/d;I)V

    iput v1, p0, Lj8/d$d;->s:I

    iget-object v0, p0, Lj8/d$d;->q:Lj8/d;

    invoke-static {v0}, Lj8/d;->f(Lj8/d;)I

    move-result v0

    iput v0, p0, Lj8/d$d;->t:I

    return-void

    :cond_1f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Call next() before removing element from the iterator."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
