.class public final Lj8/b$a;
.super Li8/g;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;
.implements Ljava/io/Serializable;
.implements Lw8/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj8/b$a$a;
    }
.end annotation


# instance fields
.field private q:[Ljava/lang/Object;

.field private final r:I

.field private s:I

.field private final t:Lj8/b$a;

.field private final u:Lj8/b;


# direct methods
.method public constructor <init>([Ljava/lang/Object;IILj8/b$a;Lj8/b;)V
    .registers 7

    const-string v0, "backing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "root"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Li8/g;-><init>()V

    iput-object p1, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    iput p2, p0, Lj8/b$a;->r:I

    iput p3, p0, Lj8/b$a;->s:I

    iput-object p4, p0, Lj8/b$a;->t:Lj8/b$a;

    iput-object p5, p0, Lj8/b$a;->u:Lj8/b;

    invoke-static {p5}, Lj8/b;->o(Lj8/b;)I

    move-result p1

    iput p1, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method public static final synthetic f(Lj8/b$a;)[Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic g(Lj8/b$a;)I
    .registers 1

    iget p0, p0, Lj8/b$a;->s:I

    return p0
.end method

.method public static final synthetic m(Lj8/b$a;)I
    .registers 1

    iget p0, p0, Ljava/util/AbstractList;->modCount:I

    return p0
.end method

.method public static final synthetic n(Lj8/b$a;)I
    .registers 1

    iget p0, p0, Lj8/b$a;->r:I

    return p0
.end method

.method public static final synthetic o(Lj8/b$a;)Lj8/b;
    .registers 1

    iget-object p0, p0, Lj8/b$a;->u:Lj8/b;

    return-object p0
.end method

.method private final p(ILjava/util/Collection;I)V
    .registers 5

    invoke-direct {p0}, Lj8/b$a;->v()V

    iget-object v0, p0, Lj8/b$a;->t:Lj8/b$a;

    if-eqz v0, :cond_b

    invoke-direct {v0, p1, p2, p3}, Lj8/b$a;->p(ILjava/util/Collection;I)V

    goto :goto_10

    :cond_b
    iget-object v0, p0, Lj8/b$a;->u:Lj8/b;

    invoke-static {v0, p1, p2, p3}, Lj8/b;->f(Lj8/b;ILjava/util/Collection;I)V

    :goto_10
    iget-object p1, p0, Lj8/b$a;->u:Lj8/b;

    invoke-static {p1}, Lj8/b;->m(Lj8/b;)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    iget p1, p0, Lj8/b$a;->s:I

    add-int/2addr p1, p3

    iput p1, p0, Lj8/b$a;->s:I

    return-void
.end method

.method private final q(ILjava/lang/Object;)V
    .registers 4

    invoke-direct {p0}, Lj8/b$a;->v()V

    iget-object v0, p0, Lj8/b$a;->t:Lj8/b$a;

    if-eqz v0, :cond_b

    invoke-direct {v0, p1, p2}, Lj8/b$a;->q(ILjava/lang/Object;)V

    goto :goto_10

    :cond_b
    iget-object v0, p0, Lj8/b$a;->u:Lj8/b;

    invoke-static {v0, p1, p2}, Lj8/b;->g(Lj8/b;ILjava/lang/Object;)V

    :goto_10
    iget-object p1, p0, Lj8/b$a;->u:Lj8/b;

    invoke-static {p1}, Lj8/b;->m(Lj8/b;)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    iget p1, p0, Lj8/b$a;->s:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lj8/b$a;->s:I

    return-void
.end method

.method private final r()V
    .registers 2

    iget-object v0, p0, Lj8/b$a;->u:Lj8/b;

    invoke-static {v0}, Lj8/b;->o(Lj8/b;)I

    move-result v0

    iget p0, p0, Ljava/util/AbstractList;->modCount:I

    if-ne v0, p0, :cond_b

    return-void

    :cond_b
    new-instance p0, Ljava/util/ConcurrentModificationException;

    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p0
.end method

.method private final s()V
    .registers 1

    invoke-direct {p0}, Lj8/b$a;->u()Z

    move-result p0

    if-nez p0, :cond_7

    return-void

    :cond_7
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0
.end method

.method private final t(Ljava/util/List;)Z
    .registers 4

    iget-object v0, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    iget v1, p0, Lj8/b$a;->r:I

    iget p0, p0, Lj8/b$a;->s:I

    invoke-static {v0, v1, p0, p1}, Lj8/c;->a([Ljava/lang/Object;IILjava/util/List;)Z

    move-result p0

    return p0
.end method

.method private final u()Z
    .registers 1

    iget-object p0, p0, Lj8/b$a;->u:Lj8/b;

    invoke-static {p0}, Lj8/b;->p(Lj8/b;)Z

    move-result p0

    return p0
.end method

.method private final v()V
    .registers 2

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method private final w(I)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0}, Lj8/b$a;->v()V

    iget-object v0, p0, Lj8/b$a;->t:Lj8/b$a;

    if-eqz v0, :cond_c

    invoke-direct {v0, p1}, Lj8/b$a;->w(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_12

    :cond_c
    iget-object v0, p0, Lj8/b$a;->u:Lj8/b;

    invoke-static {v0, p1}, Lj8/b;->q(Lj8/b;I)Ljava/lang/Object;

    move-result-object p1

    :goto_12
    iget v0, p0, Lj8/b$a;->s:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lj8/b$a;->s:I

    return-object p1
.end method

.method private final x(II)V
    .registers 4

    if-lez p2, :cond_5

    invoke-direct {p0}, Lj8/b$a;->v()V

    :cond_5
    iget-object v0, p0, Lj8/b$a;->t:Lj8/b$a;

    if-eqz v0, :cond_d

    invoke-direct {v0, p1, p2}, Lj8/b$a;->x(II)V

    goto :goto_12

    :cond_d
    iget-object v0, p0, Lj8/b$a;->u:Lj8/b;

    invoke-static {v0, p1, p2}, Lj8/b;->r(Lj8/b;II)V

    :goto_12
    iget p1, p0, Lj8/b$a;->s:I

    sub-int/2addr p1, p2

    iput p1, p0, Lj8/b$a;->s:I

    return-void
.end method

.method private final y(IILjava/util/Collection;Z)I
    .registers 6

    iget-object v0, p0, Lj8/b$a;->t:Lj8/b$a;

    if-eqz v0, :cond_9

    invoke-direct {v0, p1, p2, p3, p4}, Lj8/b$a;->y(IILjava/util/Collection;Z)I

    move-result p1

    goto :goto_f

    :cond_9
    iget-object v0, p0, Lj8/b$a;->u:Lj8/b;

    invoke-static {v0, p1, p2, p3, p4}, Lj8/b;->s(Lj8/b;IILjava/util/Collection;Z)I

    move-result p1

    :goto_f
    if-lez p1, :cond_14

    invoke-direct {p0}, Lj8/b$a;->v()V

    :cond_14
    iget p2, p0, Lj8/b$a;->s:I

    sub-int/2addr p2, p1

    iput p2, p0, Lj8/b$a;->s:I

    return p1
.end method


# virtual methods
.method public a()I
    .registers 1

    invoke-direct {p0}, Lj8/b$a;->r()V

    iget p0, p0, Lj8/b$a;->s:I

    return p0
.end method

.method public add(ILjava/lang/Object;)V
    .registers 5

    .line 4
    invoke-direct {p0}, Lj8/b$a;->s()V

    .line 5
    invoke-direct {p0}, Lj8/b$a;->r()V

    .line 6
    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Lj8/b$a;->s:I

    invoke-virtual {v0, p1, v1}, Li8/c$a;->c(II)V

    .line 7
    iget v0, p0, Lj8/b$a;->r:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0, p2}, Lj8/b$a;->q(ILjava/lang/Object;)V

    return-void
.end method

.method public add(Ljava/lang/Object;)Z
    .registers 4

    .line 1
    invoke-direct {p0}, Lj8/b$a;->s()V

    .line 2
    invoke-direct {p0}, Lj8/b$a;->r()V

    .line 3
    iget v0, p0, Lj8/b$a;->r:I

    iget v1, p0, Lj8/b$a;->s:I

    add-int/2addr v0, v1

    invoke-direct {p0, v0, p1}, Lj8/b$a;->q(ILjava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method public addAll(ILjava/util/Collection;)Z
    .registers 5

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Lj8/b$a;->s()V

    .line 6
    invoke-direct {p0}, Lj8/b$a;->r()V

    .line 7
    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Lj8/b$a;->s:I

    invoke-virtual {v0, p1, v1}, Li8/c$a;->c(II)V

    .line 8
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    .line 9
    iget v1, p0, Lj8/b$a;->r:I

    add-int/2addr v1, p1

    invoke-direct {p0, v1, p2, v0}, Lj8/b$a;->p(ILjava/util/Collection;I)V

    if-lez v0, :cond_20

    const/4 p0, 0x1

    return p0

    :cond_20
    const/4 p0, 0x0

    return p0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .registers 5

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lj8/b$a;->s()V

    .line 2
    invoke-direct {p0}, Lj8/b$a;->r()V

    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    .line 4
    iget v1, p0, Lj8/b$a;->r:I

    iget v2, p0, Lj8/b$a;->s:I

    add-int/2addr v1, v2

    invoke-direct {p0, v1, p1, v0}, Lj8/b$a;->p(ILjava/util/Collection;I)V

    if-lez v0, :cond_1b

    const/4 p0, 0x1

    return p0

    :cond_1b
    const/4 p0, 0x0

    return p0
.end method

.method public b(I)Ljava/lang/Object;
    .registers 4

    invoke-direct {p0}, Lj8/b$a;->s()V

    invoke-direct {p0}, Lj8/b$a;->r()V

    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Lj8/b$a;->s:I

    invoke-virtual {v0, p1, v1}, Li8/c$a;->b(II)V

    iget v0, p0, Lj8/b$a;->r:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Lj8/b$a;->w(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public clear()V
    .registers 3

    invoke-direct {p0}, Lj8/b$a;->s()V

    invoke-direct {p0}, Lj8/b$a;->r()V

    iget v0, p0, Lj8/b$a;->r:I

    iget v1, p0, Lj8/b$a;->s:I

    invoke-direct {p0, v0, v1}, Lj8/b$a;->x(II)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 3

    invoke-direct {p0}, Lj8/b$a;->r()V

    if-eq p1, p0, :cond_14

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_12

    check-cast p1, Ljava/util/List;

    invoke-direct {p0, p1}, Lj8/b$a;->t(Ljava/util/List;)Z

    move-result p0

    if-eqz p0, :cond_12

    goto :goto_14

    :cond_12
    const/4 p0, 0x0

    return p0

    :cond_14
    :goto_14
    const/4 p0, 0x1

    return p0
.end method

.method public get(I)Ljava/lang/Object;
    .registers 4

    invoke-direct {p0}, Lj8/b$a;->r()V

    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Lj8/b$a;->s:I

    invoke-virtual {v0, p1, v1}, Li8/c$a;->b(II)V

    iget-object v0, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    iget p0, p0, Lj8/b$a;->r:I

    add-int/2addr p0, p1

    aget-object p0, v0, p0

    return-object p0
.end method

.method public hashCode()I
    .registers 3

    invoke-direct {p0}, Lj8/b$a;->r()V

    iget-object v0, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    iget v1, p0, Lj8/b$a;->r:I

    iget p0, p0, Lj8/b$a;->s:I

    invoke-static {v0, v1, p0}, Lj8/c;->b([Ljava/lang/Object;II)I

    move-result p0

    return p0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .registers 5

    invoke-direct {p0}, Lj8/b$a;->r()V

    const/4 v0, 0x0

    :goto_4
    iget v1, p0, Lj8/b$a;->s:I

    if-ge v0, v1, :cond_19

    iget-object v1, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    iget v2, p0, Lj8/b$a;->r:I

    add-int/2addr v2, v0

    aget-object v1, v1, v2

    invoke-static {v1, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_16

    return v0

    :cond_16
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_19
    const/4 p0, -0x1

    return p0
.end method

.method public isEmpty()Z
    .registers 1

    invoke-direct {p0}, Lj8/b$a;->r()V

    iget p0, p0, Lj8/b$a;->s:I

    if-nez p0, :cond_9

    const/4 p0, 0x1

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public iterator()Ljava/util/Iterator;
    .registers 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lj8/b$a;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    return-object p0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .registers 5

    invoke-direct {p0}, Lj8/b$a;->r()V

    iget v0, p0, Lj8/b$a;->s:I

    add-int/lit8 v0, v0, -0x1

    :goto_7
    if-ltz v0, :cond_1a

    iget-object v1, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    iget v2, p0, Lj8/b$a;->r:I

    add-int/2addr v2, v0

    aget-object v1, v1, v2

    invoke-static {v1, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    return v0

    :cond_17
    add-int/lit8 v0, v0, -0x1

    goto :goto_7

    :cond_1a
    const/4 p0, -0x1

    return p0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .registers 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lj8/b$a;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    return-object p0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .registers 4

    .line 2
    invoke-direct {p0}, Lj8/b$a;->r()V

    .line 3
    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Lj8/b$a;->s:I

    invoke-virtual {v0, p1, v1}, Li8/c$a;->c(II)V

    .line 4
    new-instance v0, Lj8/b$a$a;

    invoke-direct {v0, p0, p1}, Lj8/b$a$a;-><init>(Lj8/b$a;I)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .registers 2

    invoke-direct {p0}, Lj8/b$a;->s()V

    invoke-direct {p0}, Lj8/b$a;->r()V

    invoke-virtual {p0, p1}, Lj8/b$a;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_f

    invoke-virtual {p0, p1}, Li8/g;->remove(I)Ljava/lang/Object;

    :cond_f
    if-ltz p1, :cond_13

    const/4 p0, 0x1

    return p0

    :cond_13
    const/4 p0, 0x0

    return p0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .registers 5

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lj8/b$a;->s()V

    invoke-direct {p0}, Lj8/b$a;->r()V

    iget v0, p0, Lj8/b$a;->r:I

    iget v1, p0, Lj8/b$a;->s:I

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, p1, v2}, Lj8/b$a;->y(IILjava/util/Collection;Z)I

    move-result p0

    if-lez p0, :cond_18

    const/4 p0, 0x1

    return p0

    :cond_18
    return v2
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .registers 5

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lj8/b$a;->s()V

    invoke-direct {p0}, Lj8/b$a;->r()V

    iget v0, p0, Lj8/b$a;->r:I

    iget v1, p0, Lj8/b$a;->s:I

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, p1, v2}, Lj8/b$a;->y(IILjava/util/Collection;Z)I

    move-result p0

    if-lez p0, :cond_17

    return v2

    :cond_17
    const/4 p0, 0x0

    return p0
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-direct {p0}, Lj8/b$a;->s()V

    invoke-direct {p0}, Lj8/b$a;->r()V

    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Lj8/b$a;->s:I

    invoke-virtual {v0, p1, v1}, Li8/c$a;->b(II)V

    iget-object v0, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    iget p0, p0, Lj8/b$a;->r:I

    add-int v1, p0, p1

    aget-object v1, v0, v1

    add-int/2addr p0, p1

    aput-object p2, v0, p0

    return-object v1
.end method

.method public subList(II)Ljava/util/List;
    .registers 11

    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Lj8/b$a;->s:I

    invoke-virtual {v0, p1, p2, v1}, Li8/c$a;->d(III)V

    new-instance v2, Lj8/b$a;

    iget-object v3, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    iget v0, p0, Lj8/b$a;->r:I

    add-int v4, v0, p1

    sub-int v5, p2, p1

    iget-object v7, p0, Lj8/b$a;->u:Lj8/b;

    move-object v6, p0

    invoke-direct/range {v2 .. v7}, Lj8/b$a;-><init>([Ljava/lang/Object;IILj8/b$a;Lj8/b;)V

    return-object v2
.end method

.method public toArray()[Ljava/lang/Object;
    .registers 3

    .line 6
    invoke-direct {p0}, Lj8/b$a;->r()V

    .line 7
    iget-object v0, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    iget v1, p0, Lj8/b$a;->r:I

    iget p0, p0, Lj8/b$a;->s:I

    add-int/2addr p0, v1

    invoke-static {v0, v1, p0}, Li8/m;->n([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .registers 6

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lj8/b$a;->r()V

    .line 2
    array-length v0, p1

    iget v1, p0, Lj8/b$a;->s:I

    if-ge v0, v1, :cond_20

    .line 3
    iget-object v0, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    iget p0, p0, Lj8/b$a;->r:I

    add-int/2addr v1, p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {v0, p0, v1, p1}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p0

    const-string p1, "copyOfRange(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    .line 4
    :cond_20
    iget-object v0, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    iget v2, p0, Lj8/b$a;->r:I

    add-int/2addr v1, v2

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v2, v1}, Li8/m;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 5
    iget p0, p0, Lj8/b$a;->s:I

    invoke-static {p0, p1}, Li8/s;->g(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    invoke-direct {p0}, Lj8/b$a;->r()V

    iget-object v0, p0, Lj8/b$a;->q:[Ljava/lang/Object;

    iget v1, p0, Lj8/b$a;->r:I

    iget v2, p0, Lj8/b$a;->s:I

    invoke-static {v0, v1, v2, p0}, Lj8/c;->c([Ljava/lang/Object;IILjava/util/Collection;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
