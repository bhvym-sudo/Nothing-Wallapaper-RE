.class final Lj8/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements Lw8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj8/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final q:Lj8/b$a;

.field private r:I

.field private s:I

.field private t:I


# direct methods
.method public constructor <init>(Lj8/b$a;I)V
    .registers 4

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj8/b$a$a;->q:Lj8/b$a;

    iput p2, p0, Lj8/b$a$a;->r:I

    const/4 p2, -0x1

    iput p2, p0, Lj8/b$a$a;->s:I

    invoke-static {p1}, Lj8/b$a;->m(Lj8/b$a;)I

    move-result p1

    iput p1, p0, Lj8/b$a$a;->t:I

    return-void
.end method

.method private final a()V
    .registers 2

    iget-object v0, p0, Lj8/b$a$a;->q:Lj8/b$a;

    invoke-static {v0}, Lj8/b$a;->o(Lj8/b$a;)Lj8/b;

    move-result-object v0

    invoke-static {v0}, Lj8/b;->o(Lj8/b;)I

    move-result v0

    iget p0, p0, Lj8/b$a$a;->t:I

    if-ne v0, p0, :cond_f

    return-void

    :cond_f
    new-instance p0, Ljava/util/ConcurrentModificationException;

    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p0
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .registers 5

    invoke-direct {p0}, Lj8/b$a$a;->a()V

    iget-object v0, p0, Lj8/b$a$a;->q:Lj8/b$a;

    iget v1, p0, Lj8/b$a$a;->r:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lj8/b$a$a;->r:I

    invoke-virtual {v0, v1, p1}, Lj8/b$a;->add(ILjava/lang/Object;)V

    const/4 p1, -0x1

    iput p1, p0, Lj8/b$a$a;->s:I

    iget-object p1, p0, Lj8/b$a$a;->q:Lj8/b$a;

    invoke-static {p1}, Lj8/b$a;->m(Lj8/b$a;)I

    move-result p1

    iput p1, p0, Lj8/b$a$a;->t:I

    return-void
.end method

.method public hasNext()Z
    .registers 2

    iget v0, p0, Lj8/b$a$a;->r:I

    iget-object p0, p0, Lj8/b$a$a;->q:Lj8/b$a;

    invoke-static {p0}, Lj8/b$a;->g(Lj8/b$a;)I

    move-result p0

    if-ge v0, p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method public hasPrevious()Z
    .registers 1

    iget p0, p0, Lj8/b$a$a;->r:I

    if-lez p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public next()Ljava/lang/Object;
    .registers 3

    invoke-direct {p0}, Lj8/b$a$a;->a()V

    iget v0, p0, Lj8/b$a$a;->r:I

    iget-object v1, p0, Lj8/b$a$a;->q:Lj8/b$a;

    invoke-static {v1}, Lj8/b$a;->g(Lj8/b$a;)I

    move-result v1

    if-ge v0, v1, :cond_27

    iget v0, p0, Lj8/b$a$a;->r:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lj8/b$a$a;->r:I

    iput v0, p0, Lj8/b$a$a;->s:I

    iget-object v0, p0, Lj8/b$a$a;->q:Lj8/b$a;

    invoke-static {v0}, Lj8/b$a;->f(Lj8/b$a;)[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lj8/b$a$a;->q:Lj8/b$a;

    invoke-static {v1}, Lj8/b$a;->n(Lj8/b$a;)I

    move-result v1

    iget p0, p0, Lj8/b$a$a;->s:I

    add-int/2addr v1, p0

    aget-object p0, v0, v1

    return-object p0

    :cond_27
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method

.method public nextIndex()I
    .registers 1

    iget p0, p0, Lj8/b$a$a;->r:I

    return p0
.end method

.method public previous()Ljava/lang/Object;
    .registers 3

    invoke-direct {p0}, Lj8/b$a$a;->a()V

    iget v0, p0, Lj8/b$a$a;->r:I

    if-lez v0, :cond_1f

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lj8/b$a$a;->r:I

    iput v0, p0, Lj8/b$a$a;->s:I

    iget-object v0, p0, Lj8/b$a$a;->q:Lj8/b$a;

    invoke-static {v0}, Lj8/b$a;->f(Lj8/b$a;)[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lj8/b$a$a;->q:Lj8/b$a;

    invoke-static {v1}, Lj8/b$a;->n(Lj8/b$a;)I

    move-result v1

    iget p0, p0, Lj8/b$a$a;->s:I

    add-int/2addr v1, p0

    aget-object p0, v0, v1

    return-object p0

    :cond_1f
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method

.method public previousIndex()I
    .registers 1

    iget p0, p0, Lj8/b$a$a;->r:I

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public remove()V
    .registers 4

    invoke-direct {p0}, Lj8/b$a$a;->a()V

    iget v0, p0, Lj8/b$a$a;->s:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1c

    iget-object v2, p0, Lj8/b$a$a;->q:Lj8/b$a;

    invoke-virtual {v2, v0}, Li8/g;->remove(I)Ljava/lang/Object;

    iget v0, p0, Lj8/b$a$a;->s:I

    iput v0, p0, Lj8/b$a$a;->r:I

    iput v1, p0, Lj8/b$a$a;->s:I

    iget-object v0, p0, Lj8/b$a$a;->q:Lj8/b$a;

    invoke-static {v0}, Lj8/b$a;->m(Lj8/b$a;)I

    move-result v0

    iput v0, p0, Lj8/b$a$a;->t:I

    return-void

    :cond_1c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Call next() or previous() before removing element from the iterator."

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public set(Ljava/lang/Object;)V
    .registers 4

    invoke-direct {p0}, Lj8/b$a$a;->a()V

    iget v0, p0, Lj8/b$a$a;->s:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_e

    iget-object p0, p0, Lj8/b$a$a;->q:Lj8/b$a;

    invoke-virtual {p0, v0, p1}, Lj8/b$a;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Call next() or previous() before replacing element from the iterator."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
