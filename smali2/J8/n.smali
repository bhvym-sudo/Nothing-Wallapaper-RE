.class final LJ8/n;
.super LK8/z;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lm8/i;Lm8/e;)V
    .registers 3

    invoke-direct {p0, p1, p2}, LK8/z;-><init>(Lm8/i;Lm8/e;)V

    return-void
.end method


# virtual methods
.method public M(Ljava/lang/Throwable;)Z
    .registers 3

    instance-of v0, p1, LJ8/k;

    if-eqz v0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    invoke-virtual {p0, p1}, LF8/D0;->E(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
