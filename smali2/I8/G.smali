.class public abstract LI8/G;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK8/D;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LK8/D;

    const-string v1, "NO_VALUE"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LI8/G;->a:LK8/D;

    return-void
.end method

.method public static final a(IILH8/a;)LI8/z;
    .registers 4

    if-ltz p0, :cond_4f

    if-ltz p1, :cond_34

    if-gtz p0, :cond_28

    if-gtz p1, :cond_28

    sget-object v0, LH8/a;->q:LH8/a;

    if-ne p2, v0, :cond_d

    goto :goto_28

    :cond_d
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_28
    :goto_28
    add-int/2addr p1, p0

    if-gez p1, :cond_2e

    const p1, 0x7fffffff

    :cond_2e
    new-instance v0, LI8/F;

    invoke-direct {v0, p0, p1, p2}, LI8/F;-><init>(IILH8/a;)V

    return-object v0

    :cond_34
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "extraBufferCapacity cannot be negative, but was "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4f
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "replay cannot be negative, but was "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic b(IILH8/a;ILjava/lang/Object;)LI8/z;
    .registers 6

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_6

    move p0, v0

    :cond_6
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_b

    move p1, v0

    :cond_b
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_11

    sget-object p2, LH8/a;->q:LH8/a;

    :cond_11
    invoke-static {p0, p1, p2}, LI8/G;->a(IILH8/a;)LI8/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c([Ljava/lang/Object;J)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, LI8/G;->f([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d([Ljava/lang/Object;JLjava/lang/Object;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, LI8/G;->g([Ljava/lang/Object;JLjava/lang/Object;)V

    return-void
.end method

.method public static final e(LI8/E;Lm8/i;ILH8/a;)LI8/f;
    .registers 5

    if-eqz p2, :cond_5

    const/4 v0, -0x3

    if-ne p2, v0, :cond_a

    :cond_5
    sget-object v0, LH8/a;->q:LH8/a;

    if-ne p3, v0, :cond_a

    return-object p0

    :cond_a
    new-instance v0, LJ8/h;

    invoke-direct {v0, p0, p1, p2, p3}, LJ8/h;-><init>(LI8/f;Lm8/i;ILH8/a;)V

    return-object v0
.end method

.method private static final f([Ljava/lang/Object;J)Ljava/lang/Object;
    .registers 3

    long-to-int p1, p1

    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    and-int/2addr p1, p2

    aget-object p0, p0, p1

    return-object p0
.end method

.method private static final g([Ljava/lang/Object;JLjava/lang/Object;)V
    .registers 4

    long-to-int p1, p1

    array-length p2, p0

    add-int/lit8 p2, p2, -0x1

    and-int/2addr p1, p2

    aput-object p3, p0, p1

    return-void
.end method
