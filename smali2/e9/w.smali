.class public final Le9/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le9/w$a;
    }
.end annotation


# static fields
.field public static final h:Le9/w$a;


# instance fields
.field public final a:[B

.field public b:I

.field public c:I

.field public d:Z

.field public e:Z

.field public f:Le9/w;

.field public g:Le9/w;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Le9/w$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le9/w$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Le9/w;->h:Le9/w$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    .line 2
    new-array v0, v0, [B

    iput-object v0, p0, Le9/w;->a:[B

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Le9/w;->e:Z

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Le9/w;->d:Z

    return-void
.end method

.method public constructor <init>([BIIZZ)V
    .registers 7

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Le9/w;->a:[B

    .line 7
    iput p2, p0, Le9/w;->b:I

    .line 8
    iput p3, p0, Le9/w;->c:I

    .line 9
    iput-boolean p4, p0, Le9/w;->d:Z

    .line 10
    iput-boolean p5, p0, Le9/w;->e:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .registers 4

    iget-object v0, p0, Le9/w;->g:Le9/w;

    if-eq v0, p0, :cond_3f

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-boolean v0, v0, Le9/w;->e:Z

    if-nez v0, :cond_c

    goto :goto_2f

    :cond_c
    iget v0, p0, Le9/w;->c:I

    iget v1, p0, Le9/w;->b:I

    sub-int/2addr v0, v1

    iget-object v1, p0, Le9/w;->g:Le9/w;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v1, v1, Le9/w;->c:I

    rsub-int v1, v1, 0x2000

    iget-object v2, p0, Le9/w;->g:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-boolean v2, v2, Le9/w;->d:Z

    if-eqz v2, :cond_25

    const/4 v2, 0x0

    goto :goto_2c

    :cond_25
    iget-object v2, p0, Le9/w;->g:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v2, v2, Le9/w;->b:I

    :goto_2c
    add-int/2addr v1, v2

    if-le v0, v1, :cond_30

    :goto_2f
    return-void

    :cond_30
    iget-object v1, p0, Le9/w;->g:Le9/w;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0, v1, v0}, Le9/w;->f(Le9/w;I)V

    invoke-virtual {p0}, Le9/w;->b()Le9/w;

    invoke-static {p0}, Le9/x;->b(Le9/w;)V

    return-void

    :cond_3f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "cannot compact"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final b()Le9/w;
    .registers 5

    iget-object v0, p0, Le9/w;->f:Le9/w;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_6

    goto :goto_7

    :cond_6
    move-object v0, v1

    :goto_7
    iget-object v2, p0, Le9/w;->g:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v3, p0, Le9/w;->f:Le9/w;

    iput-object v3, v2, Le9/w;->f:Le9/w;

    iget-object v2, p0, Le9/w;->f:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v3, p0, Le9/w;->g:Le9/w;

    iput-object v3, v2, Le9/w;->g:Le9/w;

    iput-object v1, p0, Le9/w;->f:Le9/w;

    iput-object v1, p0, Le9/w;->g:Le9/w;

    return-object v0
.end method

.method public final c(Le9/w;)Le9/w;
    .registers 3

    const-string v0, "segment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, p1, Le9/w;->g:Le9/w;

    iget-object v0, p0, Le9/w;->f:Le9/w;

    iput-object v0, p1, Le9/w;->f:Le9/w;

    iget-object v0, p0, Le9/w;->f:Le9/w;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iput-object p1, v0, Le9/w;->g:Le9/w;

    iput-object p1, p0, Le9/w;->f:Le9/w;

    return-object p1
.end method

.method public final d()Le9/w;
    .registers 8

    const/4 v0, 0x1

    iput-boolean v0, p0, Le9/w;->d:Z

    new-instance v1, Le9/w;

    iget-object v2, p0, Le9/w;->a:[B

    iget v3, p0, Le9/w;->b:I

    iget v4, p0, Le9/w;->c:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Le9/w;-><init>([BIIZZ)V

    return-object v1
.end method

.method public final e(I)Le9/w;
    .registers 10

    if-lez p1, :cond_37

    iget v0, p0, Le9/w;->c:I

    iget v1, p0, Le9/w;->b:I

    sub-int/2addr v0, v1

    if-gt p1, v0, :cond_37

    const/16 v0, 0x400

    if-lt p1, v0, :cond_12

    invoke-virtual {p0}, Le9/w;->d()Le9/w;

    move-result-object v0

    goto :goto_24

    :cond_12
    invoke-static {}, Le9/x;->c()Le9/w;

    move-result-object v0

    iget-object v1, p0, Le9/w;->a:[B

    iget-object v2, v0, Le9/w;->a:[B

    iget v4, p0, Le9/w;->b:I

    add-int v5, v4, p1

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Li8/m;->i([B[BIIIILjava/lang/Object;)[B

    :goto_24
    iget v1, v0, Le9/w;->b:I

    add-int/2addr v1, p1

    iput v1, v0, Le9/w;->c:I

    iget v1, p0, Le9/w;->b:I

    add-int/2addr v1, p1

    iput v1, p0, Le9/w;->b:I

    iget-object p0, p0, Le9/w;->g:Le9/w;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Le9/w;->c(Le9/w;)Le9/w;

    return-object v0

    :cond_37
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "byteCount out of range"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final f(Le9/w;I)V
    .registers 11

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p1, Le9/w;->e:Z

    if-eqz v0, :cond_54

    iget v5, p1, Le9/w;->c:I

    add-int v0, v5, p2

    const/16 v1, 0x2000

    if-le v0, v1, :cond_3c

    iget-boolean v0, p1, Le9/w;->d:Z

    if-nez v0, :cond_36

    add-int v0, v5, p2

    iget v4, p1, Le9/w;->b:I

    sub-int/2addr v0, v4

    if-gt v0, v1, :cond_30

    iget-object v1, p1, Le9/w;->a:[B

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v2, v1

    invoke-static/range {v1 .. v7}, Li8/m;->i([B[BIIIILjava/lang/Object;)[B

    iget v0, p1, Le9/w;->c:I

    iget v1, p1, Le9/w;->b:I

    sub-int/2addr v0, v1

    iput v0, p1, Le9/w;->c:I

    const/4 v0, 0x0

    iput v0, p1, Le9/w;->b:I

    goto :goto_3c

    :cond_30
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_36
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0

    :cond_3c
    :goto_3c
    iget-object v0, p0, Le9/w;->a:[B

    iget-object v1, p1, Le9/w;->a:[B

    iget v2, p1, Le9/w;->c:I

    iget v3, p0, Le9/w;->b:I

    add-int v4, v3, p2

    invoke-static {v0, v1, v2, v3, v4}, Li8/m;->d([B[BIII)[B

    iget v0, p1, Le9/w;->c:I

    add-int/2addr v0, p2

    iput v0, p1, Le9/w;->c:I

    iget p1, p0, Le9/w;->b:I

    add-int/2addr p1, p2

    iput p1, p0, Le9/w;->b:I

    return-void

    :cond_54
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "only owner can write"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
