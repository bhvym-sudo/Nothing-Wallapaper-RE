.class public final LX8/f$g;
.super LT8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX8/f;->o1(ILjava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LX8/f;

.field final synthetic f:I

.field final synthetic g:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLX8/f;ILjava/util/List;)V
    .registers 6

    iput-object p3, p0, LX8/f$g;->e:LX8/f;

    iput p4, p0, LX8/f$g;->f:I

    iput-object p5, p0, LX8/f$g;->g:Ljava/util/List;

    invoke-direct {p0, p1, p2}, LT8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 4

    iget-object v0, p0, LX8/f$g;->e:LX8/f;

    invoke-static {v0}, LX8/f;->B(LX8/f;)LX8/l;

    move-result-object v0

    iget v1, p0, LX8/f$g;->f:I

    iget-object v2, p0, LX8/f$g;->g:Ljava/util/List;

    invoke-interface {v0, v1, v2}, LX8/l;->c(ILjava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_34

    :try_start_10
    iget-object v0, p0, LX8/f$g;->e:LX8/f;

    invoke-virtual {v0}, LX8/f;->i1()LX8/j;

    move-result-object v0

    iget v1, p0, LX8/f$g;->f:I

    sget-object v2, LX8/b;->A:LX8/b;

    invoke-virtual {v0, v1, v2}, LX8/j;->K(ILX8/b;)V

    iget-object v0, p0, LX8/f$g;->e:LX8/f;

    monitor-enter v0
    :try_end_20
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_20} :catch_34

    :try_start_20
    iget-object v1, p0, LX8/f$g;->e:LX8/f;

    invoke-static {v1}, LX8/f;->f(LX8/f;)Ljava/util/Set;

    move-result-object v1

    iget p0, p0, LX8/f$g;->f:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_2f
    .catchall {:try_start_20 .. :try_end_2f} :catchall_31

    :try_start_2f
    monitor-exit v0

    goto :goto_34

    :catchall_31
    move-exception p0

    monitor-exit v0

    throw p0
    :try_end_34
    .catch Ljava/io/IOException; {:try_start_2f .. :try_end_34} :catch_34

    :catch_34
    :cond_34
    :goto_34
    const-wide/16 v0, -0x1

    return-wide v0
.end method
