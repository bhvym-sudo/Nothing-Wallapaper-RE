.class public Lb6/c;
.super Ljava/util/AbstractMap;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/ConcurrentMap;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb6/c$l;,
        Lb6/c$n;,
        Lb6/c$k;,
        Lb6/c$m;,
        Lb6/c$j;,
        Lb6/c$g;,
        Lb6/c$q;,
        Lb6/c$p;,
        Lb6/c$i;,
        Lb6/c$r;,
        Lb6/c$o;,
        Lb6/c$h;,
        Lb6/c$f;
    }
.end annotation


# static fields
.field private static final v:Lb6/c$l;


# instance fields
.field private final q:[Lb6/c$n;

.field private final r:F

.field private final s:Lb6/c$l;

.field private final t:I

.field private u:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    sget-object v0, Lb6/c$l;->q:Lb6/c$l;

    sput-object v0, Lb6/c;->v:Lb6/c$l;

    return-void
.end method

.method public constructor <init>(I)V
    .registers 5

    const/16 v0, 0x10

    .line 1
    sget-object v1, Lb6/c;->v:Lb6/c$l;

    const/high16 v2, 0x3f400000    # 0.75f

    invoke-direct {p0, p1, v2, v0, v1}, Lb6/c;-><init>(IFILb6/c$l;)V

    return-void
.end method

.method public constructor <init>(IFILb6/c$l;)V
    .registers 9

    .line 2
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p1, :cond_9

    move v2, v1

    goto :goto_a

    :cond_9
    move v2, v0

    .line 3
    :goto_a
    const-string v3, "Initial capacity must not be negative"

    invoke-static {v2, v3}, Lb6/a;->a(ZLjava/lang/String;)V

    const/4 v2, 0x0

    cmpl-float v2, p2, v2

    if-lez v2, :cond_16

    move v2, v1

    goto :goto_17

    :cond_16
    move v2, v0

    .line 4
    :goto_17
    const-string v3, "Load factor must be positive"

    invoke-static {v2, v3}, Lb6/a;->a(ZLjava/lang/String;)V

    if-lez p3, :cond_20

    move v2, v1

    goto :goto_21

    :cond_20
    move v2, v0

    .line 5
    :goto_21
    const-string v3, "Concurrency level must be positive"

    invoke-static {v2, v3}, Lb6/a;->a(ZLjava/lang/String;)V

    .line 6
    const-string v2, "Reference type must not be null"

    invoke-static {p4, v2}, Lb6/a;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iput p2, p0, Lb6/c;->r:F

    const/high16 p2, 0x10000

    .line 8
    invoke-static {p3, p2}, Lb6/c;->c(II)I

    move-result p2

    iput p2, p0, Lb6/c;->t:I

    shl-int p2, v1, p2

    .line 9
    iput-object p4, p0, Lb6/c;->s:Lb6/c$l;

    add-int/2addr p1, p2

    int-to-long p3, p1

    const-wide/16 v1, 0x1

    sub-long/2addr p3, v1

    int-to-long v1, p2

    .line 10
    div-long/2addr p3, v1

    long-to-int p1, p3

    .line 11
    const-class p3, Lb6/c$n;

    invoke-static {p3, p2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lb6/c$n;

    iput-object p2, p0, Lb6/c;->q:[Lb6/c$n;

    .line 12
    :goto_4b
    iget-object p2, p0, Lb6/c;->q:[Lb6/c$n;

    array-length p3, p2

    if-ge v0, p3, :cond_5a

    .line 13
    new-instance p3, Lb6/c$n;

    invoke-direct {p3, p0, p1}, Lb6/c$n;-><init>(Lb6/c;I)V

    aput-object p3, p2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_4b

    :cond_5a
    return-void
.end method

.method static bridge synthetic a(Lb6/c;)Lb6/c$l;
    .registers 1

    iget-object p0, p0, Lb6/c;->s:Lb6/c$l;

    return-object p0
.end method

.method static bridge synthetic b(Lb6/c;)[Lb6/c$n;
    .registers 1

    iget-object p0, p0, Lb6/c;->q:[Lb6/c$n;

    return-object p0
.end method

.method protected static c(II)I
    .registers 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    :goto_2
    if-ge v1, p0, :cond_b

    if-ge v1, p1, :cond_b

    shl-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_b
    return v0
.end method

.method private f(Ljava/lang/Object;Lb6/c$p;)Ljava/lang/Object;
    .registers 4

    invoke-virtual {p0, p1}, Lb6/c;->g(Ljava/lang/Object;)I

    move-result v0

    invoke-direct {p0, v0}, Lb6/c;->k(I)Lb6/c$n;

    move-result-object p0

    invoke-virtual {p0, v0, p1, p2}, Lb6/c$n;->g(ILjava/lang/Object;Lb6/c$p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private k(I)Lb6/c$n;
    .registers 3

    iget-object v0, p0, Lb6/c;->q:[Lb6/c$n;

    iget p0, p0, Lb6/c;->t:I

    rsub-int/lit8 p0, p0, 0x20

    ushr-int p0, p1, p0

    array-length p1, v0

    add-int/lit8 p1, p1, -0x1

    and-int/2addr p0, p1

    aget-object p0, v0, p0

    return-object p0
.end method

.method private l(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;
    .registers 7

    new-instance v0, Lb6/c$a;

    sget-object v1, Lb6/c$q;->q:Lb6/c$q;

    sget-object v2, Lb6/c$q;->t:Lb6/c$q;

    filled-new-array {v1, v2}, [Lb6/c$q;

    move-result-object v1

    invoke-direct {v0, p0, v1, p3, p2}, Lb6/c$a;-><init>(Lb6/c;[Lb6/c$q;ZLjava/lang/Object;)V

    invoke-direct {p0, p1, v0}, Lb6/c;->f(Ljava/lang/Object;Lb6/c$p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public clear()V
    .registers 4

    iget-object p0, p0, Lb6/c;->q:[Lb6/c$n;

    array-length v0, p0

    const/4 v1, 0x0

    :goto_4
    if-ge v1, v0, :cond_e

    aget-object v2, p0, v1

    invoke-virtual {v2}, Lb6/c$n;->e()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_e
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .registers 3

    sget-object v0, Lb6/c$m;->q:Lb6/c$m;

    invoke-virtual {p0, p1, v0}, Lb6/c;->i(Ljava/lang/Object;Lb6/c$m;)Lb6/c$j;

    move-result-object p0

    if-eqz p0, :cond_d

    invoke-interface {p0}, Lb6/c$j;->get()Lb6/c$g;

    move-result-object p0

    goto :goto_e

    :cond_d
    const/4 p0, 0x0

    :goto_e
    if-eqz p0, :cond_1c

    invoke-virtual {p0}, Lb6/c$g;->getKey()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, p1}, Lb6/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1c

    const/4 p0, 0x1

    return p0

    :cond_1c
    const/4 p0, 0x0

    return p0
.end method

.method protected d()Lb6/c$k;
    .registers 2

    new-instance v0, Lb6/c$k;

    invoke-direct {v0, p0}, Lb6/c$k;-><init>(Lb6/c;)V

    return-object v0
.end method

.method public entrySet()Ljava/util/Set;
    .registers 3

    iget-object v0, p0, Lb6/c;->u:Ljava/util/Set;

    if-nez v0, :cond_c

    new-instance v0, Lb6/c$i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lb6/c$i;-><init>(Lb6/c;Lb6/d;)V

    iput-object v0, p0, Lb6/c;->u:Ljava/util/Set;

    :cond_c
    iget-object p0, p0, Lb6/c;->u:Ljava/util/Set;

    return-object p0
.end method

.method protected g(Ljava/lang/Object;)I
    .registers 3

    if-nez p1, :cond_4

    const/4 p0, 0x0

    goto :goto_8

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p0

    :goto_8
    shl-int/lit8 p1, p0, 0xf

    xor-int/lit16 p1, p1, -0x3283

    add-int/2addr p0, p1

    ushr-int/lit8 p1, p0, 0xa

    xor-int/2addr p0, p1

    shl-int/lit8 p1, p0, 0x3

    add-int/2addr p0, p1

    ushr-int/lit8 p1, p0, 0x6

    xor-int/2addr p0, p1

    shl-int/lit8 p1, p0, 0x2

    shl-int/lit8 v0, p0, 0xe

    add-int/2addr p1, v0

    add-int/2addr p0, p1

    ushr-int/lit8 p1, p0, 0x10

    xor-int/2addr p0, p1

    return p0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    sget-object v0, Lb6/c$m;->q:Lb6/c$m;

    invoke-virtual {p0, p1, v0}, Lb6/c;->i(Ljava/lang/Object;Lb6/c$m;)Lb6/c$j;

    move-result-object p0

    const/4 p1, 0x0

    if-eqz p0, :cond_e

    invoke-interface {p0}, Lb6/c$j;->get()Lb6/c$g;

    move-result-object p0

    goto :goto_f

    :cond_e
    move-object p0, p1

    :goto_f
    if-eqz p0, :cond_16

    invoke-virtual {p0}, Lb6/c$g;->getValue()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_16
    return-object p1
.end method

.method protected final h()F
    .registers 1

    iget p0, p0, Lb6/c;->r:F

    return p0
.end method

.method protected final i(Ljava/lang/Object;Lb6/c$m;)Lb6/c$j;
    .registers 4

    invoke-virtual {p0, p1}, Lb6/c;->g(Ljava/lang/Object;)I

    move-result v0

    invoke-direct {p0, v0}, Lb6/c;->k(I)Lb6/c$n;

    move-result-object p0

    invoke-virtual {p0, p1, v0, p2}, Lb6/c$n;->k(Ljava/lang/Object;ILb6/c$m;)Lb6/c$j;

    move-result-object p0

    return-object p0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lb6/c;->l(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lb6/c;->l(Ljava/lang/Object;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    .line 1
    new-instance v0, Lb6/c$b;

    sget-object v1, Lb6/c$q;->r:Lb6/c$q;

    sget-object v2, Lb6/c$q;->s:Lb6/c$q;

    filled-new-array {v1, v2}, [Lb6/c$q;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lb6/c$b;-><init>(Lb6/c;[Lb6/c$q;)V

    invoke-direct {p0, p1, v0}, Lb6/c;->f(Ljava/lang/Object;Lb6/c$p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 6

    .line 2
    new-instance v0, Lb6/c$c;

    sget-object v1, Lb6/c$q;->r:Lb6/c$q;

    sget-object v2, Lb6/c$q;->s:Lb6/c$q;

    filled-new-array {v1, v2}, [Lb6/c$q;

    move-result-object v1

    invoke-direct {v0, p0, v1, p2}, Lb6/c$c;-><init>(Lb6/c;[Lb6/c$q;Ljava/lang/Object;)V

    invoke-direct {p0, p1, v0}, Lb6/c;->f(Ljava/lang/Object;Lb6/c$p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6

    .line 2
    new-instance v0, Lb6/c$e;

    sget-object v1, Lb6/c$q;->q:Lb6/c$q;

    sget-object v2, Lb6/c$q;->s:Lb6/c$q;

    filled-new-array {v1, v2}, [Lb6/c$q;

    move-result-object v1

    invoke-direct {v0, p0, v1, p2}, Lb6/c$e;-><init>(Lb6/c;[Lb6/c$q;Ljava/lang/Object;)V

    invoke-direct {p0, p1, v0}, Lb6/c;->f(Ljava/lang/Object;Lb6/c$p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .registers 7

    .line 1
    new-instance v0, Lb6/c$d;

    sget-object v1, Lb6/c$q;->q:Lb6/c$q;

    sget-object v2, Lb6/c$q;->s:Lb6/c$q;

    filled-new-array {v1, v2}, [Lb6/c$q;

    move-result-object v1

    invoke-direct {v0, p0, v1, p2, p3}, Lb6/c$d;-><init>(Lb6/c;[Lb6/c$q;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {p0, p1, v0}, Lb6/c;->f(Ljava/lang/Object;Lb6/c$p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public size()I
    .registers 5

    iget-object p0, p0, Lb6/c;->q:[Lb6/c$n;

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_5
    if-ge v1, v0, :cond_11

    aget-object v3, p0, v1

    invoke-virtual {v3}, Lb6/c$n;->i()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_11
    return v2
.end method
