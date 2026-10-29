.class public final LX8/f$e;
.super LT8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX8/f;->m1(ILe9/g;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LX8/f;

.field final synthetic f:I

.field final synthetic g:Le9/e;

.field final synthetic h:I

.field final synthetic i:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLX8/f;ILe9/e;IZ)V
    .registers 8

    iput-object p3, p0, LX8/f$e;->e:LX8/f;

    iput p4, p0, LX8/f$e;->f:I

    iput-object p5, p0, LX8/f$e;->g:Le9/e;

    iput p6, p0, LX8/f$e;->h:I

    iput-boolean p7, p0, LX8/f$e;->i:Z

    invoke-direct {p0, p1, p2}, LT8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 6

    :try_start_0
    iget-object v0, p0, LX8/f$e;->e:LX8/f;

    invoke-static {v0}, LX8/f;->B(LX8/f;)LX8/l;

    move-result-object v0

    iget v1, p0, LX8/f$e;->f:I

    iget-object v2, p0, LX8/f$e;->g:Le9/e;

    iget v3, p0, LX8/f$e;->h:I

    iget-boolean v4, p0, LX8/f$e;->i:Z

    invoke-interface {v0, v1, v2, v3, v4}, LX8/l;->a(ILe9/g;IZ)Z

    move-result v0

    if-eqz v0, :cond_21

    iget-object v1, p0, LX8/f$e;->e:LX8/f;

    invoke-virtual {v1}, LX8/f;->i1()LX8/j;

    move-result-object v1

    iget v2, p0, LX8/f$e;->f:I

    sget-object v3, LX8/b;->A:LX8/b;

    invoke-virtual {v1, v2, v3}, LX8/j;->K(ILX8/b;)V

    :cond_21
    if-nez v0, :cond_27

    iget-boolean v0, p0, LX8/f$e;->i:Z

    if-eqz v0, :cond_3e

    :cond_27
    iget-object v0, p0, LX8/f$e;->e:LX8/f;

    monitor-enter v0
    :try_end_2a
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_2a} :catch_3e

    :try_start_2a
    iget-object v1, p0, LX8/f$e;->e:LX8/f;

    invoke-static {v1}, LX8/f;->f(LX8/f;)Ljava/util/Set;

    move-result-object v1

    iget p0, p0, LX8/f$e;->f:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_39
    .catchall {:try_start_2a .. :try_end_39} :catchall_3b

    :try_start_39
    monitor-exit v0

    goto :goto_3e

    :catchall_3b
    move-exception p0

    monitor-exit v0

    throw p0
    :try_end_3e
    .catch Ljava/io/IOException; {:try_start_39 .. :try_end_3e} :catch_3e

    :catch_3e
    :cond_3e
    :goto_3e
    const-wide/16 v0, -0x1

    return-wide v0
.end method
