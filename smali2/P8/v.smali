.class public final LP8/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/v$a;,
        LP8/v$b;
    }
.end annotation


# static fields
.field public static final k:LP8/v$b;

.field private static final l:[C


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:I

.field private final f:Ljava/util/List;

.field private final g:Ljava/util/List;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LP8/v$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/v$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LP8/v;->k:LP8/v$b;

    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_12

    sput-object v0, LP8/v;->l:[C

    return-void

    :array_12
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .registers 11

    const-string v0, "scheme"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "username"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "password"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "host"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pathSegments"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP8/v;->a:Ljava/lang/String;

    iput-object p2, p0, LP8/v;->b:Ljava/lang/String;

    iput-object p3, p0, LP8/v;->c:Ljava/lang/String;

    iput-object p4, p0, LP8/v;->d:Ljava/lang/String;

    iput p5, p0, LP8/v;->e:I

    iput-object p6, p0, LP8/v;->f:Ljava/util/List;

    iput-object p7, p0, LP8/v;->g:Ljava/util/List;

    iput-object p8, p0, LP8/v;->h:Ljava/lang/String;

    iput-object p9, p0, LP8/v;->i:Ljava/lang/String;

    const-string p2, "https"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, LP8/v;->j:Z

    return-void
.end method

.method public static final synthetic a()[C
    .registers 1

    sget-object v0, LP8/v;->l:[C

    return-object v0
.end method

.method public static final h(Ljava/lang/String;)LP8/v;
    .registers 2

    sget-object v0, LP8/v;->k:LP8/v$b;

    invoke-virtual {v0, p0}, LP8/v$b;->d(Ljava/lang/String;)LP8/v;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .registers 7

    iget-object v0, p0, LP8/v;->h:Ljava/lang/String;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return-object p0

    :cond_6
    iget-object v0, p0, LP8/v;->i:Ljava/lang/String;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/16 v1, 0x23

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LE8/i;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object p0, p0, LP8/v;->i:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "this as java.lang.String).substring(startIndex)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final c()Ljava/lang/String;
    .registers 8

    iget-object v0, p0, LP8/v;->c:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_b

    const-string p0, ""

    return-object p0

    :cond_b
    iget-object v0, p0, LP8/v;->i:Ljava/lang/String;

    iget-object v1, p0, LP8/v;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v2, v1, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v1, 0x3a

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LE8/i;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, LP8/v;->i:Ljava/lang/String;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/16 v2, 0x40

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LE8/i;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v1

    iget-object p0, p0, LP8/v;->i:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .registers 7

    iget-object v0, p0, LP8/v;->i:Ljava/lang/String;

    iget-object v1, p0, LP8/v;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v2, v1, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v1, 0x2f

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LE8/i;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, LP8/v;->i:Ljava/lang/String;

    const-string v2, "?#"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1, v2, v0, v3}, LQ8/d;->q(Ljava/lang/String;Ljava/lang/String;II)I

    move-result v1

    iget-object p0, p0, LP8/v;->i:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final e()Ljava/util/List;
    .registers 7

    iget-object v0, p0, LP8/v;->i:Ljava/lang/String;

    iget-object v1, p0, LP8/v;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v2, v1, 0x3

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v1, 0x2f

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LE8/i;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, LP8/v;->i:Ljava/lang/String;

    const-string v2, "?#"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1, v2, v0, v3}, LQ8/d;->q(Ljava/lang/String;Ljava/lang/String;II)I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_24
    if-ge v0, v1, :cond_40

    add-int/lit8 v0, v0, 0x1

    iget-object v3, p0, LP8/v;->i:Ljava/lang/String;

    const/16 v4, 0x2f

    invoke-static {v3, v4, v0, v1}, LQ8/d;->p(Ljava/lang/String;CII)I

    move-result v3

    iget-object v4, p0, LP8/v;->i:Ljava/lang/String;

    invoke-virtual {v4, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v4, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v0, v3

    goto :goto_24

    :cond_40
    return-object v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 3

    instance-of v0, p1, LP8/v;

    if-eqz v0, :cond_12

    check-cast p1, LP8/v;

    iget-object p1, p1, LP8/v;->i:Ljava/lang/String;

    iget-object p0, p0, LP8/v;->i:Ljava/lang/String;

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    const/4 p0, 0x0

    return p0
.end method

.method public final f()Ljava/lang/String;
    .registers 7

    iget-object v0, p0, LP8/v;->g:Ljava/util/List;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return-object p0

    :cond_6
    iget-object v0, p0, LP8/v;->i:Ljava/lang/String;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/16 v1, 0x3f

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LE8/i;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, LP8/v;->i:Ljava/lang/String;

    const/16 v2, 0x23

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1, v2, v0, v3}, LQ8/d;->p(Ljava/lang/String;CII)I

    move-result v1

    iget-object p0, p0, LP8/v;->i:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final g()Ljava/lang/String;
    .registers 5

    iget-object v0, p0, LP8/v;->b:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_b

    const-string p0, ""

    return-object p0

    :cond_b
    iget-object v0, p0, LP8/v;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    iget-object v1, p0, LP8/v;->i:Ljava/lang/String;

    const-string v2, ":@"

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1, v2, v0, v3}, LQ8/d;->q(Ljava/lang/String;Ljava/lang/String;II)I

    move-result v1

    iget-object p0, p0, LP8/v;->i:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public hashCode()I
    .registers 1

    iget-object p0, p0, LP8/v;->i:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    return p0
.end method

.method public final i()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LP8/v;->d:Ljava/lang/String;

    return-object p0
.end method

.method public final j()Z
    .registers 1

    iget-boolean p0, p0, LP8/v;->j:Z

    return p0
.end method

.method public final k()LP8/v$a;
    .registers 5

    new-instance v0, LP8/v$a;

    invoke-direct {v0}, LP8/v$a;-><init>()V

    iget-object v1, p0, LP8/v;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, LP8/v$a;->w(Ljava/lang/String;)V

    invoke-virtual {p0}, LP8/v;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LP8/v$a;->t(Ljava/lang/String;)V

    invoke-virtual {p0}, LP8/v;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LP8/v$a;->s(Ljava/lang/String;)V

    iget-object v1, p0, LP8/v;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, LP8/v$a;->u(Ljava/lang/String;)V

    iget v1, p0, LP8/v;->e:I

    sget-object v2, LP8/v;->k:LP8/v$b;

    iget-object v3, p0, LP8/v;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, LP8/v$b;->c(Ljava/lang/String;)I

    move-result v2

    if-eq v1, v2, :cond_2c

    iget v1, p0, LP8/v;->e:I

    goto :goto_2d

    :cond_2c
    const/4 v1, -0x1

    :goto_2d
    invoke-virtual {v0, v1}, LP8/v$a;->v(I)V

    invoke-virtual {v0}, LP8/v$a;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-virtual {v0}, LP8/v$a;->f()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, LP8/v;->e()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, LP8/v;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LP8/v$a;->e(Ljava/lang/String;)LP8/v$a;

    invoke-virtual {p0}, LP8/v;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, LP8/v$a;->r(Ljava/lang/String;)V

    return-object v0
.end method

.method public final l(Ljava/lang/String;)LP8/v$a;
    .registers 3

    const-string v0, "link"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_5
    new-instance v0, LP8/v$a;

    invoke-direct {v0}, LP8/v$a;-><init>()V

    invoke-virtual {v0, p0, p1}, LP8/v$a;->j(LP8/v;Ljava/lang/String;)LP8/v$a;

    move-result-object p0
    :try_end_e
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_e} :catch_f

    return-object p0

    :catch_f
    const/4 p0, 0x0

    return-object p0
