.class public final Lcom/nothing/wallpaper/common/log/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/nothing/wallpaper/common/log/c;

.field private static final b:Ljava/lang/String;

.field private static final c:Landroid/net/Uri;

.field private static final d:LI8/A;

.field private static final e:LI8/O;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/wallpaper/common/log/c;

    invoke-direct {v0}, Lcom/nothing/wallpaper/common/log/c;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/common/log/c;->a:Lcom/nothing/wallpaper/common/log/c;

    const-string v0, "nt_log_capture"

    sput-object v0, Lcom/nothing/wallpaper/common/log/c;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/provider/Settings$System;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/nothing/wallpaper/common/log/c;->c:Landroid/net/Uri;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, LI8/Q;->a(Ljava/lang/Object;)LI8/A;

    move-result-object v0

    sput-object v0, Lcom/nothing/wallpaper/common/log/c;->d:LI8/A;

    sput-object v0, Lcom/nothing/wallpaper/common/log/c;->e:LI8/O;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Ljava/lang/String;
    .registers 1

    sget-object v0, Lcom/nothing/wallpaper/common/log/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static final b(Z)V
    .registers 2

    sget-object v0, Lcom/nothing/wallpaper/common/log/c;->d:LI8/A;

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {v0, p0}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(Ljava/lang/String;)V
    .registers 3

    const-string v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/wallpaper/common/log/c;->a:Lcom/nothing/wallpaper/common/log/c;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/common/log/c;->m()Z

    move-result v0

    const-string v1, "NTWallpaper"

    if-nez v0, :cond_18

    const/4 v0, 0x3

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_18

    :cond_17
    return-void

    :cond_18
    :goto_18
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static final d(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/wallpaper/common/log/c;->a:Lcom/nothing/wallpaper/common/log/c;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/common/log/c;->m()Z

    move-result v0

    if-nez v0, :cond_1d

    const-string v0, "NTWallpaper"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_1d

    :cond_1c
    return-void

    :cond_1d
    :goto_1d
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static final e(Ljava/lang/String;)V
    .registers 2

    const-string v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "NTWallpaper"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static final f(Ljava/lang/String;Ljava/lang/String;)V
    .registers 3

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static final g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .registers 5

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/wallpaper/common/log/c;->a:Lcom/nothing/wallpaper/common/log/c;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/common/log/c;->m()Z

    move-result v0

    if-nez v0, :cond_22

    const-string v0, "NTWallpaper"

    const/4 v1, 0x6

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_21

    goto :goto_22

    :cond_21
    return-void

    :cond_22
    :goto_22
    invoke-static {p0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public static final h(Ljava/lang/String;Ljava/lang/Throwable;)V
    .registers 4

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/wallpaper/common/log/c;->a:Lcom/nothing/wallpaper/common/log/c;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/common/log/c;->m()Z

    move-result v0

    const-string v1, "NTWallpaper"

    if-nez v0, :cond_18

    const/4 v0, 0x6

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_18

    :cond_17
    return-void

    :cond_18
    :goto_18
    invoke-static {v1, p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public static final j(Ljava/lang/String;)V
    .registers 2

    const-string v0, "message"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "NTWallpaper"

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static final k(Ljava/lang/String;Ljava/lang/String;)V
    .registers 3

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static final l(Landroid/content/Context;)V
    .registers 5

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/wallpaper/common/log/c;->d:LI8/A;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Lcom/nothing/wallpaper/common/log/c;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_16

    goto :goto_17

    :cond_16
    move v2, v3

    :goto_17
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, LI8/A;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lcom/nothing/wallpaper/common/log/c;->c:Landroid/net/Uri;

    new-instance v2, Lcom/nothing/wallpaper/common/log/c$a;

    invoke-direct {v2, p0}, Lcom/nothing/wallpaper/common/log/c$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    return-void
.end method

.method public static final n(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/wallpaper/common/log/c;->a:Lcom/nothing/wallpaper/common/log/c;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/common/log/c;->m()Z

    move-result v0

    if-nez v0, :cond_1d

    const-string v0, "NTWallpaper"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_1d

    :cond_1c
    return-void

    :cond_1d
    :goto_1d
    invoke-static {p0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static final o(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/wallpaper/common/log/c;->a:Lcom/nothing/wallpaper/common/log/c;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/common/log/c;->m()Z

    move-result v0

    if-nez v0, :cond_1d

    const-string v0, "NTWallpaper"

    const/4 v1, 0x5

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_1d

    :cond_1c
    return-void

    :cond_1d
    :goto_1d
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public final i()LI8/O;
    .registers 1

    sget-object p0, Lcom/nothing/wallpaper/common/log/c;->e:LI8/O;

    return-object p0
.end method

.method public final m()Z
    .registers 1

    sget-object p0, Lcom/nothing/wallpaper/common/log/c;->d:LI8/A;

    invoke-interface {p0}, LI8/A;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method
