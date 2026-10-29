.class public Le9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le9/h$a;
    }
.end annotation


# static fields
.field public static final t:Le9/h$a;

.field public static final u:Le9/h;


# instance fields
.field private final q:[B

.field private transient r:I

.field private transient s:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Le9/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le9/h$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Le9/h;->t:Le9/h$a;

    new-instance v0, Le9/h;

    const/4 v1, 0x0

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Le9/h;-><init>([B)V

    sput-object v0, Le9/h;->u:Le9/h;

    return-void
.end method

.method public constructor <init>([B)V
    .registers 3

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/h;->q:[B

    return-void
.end method

.method public static final g(Ljava/lang/String;)Le9/h;
    .registers 2

    sget-object v0, Le9/h;->t:Le9/h$a;

    invoke-virtual {v0, p0}, Le9/h$a;->c(Ljava/lang/String;)Le9/h;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .registers 2

    check-cast p1, Le9/h;

    invoke-virtual {p0, p1}, Le9/h;->e(Le9/h;)I

    move-result p0

    return p0
.end method

.method public d()Ljava/lang/String;
    .registers 3

    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Le9/a;->b([B[BILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public e(Le9/h;)I
    .registers 11

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le9/h;->v()I

    move-result v0

    invoke-virtual {p1}, Le9/h;->v()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_13
    const/4 v5, -0x1

    const/4 v6, 0x1

    if-ge v4, v2, :cond_2c

    invoke-virtual {p0, v4}, Le9/h;->h(I)B

    move-result v7

    and-int/lit16 v7, v7, 0xff

    invoke-virtual {p1, v4}, Le9/h;->h(I)B

    move-result v8

    and-int/lit16 v8, v8, 0xff

    if-ne v7, v8, :cond_28

    add-int/lit8 v4, v4, 0x1

    goto :goto_13

    :cond_28
    if-ge v7, v8, :cond_2b

    return v5

    :cond_2b
    return v6

    :cond_2c
    if-ne v0, v1, :cond_2f

    return v3

    :cond_2f
    if-ge v0, v1, :cond_32

    return v5

    :cond_32
    return v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Le9/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_26

    check-cast p1, Le9/h;

    invoke-virtual {p1}, Le9/h;->v()I

    move-result v1

    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object v3

    array-length v3, v3

    if-ne v1, v3, :cond_26

    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object v1

    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object p0

    array-length p0, p0

    invoke-virtual {p1, v2, v1, v2, p0}, Le9/h;->r(I[BII)Z

    move-result p0

    if-eqz p0, :cond_26

    return v0

    :cond_26
    return v2
.end method

.method public f(Ljava/lang/String;)Le9/h;
    .registers 4

    const-string v0, "algorithm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    iget-object v0, p0, Le9/h;->q:[B

    const/4 v1, 0x0

    invoke-virtual {p0}, Le9/h;->v()I

    move-result p0

    invoke-virtual {p1, v0, v1, p0}, Ljava/security/MessageDigest;->update([BII)V

    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    new-instance p1, Le9/h;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p1, p0}, Le9/h;-><init>([B)V

    return-object p1
.end method

.method public final h(I)B
    .registers 2

    invoke-virtual {p0, p1}, Le9/h;->p(I)B

    move-result p0

    return p0
.end method

.method public hashCode()I
    .registers 2

    invoke-virtual {p0}, Le9/h;->k()I

    move-result v0

    if-eqz v0, :cond_7

    return v0

    :cond_7
    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    invoke-virtual {p0, v0}, Le9/h;->s(I)V

    return v0
.end method

.method public final i()[B
    .registers 1

    iget-object p0, p0, Le9/h;->q:[B

    return-object p0
.end method

.method public final k()I
    .registers 1

    iget p0, p0, Le9/h;->r:I

    return p0
.end method

.method public l()I
    .registers 1

    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object p0

    array-length p0, p0

    return p0
.end method

.method public final m()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Le9/h;->s:Ljava/lang/String;

    return-object p0
.end method

.method public n()Ljava/lang/String;
    .registers 9

    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object v0

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [C

    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_10
    if-ge v2, v1, :cond_31

    aget-byte v4, p0, v2

    add-int/lit8 v5, v3, 0x1

    invoke-static {}, Lf9/b;->f()[C

    move-result-object v6

    shr-int/lit8 v7, v4, 0x4

    and-int/lit8 v7, v7, 0xf

    aget-char v6, v6, v7

    aput-char v6, v0, v3

    add-int/lit8 v3, v3, 0x2

    invoke-static {}, Lf9/b;->f()[C

    move-result-object v6

    and-int/lit8 v4, v4, 0xf

    aget-char v4, v6, v4

    aput-char v4, v0, v5

    add-int/lit8 v2, v2, 0x1

    goto :goto_10

    :cond_31
    invoke-static {v0}, LE8/i;->x([C)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public o()[B
    .registers 1

    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object p0

    return-object p0
.end method

.method public p(I)B
    .registers 2

    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object p0

    aget-byte p0, p0, p1

    return p0
.end method

.method public q(ILe9/h;II)Z
    .registers 6

    const-string v0, "other"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object p0

    invoke-virtual {p2, p3, p0, p1, p4}, Le9/h;->r(I[BII)Z

    move-result p0

    return p0
.end method

.method public r(I[BII)Z
    .registers 6

    const-string v0, "other"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p1, :cond_21

    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object v0

    array-length v0, v0

    sub-int/2addr v0, p4

    if-gt p1, v0, :cond_21

    if-ltz p3, :cond_21

    array-length v0, p2

    sub-int/2addr v0, p4

    if-gt p3, v0, :cond_21

    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object p0

    invoke-static {p0, p1, p2, p3, p4}, Le9/b;->a([BI[BII)Z

    move-result p0

    if-eqz p0, :cond_21

    const/4 p0, 0x1

    return p0

    :cond_21
    const/4 p0, 0x0

    return p0
.end method

.method public final s(I)V
    .registers 2

    iput p1, p0, Le9/h;->r:I

    return-void
.end method

.method public final t(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Le9/h;->s:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 20

    invoke-virtual/range {p0 .. p0}, Le9/h;->i()[B

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_a

    const-string v0, "[size=0]"

    return-object v0

    :cond_a
    invoke-virtual/range {p0 .. p0}, Le9/h;->i()[B

    move-result-object v0

    const/16 v1, 0x40

    invoke-static {v0, v1}, Lf9/b;->a([BI)I

    move-result v0

    const/4 v2, -0x1

    const-string v3, "\u2026]"

    const/4 v4, 0x0

    const-string v5, "[size="

    const/16 v6, 0x5d

    if-ne v0, v2, :cond_b4

    invoke-virtual/range {p0 .. p0}, Le9/h;->i()[B

    move-result-object v0

    array-length v0, v0

    if-gt v0, v1, :cond_3e

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[hex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Le9/h;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Le9/h;->i()[B

    move-result-object v2

    array-length v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " hex="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Le9/b;->d(Le9/h;I)I

    move-result v1

    invoke-virtual {v2}, Le9/h;->i()[B

    move-result-object v5

    array-length v5, v5

    if-gt v1, v5, :cond_8f

    if-ltz v1, :cond_87

    invoke-virtual {v2}, Le9/h;->i()[B

    move-result-object v5

    array-length v5, v5

    if-ne v1, v5, :cond_6a

    goto :goto_78

    :cond_6a
    new-instance v5, Le9/h;

    invoke-virtual {v2}, Le9/h;->i()[B

    move-result-object v2

    invoke-static {v2, v4, v1}, Li8/m;->m([BII)[B

    move-result-object v1

    invoke-direct {v5, v1}, Le9/h;-><init>([B)V

    move-object v2, v5

    :goto_78
    invoke-virtual {v2}, Le9/h;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_87
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "endIndex < beginIndex"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "endIndex > length("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Le9/h;->i()[B

    move-result-object v1

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b4
    move-object/from16 v2, p0

    invoke-virtual {v2}, Le9/h;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    const-string v4, "substring(...)"

    invoke-static {v7, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v8, "\\"

    const-string v9, "\\\\"

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, LE8/i;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    const/16 v17, 0x4

    const/16 v18, 0x0

    const-string v14, "\n"

    const-string v15, "\\n"

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, LE8/i;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "\r"

    const-string v9, "\\r"

    invoke-static/range {v7 .. v12}, LE8/i;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_10a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Le9/h;->i()[B

    move-result-object v1

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_10a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Le9/h;
    .registers 2

    const-string v0, "SHA-256"

    invoke-virtual {p0, v0}, Le9/h;->f(Ljava/lang/String;)Le9/h;

    move-result-object p0

    return-object p0
.end method

.method public final v()I
    .registers 1

    invoke-virtual {p0}, Le9/h;->l()I

    move-result p0

    return p0
.end method

.method public final w(Le9/h;)Z
    .registers 4

    const-string v0, "prefix"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Le9/h;->v()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1, v1, v0}, Le9/h;->q(ILe9/h;II)Z

    move-result p0

    return p0
.end method

.method public x()Le9/h;
    .registers 6

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object v1

    array-length v1, v1

    if-ge v0, v1, :cond_47

    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object v1

    aget-byte v1, v1, v0

    const/16 v2, 0x41

    if-lt v1, v2, :cond_44

    const/16 v3, 0x5a

    if-le v1, v3, :cond_17

    goto :goto_44

    :cond_17
    invoke-virtual {p0}, Le9/h;->i()[B

    move-result-object p0

    array-length v4, p0

    invoke-static {p0, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p0

    const-string v4, "copyOf(...)"

    invoke-static {p0, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 v4, v0, 0x1

    add-int/lit8 v1, v1, 0x20

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    :goto_2c
    array-length v0, p0

    if-ge v4, v0, :cond_3e

    aget-byte v0, p0, v4

    if-lt v0, v2, :cond_3b

    if-le v0, v3, :cond_36

    goto :goto_3b

    :cond_36
    add-int/lit8 v0, v0, 0x20

    int-to-byte v0, v0

    aput-byte v0, p0, v4

    :cond_3b
    :goto_3b
    add-int/lit8 v4, v4, 0x1

    goto :goto_2c

    :cond_3e
    new-instance v0, Le9/h;

    invoke-direct {v0, p0}, Le9/h;-><init>([B)V

    return-object v0

    :cond_44
    :goto_44
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_47
    return-object p0
.end method

.method public y()Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, Le9/h;->m()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_11

    invoke-virtual {p0}, Le9/h;->o()[B

    move-result-object v0

    invoke-static {v0}, Le9/E;->b([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Le9/h;->t(Ljava/lang/String;)V

    :cond_11
    return-object v0
.end method

.method public z(Le9/e;II)V
    .registers 5

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2, p3}, Lf9/b;->d(Le9/h;Le9/e;II)V

    return-void
.end method
