.class public abstract LM8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:J

.field public static final c:I

.field public static final d:I

.field public static final e:J

.field public static f:LM8/g;


# direct methods
.method static constructor <clinit>()V
    .registers 10

    const-string v0, "kotlinx.coroutines.scheduler.default.name"

    const-string v1, "DefaultDispatcher"

    invoke-static {v0, v1}, LK8/E;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LM8/j;->a:Ljava/lang/String;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const-string v1, "kotlinx.coroutines.scheduler.resolution.ns"

    const-wide/32 v2, 0x186a0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v1 .. v9}, LK8/E;->h(Ljava/lang/String;JJJILjava/lang/Object;)J

    move-result-wide v0

    sput-wide v0, LM8/j;->b:J

    invoke-static {}, LK8/E;->a()I

    move-result v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, LB8/h;->f(II)I

    move-result v3

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v2, "kotlinx.coroutines.scheduler.core.pool.size"

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LK8/E;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LM8/j;->c:I

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v1, "kotlinx.coroutines.scheduler.max.pool.size"

    const v2, 0x1ffffe

    const/4 v3, 0x0

    const v4, 0x1ffffe

    invoke-static/range {v1 .. v6}, LK8/E;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LM8/j;->d:I

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v1, "kotlinx.coroutines.scheduler.keep.alive.sec"

    const-wide/16 v2, 0x3c

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v1 .. v9}, LK8/E;->h(Ljava/lang/String;JJJILjava/lang/Object;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, LM8/j;->e:J

    sget-object v0, LM8/e;->a:LM8/e;

    sput-object v0, LM8/j;->f:LM8/g;

    return-void
.end method

.method public static final synthetic a(Z)Ljava/lang/String;
    .registers 1

    invoke-static {p0}, LM8/j;->c(Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/Runnable;JZ)LM8/h;
    .registers 5

    new-instance v0, LM8/i;

    invoke-direct {v0, p0, p1, p2, p3}, LM8/i;-><init>(Ljava/lang/Runnable;JZ)V

    return-object v0
.end method

.method private static final c(Z)Ljava/lang/String;
    .registers 1

    if-eqz p0, :cond_5

    const-string p0, "Blocking"

    return-object p0

    :cond_5
    const-string p0, "Non-blocking"

    return-object p0
.end method
