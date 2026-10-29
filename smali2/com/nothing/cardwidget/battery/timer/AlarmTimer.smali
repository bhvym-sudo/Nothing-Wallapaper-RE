.class public final Lcom/nothing/cardwidget/battery/timer/AlarmTimer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/cardwidget/battery/timer/ITimerTask;
.implements Landroid/app/AlarmManager$OnAlarmListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/battery/timer/AlarmTimer$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/cardwidget/battery/timer/AlarmTimer$Companion;

.field private static final TAG:Ljava/lang/String; = "AlarmTimer"


# instance fields
.field private alarmManager:Landroid/app/AlarmManager;

.field private alarmTimeOut:LL5/a;

.field private final context:Landroid/content/Context;

.field private final handler$delegate:Lh8/h;

.field private final id:Ljava/lang/String;

.field private listener:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/nothing/cardwidget/battery/timer/ITimerListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/battery/timer/AlarmTimer$Companion;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->Companion:Lcom/nothing/cardwidget/battery/timer/AlarmTimer$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->id:Ljava/lang/String;

    new-instance p2, LK5/a;

    invoke-direct {p2}, LK5/a;-><init>()V

    invoke-static {p2}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p2

    iput-object p2, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->handler$delegate:Lh8/h;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "alarm"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Landroid/app/AlarmManager;

    if-eqz p2, :cond_2d

    check-cast p1, Landroid/app/AlarmManager;

    goto :goto_2e

    :cond_2d
    const/4 p1, 0x0

    :goto_2e
    iput-object p1, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->alarmManager:Landroid/app/AlarmManager;

    if-eqz p1, :cond_44

    new-instance p1, LL5/a;

    iget-object p2, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->alarmManager:Landroid/app/AlarmManager;

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    const-string v0, "AlarmTimer"

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->getHandler()Landroid/os/Handler;

    move-result-object v1

    invoke-direct {p1, p2, p0, v0, v1}, LL5/a;-><init>(Landroid/app/AlarmManager;Landroid/app/AlarmManager$OnAlarmListener;Ljava/lang/String;Landroid/os/Handler;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->alarmTimeOut:LL5/a;

    :cond_44
    return-void
.end method

.method public static synthetic a()Landroid/os/Handler;
    .registers 1

    invoke-static {}, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->handler_delegate$lambda$0()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method

.method private final getHandler()Landroid/os/Handler;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->handler$delegate:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/Handler;

    return-object p0
.end method

.method private static final handler_delegate$lambda$0()Landroid/os/Handler;
    .registers 2

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-object v0
.end method


# virtual methods
.method public cancel()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->alarmTimeOut:LL5/a;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, LL5/a;->b()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_12

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->alarmTimeOut:LL5/a;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, LL5/a;->a()V

    :cond_12
    iget-object p0, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->id:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cancel "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " alarm"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "AlarmTimer"

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final getContext()Landroid/content/Context;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->context:Landroid/content/Context;

    return-object p0
.end method

.method public final getId()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->id:Ljava/lang/String;

    return-object p0
.end method

.method public onAlarm()V
    .registers 4

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->id:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "receive onAlarm: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AlarmTimer"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->listener:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_29

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/cardwidget/battery/timer/ITimerListener;

    if-eqz v0, :cond_29

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->id:Ljava/lang/String;

    invoke-interface {v0, p0}, Lcom/nothing/cardwidget/battery/timer/ITimerListener;->onTicker(Ljava/lang/String;)V

    :cond_29
    return-void
.end method

.method public start(JLcom/nothing/cardwidget/battery/timer/ITimerListener;)V
    .registers 5

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->listener:Ljava/lang/ref/WeakReference;

    iget-object p3, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->alarmTimeOut:LL5/a;

    if-eqz p3, :cond_4c

    invoke-virtual {p3}, LL5/a;->b()Z

    move-result p3

    if-nez p3, :cond_4c

    iget-object p3, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->alarmTimeOut:LL5/a;

    if-eqz p3, :cond_1e

    const/4 v0, 0x2

    invoke-virtual {p3, p1, p2, v0}, LL5/a;->c(JI)Z

    :cond_1e
    iget-object p1, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->id:Ljava/lang/String;

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/timer/AlarmTimer;->alarmTimeOut:LL5/a;

    if-eqz p0, :cond_2d

    invoke-virtual {p0}, LL5/a;->b()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    goto :goto_2e

    :cond_2d
    const/4 p0, 0x0

    :goto_2e
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "start "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " alarm isScheduled: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "AlarmTimer"

    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4c
    return-void
.end method
