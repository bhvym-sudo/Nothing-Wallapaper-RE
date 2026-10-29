.class public final LF8/J0;
.super Lm8/a;
.source "SourceFile"

# interfaces
.implements LF8/x0;


# static fields
.field public static final r:LF8/J0;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LF8/J0;

    invoke-direct {v0}, LF8/J0;-><init>()V

    sput-object v0, LF8/J0;->r:LF8/J0;

    return-void
.end method

.method private constructor <init>()V
    .registers 2

    sget-object v0, LF8/x0;->e:LF8/x0$b;

    invoke-direct {p0, v0}, Lm8/a;-><init>(Lm8/i$c;)V

    return-void
.end method


# virtual methods
.method public G(LF8/u;)LF8/s;
    .registers 2

    sget-object p0, LF8/K0;->q:LF8/K0;

    return-object p0
.end method

.method public I(ZZLv8/l;)LF8/d0;
    .registers 4

    sget-object p0, LF8/K0;->q:LF8/K0;

    return-object p0
.end method

.method public K()Ljava/util/concurrent/CancellationException;
    .registers 2

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "This job is always active"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public O0()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public Q(Lm8/e;)Ljava/lang/Object;
    .registers 2

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "This job is always active"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public a()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public c1(Lv8/l;)LF8/d0;
    .registers 2

    sget-object p0, LF8/K0;->q:LF8/K0;

    return-object p0
.end method

.method public f(Ljava/util/concurrent/CancellationException;)V
    .registers 2

    return-void
.end method

.method public isCancelled()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public start()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    const-string p0, "NonCancellable"

    return-object p0
.end method
