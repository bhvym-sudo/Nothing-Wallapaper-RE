.class public final Lg6/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lg6/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Lg6/c;
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lg6/c;->b()Lg6/c;

    move-result-object v0

    if-nez v0, :cond_2a

    monitor-enter p0

    :try_start_c
    invoke-static {}, Lg6/c;->b()Lg6/c;

    move-result-object v0

    if-nez v0, :cond_26

    new-instance v0, Lg6/c;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "getApplicationContext(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lg6/c;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lg6/c;->c(Lg6/c;)V
    :try_end_23
    .catchall {:try_start_c .. :try_end_23} :catchall_24

    goto :goto_26

    :catchall_24
    move-exception p1

    goto :goto_28

    :cond_26
    :goto_26
    monitor-exit p0

    return-object v0

    :goto_28
    monitor-exit p0

    throw p1

    :cond_2a
    return-object v0
.end method
