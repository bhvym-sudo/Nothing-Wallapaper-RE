.class public abstract LF8/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LK8/D;

.field private static final b:LK8/D;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LK8/D;

    const-string v1, "REMOVED_TASK"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LF8/l0;->a:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "CLOSED_EMPTY"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LF8/l0;->b:LK8/D;

    return-void
.end method

.method public static final synthetic a()LK8/D;
    .registers 1

    sget-object v0, LF8/l0;->b:LK8/D;

    return-object v0
.end method

.method public static final synthetic b()LK8/D;
    .registers 1

    sget-object v0, LF8/l0;->a:LK8/D;

    return-object v0
.end method

.method public static final c(J)J
    .registers 5

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gtz v2, :cond_7

    return-wide v0

    :cond_7
    const-wide v0, 0x8637bd05af6L

    cmp-long v0, p0, v0

    if-ltz v0, :cond_16

    const-wide p0, 0x7fffffffffffffffL

    return-wide p0

    :cond_16
    const-wide/32 v0, 0xf4240

    mul-long/2addr p0, v0

    return-wide p0
.end method
