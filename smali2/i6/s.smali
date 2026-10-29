.class public abstract Li6/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const-string v1, "newSingleThreadExecutor(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Li6/s;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static final a()Ljava/util/concurrent/ExecutorService;
    .registers 1

    sget-object v0, Li6/s;->a:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method
