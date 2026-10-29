.class final Ly7/g$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly7/g;-><init>(Landroid/content/Context;LF8/L;LF8/I;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Ly7/g;


# direct methods
.method constructor <init>(Ly7/g;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Ly7/g$d;->r:Ly7/g;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    check-cast p3, Lm8/e;

    invoke-virtual {p0, p1, p2, p3}, Ly7/g$d;->s(Ljava/lang/Object;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Ly7/g$d;->q:I

    if-nez v0, :cond_2a

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    new-instance p1, LO2/a;

    iget-object p0, p0, Ly7/g$d;->r:Ly7/g;

    invoke-static {p0}, Ly7/g;->c(Ly7/g;)Landroid/app/AlarmManager;

    move-result-object p0

    if-eqz p0, :cond_23

    invoke-virtual {p0}, Landroid/app/AlarmManager;->getNextAlarmClock()Landroid/app/AlarmManager$AlarmClockInfo;

    move-result-object p0

    if-eqz p0, :cond_23

    invoke-virtual {p0}, Landroid/app/AlarmManager$AlarmClockInfo;->getTriggerTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/coroutines/jvm/internal/b;->d(J)Ljava/lang/Long;

    move-result-object p0

    goto :goto_24

    :cond_23
    const/4 p0, 0x0

    :goto_24
    const-string v0, ""

    invoke-direct {p1, p0, v0}, LO2/a;-><init>(Ljava/lang/Long;Ljava/lang/String;)V

    return-object p1

    :cond_2a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(Ljava/lang/Object;Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 4

    new-instance p1, Ly7/g$d;

    iget-object p0, p0, Ly7/g$d;->r:Ly7/g;

    invoke-direct {p1, p0, p3}, Ly7/g$d;-><init>(Ly7/g;Lm8/e;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-virtual {p1, p0}, Ly7/g$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
