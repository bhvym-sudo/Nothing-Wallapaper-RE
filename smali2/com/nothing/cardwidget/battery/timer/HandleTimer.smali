.class public final Lcom/nothing/cardwidget/battery/timer/HandleTimer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/cardwidget/battery/timer/ITimerTask;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/cardwidget/battery/timer/HandleTimer$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/nothing/cardwidget/battery/timer/HandleTimer$Companion;

.field private static final TAG:Ljava/lang/String; = "HandleTimer"


# instance fields
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

.field private final timeTicker:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/cardwidget/battery/timer/HandleTimer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/cardwidget/battery/timer/HandleTimer$Companion;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->Companion:Lcom/nothing/cardwidget/battery/timer/HandleTimer$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .registers 3

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->id:Ljava/lang/String;

    new-instance p1, LK5/b;

    invoke-direct {p1}, LK5/b;-><init>()V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->handler$delegate:Lh8/h;

    new-instance p1, LK5/c;

    invoke-direct {p1, p0}, LK5/c;-><init>(Lcom/nothing/cardwidget/battery/timer/HandleTimer;)V

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->timeTicker:Ljava/lang/Runnable;

    return-void
.end method

.method public static synthetic a(Lcom/nothing/cardwidget/battery/timer/HandleTimer;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->timeTicker$lambda$1(Lcom/nothing/cardwidget/battery/timer/HandleTimer;)V

    return-void
.end method

.method public static synthetic b()Landroid/os/Handler;
    .registers 1

    invoke-static {}, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->handler_delegate$lambda$0()Landroid/os/Handler;

    move-result-object v0

    return-object v0
.end method

.method private final getHandler()Landroid/os/Handler;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->handler$delegate:Lh8/h;

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

.method private static final timeTicker$lambda$1(Lcom/nothing/cardwidget/battery/timer/HandleTimer;)V
    .registers 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->listener:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_16

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/cardwidget/battery/timer/ITimerListener;

    if-eqz v0, :cond_16

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->id:Ljava/lang/String;

    invoke-interface {v0, p0}, Lcom/nothing/cardwidget/battery/timer/ITimerListener;->onTicker(Ljava/lang/String;)V

    :cond_16
    return-void
.end method


# virtual methods
.method public cancel()V
    .registers 3

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->timeTicker:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasCallbacks(Ljava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->timeTicker:Ljava/lang/Runnable;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_15
    return-void
.end method

.method public final getId()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->id:Ljava/lang/String;

    return-object p0
.end method

.method public start(JLcom/nothing/cardwidget/battery/timer/ITimerListener;)V
    .registers 5

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->listener:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->getHandler()Landroid/os/Handler;

    move-result-object p3

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->timeTicker:Ljava/lang/Runnable;

    invoke-virtual {p3, v0}, Landroid/os/Handler;->hasCallbacks(Ljava/lang/Runnable;)Z

    move-result p3

    if-nez p3, :cond_21

    invoke-direct {p0}, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->getHandler()Landroid/os/Handler;

    move-result-object p3

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/timer/HandleTimer;->timeTicker:Ljava/lang/Runnable;

    invoke-virtual {p3, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_21
    return-void
.end method
