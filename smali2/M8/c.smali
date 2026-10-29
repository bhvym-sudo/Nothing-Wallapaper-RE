.class public final LM8/c;
.super LM8/f;
.source "SourceFile"


# static fields
.field public static final y:LM8/c;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LM8/c;

    invoke-direct {v0}, LM8/c;-><init>()V

    sput-object v0, LM8/c;->y:LM8/c;

    return-void
.end method

.method private constructor <init>()V
    .registers 7

    sget v1, LM8/j;->c:I

    sget v2, LM8/j;->d:I

    sget-wide v3, LM8/j;->e:J

    sget-object v5, LM8/j;->a:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, LM8/f;-><init>(IIJLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public close()V
    .registers 2

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Dispatchers.Default cannot be closed"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public j1(ILjava/lang/String;)LF8/I;
    .registers 4

    invoke-static {p1}, LK8/l;->a(I)V

    sget v0, LM8/j;->c:I

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

    const-string p0, "Dispatchers.Default"

    return-object p0
.end method
