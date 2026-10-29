.class public final LX8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX8/h$a;,
        LX8/h$b;,
        LX8/h$c;
    }
.end annotation


# static fields
.field public static final u:LX8/h$a;

.field private static final v:Ljava/util/logging/Logger;


# instance fields
.field private final q:Le9/g;

.field private final r:Z

.field private final s:LX8/h$b;

.field private final t:LX8/d$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LX8/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX8/h$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LX8/h;->u:LX8/h$a;

    const-class v0, LX8/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    const-string v1, "getLogger(Http2::class.java.name)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, LX8/h;->v:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Le9/g;Z)V
    .registers 10

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX8/h;->q:Le9/g;

    iput-boolean p2, p0, LX8/h;->r:Z

    new-instance v2, LX8/h$b;

    invoke-direct {v2, p1}, LX8/h$b;-><init>(Le9/g;)V

    iput-object v2, p0, LX8/h;->s:LX8/h$b;

    new-instance v1, LX8/d$a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v3, 0x1000

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, LX8/d$a;-><init>(Le9/B;IIILkotlin/jvm/internal/h;)V

    iput-object v1, p0, LX8/h;->t:LX8/d$a;

    return-void
.end method

.method private final B(LX8/h$c;III)V
    .registers 6

    const/16 v0, 0x8

    if-ne p2, v0, :cond_24

    if-nez p4, :cond_1c

    iget-object p2, p0, LX8/h;->q:Le9/g;

    invoke-interface {p2}, Le9/g;->readInt()I

    move-result p2

    iget-object p0, p0, LX8/h;->q:Le9/g;

    invoke-interface {p0}, Le9/g;->readInt()I

    move-result p0

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_17

    goto :goto_18

    :cond_17
    const/4 p4, 0x0

    :goto_18
    invoke-interface {p1, p4, p2, p0}, LX8/h$c;->k(ZII)V

    return-void

    :cond_1c
    new-instance p0, Ljava/io/IOException;

    const-string p1, "TYPE_PING streamId != 0"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_24
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "TYPE_PING length != 8: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final G(LX8/h$c;I)V
    .registers 7

    iget-object v0, p0, LX8/h;->q:Le9/g;

    invoke-interface {v0}, Le9/g;->readInt()I

    move-result v0

    const/high16 v1, -0x80000000

    and-int/2addr v1, v0

    const/4 v2, 0x1

    if-eqz v1, :cond_e

    move v1, v2

    goto :goto_f

    :cond_e
    const/4 v1, 0x0

    :goto_f
    const v3, 0x7fffffff

    and-int/2addr v0, v3

    iget-object p0, p0, LX8/h;->q:Le9/g;

    invoke-interface {p0}, Le9/g;->readByte()B

    move-result p0

    const/16 v3, 0xff

    invoke-static {p0, v3}, LQ8/d;->d(BI)I

    move-result p0

    add-int/2addr p0, v2

    invoke-interface {p1, p2, v0, p0, v1}, LX8/h$c;->l(IIIZ)V

    return-void
.end method

