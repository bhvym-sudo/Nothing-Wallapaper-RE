.class public final Lcom/nothing/cardwidget/battery/timer/TimerFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/battery/timer/TimerFactory$TimerType;,
        Lcom/nothing/cardwidget/battery/timer/TimerFactory$WhenMappings;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/nothing/cardwidget/battery/timer/TimerFactory;

.field private static final allTimers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/nothing/cardwidget/battery/timer/ITimerTask;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/cardwidget/battery/timer/TimerFactory;

    invoke-direct {v0}, Lcom/nothing/cardwidget/battery/timer/TimerFactory;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->INSTANCE:Lcom/nothing/cardwidget/battery/timer/TimerFactory;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "synchronizedMap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->allTimers:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final start(Landroid/content/Context;Ljava/lang/String;Lcom/nothing/cardwidget/battery/timer/TimerFactory$TimerType;JLcom/nothing/cardwidget/battery/timer/ITimerListener;)Lcom/nothing/cardwidget/battery/timer/ITimerTask;
    .registers 8

    sget-object p0, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->allTimers:Ljava/util/Map;

    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/cardwidget/battery/timer/ITimerTask;

    if-nez v0, :cond_2e

    sget-object v0, Lcom/nothing/cardwidget/battery/timer/TimerFactory$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_25

    const/4 v0, 0x2

    if-ne p3, v0, :cond_1f

    new-instance p3, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;

    invoke-direct {p3, p1, p2}, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object v0, p3

    goto :goto_2b

    :cond_1f
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0

    :cond_25
    new-instance p1, Lcom/nothing/cardwidget/battery/timer/HandleTimer;

    invoke-direct {p1, p2}, Lcom/nothing/cardwidget/battery/timer/HandleTimer;-><init>(Ljava/lang/String;)V

    move-object v0, p1

    :goto_2b
    invoke-interface {p0, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2e
    invoke-interface {v0, p4, p5, p6}, Lcom/nothing/cardwidget/battery/timer/ITimerTask;->start(JLcom/nothing/cardwidget/battery/timer/ITimerListener;)V

    return-object v0
.end method


# virtual methods
.method public final startAlarmTimer(Landroid/content/Context;Ljava/lang/String;JLcom/nothing/cardwidget/battery/timer/ITimerListener;)V
    .registers 14

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lcom/nothing/cardwidget/battery/timer/TimerFactory$TimerType;->ALARM:Lcom/nothing/cardwidget/battery/timer/TimerFactory$TimerType;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v5, p3

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->start(Landroid/content/Context;Ljava/lang/String;Lcom/nothing/cardwidget/battery/timer/TimerFactory$TimerType;JLcom/nothing/cardwidget/battery/timer/ITimerListener;)Lcom/nothing/cardwidget/battery/timer/ITimerTask;

    return-void
.end method

.method public final startHandleTimer(Landroid/content/Context;Ljava/lang/String;JLcom/nothing/cardwidget/battery/timer/ITimerListener;)V
    .registers 14

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lcom/nothing/cardwidget/battery/timer/TimerFactory$TimerType;->HANDLE:Lcom/nothing/cardwidget/battery/timer/TimerFactory$TimerType;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v5, p3

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->start(Landroid/content/Context;Ljava/lang/String;Lcom/nothing/cardwidget/battery/timer/TimerFactory$TimerType;JLcom/nothing/cardwidget/battery/timer/ITimerListener;)Lcom/nothing/cardwidget/battery/timer/ITimerTask;

    return-void
.end method

.method public final stopTimer(Ljava/lang/String;)V
    .registers 2

    const-string p0, "timerId"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/nothing/cardwidget/battery/timer/TimerFactory;->allTimers:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/battery/timer/ITimerTask;

    if-eqz p0, :cond_12

    invoke-interface {p0}, Lcom/nothing/cardwidget/battery/timer/ITimerTask;->cancel()V

    :cond_12
    return-void
.end method
