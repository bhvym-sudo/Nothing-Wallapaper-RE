.class public final Lz6/b$e;
.super LT8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz6/b;-><init>(LY8/a;Ljava/io/File;IIJLT8/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:Lz6/b;


# direct methods
.method constructor <init>(Lz6/b;)V
    .registers 5

    iput-object p1, p0, Lz6/b$e;->e:Lz6/b;

    const/4 p1, 0x2

    const/4 v0, 0x0

    const-string v1, "Effect Image Cache"

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, p1, v0}, LT8/a;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/h;)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 5

    iget-object p0, p0, Lz6/b$e;->e:Lz6/b;

    monitor-enter p0

    :try_start_3
    invoke-static {p0}, Lz6/b;->f(Lz6/b;)Z

    move-result v0

    const-wide/16 v1, -0x1

    if-eqz v0, :cond_3a

    invoke-virtual {p0}, Lz6/b;->q0()Z

    move-result v0
    :try_end_f
    .catchall {:try_start_3 .. :try_end_f} :catchall_17

    if-eqz v0, :cond_12

    goto :goto_3a

    :cond_12
    const/4 v0, 0x1

    :try_start_13
    invoke-virtual {p0}, Lz6/b;->i1()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_16} :catch_19
    .catchall {:try_start_13 .. :try_end_16} :catchall_17

    goto :goto_1c

    :catchall_17
    move-exception v0

    goto :goto_3c

    :catch_19
    :try_start_19
    invoke-static {p0, v0}, Lz6/b;->z(Lz6/b;Z)V
    :try_end_1c
    .catchall {:try_start_19 .. :try_end_1c} :catchall_17

    :goto_1c
    :try_start_1c
    invoke-static {p0}, Lz6/b;->g(Lz6/b;)Z

    move-result v3

    if-eqz v3, :cond_38

    invoke-virtual {p0}, Lz6/b;->c1()V

    const/4 v3, 0x0

    invoke-static {p0, v3}, Lz6/b;->B(Lz6/b;I)V
    :try_end_29
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_29} :catch_2a
    .catchall {:try_start_1c .. :try_end_29} :catchall_17

    goto :goto_38

    :catch_2a
    :try_start_2a
    invoke-static {p0, v0}, Lz6/b;->u(Lz6/b;Z)V

    invoke-static {}, Le9/o;->b()Le9/z;

    move-result-object v0

    invoke-static {v0}, Le9/o;->c(Le9/z;)Le9/f;

    move-result-object v0

    invoke-static {p0, v0}, Lz6/b;->j(Lz6/b;Le9/f;)V
    :try_end_38
    .catchall {:try_start_2a .. :try_end_38} :catchall_17

    :cond_38
    :goto_38
    monitor-exit p0

    return-wide v1

    :cond_3a
    :goto_3a
    monitor-exit p0

    return-wide v1

    :goto_3c
    monitor-exit p0

    throw v0
.end method
