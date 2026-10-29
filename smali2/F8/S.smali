.class public abstract LF8/S;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Z

.field private static final b:LF8/V;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    const-string v0, "kotlinx.coroutines.main.delay"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LK8/E;->f(Ljava/lang/String;Z)Z

    move-result v0

    sput-boolean v0, LF8/S;->a:Z

    invoke-static {}, LF8/S;->b()LF8/V;

    move-result-object v0

    sput-object v0, LF8/S;->b:LF8/V;

    return-void
.end method

.method public static final a()LF8/V;
    .registers 1

    sget-object v0, LF8/S;->b:LF8/V;

    return-object v0
.end method

.method private static final b()LF8/V;
    .registers 2

    sget-boolean v0, LF8/S;->a:Z

    if-nez v0, :cond_7

    sget-object v0, LF8/Q;->y:LF8/Q;

    return-object v0

    :cond_7
    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v0

    invoke-static {v0}, LK8/t;->c(LF8/H0;)Z

    move-result v1

    if-nez v1, :cond_19

    instance-of v1, v0, LF8/V;

    if-nez v1, :cond_16

    goto :goto_19

    :cond_16
    check-cast v0, LF8/V;

    return-object v0

    :cond_19
    :goto_19
    sget-object v0, LF8/Q;->y:LF8/Q;

    return-object v0
.end method
