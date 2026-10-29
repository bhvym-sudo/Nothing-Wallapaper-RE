.class public final LF8/Z0;
.super LF8/I;
.source "SourceFile"


# static fields
.field public static final s:LF8/Z0;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LF8/Z0;

    invoke-direct {v0}, LF8/Z0;-><init>()V

    sput-object v0, LF8/Z0;->s:LF8/Z0;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, LF8/I;-><init>()V

    return-void
.end method


# virtual methods
.method public g1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 3

    sget-object p0, LF8/d1;->s:LF8/d1$a;

    invoke-interface {p1, p0}, Lm8/i;->b(Lm8/i$c;)Lm8/i$b;

    move-result-object p0

    check-cast p0, LF8/d1;

    if-eqz p0, :cond_e

    const/4 p1, 0x1

    iput-boolean p1, p0, LF8/d1;->r:Z

    return-void

    :cond_e
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public i1(Lm8/i;)Z
    .registers 2

    const/4 p0, 0x0

    return p0
.end method

.method public j1(ILjava/lang/String;)LF8/I;
    .registers 3

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "limitedParallelism is not supported for Dispatchers.Unconfined"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    const-string p0, "Dispatchers.Unconfined"

    return-object p0
.end method
