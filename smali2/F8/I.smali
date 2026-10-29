.class public abstract LF8/I;
.super Lm8/a;
.source "SourceFile"

# interfaces
.implements Lm8/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF8/I$a;
    }
.end annotation


# static fields
.field public static final r:LF8/I$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LF8/I$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF8/I$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LF8/I;->r:LF8/I$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    sget-object v0, Lm8/f;->l:Lm8/f$b;

    invoke-direct {p0, v0}, Lm8/a;-><init>(Lm8/i$c;)V

    return-void
.end method

.method public static synthetic k1(LF8/I;ILjava/lang/String;ILjava/lang/Object;)LF8/I;
    .registers 5

    if-nez p4, :cond_c

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_7

    const/4 p2, 0x0

    :cond_7
    invoke-virtual {p0, p1, p2}, LF8/I;->j1(ILjava/lang/String;)LF8/I;

    move-result-object p0

    return-object p0

    :cond_c
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: limitedParallelism"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final U(Lm8/e;)Lm8/e;
    .registers 3

    new-instance v0, LK8/h;

    invoke-direct {v0, p0, p1}, LK8/h;-><init>(LF8/I;Lm8/e;)V

    return-object v0
.end method

.method public final Y(Lm8/e;)V
    .registers 2

    const-string p0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LK8/h;

    invoke-virtual {p1}, LK8/h;->w()V

    return-void
.end method

.method public b(Lm8/i$c;)Lm8/i$b;
    .registers 2

    invoke-static {p0, p1}, Lm8/f$a;->a(Lm8/f;Lm8/i$c;)Lm8/i$b;

    move-result-object p0

    return-object p0
.end method

.method public abstract g1(Lm8/i;Ljava/lang/Runnable;)V
.end method

.method public h1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 3

    invoke-static {p0, p1, p2}, LK8/i;->c(LF8/I;Lm8/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public i1(Lm8/i;)Z
    .registers 2

    const/4 p0, 0x1

    return p0
.end method

.method public j1(ILjava/lang/String;)LF8/I;
    .registers 4

    invoke-static {p1}, LK8/l;->a(I)V

    new-instance v0, LK8/k;

    invoke-direct {v0, p0, p1, p2}, LK8/k;-><init>(LF8/I;ILjava/lang/String;)V

    return-object v0
.end method

.method public t0(Lm8/i$c;)Lm8/i;
    .registers 2

    invoke-static {p0, p1}, Lm8/f$a;->b(Lm8/f;Lm8/i$c;)Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LF8/P;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LF8/P;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
