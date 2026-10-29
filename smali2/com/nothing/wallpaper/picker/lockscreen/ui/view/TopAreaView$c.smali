.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$c;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$c;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$c;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->f(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_34

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.TIMEZONE_CHANGED"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_34

    const-string p1, "time-zone"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$c;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-static {p2, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$c;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->i(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$c;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->h(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V

    return-void

    :cond_34
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "android.intent.action.TIME_TICK"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5f

    const-string p1, "android.intent.action.TIME_SET"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4d

    goto :goto_5f

    :cond_4d
    const-string p1, "android.app.action.NEXT_ALARM_CLOCK_CHANGED"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5e

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$c;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->h(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V

    :cond_5e
    return-void

    :cond_5f
    :goto_5f
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$c;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->i(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V

    return-void
.end method
