.class public final LX8/f$j;
.super LT8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX8/f;-><init>(LX8/f$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic e:LX8/f;

.field final synthetic f:J


# direct methods
.method public constructor <init>(Ljava/lang/String;LX8/f;J)V
    .registers 5

    iput-object p2, p0, LX8/f$j;->e:LX8/f;

    iput-wide p3, p0, LX8/f$j;->f:J

    const/4 p2, 0x2

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-direct {p0, p1, p4, p2, p3}, LT8/a;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/h;)V

    return-void
.end method


# virtual methods
.method public f()J
    .registers 9

    iget-object v0, p0, LX8/f$j;->e:LX8/f;

    monitor-enter v0

    :try_start_3
    iget-object v1, p0, LX8/f$j;->e:LX8/f;

    invoke-static {v1}, LX8/f;->z(LX8/f;)J

    move-result-wide v1

    iget-object v3, p0, LX8/f$j;->e:LX8/f;

    invoke-static {v3}, LX8/f;->u(LX8/f;)J

    move-result-wide v3

    cmp-long v1, v1, v3

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-gez v1, :cond_17

    move v1, v2

    goto :goto_26

    :cond_17
    iget-object v1, p0, LX8/f$j;->e:LX8/f;

    invoke-static {v1}, LX8/f;->u(LX8/f;)J

    move-result-wide v4

    iget-object v1, p0, LX8/f$j;->e:LX8/f;

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    invoke-static {v1, v4, v5}, LX8/f;->b0(LX8/f;J)V
    :try_end_25
    .catchall {:try_start_3 .. :try_end_25} :catchall_3a

    move v1, v3

    :goto_26
    monitor-exit v0

    if-eqz v1, :cond_32

    iget-object p0, p0, LX8/f$j;->e:LX8/f;

    const/4 v0, 0x0

    invoke-static {p0, v0}, LX8/f;->a(LX8/f;Ljava/io/IOException;)V

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_32
    iget-object v0, p0, LX8/f$j;->e:LX8/f;

    invoke-virtual {v0, v3, v2, v3}, LX8/f;->B1(ZII)V

    iget-wide v0, p0, LX8/f$j;->f:J

    return-wide v0

    :catchall_3a
    move-exception p0

    monitor-exit v0

    throw p0
.end method
