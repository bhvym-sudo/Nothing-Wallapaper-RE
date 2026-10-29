.class LF8/U;
.super LF8/a;
.source "SourceFile"

# interfaces
.implements LF8/T;


# direct methods
.method public constructor <init>(Lm8/i;Z)V
    .registers 4

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, LF8/a;-><init>(Lm8/i;ZZ)V

    return-void
.end method

.method static synthetic Y0(LF8/U;Lm8/e;)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0, p1}, LF8/D0;->A(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public P0(Lm8/e;)Ljava/lang/Object;
    .registers 2

    invoke-static {p0, p1}, LF8/U;->Y0(LF8/U;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
