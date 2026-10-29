.class public final LP8/v$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/v$a$a;
    }
.end annotation


# static fields
.field public static final i:LP8/v$a$a;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private final f:Ljava/util/List;

.field private g:Ljava/util/List;

.field private h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LP8/v$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/v$a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LP8/v$a;->i:LP8/v$a$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LP8/v$a;->b:Ljava/lang/String;

    iput-object v0, p0, LP8/v$a;->c:Ljava/lang/String;

    const/4 v1, -0x1

    iput v1, p0, LP8/v$a;->e:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LP8/v$a;->f:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final d()I
    .registers 3

    iget v0, p0, LP8/v$a;->e:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    return v0

    :cond_6
    sget-object v0, LP8/v;->k:LP8/v$b;

    iget-object p0, p0, LP8/v$a;->a:Ljava/lang/String;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0, p0}, LP8/v$b;->c(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private final h(Ljava/lang/String;)Z
    .registers 3

    const-string p0, "."

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    const/4 v0, 0x1

    if-nez p0, :cond_14

    const-string p0, "%2e"

    invoke-static {p1, p0, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_12

    goto :goto_14

    :cond_12
    const/4 p0, 0x0

    return p0

    :cond_14
    :goto_14
    return v0
.end method

.method private final i(Ljava/lang/String;)Z
    .registers 3

    const-string p0, ".."

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    const/4 v0, 0x1

    if-nez p0, :cond_24

    const-string p0, "%2e."

    invoke-static {p1, p0, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-nez p0, :cond_24

    const-string p0, ".%2e"

    invoke-static {p1, p0, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-nez p0, :cond_24

    const-string p0, "%2e%2e"

    invoke-static {p1, p0, v0}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_22

    goto :goto_24

    :cond_22
    const/4 p0, 0x0

    return p0

    :cond_24
    :goto_24
    return v0
.end method

.method private final l()V
    .registers 3

    iget-object v0, p0, LP8/v$a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-string v1, ""

    if-nez v0, :cond_2c

    iget-object v0, p0, LP8/v$a;->f:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2c

    iget-object p0, p0, LP8/v$a;->f:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p0, v0, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2c
    iget-object p0, p0, LP8/v$a;->f:Ljava/util/List;

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final n(Ljava/lang/String;IIZZ)V
    .registers 18

    sget-object v0, LP8/v;->k:LP8/v$b;

    const/16 v10, 0xf0

    const/4 v11, 0x0

    const-string v4, " \"<>^`{}|/\\?#"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move/from16 v5, p5

    invoke-static/range {v0 .. v11}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, LP8/v$a;->h(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1b

    goto :goto_53

    :cond_1b
    invoke-direct {p0, p1}, LP8/v$a;->i(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_25

    invoke-direct {p0}, LP8/v$a;->l()V

    return-void

    :cond_25
    iget-object p2, p0, LP8/v$a;->f:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/CharSequence;

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-nez p2, :cond_45

    iget-object p2, p0, LP8/v$a;->f:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p2, v0, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_4a

    :cond_45
    iget-object p2, p0, LP8/v$a;->f:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_4a
    if-eqz p4, :cond_53

    iget-object p0, p0, LP8/v$a;->f:Ljava/util/List;

    const-string p1, ""

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_53
    :goto_53
    return-void
.end method

.method private final p(Ljava/lang/String;II)V
    .registers 14

    if-ne p2, p3, :cond_3

    goto :goto_4a

    :cond_3
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x2f

    const-string v2, ""

    const/4 v3, 0x1

    if-eq v0, v1, :cond_1e

    const/16 v1, 0x5c

    if-ne v0, v1, :cond_13

    goto :goto_1e

    :cond_13
    iget-object v0, p0, LP8/v$a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v3

    invoke-interface {v0, v1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2a

    :cond_1e
    :goto_1e
    iget-object v0, p0, LP8/v$a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, LP8/v$a;->f:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    :goto_2a
    move v6, p2

    :goto_2b
    if-ge v6, p3, :cond_4a

    const-string p2, "/\\"

    invoke-static {p1, p2, v6, p3}, LQ8/d;->q(Ljava/lang/String;Ljava/lang/String;II)I

    move-result v7

    if-ge v7, p3, :cond_37

    move v8, v3

    goto :goto_39

    :cond_37
    const/4 p2, 0x0

    move v8, p2

    :goto_39
    const/4 v9, 0x1

    move-object v4, p0

    move-object v5, p1

    invoke-direct/range {v4 .. v9}, LP8/v$a;->n(Ljava/lang/String;IIZZ)V

    if-eqz v8, :cond_46

    add-int/lit8 v6, v7, 0x1

    move-object p0, v4

    move-object p1, v5

    goto :goto_2b

    :cond_46
    move-object p0, v4

    move-object p1, v5

    move v6, v7

    goto :goto_2b

    :cond_4a
    :goto_4a
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)LP8/v$a;
    .registers 16

    const-string v0, "encodedName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/v$a;->g:Ljava/util/List;

    if-nez v0, :cond_10

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LP8/v$a;->g:Ljava/util/List;

    :cond_10
    iget-object v0, p0, LP8/v$a;->g:Ljava/util/List;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    sget-object v1, LP8/v;->k:LP8/v$b;

    const/16 v11, 0xd3

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, " \"\'<>#&="

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v12}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LP8/v$a;->g:Ljava/util/List;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    if-eqz p2, :cond_44

    const/16 v11, 0xd3

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, " \"\'<>#&="

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, p2

    invoke-static/range {v1 .. v12}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_45

    :cond_44
    const/4 p2, 0x0

    :goto_45
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)LP8/v$a;
    .registers 16

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LP8/v$a;->g:Ljava/util/List;

    if-nez v0, :cond_10

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LP8/v$a;->g:Ljava/util/List;

    :cond_10
    iget-object v0, p0, LP8/v$a;->g:Ljava/util/List;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    sget-object v1, LP8/v;->k:LP8/v$b;

    const/16 v11, 0xdb

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v12}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, LP8/v$a;->g:Ljava/util/List;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    if-eqz p2, :cond_44

    const/16 v11, 0xdb

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, " !\"#$&\'(),/:;<=>?@[]\\^`{|}~"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, p2

    invoke-static/range {v1 .. v12}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_45

    :cond_44
    const/4 p2, 0x0

    :goto_45
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final c()LP8/v;
    .registers 19

    move-object/from16 v0, p0

    iget-object v1, v0, LP8/v$a;->a:Ljava/lang/String;

    if-eqz v1, :cond_ae

    sget-object v2, LP8/v;->k:LP8/v$b;

    iget-object v3, v0, LP8/v$a;->b:Ljava/lang/String;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, LP8/v$b;->g(LP8/v$b;Ljava/lang/String;IIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    iget-object v3, v0, LP8/v$a;->c:Ljava/lang/String;

    invoke-static/range {v2 .. v8}, LP8/v$b;->g(LP8/v$b;Ljava/lang/String;IIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, LP8/v$a;->d:Ljava/lang/String;

    if-eqz v4, :cond_a6

    invoke-direct {v0}, LP8/v$a;->d()I

    move-result v5

    iget-object v2, v0, LP8/v$a;->f:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v2, v7}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_34
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_51

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Ljava/lang/String;

    sget-object v10, LP8/v;->k:LP8/v$b;

    const/4 v15, 0x7

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v10 .. v16}, LP8/v$b;->g(LP8/v$b;Ljava/lang/String;IIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_34

    :cond_51
    iget-object v2, v0, LP8/v$a;->g:Ljava/util/List;

    const/4 v8, 0x0

    if-eqz v2, :cond_89

    check-cast v2, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v2, v7}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v10, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_65
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_87

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v12, v7

    check-cast v12, Ljava/lang/String;

    if-eqz v12, :cond_82

    sget-object v11, LP8/v;->k:LP8/v$b;

    const/16 v16, 0x3

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-static/range {v11 .. v17}, LP8/v$b;->g(LP8/v$b;Ljava/lang/String;IIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto :goto_83

    :cond_82
    move-object v7, v8

    :goto_83
    invoke-interface {v10, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_65

    :cond_87
    move-object v7, v10

    goto :goto_8a

    :cond_89
    move-object v7, v8

    :goto_8a
    iget-object v11, v0, LP8/v$a;->h:Ljava/lang/String;

    if-eqz v11, :cond_9a

    sget-object v10, LP8/v;->k:LP8/v$b;

    const/4 v15, 0x7

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v10 .. v16}, LP8/v$b;->g(LP8/v$b;Ljava/lang/String;IIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    :cond_9a
    invoke-virtual {v0}, LP8/v$a;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v2, v9

    move-object v9, v0

    new-instance v0, LP8/v;

    invoke-direct/range {v0 .. v9}, LP8/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_a6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "host == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_ae
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "scheme == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(Ljava/lang/String;)LP8/v$a;
    .registers 14

    if-eqz p1, :cond_1c

    sget-object v0, LP8/v;->k:LP8/v$b;

    const/16 v10, 0xd3

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, " \"\'<>#"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v11}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1c

    invoke-virtual {v0, p1}, LP8/v$b;->i(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    goto :goto_1d

    :cond_1c
    const/4 p1, 0x0

    :goto_1d
    iput-object p1, p0, LP8/v$a;->g:Ljava/util/List;

    return-object p0
.end method

.method public final f()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LP8/v$a;->f:Ljava/util/List;

    return-object p0
.end method

.method public final g(Ljava/lang/String;)LP8/v$a;
    .registers 10

    const-string v0, "host"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LP8/v;->k:LP8/v$b;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, LP8/v$b;->g(LP8/v$b;Ljava/lang/String;IIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LQ8/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1a

    iput-object p1, p0, LP8/v$a;->d:Ljava/lang/String;

    return-object p0

    :cond_1a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "unexpected host: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final j(LP8/v;Ljava/lang/String;)LP8/v$a;
    .registers 27

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    const-string v1, "input"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-static {v2, v1, v1, v3, v4}, LQ8/d;->A(Ljava/lang/String;IIILjava/lang/Object;)I

    move-result v3

    const/4 v5, 0x2

    invoke-static {v2, v3, v1, v5, v4}, LQ8/d;->C(Ljava/lang/String;IIILjava/lang/Object;)I

    move-result v13

    sget-object v4, LP8/v$a;->i:LP8/v$a$a;

    invoke-static {v4, v2, v3, v13}, LP8/v$a$a;->c(LP8/v$a$a;Ljava/lang/String;II)I

    move-result v6

    const-string v14, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    const/4 v15, 0x1

    const/4 v7, -0x1

    if-eq v6, v7, :cond_62

    const-string v8, "https:"

    invoke-static {v2, v8, v3, v15}, LE8/i;->J(Ljava/lang/String;Ljava/lang/String;IZ)Z

    move-result v8

    if-eqz v8, :cond_30

    const-string v6, "https"

    iput-object v6, v0, LP8/v$a;->a:Ljava/lang/String;

    add-int/lit8 v3, v3, 0x6

    goto :goto_6a

    :cond_30
    const-string v8, "http:"

    invoke-static {v2, v8, v3, v15}, LE8/i;->J(Ljava/lang/String;Ljava/lang/String;IZ)Z

    move-result v8

    if-eqz v8, :cond_3f

    const-string v6, "http"

    iput-object v6, v0, LP8/v$a;->a:Ljava/lang/String;

    add-int/lit8 v3, v3, 0x5

    goto :goto_6a

    :cond_3f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Expected URL scheme \'http\' or \'https\' but was \'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v14}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_62
    if-eqz p1, :cond_276

    invoke-virtual/range {p1 .. p1}, LP8/v;->r()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v0, LP8/v$a;->a:Ljava/lang/String;

    :goto_6a
    invoke-static {v4, v2, v3, v13}, LP8/v$a$a;->d(LP8/v$a$a;Ljava/lang/String;II)I

    move-result v4

    const/16 v6, 0x3f

    const/16 v8, 0x23

    if-ge v4, v5, :cond_c0

    if-eqz p1, :cond_c0

    invoke-virtual/range {p1 .. p1}, LP8/v;->r()Ljava/lang/String;

    move-result-object v5

    iget-object v9, v0, LP8/v$a;->a:Ljava/lang/String;

    invoke-static {v5, v9}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_83

    goto :goto_c0

    :cond_83
    invoke-virtual/range {p1 .. p1}, LP8/v;->g()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, LP8/v$a;->b:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, LP8/v;->c()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, LP8/v$a;->c:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, LP8/v;->i()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, LP8/v$a;->d:Ljava/lang/String;

    invoke-virtual/range {p1 .. p1}, LP8/v;->n()I

    move-result v1

    iput v1, v0, LP8/v$a;->e:I

    iget-object v1, v0, LP8/v$a;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, v0, LP8/v$a;->f:Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, LP8/v;->e()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v1, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    if-eq v3, v13, :cond_b3

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v8, :cond_ba

    :cond_b3
    invoke-virtual/range {p1 .. p1}, LP8/v;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LP8/v$a;->e(Ljava/lang/String;)LP8/v$a;

    :cond_ba
    move/from16 v18, v13

    move/from16 v23, v15

    goto/16 :goto_1f8

    :cond_c0
    :goto_c0
    add-int/2addr v3, v4

    move/from16 v16, v1

    move/from16 v17, v16

    :goto_c5
    const-string v1, "@/\\?#"

    invoke-static {v2, v1, v3, v13}, LQ8/d;->q(Ljava/lang/String;Ljava/lang/String;II)I

    move-result v1

    if-eq v1, v13, :cond_d2

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    goto :goto_d3

    :cond_d2
    move v4, v7

    :goto_d3
    if-eq v4, v7, :cond_18a

    if-eq v4, v8, :cond_18a

    const/16 v5, 0x2f

    if-eq v4, v5, :cond_18a

    const/16 v5, 0x5c

    if-eq v4, v5, :cond_18a

    if-eq v4, v6, :cond_18a

    const/16 v5, 0x40

    if-eq v4, v5, :cond_e6

    goto :goto_c5

    :cond_e6
    const-string v4, "%40"

    if-nez v16, :cond_14e

    const/16 v5, 0x3a

    invoke-static {v2, v5, v3, v1}, LQ8/d;->p(Ljava/lang/String;CII)I

    move-result v5

    move v9, v1

    sget-object v1, LP8/v;->k:LP8/v$b;

    const/16 v11, 0xf0

    const/4 v12, 0x0

    move-object v10, v4

    move v4, v5

    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    move/from16 v18, v6

    const/4 v6, 0x1

    move/from16 v19, v7

    const/4 v7, 0x0

    move/from16 v20, v8

    const/4 v8, 0x0

    move/from16 v21, v9

    const/4 v9, 0x0

    move-object/from16 v22, v10

    const/4 v10, 0x0

    move/from16 v18, v13

    move/from16 v23, v15

    move/from16 v15, v21

    move-object/from16 v13, v22

    invoke-static/range {v1 .. v12}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eqz v17, :cond_12b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v0, LP8/v$a;->b:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_12b
    iput-object v3, v0, LP8/v$a;->b:Ljava/lang/String;

    if-eq v4, v15, :cond_147

    add-int/lit8 v3, v4, 0x1

    const/16 v11, 0xf0

    const/4 v12, 0x0

    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v2, p2

    move v4, v15

    invoke-static/range {v1 .. v12}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, LP8/v$a;->c:Ljava/lang/String;

    move/from16 v16, v23

    goto :goto_148

    :cond_147
    move v4, v15

    :goto_148
    move-object/from16 v2, p2

    move v9, v4

    move/from16 v17, v23

    goto :goto_17d

    :cond_14e
    move/from16 v18, v13

    move/from16 v23, v15

    move-object v13, v4

    move v4, v1

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v0, LP8/v$a;->c:Ljava/lang/String;

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, LP8/v;->k:LP8/v$b;

    const/16 v11, 0xf0

    const/4 v12, 0x0

    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v2, p2

    invoke-static/range {v1 .. v12}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move v9, v4

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, LP8/v$a;->c:Ljava/lang/String;

    :goto_17d
    add-int/lit8 v3, v9, 0x1

    move/from16 v13, v18

    move/from16 v15, v23

    const/16 v6, 0x3f

    const/4 v7, -0x1

    const/16 v8, 0x23

    goto/16 :goto_c5

    :cond_18a
    move v9, v1

    move/from16 v18, v13

    move/from16 v23, v15

    sget-object v8, LP8/v$a;->i:LP8/v$a$a;

    invoke-static {v8, v2, v3, v9}, LP8/v$a$a;->b(LP8/v$a$a;Ljava/lang/String;II)I

    move-result v4

    add-int/lit8 v10, v4, 0x1

    const/16 v11, 0x22

    if-ge v10, v9, :cond_1d9

    sget-object v1, LP8/v;->k:LP8/v$b;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, LP8/v$b;->g(LP8/v$b;Ljava/lang/String;IIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LQ8/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, LP8/v$a;->d:Ljava/lang/String;

    invoke-static {v8, v2, v10, v9}, LP8/v$a$a;->a(LP8/v$a$a;Ljava/lang/String;II)I

    move-result v1

    iput v1, v0, LP8/v$a;->e:I

    const/4 v5, -0x1

    if-eq v1, v5, :cond_1b4

    goto :goto_1f3

    :cond_1b4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid URL port: \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v14}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1d9
    sget-object v1, LP8/v;->k:LP8/v$b;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, LP8/v$b;->g(LP8/v$b;Ljava/lang/String;IIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LQ8/a;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v0, LP8/v$a;->d:Ljava/lang/String;

    iget-object v5, v0, LP8/v$a;->a:Ljava/lang/String;

    invoke-static {v5}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v1, v5}, LP8/v$b;->c(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, LP8/v$a;->e:I

    :goto_1f3
    iget-object v1, v0, LP8/v$a;->d:Ljava/lang/String;

    if-eqz v1, :cond_251

    move v3, v9

    :goto_1f8
    const-string v1, "?#"

    move/from16 v13, v18

    invoke-static {v2, v1, v3, v13}, LQ8/d;->q(Ljava/lang/String;Ljava/lang/String;II)I

    move-result v1

    invoke-direct {v0, v2, v3, v1}, LP8/v$a;->p(Ljava/lang/String;II)V

    if-ge v1, v13, :cond_22e

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x3f

    if-ne v3, v4, :cond_22e

    const/16 v14, 0x23

    invoke-static {v2, v14, v1, v13}, LQ8/d;->p(Ljava/lang/String;CII)I

    move-result v4

    move v3, v1

    sget-object v1, LP8/v;->k:LP8/v$b;

    add-int/lit8 v3, v3, 0x1

    const/16 v11, 0xd0

    const/4 v12, 0x0

    const-string v5, " \"\'<>#"

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, LP8/v$b;->i(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, LP8/v$a;->g:Ljava/util/List;

    move v1, v4

    goto :goto_232

    :cond_22e
    move v3, v1

    const/16 v14, 0x23

    move v1, v3

    :goto_232
    if-ge v1, v13, :cond_250

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-ne v3, v14, :cond_250

    move v3, v1

    sget-object v1, LP8/v;->k:LP8/v$b;

    add-int/lit8 v3, v3, 0x1

    const/16 v11, 0xb0

    const/4 v12, 0x0

    const-string v5, ""

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    move v4, v13

    invoke-static/range {v1 .. v12}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, LP8/v$a;->h:Ljava/lang/String;

    :cond_250
    return-object v0

    :cond_251
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid URL host: \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v14}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_276
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-le v0, v1, :cond_293

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2, v1}, LE8/i;->Q0(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_294

    :cond_293
    move-object v0, v2

    :goto_294
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected URL scheme \'http\' or \'https\' but no scheme was found for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final k(Ljava/lang/String;)LP8/v$a;
    .registers 15

    const-string v0, "password"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LP8/v;->k:LP8/v$b;

    const/16 v11, 0xfb

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v12}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LP8/v$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final m(I)LP8/v$a;
    .registers 3

    const/4 v0, 0x1

    if-gt v0, p1, :cond_a

    const/high16 v0, 0x10000

    if-ge p1, v0, :cond_a

    iput p1, p0, LP8/v$a;->e:I

    return-object p0

    :cond_a
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "unexpected port: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final o()LP8/v$a;
    .registers 19

    move-object/from16 v0, p0

    iget-object v1, v0, LP8/v$a;->d:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_15

    new-instance v3, LE8/g;

    const-string v4, "[\"<>^`{|}]"

    invoke-direct {v3, v4}, LE8/g;-><init>(Ljava/lang/String;)V

    const-string v4, ""

    invoke-virtual {v3, v1, v4}, LE8/g;->b(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_16

    :cond_15
    move-object v1, v2

    :goto_16
    iput-object v1, v0, LP8/v$a;->d:Ljava/lang/String;

    iget-object v1, v0, LP8/v$a;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x0

    move v4, v3

    :goto_20
    if-ge v4, v1, :cond_43

    iget-object v5, v0, LP8/v$a;->f:Ljava/util/List;

    sget-object v6, LP8/v;->k:LP8/v$b;

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const/16 v16, 0xe3

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v10, "[]"

    const/4 v11, 0x1

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v6 .. v17}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v4, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_20

    :cond_43
    iget-object v1, v0, LP8/v$a;->g:Ljava/util/List;

    if-eqz v1, :cond_71

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    :goto_4b
    if-ge v3, v4, :cond_71

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_6a

    sget-object v6, LP8/v;->k:LP8/v$b;

    const/16 v16, 0xc3

    const/16 v17, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v10, "\\^`{|}"

    const/4 v11, 0x1

    const/4 v12, 0x1

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v6 .. v17}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    goto :goto_6b

    :cond_6a
    move-object v5, v2

    :goto_6b
    invoke-interface {v1, v3, v5}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_4b

    :cond_71
    iget-object v6, v0, LP8/v$a;->h:Ljava/lang/String;

    if-eqz v6, :cond_88

    sget-object v5, LP8/v;->k:LP8/v$b;

    const/16 v15, 0xa3

    const/16 v16, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, " \"#<>\\^`{|}"

    const/4 v10, 0x1

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static/range {v5 .. v16}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_88
    iput-object v2, v0, LP8/v$a;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final q(Ljava/lang/String;)LP8/v$a;
    .registers 5

    const-string v0, "scheme"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "http"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_11

    iput-object v0, p0, LP8/v$a;->a:Ljava/lang/String;

    return-object p0

    :cond_11
    const-string v0, "https"

    invoke-static {p1, v0, v1}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1c

    iput-object v0, p0, LP8/v$a;->a:Ljava/lang/String;

    return-object p0

    :cond_1c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unexpected scheme: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final r(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, LP8/v$a;->h:Ljava/lang/String;

    return-void
.end method

.method public final s(Ljava/lang/String;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP8/v$a;->c:Ljava/lang/String;

    return-void
.end method

.method public final t(Ljava/lang/String;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LP8/v$a;->b:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LP8/v$a;->a:Ljava/lang/String;

    if-eqz v1, :cond_12

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_17

    :cond_12
    const-string v1, "//"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_17
    iget-object v1, p0, LP8/v$a;->b:Ljava/lang/String;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/16 v2, 0x3a

    if-lez v1, :cond_22

    goto :goto_2a

    :cond_22
    iget-object v1, p0, LP8/v$a;->c:Ljava/lang/String;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_44

    :goto_2a
    iget-object v1, p0, LP8/v$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP8/v$a;->c:Ljava/lang/String;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_3f

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP8/v$a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3f
    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_44
    iget-object v1, p0, LP8/v$a;->d:Ljava/lang/String;

    if-eqz v1, :cond_69

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v3, v4}, LE8/i;->R(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_64

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP8/v$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_69

    :cond_64
    iget-object v1, p0, LP8/v$a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_69
    :goto_69
    iget v1, p0, LP8/v$a;->e:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_72

    iget-object v1, p0, LP8/v$a;->a:Ljava/lang/String;

    if-eqz v1, :cond_8b

    :cond_72
    invoke-direct {p0}, LP8/v$a;->d()I

    move-result v1

    iget-object v3, p0, LP8/v$a;->a:Ljava/lang/String;

    if-eqz v3, :cond_85

    sget-object v4, LP8/v;->k:LP8/v$b;

    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, LP8/v$b;->c(Ljava/lang/String;)I

    move-result v3

    if-eq v1, v3, :cond_8b

    :cond_85
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_8b
    sget-object v1, LP8/v;->k:LP8/v$b;

    iget-object v2, p0, LP8/v$a;->f:Ljava/util/List;

    invoke-virtual {v1, v2, v0}, LP8/v$b;->h(Ljava/util/List;Ljava/lang/StringBuilder;)V

    iget-object v2, p0, LP8/v$a;->g:Ljava/util/List;

    if-eqz v2, :cond_a3

    const/16 v2, 0x3f

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, LP8/v$a;->g:Ljava/util/List;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v0}, LP8/v$b;->j(Ljava/util/List;Ljava/lang/StringBuilder;)V

    :cond_a3
    iget-object v1, p0, LP8/v$a;->h:Ljava/lang/String;

    if-eqz v1, :cond_b1

    const/16 v1, 0x23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p0, p0, LP8/v$a;->h:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final u(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, LP8/v$a;->d:Ljava/lang/String;

    return-void
.end method

.method public final v(I)V
    .registers 2

    iput p1, p0, LP8/v$a;->e:I

    return-void
.end method

.method public final w(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, LP8/v$a;->a:Ljava/lang/String;

    return-void
.end method

.method public final x(Ljava/lang/String;)LP8/v$a;
    .registers 15

    const-string v0, "username"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LP8/v;->k:LP8/v$b;

    const/16 v11, 0xfb

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v12}, LP8/v$b;->b(LP8/v$b;Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LP8/v$a;->b:Ljava/lang/String;

    return-object p0
.end method
