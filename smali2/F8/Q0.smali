.class LF8/Q0;
.super LF8/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lm8/i;Z)V
    .registers 4

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, LF8/a;-><init>(Lm8/i;ZZ)V

    return-void
.end method


# virtual methods
.method protected f0(Ljava/lang/Throwable;)Z
    .registers 2

    invoke-virtual {p0}, LF8/a;->getContext()Lm8/i;

    move-result-object p0

    invoke-static {p0, p1}, LF8/K;->a(Lm8/i;Ljava/lang/Throwable;)V

    const/4 p0, 0x1

    return p0
.end method
