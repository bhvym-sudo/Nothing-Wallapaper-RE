.class public abstract LI8/Q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LK8/D;

.field private static final b:LK8/D;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LK8/D;

    const-string v1, "NONE"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LI8/Q;->a:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "PENDING"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LI8/Q;->b:LK8/D;

    return-void
.end method

.method public static final a(Ljava/lang/Object;)LI8/A;
    .registers 2

    new-instance v0, LI8/P;

    if-nez p0, :cond_6

    sget-object p0, LJ8/t;->a:LK8/D;

    :cond_6
    invoke-direct {v0, p0}, LI8/P;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final synthetic b()LK8/D;
    .registers 1

    sget-object v0, LI8/Q;->a:LK8/D;

    return-object v0
.end method

.method public static final synthetic c()LK8/D;
    .registers 1

    sget-object v0, LI8/Q;->b:LK8/D;

    return-object v0
.end method

.method public static final d(LI8/O;Lm8/i;ILH8/a;)LI8/f;
    .registers 5

    if-ltz p2, :cond_6

    const/4 v0, 0x2

    if-ge p2, v0, :cond_6

    goto :goto_9

    :cond_6
    const/4 v0, -0x2

    if-ne p2, v0, :cond_e

    :goto_9
    sget-object v0, LH8/a;->r:LH8/a;

    if-ne p3, v0, :cond_e

    return-object p0

    :cond_e
    invoke-static {p0, p1, p2, p3}, LI8/G;->e(LI8/E;Lm8/i;ILH8/a;)LI8/f;

    move-result-object p0

    return-object p0
.end method
