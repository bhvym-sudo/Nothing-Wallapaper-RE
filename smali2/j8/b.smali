.class public final Lj8/b;
.super Li8/g;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;
.implements Ljava/io/Serializable;
.implements Lw8/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj8/b$a;,
        Lj8/b$b;,
        Lj8/b$c;
    }
.end annotation


# static fields
.field private static final t:Lj8/b$b;

.field private static final u:Lj8/b;


# instance fields
.field private q:[Ljava/lang/Object;

.field private r:I

.field private s:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lj8/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj8/b$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lj8/b;->t:Lj8/b$b;

    new-instance v0, Lj8/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj8/b;-><init>(I)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lj8/b;->s:Z

    sput-object v0, Lj8/b;->u:Lj8/b;

    return-void
.end method

.method public constructor <init>(I)V
    .registers 2

    .line 1
    invoke-direct {p0}, Li8/g;-><init>()V

    .line 2
    invoke-static {p1}, Lj8/c;->d(I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lj8/b;->q:[Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/h;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_6

    const/16 p1, 0xa

    .line 3
    :cond_6
    invoke-direct {p0, p1}, Lj8/b;-><init>(I)V

    return-void
.end method

.method private final A(II)V
    .registers 6

    invoke-direct {p0, p2}, Lj8/b;->z(I)V

    iget-object v0, p0, Lj8/b;->q:[Ljava/lang/Object;

    iget v1, p0, Lj8/b;->r:I

    add-int v2, p1, p2

    invoke-static {v0, v0, v2, p1, v1}, Li8/m;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget p1, p0, Lj8/b;->r:I

    add-int/2addr p1, p2

    iput p1, p0, Lj8/b;->r:I

    return-void
.end method

.method private final B()V
    .registers 2

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method private final C(I)Ljava/lang/Object;
    .registers 6

    invoke-direct {p0}, Lj8/b;->B()V

    iget-object v0, p0, Lj8/b;->q:[Ljava/lang/Object;

    aget-object v1, v0, p1

    add-int/lit8 v2, p1, 0x1

    iget v3, p0, Lj8/b;->r:I

    invoke-static {v0, v0, p1, v2, v3}, Li8/m;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget-object p1, p0, Lj8/b;->q:[Ljava/lang/Object;

    iget v0, p0, Lj8/b;->r:I

    add-int/lit8 v0, v0, -0x1

    invoke-static {p1, v0}, Lj8/c;->f([Ljava/lang/Object;I)V

    iget p1, p0, Lj8/b;->r:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lj8/b;->r:I

    return-object v1
.end method

.method private final D(II)V
    .registers 6

    if-lez p2, :cond_5

    invoke-direct {p0}, Lj8/b;->B()V

    :cond_5
    iget-object v0, p0, Lj8/b;->q:[Ljava/lang/Object;

    add-int v1, p1, p2

    iget v2, p0, Lj8/b;->r:I

    invoke-static {v0, v0, p1, v1, v2}, Li8/m;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget-object p1, p0, Lj8/b;->q:[Ljava/lang/Object;

    iget v0, p0, Lj8/b;->r:I

    sub-int v1, v0, p2

    invoke-static {p1, v1, v0}, Lj8/c;->g([Ljava/lang/Object;II)V

    iget p1, p0, Lj8/b;->r:I

    sub-int/2addr p1, p2

    iput p1, p0, Lj8/b;->r:I

    return-void
.end method

.method private final E(IILjava/util/Collection;Z)I
    .registers 10

    const/4 v0, 0x0

    move v1, v0

    :goto_2
    if-ge v0, p2, :cond_20

    iget-object v2, p0, Lj8/b;->q:[Ljava/lang/Object;

    add-int v3, p1, v0

    aget-object v2, v2, v3

    invoke-interface {p3, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-ne v2, p4, :cond_1d

    iget-object v2, p0, Lj8/b;->q:[Ljava/lang/Object;

    add-int/lit8 v4, v1, 0x1

    add-int/2addr v1, p1

    add-int/lit8 v0, v0, 0x1

    aget-object v3, v2, v3

    aput-object v3, v2, v1

    move v1, v4

    goto :goto_2

    :cond_1d
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_20
    sub-int p3, p2, v1

    iget-object p4, p0, Lj8/b;->q:[Ljava/lang/Object;

    add-int/2addr p2, p1

    iget v0, p0, Lj8/b;->r:I

    add-int/2addr p1, v1

    invoke-static {p4, p4, p1, p2, v0}, Li8/m;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget-object p1, p0, Lj8/b;->q:[Ljava/lang/Object;

    iget p2, p0, Lj8/b;->r:I

    sub-int p4, p2, p3

    invoke-static {p1, p4, p2}, Lj8/c;->g([Ljava/lang/Object;II)V

    if-lez p3, :cond_39

    invoke-direct {p0}, Lj8/b;->B()V

    :cond_39
    iget p1, p0, Lj8/b;->r:I

    sub-int/2addr p1, p3

    iput p1, p0, Lj8/b;->r:I

    return p3
.end method

.method public static final synthetic f(Lj8/b;ILjava/util/Collection;I)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lj8/b;->t(ILjava/util/Collection;I)V

    return-void
.end method

.method public static final synthetic g(Lj8/b;ILjava/lang/Object;)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lj8/b;->u(ILjava/lang/Object;)V

    return-void
.end method

.method public static final synthetic m(Lj8/b;)[Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lj8/b;->q:[Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic n(Lj8/b;)I
    .registers 1

    iget p0, p0, Lj8/b;->r:I

    return p0
.end method

.method public static final synthetic o(Lj8/b;)I
    .registers 1

    iget p0, p0, Ljava/util/AbstractList;->modCount:I

    return p0
.end method

.method public static final synthetic p(Lj8/b;)Z
    .registers 1

    iget-boolean p0, p0, Lj8/b;->s:Z

    return p0
.end method

.method public static final synthetic q(Lj8/b;I)Ljava/lang/Object;
    .registers 2

    invoke-direct {p0, p1}, Lj8/b;->C(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r(Lj8/b;II)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lj8/b;->D(II)V

    return-void
.end method

.method public static final synthetic s(Lj8/b;IILjava/util/Collection;Z)I
    .registers 5

    invoke-direct {p0, p1, p2, p3, p4}, Lj8/b;->E(IILjava/util/Collection;Z)I

    move-result p0

    return p0
.end method

.method private final t(ILjava/util/Collection;I)V
    .registers 8

    invoke-direct {p0}, Lj8/b;->B()V

    invoke-direct {p0, p1, p3}, Lj8/b;->A(II)V

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    :goto_b
    if-ge v0, p3, :cond_1a

    iget-object v1, p0, Lj8/b;->q:[Ljava/lang/Object;

    add-int v2, p1, v0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_1a
    return-void
.end method

.method private final u(ILjava/lang/Object;)V
    .registers 4

    invoke-direct {p0}, Lj8/b;->B()V

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lj8/b;->A(II)V

    iget-object p0, p0, Lj8/b;->q:[Ljava/lang/Object;

    aput-object p2, p0, p1

    return-void
.end method

.method private final w()V
    .registers 1

    iget-boolean p0, p0, Lj8/b;->s:Z

    if-nez p0, :cond_5

    return-void

    :cond_5
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0
.end method

.method private final x(Ljava/util/List;)Z
    .registers 4

    iget-object v0, p0, Lj8/b;->q:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget p0, p0, Lj8/b;->r:I

    invoke-static {v0, v1, p0, p1}, Lj8/c;->a([Ljava/lang/Object;IILjava/util/List;)Z

    move-result p0

    return p0
.end method

.method private final y(I)V
    .registers 4

    if-ltz p1, :cond_17

    iget-object v0, p0, Lj8/b;->q:[Ljava/lang/Object;

    array-length v1, v0

    if-le p1, v1, :cond_16

    sget-object v1, Li8/c;->q:Li8/c$a;

    array-length v0, v0

    invoke-virtual {v1, v0, p1}, Li8/c$a;->e(II)I

    move-result p1

    iget-object v0, p0, Lj8/b;->q:[Ljava/lang/Object;

    invoke-static {v0, p1}, Lj8/c;->e([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lj8/b;->q:[Ljava/lang/Object;

    :cond_16
    return-void

    :cond_17
    new-instance p0, Ljava/lang/OutOfMemoryError;

    invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p0
.end method

.method private final z(I)V
    .registers 3

    iget v0, p0, Lj8/b;->r:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Lj8/b;->y(I)V

    return-void
.end method


# virtual methods
.method public a()I
    .registers 1

    iget p0, p0, Lj8/b;->r:I

    return p0
.end method

.method public add(ILjava/lang/Object;)V
    .registers 5

    .line 3
    invoke-direct {p0}, Lj8/b;->w()V

    .line 4
    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Lj8/b;->r:I

    invoke-virtual {v0, p1, v1}, Li8/c$a;->c(II)V

    .line 5
    invoke-direct {p0, p1, p2}, Lj8/b;->u(ILjava/lang/Object;)V

    return-void
.end method

.method public add(Ljava/lang/Object;)Z
    .registers 3

    .line 1
    invoke-direct {p0}, Lj8/b;->w()V

    .line 2
    iget v0, p0, Lj8/b;->r:I

    invoke-direct {p0, v0, p1}, Lj8/b;->u(ILjava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method public addAll(ILjava/util/Collection;)Z
    .registers 5

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lj8/b;->w()V

    .line 5
    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Lj8/b;->r:I

    invoke-virtual {v0, p1, v1}, Li8/c$a;->c(II)V

    .line 6
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v0

    .line 7
    invoke-direct {p0, p1, p2, v0}, Lj8/b;->t(ILjava/util/Collection;I)V

    if-lez v0, :cond_1a

    const/4 p0, 0x1

    return p0

    :cond_1a
    const/4 p0, 0x0

    return p0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .registers 4

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lj8/b;->w()V

    .line 2
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    .line 3
    iget v1, p0, Lj8/b;->r:I

    invoke-direct {p0, v1, p1, v0}, Lj8/b;->t(ILjava/util/Collection;I)V

    if-lez v0, :cond_15

    const/4 p0, 0x1

    return p0

    :cond_15
    const/4 p0, 0x0

    return p0
.end method

.method public b(I)Ljava/lang/Object;
    .registers 4

    invoke-direct {p0}, Lj8/b;->w()V

    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Lj8/b;->r:I

    invoke-virtual {v0, p1, v1}, Li8/c$a;->b(II)V

    invoke-direct {p0, p1}, Lj8/b;->C(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public clear()V
    .registers 3

    invoke-direct {p0}, Lj8/b;->w()V

    const/4 v0, 0x0

    iget v1, p0, Lj8/b;->r:I

    invoke-direct {p0, v0, v1}, Lj8/b;->D(II)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 3

    if-eq p1, p0, :cond_11

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_f

    check-cast p1, Ljava/util/List;

    invoke-direct {p0, p1}, Lj8/b;->x(Ljava/util/List;)Z

    move-result p0

    if-eqz p0, :cond_f

    goto :goto_11

    :cond_f
    const/4 p0, 0x0

    return p0

    :cond_11
    :goto_11
    const/4 p0, 0x1

    return p0
.end method

.method public get(I)Ljava/lang/Object;
    .registers 4

    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Lj8/b;->r:I

    invoke-virtual {v0, p1, v1}, Li8/c$a;->b(II)V

    iget-object p0, p0, Lj8/b;->q:[Ljava/lang/Object;

    aget-object p0, p0, p1

    return-object p0
.end method

.method public hashCode()I
    .registers 3

    iget-object v0, p0, Lj8/b;->q:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget p0, p0, Lj8/b;->r:I

    invoke-static {v0, v1, p0}, Lj8/c;->b([Ljava/lang/Object;II)I

    move-result p0

    return p0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .registers 4

    const/4 v0, 0x0

    :goto_1
    iget v1, p0, Lj8/b;->r:I

    if-ge v0, v1, :cond_13

    iget-object v1, p0, Lj8/b;->q:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-static {v1, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    return v0

    :cond_10
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_13
    const/4 p0, -0x1

    return p0
.end method

.method public isEmpty()Z
    .registers 1

    iget p0, p0, Lj8/b;->r:I

    if-nez p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public iterator()Ljava/util/Iterator;
    .registers 2

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lj8/b;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    return-object p0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .registers 4

    iget v0, p0, Lj8/b;->r:I

    add-int/lit8 v0, v0, -0x1

    :goto_4
    if-ltz v0, :cond_14

    iget-object v1, p0, Lj8/b;->q:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-static {v1, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    return v0

    :cond_11
    add-int/lit8 v0, v0, -0x1

    goto :goto_4

    :cond_14
    const/4 p0, -0x1

    return p0
.end method

.method public listIterator()Ljava/util/ListIterator;
    .registers 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lj8/b;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    return-object p0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .registers 4

    .line 2
    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Lj8/b;->r:I

    invoke-virtual {v0, p1, v1}, Li8/c$a;->c(II)V

    .line 3
    new-instance v0, Lj8/b$c;

    invoke-direct {v0, p0, p1}, Lj8/b$c;-><init>(Lj8/b;I)V

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .registers 2

    invoke-direct {p0}, Lj8/b;->w()V

    invoke-virtual {p0, p1}, Lj8/b;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_c

    invoke-virtual {p0, p1}, Li8/g;->remove(I)Ljava/lang/Object;

    :cond_c
    if-ltz p1, :cond_10

    const/4 p0, 0x1

    return p0

    :cond_10
    const/4 p0, 0x0

    return p0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .registers 4

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lj8/b;->w()V

    iget v0, p0, Lj8/b;->r:I

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, p1, v1}, Lj8/b;->E(IILjava/util/Collection;Z)I

    move-result p0

    if-lez p0, :cond_13

    const/4 p0, 0x1

    return p0

    :cond_13
    return v1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .registers 5

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lj8/b;->w()V

    iget v0, p0, Lj8/b;->r:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p0, v1, v0, p1, v2}, Lj8/b;->E(IILjava/util/Collection;Z)I

    move-result p0

    if-lez p0, :cond_13

    return v2

    :cond_13
    return v1
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-direct {p0}, Lj8/b;->w()V

    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Lj8/b;->r:I

    invoke-virtual {v0, p1, v1}, Li8/c$a;->b(II)V

    iget-object p0, p0, Lj8/b;->q:[Ljava/lang/Object;

    aget-object v0, p0, p1

    aput-object p2, p0, p1

    return-object v0
.end method

.method public subList(II)Ljava/util/List;
    .registers 11

    sget-object v0, Li8/c;->q:Li8/c$a;

    iget v1, p0, Lj8/b;->r:I

    invoke-virtual {v0, p1, p2, v1}, Li8/c$a;->d(III)V

    new-instance v2, Lj8/b$a;

    iget-object v3, p0, Lj8/b;->q:[Ljava/lang/Object;

    sub-int v5, p2, p1

    const/4 v6, 0x0

    move-object v7, p0

    move v4, p1

    invoke-direct/range {v2 .. v7}, Lj8/b$a;-><init>([Ljava/lang/Object;IILj8/b$a;Lj8/b;)V

    return-object v2
.end method

.method public toArray()[Ljava/lang/Object;
    .registers 3

    .line 5
    iget-object v0, p0, Lj8/b;->q:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget p0, p0, Lj8/b;->r:I

    invoke-static {v0, v1, p0}, Li8/m;->n([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .registers 5

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    array-length v0, p1

    iget v1, p0, Lj8/b;->r:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_1b

    .line 2
    iget-object p0, p0, Lj8/b;->q:[Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p0, v2, v1, p1}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p0

    const-string p1, "copyOfRange(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    .line 3
    :cond_1b
    iget-object v0, p0, Lj8/b;->q:[Ljava/lang/Object;

    invoke-static {v0, p1, v2, v2, v1}, Li8/m;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 4
    iget p0, p0, Lj8/b;->r:I

    invoke-static {p0, p1}, Li8/s;->g(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    iget-object v0, p0, Lj8/b;->q:[Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lj8/b;->r:I

    invoke-static {v0, v1, v2, p0}, Lj8/c;->c([Ljava/lang/Object;IILjava/util/Collection;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final v()Ljava/util/List;
    .registers 2

    invoke-direct {p0}, Lj8/b;->w()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj8/b;->s:Z

    iget v0, p0, Lj8/b;->r:I

    if-lez v0, :cond_b

    return-object p0

    :cond_b
    sget-object p0, Lj8/b;->u:Lj8/b;

    return-object p0
.end method
