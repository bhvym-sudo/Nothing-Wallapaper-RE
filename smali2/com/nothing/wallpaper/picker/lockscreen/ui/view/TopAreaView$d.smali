.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 3

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-direct {p1, p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 12

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_63

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)Landroid/app/AlarmManager;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v1, :cond_4b

    invoke-virtual {v1}, Landroid/app/AlarmManager;->getNextAlarmClock()Landroid/app/AlarmManager$AlarmClockInfo;

    move-result-object v1

    if-eqz v1, :cond_4b

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-virtual {v1}, Landroid/app/AlarmManager$AlarmClockInfo;->getTriggerTime()J

    move-result-wide v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v5, v7

    sget-object v7, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v8, 0xc

    invoke-virtual {v7, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v7

    sub-long/2addr v5, v7

    const-wide/16 v7, 0x0

    cmp-long v7, v5, v7

    if-lez v7, :cond_4c

    invoke-static {v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->g(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)Ljava/lang/Runnable;

    move-result-object v7

    invoke-virtual {v4, v7, v5, v6}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_4c

    :cond_4b
    move-object v1, v3

    :cond_4c
    :goto_4c
    invoke-static {p1, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->j(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;Landroid/app/AlarmManager$AlarmClockInfo;)V

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object p1

    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d$a;

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-direct {v1, v4, v3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;Lm8/e;)V

    iput v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$d;->q:I

    invoke-static {p1, v1, p0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_63

    return-object v0

    :cond_63
    :goto_63
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
