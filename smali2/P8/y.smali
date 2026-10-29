.class public final LP8/y;
.super LP8/C;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/y$a;,
        LP8/y$b;,
        LP8/y$c;
    }
.end annotation


# static fields
.field public static final g:LP8/y$b;

.field public static final h:LP8/x;

.field public static final i:LP8/x;

.field public static final j:LP8/x;

.field public static final k:LP8/x;

.field public static final l:LP8/x;

.field private static final m:[B

.field private static final n:[B

.field private static final o:[B


# instance fields
.field private final b:Le9/h;

.field private final c:LP8/x;

.field private final d:Ljava/util/List;

.field private final e:LP8/x;

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LP8/y$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/y$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LP8/y;->g:LP8/y$b;

    sget-object v0, LP8/x;->e:LP8/x$a;

    const-string v1, "multipart/mixed"

    invoke-virtual {v0, v1}, LP8/x$a;->a(Ljava/lang/String;)LP8/x;

    move-result-object v1

    sput-object v1, LP8/y;->h:LP8/x;

    const-string v1, "multipart/alternative"

    invoke-virtual {v0, v1}, LP8/x$a;->a(Ljava/lang/String;)LP8/x;

    move-result-object v1

    sput-object v1, LP8/y;->i:LP8/x;

    const-string v1, "multipart/digest"

    invoke-virtual {v0, v1}, LP8/x$a;->a(Ljava/lang/String;)LP8/x;

    move-result-object v1

    sput-object v1, LP8/y;->j:LP8/x;

    const-string v1, "multipart/parallel"

    invoke-virtual {v0, v1}, LP8/x$a;->a(Ljava/lang/String;)LP8/x;

    move-result-object v1

    sput-object v1, LP8/y;->k:LP8/x;

    const-string v1, "multipart/form-data"

    invoke-virtual {v0, v1}, LP8/x$a;->a(Ljava/lang/String;)LP8/x;

    move-result-object v0

    sput-object v0, LP8/y;->l:LP8/x;

    const/4 v0, 0x2

    new-array v1, v0, [B

    fill-array-data v1, :array_4a

    sput-object v1, LP8/y;->m:[B

    new-array v1, v0, [B

    fill-array-data v1, :array_50

    sput-object v1, LP8/y;->n:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_56

    sput-object v0, LP8/y;->o:[B

    return-void

    nop

    :array_4a
    .array-data 1
        0x3at
        0x20t
    .end array-data

    nop

    :array_50
    .array-data 1
        0xdt
        0xat
    .end array-data

    nop

    :array_56
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
.end method

.method public constructor <init>(Le9/h;LP8/x;Ljava/util/List;)V
    .registers 5

    const-string v0, "boundaryByteString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parts"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LP8/C;-><init>()V

    iput-object p1, p0, LP8/y;->b:Le9/h;

    iput-object p2, p0, LP8/y;->c:LP8/x;

    iput-object p3, p0, LP8/y;->d:Ljava/util/List;

    sget-object p1, LP8/x;->e:LP8/x$a;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "; boundary="

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LP8/y;->h()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, LP8/x$a;->a(Ljava/lang/String;)LP8/x;

    move-result-object p1

    iput-object p1, p0, LP8/y;->e:LP8/x;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, LP8/y;->f:J

    return-void
.end method

.method private final i(Le9/f;Z)J
    .registers 15

    if-eqz p2, :cond_9

    new-instance p1, Le9/e;

    invoke-direct {p1}, Le9/e;-><init>()V

    move-object v0, p1

    goto :goto_a

    :cond_9
    const/4 v0, 0x0

    :goto_a
    iget-object v1, p0, LP8/y;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move v5, v2

    :goto_14
    if-ge v5, v1, :cond_ae

    iget-object v6, p0, LP8/y;->d:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LP8/y$c;

    invoke-virtual {v6}, LP8/y$c;->b()LP8/u;

    move-result-object v7

    invoke-virtual {v6}, LP8/y$c;->a()LP8/C;

    move-result-object v6

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    sget-object v8, LP8/y;->o:[B

    invoke-interface {p1, v8}, Le9/f;->G0([B)Le9/f;

    iget-object v8, p0, LP8/y;->b:Le9/h;

    invoke-interface {p1, v8}, Le9/f;->s0(Le9/h;)Le9/f;

    sget-object v8, LP8/y;->n:[B

    invoke-interface {p1, v8}, Le9/f;->G0([B)Le9/f;

    if-eqz v7, :cond_5f

    invoke-virtual {v7}, LP8/u;->size()I

    move-result v8

    move v9, v2

    :goto_3f
    if-ge v9, v8, :cond_5f

    invoke-virtual {v7, v9}, LP8/u;->b(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {p1, v10}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object v10

    sget-object v11, LP8/y;->m:[B

    invoke-interface {v10, v11}, Le9/f;->G0([B)Le9/f;

    move-result-object v10

    invoke-virtual {v7, v9}, LP8/u;->m(I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v10, v11}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object v10

    sget-object v11, LP8/y;->n:[B

    invoke-interface {v10, v11}, Le9/f;->G0([B)Le9/f;

    add-int/lit8 v9, v9, 0x1

    goto :goto_3f

    :cond_5f
    invoke-virtual {v6}, LP8/C;->b()LP8/x;

    move-result-object v7

    if-eqz v7, :cond_78

    const-string v8, "Content-Type: "

    invoke-interface {p1, v8}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object v8

    invoke-virtual {v7}, LP8/x;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v8, v7}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object v7

    sget-object v8, LP8/y;->n:[B

    invoke-interface {v7, v8}, Le9/f;->G0([B)Le9/f;

    :cond_78
    invoke-virtual {v6}, LP8/C;->a()J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long v11, v7, v9

    if-eqz v11, :cond_92

    const-string v9, "Content-Length: "

    invoke-interface {p1, v9}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    move-result-object v9

    invoke-interface {v9, v7, v8}, Le9/f;->Z0(J)Le9/f;

    move-result-object v9

    sget-object v10, LP8/y;->n:[B

    invoke-interface {v9, v10}, Le9/f;->G0([B)Le9/f;

    goto :goto_9b

    :cond_92
    if-eqz p2, :cond_9b

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0}, Le9/e;->j()V

    return-wide v9

    :cond_9b
    :goto_9b
    sget-object v9, LP8/y;->n:[B

    invoke-interface {p1, v9}, Le9/f;->G0([B)Le9/f;

    if-eqz p2, :cond_a4

    add-long/2addr v3, v7

    goto :goto_a7

    :cond_a4
    invoke-virtual {v6, p1}, LP8/C;->g(Le9/f;)V

    :goto_a7
    invoke-interface {p1, v9}, Le9/f;->G0([B)Le9/f;

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_14

    :cond_ae
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    sget-object v1, LP8/y;->o:[B

    invoke-interface {p1, v1}, Le9/f;->G0([B)Le9/f;

    iget-object p0, p0, LP8/y;->b:Le9/h;

    invoke-interface {p1, p0}, Le9/f;->s0(Le9/h;)Le9/f;

    invoke-interface {p1, v1}, Le9/f;->G0([B)Le9/f;

    sget-object p0, LP8/y;->n:[B

    invoke-interface {p1, p0}, Le9/f;->G0([B)Le9/f;

    if-eqz p2, :cond_d0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0}, Le9/e;->X0()J

    move-result-wide p0

    add-long/2addr v3, p0

    invoke-virtual {v0}, Le9/e;->j()V

    :cond_d0
    return-wide v3
.end method


# virtual methods
.method public a()J
    .registers 5

    iget-wide v0, p0, LP8/y;->f:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_10

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, LP8/y;->i(Le9/f;Z)J

    move-result-wide v0

    iput-wide v0, p0, LP8/y;->f:J

    :cond_10
    return-wide v0
.end method

.method public b()LP8/x;
    .registers 1

    iget-object p0, p0, LP8/y;->e:LP8/x;

    return-object p0
.end method

.method public g(Le9/f;)V
    .registers 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LP8/y;->i(Le9/f;Z)J

    return-void
.end method

.method public final h()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LP8/y;->b:Le9/h;

    invoke-virtual {p0}, Le9/h;->y()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
