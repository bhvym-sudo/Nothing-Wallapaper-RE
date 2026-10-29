.class public abstract LO8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:I

.field private static final b:LK8/D;

.field private static final c:LK8/D;

.field private static final d:LK8/D;

.field private static final e:LK8/D;

.field private static final f:I


# direct methods
.method static constructor <clinit>()V
    .registers 8

    const/16 v4, 0xc

    const/4 v5, 0x0

    const-string v0, "kotlinx.coroutines.semaphore.maxSpinCycles"

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LK8/E;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LO8/j;->a:I

    new-instance v0, LK8/D;

    const-string v1, "PERMIT"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LO8/j;->b:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "TAKEN"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LO8/j;->c:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "BROKEN"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LO8/j;->d:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "CANCELLED"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LO8/j;->e:LK8/D;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v2, "kotlinx.coroutines.semaphore.segmentSize"

    const/16 v3, 0x10

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LK8/E;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LO8/j;->f:I

    return-void
.end method

.method public static final synthetic a(JLO8/k;)LO8/k;
    .registers 3

    invoke-static {p0, p1, p2}, LO8/j;->h(JLO8/k;)LO8/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()LK8/D;
    .registers 1

    sget-object v0, LO8/j;->d:LK8/D;

    return-object v0
.end method

.method public static final synthetic c()LK8/D;
    .registers 1

    sget-object v0, LO8/j;->e:LK8/D;

    return-object v0
.end method

.method public static final synthetic d()I
    .registers 1

    sget v0, LO8/j;->a:I

    return v0
.end method

.method public static final synthetic e()LK8/D;
    .registers 1

    sget-object v0, LO8/j;->b:LK8/D;

    return-object v0
.end method

.method public static final synthetic f()I
    .registers 1

    sget v0, LO8/j;->f:I

    return v0
.end method

.method public static final synthetic g()LK8/D;
    .registers 1

    sget-object v0, LO8/j;->c:LK8/D;

    return-object v0
.end method

.method private static final h(JLO8/k;)LO8/k;
    .registers 5

    new-instance v0, LO8/k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, LO8/k;-><init>(JLO8/k;I)V

    return-object v0
.end method
