.class public final LO5/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO5/b$a$a;
    }
.end annotation


# static fields
.field public static final u:LO5/b$a$a;

.field private static volatile v:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field private final q:Landroid/content/IntentFilter;

.field private final r:Landroid/content/BroadcastReceiver;

.field private final s:J

.field private final t:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, LO5/b$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LO5/b$a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LO5/b$a;->u:LO5/b$a$a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, LO5/b$a;->v:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/IntentFilter;Landroid/content/BroadcastReceiver;)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receiver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO5/b$a;->q:Landroid/content/IntentFilter;

    iput-object p3, p0, LO5/b$a;->r:Landroid/content/BroadcastReceiver;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    iput-wide p2, p0, LO5/b$a;->s:J

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LO5/b$a;->t:Landroid/content/Context;

    sget-object p0, LO5/b$a;->v:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide p0

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-eqz p0, :cond_34

    sget-object p0, LO5/b$a;->v:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p0, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void

    :cond_34
    sget-object p0, LO5/b$a;->v:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 p1, 0x1

    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 6

    const-string v0, "ConfigBroadcastManager"

    iget-wide v1, p0, LO5/b$a;->s:J

    sget-object v3, LO5/b$a;->v:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-ltz v1, :cond_7c

    :try_start_e
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    sget-object v1, LO5/b$a;->v:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    cmp-long v1, v1, v3

    if-eqz v1, :cond_26

    iget-object v1, p0, LO5/b$a;->t:Landroid/content/Context;

    iget-object v2, p0, LO5/b$a;->r:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    goto :goto_26

    :catchall_24
    move-exception v1

    goto :goto_2c

    :cond_26
    :goto_26
    sget-object v1, Lh8/A;->a:Lh8/A;

    invoke-static {v1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2b
    .catchall {:try_start_e .. :try_end_2b} :catchall_24

    goto :goto_35

    :goto_2c
    sget-object v2, Lh8/q;->r:Lh8/q$a;

    invoke-static {v1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_35
    :try_start_35
    iget-object v1, p0, LO5/b$a;->q:Landroid/content/IntentFilter;

    invoke-virtual {v1}, Landroid/content/IntentFilter;->countActions()I

    move-result v1

    if-lez v1, :cond_49

    iget-object v2, p0, LO5/b$a;->t:Landroid/content/Context;

    iget-object v3, p0, LO5/b$a;->r:Landroid/content/BroadcastReceiver;

    iget-object p0, p0, LO5/b$a;->q:Landroid/content/IntentFilter;

    invoke-virtual {v2, v3, p0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    goto :goto_49

    :catchall_47
    move-exception p0

    goto :goto_67

    :cond_49
    :goto_49
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Register Broadcast successfully for intent actions size = "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_66
    .catchall {:try_start_35 .. :try_end_66} :catchall_47

    goto :goto_71

    :goto_67
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_71
    invoke-static {p0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_7c

    const-string v1, "Register Broadcast Task execute failure with exception."

    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_7c
    return-void
.end method
