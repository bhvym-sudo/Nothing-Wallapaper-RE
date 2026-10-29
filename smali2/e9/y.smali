.class public final Le9/y;
.super Le9/h;
.source "SourceFile"


# instance fields
.field private final transient v:[[B

.field private final transient w:[I


# direct methods
.method public constructor <init>([[B[I)V
    .registers 4

    const-string v0, "segments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "directory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Le9/h;->u:Le9/h;

    invoke-virtual {v0}, Le9/h;->i()[B

    move-result-object v0

    invoke-direct {p0, v0}, Le9/h;-><init>([B)V

    iput-object p1, p0, Le9/y;->v:[[B

    iput-object p2, p0, Le9/y;->w:[I

    return-void
.end method

.method private final D()Le9/h;
    .registers 2

    new-instance v0, Le9/h;

    invoke-virtual {p0}, Le9/y;->C()[B

    move-result-object p0

    invoke-direct {v0, p0}, Le9/h;-><init>([B)V

    return-object v0
.end method


# virtual methods
.method public final A()[I
    .registers 1

    iget-object p0, p0, Le9/y;->w:[I

    return-object p0
.end method

.method public final B()[[B
    .registers 1

    iget-object p0, p0, Le9/y;->v:[[B

    return-object p0
.end method

.method public C()[B
    .registers 10

    invoke-virtual {p0}, Le9/h;->v()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object v1

    array-length v1, v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_e
    if-ge v2, v1, :cond_30

    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v5

    add-int v6, v1, v2

    aget v5, v5, v6

    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v6

    aget v6, v6, v2

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object v7

    aget-object v7, v7, v2

    sub-int v3, v6, v3

    add-int v8, v5, v3

    invoke-static {v7, v0, v4, v5, v8}, Li8/m;->d([B[BIII)[B

    add-int/2addr v4, v3

    add-int/lit8 v2, v2, 0x1

    move v3, v6

    goto :goto_e

    :cond_30
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .registers 1

    invoke-direct {p0}, Le9/y;->D()Le9/h;

    move-result-object p0

    invoke-virtual {p0}, Le9/h;->d()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Le9/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_20

    check-cast p1, Le9/h;

    invoke-virtual {p1}, Le9/h;->v()I

    move-result v1

    invoke-virtual {p0}, Le9/h;->v()I

    move-result v3

    if-ne v1, v3, :cond_20

    invoke-virtual {p0}, Le9/h;->v()I

    move-result v1

    invoke-virtual {p0, v2, p1, v2, v1}, Le9/y;->q(ILe9/h;II)Z

    move-result p0

    if-eqz p0, :cond_20

    return v0

    :cond_20
    return v2
.end method

.method public f(Ljava/lang/String;)Le9/h;
    .registers 8

    const-string v0, "algorithm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_10
    if-ge v1, v0, :cond_2f

    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v3

    add-int v4, v0, v1

    aget v3, v3, v4

    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v4

    aget v4, v4, v1

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object v5

    aget-object v5, v5, v1

    sub-int v2, v4, v2

    invoke-virtual {p1, v5, v3, v2}, Ljava/security/MessageDigest;->update([BII)V

    add-int/lit8 v1, v1, 0x1

    move v2, v4

    goto :goto_10

    :cond_2f
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    new-instance p1, Le9/h;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p1, p0}, Le9/h;-><init>([B)V

    return-object p1
.end method

.method public hashCode()I
    .registers 9

    invoke-virtual {p0}, Le9/h;->k()I

    move-result v0

    if-eqz v0, :cond_7

    return v0

    :cond_7
    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move v3, v2

    move v2, v1

    :goto_10
    if-ge v1, v0, :cond_37

    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v4

    add-int v5, v0, v1

    aget v4, v4, v5

    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v5

    aget v5, v5, v1

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object v6

    aget-object v6, v6, v1

    sub-int v2, v5, v2

    add-int/2addr v2, v4

    :goto_29
    if-ge v4, v2, :cond_33

    mul-int/lit8 v3, v3, 0x1f

    aget-byte v7, v6, v4

    add-int/2addr v3, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_29

    :cond_33
    add-int/lit8 v1, v1, 0x1

    move v2, v5

    goto :goto_10

    :cond_37
    invoke-virtual {p0, v3}, Le9/h;->s(I)V

    return v3
.end method

.method public l()I
    .registers 2

    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v0

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object p0

    array-length p0, p0

    add-int/lit8 p0, p0, -0x1

    aget p0, v0, p0

    return p0
.end method

.method public n()Ljava/lang/String;
    .registers 1

    invoke-direct {p0}, Le9/y;->D()Le9/h;

    move-result-object p0

    invoke-virtual {p0}, Le9/h;->n()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public o()[B
    .registers 1

    invoke-virtual {p0}, Le9/y;->C()[B

    move-result-object p0

    return-object p0
.end method

.method public p(I)B
    .registers 9

    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v0

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object v1

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    int-to-long v1, v0

    int-to-long v3, p1

    const-wide/16 v5, 0x1

    invoke-static/range {v1 .. v6}, Le9/b;->b(JJJ)V

    invoke-static {p0, p1}, Lf9/c;->b(Le9/y;I)I

    move-result v0

    if-nez v0, :cond_1c

    const/4 v1, 0x0

    goto :goto_24

    :cond_1c
    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v1

    add-int/lit8 v2, v0, -0x1

    aget v1, v1, v2

    :goto_24
    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v2

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object v3

    array-length v3, v3

    add-int/2addr v3, v0

    aget v2, v2, v3

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object p0

    aget-object p0, p0, v0

    sub-int/2addr p1, v1

    add-int/2addr p1, v2

    aget-byte p0, p0, p1

    return p0
.end method

.method public q(ILe9/h;II)Z
    .registers 11

    const-string v0, "other"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-ltz p1, :cond_53

    invoke-virtual {p0}, Le9/h;->v()I

    move-result v1

    sub-int/2addr v1, p4

    if-le p1, v1, :cond_10

    goto :goto_53

    :cond_10
    add-int/2addr p4, p1

    invoke-static {p0, p1}, Lf9/c;->b(Le9/y;I)I

    move-result v1

    :goto_15
    if-ge p1, p4, :cond_51

    if-nez v1, :cond_1b

    move v2, v0

    goto :goto_23

    :cond_1b
    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v2

    add-int/lit8 v3, v1, -0x1

    aget v2, v2, v3

    :goto_23
    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v3

    aget v3, v3, v1

    sub-int/2addr v3, v2

    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v4

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object v5

    array-length v5, v5

    add-int/2addr v5, v1

    aget v4, v4, v5

    add-int/2addr v3, v2

    invoke-static {p4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr v3, p1

    sub-int v2, p1, v2

    add-int/2addr v4, v2

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object v2

    aget-object v2, v2, v1

    invoke-virtual {p2, p3, v2, v4, v3}, Le9/h;->r(I[BII)Z

    move-result v2

    if-nez v2, :cond_4c

    return v0

    :cond_4c
    add-int/2addr p3, v3

    add-int/2addr p1, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_15

    :cond_51
    const/4 p0, 0x1

    return p0

    :cond_53
    :goto_53
    return v0
.end method

.method public r(I[BII)Z
    .registers 11

    const-string v0, "other"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-ltz p1, :cond_59

    invoke-virtual {p0}, Le9/h;->v()I

    move-result v1

    sub-int/2addr v1, p4

    if-gt p1, v1, :cond_59

    if-ltz p3, :cond_59

    array-length v1, p2

    sub-int/2addr v1, p4

    if-le p3, v1, :cond_16

    goto :goto_59

    :cond_16
    add-int/2addr p4, p1

    invoke-static {p0, p1}, Lf9/c;->b(Le9/y;I)I

    move-result v1

    :goto_1b
    if-ge p1, p4, :cond_57

    if-nez v1, :cond_21

    move v2, v0

    goto :goto_29

    :cond_21
    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v2

    add-int/lit8 v3, v1, -0x1

    aget v2, v2, v3

    :goto_29
    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v3

    aget v3, v3, v1

    sub-int/2addr v3, v2

    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v4

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object v5

    array-length v5, v5

    add-int/2addr v5, v1

    aget v4, v4, v5

    add-int/2addr v3, v2

    invoke-static {p4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr v3, p1

    sub-int v2, p1, v2

    add-int/2addr v4, v2

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object v2

    aget-object v2, v2, v1

    invoke-static {v2, v4, p2, p3, v3}, Le9/b;->a([BI[BII)Z

    move-result v2

    if-nez v2, :cond_52

    return v0

    :cond_52
    add-int/2addr p3, v3

    add-int/2addr p1, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1b

    :cond_57
    const/4 p0, 0x1

    return p0

    :cond_59
    :goto_59
    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    invoke-direct {p0}, Le9/y;->D()Le9/h;

    move-result-object p0

    invoke-virtual {p0}, Le9/h;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public x()Le9/h;
    .registers 1

    invoke-direct {p0}, Le9/y;->D()Le9/h;

    move-result-object p0

    invoke-virtual {p0}, Le9/h;->x()Le9/h;

    move-result-object p0

    return-object p0
.end method

.method public z(Le9/e;II)V
    .registers 15

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    add-int v0, p2, p3

    invoke-static {p0, p2}, Lf9/c;->b(Le9/y;I)I

    move-result v1

    :goto_b
    if-ge p2, v0, :cond_5f

    if-nez v1, :cond_11

    const/4 v2, 0x0

    goto :goto_19

    :cond_11
    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v2

    add-int/lit8 v3, v1, -0x1

    aget v2, v2, v3

    :goto_19
    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v3

    aget v3, v3, v1

    sub-int/2addr v3, v2

    invoke-virtual {p0}, Le9/y;->A()[I

    move-result-object v4

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object v5

    array-length v5, v5

    add-int/2addr v5, v1

    aget v4, v4, v5

    add-int/2addr v3, v2

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr v3, p2

    sub-int v2, p2, v2

    add-int v7, v4, v2

    invoke-virtual {p0}, Le9/y;->B()[[B

    move-result-object v2

    aget-object v6, v2, v1

    new-instance v5, Le9/w;

    add-int v8, v7, v3

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v10}, Le9/w;-><init>([BIIZZ)V

    iget-object v2, p1, Le9/e;->q:Le9/w;

    if-nez v2, :cond_50

    iput-object v5, v5, Le9/w;->g:Le9/w;

    iput-object v5, v5, Le9/w;->f:Le9/w;

    iput-object v5, p1, Le9/e;->q:Le9/w;

    goto :goto_5b

    :cond_50
    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v2, v2, Le9/w;->g:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v2, v5}, Le9/w;->c(Le9/w;)Le9/w;

    :goto_5b
    add-int/2addr p2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_5f
    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide v0

    int-to-long p2, p3

    add-long/2addr v0, p2

    invoke-virtual {p1, v0, v1}, Le9/e;->W0(J)V

    return-void
.end method
