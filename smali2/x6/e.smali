.class public final Lx6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/r;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx6/e$a;
    }
.end annotation


# static fields
.field public static final s:Lx6/e$a;

.field private static final t:Ljava/nio/charset/Charset;


# instance fields
.field private final q:Lz6/b;

.field private final r:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lx6/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx6/e$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lx6/e;->s:Lx6/e$a;

    sget-object v0, LE8/d;->b:Ljava/nio/charset/Charset;

    sput-object v0, Lx6/e;->t:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Lz6/b;)V
    .registers 3

    const-string v0, "cache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/e;->q:Lz6/b;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lx6/e;->r:Z

    invoke-virtual {p1}, Lz6/b;->A0()I

    move-result p0

    const/4 p1, 0x2

    if-ne p0, p1, :cond_15

    return-void

    :cond_15
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "cache\'s value count must be 2."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final B(Lcom/android/wallpaper/asset/a;Lz6/b$b;Lm8/e;)Ljava/lang/Object;
    .registers 9

    instance-of v0, p3, Lx6/e$e;

    if-eqz v0, :cond_13

    move-object v0, p3

    check-cast v0, Lx6/e$e;

    iget v1, v0, Lx6/e$e;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lx6/e$e;->u:I

    goto :goto_18

    :cond_13
    new-instance v0, Lx6/e$e;

    invoke-direct {v0, p0, p3}, Lx6/e$e;-><init>(Lx6/e;Lm8/e;)V

    :goto_18
    iget-object p3, v0, Lx6/e$e;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx6/e$e;->u:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_3b

    if-ne v2, v4, :cond_33

    iget-object p0, v0, Lx6/e$e;->r:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Lz6/b$b;

    iget-object p0, v0, Lx6/e$e;->q:Ljava/lang/Object;

    check-cast p0, Lx6/e;

    invoke-static {p3}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4b

    :cond_33
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3b
    invoke-static {p3}, Lh8/r;->b(Ljava/lang/Object;)V

    iput-object p0, v0, Lx6/e$e;->q:Ljava/lang/Object;

    iput-object p2, v0, Lx6/e$e;->r:Ljava/lang/Object;

    iput v4, v0, Lx6/e$e;->u:I

    invoke-static {p1, v3, v0}, LG6/a;->e(Lcom/android/wallpaper/asset/a;ZLm8/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4b

    return-object v1

    :cond_4b
    :goto_4b
    check-cast p3, Landroid/graphics/Bitmap;

    if-eqz p3, :cond_53

    invoke-direct {p0, p3, p2}, Lx6/e;->G(Landroid/graphics/Bitmap;Lz6/b$b;)Z

    move-result v3

    :cond_53
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private final G(Landroid/graphics/Bitmap;Lz6/b$b;)Z
    .registers 4

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lz6/b$b;->g(I)Le9/z;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lx6/e;->U(Landroid/graphics/Bitmap;Le9/z;)Z

    move-result p0

    return p0
.end method

.method private final I(Lz6/b$b;Lw6/b;Lm8/e;)Ljava/lang/Object;
    .registers 5

    instance-of v0, p2, Lw6/b$b;

    if-eqz v0, :cond_13

    check-cast p2, Lw6/b$b;

    invoke-virtual {p2}, Lw6/b$b;->a()Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lx6/e;->G(Landroid/graphics/Bitmap;Lz6/b$b;)Z

    move-result p0

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_13
    instance-of v0, p2, Lw6/b$a;

    if-eqz v0, :cond_31

    iget-boolean v0, p0, Lx6/e;->r:Z

    if-eqz v0, :cond_26

    check-cast p2, Lw6/b$a;

    invoke-virtual {p2}, Lw6/b$a;->a()Lcom/android/wallpaper/asset/a;

    move-result-object p2

    invoke-direct {p0, p2, p1, p3}, Lx6/e;->B(Lcom/android/wallpaper/asset/a;Lz6/b$b;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_26
    check-cast p2, Lw6/b$a;

    invoke-virtual {p2}, Lw6/b$a;->a()Lcom/android/wallpaper/asset/a;

    move-result-object p2

    invoke-direct {p0, p2, p1, p3}, Lx6/e;->z(Lcom/android/wallpaper/asset/a;Lz6/b$b;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_31
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0
.end method

.method private final K(Lz6/b$b;Lw6/c;)V
    .registers 4

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lz6/b$b;->g(I)Le9/z;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lx6/e;->Y(Lw6/c;Le9/z;)V

    return-void
.end method

.method private final Q(Ljava/io/InputStream;Lz6/b$b;)V
    .registers 7

    const/4 p0, 0x1

    invoke-virtual {p2, p0}, Lz6/b$b;->g(I)Le9/z;

    move-result-object p0

    invoke-static {p0}, Le9/o;->c(Le9/z;)Le9/f;

    move-result-object p0

    invoke-interface {p0}, Le9/f;->b1()Ljava/io/OutputStream;

    move-result-object p0

    const/4 p2, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_10
    invoke-static {p1, p0, v1, p2, v0}, Ls8/a;->b(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-lez p2, :cond_26

    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V
    :try_end_1d
    .catchall {:try_start_10 .. :try_end_1d} :catchall_24

    invoke-static {p1}, LQ8/d;->m(Ljava/io/Closeable;)V

    invoke-static {p0}, LQ8/d;->m(Ljava/io/Closeable;)V

    return-void

    :catchall_24
    move-exception p2

    goto :goto_2e

    :cond_26
    :try_start_26
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "stream is empty"

    invoke-direct {p2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_2e
    .catchall {:try_start_26 .. :try_end_2e} :catchall_24

    :goto_2e
    invoke-static {p1}, LQ8/d;->m(Ljava/io/Closeable;)V

    invoke-static {p0}, LQ8/d;->m(Ljava/io/Closeable;)V

    throw p2
.end method

.method private final U(Landroid/graphics/Bitmap;Le9/z;)Z
    .registers 5

    invoke-static {p2}, Le9/o;->c(Le9/z;)Le9/f;

    move-result-object p0

    invoke-interface {p0}, Le9/f;->b1()Ljava/io/OutputStream;

    move-result-object p0

    :try_start_8
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1, p0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result p1

    invoke-interface {p2}, Le9/z;->flush()V
    :try_end_12
    .catchall {:try_start_8 .. :try_end_12} :catchall_17

    const/4 p2, 0x0

    invoke-static {p0, p2}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return p1

    :catchall_17
    move-exception p1

    :try_start_18
    throw p1
    :try_end_19
    .catchall {:try_start_18 .. :try_end_19} :catchall_19

    :catchall_19
    move-exception p2

    invoke-static {p0, p1}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private final Y(Lw6/c;Le9/z;)V
    .registers 3

    invoke-static {p2}, Le9/o;->c(Le9/z;)Le9/f;

    move-result-object p2

    :try_start_4
    invoke-direct {p0, p1}, Lx6/e;->u(Lw6/c;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2, p0}, Le9/f;->d0(Ljava/lang/String;)Le9/f;

    invoke-interface {p2}, Le9/f;->flush()V

    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_10
    .catchall {:try_start_4 .. :try_end_10} :catchall_15

    const/4 p0, 0x0

    invoke-static {p2, p0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :catchall_15
    move-exception p0

    :try_start_16
    throw p0
    :try_end_17
    .catchall {:try_start_16 .. :try_end_17} :catchall_17

    :catchall_17
    move-exception p1

    invoke-static {p2, p0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final synthetic a(Lx6/e;Lcom/android/wallpaper/asset/a;Lz6/b$b;Lm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lx6/e;->z(Lcom/android/wallpaper/asset/a;Lz6/b$b;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lx6/e;Lcom/android/wallpaper/asset/a;Lz6/b$b;Lm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lx6/e;->B(Lcom/android/wallpaper/asset/a;Lz6/b$b;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final f(Ljava/lang/String;)Lcom/android/wallpaper/asset/a;
    .registers 3

    iget-object v0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {v0}, Lz6/b;->O0()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    new-instance v0, Lx6/g;

    invoke-direct {v0, p1, p0}, Lx6/g;-><init>(Ljava/lang/String;Lx6/r;)V

    return-object v0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method private final g(Lz6/b$d;)Lw6/c;
    .registers 5

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lz6/b$d;->a(I)Le9/B;

    move-result-object p1

    invoke-static {p1}, Le9/o;->d(Le9/B;)Le9/g;

    move-result-object p1

    const/4 v0, 0x0

    :try_start_a
    sget-object v1, Lx6/e;->t:Ljava/nio/charset/Charset;

    invoke-interface {p1, v1}, Le9/g;->h0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_10} :catch_17
    .catchall {:try_start_a .. :try_end_10} :catchall_15

    :try_start_10
    invoke-direct {p0, v1}, Lx6/e;->j(Ljava/lang/String;)Lw6/c;

    move-result-object p0

    goto :goto_2d

    :catchall_15
    move-exception p0

    goto :goto_31

    :catch_17
    move-exception p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "read params string accor io error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/nothing/wallpaper/common/log/c;->e(Ljava/lang/String;)V
    :try_end_2c
    .catchall {:try_start_10 .. :try_end_2c} :catchall_15

    move-object p0, v0

    :goto_2d
    invoke-static {p1, v0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object p0

    :goto_31
    :try_start_31
    throw p0
    :try_end_32
    .catchall {:try_start_31 .. :try_end_32} :catchall_32

    :catchall_32
    move-exception v0

    invoke-static {p1, p0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private final j(Ljava/lang/String;)Lw6/c;
    .registers 4

    invoke-static {p1}, LE8/i;->m0(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_f
    :goto_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, LE8/i;->f0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_f

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_26
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_2e

    const/4 p0, 0x0

    return-object p0

    :cond_2e
    sget-object p0, Lw6/c;->c:Lw6/c$a;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lw6/c$a;->a(Ljava/lang/String;)Lw6/c;

    move-result-object p0

    return-object p0
.end method

.method private final u(Lw6/c;)Ljava/lang/String;
    .registers 2

    invoke-virtual {p1}, Lw6/c;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final z(Lcom/android/wallpaper/asset/a;Lz6/b$b;Lm8/e;)Ljava/lang/Object;
    .registers 10

    instance-of v0, p3, Lx6/e$d;

    if-eqz v0, :cond_13

    move-object v0, p3

    check-cast v0, Lx6/e$d;

    iget v1, v0, Lx6/e$d;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lx6/e$d;->u:I

    goto :goto_18

    :cond_13
    new-instance v0, Lx6/e$d;

    invoke-direct {v0, p0, p3}, Lx6/e$d;-><init>(Lx6/e;Lm8/e;)V

    :goto_18
    iget-object p3, v0, Lx6/e$d;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx6/e$d;->u:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_3b

    if-ne v2, v4, :cond_33

    iget-object p0, v0, Lx6/e$d;->r:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Lz6/b$b;

    iget-object p0, v0, Lx6/e$d;->q:Ljava/lang/Object;

    check-cast p0, Lx6/e;

    invoke-static {p3}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_78

    :cond_33
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3b
    invoke-static {p3}, Lh8/r;->b(Ljava/lang/Object;)V

    instance-of p3, p1, Lcom/android/wallpaper/asset/o;

    if-eqz p3, :cond_4a

    move-object p3, p1

    check-cast p3, Lcom/android/wallpaper/asset/o;

    invoke-virtual {p3}, Lcom/android/wallpaper/asset/o;->O()Ljava/io/InputStream;

    move-result-object p3

    goto :goto_64

    :cond_4a
    instance-of p3, p1, Lcom/android/wallpaper/asset/d;

    const/4 v2, 0x0

    if-eqz p3, :cond_63

    move-object p3, p1

    check-cast p3, Lcom/android/wallpaper/asset/d;

    iget-object p3, p3, Lcom/android/wallpaper/asset/d;->c:Lcom/android/wallpaper/asset/a;

    instance-of v5, p3, Lcom/android/wallpaper/asset/o;

    if-eqz v5, :cond_5b

    check-cast p3, Lcom/android/wallpaper/asset/o;

    goto :goto_5c

    :cond_5b
    move-object p3, v2

    :goto_5c
    if-eqz p3, :cond_63

    invoke-virtual {p3}, Lcom/android/wallpaper/asset/o;->O()Ljava/io/InputStream;

    move-result-object p3

    goto :goto_64

    :cond_63
    move-object p3, v2

    :goto_64
    if-eqz p3, :cond_6b

    invoke-direct {p0, p3, p2}, Lx6/e;->Q(Ljava/io/InputStream;Lz6/b$b;)V

    move v3, v4

    goto :goto_80

    :cond_6b
    iput-object p0, v0, Lx6/e$d;->q:Ljava/lang/Object;

    iput-object p2, v0, Lx6/e$d;->r:Ljava/lang/Object;

    iput v4, v0, Lx6/e$d;->u:I

    invoke-static {p1, v3, v0}, LG6/a;->b(Lcom/android/wallpaper/asset/a;ZLm8/e;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_78

    return-object v1

    :cond_78
    :goto_78
    check-cast p3, Landroid/graphics/Bitmap;

    if-eqz p3, :cond_80

    invoke-direct {p0, p3, p2}, Lx6/e;->G(Landroid/graphics/Bitmap;Lz6/b$b;)Z

    move-result v3

    :cond_80
    :goto_80
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public A(Lv8/l;)Ljava/util/List;
    .registers 5

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {p0}, Lz6/b;->O0()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_16
    :goto_16
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_30

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_30
    return-object v0
.end method

.method public Q0(Ljava/lang/String;)Landroid/net/Uri;
    .registers 4

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {v0}, Lz6/b;->q0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_10

    move-object p0, v1

    goto :goto_16

    :cond_10
    iget-object p0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {p0, p1}, Lz6/b;->b0(Ljava/lang/String;)Lz6/b$d;

    move-result-object p0

    :goto_16
    if-eqz p0, :cond_1e

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lz6/b$d;->b(I)Landroid/net/Uri;

    move-result-object p0

    return-object p0

    :cond_1e
    return-object v1
.end method

.method public V(Ljava/util/List;)V
    .registers 11

    :try_start_0
    iget-object v0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {v0}, Lz6/b;->O0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_11
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x0

    if-eqz p1, :cond_48

    move-object v5, p1

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_28
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_46

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    invoke-static {}, Lx6/o;->e()Lv8/p;

    move-result-object v8

    invoke-interface {v8, v7, v3}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_28

    move-object v4, v6

    :cond_46
    check-cast v4, Ljava/lang/String;

    :cond_48
    if-eqz v4, :cond_11

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_4e
    iget-object p0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {p0, v1}, Lz6/b;->Y(Ljava/util/List;)V
    :try_end_53
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_53} :catch_54

    return-void

    :catch_54
    move-exception p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "delete cache error :"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/nothing/wallpaper/common/log/c;->e(Ljava/lang/String;)V

    return-void
.end method

.method public W(Ljava/lang/String;)Ljava/io/InputStream;
    .registers 4

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {v0}, Lz6/b;->q0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_f

    return-object v1

    :cond_f
    iget-object p0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {p0, p1}, Lz6/b;->b0(Ljava/lang/String;)Lz6/b$d;

    move-result-object p0

    if-eqz p0, :cond_2a

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lz6/b$d;->a(I)Le9/B;

    move-result-object p1

    new-instance v0, Lx6/e$b;

    invoke-direct {v0, p0, p1}, Lx6/e$b;-><init>(Lz6/b$d;Le9/B;)V

    invoke-static {v0}, Le9/o;->d(Le9/B;)Le9/g;

    move-result-object p0

    invoke-interface {p0}, Le9/g;->f1()Ljava/io/InputStream;

    move-result-object p0

    return-object p0

    :cond_2a
    return-object v1
.end method

.method public close()V
    .registers 1

    iget-object p0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {p0}, Lz6/b;->close()V

    return-void
.end method

.method public flush()V
    .registers 1

    iget-object p0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {p0}, Lz6/b;->flush()V

    return-void
.end method

.method public get(Ljava/lang/String;)Lw6/d;
    .registers 6

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {v0, p1}, Lz6/b;->b0(Ljava/lang/String;)Lz6/b$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_37

    :try_start_e
    invoke-direct {p0, v0}, Lx6/e;->g(Lz6/b$d;)Lw6/c;

    move-result-object v2
    :try_end_12
    .catchall {:try_start_e .. :try_end_12} :catchall_30

    if-nez v2, :cond_18

    invoke-static {v0, v1}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v1

    :cond_18
    :try_start_18
    invoke-direct {p0, p1}, Lx6/e;->f(Ljava/lang/String;)Lcom/android/wallpaper/asset/a;

    move-result-object p0
    :try_end_1c
    .catchall {:try_start_18 .. :try_end_1c} :catchall_30

    if-nez p0, :cond_22

    invoke-static {v0, v1}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v1

    :cond_22
    :try_start_22
    new-instance p1, Lw6/d;

    new-instance v3, Lw6/b$a;

    invoke-direct {v3, p0}, Lw6/b$a;-><init>(Lcom/android/wallpaper/asset/a;)V

    invoke-direct {p1, v2, v3}, Lw6/d;-><init>(Lw6/c;Lw6/b;)V
    :try_end_2c
    .catchall {:try_start_22 .. :try_end_2c} :catchall_30

    invoke-static {v0, v1}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object p1

    :catchall_30
    move-exception p0

    :try_start_31
    throw p0
    :try_end_32
    .catchall {:try_start_31 .. :try_end_32} :catchall_32

    :catchall_32
    move-exception p1

    invoke-static {v0, p0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1

    :cond_37
    return-object v1
.end method

.method public getCount()I
    .registers 1

    iget-object p0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {p0}, Lz6/b;->O0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public j0(Ljava/lang/String;Lw6/d;Lm8/e;)Ljava/lang/Object;
    .registers 21

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    instance-of v2, v0, Lx6/e$c;

    if-eqz v2, :cond_17

    move-object v2, v0

    check-cast v2, Lx6/e$c;

    iget v3, v2, Lx6/e$c;->w:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_17

    sub-int/2addr v3, v4

    iput v3, v2, Lx6/e$c;->w:I

    goto :goto_1c

    :cond_17
    new-instance v2, Lx6/e$c;

    invoke-direct {v2, v1, v0}, Lx6/e$c;-><init>(Lx6/e;Lm8/e;)V

    :goto_1c
    iget-object v0, v2, Lx6/e$c;->u:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lx6/e$c;->w:I

    const-string v5, ", all keys:"

    const-string v6, " "

    const-string v7, "put "

    const-string v8, "EffectImageCache"

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v4, :cond_5e

    if-ne v4, v10, :cond_56

    iget v1, v2, Lx6/e$c;->t:I

    iget-object v3, v2, Lx6/e$c;->s:Ljava/lang/Object;

    check-cast v3, Lz6/b$b;

    iget-object v4, v2, Lx6/e$c;->r:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v2, v2, Lx6/e$c;->q:Ljava/lang/Object;

    check-cast v2, Lx6/e;

    :try_start_40
    invoke-static {v0}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_43
    .catch Ljava/lang/Exception; {:try_start_40 .. :try_end_43} :catch_4f
    .catchall {:try_start_40 .. :try_end_43} :catchall_48

    move-object v12, v2

    move v2, v1

    move-object v1, v12

    move-object v12, v4

    goto :goto_95

    :catchall_48
    move-exception v0

    move-object v12, v2

    move v2, v1

    move-object v1, v12

    move-object v12, v4

    goto/16 :goto_13c

    :catch_4f
    move-exception v0

    move-object v12, v2

    move v2, v1

    move-object v1, v12

    move-object v12, v4

    goto/16 :goto_e0

    :cond_56
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5e
    invoke-static {v0}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object v11, v1, Lx6/e;->q:Lz6/b;

    const/4 v15, 0x2

    const/16 v16, 0x0

    const-wide/16 v13, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v11 .. v16}, Lz6/b;->U(Lz6/b;Ljava/lang/String;JILjava/lang/Object;)Lz6/b$b;

    move-result-object v4

    if-nez v4, :cond_75

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_75
    :try_start_75
    invoke-virtual/range {p2 .. p2}, Lw6/d;->d()Lw6/c;

    move-result-object v0

    invoke-direct {v1, v4, v0}, Lx6/e;->K(Lz6/b$b;Lw6/c;)V

    invoke-virtual/range {p2 .. p2}, Lw6/d;->c()Lw6/b;

    move-result-object v0

    iput-object v1, v2, Lx6/e$c;->q:Ljava/lang/Object;
    :try_end_82
    .catch Ljava/lang/Exception; {:try_start_75 .. :try_end_82} :catch_dc
    .catchall {:try_start_75 .. :try_end_82} :catchall_d8

    move-object/from16 v12, p1

    :try_start_84
    iput-object v12, v2, Lx6/e$c;->r:Ljava/lang/Object;

    iput-object v4, v2, Lx6/e$c;->s:Ljava/lang/Object;

    iput v9, v2, Lx6/e$c;->t:I

    iput v10, v2, Lx6/e$c;->w:I

    invoke-direct {v1, v4, v0, v2}, Lx6/e;->I(Lz6/b$b;Lw6/b;Lm8/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_90
    .catch Ljava/lang/Exception; {:try_start_84 .. :try_end_90} :catch_d4
    .catchall {:try_start_84 .. :try_end_90} :catchall_cf

    if-ne v0, v3, :cond_93

    return-object v3

    :cond_93
    move-object v3, v4

    move v2, v9

    :goto_95
    :try_start_95
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_9b
    .catch Ljava/lang/Exception; {:try_start_95 .. :try_end_9b} :catch_cd
    .catchall {:try_start_95 .. :try_end_9b} :catchall_ca

    if-eqz v0, :cond_a1

    invoke-virtual {v3}, Lz6/b$b;->c()V

    goto :goto_a4

    :cond_a1
    invoke-virtual {v3}, Lz6/b$b;->b()V

    :goto_a4
    iget-object v1, v1, Lx6/e;->q:Lz6/b;

    invoke-virtual {v1}, Lz6/b;->O0()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_133

    :catchall_ca
    move-exception v0

    goto/16 :goto_13c

    :catch_cd
    move-exception v0

    goto :goto_e0

    :catchall_cf
    move-exception v0

    :goto_d0
    move-object v3, v4

    move v2, v9

    goto/16 :goto_13c

    :catch_d4
    move-exception v0

    :goto_d5
    move-object v3, v4

    move v2, v9

    goto :goto_e0

    :catchall_d8
    move-exception v0

    move-object/from16 v12, p1

    goto :goto_d0

    :catch_dc
    move-exception v0

    move-object/from16 v12, p1

    goto :goto_d5

    :goto_e0
    :try_start_e0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, " error "

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v8, v4}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LG6/d;->b()Z

    move-result v4
    :try_end_fe
    .catchall {:try_start_e0 .. :try_end_fe} :catchall_ca

    if-eqz v4, :cond_13b

    if-eqz v2, :cond_106

    invoke-virtual {v3}, Lz6/b$b;->c()V

    goto :goto_109

    :cond_106
    invoke-virtual {v3}, Lz6/b$b;->b()V

    :goto_109
    if-eqz v2, :cond_10d

    move v0, v10

    goto :goto_10e

    :cond_10d
    move v0, v9

    :goto_10e
    iget-object v1, v1, Lx6/e;->q:Lz6/b;

    invoke-virtual {v1}, Lz6/b;->O0()Ljava/util/List;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v2

    :goto_133
    if-eqz v0, :cond_136

    move v9, v10

    :cond_136
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_13b
    :try_start_13b
    throw v0
    :try_end_13c
    .catchall {:try_start_13b .. :try_end_13c} :catchall_ca

    :goto_13c
    if-eqz v2, :cond_142

    invoke-virtual {v3}, Lz6/b$b;->c()V

    goto :goto_145

    :cond_142
    invoke-virtual {v3}, Lz6/b$b;->b()V

    :goto_145
    if-eqz v2, :cond_148

    move v9, v10

    :cond_148
    iget-object v1, v1, Lx6/e;->q:Lz6/b;

    invoke-virtual {v1}, Lz6/b;->O0()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    throw v0
.end method

.method public p(Ljava/lang/String;)V
    .registers 7

    const-string v0, "group"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "remove group "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "EffectImageCache"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {v0}, Lz6/b;->O0()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2c
    :goto_2c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-static {}, Lx6/o;->e()Lv8/p;

    move-result-object v4

    invoke-interface {v4, p1, v3}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2c

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2c

    :cond_4d
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_51
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_61

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lx6/e;->remove(Ljava/lang/String;)Z

    goto :goto_51

    :cond_61
    return-void
.end method

.method public remove(Ljava/lang/String;)Z
    .registers 4

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {p0, p1}, Lz6/b;->remove(Ljava/lang/String;)Z

    move-result p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "remove "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "EffectImageCache"

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return p0
.end method

.method public y()Z
    .registers 1

    iget-object p0, p0, Lx6/e;->q:Lz6/b;

    invoke-virtual {p0}, Lz6/b;->isClosed()Z

    move-result p0

    return p0
.end method
