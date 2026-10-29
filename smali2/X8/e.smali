.class public final LX8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LX8/e;

.field public static final b:Le9/h;

.field private static final c:[Ljava/lang/String;

.field private static final d:[Ljava/lang/String;

.field private static final e:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 13

    new-instance v0, LX8/e;

    invoke-direct {v0}, LX8/e;-><init>()V

    sput-object v0, LX8/e;->a:LX8/e;

    sget-object v0, Le9/h;->t:Le9/h$a;

    const-string v1, "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"

    invoke-virtual {v0, v1}, Le9/h$a;->c(Ljava/lang/String;)Le9/h;

    move-result-object v0

    sput-object v0, LX8/e;->b:Le9/h;

    const-string v9, "WINDOW_UPDATE"

    const-string v10, "CONTINUATION"

    const-string v1, "DATA"

    const-string v2, "HEADERS"

    const-string v3, "PRIORITY"

    const-string v4, "RST_STREAM"

    const-string v5, "SETTINGS"

    const-string v6, "PUSH_PROMISE"

    const-string v7, "PING"

    const-string v8, "GOAWAY"

    filled-new-array/range {v1 .. v10}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, LX8/e;->c:[Ljava/lang/String;

    const/16 v0, 0x40

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, LX8/e;->d:[Ljava/lang/String;

    const/16 v0, 0x100

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    move v3, v2

    :goto_37
    if-ge v3, v0, :cond_5c

    invoke-static {v3}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "toBinaryString(it)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "%8s"

    invoke-static {v5, v4}, LQ8/d;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/16 v7, 0x20

    const/16 v8, 0x30

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, LE8/i;->H(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_37

    :cond_5c
    sput-object v1, LX8/e;->e:[Ljava/lang/String;

    sget-object v0, LX8/e;->d:[Ljava/lang/String;

    const-string v1, ""

    aput-object v1, v0, v2

    const-string v1, "END_STREAM"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    filled-new-array {v3}, [I

    move-result-object v1

    const-string v3, "PADDED"

    const/16 v4, 0x8

    aput-object v3, v0, v4

    aget v3, v1, v2

    or-int/lit8 v5, v3, 0x8

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v3, v0, v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "|PADDED"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v0, v5

    const-string v5, "END_HEADERS"

    const/4 v6, 0x4

    aput-object v5, v0, v6

    const-string v5, "PRIORITY"

    const/16 v7, 0x20

    aput-object v5, v0, v7

    const-string v5, "END_HEADERS|PRIORITY"

    const/16 v8, 0x24

    aput-object v5, v0, v8

    filled-new-array {v6, v7, v8}, [I

    move-result-object v0

    move v5, v2

    :goto_a2
    const/4 v6, 0x3

    if-ge v5, v6, :cond_e6

    aget v6, v0, v5

    aget v7, v1, v2

    sget-object v8, LX8/e;->d:[Ljava/lang/String;

    or-int v9, v7, v6

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v11, v8, v7

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v11, 0x7c

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-object v12, v8, v6

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    or-int/2addr v9, v4

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v7, v8, v7

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-object v6, v8, v6

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v8, v9

    add-int/lit8 v5, v5, 0x1

    goto :goto_a2

    :cond_e6
    sget-object v0, LX8/e;->d:[Ljava/lang/String;

    array-length v0, v0

    :goto_e9
    if-ge v2, v0, :cond_fa

    sget-object v1, LX8/e;->d:[Ljava/lang/String;

    aget-object v3, v1, v2

    if-nez v3, :cond_f7

    sget-object v3, LX8/e;->e:[Ljava/lang/String;

    aget-object v3, v3, v2

    aput-object v3, v1, v2

    :cond_f7
    add-int/lit8 v2, v2, 0x1

    goto :goto_e9

    :cond_fa
    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(II)Ljava/lang/String;
    .registers 9

    if-nez p2, :cond_5

    const-string p0, ""

    return-object p0

    :cond_5
    const/4 p0, 0x2

    if-eq p1, p0, :cond_5a

    const/4 p0, 0x3

    if-eq p1, p0, :cond_5a

    const/4 p0, 0x4

    if-eq p1, p0, :cond_4f

    const/4 p0, 0x6

    if-eq p1, p0, :cond_4f

    const/4 p0, 0x7

    if-eq p1, p0, :cond_5a

    const/16 p0, 0x8

    if-eq p1, p0, :cond_5a

    sget-object p0, LX8/e;->d:[Ljava/lang/String;

    array-length v0, p0

    if-ge p2, v0, :cond_24

    aget-object p0, p0, p2

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    :goto_22
    move-object v0, p0

    goto :goto_29

    :cond_24
    sget-object p0, LX8/e;->e:[Ljava/lang/String;

    aget-object p0, p0, p2

    goto :goto_22

    :goto_29
    const/4 p0, 0x5

    if-ne p1, p0, :cond_3c

    and-int/lit8 p0, p2, 0x4

    if-eqz p0, :cond_3c

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "HEADERS"

    const-string v2, "PUSH_PROMISE"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LE8/i;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3c
    if-nez p1, :cond_4e

    and-int/lit8 p0, p2, 0x20

    if-eqz p0, :cond_4e

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "PRIORITY"

    const-string v2, "COMPRESSED"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LE8/i;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4e
    return-object v0

    :cond_4f
    const/4 p0, 0x1

    if-ne p2, p0, :cond_55

    const-string p0, "ACK"

    return-object p0

    :cond_55
    sget-object p0, LX8/e;->e:[Ljava/lang/String;

    aget-object p0, p0, p2

    return-object p0

    :cond_5a
    sget-object p0, LX8/e;->e:[Ljava/lang/String;

    aget-object p0, p0, p2

    return-object p0
.end method

.method public final b(I)Ljava/lang/String;
    .registers 3

    sget-object p0, LX8/e;->c:[Ljava/lang/String;

    array-length v0, p0

    if-ge p1, v0, :cond_8

    aget-object p0, p0, p1

    return-object p0

    :cond_8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "0x%02x"

    invoke-static {p1, p0}, LQ8/d;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final c(ZIIII)Ljava/lang/String;
    .registers 7

    invoke-virtual {p0, p4}, LX8/e;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p4, p5}, LX8/e;->a(II)Ljava/lang/String;

    move-result-object p0

    if-eqz p1, :cond_d

    const-string p1, "<<"

    goto :goto_f

    :cond_d
    const-string p1, ">>"

    :goto_f
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {p1, p2, p3, v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s 0x%08x %5d %-13s %s"

    invoke-static {p1, p0}, LQ8/d;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
