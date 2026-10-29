.class public final Lj8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;
.implements Ljava/io/Serializable;
.implements Lw8/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj8/d$a;,
        Lj8/d$b;,
        Lj8/d$c;,
        Lj8/d$d;,
        Lj8/d$e;,
        Lj8/d$f;
    }
.end annotation


# static fields
.field public static final D:Lj8/d$a;

.field private static final E:Lj8/d;


# instance fields
.field private A:Lj8/g;

.field private B:Lj8/e;

.field private C:Z

.field private q:[Ljava/lang/Object;

.field private r:[Ljava/lang/Object;

.field private s:[I

.field private t:[I

.field private u:I

.field private v:I

.field private w:I

.field private x:I

.field private y:I

.field private z:Lj8/f;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lj8/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj8/d$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lj8/d;->D:Lj8/d$a;

    new-instance v0, Lj8/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj8/d;-><init>(I)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lj8/d;->C:Z

    sput-object v0, Lj8/d;->E:Lj8/d;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    const/16 v0, 0x8

    .line 9
    invoke-direct {p0, v0}, Lj8/d;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .registers 9

    .line 10
    invoke-static {p1}, Lj8/c;->d(I)[Ljava/lang/Object;

    move-result-object v1

    .line 11
    new-array v3, p1, [I

    .line 12
    sget-object v0, Lj8/d;->D:Lj8/d$a;

    invoke-static {v0, p1}, Lj8/d$a;->a(Lj8/d$a;I)I

    move-result p1

    new-array v4, p1, [I

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    .line 13
    invoke-direct/range {v0 .. v6}, Lj8/d;-><init>([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V

    return-void
.end method

.method private constructor <init>([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V
    .registers 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lj8/d;->q:[Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lj8/d;->r:[Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lj8/d;->s:[I

    .line 5
    iput-object p4, p0, Lj8/d;->t:[I

    .line 6
    iput p5, p0, Lj8/d;->u:I

    .line 7
    iput p6, p0, Lj8/d;->v:I

    .line 8
    sget-object p1, Lj8/d;->D:Lj8/d$a;

    invoke-direct {p0}, Lj8/d;->z()I

    move-result p2

    invoke-static {p1, p2}, Lj8/d$a;->b(Lj8/d$a;I)I

    move-result p1

    iput p1, p0, Lj8/d;->w:I

    return-void
.end method

.method private final D(Ljava/lang/Object;)I
    .registers 3

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    goto :goto_8

    :cond_7
    const/4 p1, 0x0

    :goto_8
    const v0, -0x61c88647

    mul-int/2addr p1, v0

    iget p0, p0, Lj8/d;->w:I

    ushr-int p0, p1, p0

    return p0
.end method

.method private final F(Ljava/util/Collection;)Z
    .registers 4

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    return v1

    :cond_8
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {p0, v0}, Lj8/d;->t(I)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_13
    :goto_13
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-direct {p0, v0}, Lj8/d;->G(Ljava/util/Map$Entry;)Z

    move-result v0

    if-eqz v0, :cond_13

    const/4 v1, 0x1

    goto :goto_13

    :cond_27
    return v1
.end method

.method private final G(Ljava/util/Map$Entry;)Z
    .registers 6

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lj8/d;->k(Ljava/lang/Object;)I

    move-result v0

    invoke-direct {p0}, Lj8/d;->l()[Ljava/lang/Object;

    move-result-object p0

    const/4 v1, 0x1

    if-ltz v0, :cond_16

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    aput-object p1, p0, v0

    return v1

    :cond_16
    neg-int v0, v0

    sub-int/2addr v0, v1

    aget-object v2, p0, v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2b

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    aput-object p1, p0, v0

    return v1

    :cond_2b
    const/4 p0, 0x0

    return p0
.end method

.method private final H(I)Z
    .registers 7

    iget-object v0, p0, Lj8/d;->q:[Ljava/lang/Object;

    aget-object v0, v0, p1

    invoke-direct {p0, v0}, Lj8/d;->D(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lj8/d;->u:I

    :goto_a
    iget-object v2, p0, Lj8/d;->t:[I

    aget v3, v2, v0

    const/4 v4, 0x1

    if-nez v3, :cond_1a

    add-int/lit8 v1, p1, 0x1

    aput v1, v2, v0

    iget-object p0, p0, Lj8/d;->s:[I

    aput v0, p0, p1

    return v4

    :cond_1a
    add-int/lit8 v1, v1, -0x1

    if-gez v1, :cond_20

    const/4 p0, 0x0

    return p0

    :cond_20
    add-int/lit8 v2, v0, -0x1

    if-nez v0, :cond_2a

    invoke-direct {p0}, Lj8/d;->z()I

    move-result v0

    sub-int/2addr v0, v4

    goto :goto_a

    :cond_2a
    move v0, v2

    goto :goto_a
.end method

.method private final I()V
    .registers 2

    iget v0, p0, Lj8/d;->x:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lj8/d;->x:I

    return-void
.end method

.method private final J(I)V
    .registers 5

    invoke-direct {p0}, Lj8/d;->I()V

    iget v0, p0, Lj8/d;->v:I

    invoke-virtual {p0}, Lj8/d;->size()I

    move-result v1

    const/4 v2, 0x0

    if-le v0, v1, :cond_f

    invoke-direct {p0, v2}, Lj8/d;->o(Z)V

    :cond_f
    new-array v0, p1, [I

    iput-object v0, p0, Lj8/d;->t:[I

    sget-object v0, Lj8/d;->D:Lj8/d$a;

    invoke-static {v0, p1}, Lj8/d$a;->b(Lj8/d$a;I)I

    move-result p1

    iput p1, p0, Lj8/d;->w:I

    :goto_1b
    iget p1, p0, Lj8/d;->v:I

    if-ge v2, p1, :cond_31

    add-int/lit8 p1, v2, 0x1

    invoke-direct {p0, v2}, Lj8/d;->H(I)Z

    move-result v0

    if-eqz v0, :cond_29

    move v2, p1

    goto :goto_1b

    :cond_29
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_31
    return-void
.end method

.method private final L(I)V
    .registers 4

    iget-object v0, p0, Lj8/d;->q:[Ljava/lang/Object;

    invoke-static {v0, p1}, Lj8/c;->f([Ljava/lang/Object;I)V

    iget-object v0, p0, Lj8/d;->r:[Ljava/lang/Object;

    if-eqz v0, :cond_c

    invoke-static {v0, p1}, Lj8/c;->f([Ljava/lang/Object;I)V

    :cond_c
    iget-object v0, p0, Lj8/d;->s:[I

    aget v0, v0, p1

    invoke-direct {p0, v0}, Lj8/d;->M(I)V

    iget-object v0, p0, Lj8/d;->s:[I

    const/4 v1, -0x1

    aput v1, v0, p1

    invoke-virtual {p0}, Lj8/d;->size()I

    move-result p1

    add-int/2addr p1, v1

    iput p1, p0, Lj8/d;->y:I

    invoke-direct {p0}, Lj8/d;->I()V

    return-void
.end method

.method private final M(I)V
    .registers 11

    iget v0, p0, Lj8/d;->u:I

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {p0}, Lj8/d;->z()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, LB8/h;->i(II)I

    move-result v0

    const/4 v1, 0x0

    move v2, v0

    move v3, v1

    move v0, p1

    :cond_12
    add-int/lit8 v4, p1, -0x1

    if-nez p1, :cond_1d

    invoke-direct {p0}, Lj8/d;->z()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    goto :goto_1e

    :cond_1d
    move p1, v4

    :goto_1e
    add-int/lit8 v3, v3, 0x1

    iget v4, p0, Lj8/d;->u:I

    if-le v3, v4, :cond_29

    iget-object p0, p0, Lj8/d;->t:[I

    aput v1, p0, v0

    return-void

    :cond_29
    iget-object v4, p0, Lj8/d;->t:[I

    aget v5, v4, p1

    if-nez v5, :cond_32

    aput v1, v4, v0

    return-void

    :cond_32
    const/4 v6, -0x1

    if-gez v5, :cond_3a

    aput v6, v4, v0

    :goto_37
    move v0, p1

    move v3, v1

    goto :goto_57

    :cond_3a
    iget-object v4, p0, Lj8/d;->q:[Ljava/lang/Object;

    add-int/lit8 v7, v5, -0x1

    aget-object v4, v4, v7

    invoke-direct {p0, v4}, Lj8/d;->D(Ljava/lang/Object;)I

    move-result v4

    sub-int/2addr v4, p1

    invoke-direct {p0}, Lj8/d;->z()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    and-int/2addr v4, v8

    if-lt v4, v3, :cond_57

    iget-object v3, p0, Lj8/d;->t:[I

    aput v5, v3, v0

    iget-object v3, p0, Lj8/d;->s:[I

    aput v0, v3, v7

    goto :goto_37

    :cond_57
    :goto_57
    add-int/2addr v2, v6

    if-gez v2, :cond_12

    iget-object p0, p0, Lj8/d;->t:[I

    aput v6, p0, v0

    return-void
.end method

.method private final P(I)Z
    .registers 5

    invoke-virtual {p0}, Lj8/d;->x()I

    move-result v0

    iget v1, p0, Lj8/d;->v:I

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lj8/d;->size()I

    move-result v2

    sub-int/2addr v1, v2

    if-ge v0, p1, :cond_1b

    add-int/2addr v0, v1

    if-lt v0, p1, :cond_1b

    invoke-virtual {p0}, Lj8/d;->x()I

    move-result p0

    div-int/lit8 p0, p0, 0x4

    if-lt v1, p0, :cond_1b

    const/4 p0, 0x1

    return p0

    :cond_1b
    const/4 p0, 0x0

    return p0
.end method

.method public static final synthetic a(Lj8/d;)[Ljava/lang/Object;
    .registers 1

    invoke-direct {p0}, Lj8/d;->l()[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Lj8/d;
    .registers 1

    sget-object v0, Lj8/d;->E:Lj8/d;

    return-object v0
.end method

.method public static final synthetic c(Lj8/d;)[Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lj8/d;->q:[Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic d(Lj8/d;)I
    .registers 1

    iget p0, p0, Lj8/d;->v:I

    return p0
.end method

.method public static final synthetic f(Lj8/d;)I
    .registers 1

    iget p0, p0, Lj8/d;->x:I

    return p0
.end method

.method public static final synthetic g(Lj8/d;)[I
    .registers 1

    iget-object p0, p0, Lj8/d;->s:[I

    return-object p0
.end method

.method public static final synthetic h(Lj8/d;)[Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lj8/d;->r:[Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic i(Lj8/d;I)V
    .registers 2

    invoke-direct {p0, p1}, Lj8/d;->L(I)V

    return-void
.end method

.method private final l()[Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, Lj8/d;->r:[Ljava/lang/Object;

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    invoke-virtual {p0}, Lj8/d;->x()I

    move-result v0

    invoke-static {v0}, Lj8/c;->d(I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj8/d;->r:[Ljava/lang/Object;

    return-object v0
.end method

.method private final o(Z)V
    .registers 9

    iget-object v0, p0, Lj8/d;->r:[Ljava/lang/Object;

    const/4 v1, 0x0

    move v2, v1

    :goto_4
    iget v3, p0, Lj8/d;->v:I

    if-ge v1, v3, :cond_29

    iget-object v3, p0, Lj8/d;->s:[I

    aget v4, v3, v1

    if-ltz v4, :cond_26

    iget-object v5, p0, Lj8/d;->q:[Ljava/lang/Object;

    aget-object v6, v5, v1

    aput-object v6, v5, v2

    if-eqz v0, :cond_1a

    aget-object v5, v0, v1

    aput-object v5, v0, v2

    :cond_1a
    if-eqz p1, :cond_24

    aput v4, v3, v2

    iget-object v3, p0, Lj8/d;->t:[I

    add-int/lit8 v5, v2, 0x1

    aput v5, v3, v4

    :cond_24
    add-int/lit8 v2, v2, 0x1

    :cond_26
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_29
    iget-object p1, p0, Lj8/d;->q:[Ljava/lang/Object;

    invoke-static {p1, v2, v3}, Lj8/c;->g([Ljava/lang/Object;II)V

    if-eqz v0, :cond_35

    iget p1, p0, Lj8/d;->v:I

    invoke-static {v0, v2, p1}, Lj8/c;->g([Ljava/lang/Object;II)V

    :cond_35
    iput v2, p0, Lj8/d;->v:I

    return-void
.end method

.method private final r(Ljava/util/Map;)Z
    .registers 4

    invoke-virtual {p0}, Lj8/d;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    if-ne v0, v1, :cond_18

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lj8/d;->p(Ljava/util/Collection;)Z

    move-result p0

    if-eqz p0, :cond_18

    const/4 p0, 0x1

    return p0

    :cond_18
    const/4 p0, 0x0

    return p0
.end method

.method private final s(I)V
    .registers 4

    if-ltz p1, :cond_43

    invoke-virtual {p0}, Lj8/d;->x()I

    move-result v0

    if-le p1, v0, :cond_42

    sget-object v0, Li8/c;->q:Li8/c$a;

    invoke-virtual {p0}, Lj8/d;->x()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Li8/c$a;->e(II)I

    move-result p1

    iget-object v0, p0, Lj8/d;->q:[Ljava/lang/Object;

    invoke-static {v0, p1}, Lj8/c;->e([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lj8/d;->q:[Ljava/lang/Object;

    iget-object v0, p0, Lj8/d;->r:[Ljava/lang/Object;

    if-eqz v0, :cond_23

    invoke-static {v0, p1}, Lj8/c;->e([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    goto :goto_24

    :cond_23
    const/4 v0, 0x0

    :goto_24
    iput-object v0, p0, Lj8/d;->r:[Ljava/lang/Object;

    iget-object v0, p0, Lj8/d;->s:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lj8/d;->s:[I

    sget-object v0, Lj8/d;->D:Lj8/d$a;

    invoke-static {v0, p1}, Lj8/d$a;->a(Lj8/d$a;I)I

    move-result p1

    invoke-direct {p0}, Lj8/d;->z()I

    move-result v0

    if-le p1, v0, :cond_42

    invoke-direct {p0, p1}, Lj8/d;->J(I)V

    :cond_42
    return-void

    :cond_43
    new-instance p0, Ljava/lang/OutOfMemoryError;

    invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p0
.end method

.method private final t(I)V
    .registers 3

    invoke-direct {p0, p1}, Lj8/d;->P(I)Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lj8/d;->o(Z)V

    return-void

    :cond_b
    iget v0, p0, Lj8/d;->v:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Lj8/d;->s(I)V

    return-void
.end method

.method private final v(Ljava/lang/Object;)I
    .registers 7

    invoke-direct {p0, p1}, Lj8/d;->D(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lj8/d;->u:I

    :goto_6
    iget-object v2, p0, Lj8/d;->t:[I

    aget v2, v2, v0

    const/4 v3, -0x1

    if-nez v2, :cond_e

    return v3

    :cond_e
    if-lez v2, :cond_1d

    iget-object v4, p0, Lj8/d;->q:[Ljava/lang/Object;

    add-int/lit8 v2, v2, -0x1

    aget-object v4, v4, v2

    invoke-static {v4, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1d

    return v2

    :cond_1d
    add-int/2addr v1, v3

    if-gez v1, :cond_21

    return v3

    :cond_21
    add-int/lit8 v2, v0, -0x1

    if-nez v0, :cond_2c

    invoke-direct {p0}, Lj8/d;->z()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_6

    :cond_2c
    move v0, v2

    goto :goto_6
.end method

.method private final w(Ljava/lang/Object;)I
    .registers 4

    iget v0, p0, Lj8/d;->v:I

    :cond_2
    const/4 v1, -0x1

    add-int/2addr v0, v1

    if-ltz v0, :cond_1a

    iget-object v1, p0, Lj8/d;->s:[I

    aget v1, v1, v0

    if-ltz v1, :cond_2

    iget-object v1, p0, Lj8/d;->r:[Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    aget-object v1, v1, v0

    invoke-static {v1, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return v0

    :cond_1a
    return v1
.end method

.method private final z()I
    .registers 1

    iget-object p0, p0, Lj8/d;->t:[I

    array-length p0, p0

    return p0
.end method


# virtual methods
.method public A()Ljava/util/Set;
    .registers 2

    iget-object v0, p0, Lj8/d;->z:Lj8/f;

    if-nez v0, :cond_b

    new-instance v0, Lj8/f;

    invoke-direct {v0, p0}, Lj8/f;-><init>(Lj8/d;)V

    iput-object v0, p0, Lj8/d;->z:Lj8/f;

    :cond_b
    return-object v0
.end method

.method public B()I
    .registers 1

    iget p0, p0, Lj8/d;->y:I

    return p0
.end method

.method public C()Ljava/util/Collection;
    .registers 2

    iget-object v0, p0, Lj8/d;->A:Lj8/g;

    if-nez v0, :cond_b

    new-instance v0, Lj8/g;

    invoke-direct {v0, p0}, Lj8/g;-><init>(Lj8/d;)V

    iput-object v0, p0, Lj8/d;->A:Lj8/g;

    :cond_b
    return-object v0
.end method

.method public final E()Lj8/d$e;
    .registers 2

    new-instance v0, Lj8/d$e;

    invoke-direct {v0, p0}, Lj8/d$e;-><init>(Lj8/d;)V

    return-object v0
.end method

.method public final K(Ljava/util/Map$Entry;)Z
    .registers 5

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lj8/d;->n()V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lj8/d;->v(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    if-gez v0, :cond_14

    return v1

    :cond_14
    iget-object v2, p0, Lj8/d;->r:[Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    aget-object v2, v2, v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v2, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_26

    return v1

    :cond_26
    invoke-direct {p0, v0}, Lj8/d;->L(I)V

    const/4 p0, 0x1

    return p0
.end method

.method public final N(Ljava/lang/Object;)Z
    .registers 2

    invoke-virtual {p0}, Lj8/d;->n()V

    invoke-direct {p0, p1}, Lj8/d;->v(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_b

    const/4 p0, 0x0

    return p0

    :cond_b
    invoke-direct {p0, p1}, Lj8/d;->L(I)V

    const/4 p0, 0x1

    return p0
.end method

.method public final O(Ljava/lang/Object;)Z
    .registers 2

    invoke-virtual {p0}, Lj8/d;->n()V

    invoke-direct {p0, p1}, Lj8/d;->w(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_b

    const/4 p0, 0x0

    return p0

    :cond_b
    invoke-direct {p0, p1}, Lj8/d;->L(I)V

    const/4 p0, 0x1

    return p0
.end method

.method public final Q()Lj8/d$f;
    .registers 2

    new-instance v0, Lj8/d$f;

    invoke-direct {v0, p0}, Lj8/d$f;-><init>(Lj8/d;)V

    return-object v0
.end method

.method public clear()V
    .registers 7

    invoke-virtual {p0}, Lj8/d;->n()V

    iget v0, p0, Lj8/d;->v:I

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    if-ltz v0, :cond_1d

    move v2, v1

    :goto_b
    iget-object v3, p0, Lj8/d;->s:[I

    aget v4, v3, v2

    if-ltz v4, :cond_18

    iget-object v5, p0, Lj8/d;->t:[I

    aput v1, v5, v4

    const/4 v4, -0x1

    aput v4, v3, v2

    :cond_18
    if-eq v2, v0, :cond_1d

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_1d
    iget-object v0, p0, Lj8/d;->q:[Ljava/lang/Object;

    iget v2, p0, Lj8/d;->v:I

    invoke-static {v0, v1, v2}, Lj8/c;->g([Ljava/lang/Object;II)V

    iget-object v0, p0, Lj8/d;->r:[Ljava/lang/Object;

    if-eqz v0, :cond_2d

    iget v2, p0, Lj8/d;->v:I

    invoke-static {v0, v1, v2}, Lj8/c;->g([Ljava/lang/Object;II)V

    :cond_2d
    iput v1, p0, Lj8/d;->y:I

    iput v1, p0, Lj8/d;->v:I

    invoke-direct {p0}, Lj8/d;->I()V

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .registers 2

    invoke-direct {p0, p1}, Lj8/d;->v(Ljava/lang/Object;)I

    move-result p0

    if-ltz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .registers 2

    invoke-direct {p0, p1}, Lj8/d;->w(Ljava/lang/Object;)I

    move-result p0

    if-ltz p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final bridge entrySet()Ljava/util/Set;
    .registers 1

    invoke-virtual {p0}, Lj8/d;->y()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 3

    if-eq p1, p0, :cond_11

    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_f

    check-cast p1, Ljava/util/Map;

    invoke-direct {p0, p1}, Lj8/d;->r(Ljava/util/Map;)Z

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

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    invoke-direct {p0, p1}, Lj8/d;->v(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_8

    const/4 p0, 0x0

    return-object p0

    :cond_8
    iget-object p0, p0, Lj8/d;->r:[Ljava/lang/Object;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    aget-object p0, p0, p1

    return-object p0
.end method

.method public hashCode()I
    .registers 3

    invoke-virtual {p0}, Lj8/d;->u()Lj8/d$b;

    move-result-object p0

    const/4 v0, 0x0

    :goto_5
    invoke-virtual {p0}, Lj8/d$d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {p0}, Lj8/d$b;->m()I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_5

    :cond_11
    return v0
.end method

.method public isEmpty()Z
    .registers 1

    invoke-virtual {p0}, Lj8/d;->size()I

    move-result p0

    if-nez p0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public final k(Ljava/lang/Object;)I
    .registers 9

    invoke-virtual {p0}, Lj8/d;->n()V

    :goto_3
    invoke-direct {p0, p1}, Lj8/d;->D(Ljava/lang/Object;)I

    move-result v0

    iget v1, p0, Lj8/d;->u:I

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {p0}, Lj8/d;->z()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    invoke-static {v1, v2}, LB8/h;->i(II)I

    move-result v1

    const/4 v2, 0x0

    :goto_16
    iget-object v3, p0, Lj8/d;->t:[I

    aget v3, v3, v0

    const/4 v4, 0x1

    if-gtz v3, :cond_4c

    iget v1, p0, Lj8/d;->v:I

    invoke-virtual {p0}, Lj8/d;->x()I

    move-result v3

    if-lt v1, v3, :cond_29

    invoke-direct {p0, v4}, Lj8/d;->t(I)V

    goto :goto_3

    :cond_29
    iget v1, p0, Lj8/d;->v:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Lj8/d;->v:I

    iget-object v5, p0, Lj8/d;->q:[Ljava/lang/Object;

    aput-object p1, v5, v1

    iget-object p1, p0, Lj8/d;->s:[I

    aput v0, p1, v1

    iget-object p1, p0, Lj8/d;->t:[I

    aput v3, p1, v0

    invoke-virtual {p0}, Lj8/d;->size()I

    move-result p1

    add-int/2addr p1, v4

    iput p1, p0, Lj8/d;->y:I

    invoke-direct {p0}, Lj8/d;->I()V

    iget p1, p0, Lj8/d;->u:I

    if-le v2, p1, :cond_4b

    iput v2, p0, Lj8/d;->u:I

    :cond_4b
    return v1

    :cond_4c
    iget-object v5, p0, Lj8/d;->q:[Ljava/lang/Object;

    add-int/lit8 v6, v3, -0x1

    aget-object v5, v5, v6

    invoke-static {v5, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5a

    neg-int p0, v3

    return p0

    :cond_5a
    add-int/lit8 v2, v2, 0x1

    if-le v2, v1, :cond_68

    invoke-direct {p0}, Lj8/d;->z()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {p0, v0}, Lj8/d;->J(I)V

    goto :goto_3

    :cond_68
    add-int/lit8 v3, v0, -0x1

    if-nez v0, :cond_72

    invoke-direct {p0}, Lj8/d;->z()I

    move-result v0

    sub-int/2addr v0, v4

    goto :goto_16

    :cond_72
    move v0, v3

    goto :goto_16
.end method

.method public final bridge keySet()Ljava/util/Set;
    .registers 1

    invoke-virtual {p0}, Lj8/d;->A()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public final m()Ljava/util/Map;
    .registers 2

    invoke-virtual {p0}, Lj8/d;->n()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lj8/d;->C:Z

    invoke-virtual {p0}, Lj8/d;->size()I

    move-result v0

    if-lez v0, :cond_d

    return-object p0

    :cond_d
    sget-object p0, Lj8/d;->E:Lj8/d;

    const-string v0, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final n()V
    .registers 1

    iget-boolean p0, p0, Lj8/d;->C:Z

    if-nez p0, :cond_5

    return-void

    :cond_5
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p0
.end method

.method public final p(Ljava/util/Collection;)Z
    .registers 4

    const-string v0, "m"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1f

    :try_start_16
    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p0, v0}, Lj8/d;->q(Ljava/util/Map$Entry;)Z

    move-result v0
    :try_end_1c
    .catch Ljava/lang/ClassCastException; {:try_start_16 .. :try_end_1c} :catch_1f

    if-nez v0, :cond_9

    nop

    :catch_1f
    :cond_1f
    return v1

    :cond_20
    const/4 p0, 0x1

    return p0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    invoke-virtual {p0}, Lj8/d;->n()V

    invoke-virtual {p0, p1}, Lj8/d;->k(Ljava/lang/Object;)I

    move-result p1

    invoke-direct {p0}, Lj8/d;->l()[Ljava/lang/Object;

    move-result-object p0

    if-gez p1, :cond_15

    neg-int p1, p1

    add-int/lit8 p1, p1, -0x1

    aget-object v0, p0, p1

    aput-object p2, p0, p1

    return-object v0

    :cond_15
    aput-object p2, p0, p1

    const/4 p0, 0x0

    return-object p0
.end method

.method public putAll(Ljava/util/Map;)V
    .registers 3

    const-string v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lj8/d;->n()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-direct {p0, p1}, Lj8/d;->F(Ljava/util/Collection;)Z

    return-void
.end method

.method public final q(Ljava/util/Map$Entry;)Z
    .registers 3

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lj8/d;->v(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_11

    const/4 p0, 0x0

    return p0

    :cond_11
    iget-object p0, p0, Lj8/d;->r:[Ljava/lang/Object;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    aget-object p0, p0, v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0}, Lj8/d;->n()V

    invoke-direct {p0, p1}, Lj8/d;->v(Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_b

    const/4 p0, 0x0

    return-object p0

    :cond_b
    iget-object v0, p0, Lj8/d;->r:[Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    aget-object v0, v0, p1

    invoke-direct {p0, p1}, Lj8/d;->L(I)V

    return-object v0
.end method

.method public final bridge size()I
    .registers 1

    invoke-virtual {p0}, Lj8/d;->B()I

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lj8/d;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lj8/d;->u()Lj8/d$b;

    move-result-object p0

    const/4 v1, 0x0

    :goto_17
    invoke-virtual {p0}, Lj8/d$d;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2a

    if-lez v1, :cond_24

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_24
    invoke-virtual {p0, v0}, Lj8/d$b;->l(Ljava/lang/StringBuilder;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_17

    :cond_2a
    const-string p0, "}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final u()Lj8/d$b;
    .registers 2

    new-instance v0, Lj8/d$b;

    invoke-direct {v0, p0}, Lj8/d$b;-><init>(Lj8/d;)V

    return-object v0
.end method

.method public final bridge values()Ljava/util/Collection;
    .registers 1

    invoke-virtual {p0}, Lj8/d;->C()Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public final x()I
    .registers 1

    iget-object p0, p0, Lj8/d;->q:[Ljava/lang/Object;

    array-length p0, p0

    return p0
.end method

.method public y()Ljava/util/Set;
    .registers 2

    iget-object v0, p0, Lj8/d;->B:Lj8/e;

    if-nez v0, :cond_b

    new-instance v0, Lj8/e;

    invoke-direct {v0, p0}, Lj8/e;-><init>(Lj8/d;)V

    iput-object v0, p0, Lj8/d;->B:Lj8/e;

    :cond_b
    return-object v0
.end method
