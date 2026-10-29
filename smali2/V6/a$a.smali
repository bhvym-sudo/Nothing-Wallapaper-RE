.class public final LV6/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV6/a;
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
    invoke-direct {p0}, LV6/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lu6/a;Lu6/c;Lcom/nothing/wallpaper/picker/creative/network/a;)LV6/a;
    .registers 6

    const-string v0, "dao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperRequestIndexDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LV6/a;->a()LV6/a;

    move-result-object v0

    if-nez v0, :cond_2c

    monitor-enter p0

    :try_start_16
    invoke-static {}, LV6/a;->a()LV6/a;

    move-result-object v0

    if-nez v0, :cond_28

    new-instance v0, LV6/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, LV6/a;-><init>(Lu6/a;Lu6/c;Lcom/nothing/wallpaper/picker/creative/network/a;Lkotlin/jvm/internal/h;)V

    invoke-static {v0}, LV6/a;->b(LV6/a;)V
    :try_end_25
    .catchall {:try_start_16 .. :try_end_25} :catchall_26

    goto :goto_28

    :catchall_26
    move-exception p1

    goto :goto_2a

    :cond_28
    :goto_28
    monitor-exit p0

    return-object v0

    :goto_2a
    monitor-exit p0

    throw p1

    :cond_2c
    return-object v0
.end method
