.class public final Lz6/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:[J

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/List;

.field private e:Z

.field private f:Z

.field private g:Lz6/b$b;

.field private h:I

.field private i:J

.field final synthetic j:Lz6/b;


# direct methods
.method public constructor <init>(Lz6/b;Ljava/lang/String;)V
    .registers 9

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lz6/b$c;->j:Lz6/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lz6/b$c;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lz6/b;->A0()I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Lz6/b$c;->b:[J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz6/b$c;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz6/b$c;->d:Ljava/util/List;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 p2, 0x2e

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    invoke-virtual {p1}, Lz6/b;->A0()I

    move-result p1

    const/4 v1, 0x0

    :goto_35
    if-ge v1, p1, :cond_71

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz6/b$c;->c:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    new-instance v3, Ljava/io/File;

    iget-object v4, p0, Lz6/b$c;->j:Lz6/b;

    invoke-virtual {v4}, Lz6/b;->t0()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const-string v2, ".tmp"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lz6/b$c;->d:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    new-instance v3, Ljava/io/File;

    iget-object v4, p0, Lz6/b$c;->j:Lz6/b;

    invoke-virtual {v4}, Lz6/b;->t0()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->setLength(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_35

    :cond_71
    return-void
.end method

.method private final j(Ljava/util/List;)Ljava/lang/Void;
    .registers 4

    new-instance p0, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "unexpected journal line: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final k(I)Le9/B;
    .registers 4

    iget-object v0, p0, Lz6/b$c;->j:Lz6/b;

    invoke-virtual {v0}, Lz6/b;->w0()LY8/a;

    move-result-object v0

    iget-object v1, p0, Lz6/b$c;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    invoke-interface {v0, p1}, LY8/a;->a(Ljava/io/File;)Le9/B;

    move-result-object p1

    iget-object v0, p0, Lz6/b$c;->j:Lz6/b;

    invoke-static {v0}, Lz6/b;->b(Lz6/b;)Z

    move-result v0

    if-eqz v0, :cond_1b

    return-object p1

    :cond_1b
    iget v0, p0, Lz6/b$c;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lz6/b$c;->h:I

    new-instance v0, Lz6/b$c$a;

    iget-object v1, p0, Lz6/b$c;->j:Lz6/b;

    invoke-direct {v0, p1, v1, p0}, Lz6/b$c$a;-><init>(Le9/B;Lz6/b;Lz6/b$c;)V

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .registers 1

    iget-object p0, p0, Lz6/b$c;->c:Ljava/util/List;

    return-object p0
.end method

.method public final b()Lz6/b$b;
    .registers 1

    iget-object p0, p0, Lz6/b$c;->g:Lz6/b$b;

    return-object p0
.end method

.method public final c()Ljava/util/List;
    .registers 1

    iget-object p0, p0, Lz6/b$c;->d:Ljava/util/List;

    return-object p0
.end method

.method public final d()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lz6/b$c;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final e()[J
    .registers 1

    iget-object p0, p0, Lz6/b$c;->b:[J

    return-object p0
.end method

.method public final f()I
    .registers 1

    iget p0, p0, Lz6/b$c;->h:I

    return p0
.end method

.method public final g()Z
    .registers 1

    iget-boolean p0, p0, Lz6/b$c;->e:Z

    return p0
.end method

.method public final h()J
    .registers 3

    iget-wide v0, p0, Lz6/b$c;->i:J

    return-wide v0
.end method

.method public final i()Z
    .registers 1

    iget-boolean p0, p0, Lz6/b$c;->f:Z

    return p0
.end method

.method public final l(Lz6/b$b;)V
    .registers 2

    iput-object p1, p0, Lz6/b$c;->g:Lz6/b$b;

    return-void
.end method

.method public final m(Ljava/util/List;)V
    .registers 7

    const-string v0, "strings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lz6/b$c;->j:Lz6/b;

    invoke-virtual {v1}, Lz6/b;->A0()I

    move-result v1

    if-ne v0, v1, :cond_36

    :try_start_11
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_19
    if-ge v1, v0, :cond_2c

    iget-object v2, p0, Lz6/b$c;->b:[J

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    aput-wide v3, v2, v1
    :try_end_29
    .catch Ljava/lang/NumberFormatException; {:try_start_11 .. :try_end_29} :catch_2d

    add-int/lit8 v1, v1, 0x1

    goto :goto_19

    :cond_2c
    return-void

    :catch_2d
    invoke-direct {p0, p1}, Lz6/b$c;->j(Ljava/util/List;)Ljava/lang/Void;

    new-instance p0, Lh8/f;

    invoke-direct {p0}, Lh8/f;-><init>()V

    throw p0

    :cond_36
    invoke-direct {p0, p1}, Lz6/b$c;->j(Ljava/util/List;)Ljava/lang/Void;

    new-instance p0, Lh8/f;

    invoke-direct {p0}, Lh8/f;-><init>()V

    throw p0
.end method

.method public final n(I)V
    .registers 2

    iput p1, p0, Lz6/b$c;->h:I

    return-void
.end method

.method public final o(Z)V
    .registers 2

    iput-boolean p1, p0, Lz6/b$c;->e:Z

    return-void
.end method

.method public final p(J)V
    .registers 3

    iput-wide p1, p0, Lz6/b$c;->i:J

    return-void
.end method

.method public final q(Z)V
    .registers 2

    iput-boolean p1, p0, Lz6/b$c;->f:Z

    return-void
.end method

.method public final r()Lz6/b$d;
    .registers 11

    iget-boolean v0, p0, Lz6/b$c;->e:Z

    const/4 v1, 0x0

    if-nez v0, :cond_6

    return-object v1

    :cond_6
    iget-object v0, p0, Lz6/b$c;->j:Lz6/b;

    invoke-static {v0}, Lz6/b;->b(Lz6/b;)Z

    move-result v0

    if-nez v0, :cond_17

    iget-object v0, p0, Lz6/b$c;->g:Lz6/b$b;

    if-nez v0, :cond_16

    iget-boolean v0, p0, Lz6/b$c;->f:Z

    if-eqz v0, :cond_17

    :cond_16
    return-object v1

    :cond_17
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lz6/b$c;->b:[J

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, [J

    :try_start_25
    iget-object v0, p0, Lz6/b$c;->j:Lz6/b;

    invoke-virtual {v0}, Lz6/b;->A0()I

    move-result v0

    const/4 v2, 0x0

    :goto_2c
    if-ge v2, v0, :cond_38

    invoke-direct {p0, v2}, Lz6/b$c;->k(I)Le9/B;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2c

    :cond_38
    new-instance v2, Lz6/b$d;

    iget-object v3, p0, Lz6/b$c;->j:Lz6/b;

    iget-object v4, p0, Lz6/b$c;->a:Ljava/lang/String;

    iget-wide v5, p0, Lz6/b$c;->i:J

    iget-object v9, p0, Lz6/b$c;->c:Ljava/util/List;

    invoke-direct/range {v2 .. v9}, Lz6/b$d;-><init>(Lz6/b;Ljava/lang/String;JLjava/util/List;[JLjava/util/List;)V
    :try_end_45
    .catch Ljava/io/FileNotFoundException; {:try_start_25 .. :try_end_45} :catch_46

    return-object v2

    :catch_46
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le9/B;

    invoke-static {v2}, LQ8/d;->m(Ljava/io/Closeable;)V

    goto :goto_4a

    :cond_5a
    :try_start_5a
    iget-object v0, p0, Lz6/b$c;->j:Lz6/b;

    invoke-virtual {v0, p0}, Lz6/b;->g1(Lz6/b$c;)Z
    :try_end_5f
    .catch Ljava/io/IOException; {:try_start_5a .. :try_end_5f} :catch_5f

    :catch_5f
    return-object v1
.end method

.method public final s(Le9/f;)V
    .registers 7

    const-string v0, "writer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lz6/b$c;->b:[J

    array-length v0, p0

    const/4 v1, 0x0

    :goto_9
    if-ge v1, v0, :cond_19

    aget-wide v2, p0, v1

    const/16 v4, 0x20

    invoke-interface {p1, v4}, Le9/f;->F(I)Le9/f;

    move-result-object v4

    invoke-interface {v4, v2, v3}, Le9/f;->Z0(J)Le9/f;

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_19
    return-void
.end method
