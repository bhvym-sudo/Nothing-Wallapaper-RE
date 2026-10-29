.class public final LL5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/AlarmManager$OnAlarmListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL5/a$a;
    }
.end annotation


# static fields
.field public static final v:LL5/a$a;


# instance fields
.field private final q:Landroid/app/AlarmManager;

.field private final r:Landroid/app/AlarmManager$OnAlarmListener;

.field private final s:Ljava/lang/String;

.field private final t:Landroid/os/Handler;

.field private u:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LL5/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LL5/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LL5/a;->v:LL5/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/app/AlarmManager;Landroid/app/AlarmManager$OnAlarmListener;Ljava/lang/String;Landroid/os/Handler;)V
    .registers 6

    const-string v0, "mAlarmManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mTag"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL5/a;->q:Landroid/app/AlarmManager;

    iput-object p2, p0, LL5/a;->r:Landroid/app/AlarmManager$OnAlarmListener;

    iput-object p3, p0, LL5/a;->s:Ljava/lang/String;

    iput-object p4, p0, LL5/a;->t:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a()V
    .registers 2

    iget-boolean v0, p0, LL5/a;->u:Z

    if-eqz v0, :cond_c

    iget-object v0, p0, LL5/a;->q:Landroid/app/AlarmManager;

    invoke-virtual {v0, p0}, Landroid/app/AlarmManager;->cancel(Landroid/app/AlarmManager$OnAlarmListener;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LL5/a;->u:Z

    :cond_c
    return-void
.end method

.method public final b()Z
    .registers 1

    iget-boolean p0, p0, LL5/a;->u:Z

    return p0
.end method

.method public final c(JI)Z
    .registers 12

    const/4 v0, 0x1

    if-eqz p3, :cond_2d

    if-eq p3, v0, :cond_27

    const/4 v1, 0x2

    if-ne p3, v1, :cond_10

    iget-boolean p3, p0, LL5/a;->u:Z

    if-eqz p3, :cond_31

    invoke-virtual {p0}, LL5/a;->a()V

    goto :goto_31

    :cond_10
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Illegal mode: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_27
    iget-boolean p3, p0, LL5/a;->u:Z

    if-eqz p3, :cond_31

    const/4 p0, 0x0

    return p0

    :cond_2d
    iget-boolean p3, p0, LL5/a;->u:Z

    if-nez p3, :cond_45

    :cond_31
    :goto_31
    iget-object v1, p0, LL5/a;->q:Landroid/app/AlarmManager;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    add-long v3, v2, p1

    iget-object v5, p0, LL5/a;->s:Ljava/lang/String;

    iget-object v7, p0, LL5/a;->t:Landroid/os/Handler;

    const/4 v2, 0x2

    move-object v6, p0

    invoke-virtual/range {v1 .. v7}, Landroid/app/AlarmManager;->setExact(IJLjava/lang/String;Landroid/app/AlarmManager$OnAlarmListener;Landroid/os/Handler;)V

    iput-boolean v0, v6, LL5/a;->u:Z

    return v0

    :cond_45
    move-object v6, p0

    iget-object p0, v6, LL5/a;->s:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " timeout is already scheduled"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onAlarm()V
    .registers 2

    iget-boolean v0, p0, LL5/a;->u:Z

    if-nez v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x0

    iput-boolean v0, p0, LL5/a;->u:Z

    iget-object p0, p0, LL5/a;->r:Landroid/app/AlarmManager$OnAlarmListener;

    invoke-interface {p0}, Landroid/app/AlarmManager$OnAlarmListener;->onAlarm()V

    return-void
.end method
