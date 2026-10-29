.class public final LX8/f$h;
.super LT8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX8/f;->p1(ILX8/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LX8/f;

.field final synthetic f:I

.field final synthetic g:LX8/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLX8/f;ILX8/b;)V
    .registers 6

    iput-object p3, p0, LX8/f$h;->e:LX8/f;

    iput p4, p0, LX8/f$h;->f:I

    iput-object p5, p0, LX8/f$h;->g:LX8/b;

    invoke-direct {p0, p1, p2}, LT8/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 4

    iget-object v0, p0, LX8/f$h;->e:LX8/f;

    invoke-static {v0}, LX8/f;->B(LX8/f;)LX8/l;

    move-result-object v0

    iget v1, p0, LX8/f$h;->f:I

    iget-object v2, p0, LX8/f$h;->g:LX8/b;

    invoke-interface {v0, v1, v2}, LX8/l;->b(ILX8/b;)V

    iget-object v0, p0, LX8/f$h;->e:LX8/f;

    monitor-enter v0

    :try_start_10
    iget-object v1, p0, LX8/f$h;->e:LX8/f;

    invoke-static {v1}, LX8/f;->f(LX8/f;)Ljava/util/Set;

    move-result-object v1

    iget p0, p0, LX8/f$h;->f:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object p0, Lh8/A;->a:Lh8/A;
    :try_end_21
    .catchall {:try_start_10 .. :try_end_21} :catchall_25

    monitor-exit v0

    const-wide/16 v0, -0x1

    return-wide v0

    :catchall_25
    move-exception p0

    monitor-exit v0

    throw p0
.end method