.end method

.method public final m()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LP8/v;->f:Ljava/util/List;

    return-object p0
.end method

.method public final n()I
    .registers 1

    iget p0, p0, LP8/v;->e:I

    return p0
.end method

.method public final o()Ljava/lang/String;
    .registers 3

    iget-object v0, p0, LP8/v;->g:Ljava/util/List;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return-object p0

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, LP8/v;->k:LP8/v$b;

    iget-object p0, p0, LP8/v;->g:Ljava/util/List;

    invoke-virtual {v1, p0, v0}, LP8/v$b;->j(Ljava/util/List;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final p()Ljava/lang/String;
    .registers 2

    const-string v0, "/..."

    invoke-virtual {p0, v0}, LP8/v;->l(Ljava/lang/String;)LP8/v$a;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const-string v0, ""

    invoke-virtual {p0, v0}, LP8/v$a;->x(Ljava/lang/String;)LP8/v$a;

    move-result-object p0

    invoke-virtual {p0, v0}, LP8/v$a;->k(Ljava/lang/String;)LP8/v$a;

    move-result-object p0

    invoke-virtual {p0}, LP8/v$a;->c()LP8/v;

    move-result-object p0

    invoke-virtual {p0}, LP8/v;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final q(Ljava/lang/String;)LP8/v;
    .registers 3

    const-string v0, "link"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LP8/v;->l(Ljava/lang/String;)LP8/v$a;

    move-result-object p0

    if-eqz p0, :cond_10

    invoke-virtual {p0}, LP8/v$a;->c()LP8/v;

    move-result-object p0

    return-object p0

    :cond_10
    const/4 p0, 0x0

    return-object p0
.end method

.method public final r()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LP8/v;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final s()Ljava/net/URI;
    .registers 4

    invoke-virtual {p0}, LP8/v;->k()LP8/v$a;

    move-result-object p0

    invoke-virtual {p0}, LP8/v$a;->o()LP8/v$a;

    move-result-object p0

    invoke-virtual {p0}, LP8/v$a;->toString()Ljava/lang/String;

    move-result-object p0

    :try_start_c
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_11
    .catch Ljava/net/URISyntaxException; {:try_start_c .. :try_end_11} :catch_12

    return-object v0

    :catch_12
    move-exception v0

    :try_start_13
    new-instance v1, LE8/g;

    const-string v2, "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"

    invoke-direct {v1, v2}, LE8/g;-><init>(Ljava/lang/String;)V

    const-string v2, ""

    invoke-virtual {v1, p0, v2}, LE8/g;->b(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object p0
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_24} :catch_2a

    const-string v0, "{\n      // Unlikely edge\u2026Unexpected!\n      }\n    }"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :catch_2a
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p0
.end method

.method public final t()Ljava/net/URL;
    .registers 2

    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object p0, p0, LP8/v;->i:Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_7} :catch_8

    return-object v0

    :catch_8
    move-exception p0

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LP8/v;->i:Ljava/lang/String;

    return-object p0
.end method
