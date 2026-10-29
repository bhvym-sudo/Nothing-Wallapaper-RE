.class public final LQ7/s$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ7/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, LQ7/s$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LQ7/s$a;)Ljava/util/concurrent/ScheduledExecutorService;
    .registers 1

    invoke-direct {p0}, LQ7/s$a;->b()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p0

    return-object p0
.end method

.method private final b()Ljava/util/concurrent/ScheduledExecutorService;
    .registers 1

    invoke-static {}, LQ7/s;->o()Lh8/h;

    move-result-object p0

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method
