.class public final LM8/b;
.super LF8/o0;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final t:LM8/b;

.field private static final u:LF8/I;


# direct methods
.method static constructor <clinit>()V
    .registers 9

    new-instance v0, LM8/b;

    invoke-direct {v0}, LM8/b;-><init>()V

    sput-object v0, LM8/b;->t:LM8/b;

    sget-object v0, LM8/k;->s:LM8/k;

    const/16 v1, 0x40

    invoke-static {}, LK8/E;->a()I

    move-result v2

    invoke-static {v1, v2}, LB8/h;->f(II)I

    move-result v4

    const/16 v7, 0xc

    const/4 v8, 0x0

    const-string v3, "kotlinx.coroutines.io.parallelism"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, LK8/E;->g(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, LF8/I;->k1(LF8/I;ILjava/lang/String;ILjava/lang/Object;)LF8/I;

    move-result-object v0

    sput-object v0, LM8/b;->u:LF8/I;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, LF8/o0;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .registers 2

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot be invoked on Dispatchers.IO"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public execute(Ljava/lang/Runnable;)V
    .registers 3

    sget-object v0, Lm8/j;->q:Lm8/j;

    invoke-virtual {p0, v0, p1}, LM8/b;->g1(Lm8/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public g1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 3

    sget-object p0, LM8/b;->u:LF8/I;

    invoke-virtual {p0, p1, p2}, LF8/I;->g1(Lm8/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public h1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 3

    sget-object p0, LM8/b;->u:LF8/I;

    invoke-virtual {p0, p1, p2}, LF8/I;->h1(Lm8/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public j1(ILjava/lang/String;)LF8/I;
    .registers 3

    sget-object p0, LM8/k;->s:LM8/k;

    invoke-virtual {p0, p1, p2}, LM8/k;->j1(ILjava/lang/String;)LF8/I;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    const-string p0, "Dispatchers.IO"

    return-object p0
.end method
