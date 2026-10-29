.class public final LX8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:I

.field private b:I

.field private final c:Ljava/util/List;

.field private final d:Le9/g;

.field public e:[LX8/c;

.field private f:I

.field public g:I

.field public h:I


# direct methods
.method public constructor <init>(Le9/B;II)V
    .registers 5

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, LX8/d$a;->a:I

    .line 3
    iput p3, p0, LX8/d$a;->b:I

    .line 4
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, LX8/d$a;->c:Ljava/util/List;

    .line 5
    invoke-static {p1}, Le9/o;->d(Le9/B;)Le9/g;

    move-result-object p1

    iput-object p1, p0, LX8/d$a;->d:Le9/g;

    const/16 p1, 0x8

    .line 6
    new-array p1, p1, [LX8/c;

    iput-object p1, p0, LX8/d$a;->e:[LX8/c;

    .line 7
    array-length p1, p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LX8/d$a;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Le9/B;IIILkotlin/jvm/internal/h;)V
    .registers 6

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_5

    move p3, p2

    .line 8
    :cond_5
    invoke-direct {p0, p1, p2, p3}, LX8/d$a;-><init>(Le9/B;II)V

    return-void
.end method

.method private final a()V
    .registers 3

    iget v0, p0, LX8/d$a;->b:I

    iget v1, p0, LX8/d$a;->h:I

    if-ge v0, v1, :cond_10

    if-nez v0, :cond_c

    invoke-direct {p0}, LX8/d$a;->b()V

    return-void

    :cond_c
    sub-int/2addr v1, v0

    invoke-direct {p0, v1}, LX8/d$a;->d(I)I

    :cond_10
    return-void
.end method

.method private final b()V
    .registers 7

    iget-object v0, p0, LX8/d$a;->e:[LX8/c;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Li8/m;->t([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    iget-object v0, p0, LX8/d$a;->e:[LX8/c;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LX8/d$a;->f:I

    const/4 v0, 0x0

    iput v0, p0, LX8/d$a;->g:I

    iput v0, p0, LX8/d$a;->h:I

    return-void
.end method

.method private final c(I)I
    .registers 2

    iget p0, p0, LX8/d$a;->f:I

    add-int/lit8 p0, p0, 0x1

    add-int/2addr p0, p1

    return p0
.end method

.method private final d(I)I
    .registers 6

    const/4 v0, 0x0

    if-lez p1, :cond_39

    iget-object v1, p0, LX8/d$a;->e:[LX8/c;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    :goto_8
    iget v2, p0, LX8/d$a;->f:I

    if-lt v1, v2, :cond_28

    if-lez p1, :cond_28

    iget-object v2, p0, LX8/d$a;->e:[LX8/c;

    aget-object v2, v2, v1

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v2, v2, LX8/c;->c:I

    sub-int/2addr p1, v2

    iget v3, p0, LX8/d$a;->h:I

    sub-int/2addr v3, v2

    iput v3, p0, LX8/d$a;->h:I

    iget v2, p0, LX8/d$a;->g:I

    add-int/lit8 v2, v2, -0x1

    iput v2, p0, LX8/d$a;->g:I

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, -0x1

    goto :goto_8

    :cond_28
    iget-object p1, p0, LX8/d$a;->e:[LX8/c;

    add-int/lit8 v1, v2, 0x1

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v2, v0

    iget v3, p0, LX8/d$a;->g:I

    invoke-static {p1, v1, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, LX8/d$a;->f:I

    add-int/2addr p1, v0

    iput p1, p0, LX8/d$a;->f:I

    :cond_39
    return v0
.end method

.method private final f(I)Le9/h;
    .registers 4

    invoke-direct {p0, p1}, LX8/d$a;->h(I)Z

    move-result v0

    if-eqz v0, :cond_11

    sget-object p0, LX8/d;->a:LX8/d;

    invoke-virtual {p0}, LX8/d;->c()[LX8/c;

    move-result-object p0

    aget-object p0, p0, p1

    iget-object p0, p0, LX8/c;->a:Le9/h;

    return-object p0

    :cond_11
    sget-object v0, LX8/d;->a:LX8/d;

    invoke-virtual {v0}, LX8/d;->c()[LX8/c;

    move-result-object v0

    array-length v0, v0

    sub-int v0, p1, v0

    invoke-direct {p0, v0}, LX8/d$a;->c(I)I

    move-result v0

    if-ltz v0, :cond_2d

    iget-object p0, p0, LX8/d$a;->e:[LX8/c;

    array-length v1, p0

    if-ge v0, v1, :cond_2d

    aget-object p0, p0, v0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object p0, p0, LX8/c;->a:Le9/h;

    return-object p0

    :cond_2d
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Header index too large "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final g(ILX8/c;)V
    .registers 8

    iget-object v0, p0, LX8/d$a;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget v0, p2, LX8/c;->c:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_18

    iget-object v2, p0, LX8/d$a;->e:[LX8/c;

    invoke-direct {p0, p1}, LX8/d$a;->c(I)I

    move-result v3

    aget-object v2, v2, v3

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget v2, v2, LX8/c;->c:I

    sub-int/2addr v0, v2

    :cond_18
    iget v2, p0, LX8/d$a;->b:I

    if-le v0, v2, :cond_20

    invoke-direct {p0}, LX8/d$a;->b()V

    return-void

    :cond_20
    iget v3, p0, LX8/d$a;->h:I

    add-int/2addr v3, v0

    sub-int/2addr v3, v2

    invoke-direct {p0, v3}, LX8/d$a;->d(I)I

    move-result v2

    if-ne p1, v1, :cond_58

    iget p1, p0, LX8/d$a;->g:I

    add-int/lit8 p1, p1, 0x1

    iget-object v1, p0, LX8/d$a;->e:[LX8/c;

    array-length v2, v1

    if-le p1, v2, :cond_47

    array-length p1, v1

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [LX8/c;

    array-length v2, v1

    array-length v3, v1

    const/4 v4, 0x0

    invoke-static {v1, v4, p1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, LX8/d$a;->e:[LX8/c;

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LX8/d$a;->f:I

    iput-object p1, p0, LX8/d$a;->e:[LX8/c;

    :cond_47
    iget p1, p0, LX8/d$a;->f:I

    add-int/lit8 v1, p1, -0x1

    iput v1, p0, LX8/d$a;->f:I

    iget-object v1, p0, LX8/d$a;->e:[LX8/c;

    aput-object p2, v1, p1

    iget p1, p0, LX8/d$a;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LX8/d$a;->g:I

    goto :goto_62

    :cond_58
    invoke-direct {p0, p1}, LX8/d$a;->c(I)I

    move-result v1

    add-int/2addr v1, v2

    add-int/2addr p1, v1

    iget-object v1, p0, LX8/d$a;->e:[LX8/c;

    aput-object p2, v1, p1

    :goto_62
    iget p1, p0, LX8/d$a;->h:I

    add-int/2addr p1, v0

    iput p1, p0, LX8/d$a;->h:I

    return-void
.end method

.method private final h(I)Z
    .registers 3

    if-ltz p1, :cond_e

    sget-object p0, LX8/d;->a:LX8/d;

    invoke-virtual {p0}, LX8/d;->c()[LX8/c;

    move-result-object p0

    array-length p0, p0

    const/4 v0, 0x1

    sub-int/2addr p0, v0

    if-gt p1, p0, :cond_e

    return v0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method private final i()I
    .registers 2

    iget-object p0, p0, LX8/d$a;->d:Le9/g;

    invoke-interface {p0}, Le9/g;->readByte()B

    move-result p0

    const/16 v0, 0xff

    invoke-static {p0, v0}, LQ8/d;->d(BI)I

    move-result p0

    return p0
.end method

.method private final l(I)V
    .registers 5

    invoke-direct {p0, p1}, LX8/d$a;->h(I)Z

    move-result v0

    if-eqz v0, :cond_14

    sget-object v0, LX8/d;->a:LX8/d;

    invoke-virtual {v0}, LX8/d;->c()[LX8/c;

    move-result-object v0

    aget-object p1, v0, p1

    iget-object p0, p0, LX8/d$a;->c:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_14
    sget-object v0, LX8/d;->a:LX8/d;

    invoke-virtual {v0}, LX8/d;->c()[LX8/c;

    move-result-object v0

    array-length v0, v0

    sub-int v0, p1, v0

    invoke-direct {p0, v0}, LX8/d$a;->c(I)I

    move-result v0

    if-ltz v0, :cond_35

    iget-object v1, p0, LX8/d$a;->e:[LX8/c;

    array-length v2, v1

    if-ge v0, v2, :cond_35

    iget-object p0, p0, LX8/d$a;->c:Ljava/util/List;

    check-cast p0, Ljava/util/Collection;

    aget-object p1, v1, v0

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_35
    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Header index too large "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final n(I)V
    .registers 4

    invoke-direct {p0, p1}, LX8/d$a;->f(I)Le9/h;

    move-result-object p1

    invoke-virtual {p0}, LX8/d$a;->j()Le9/h;

    move-result-object v0

    new-instance v1, LX8/c;

    invoke-direct {v1, p1, v0}, LX8/c;-><init>(Le9/h;Le9/h;)V

    const/4 p1, -0x1

    invoke-direct {p0, p1, v1}, LX8/d$a;->g(ILX8/c;)V

    return-void
.end method

.method private final o()V
    .registers 4

    sget-object v0, LX8/d;->a:LX8/d;

    invoke-virtual {p0}, LX8/d$a;->j()Le9/h;

    move-result-object v1

    invoke-virtual {v0, v1}, LX8/d;->a(Le9/h;)Le9/h;

    move-result-object v0

    invoke-virtual {p0}, LX8/d$a;->j()Le9/h;

    move-result-object v1

    new-instance v2, LX8/c;

    invoke-direct {v2, v0, v1}, LX8/c;-><init>(Le9/h;Le9/h;)V

    const/4 v0, -0x1

    invoke-direct {p0, v0, v2}, LX8/d$a;->g(ILX8/c;)V

    return-void
.end method

.method private final p(I)V
    .registers 4

    invoke-direct {p0, p1}, LX8/d$a;->f(I)Le9/h;

    move-result-object p1

    invoke-virtual {p0}, LX8/d$a;->j()Le9/h;

    move-result-object v0

    iget-object p0, p0, LX8/d$a;->c:Ljava/util/List;

    new-instance v1, LX8/c;

    invoke-direct {v1, p1, v0}, LX8/c;-><init>(Le9/h;Le9/h;)V

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final q()V
    .registers 4

    sget-object v0, LX8/d;->a:LX8/d;

    invoke-virtual {p0}, LX8/d$a;->j()Le9/h;

    move-result-object v1

    invoke-virtual {v0, v1}, LX8/d;->a(Le9/h;)Le9/h;

    move-result-object v0

    invoke-virtual {p0}, LX8/d$a;->j()Le9/h;

    move-result-object v1

    iget-object p0, p0, LX8/d$a;->c:Ljava/util/List;

    new-instance v2, LX8/c;

    invoke-direct {v2, v0, v1}, LX8/c;-><init>(Le9/h;Le9/h;)V

    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final e()Ljava/util/List;
    .registers 2

    iget-object v0, p0, LX8/d$a;->c:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Li8/s;->r0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iget-object p0, p0, LX8/d$a;->c:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->clear()V

    return-object v0
.end method

.method public final j()Le9/h;
    .registers 5

    invoke-direct {p0}, LX8/d$a;->i()I

    move-result v0

    and-int/lit16 v1, v0, 0x80

    const/16 v2, 0x80

    if-ne v1, v2, :cond_c

    const/4 v1, 0x1

    goto :goto_d

    :cond_c
    const/4 v1, 0x0

    :goto_d
    const/16 v2, 0x7f

    invoke-virtual {p0, v0, v2}, LX8/d$a;->m(II)I

    move-result v0

    int-to-long v2, v0

    if-eqz v1, :cond_27

    new-instance v0, Le9/e;

    invoke-direct {v0}, Le9/e;-><init>()V

    sget-object v1, LX8/k;->a:LX8/k;

    iget-object p0, p0, LX8/d$a;->d:Le9/g;

    invoke-virtual {v1, p0, v2, v3, v0}, LX8/k;->b(Le9/g;JLe9/f;)V

    invoke-virtual {v0}, Le9/e;->w0()Le9/h;

    move-result-object p0

    return-object p0

    :cond_27
    iget-object p0, p0, LX8/d$a;->d:Le9/g;

    invoke-interface {p0, v2, v3}, Le9/g;->n(J)Le9/h;

    move-result-object p0

    return-object p0
.end method

.method public final k()V
    .registers 4

    :goto_0
    iget-object v0, p0, LX8/d$a;->d:Le9/g;

    invoke-interface {v0}, Le9/g;->D()Z

    move-result v0

    if-nez v0, :cond_92

    iget-object v0, p0, LX8/d$a;->d:Le9/g;

    invoke-interface {v0}, Le9/g;->readByte()B

    move-result v0

    const/16 v1, 0xff

    invoke-static {v0, v1}, LQ8/d;->d(BI)I

    move-result v0

    const/16 v1, 0x80

    if-eq v0, v1, :cond_8a

    and-int/lit16 v2, v0, 0x80

    if-ne v2, v1, :cond_28

    const/16 v1, 0x7f

    invoke-virtual {p0, v0, v1}, LX8/d$a;->m(II)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0}, LX8/d$a;->l(I)V

    goto :goto_0

    :cond_28
    const/16 v1, 0x40

    if-ne v0, v1, :cond_30

    invoke-direct {p0}, LX8/d$a;->o()V

    goto :goto_0

    :cond_30
    and-int/lit8 v2, v0, 0x40

    if-ne v2, v1, :cond_40

    const/16 v1, 0x3f

    invoke-virtual {p0, v0, v1}, LX8/d$a;->m(II)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0}, LX8/d$a;->n(I)V

    goto :goto_0

    :cond_40
    and-int/lit8 v1, v0, 0x20

    const/16 v2, 0x20

    if-ne v1, v2, :cond_71

    const/16 v1, 0x1f

    invoke-virtual {p0, v0, v1}, LX8/d$a;->m(II)I

    move-result v0

    iput v0, p0, LX8/d$a;->b:I

    if-ltz v0, :cond_58

    iget v1, p0, LX8/d$a;->a:I

    if-gt v0, v1, :cond_58

    invoke-direct {p0}, LX8/d$a;->a()V

    goto :goto_0

    :cond_58
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid dynamic table size update "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LX8/d$a;->b:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_71
    const/16 v1, 0x10

    if-eq v0, v1, :cond_85

    if-nez v0, :cond_78

    goto :goto_85

    :cond_78
    const/16 v1, 0xf

    invoke-virtual {p0, v0, v1}, LX8/d$a;->m(II)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-direct {p0, v0}, LX8/d$a;->p(I)V

    goto/16 :goto_0

    :cond_85
    :goto_85
    invoke-direct {p0}, LX8/d$a;->q()V

    goto/16 :goto_0

    :cond_8a
    new-instance p0, Ljava/io/IOException;

    const-string v0, "index == 0"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_92
    return-void
.end method

.method public final m(II)I
    .registers 5

    and-int/2addr p1, p2

    if-ge p1, p2, :cond_4

    return p1

    :cond_4
    const/4 p1, 0x0

    :goto_5
    invoke-direct {p0}, LX8/d$a;->i()I

    move-result v0

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_14

    and-int/lit8 v0, v0, 0x7f

    shl-int/2addr v0, p1

    add-int/2addr p2, v0

    add-int/lit8 p1, p1, 0x7

    goto :goto_5

    :cond_14
    shl-int p0, v0, p1

    add-int/2addr p2, p0

    return p2
.end method
