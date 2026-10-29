.class final Lh8/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh8/h;
.implements Ljava/io/Serializable;


# instance fields
.field private q:Lv8/a;

.field private volatile r:Ljava/lang/Object;

.field private final s:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lv8/a;Ljava/lang/Object;)V
    .registers 4

    const-string v0, "initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh8/t;->q:Lv8/a;

    .line 3
    sget-object p1, Lh8/y;->a:Lh8/y;

    iput-object p1, p0, Lh8/t;->r:Ljava/lang/Object;

    if-nez p2, :cond_11

    move-object p2, p0

    .line 4
    :cond_11
    iput-object p2, p0, Lh8/t;->s:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lv8/a;Ljava/lang/Object;ILkotlin/jvm/internal/h;)V
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    .line 5
    :cond_5
    invoke-direct {p0, p1, p2}, Lh8/t;-><init>(Lv8/a;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a()Z
    .registers 2

    iget-object p0, p0, Lh8/t;->r:Ljava/lang/Object;

    sget-object v0, Lh8/y;->a:Lh8/y;

    if-eq p0, v0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public getValue()Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, Lh8/t;->r:Ljava/lang/Object;

    sget-object v1, Lh8/y;->a:Lh8/y;

    if-eq v0, v1, :cond_7

    return-object v0

    :cond_7
    iget-object v0, p0, Lh8/t;->s:Ljava/lang/Object;

    monitor-enter v0

    :try_start_a
    iget-object v2, p0, Lh8/t;->r:Ljava/lang/Object;

    if-eq v2, v1, :cond_f

    goto :goto_1d

    :cond_f
    iget-object v1, p0, Lh8/t;->q:Lv8/a;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v1}, Lv8/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lh8/t;->r:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Lh8/t;->q:Lv8/a;
    :try_end_1d
    .catchall {:try_start_a .. :try_end_1d} :catchall_1f

    :goto_1d
    monitor-exit v0

    return-object v2

    :catchall_1f
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, Lh8/t;->a()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Lh8/t;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_f
    const-string p0, "Lazy value not initialized yet."

    return-object p0
.end method