.method private final I(LX8/h$c;III)V
    .registers 5

    const/4 p3, 0x5

    if-ne p2, p3, :cond_11

    if-eqz p4, :cond_9

    invoke-direct {p0, p1, p4}, LX8/h;->G(LX8/h$c;I)V

    return-void

    :cond_9
    new-instance p0, Ljava/io/IOException;

    const-string p1, "TYPE_PRIORITY streamId == 0"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_11
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "TYPE_PRIORITY length: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " != 5"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final K(LX8/h$c;III)V
    .registers 8

    if-eqz p4, :cond_2e

    and-int/lit8 v0, p3, 0x8

    if-eqz v0, :cond_13

    iget-object v0, p0, LX8/h;->q:Le9/g;

    invoke-interface {v0}, Le9/g;->readByte()B

    move-result v0

    const/16 v1, 0xff

    invoke-static {v0, v1}, LQ8/d;->d(BI)I

    move-result v0

    goto :goto_14

    :cond_13
    const/4 v0, 0x0

    :goto_14
    iget-object v1, p0, LX8/h;->q:Le9/g;

    invoke-interface {v1}, Le9/g;->readInt()I

    move-result v1

    const v2, 0x7fffffff

    and-int/2addr v1, v2

    sget-object v2, LX8/h;->u:LX8/h$a;

    add-int/lit8 p2, p2, -0x4

    invoke-virtual {v2, p2, p3, v0}, LX8/h$a;->b(III)I

    move-result p2

    invoke-direct {p0, p2, v0, p3, p4}, LX8/h;->u(IIII)Ljava/util/List;

    move-result-object p0

    invoke-interface {p1, p4, v1, p0}, LX8/h$c;->m(IILjava/util/List;)V

    return-void

    :cond_2e
    new-instance p0, Ljava/io/IOException;

    const-string p1, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final Q(LX8/h$c;III)V
    .registers 5

    const/4 p3, 0x4

    if-ne p2, p3, :cond_36

    if-eqz p4, :cond_2e

    iget-object p0, p0, LX8/h;->q:Le9/g;

    invoke-interface {p0}, Le9/g;->readInt()I

    move-result p0

    sget-object p2, LX8/b;->r:LX8/b$a;

    invoke-virtual {p2, p0}, LX8/b$a;->a(I)LX8/b;

    move-result-object p2

    if-eqz p2, :cond_17

    invoke-interface {p1, p4, p2}, LX8/h$c;->d(ILX8/b;)V

    return-void

    :cond_17
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "TYPE_RST_STREAM unexpected error code: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2e
    new-instance p0, Ljava/io/IOException;

    const-string p1, "TYPE_RST_STREAM streamId == 0"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_36
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "TYPE_RST_STREAM length: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " != 4"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final U(LX8/h$c;III)V
    .registers 12

    if-nez p4, :cond_b9

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_14

    if-nez p2, :cond_c

    invoke-interface {p1}, LX8/h$c;->a()V

    return-void

    :cond_c
    new-instance p0, Ljava/io/IOException;

    const-string p1, "FRAME_SIZE_ERROR ack frame should be empty!"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_14
    rem-int/lit8 p3, p2, 0x6

    if-nez p3, :cond_a2

    new-instance p3, LX8/m;

    invoke-direct {p3}, LX8/m;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0, p2}, LB8/h;->q(II)LB8/g;

    move-result-object p2

    const/4 v1, 0x6

    invoke-static {p2, v1}, LB8/h;->p(LB8/e;I)LB8/e;

    move-result-object p2

    invoke-virtual {p2}, LB8/e;->g()I

    move-result v1

    invoke-virtual {p2}, LB8/e;->m()I

    move-result v2

    invoke-virtual {p2}, LB8/e;->n()I

    move-result p2

    if-lez p2, :cond_37

    if-le v1, v2, :cond_3b

    :cond_37
    if-gez p2, :cond_9e

    if-gt v2, v1, :cond_9e

    :cond_3b
    :goto_3b
    iget-object v3, p0, LX8/h;->q:Le9/g;

    invoke-interface {v3}, Le9/g;->readShort()S

    move-result v3

    const v4, 0xffff

    invoke-static {v3, v4}, LQ8/d;->e(SI)I

    move-result v3

    iget-object v4, p0, LX8/h;->q:Le9/g;

    invoke-interface {v4}, Le9/g;->readInt()I

    move-result v4

    const/4 v5, 0x2

    if-eq v3, v5, :cond_8a

    const/4 v5, 0x3

    const/4 v6, 0x4

    if-eq v3, v5, :cond_88

    if-eq v3, v6, :cond_7c

    const/4 v5, 0x5

    if-eq v3, v5, :cond_5b

    goto :goto_97

    :cond_5b
    const/16 v5, 0x4000

    if-lt v4, v5, :cond_65

    const v5, 0xffffff

    if-gt v4, v5, :cond_65

    goto :goto_97

    :cond_65
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7c
    if-ltz v4, :cond_80

    const/4 v3, 0x7

    goto :goto_97

    :cond_80
    new-instance p0, Ljava/io/IOException;

    const-string p1, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_88
    move v3, v6

    goto :goto_97

    :cond_8a
    if-eqz v4, :cond_97

    if-ne v4, p4, :cond_8f

    goto :goto_97

    :cond_8f
    new-instance p0, Ljava/io/IOException;

    const-string p1, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_97
    :goto_97
    invoke-virtual {p3, v3, v4}, LX8/m;->h(II)LX8/m;

    if-eq v1, v2, :cond_9e

    add-int/2addr v1, p2

    goto :goto_3b

    :cond_9e
    invoke-interface {p1, v0, p3}, LX8/h$c;->i(ZLX8/m;)V

    return-void

    :cond_a2
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "TYPE_SETTINGS length % 6 != 0: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b9
    new-instance p0, Ljava/io/IOException;

    const-string p1, "TYPE_SETTINGS streamId != 0"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final Y(LX8/h$c;III)V
    .registers 7

    const/4 p3, 0x4

    if-ne p2, p3, :cond_22

    iget-object p0, p0, LX8/h;->q:Le9/g;

    invoke-interface {p0}, Le9/g;->readInt()I

    move-result p0

    const-wide/32 p2, 0x7fffffff

    invoke-static {p0, p2, p3}, LQ8/d;->f(IJ)J

    move-result-wide p2

    const-wide/16 v0, 0x0

    cmp-long p0, p2, v0

    if-eqz p0, :cond_1a

    invoke-interface {p1, p4, p2, p3}, LX8/h$c;->g(IJ)V

    return-void

    :cond_1a
    new-instance p0, Ljava/io/IOException;

    const-string p1, "windowSizeIncrement was 0"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_22
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "TYPE_WINDOW_UPDATE length !=4: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic a()Ljava/util/logging/Logger;
    .registers 1

    sget-object v0, LX8/h;->v:Ljava/util/logging/Logger;

    return-object v0
