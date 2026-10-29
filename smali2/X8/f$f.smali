.class public final LX8/f$f;
.super LT8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX8/f;->n1(ILjava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LX8/f;

.field final synthetic f:I

.field final synthetic g:Ljava/util/List;

.field final synthetic h:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLX8/f;ILjava/util/List;Z)V
    .registers 7

    iput-object p3, p0, LX8/f$f;->e:LX8/f;

    iput p4, p0, LX8/f$f;->f:I

    iput-object p5, p0, LX8/f$f;->g:Ljava/util/List;

    iput-boolean p6, p0, LX8/f$f;->h:Z

    invoke-direct {p0, p1, p2}, LT8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 5

    iget-object v0, p0, LX8/f$f;->e:LX8/f;

    invoke-static {v0}, LX8/f;->B(LX8/f;)LX8/l;

    move-result-object v0

    iget v1, p0, LX8/f$f;->f:I

    iget-object v2, p0, LX8/f$f;->g:Ljava/util/List;

    iget-boolean v3, p0, LX8/f$f;->h:Z

    invoke-interface {v0, v1, v2, v3}, LX8/l;->d(ILjava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_1f

    :try_start_12
    iget-object v1, p0, LX8/f$f;->e:LX8/f;

    invoke-virtual {v1}, LX8/f;->i1()LX8/j;

    move-result-object v1

    iget v2, p0, LX8/f$f;->f:I

    sget-object v3, LX8/b;->A:LX8/b;

    invoke-virtual {v1, v2, v3}, LX8/j;->K(ILX8/b;)V

    :cond_1f
    if-nez v0, :cond_25

    iget-boolean v0, p0, LX8/f$f;->h:Z

    if-eqz v0, :cond_3c

    :cond_25
    iget-object v0, p0, LX8/f$f;->e:LX8/f;

    monitor-enter v0
    :try_end_28
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_28} :catch_3c

    :try_start_28
    iget-object v1, p0, LX8/f$f;->e:LX8/f;

    invoke-static {v1}, LX8/f;->f(LX8/f;)Ljava/util/Set;

    move-result-object v1

    iget p0, p0, LX8/f$f;->f:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_37
    .catchall {:try_start_28 .. :try_end_37} :catchall_39

    :try_start_37
    monitor-exit v0

    goto :goto_3c

    :catchall_39
    move-exception p0

    monitor-exit v0

    throw p0
    :try_end_3c
    .catch Ljava/io/IOException; {:try_start_37 .. :try_end_3c} :catch_3c

    :catch_3c
    :cond_3c
    :goto_3c
    const-wide/16 v0, -0x1

    return-wide v0
.end method
