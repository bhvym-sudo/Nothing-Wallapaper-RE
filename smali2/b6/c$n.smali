.class public final Lb6/c$n;
.super Ljava/util/concurrent/locks/ReentrantLock;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x14
    name = "n"
.end annotation


# instance fields
.field private final q:Lb6/c$k;

.field private final r:I

.field private volatile s:[Lb6/c$j;

.field private volatile t:I

.field private u:I

.field final synthetic v:Lb6/c;


# direct methods
.method public constructor <init>(Lb6/c;I)V
    .registers 4

    iput-object p1, p0, Lb6/c$n;->v:Lb6/c;

    invoke-direct {p0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lb6/c$n;->t:I

    invoke-virtual {p1}, Lb6/c;->d()Lb6/c$k;

    move-result-object p1

    iput-object p1, p0, Lb6/c$n;->q:Lb6/c$k;

    const/high16 p1, 0x40000000    # 2.0f

    invoke-static {p2, p1}, Lb6/c;->c(II)I

    move-result p1

    const/4 p2, 0x1

    shl-int p1, p2, p1

    iput p1, p0, Lb6/c$n;->r:I

    invoke-direct {p0, p1}, Lb6/c$n;->f(I)[Lb6/c$j;

    move-result-object p1

    invoke-direct {p0, p1}, Lb6/c$n;->m([Lb6/c$j;)V

    return-void
.end method

.method static bridge synthetic a(Lb6/c$n;)I
    .registers 1

    iget p0, p0, Lb6/c$n;->t:I

    return p0
.end method

.method static bridge synthetic b(Lb6/c$n;)Lb6/c$k;
    .registers 1

    iget-object p0, p0, Lb6/c$n;->q:Lb6/c$k;

    return-object p0
.end method

.method static bridge synthetic c(Lb6/c$n;)[Lb6/c$j;
    .registers 1

    iget-object p0, p0, Lb6/c$n;->s:[Lb6/c$j;

    return-object p0
.end method

.method static bridge synthetic d(Lb6/c$n;I)V
    .registers 2

    iput p1, p0, Lb6/c$n;->t:I

    return-void
.end method

.method private f(I)[Lb6/c$j;
    .registers 2

    const-class p0, Lb6/c$j;

    invoke-static {p0, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lb6/c$j;

    return-object p0
.end method

.method private h(Lb6/c$j;Ljava/lang/Object;I)Lb6/c$j;
    .registers 4

    :goto_0
    if-eqz p1, :cond_20

    invoke-interface {p1}, Lb6/c$j;->b()I

    move-result p0

    if-ne p0, p3, :cond_1b

    invoke-interface {p1}, Lb6/c$j;->get()Lb6/c$g;

    move-result-object p0

    if-eqz p0, :cond_1b

    invoke-virtual {p0}, Lb6/c$g;->getKey()Ljava/lang/Object;

    move-result-object p0

    if-eq p0, p2, :cond_1a

    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1b

    :cond_1a
    return-object p1

    :cond_1b
    invoke-interface {p1}, Lb6/c$j;->e()Lb6/c$j;

    move-result-object p1

    goto :goto_0

    :cond_20
    const/4 p0, 0x0

    return-object p0
.end method

.method private j(I[Lb6/c$j;)I
    .registers 3

    array-length p0, p2

    add-int/lit8 p0, p0, -0x1

    and-int/2addr p0, p1

    return p0
.end method

.method private m([Lb6/c$j;)V
    .registers 3

    iput-object p1, p0, Lb6/c$n;->s:[Lb6/c$j;

    array-length p1, p1

    int-to-float p1, p1

    iget-object v0, p0, Lb6/c$n;->v:Lb6/c;

    invoke-virtual {v0}, Lb6/c;->h()F

    move-result v0

    mul-float/2addr p1, v0

    float-to-int p1, p1

    iput p1, p0, Lb6/c$n;->u:I

    return-void
.end method


# virtual methods
.method public e()V
    .registers 2

    iget v0, p0, Lb6/c$n;->t:I

    if-nez v0, :cond_5

    return-void

    :cond_5
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_8
    iget v0, p0, Lb6/c$n;->r:I

    invoke-direct {p0, v0}, Lb6/c$n;->f(I)[Lb6/c$j;

    move-result-object v0

    invoke-direct {p0, v0}, Lb6/c$n;->m([Lb6/c$j;)V

    const/4 v0, 0x0

    iput v0, p0, Lb6/c$n;->t:I
    :try_end_14
    .catchall {:try_start_8 .. :try_end_14} :catchall_18

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :catchall_18
    move-exception v0

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public g(ILjava/lang/Object;Lb6/c$p;)Ljava/lang/Object;
    .registers 13

    sget-object v0, Lb6/c$q;->t:Lb6/c$q;

    invoke-virtual {p3, v0}, Lb6/c$p;->c(Lb6/c$q;)Z

    move-result v1

    sget-object v0, Lb6/c$q;->q:Lb6/c$q;

    invoke-virtual {p3, v0}, Lb6/c$p;->c(Lb6/c$q;)Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {p0, v1}, Lb6/c$n;->l(Z)V

    :cond_11
    sget-object v0, Lb6/c$q;->s:Lb6/c$q;

    invoke-virtual {p3, v0}, Lb6/c$p;->c(Lb6/c$q;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_23

    iget v0, p0, Lb6/c$n;->t:I

    if-nez v0, :cond_23

    invoke-virtual {p3, v2, v2, v2}, Lb6/c$p;->b(Lb6/c$j;Lb6/c$g;Lb6/c$f;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_23
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_26
    iget-object v0, p0, Lb6/c$n;->s:[Lb6/c$j;

    invoke-direct {p0, p1, v0}, Lb6/c$n;->j(I[Lb6/c$j;)I

    move-result v8

    iget-object v0, p0, Lb6/c$n;->s:[Lb6/c$j;

    aget-object v7, v0, v8

    invoke-direct {p0, v7, p2, p1}, Lb6/c$n;->h(Lb6/c$j;Ljava/lang/Object;I)Lb6/c$j;

    move-result-object v0
    :try_end_34
    .catchall {:try_start_26 .. :try_end_34} :catchall_5d

    if-eqz v0, :cond_3f

    :try_start_36
    invoke-interface {v0}, Lb6/c$j;->get()Lb6/c$g;

    move-result-object v2
    :try_end_3a
    .catchall {:try_start_36 .. :try_end_3a} :catchall_3b

    goto :goto_3f

    :catchall_3b
    move-exception v0

    move-object p1, v0

    move-object v4, p0

    goto :goto_60

    :cond_3f
    :goto_3f
    :try_start_3f
    new-instance v3, Lb6/c$n$a;
    :try_end_41
    .catchall {:try_start_3f .. :try_end_41} :catchall_5d

    move-object v4, p0

    move v6, p1

    move-object v5, p2

    :try_start_44
    invoke-direct/range {v3 .. v8}, Lb6/c$n$a;-><init>(Lb6/c$n;Ljava/lang/Object;ILb6/c$j;I)V

    invoke-virtual {p3, v0, v2, v3}, Lb6/c$p;->b(Lb6/c$j;Lb6/c$g;Lb6/c$f;)Ljava/lang/Object;

    move-result-object p0
    :try_end_4b
    .catchall {:try_start_44 .. :try_end_4b} :catchall_5a

    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    sget-object p1, Lb6/c$q;->r:Lb6/c$q;

    invoke-virtual {p3, p1}, Lb6/c$p;->c(Lb6/c$q;)Z

    move-result p1

    if-eqz p1, :cond_59

    invoke-virtual {v4, v1}, Lb6/c$n;->l(Z)V

    :cond_59
    return-object p0

    :catchall_5a
    move-exception v0

    :goto_5b
    move-object p1, v0

    goto :goto_60

    :catchall_5d
    move-exception v0

    move-object v4, p0

    goto :goto_5b

    :goto_60
    invoke-virtual {v4}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    sget-object p0, Lb6/c$q;->r:Lb6/c$q;

    invoke-virtual {p3, p0}, Lb6/c$p;->c(Lb6/c$q;)Z

    move-result p0

    if-eqz p0, :cond_6e

    invoke-virtual {v4, v1}, Lb6/c$n;->l(Z)V

    :cond_6e
    throw p1
.end method

.method public final i()I
    .registers 1

    iget p0, p0, Lb6/c$n;->t:I

    return p0
.end method

.method public k(Ljava/lang/Object;ILb6/c$m;)Lb6/c$j;
    .registers 5

    sget-object v0, Lb6/c$m;->q:Lb6/c$m;

    if-ne p3, v0, :cond_8

    const/4 p3, 0x0

    invoke-virtual {p0, p3}, Lb6/c$n;->l(Z)V

    :cond_8
    iget p3, p0, Lb6/c$n;->t:I

    if-nez p3, :cond_e

    const/4 p0, 0x0

    return-object p0

    :cond_e
    iget-object p3, p0, Lb6/c$n;->s:[Lb6/c$j;

    invoke-direct {p0, p2, p3}, Lb6/c$n;->j(I[Lb6/c$j;)I

    move-result v0

    aget-object p3, p3, v0

    invoke-direct {p0, p3, p1, p2}, Lb6/c$n;->h(Lb6/c$j;Ljava/lang/Object;I)Lb6/c$j;

    move-result-object p0

    return-object p0
.end method

.method protected final l(Z)V
    .registers 13

    iget v0, p0, Lb6/c$n;->t:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_e

    iget v0, p0, Lb6/c$n;->t:I

    iget v3, p0, Lb6/c$n;->u:I

    if-lt v0, v3, :cond_e

    move v0, v2

    goto :goto_f

    :cond_e
    move v0, v1

    :goto_f
    iget-object v3, p0, Lb6/c$n;->q:Lb6/c$k;

    invoke-virtual {v3}, Lb6/c$k;->b()Lb6/c$j;

    move-result-object v3

    if-nez v3, :cond_1d

    if-eqz v0, :cond_1c

    if-eqz p1, :cond_1c

    goto :goto_1d

    :cond_1c
    return-void

    :cond_1d
    :goto_1d
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_20
    iget v0, p0, Lb6/c$n;->t:I

    sget-object v4, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    if-eqz v3, :cond_3a

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    :goto_2b
    if-eqz v3, :cond_3a

    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lb6/c$n;->q:Lb6/c$k;

    invoke-virtual {v3}, Lb6/c$k;->b()Lb6/c$j;

    move-result-object v3

    goto :goto_2b

    :catchall_37
    move-exception p1

    goto/16 :goto_ae

    :cond_3a
    invoke-interface {v4}, Ljava/util/Set;->size()I

    move-result v3

    sub-int/2addr v0, v3

    if-lez v0, :cond_47

    iget v3, p0, Lb6/c$n;->u:I

    if-lt v0, v3, :cond_47

    move v3, v2

    goto :goto_48

    :cond_47
    move v3, v1

    :goto_48
    iget-object v5, p0, Lb6/c$n;->s:[Lb6/c$j;

    array-length v5, v5

    if-eqz p1, :cond_56

    if-eqz v3, :cond_56

    const/high16 p1, 0x40000000    # 2.0f

    if-ge v5, p1, :cond_56

    shl-int/lit8 v5, v5, 0x1

    goto :goto_57

    :cond_56
    move v2, v1

    :goto_57
    if-eqz v2, :cond_5e

    invoke-direct {p0, v5}, Lb6/c$n;->f(I)[Lb6/c$j;

    move-result-object p1

    goto :goto_60

    :cond_5e
    iget-object p1, p0, Lb6/c$n;->s:[Lb6/c$j;

    :goto_60
    move v3, v1

    :goto_61
    iget-object v5, p0, Lb6/c$n;->s:[Lb6/c$j;

    array-length v5, v5

    if-ge v3, v5, :cond_9f

    iget-object v5, p0, Lb6/c$n;->s:[Lb6/c$j;

    aget-object v5, v5, v3

    if-nez v2, :cond_6f

    const/4 v6, 0x0

    aput-object v6, p1, v3

    :cond_6f
    :goto_6f
    if-eqz v5, :cond_9c

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_97

    invoke-interface {v5}, Lb6/c$j;->get()Lb6/c$g;

    move-result-object v6

    if-eqz v6, :cond_97

    invoke-interface {v5}, Lb6/c$j;->b()I

    move-result v6

    invoke-direct {p0, v6, p1}, Lb6/c$n;->j(I[Lb6/c$j;)I

    move-result v6

    iget-object v7, p0, Lb6/c$n;->q:Lb6/c$k;

    invoke-interface {v5}, Lb6/c$j;->get()Lb6/c$g;

    move-result-object v8

    invoke-interface {v5}, Lb6/c$j;->b()I

    move-result v9

    aget-object v10, p1, v6

    invoke-virtual {v7, v8, v9, v10}, Lb6/c$k;->a(Lb6/c$g;ILb6/c$j;)Lb6/c$j;

    move-result-object v7

    aput-object v7, p1, v6

    :cond_97
    invoke-interface {v5}, Lb6/c$j;->e()Lb6/c$j;

    move-result-object v5

    goto :goto_6f

    :cond_9c
    add-int/lit8 v3, v3, 0x1

    goto :goto_61

    :cond_9f
    if-eqz v2, :cond_a4

    invoke-direct {p0, p1}, Lb6/c$n;->m([Lb6/c$j;)V

    :cond_a4
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lb6/c$n;->t:I
    :try_end_aa
    .catchall {:try_start_20 .. :try_end_aa} :catchall_37

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :goto_ae
    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw p1
.end method
