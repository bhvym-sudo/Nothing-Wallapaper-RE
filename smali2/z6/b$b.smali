.class public final Lz6/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private final a:Lz6/b$c;

.field private final b:[Z

.field private c:Z

.field final synthetic d:Lz6/b;


# direct methods
.method public constructor <init>(Lz6/b;Lz6/b$c;)V
    .registers 4

    const-string v0, "entry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lz6/b$b;->d:Lz6/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lz6/b$b;->a:Lz6/b$c;

    invoke-virtual {p2}, Lz6/b$c;->g()Z

    move-result p2

    if-eqz p2, :cond_14

    const/4 p1, 0x0

    goto :goto_1a

    :cond_14
    invoke-virtual {p1}, Lz6/b;->A0()I

    move-result p1

    new-array p1, p1, [Z

    :goto_1a
    iput-object p1, p0, Lz6/b$b;->b:[Z

    return-void
.end method

.method public static synthetic a(Lz6/b;Lz6/b$b;Ljava/io/IOException;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, Lz6/b$b;->h(Lz6/b;Lz6/b$b;Ljava/io/IOException;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lz6/b;Lz6/b$b;Ljava/io/IOException;)Lh8/A;
    .registers 4

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_6
    invoke-virtual {p1}, Lz6/b$b;->d()V
    :try_end_9
    .catchall {:try_start_6 .. :try_end_9} :catchall_d

    monitor-exit p0

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :catchall_d
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final b()V
    .registers 3

    iget-object v0, p0, Lz6/b$b;->d:Lz6/b;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lz6/b$b;->c:Z

    if-nez v1, :cond_21

    iget-object v1, p0, Lz6/b$b;->a:Lz6/b$c;

    invoke-virtual {v1}, Lz6/b$c;->b()Lz6/b$b;

    move-result-object v1

    invoke-static {v1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1a

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lz6/b;->I(Lz6/b$b;Z)V

    goto :goto_1a

    :catchall_18
    move-exception p0

    goto :goto_29

    :cond_1a
    :goto_1a
    const/4 v1, 0x1

    iput-boolean v1, p0, Lz6/b$b;->c:Z

    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_1f
    .catchall {:try_start_3 .. :try_end_1f} :catchall_18

    monitor-exit v0

    return-void

    :cond_21
    :try_start_21
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_29
    .catchall {:try_start_21 .. :try_end_29} :catchall_18

    :goto_29
    monitor-exit v0

    throw p0
.end method

.method public final c()V
    .registers 4

    iget-object v0, p0, Lz6/b$b;->d:Lz6/b;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lz6/b$b;->c:Z

    if-nez v1, :cond_20

    iget-object v1, p0, Lz6/b$b;->a:Lz6/b$c;

    invoke-virtual {v1}, Lz6/b$c;->b()Lz6/b$b;

    move-result-object v1

    invoke-static {v1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1a

    invoke-virtual {v0, p0, v2}, Lz6/b;->I(Lz6/b$b;Z)V

    goto :goto_1a

    :catchall_18
    move-exception p0

    goto :goto_28

    :cond_1a
    :goto_1a
    iput-boolean v2, p0, Lz6/b$b;->c:Z

    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_1e
    .catchall {:try_start_3 .. :try_end_1e} :catchall_18

    monitor-exit v0

    return-void

    :cond_20
    :try_start_20
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_28
    .catchall {:try_start_20 .. :try_end_28} :catchall_18

    :goto_28
    monitor-exit v0

    throw p0
.end method

.method public final d()V
    .registers 3

    iget-object v0, p0, Lz6/b$b;->a:Lz6/b$c;

    invoke-virtual {v0}, Lz6/b$c;->b()Lz6/b$b;

    move-result-object v0

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    iget-object v0, p0, Lz6/b$b;->d:Lz6/b;

    invoke-static {v0}, Lz6/b;->b(Lz6/b;)Z

    move-result v0

    if-eqz v0, :cond_1b

    iget-object v0, p0, Lz6/b$b;->d:Lz6/b;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lz6/b;->I(Lz6/b$b;Z)V

    return-void

    :cond_1b
    iget-object p0, p0, Lz6/b$b;->a:Lz6/b$c;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lz6/b$c;->q(Z)V

    :cond_21
    return-void
.end method

.method public final e()Lz6/b$c;
    .registers 1

    iget-object p0, p0, Lz6/b$b;->a:Lz6/b$c;

    return-object p0
.end method

.method public final f()[Z
    .registers 1

    iget-object p0, p0, Lz6/b$b;->b:[Z

    return-object p0
.end method

.method public final g(I)Le9/z;
    .registers 5

    iget-object v0, p0, Lz6/b$b;->d:Lz6/b;

    monitor-enter v0

    :try_start_3
    iget-boolean v1, p0, Lz6/b$b;->c:Z

    if-nez v1, :cond_51

    iget-object v1, p0, Lz6/b$b;->a:Lz6/b$c;

    invoke-virtual {v1}, Lz6/b$c;->b()Lz6/b$b;

    move-result-object v1

    invoke-static {v1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    invoke-static {}, Le9/o;->b()Le9/z;

    move-result-object p0
    :try_end_17
    .catchall {:try_start_3 .. :try_end_17} :catchall_19

    monitor-exit v0

    return-object p0

    :catchall_19
    move-exception p0

    goto :goto_59

    :cond_1b
    :try_start_1b
    iget-object v1, p0, Lz6/b$b;->a:Lz6/b$c;

    invoke-virtual {v1}, Lz6/b$c;->g()Z

    move-result v1

    if-nez v1, :cond_2b

    iget-object v1, p0, Lz6/b$b;->b:[Z

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const/4 v2, 0x1

    aput-boolean v2, v1, p1

    :cond_2b
    iget-object v1, p0, Lz6/b$b;->a:Lz6/b$c;

    invoke-virtual {v1}, Lz6/b$c;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;
    :try_end_37
    .catchall {:try_start_1b .. :try_end_37} :catchall_19

    :try_start_37
    invoke-virtual {v0}, Lz6/b;->w0()LY8/a;

    move-result-object v1

    invoke-interface {v1, p1}, LY8/a;->b(Ljava/io/File;)Le9/z;

    move-result-object p1
    :try_end_3f
    .catch Ljava/io/FileNotFoundException; {:try_start_37 .. :try_end_3f} :catch_4b
    .catchall {:try_start_37 .. :try_end_3f} :catchall_19

    :try_start_3f
    new-instance v1, Lz6/d;

    new-instance v2, Lz6/c;

    invoke-direct {v2, v0, p0}, Lz6/c;-><init>(Lz6/b;Lz6/b$b;)V

    invoke-direct {v1, p1, v2}, Lz6/d;-><init>(Le9/z;Lv8/l;)V
    :try_end_49
    .catchall {:try_start_3f .. :try_end_49} :catchall_19

    monitor-exit v0

    return-object v1

    :catch_4b
    :try_start_4b
    invoke-static {}, Le9/o;->b()Le9/z;

    move-result-object p0
    :try_end_4f
    .catchall {:try_start_4b .. :try_end_4f} :catchall_19

    monitor-exit v0

    return-object p0

    :cond_51
    :try_start_51
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Check failed."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_59
    .catchall {:try_start_51 .. :try_end_59} :catchall_19

    :goto_59
    monitor-exit v0

    throw p0
.end method
