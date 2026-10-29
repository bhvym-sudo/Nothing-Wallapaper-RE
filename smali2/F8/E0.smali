.class public abstract LF8/E0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LK8/D;

.field public static final b:LK8/D;

.field private static final c:LK8/D;

.field private static final d:LK8/D;

.field private static final e:LK8/D;

.field private static final f:LF8/g0;

.field private static final g:LF8/g0;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LK8/D;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LF8/E0;->a:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LF8/E0;->b:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LF8/E0;->c:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LF8/E0;->d:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "SEALED"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LF8/E0;->e:LK8/D;

    new-instance v0, LF8/g0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF8/g0;-><init>(Z)V

    sput-object v0, LF8/E0;->f:LF8/g0;

    new-instance v0, LF8/g0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LF8/g0;-><init>(Z)V

    sput-object v0, LF8/E0;->g:LF8/g0;

    return-void
.end method

.method public static final synthetic a()LK8/D;
    .registers 1

    sget-object v0, LF8/E0;->a:LK8/D;

    return-object v0
.end method

.method public static final synthetic b()LK8/D;
    .registers 1

    sget-object v0, LF8/E0;->c:LK8/D;

    return-object v0
.end method

.method public static final synthetic c()LF8/g0;
    .registers 1

    sget-object v0, LF8/E0;->g:LF8/g0;

    return-object v0
.end method

.method public static final synthetic d()LF8/g0;
    .registers 1

    sget-object v0, LF8/E0;->f:LF8/g0;

    return-object v0
.end method

.method public static final synthetic e()LK8/D;
    .registers 1

    sget-object v0, LF8/E0;->e:LK8/D;

    return-object v0
.end method

.method public static final synthetic f()LK8/D;
    .registers 1

    sget-object v0, LF8/E0;->d:LK8/D;

    return-object v0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    instance-of v0, p0, LF8/t0;

    if-eqz v0, :cond_c

    new-instance v0, LF8/u0;

    check-cast p0, LF8/t0;

    invoke-direct {v0, p0}, LF8/u0;-><init>(LF8/t0;)V

    return-object v0

    :cond_c
    return-object p0
.end method

.method public static final h(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    instance-of v0, p0, LF8/u0;

    if-eqz v0, :cond_8

    move-object v0, p0

    check-cast v0, LF8/u0;

    goto :goto_9

    :cond_8
    const/4 v0, 0x0

    :goto_9
    if-eqz v0, :cond_11

    iget-object v0, v0, LF8/u0;->a:LF8/t0;

    if-nez v0, :cond_10

    goto :goto_11

    :cond_10
    return-object v0

    :cond_11
    :goto_11
    return-object p0
.end method