.end method

.method private final g(LX8/h$c;III)V
    .registers 8

    if-eqz p4, :cond_38

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    const/4 v0, 0x1

    goto :goto_a

    :cond_9
    move v0, v1

    :goto_a
    and-int/lit8 v2, p3, 0x20

    if-nez v2, :cond_30

    and-int/lit8 v2, p3, 0x8

    if-eqz v2, :cond_1e

    iget-object v1, p0, LX8/h;->q:Le9/g;

    invoke-interface {v1}, Le9/g;->readByte()B

    move-result v1

    const/16 v2, 0xff

    invoke-static {v1, v2}, LQ8/d;->d(BI)I

    move-result v1

    :cond_1e
    sget-object v2, LX8/h;->u:LX8/h$a;

    invoke-virtual {v2, p2, p3, v1}, LX8/h$a;->b(III)I

    move-result p2

    iget-object p3, p0, LX8/h;->q:Le9/g;

    invoke-interface {p1, v0, p4, p3, p2}, LX8/h$c;->o(ZILe9/g;I)V

    iget-object p0, p0, LX8/h;->q:Le9/g;

    int-to-long p1, v1

    invoke-interface {p0, p1, p2}, Le9/g;->skip(J)V

    return-void

    :cond_30
    new-instance p0, Ljava/io/IOException;

    const-string p1, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_38
    new-instance p0, Ljava/io/IOException;

    const-string p1, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final j(LX8/h$c;III)V
    .registers 7

    const/16 p3, 0x8

    if-lt p2, p3, :cond_49

    if-nez p4, :cond_41

    iget-object p4, p0, LX8/h;->q:Le9/g;

    invoke-interface {p4}, Le9/g;->readInt()I

    move-result p4

    iget-object v0, p0, LX8/h;->q:Le9/g;

    invoke-interface {v0}, Le9/g;->readInt()I

    move-result v0

    sub-int/2addr p2, p3

    sget-object p3, LX8/b;->r:LX8/b$a;

    invoke-virtual {p3, v0}, LX8/b$a;->a(I)LX8/b;

    move-result-object p3

    if-eqz p3, :cond_2a

    sget-object v0, Le9/h;->u:Le9/h;

    if-lez p2, :cond_26

    iget-object p0, p0, LX8/h;->q:Le9/g;

    int-to-long v0, p2

    invoke-interface {p0, v0, v1}, Le9/g;->n(J)Le9/h;

    move-result-object v0

    :cond_26
    invoke-interface {p1, p4, p3, v0}, LX8/h$c;->h(ILX8/b;Le9/h;)V

    return-void

    :cond_2a
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "TYPE_GOAWAY unexpected error code: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_41
    new-instance p0, Ljava/io/IOException;

    const-string p1, "TYPE_GOAWAY streamId != 0"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_49
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "TYPE_GOAWAY length < 8: "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final u(IIII)Ljava/util/List;
    .registers 6

    iget-object v0, p0, LX8/h;->s:LX8/h$b;

    invoke-virtual {v0, p1}, LX8/h$b;->g(I)V

    iget-object p1, p0, LX8/h;->s:LX8/h$b;

    invoke-virtual {p1}, LX8/h$b;->a()I

    move-result v0

    invoke-virtual {p1, v0}, LX8/h$b;->j(I)V

    iget-object p1, p0, LX8/h;->s:LX8/h$b;

    invoke-virtual {p1, p2}, LX8/h$b;->u(I)V

    iget-object p1, p0, LX8/h;->s:LX8/h$b;

    invoke-virtual {p1, p3}, LX8/h$b;->f(I)V

    iget-object p1, p0, LX8/h;->s:LX8/h$b;

    invoke-virtual {p1, p4}, LX8/h$b;->z(I)V

    iget-object p1, p0, LX8/h;->t:LX8/d$a;

    invoke-virtual {p1}, LX8/d$a;->k()V

    iget-object p0, p0, LX8/h;->t:LX8/d$a;

    invoke-virtual {p0}, LX8/d$a;->e()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final z(LX8/h$c;III)V
    .registers 8

    if-eqz p4, :cond_32

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    const/4 v0, 0x1

    goto :goto_a

    :cond_9
    move v0, v1

    :goto_a
    and-int/lit8 v2, p3, 0x8

    if-eqz v2, :cond_1a

    iget-object v1, p0, LX8/h;->q:Le9/g;

    invoke-interface {v1}, Le9/g;->readByte()B

    move-result v1

    const/16 v2, 0xff

    invoke-static {v1, v2}, LQ8/d;->d(BI)I

    move-result v1

    :cond_1a
    and-int/lit8 v2, p3, 0x20

    if-eqz v2, :cond_23

    invoke-direct {p0, p1, p4}, LX8/h;->G(LX8/h$c;I)V

    add-int/lit8 p2, p2, -0x5

    :cond_23
    sget-object v2, LX8/h;->u:LX8/h$a;

    invoke-virtual {v2, p2, p3, v1}, LX8/h$a;->b(III)I

    move-result p2

    invoke-direct {p0, p2, v1, p3, p4}, LX8/h;->u(IIII)Ljava/util/List;

    move-result-object p0

    const/4 p2, -0x1

    invoke-interface {p1, v0, p4, p2, p0}, LX8/h$c;->b(ZIILjava/util/List;)V

    return-void

    :cond_32
    new-instance p0, Ljava/io/IOException;

    const-string p1, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final b(ZLX8/h$c;)Z
    .registers 10

    const-string v0, "handler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_5
    iget-object v0, p0, LX8/h;->q:Le9/g;

    const-wide/16 v1, 0x9

    invoke-interface {v0, v1, v2}, Le9/g;->Y0(J)V
    :try_end_c
    .catch Ljava/io/EOFException; {:try_start_5 .. :try_end_c} :catch_b4

    iget-object v0, p0, LX8/h;->q:Le9/g;

    invoke-static {v0}, LQ8/d;->J(Le9/g;)I

    move-result v4

    const/16 v0, 0x4000

    if-gt v4, v0, :cond_9d

    iget-object v0, p0, LX8/h;->q:Le9/g;

    invoke-interface {v0}, Le9/g;->readByte()B

    move-result v0

    const/16 v1, 0xff

    invoke-static {v0, v1}, LQ8/d;->d(BI)I

    move-result v5

    iget-object v0, p0, LX8/h;->q:Le9/g;

    invoke-interface {v0}, Le9/g;->readByte()B

    move-result v0

    invoke-static {v0, v1}, LQ8/d;->d(BI)I

    move-result v6

    iget-object v0, p0, LX8/h;->q:Le9/g;

    invoke-interface {v0}, Le9/g;->readInt()I

    move-result v0

    const v1, 0x7fffffff

    and-int v3, v0, v1

    sget-object v0, LX8/h;->v:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_4b

    sget-object v1, LX8/e;->a:LX8/e;

    const/4 v2, 0x1

    invoke-virtual/range {v1 .. v6}, LX8/e;->c(ZIIII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_4b
    if-eqz p1, :cond_6e

    const/4 p1, 0x4

    if-ne v5, p1, :cond_51

    goto :goto_6e

    :cond_51
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Expected a SETTINGS frame but was "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, LX8/e;->a:LX8/e;

    invoke-virtual {p2, v5}, LX8/e;->b(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6e
    :goto_6e
    packed-switch v5, :pswitch_data_b6

    iget-object p0, p0, LX8/h;->q:Le9/g;

    int-to-long p1, v4

    invoke-interface {p0, p1, p2}, Le9/g;->skip(J)V

    goto :goto_9b

    :pswitch_78
    invoke-direct {p0, p2, v4, v6, v3}, LX8/h;->Y(LX8/h$c;III)V

    goto :goto_9b

    :pswitch_7c
    invoke-direct {p0, p2, v4, v6, v3}, LX8/h;->j(LX8/h$c;III)V

    goto :goto_9b

    :pswitch_80
    invoke-direct {p0, p2, v4, v6, v3}, LX8/h;->B(LX8/h$c;III)V

    goto :goto_9b

    :pswitch_84
    invoke-direct {p0, p2, v4, v6, v3}, LX8/h;->K(LX8/h$c;III)V

    goto :goto_9b

    :pswitch_88
    invoke-direct {p0, p2, v4, v6, v3}, LX8/h;->U(LX8/h$c;III)V

    goto :goto_9b

    :pswitch_8c
    invoke-direct {p0, p2, v4, v6, v3}, LX8/h;->Q(LX8/h$c;III)V

    goto :goto_9b

    :pswitch_90
    invoke-direct {p0, p2, v4, v6, v3}, LX8/h;->I(LX8/h$c;III)V

    goto :goto_9b

    :pswitch_94
    invoke-direct {p0, p2, v4, v6, v3}, LX8/h;->z(LX8/h$c;III)V

    goto :goto_9b

    :pswitch_98
    invoke-direct {p0, p2, v4, v6, v3}, LX8/h;->g(LX8/h$c;III)V

    :goto_9b
    const/4 p0, 0x1

    return p0

    :cond_9d
    new-instance p0, Ljava/io/IOException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "FRAME_SIZE_ERROR: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_b4
    const/4 p0, 0x0

    return p0

    :pswitch_data_b6
    .packed-switch 0x0
        :pswitch_98
        :pswitch_94
        :pswitch_90
        :pswitch_8c
        :pswitch_88
        :pswitch_84
        :pswitch_80
        :pswitch_7c
        :pswitch_78
    .end packed-switch
.end method

.method public close()V
    .registers 1

    iget-object p0, p0, LX8/h;->q:Le9/g;

    invoke-interface {p0}, Le9/B;->close()V

    return-void
.end method

.method public final f(LX8/h$c;)V
    .registers 5

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LX8/h;->r:Z

    if-eqz v0, :cond_19

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, LX8/h;->b(ZLX8/h$c;)Z

    move-result p0

    if-eqz p0, :cond_11

    goto :goto_55

    :cond_11
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Required SETTINGS preface not received"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_19
    iget-object p0, p0, LX8/h;->q:Le9/g;

    sget-object p1, LX8/e;->b:Le9/h;

    invoke-virtual {p1}, Le9/h;->v()I

    move-result v0

    int-to-long v0, v0

    invoke-interface {p0, v0, v1}, Le9/g;->n(J)Le9/h;

    move-result-object p0

    sget-object v0, LX8/h;->v:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_4f

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<< CONNECTION "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le9/h;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, LQ8/d;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_4f
    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_56

    :goto_55
    return-void

    :cond_56
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected a connection header but was "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Le9/h;->y()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
