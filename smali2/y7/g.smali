.class public final Ly7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/g$a;,
        Ly7/g$b;
    }
.end annotation


# static fields
.field public static final r:Ly7/g$a;

.field private static final s:Landroid/net/Uri;

.field private static final t:Landroid/net/Uri;

.field private static final u:Landroid/net/Uri;

.field private static final v:[Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LF8/L;

.field private final c:Landroid/content/ContentResolver;

.field private final d:Ljava/util/List;

.field private e:LF8/x0;

.field private f:LY5/a;

.field private g:LX5/a;

.field private h:LO2/a;

.field private final i:Lh8/h;

.field private final j:LI8/f;

.field private final k:LI8/f;

.field private final l:LI8/f;

.field private final m:LI8/f;

.field private final n:LI8/f;

.field private final o:LI8/f;

.field private final p:LI8/f;

.field private final q:LI8/f;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    new-instance v0, Ly7/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly7/g$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Ly7/g;->r:Ly7/g$a;

    const-string v0, "content://com.nothing.weather.share/query/geo_weather_info"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Ly7/g;->s:Landroid/net/Uri;

    const-string v0, "content://com.nothing.quicklook.share/query/switch_settings"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "parse(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Ly7/g;->t:Landroid/net/Uri;

    const-string v0, "content://com.nothing.quicklook.share/calendar/instances/when"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Ly7/g;->u:Landroid/net/Uri;

    const-string v0, "end"

    const-string v1, "eventLocation"

    const-string v2, "event_id"

    const-string v3, "title"

    const-string v4, "begin"

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ly7/g;->v:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LF8/L;LF8/I;)V
    .registers 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/g;->a:Landroid/content/Context;

    iput-object p2, p0, Ly7/g;->b:LF8/L;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    iput-object p1, p0, Ly7/g;->c:Landroid/content/ContentResolver;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ly7/g;->d:Ljava/util/List;

    new-instance p1, Ly7/f;

    invoke-direct {p1, p0}, Ly7/f;-><init>(Ly7/g;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, Ly7/g;->i:Lh8/h;

    new-instance p1, Ly7/g$j;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Ly7/g$j;-><init>(Ly7/g;Lm8/e;)V

    invoke-static {p1}, LI8/h;->e(Lv8/p;)LI8/f;

    move-result-object p1

    invoke-static {p1, p3}, LI8/h;->D(LI8/f;Lm8/i;)LI8/f;

    move-result-object p1

    iput-object p1, p0, Ly7/g;->j:LI8/f;

    new-instance v0, Ly7/g$e;

    invoke-direct {v0, p0, p2}, Ly7/g$e;-><init>(Ly7/g;Lm8/e;)V

    invoke-static {v0}, LI8/h;->e(Lv8/p;)LI8/f;

    move-result-object v0

    iput-object v0, p0, Ly7/g;->k:LI8/f;

    new-instance v1, Ly7/g$h;

    invoke-direct {v1, p0, p2}, Ly7/g$h;-><init>(Ly7/g;Lm8/e;)V

    invoke-static {v1}, LI8/h;->e(Lv8/p;)LI8/f;

    move-result-object v1

    invoke-static {v1, p3}, LI8/h;->D(LI8/f;Lm8/i;)LI8/f;

    move-result-object v1

    iput-object v1, p0, Ly7/g;->l:LI8/f;

    new-instance v2, Ly7/g$i;

    invoke-direct {v2, p0, p2}, Ly7/g$i;-><init>(Ly7/g;Lm8/e;)V

    invoke-static {v2}, LI8/h;->e(Lv8/p;)LI8/f;

    move-result-object v2

    invoke-static {v2, p3}, LI8/h;->D(LI8/f;Lm8/i;)LI8/f;

    move-result-object v2

    iput-object v2, p0, Ly7/g;->m:LI8/f;

    new-instance v3, Ly7/g$c;

    invoke-direct {v3, p0, p2}, Ly7/g$c;-><init>(Ly7/g;Lm8/e;)V

    invoke-static {v3}, LI8/h;->e(Lv8/p;)LI8/f;

    move-result-object v3

    invoke-static {v3, p3}, LI8/h;->D(LI8/f;Lm8/i;)LI8/f;

    move-result-object v3

    iput-object v3, p0, Ly7/g;->n:LI8/f;

    new-instance v4, Ly7/g$k;

    invoke-direct {v4, p0, p2}, Ly7/g$k;-><init>(Ly7/g;Lm8/e;)V

    invoke-static {p1, v1, v4}, LI8/h;->l(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object p1

    invoke-static {p1, p3}, LI8/h;->D(LI8/f;Lm8/i;)LI8/f;

    move-result-object p1

    iput-object p1, p0, Ly7/g;->o:LI8/f;

    new-instance p1, Ly7/g$f;

    invoke-direct {p1, p0, p2}, Ly7/g$f;-><init>(Ly7/g;Lm8/e;)V

    invoke-static {v0, v1, p1}, LI8/h;->l(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object p1

    invoke-static {p1, p3}, LI8/h;->D(LI8/f;Lm8/i;)LI8/f;

    move-result-object p1

    iput-object p1, p0, Ly7/g;->p:LI8/f;

    new-instance p1, Ly7/g$d;

    invoke-direct {p1, p0, p2}, Ly7/g$d;-><init>(Ly7/g;Lm8/e;)V

    invoke-static {v3, v2, p1}, LI8/h;->l(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object p1

    invoke-static {p1, p3}, LI8/h;->D(LI8/f;Lm8/i;)LI8/f;

    move-result-object p1

    iput-object p1, p0, Ly7/g;->q:LI8/f;

    return-void
.end method

.method private final A()LY5/a;
    .registers 16

    :try_start_0
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    iget-object p0, p0, Ly7/g;->c:Landroid/content/ContentResolver;

    const-string v0, "com.nothing.weather.share"

    invoke-virtual {p0, v0}, Landroid/content/ContentResolver;->acquireContentProviderClient(Ljava/lang/String;)Landroid/content/ContentProviderClient;

    move-result-object p0
    :try_end_a
    .catchall {:try_start_0 .. :try_end_a} :catchall_83

    if-eqz p0, :cond_6c

    :try_start_c
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "is_force_request"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "query_weather_info"

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Landroid/content/ContentProviderClient;->call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_5f

    const-string v1, "response_status"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_4d

    const-string v1, "current_weather_icon"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v7

    const-string v1, "current_temp"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v10

    const-string v1, "current_weather_description"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v3, LY5/a;

    const/16 v13, 0xd9

    const/4 v14, 0x0

    const-wide/16 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v14}, LY5/a;-><init>(JLjava/lang/String;IIIILjava/lang/String;IILkotlin/jvm/internal/h;)V

    goto :goto_60

    :catchall_4a
    move-exception v0

    move-object v1, v0

    goto :goto_66

    :cond_4d
    new-instance v3, LY5/a;

    const/16 v13, 0xff

    const/4 v14, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v14}, LY5/a;-><init>(JLjava/lang/String;IIIILjava/lang/String;IILkotlin/jvm/internal/h;)V
    :try_end_5e
    .catchall {:try_start_c .. :try_end_5e} :catchall_4a

    goto :goto_60

    :cond_5f
    move-object v3, v2

    :goto_60
    :try_start_60
    invoke-static {p0, v2}, Lt8/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_63
    .catchall {:try_start_60 .. :try_end_63} :catchall_83

    if-nez v3, :cond_7e

    goto :goto_6c

    :goto_66
    :try_start_66
    throw v1
    :try_end_67
    .catchall {:try_start_66 .. :try_end_67} :catchall_67

    :catchall_67
    move-exception v0

    :try_start_68
    invoke-static {p0, v1}, Lt8/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :cond_6c
    :goto_6c
    new-instance v0, LY5/a;

    const/16 v10, 0xff

    const/4 v11, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, LY5/a;-><init>(JLjava/lang/String;IIIILjava/lang/String;IILkotlin/jvm/internal/h;)V

    move-object v3, v0

    :cond_7e
    invoke-static {v3}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_82
    .catchall {:try_start_68 .. :try_end_82} :catchall_83

    goto :goto_8f

    :catchall_83
    move-exception v0

    move-object p0, v0

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_8f
    new-instance v0, LY5/a;

    const/16 v10, 0xff

    const/4 v11, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, LY5/a;-><init>(JLjava/lang/String;IIIILjava/lang/String;IILkotlin/jvm/internal/h;)V

    invoke-static {p0}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a7

    move-object p0, v0

    :cond_a7
    check-cast p0, LY5/a;

    return-object p0
.end method

.method private final B(Landroid/content/ContentResolver;Landroid/net/Uri;ZLandroid/database/ContentObserver;)V
    .registers 5

    :try_start_0
    sget-object p0, Lh8/q;->r:Lh8/q$a;

    invoke-virtual {p1, p2, p3, p4}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_b
    .catchall {:try_start_0 .. :try_end_b} :catchall_c

    goto :goto_17

    :catchall_c
    move-exception p0

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_17
    invoke-static {p0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_37

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "onActive register failed, msg:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "ClockShareDataManager"

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_37
    return-void
.end method

.method public static synthetic a(Ly7/g;)Landroid/app/AlarmManager;
    .registers 1

    invoke-static {p0}, Ly7/g;->s(Ly7/g;)Landroid/app/AlarmManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ly7/g;)LI8/f;
    .registers 1

    iget-object p0, p0, Ly7/g;->q:LI8/f;

    return-object p0
.end method

.method public static final synthetic c(Ly7/g;)Landroid/app/AlarmManager;
    .registers 1

    invoke-direct {p0}, Ly7/g;->u()Landroid/app/AlarmManager;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d()Landroid/net/Uri;
    .registers 1

    sget-object v0, Ly7/g;->u:Landroid/net/Uri;

    return-object v0
.end method

.method public static final synthetic e(Ly7/g;)LI8/f;
    .registers 1

    iget-object p0, p0, Ly7/g;->p:LI8/f;

    return-object p0
.end method

.method public static final synthetic f(Ly7/g;)Landroid/content/ContentResolver;
    .registers 1

    iget-object p0, p0, Ly7/g;->c:Landroid/content/ContentResolver;

    return-object p0
.end method

.method public static final synthetic g(Ly7/g;)Landroid/content/Context;
    .registers 1

    iget-object p0, p0, Ly7/g;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic h()Landroid/net/Uri;
    .registers 1

    sget-object v0, Ly7/g;->s:Landroid/net/Uri;

    return-object v0
.end method

.method public static final synthetic i()Landroid/net/Uri;
    .registers 1

    sget-object v0, Ly7/g;->t:Landroid/net/Uri;

    return-object v0
.end method

.method public static final synthetic j(Ly7/g;)Ljava/util/List;
    .registers 1

    iget-object p0, p0, Ly7/g;->d:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic k(Ly7/g;)LI8/f;
    .registers 1

    iget-object p0, p0, Ly7/g;->o:LI8/f;

    return-object p0
.end method

.method public static final synthetic l(Ly7/g;)LX5/a;
    .registers 1

    invoke-direct {p0}, Ly7/g;->y()LX5/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Ly7/g;Ljava/lang/String;)Z
    .registers 2

    invoke-direct {p0, p1}, Ly7/g;->z(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic n(Ly7/g;)LY5/a;
    .registers 1

    invoke-direct {p0}, Ly7/g;->A()LY5/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Ly7/g;Landroid/content/ContentResolver;Landroid/net/Uri;ZLandroid/database/ContentObserver;)V
    .registers 5

    invoke-direct {p0, p1, p2, p3, p4}, Ly7/g;->B(Landroid/content/ContentResolver;Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    return-void
.end method

.method public static final synthetic p(Ly7/g;LO2/a;)V
    .registers 2

    iput-object p1, p0, Ly7/g;->h:LO2/a;

    return-void
.end method

.method public static final synthetic q(Ly7/g;LX5/a;)V
    .registers 2

    iput-object p1, p0, Ly7/g;->g:LX5/a;

    return-void
.end method

.method public static final synthetic r(Ly7/g;LY5/a;)V
    .registers 2

    iput-object p1, p0, Ly7/g;->f:LY5/a;

    return-void
.end method

.method private static final s(Ly7/g;)Landroid/app/AlarmManager;
    .registers 2

    iget-object p0, p0, Ly7/g;->a:Landroid/content/Context;

    const-class v0, Landroid/app/AlarmManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AlarmManager;

    return-object p0
.end method

.method private final u()Landroid/app/AlarmManager;
    .registers 1

    iget-object p0, p0, Ly7/g;->i:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/AlarmManager;

    return-object p0
.end method

.method private final x()V
    .registers 10

    iget-object v0, p0, Ly7/g;->e:LF8/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_9
    iget-object v3, p0, Ly7/g;->b:LF8/L;

    new-instance v6, Ly7/g$g;

    invoke-direct {v6, p0, v1}, Ly7/g$g;-><init>(Ly7/g;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object v0

    iput-object v0, p0, Ly7/g;->e:LF8/x0;

    return-void
.end method

.method private final y()LX5/a;
    .registers 8

    :try_start_0
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    new-instance v0, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const v3, 0x927c0

    int-to-long v3, v3

    sub-long/2addr v1, v3

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    sget-object v2, Ly7/g;->u:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v2

    invoke-static {v2, v0, v1}, Landroid/content/ContentUris;->appendId(Landroid/net/Uri$Builder;J)Landroid/net/Uri$Builder;

    const-wide v3, 0x7fffffffffffffffL

    invoke-static {v2, v3, v4}, Landroid/content/ContentUris;->appendId(Landroid/net/Uri$Builder;J)Landroid/net/Uri$Builder;

    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v2

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "android:query-arg-limit"

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v4, "android:query-arg-sort-direction"

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v4, "android:query-arg-sql-selection"

    const-string v5, "isPrimary = ? and allDay =? and begin > ?"

    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "android:query-arg-sort-columns"

    const-string v5, "begin"

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v4, "android:query-arg-sql-selection-args"

    const-string v5, "1"

    const-string v6, "0"

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v5, v6, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    iget-object p0, p0, Ly7/g;->c:Landroid/content/ContentResolver;

    sget-object v0, Ly7/g;->v:[Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v2, v0, v3, v1}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p0
    :try_end_66
    .catchall {:try_start_0 .. :try_end_66} :catchall_88

    if-eqz p0, :cond_75

    :try_start_68
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_75

    invoke-static {p0}, LX5/a;->a(Landroid/database/Cursor;)LX5/a;

    move-result-object v0

    goto :goto_7a

    :catchall_73
    move-exception v0

    goto :goto_82

    :cond_75
    new-instance v0, LX5/a;

    invoke-direct {v0}, LX5/a;-><init>()V
    :try_end_7a
    .catchall {:try_start_68 .. :try_end_7a} :catchall_73

    :goto_7a
    :try_start_7a
    invoke-static {p0, v1}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_81
    .catchall {:try_start_7a .. :try_end_81} :catchall_88

    goto :goto_93

    :goto_82
    :try_start_82
    throw v0
    :try_end_83
    .catchall {:try_start_82 .. :try_end_83} :catchall_83

    :catchall_83
    move-exception v1

    :try_start_84
    invoke-static {p0, v0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_88
    .catchall {:try_start_84 .. :try_end_88} :catchall_88

    :catchall_88
    move-exception p0

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_93
    new-instance v0, LX5/a;

    invoke-direct {v0}, LX5/a;-><init>()V

    invoke-static {p0}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9f

    move-object p0, v0

    :cond_9f
    check-cast p0, LX5/a;

    return-object p0
.end method

.method private final z(Ljava/lang/String;)Z
    .registers 4

    :try_start_0
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    iget-object p0, p0, Ly7/g;->c:Landroid/content/ContentResolver;

    const-string v0, "com.nothing.quicklook.share"

    invoke-virtual {p0, v0}, Landroid/content/ContentResolver;->acquireContentProviderClient(Ljava/lang/String;)Landroid/content/ContentProviderClient;

    move-result-object p0
    :try_end_a
    .catchall {:try_start_0 .. :try_end_a} :catchall_3b

    if-eqz p0, :cond_31

    :try_start_c
    const-string v0, "queryQuickLookSettings"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Landroid/content/ContentProviderClient;->call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-virtual {v0, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_1d
    .catchall {:try_start_c .. :try_end_1d} :catchall_1e

    goto :goto_21

    :catchall_1e
    move-exception p1

    goto :goto_2b

    :cond_20
    move-object p1, v1

    :goto_21
    :try_start_21
    invoke-static {p0, v1}, Lt8/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    if-eqz p1, :cond_31

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0
    :try_end_2a
    .catchall {:try_start_21 .. :try_end_2a} :catchall_3b

    goto :goto_32

    :goto_2b
    :try_start_2b
    throw p1
    :try_end_2c
    .catchall {:try_start_2b .. :try_end_2c} :catchall_2c

    :catchall_2c
    move-exception v0

    :try_start_2d
    invoke-static {p0, p1}, Lt8/a;->a(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :cond_31
    const/4 p0, 0x0

    :goto_32
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_3a
    .catchall {:try_start_2d .. :try_end_3a} :catchall_3b

    goto :goto_46

    :catchall_3b
    move-exception p0

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_46
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p0}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4f

    move-object p0, p1

    :cond_4f
    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final C(Ly7/g$b;)V
    .registers 3

    const-string v0, "l"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly7/g;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_10

    invoke-direct {p0}, Ly7/g;->x()V

    :cond_10
    iget-object p0, p0, Ly7/g;->d:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final D(Ly7/g$b;)V
    .registers 4

    const-string v0, "l"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly7/g;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Ly7/g;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_1d

    iget-object p1, p0, Ly7/g;->e:LF8/x0;

    const/4 v0, 0x0

    if-eqz p1, :cond_1b

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_1b
    iput-object v0, p0, Ly7/g;->e:LF8/x0;

    :cond_1d
    return-void
.end method

.method public final t()LO2/a;
    .registers 1

    iget-object p0, p0, Ly7/g;->h:LO2/a;

    return-object p0
.end method

.method public final v()LX5/a;
    .registers 1

    iget-object p0, p0, Ly7/g;->g:LX5/a;

    return-object p0
.end method

.method public final w()LY5/a;
    .registers 1

    iget-object p0, p0, Ly7/g;->f:LY5/a;

    return-object p0
.end method
