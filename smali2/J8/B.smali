.class final LJ8/B;
.super LI8/F;
.source "SourceFile"

# interfaces
.implements LI8/O;


# direct methods
.method public constructor <init>(I)V
    .registers 5

    const v0, 0x7fffffff

    sget-object v1, LH8/a;->r:LH8/a;

    const/4 v2, 0x1

    invoke-direct {p0, v2, v0, v1}, LI8/F;-><init>(IILH8/a;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, LI8/F;->h(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public b0()Ljava/lang/Integer;
    .registers 2

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, LI8/F;->O()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_f
    .catchall {:try_start_1 .. :try_end_f} :catchall_11

    monitor-exit p0

    return-object v0

    :catchall_11
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final c0(I)Z
    .registers 3

    monitor-enter p0

    :try_start_1
    invoke-virtual {p0}, LI8/F;->O()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, LI8/F;->h(Ljava/lang/Object;)Z

    move-result p1
    :try_end_14
    .catchall {:try_start_1 .. :try_end_14} :catchall_16

    monitor-exit p0

    return p1

    :catchall_16
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, LJ8/B;->b0()Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method
