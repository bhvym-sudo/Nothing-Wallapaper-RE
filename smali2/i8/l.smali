.class public final Li8/l;
.super Li8/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li8/l$a;
    }
.end annotation


# static fields
.field public static final t:Li8/l$a;

.field private static final u:[Ljava/lang/Object;


# instance fields
.field private q:I

.field private r:[Ljava/lang/Object;

.field private s:I


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Li8/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li8/l$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Li8/l;->t:Li8/l$a;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Li8/l;->u:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 6
    invoke-direct {p0}, Li8/g;-><init>()V

    .line 7
    sget-object v0, Li8/l;->u:[Ljava/lang/Object;

    iput-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .registers 4

    .line 1
    invoke-direct {p0}, Li8/g;-><init>()V

    if-nez p1, :cond_8

    .line 2
    sget-object p1, Li8/l;->u:[Ljava/lang/Object;

    goto :goto_c

    :cond_8
    if-lez p1, :cond_f

    .line 3
    new-array p1, p1, [Ljava/lang/Object;

    .line 4
    :goto_c
    iput-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    return-void

    .line 5
    :cond_f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Illegal Capacity: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final f(ILjava/util/Collection;)V
    .registers 7

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iget-object v1, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v1, v1

    :goto_7
    if-ge p1, v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_7

    :cond_1a
    iget p1, p0, Li8/l;->q:I

    const/4 v1, 0x0

    :goto_1d
    if-ge v1, p1, :cond_30

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_30

    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1d

    :cond_30
    invoke-virtual {p0}, Li8/g;->size()I

    move-result p1

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    add-int/2addr p1, p2

    iput p1, p0, Li8/l;->s:I

    return-void
.end method

.method private final g(I)V
    .registers 6

    new-array p1, p1, [Ljava/lang/Object;

    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    iget v1, p0, Li8/l;->q:I

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v1, v0

    iget v2, p0, Li8/l;->q:I

    sub-int/2addr v1, v2

    invoke-static {v0, p1, v1, v3, v2}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iput v3, p0, Li8/l;->q:I

    iput-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    return-void
.end method

.method private final m(I)I
    .registers 2

    if-nez p1, :cond_9

    iget-object p0, p0, Li8/l;->r:[Ljava/lang/Object;

    invoke-static {p0}, Li8/q;->H([Ljava/lang/Object;)I

    move-result p0

    return p0

    :cond_9
    add-int/lit8 p1, p1, -0x1

    return p1
.end method

.method private final n(I)V
    .registers 4

    if-ltz p1, :cond_22

    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v1, v0

    if-gt p1, v1, :cond_8

    return-void

    :cond_8
    sget-object v1, Li8/l;->u:[Ljava/lang/Object;

    if-ne v0, v1, :cond_17

    const/16 v0, 0xa

    invoke-static {p1, v0}, LB8/h;->f(II)I

    move-result p1

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    return-void

    :cond_17
    sget-object v1, Li8/c;->q:Li8/c$a;

    array-length v0, v0

    invoke-virtual {v1, v0, p1}, Li8/c$a;->e(II)I

    move-result p1

    invoke-direct {p0, p1}, Li8/l;->g(I)V

    return-void

    :cond_22
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Deque is too big."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final o(I)I
    .registers 2

    iget-object p0, p0, Li8/l;->r:[Ljava/lang/Object;

    invoke-static {p0}, Li8/q;->H([Ljava/lang/Object;)I

    move-result p0

    if-ne p1, p0, :cond_a

    const/4 p0, 0x0

    return p0

    :cond_a
    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private final p(I)I
    .registers 2

    if-gez p1, :cond_6

    iget-object p0, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length p0, p0

    add-int/2addr p1, p0

    :cond_6
    return p1
.end method

.method private final q(II)V
    .registers 6

    const/4 v0, 0x0

    if-ge p1, p2, :cond_9

    iget-object p0, p0, Li8/l;->r:[Ljava/lang/Object;

    invoke-static {p0, v0, p1, p2}, Li8/p;->q([Ljava/lang/Object;Ljava/lang/Object;II)V

    return-void

    :cond_9
    iget-object v1, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v2, v1

    invoke-static {v1, v0, p1, v2}, Li8/p;->q([Ljava/lang/Object;Ljava/lang/Object;II)V

    iget-object p0, p0, Li8/l;->r:[Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-static {p0, v0, p1, p2}, Li8/p;->q([Ljava/lang/Object;Ljava/lang/Object;II)V

    return-void
.end method

.method private final r(I)I
    .registers 3

    iget-object p0, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v0, p0

    if-lt p1, v0, :cond_7

    array-length p0, p0

    sub-int/2addr p1, p0

    :cond_7
    return p1
.end method

.method private final s()V
    .registers 2

    iget v0, p0, Ljava/util/AbstractList;->modCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Ljava/util/AbstractList;->modCount:I

    return-void
.end method

.method private final u(II)V
    .registers 9

    iget v0, p0, Li8/l;->q:I

    add-int/lit8 v1, p1, -0x1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Li8/l;->r(I)I

    move-result v0

    iget v1, p0, Li8/l;->q:I

    add-int/lit8 p2, p2, -0x1

    add-int/2addr v1, p2

    invoke-direct {p0, v1}, Li8/l;->r(I)I

    move-result p2

    :goto_12
    if-lez p1, :cond_35

    add-int/lit8 v1, v0, 0x1

    add-int/lit8 v2, p2, 0x1

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v3, p0, Li8/l;->r:[Ljava/lang/Object;

    sub-int/2addr p2, v2

    add-int/lit8 v4, p2, 0x1

    sub-int/2addr v0, v2

    add-int/lit8 v5, v0, 0x1

    invoke-static {v3, v3, v4, v5, v1}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    invoke-direct {p0, v0}, Li8/l;->p(I)I

    move-result v0

    invoke-direct {p0, p2}, Li8/l;->p(I)I

    move-result p2

    sub-int/2addr p1, v2

    goto :goto_12

    :cond_35
    return-void
.end method

.method private final v(II)V
    .registers 7

    iget v0, p0, Li8/l;->q:I

    add-int/2addr v0, p2

    invoke-direct {p0, v0}, Li8/l;->r(I)I

    move-result v0

    iget v1, p0, Li8/l;->q:I

    add-int/2addr v1, p1

    invoke-direct {p0, v1}, Li8/l;->r(I)I

    move-result p1

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v1

    :goto_12
    sub-int/2addr v1, p2

    if-lez v1, :cond_34

    iget-object p2, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v2, p2

    sub-int/2addr v2, v0

    array-length p2, p2

    sub-int/2addr p2, p1

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    add-int v3, v0, p2

    invoke-static {v2, v2, p1, v0, v3}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    invoke-direct {p0, v3}, Li8/l;->r(I)I

    move-result v0

    add-int/2addr p1, p2

    invoke-direct {p0, p1}, Li8/l;->r(I)I

    move-result p1

    goto :goto_12

    :cond_34
    return-void
.end method


# virtual methods
.method public a()I
    .registers 1

    iget p0, p0, Li8/l;->s:I

    return p0
.end method

.method public add(ILjava/lang/Object;)V
    .registers 10

    .line 2
    sget-object v0, Li8/c;->q:Li8/c$a;

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Li8/c$a;->c(II)V

    .line 3
    invoke-virtual {p0}, Li8/g;->size()I

    move-result v0

    if-ne p1, v0, :cond_13

    .line 4
    invoke-virtual {p0, p2}, Li8/l;->addLast(Ljava/lang/Object;)V

    return-void

    :cond_13
    if-nez p1, :cond_19

    .line 5
    invoke-virtual {p0, p2}, Li8/l;->addFirst(Ljava/lang/Object;)V

    return-void

    .line 6
    :cond_19
    invoke-direct {p0}, Li8/l;->s()V

    .line 7
    invoke-virtual {p0}, Li8/g;->size()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Li8/l;->n(I)V

    .line 8
    iget v0, p0, Li8/l;->q:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Li8/l;->r(I)I

    move-result v0

    .line 9
    invoke-virtual {p0}, Li8/g;->size()I

    move-result v2

    add-int/2addr v2, v1

    shr-int/2addr v2, v1

    const/4 v3, 0x0

    if-ge p1, v2, :cond_6d

    .line 10
    invoke-direct {p0, v0}, Li8/l;->m(I)I

    move-result p1

    .line 11
    iget v0, p0, Li8/l;->q:I

    invoke-direct {p0, v0}, Li8/l;->m(I)I

    move-result v0

    .line 12
    iget v2, p0, Li8/l;->q:I

    if-lt p1, v2, :cond_51

    .line 13
    iget-object v3, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v4, v3, v2

    aput-object v4, v3, v0

    add-int/lit8 v4, v2, 0x1

    add-int/lit8 v5, p1, 0x1

    .line 14
    invoke-static {v3, v3, v2, v4, v5}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    goto :goto_66

    .line 15
    :cond_51
    iget-object v4, p0, Li8/l;->r:[Ljava/lang/Object;

    add-int/lit8 v5, v2, -0x1

    array-length v6, v4

    invoke-static {v4, v4, v5, v2, v6}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 16
    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v4, v2

    sub-int/2addr v4, v1

    aget-object v5, v2, v3

    aput-object v5, v2, v4

    add-int/lit8 v4, p1, 0x1

    .line 17
    invoke-static {v2, v2, v3, v1, v4}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 18
    :goto_66
    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    aput-object p2, v2, p1

    .line 19
    iput v0, p0, Li8/l;->q:I

    goto :goto_9a

    .line 20
    :cond_6d
    iget p1, p0, Li8/l;->q:I

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v2

    add-int/2addr p1, v2

    invoke-direct {p0, p1}, Li8/l;->r(I)I

    move-result p1

    if-ge v0, p1, :cond_82

    .line 21
    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v2, v3, v0, p1}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    goto :goto_96

    .line 22
    :cond_82
    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    invoke-static {v2, v2, v1, v3, p1}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 23
    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v2, p1

    sub-int/2addr v2, v1

    aget-object v2, p1, v2

    aput-object v2, p1, v3

    add-int/lit8 v2, v0, 0x1

    .line 24
    array-length v3, p1

    sub-int/2addr v3, v1

    invoke-static {p1, p1, v2, v0, v3}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 25
    :goto_96
    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    aput-object p2, p1, v0

    .line 26
    :goto_9a
    invoke-virtual {p0}, Li8/g;->size()I

    move-result p1

    add-int/2addr p1, v1

    iput p1, p0, Li8/l;->s:I

    return-void
.end method

.method public add(Ljava/lang/Object;)Z
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Li8/l;->addLast(Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method

.method public addAll(ILjava/util/Collection;)Z
    .registers 11

    const-string v0, "elements"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    sget-object v0, Li8/c;->q:Li8/c$a;

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Li8/c$a;->c(II)V

    .line 6
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_16

    return v1

    .line 7
    :cond_16
    invoke-virtual {p0}, Li8/g;->size()I

    move-result v0

    if-ne p1, v0, :cond_21

    .line 8
    invoke-virtual {p0, p2}, Li8/l;->addAll(Ljava/util/Collection;)Z

    move-result p0

    return p0

    .line 9
    :cond_21
    invoke-direct {p0}, Li8/l;->s()V

    .line 10
    invoke-virtual {p0}, Li8/g;->size()I

    move-result v0

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/2addr v0, v2

    invoke-direct {p0, v0}, Li8/l;->n(I)V

    .line 11
    iget v0, p0, Li8/l;->q:I

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v2

    add-int/2addr v0, v2

    invoke-direct {p0, v0}, Li8/l;->r(I)I

    move-result v0

    .line 12
    iget v2, p0, Li8/l;->q:I

    add-int/2addr v2, p1

    invoke-direct {p0, v2}, Li8/l;->r(I)I

    move-result v2

    .line 13
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result v3

    .line 14
    invoke-virtual {p0}, Li8/g;->size()I

    move-result v4

    const/4 v5, 0x1

    add-int/2addr v4, v5

    shr-int/2addr v4, v5

    if-ge p1, v4, :cond_a0

    .line 15
    iget p1, p0, Li8/l;->q:I

    sub-int v0, p1, v3

    if-lt v2, p1, :cond_79

    if-ltz v0, :cond_5d

    .line 16
    iget-object v1, p0, Li8/l;->r:[Ljava/lang/Object;

    invoke-static {v1, v1, v0, p1, v2}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    goto :goto_95

    .line 17
    :cond_5d
    iget-object v4, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v6, v4

    add-int/2addr v0, v6

    sub-int v6, v2, p1

    .line 18
    array-length v7, v4

    sub-int/2addr v7, v0

    if-lt v7, v6, :cond_6b

    .line 19
    invoke-static {v4, v4, v0, p1, v2}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    goto :goto_95

    :cond_6b
    add-int v6, p1, v7

    .line 20
    invoke-static {v4, v4, v0, p1, v6}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 21
    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    iget v4, p0, Li8/l;->q:I

    add-int/2addr v4, v7

    invoke-static {p1, p1, v1, v4, v2}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    goto :goto_95

    .line 22
    :cond_79
    iget-object v4, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v6, v4

    invoke-static {v4, v4, v0, p1, v6}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    if-lt v3, v2, :cond_89

    .line 23
    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v4, p1

    sub-int/2addr v4, v3

    invoke-static {p1, p1, v4, v1, v2}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    goto :goto_95

    .line 24
    :cond_89
    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v4, p1

    sub-int/2addr v4, v3

    invoke-static {p1, p1, v4, v1, v3}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 25
    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    invoke-static {p1, p1, v1, v3, v2}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 26
    :goto_95
    iput v0, p0, Li8/l;->q:I

    sub-int/2addr v2, v3

    .line 27
    invoke-direct {p0, v2}, Li8/l;->p(I)I

    move-result p1

    invoke-direct {p0, p1, p2}, Li8/l;->f(ILjava/util/Collection;)V

    goto :goto_e5

    :cond_a0
    add-int p1, v2, v3

    if-ge v2, v0, :cond_c4

    add-int/2addr v3, v0

    .line 28
    iget-object v4, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v6, v4

    if-gt v3, v6, :cond_ae

    .line 29
    invoke-static {v4, v4, p1, v2, v0}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    goto :goto_e2

    .line 30
    :cond_ae
    array-length v6, v4

    if-lt p1, v6, :cond_b7

    .line 31
    array-length v1, v4

    sub-int/2addr p1, v1

    invoke-static {v4, v4, p1, v2, v0}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    goto :goto_e2

    .line 32
    :cond_b7
    array-length v6, v4

    sub-int/2addr v3, v6

    sub-int v3, v0, v3

    .line 33
    invoke-static {v4, v4, v1, v3, v0}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 34
    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    invoke-static {v0, v0, p1, v2, v3}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    goto :goto_e2

    .line 35
    :cond_c4
    iget-object v4, p0, Li8/l;->r:[Ljava/lang/Object;

    invoke-static {v4, v4, v3, v1, v0}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 36
    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v4, v0

    if-lt p1, v4, :cond_d5

    .line 37
    array-length v1, v0

    sub-int/2addr p1, v1

    array-length v1, v0

    invoke-static {v0, v0, p1, v2, v1}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    goto :goto_e2

    .line 38
    :cond_d5
    array-length v4, v0

    sub-int/2addr v4, v3

    array-length v6, v0

    invoke-static {v0, v0, v1, v4, v6}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 39
    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v1, v0

    sub-int/2addr v1, v3

    invoke-static {v0, v0, p1, v2, v1}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 40
    :goto_e2
    invoke-direct {p0, v2, p2}, Li8/l;->f(ILjava/util/Collection;)V

    :goto_e5
    return v5
.end method

.method public addAll(Ljava/util/Collection;)Z
    .registers 4

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    const/4 p0, 0x0

    return p0

    .line 2
    :cond_d
    invoke-direct {p0}, Li8/l;->s()V

    .line 3
    invoke-virtual {p0}, Li8/g;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Li8/l;->n(I)V

    .line 4
    iget v0, p0, Li8/l;->q:I

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Li8/l;->r(I)I

    move-result v0

    invoke-direct {p0, v0, p1}, Li8/l;->f(ILjava/util/Collection;)V

    const/4 p0, 0x1

    return p0
.end method

.method public final addFirst(Ljava/lang/Object;)V
    .registers 4

    invoke-direct {p0}, Li8/l;->s()V

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Li8/l;->n(I)V

    iget v0, p0, Li8/l;->q:I

    invoke-direct {p0, v0}, Li8/l;->m(I)I

    move-result v0

    iput v0, p0, Li8/l;->q:I

    iget-object v1, p0, Li8/l;->r:[Ljava/lang/Object;

    aput-object p1, v1, v0

    invoke-virtual {p0}, Li8/g;->size()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Li8/l;->s:I

    return-void
.end method

.method public final addLast(Ljava/lang/Object;)V
    .registers 5

    invoke-direct {p0}, Li8/l;->s()V

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Li8/l;->n(I)V

    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    iget v1, p0, Li8/l;->q:I

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {p0, v1}, Li8/l;->r(I)I

    move-result v1

    aput-object p1, v0, v1

    invoke-virtual {p0}, Li8/g;->size()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Li8/l;->s:I

    return-void
.end method

.method public b(I)Ljava/lang/Object;
    .registers 10

    sget-object v0, Li8/c;->q:Li8/c$a;

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Li8/c$a;->b(II)V

    invoke-static {p0}, Li8/u;->m(Ljava/util/List;)I

    move-result v0

    if-ne p1, v0, :cond_14

    invoke-virtual {p0}, Li8/l;->removeLast()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_14
    if-nez p1, :cond_1b

    invoke-virtual {p0}, Li8/l;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1b
    invoke-direct {p0}, Li8/l;->s()V

    iget v0, p0, Li8/l;->q:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Li8/l;->r(I)I

    move-result v0

    iget-object v1, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v2

    const/4 v3, 0x1

    shr-int/2addr v2, v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-ge p1, v2, :cond_62

    iget p1, p0, Li8/l;->q:I

    if-lt v0, p1, :cond_3f

    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    add-int/lit8 v5, p1, 0x1

    invoke-static {v2, v2, v5, p1, v0}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    goto :goto_55

    :cond_3f
    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    invoke-static {p1, p1, v3, v5, v0}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v0, p1

    sub-int/2addr v0, v3

    aget-object v0, p1, v0

    aput-object v0, p1, v5

    iget v0, p0, Li8/l;->q:I

    add-int/lit8 v2, v0, 0x1

    array-length v5, p1

    sub-int/2addr v5, v3

    invoke-static {p1, p1, v2, v0, v5}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    :goto_55
    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    iget v0, p0, Li8/l;->q:I

    aput-object v4, p1, v0

    invoke-direct {p0, v0}, Li8/l;->o(I)I

    move-result p1

    iput p1, p0, Li8/l;->q:I

    goto :goto_92

    :cond_62
    iget p1, p0, Li8/l;->q:I

    invoke-static {p0}, Li8/u;->m(Ljava/util/List;)I

    move-result v2

    add-int/2addr p1, v2

    invoke-direct {p0, p1}, Li8/l;->r(I)I

    move-result p1

    if-gt v0, p1, :cond_79

    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    add-int/lit8 v5, v0, 0x1

    add-int/lit8 v6, p1, 0x1

    invoke-static {v2, v2, v0, v5, v6}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    goto :goto_8e

    :cond_79
    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    add-int/lit8 v6, v0, 0x1

    array-length v7, v2

    invoke-static {v2, v2, v0, v6, v7}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v2, v0

    sub-int/2addr v2, v3

    aget-object v6, v0, v5

    aput-object v6, v0, v2

    add-int/lit8 v2, p1, 0x1

    invoke-static {v0, v0, v5, v3, v2}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    :goto_8e
    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    aput-object v4, v0, p1

    :goto_92
    invoke-virtual {p0}, Li8/g;->size()I

    move-result p1

    sub-int/2addr p1, v3

    iput p1, p0, Li8/l;->s:I

    return-object v1
.end method

.method public clear()V
    .registers 3

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_19

    invoke-direct {p0}, Li8/l;->s()V

    iget v0, p0, Li8/l;->q:I

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Li8/l;->r(I)I

    move-result v0

    iget v1, p0, Li8/l;->q:I

    invoke-direct {p0, v1, v0}, Li8/l;->q(II)V

    :cond_19
    const/4 v0, 0x0

    iput v0, p0, Li8/l;->q:I

    iput v0, p0, Li8/l;->s:I

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .registers 2

    invoke-virtual {p0, p1}, Li8/l;->indexOf(Ljava/lang/Object;)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_9

    const/4 p0, 0x1

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public get(I)Ljava/lang/Object;
    .registers 4

    sget-object v0, Li8/c;->q:Li8/c$a;

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Li8/c$a;->b(II)V

    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    iget v1, p0, Li8/l;->q:I

    add-int/2addr v1, p1

    invoke-direct {p0, v1}, Li8/l;->r(I)I

    move-result p0

    aget-object p0, v0, p0

    return-object p0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .registers 6

    iget v0, p0, Li8/l;->q:I

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Li8/l;->r(I)I

    move-result v0

    iget v1, p0, Li8/l;->q:I

    if-ge v1, v0, :cond_22

    :goto_f
    if-ge v1, v0, :cond_50

    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1f

    iget p0, p0, Li8/l;->q:I

    :goto_1d
    sub-int/2addr v1, p0

    return v1

    :cond_1f
    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    :cond_22
    if-lt v1, v0, :cond_50

    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v2, v2

    :goto_27
    if-ge v1, v2, :cond_39

    iget-object v3, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v3, v3, v1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_36

    iget p0, p0, Li8/l;->q:I

    goto :goto_1d

    :cond_36
    add-int/lit8 v1, v1, 0x1

    goto :goto_27

    :cond_39
    const/4 v1, 0x0

    :goto_3a
    if-ge v1, v0, :cond_50

    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v2, v2, v1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4d

    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length p1, p1

    add-int/2addr v1, p1

    iget p0, p0, Li8/l;->q:I

    goto :goto_1d

    :cond_4d
    add-int/lit8 v1, v1, 0x1

    goto :goto_3a

    :cond_50
    const/4 p0, -0x1

    return p0
.end method

.method public isEmpty()Z
    .registers 1

    invoke-virtual {p0}, Li8/g;->size()I

    move-result p0

    if-nez p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .registers 6

    iget v0, p0, Li8/l;->q:I

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Li8/l;->r(I)I

    move-result v0

    iget v1, p0, Li8/l;->q:I

    const/4 v2, -0x1

    if-ge v1, v0, :cond_27

    add-int/lit8 v0, v0, -0x1

    if-gt v1, v0, :cond_5d

    :goto_14
    iget-object v3, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v3, v3, v0

    invoke-static {p1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_22

    iget p0, p0, Li8/l;->q:I

    :goto_20
    sub-int/2addr v0, p0

    return v0

    :cond_22
    if-eq v0, v1, :cond_5d

    add-int/lit8 v0, v0, -0x1

    goto :goto_14

    :cond_27
    if-le v1, v0, :cond_5d

    add-int/lit8 v0, v0, -0x1

    :goto_2b
    if-ge v2, v0, :cond_41

    iget-object v1, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v1, v1, v0

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3e

    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length p1, p1

    add-int/2addr v0, p1

    iget p0, p0, Li8/l;->q:I

    goto :goto_20

    :cond_3e
    add-int/lit8 v0, v0, -0x1

    goto :goto_2b

    :cond_41
    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    invoke-static {v0}, Li8/q;->H([Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Li8/l;->q:I

    if-gt v1, v0, :cond_5d

    :goto_4b
    iget-object v3, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v3, v3, v0

    invoke-static {p1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_58

    iget p0, p0, Li8/l;->q:I

    goto :goto_20

    :cond_58
    if-eq v0, v1, :cond_5d

    add-int/lit8 v0, v0, -0x1

    goto :goto_4b

    :cond_5d
    return v2
.end method

.method public remove(Ljava/lang/Object;)Z
    .registers 3

    invoke-virtual {p0, p1}, Li8/l;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_9

    const/4 p0, 0x0

    return p0

    :cond_9
    invoke-virtual {p0, p1}, Li8/g;->remove(I)Ljava/lang/Object;

    const/4 p0, 0x1

    return p0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .registers 13

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Li8/l;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_91

    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v0, v0

    if-nez v0, :cond_13

    goto/16 :goto_91

    :cond_13
    iget v0, p0, Li8/l;->q:I

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v2

    add-int/2addr v0, v2

    invoke-direct {p0, v0}, Li8/l;->r(I)I

    move-result v0

    iget v2, p0, Li8/l;->q:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ge v2, v0, :cond_43

    move v5, v2

    :goto_25
    if-ge v2, v0, :cond_3d

    iget-object v6, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v6, v6, v2

    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_39

    iget-object v7, p0, Li8/l;->r:[Ljava/lang/Object;

    add-int/lit8 v8, v5, 0x1

    aput-object v6, v7, v5

    move v5, v8

    goto :goto_3a

    :cond_39
    move v1, v4

    :goto_3a
    add-int/lit8 v2, v2, 0x1

    goto :goto_25

    :cond_3d
    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    invoke-static {p1, v3, v5, v0}, Li8/p;->q([Ljava/lang/Object;Ljava/lang/Object;II)V

    goto :goto_83

    :cond_43
    iget-object v5, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v5, v5

    move v7, v1

    move v6, v2

    :goto_48
    if-ge v2, v5, :cond_62

    iget-object v8, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v9, v8, v2

    aput-object v3, v8, v2

    invoke-interface {p1, v9}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5e

    iget-object v8, p0, Li8/l;->r:[Ljava/lang/Object;

    add-int/lit8 v10, v6, 0x1

    aput-object v9, v8, v6

    move v6, v10

    goto :goto_5f

    :cond_5e
    move v7, v4

    :goto_5f
    add-int/lit8 v2, v2, 0x1

    goto :goto_48

    :cond_62
    invoke-direct {p0, v6}, Li8/l;->r(I)I

    move-result v2

    move v5, v2

    :goto_67
    if-ge v1, v0, :cond_82

    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v6, v2, v1

    aput-object v3, v2, v1

    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7e

    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    aput-object v6, v2, v5

    invoke-direct {p0, v5}, Li8/l;->o(I)I

    move-result v5

    goto :goto_7f

    :cond_7e
    move v7, v4

    :goto_7f
    add-int/lit8 v1, v1, 0x1

    goto :goto_67

    :cond_82
    move v1, v7

    :goto_83
    if-eqz v1, :cond_91

    invoke-direct {p0}, Li8/l;->s()V

    iget p1, p0, Li8/l;->q:I

    sub-int/2addr v5, p1

    invoke-direct {p0, v5}, Li8/l;->p(I)I

    move-result p1

    iput p1, p0, Li8/l;->s:I

    :cond_91
    :goto_91
    return v1
.end method

.method public final removeFirst()Ljava/lang/Object;
    .registers 5

    invoke-virtual {p0}, Li8/l;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_21

    invoke-direct {p0}, Li8/l;->s()V

    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    iget v1, p0, Li8/l;->q:I

    aget-object v2, v0, v1

    const/4 v3, 0x0

    aput-object v3, v0, v1

    invoke-direct {p0, v1}, Li8/l;->o(I)I

    move-result v0

    iput v0, p0, Li8/l;->q:I

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Li8/l;->s:I

    return-object v2

    :cond_21
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string v0, "ArrayDeque is empty."

    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final removeLast()Ljava/lang/Object;
    .registers 5

    invoke-virtual {p0}, Li8/l;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_24

    invoke-direct {p0}, Li8/l;->s()V

    iget v0, p0, Li8/l;->q:I

    invoke-static {p0}, Li8/u;->m(Ljava/util/List;)I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Li8/l;->r(I)I

    move-result v0

    iget-object v1, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v2, v1, v0

    const/4 v3, 0x0

    aput-object v3, v1, v0

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Li8/l;->s:I

    return-object v2

    :cond_24
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string v0, "ArrayDeque is empty."

    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected removeRange(II)V
    .registers 5

    sget-object v0, Li8/c;->q:Li8/c$a;

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v1

    invoke-virtual {v0, p1, p2, v1}, Li8/c$a;->d(III)V

    sub-int v0, p2, p1

    if-nez v0, :cond_e

    return-void

    :cond_e
    invoke-virtual {p0}, Li8/g;->size()I

    move-result v1

    if-ne v0, v1, :cond_18

    invoke-virtual {p0}, Li8/l;->clear()V

    return-void

    :cond_18
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1f

    invoke-virtual {p0, p1}, Li8/g;->remove(I)Ljava/lang/Object;

    return-void

    :cond_1f
    invoke-direct {p0}, Li8/l;->s()V

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v1

    sub-int/2addr v1, p2

    if-ge p1, v1, :cond_3b

    invoke-direct {p0, p1, p2}, Li8/l;->u(II)V

    iget p1, p0, Li8/l;->q:I

    add-int/2addr p1, v0

    invoke-direct {p0, p1}, Li8/l;->r(I)I

    move-result p1

    iget p2, p0, Li8/l;->q:I

    invoke-direct {p0, p2, p1}, Li8/l;->q(II)V

    iput p1, p0, Li8/l;->q:I

    goto :goto_52

    :cond_3b
    invoke-direct {p0, p1, p2}, Li8/l;->v(II)V

    iget p1, p0, Li8/l;->q:I

    invoke-virtual {p0}, Li8/g;->size()I

    move-result p2

    add-int/2addr p1, p2

    invoke-direct {p0, p1}, Li8/l;->r(I)I

    move-result p1

    sub-int p2, p1, v0

    invoke-direct {p0, p2}, Li8/l;->p(I)I

    move-result p2

    invoke-direct {p0, p2, p1}, Li8/l;->q(II)V

    :goto_52
    invoke-virtual {p0}, Li8/g;->size()I

    move-result p1

    sub-int/2addr p1, v0

    iput p1, p0, Li8/l;->s:I

    return-void
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .registers 13

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Li8/l;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_91

    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v0, v0

    if-nez v0, :cond_13

    goto/16 :goto_91

    :cond_13
    iget v0, p0, Li8/l;->q:I

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v2

    add-int/2addr v0, v2

    invoke-direct {p0, v0}, Li8/l;->r(I)I

    move-result v0

    iget v2, p0, Li8/l;->q:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ge v2, v0, :cond_43

    move v5, v2

    :goto_25
    if-ge v2, v0, :cond_3d

    iget-object v6, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v6, v6, v2

    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_39

    iget-object v7, p0, Li8/l;->r:[Ljava/lang/Object;

    add-int/lit8 v8, v5, 0x1

    aput-object v6, v7, v5

    move v5, v8

    goto :goto_3a

    :cond_39
    move v1, v4

    :goto_3a
    add-int/lit8 v2, v2, 0x1

    goto :goto_25

    :cond_3d
    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    invoke-static {p1, v3, v5, v0}, Li8/p;->q([Ljava/lang/Object;Ljava/lang/Object;II)V

    goto :goto_83

    :cond_43
    iget-object v5, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v5, v5

    move v7, v1

    move v6, v2

    :goto_48
    if-ge v2, v5, :cond_62

    iget-object v8, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v9, v8, v2

    aput-object v3, v8, v2

    invoke-interface {p1, v9}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5e

    iget-object v8, p0, Li8/l;->r:[Ljava/lang/Object;

    add-int/lit8 v10, v6, 0x1

    aput-object v9, v8, v6

    move v6, v10

    goto :goto_5f

    :cond_5e
    move v7, v4

    :goto_5f
    add-int/lit8 v2, v2, 0x1

    goto :goto_48

    :cond_62
    invoke-direct {p0, v6}, Li8/l;->r(I)I

    move-result v2

    move v5, v2

    :goto_67
    if-ge v1, v0, :cond_82

    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v6, v2, v1

    aput-object v3, v2, v1

    invoke-interface {p1, v6}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7e

    iget-object v2, p0, Li8/l;->r:[Ljava/lang/Object;

    aput-object v6, v2, v5

    invoke-direct {p0, v5}, Li8/l;->o(I)I

    move-result v5

    goto :goto_7f

    :cond_7e
    move v7, v4

    :goto_7f
    add-int/lit8 v1, v1, 0x1

    goto :goto_67

    :cond_82
    move v1, v7

    :goto_83
    if-eqz v1, :cond_91

    invoke-direct {p0}, Li8/l;->s()V

    iget p1, p0, Li8/l;->q:I

    sub-int/2addr v5, p1

    invoke-direct {p0, v5}, Li8/l;->p(I)I

    move-result p1

    iput p1, p0, Li8/l;->s:I

    :cond_91
    :goto_91
    return v1
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .registers 5

    sget-object v0, Li8/c;->q:Li8/c$a;

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Li8/c$a;->b(II)V

    iget v0, p0, Li8/l;->q:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Li8/l;->r(I)I

    move-result p1

    iget-object p0, p0, Li8/l;->r:[Ljava/lang/Object;

    aget-object v0, p0, p1

    aput-object p2, p0, p1

    return-object v0
.end method

.method public final t()Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0}, Li8/l;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 p0, 0x0

    return-object p0

    :cond_8
    invoke-virtual {p0}, Li8/l;->removeFirst()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public toArray()[Ljava/lang/Object;
    .registers 2

    .line 9
    invoke-virtual {p0}, Li8/g;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, Li8/l;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .registers 9

    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    array-length v0, p1

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v1

    if-lt v0, v1, :cond_e

    :goto_c
    move-object v1, p1

    goto :goto_17

    :cond_e
    invoke-virtual {p0}, Li8/g;->size()I

    move-result v0

    invoke-static {p1, v0}, Li8/n;->a([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    goto :goto_c

    .line 2
    :goto_17
    iget p1, p0, Li8/l;->q:I

    invoke-virtual {p0}, Li8/g;->size()I

    move-result v0

    add-int/2addr p1, v0

    invoke-direct {p0, p1}, Li8/l;->r(I)I

    move-result v4

    .line 3
    iget v3, p0, Li8/l;->q:I

    if-ge v3, v4, :cond_2f

    .line 4
    iget-object v0, p0, Li8/l;->r:[Ljava/lang/Object;

    const/4 v2, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static/range {v0 .. v6}, Li8/p;->l([Ljava/lang/Object;[Ljava/lang/Object;IIIILjava/lang/Object;)[Ljava/lang/Object;

    goto :goto_47

    .line 5
    :cond_2f
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_47

    .line 6
    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    iget v0, p0, Li8/l;->q:I

    array-length v2, p1

    const/4 v3, 0x0

    invoke-static {p1, v1, v3, v0, v2}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 7
    iget-object p1, p0, Li8/l;->r:[Ljava/lang/Object;

    array-length v0, p1

    iget v2, p0, Li8/l;->q:I

    sub-int/2addr v0, v2

    invoke-static {p1, v1, v0, v3, v4}, Li8/p;->h([Ljava/lang/Object;[Ljava/lang/Object;III)[Ljava/lang/Object;

    .line 8
    :cond_47
    :goto_47
    invoke-virtual {p0}, Li8/g;->size()I

    move-result p0

    invoke-static {p0, v1}, Li8/t;->g(I[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
