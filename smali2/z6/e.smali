.class public abstract Lz6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LY8/a;Ljava/io/File;)Z
    .registers 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LY8/a;->b(Ljava/io/File;)Le9/z;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_f
    invoke-interface {p0, p1}, LY8/a;->f(Ljava/io/File;)V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_12} :catch_19
    .catchall {:try_start_f .. :try_end_12} :catchall_17

    invoke-static {v0, v1}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    const/4 p0, 0x1

    return p0

    :catchall_17
    move-exception p0

    goto :goto_23

    :catch_19
    :try_start_19
    sget-object v2, Lh8/A;->a:Lh8/A;
    :try_end_1b
    .catchall {:try_start_19 .. :try_end_1b} :catchall_17

    invoke-static {v0, v1}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-interface {p0, p1}, LY8/a;->f(Ljava/io/File;)V

    const/4 p0, 0x0

    return p0

    :goto_23
    :try_start_23
    throw p0
    :try_end_24
    .catchall {:try_start_23 .. :try_end_24} :catchall_24

    :catchall_24
    move-exception p1

    invoke-static {v0, p0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p1
.end method
