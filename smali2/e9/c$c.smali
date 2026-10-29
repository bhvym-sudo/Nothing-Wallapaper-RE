.class public final Le9/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/c;->z(Le9/z;)Le9/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Le9/c;

.field final synthetic r:Le9/z;


# direct methods
.method constructor <init>(Le9/c;Le9/z;)V
    .registers 3

    iput-object p1, p0, Le9/c$c;->q:Le9/c;

    iput-object p2, p0, Le9/c$c;->r:Le9/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public Z(Le9/e;J)V
    .registers 11

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Le9/b;->b(JJJ)V

    :goto_f
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_63

    iget-object v2, p1, Le9/e;->q:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    :goto_1a
    const-wide/32 v3, 0x10000

    cmp-long v3, v0, v3

    if-gez v3, :cond_34

    iget v3, v2, Le9/w;->c:I

    iget v4, v2, Le9/w;->b:I

    sub-int/2addr v3, v4

    int-to-long v3, v3

    add-long/2addr v0, v3

    cmp-long v3, v0, p2

    if-ltz v3, :cond_2e

    move-wide v0, p2

    goto :goto_34

    :cond_2e
    iget-object v2, v2, Le9/w;->f:Le9/w;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    goto :goto_1a

    :cond_34
    :goto_34
    iget-object v2, p0, Le9/c$c;->q:Le9/c;

    iget-object v3, p0, Le9/c$c;->r:Le9/z;

    invoke-virtual {v2}, Le9/c;->v()V

    :try_start_3b
    invoke-interface {v3, p1, v0, v1}, Le9/z;->Z(Le9/e;J)V

    sget-object v3, Lh8/A;->a:Lh8/A;
    :try_end_40
    .catch Ljava/io/IOException; {:try_start_3b .. :try_end_40} :catch_51
    .catchall {:try_start_3b .. :try_end_40} :catchall_4e

    invoke-virtual {v2}, Le9/c;->w()Z

    move-result v3

    if-nez v3, :cond_48

    sub-long/2addr p2, v0

    goto :goto_f

    :cond_48
    const/4 p0, 0x0

    invoke-virtual {v2, p0}, Le9/c;->p(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    throw p0

    :catchall_4e
    move-exception v0

    move-object p0, v0

    goto :goto_5f

    :catch_51
    move-exception v0

    move-object p0, v0

    :try_start_53
    invoke-virtual {v2}, Le9/c;->w()Z

    move-result p1

    if-nez p1, :cond_5a

    goto :goto_5e

    :cond_5a
    invoke-virtual {v2, p0}, Le9/c;->p(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p0

    :goto_5e
    throw p0
    :try_end_5f
    .catchall {:try_start_53 .. :try_end_5f} :catchall_4e

    :goto_5f
    invoke-virtual {v2}, Le9/c;->w()Z

    throw p0

    :cond_63
    return-void
.end method

.method public a()Le9/c;
    .registers 1

    iget-object p0, p0, Le9/c$c;->q:Le9/c;

    return-object p0
.end method

.method public close()V
    .registers 3

    iget-object v0, p0, Le9/c$c;->q:Le9/c;

    iget-object p0, p0, Le9/c$c;->r:Le9/z;

    invoke-virtual {v0}, Le9/c;->v()V

    :try_start_7
    invoke-interface {p0}, Le9/z;->close()V

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

    invoke-virtual {p0}, Le9/c$c;->a()Le9/c;

    move-result-object p0

    return-object p0
.end method

.method public flush()V
    .registers 3

    iget-object v0, p0, Le9/c$c;->q:Le9/c;

    iget-object p0, p0, Le9/c$c;->r:Le9/z;

    invoke-virtual {v0}, Le9/c;->v()V

    :try_start_7
    invoke-interface {p0}, Le9/z;->flush()V

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

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AsyncTimeout.sink("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Le9/c$c;->r:Le9/z;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
