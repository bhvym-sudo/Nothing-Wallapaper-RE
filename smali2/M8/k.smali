.class final LM8/k;
.super LF8/I;
.source "SourceFile"


# static fields
.field public static final s:LM8/k;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LM8/k;

    invoke-direct {v0}, LM8/k;-><init>()V

    sput-object v0, LM8/k;->s:LM8/k;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, LF8/I;-><init>()V

    return-void
.end method


# virtual methods
.method public g1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 4

    sget-object p0, LM8/c;->y:LM8/c;

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-virtual {p0, p2, p1, v0}, LM8/f;->m1(Ljava/lang/Runnable;ZZ)V

    return-void
.end method

.method public h1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 3

    sget-object p0, LM8/c;->y:LM8/c;

    const/4 p1, 0x1

    invoke-virtual {p0, p2, p1, p1}, LM8/f;->m1(Ljava/lang/Runnable;ZZ)V

    return-void
.end method

.method public j1(ILjava/lang/String;)LF8/I;
    .registers 4

    invoke-static {p1}, LK8/l;->a(I)V

    sget v0, LM8/j;->d:I

    if-lt p1, v0, :cond_c

    invoke-static {p0, p2}, LK8/l;->b(LF8/I;Ljava/lang/String;)LF8/I;

    move-result-object p0

    return-object p0

    :cond_c
    invoke-super {p0, p1, p2}, LF8/I;->j1(ILjava/lang/String;)LF8/I;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    const-string p0, "Dispatchers.IO"

    return-object p0
.end method
