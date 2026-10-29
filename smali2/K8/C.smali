.class public abstract LK8/C;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/StackTraceElement;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, La/a;

    invoke-direct {v0}, La/a;-><init>()V

    invoke-virtual {v0}, La/a;->a()Ljava/lang/StackTraceElement;

    move-result-object v0

    sput-object v0, LK8/C;->a:Ljava/lang/StackTraceElement;

    :try_start_b
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    const-class v0, Lkotlin/coroutines/jvm/internal/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_17
    .catchall {:try_start_b .. :try_end_17} :catchall_18

    goto :goto_23

    :catchall_18
    move-exception v0

    sget-object v1, Lh8/q;->r:Lh8/q$a;

    invoke-static {v0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_23
    invoke-static {v0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_2a

    goto :goto_2c

    :cond_2a
    const-string v0, "kotlin.coroutines.jvm.internal.BaseContinuationImpl"

    :goto_2c
    check-cast v0, Ljava/lang/String;

    sput-object v0, LK8/C;->b:Ljava/lang/String;

    :try_start_30
    const-class v0, LK8/C;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3a
    .catchall {:try_start_30 .. :try_end_3a} :catchall_3b

    goto :goto_46

    :catchall_3b
    move-exception v0

    sget-object v1, Lh8/q;->r:Lh8/q$a;

    invoke-static {v0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_46
    invoke-static {v0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_4d

    goto :goto_4f

    :cond_4d
    const-string v0, "kotlinx.coroutines.internal.StackTraceRecoveryKt"

    :goto_4f
    check-cast v0, Ljava/lang/String;

    sput-object v0, LK8/C;->c:Ljava/lang/String;

    return-void
.end method

.method public static final a(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .registers 1

    return-object p0
.end method
