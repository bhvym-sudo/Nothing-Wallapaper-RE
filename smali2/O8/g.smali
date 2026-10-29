.class public abstract LO8/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LK8/D;

.field private static final b:LK8/D;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LK8/D;

    const-string v1, "NO_OWNER"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LO8/g;->a:LK8/D;

    new-instance v0, LK8/D;

    const-string v1, "ALREADY_LOCKED_BY_OWNER"

    invoke-direct {v0, v1}, LK8/D;-><init>(Ljava/lang/String;)V

    sput-object v0, LO8/g;->b:LK8/D;

    return-void
.end method

.method public static final a(Z)LO8/a;
    .registers 2

    new-instance v0, LO8/f;

    invoke-direct {v0, p0}, LO8/f;-><init>(Z)V

    return-object v0
.end method

.method public static synthetic b(ZILjava/lang/Object;)LO8/a;
    .registers 3

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_5

    const/4 p0, 0x0

    :cond_5
    invoke-static {p0}, LO8/g;->a(Z)LO8/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()LK8/D;
    .registers 1

    sget-object v0, LO8/g;->a:LK8/D;

    return-object v0
.end method
