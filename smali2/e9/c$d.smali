.class public final Le9/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/c;->A(Le9/B;)Le9/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Le9/c;

.field final synthetic r:Le9/B;


# direct methods
.method constructor <init>(Le9/c;Le9/B;)V
    .registers 3

    iput-object p1, p0, Le9/c$d;->q:Le9/c;

    iput-object p2, p0, Le9/c$d;->r:Le9/B;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Le9/c;
    .registers 1

    iget-object p0, p0, Le9/c$d;->q:Le9/c;

    return-object p0
.end method

.method public close()V
    .registers 3

    iget-object v0, p0, Le9/c$d;->q:Le9/c;

    iget-object p0, p0, Le9/c$d;->r:Le9/B;

    invoke-virtual {v0}, Le9/c;->v()V

    :try_start_7
    invoke-interface {p0}, Le9/B;->close()V

    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_c} :catch_1b
    .catchall {:try_start_7 .. :try_end_c} :catchall_19

    invoke-virtual {v0}, Le9/c;->w()Z

    move-result p0

    if-nez p0, :cond_13

    return-void

    :cond_13
    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Le9/c;->p(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    :catchall_19
    move-exception p0

    goto :goto_28

    :catch_1b
    move-exception p0

    :try_start_1c
    invoke-virtual {v0}, Le9/c;->w()Z

    move-result v1

    if-nez v1, :cond_23

    goto :goto_27

    :cond_23
    invoke-virtual {v0, p0}, Le9/c;->p(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    :goto_27
    throw p0
    :try_end_28
    .catchall {:try_start_1c .. :try_end_28} :catchall_19

    :goto_28
    invoke-virtual {v0}, Le9/c;->w()Z

    throw p0
.end method

.method public bridge synthetic e()Le9/C;
    .registers 1

    invoke-virtual {p0}, Le9/c$d;->a()Le9/c;

    move-result-object p0

    return-object p0
.end method

.method public e1(Le9/e;J)J
    .registers 5

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le9/c$d;->q:Le9/c;

    iget-object p0, p0, Le9/c$d;->r:Le9/B;

    invoke-virtual {v0}, Le9/c;->v()V

    :try_start_c
    invoke-interface {p0, p1, p2, p3}, Le9/B;->e1(Le9/e;J)J

    move-result-wide p0
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_10} :catch_1f
    .catchall {:try_start_c .. :try_end_10} :catchall_1d

    invoke-virtual {v0}, Le9/c;->w()Z

    move-result p2

    if-nez p2, :cond_17

    return-wide p0

    :cond_17
    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Le9/c;->p(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    :catchall_1d
    move-exception p0

    goto :goto_2c

    :catch_1f
    move-exception p0

    :try_start_20
    invoke-virtual {v0}, Le9/c;->w()Z

    move-result p1

    if-nez p1, :cond_27

    goto :goto_2b

    :cond_27
    invoke-virtual {v0, p0}, Le9/c;->p(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    :goto_2b
    throw p0
    :try_end_2c
    .catchall {:try_start_20 .. :try_end_2c} :catchall_1d

    :goto_2c
    invoke-virtual {v0}, Le9/c;->w()Z

    throw p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AsyncTimeout.source("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Le9/c$d;->r:Le9/B;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
