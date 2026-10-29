.class public abstract Li6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:J


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method public static final a(Lv8/a;)V
    .registers 7

    const-string v0, "onClick"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    sget-wide v2, Li6/b;->a:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x1f4

    cmp-long v2, v2, v4

    if-lez v2, :cond_18

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    sput-wide v0, Li6/b;->a:J

    :cond_18
    return-void
.end method
