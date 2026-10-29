.class public final LK8/v;
.super LF8/I;
.source "SourceFile"

# interfaces
.implements LF8/V;


# instance fields
.field private final synthetic s:LF8/V;

.field private final t:LF8/I;

.field private final u:Ljava/lang/String;


# direct methods
.method public constructor <init>(LF8/I;Ljava/lang/String;)V
    .registers 4

    invoke-direct {p0}, LF8/I;-><init>()V

    instance-of v0, p1, LF8/V;

    if-eqz v0, :cond_b

    move-object v0, p1

    check-cast v0, LF8/V;

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    if-nez v0, :cond_12

    invoke-static {}, LF8/S;->a()LF8/V;

    move-result-object v0

    :cond_12
    iput-object v0, p0, LK8/v;->s:LF8/V;

    iput-object p1, p0, LK8/v;->t:LF8/I;

    iput-object p2, p0, LK8/v;->u:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public T0(JLF8/l;)V
    .registers 4

    iget-object p0, p0, LK8/v;->s:LF8/V;

    invoke-interface {p0, p1, p2, p3}, LF8/V;->T0(JLF8/l;)V

    return-void
.end method

.method public W0(JLjava/lang/Runnable;Lm8/i;)LF8/d0;
    .registers 5

    iget-object p0, p0, LK8/v;->s:LF8/V;

    invoke-interface {p0, p1, p2, p3, p4}, LF8/V;->W0(JLjava/lang/Runnable;Lm8/i;)LF8/d0;

    move-result-object p0

    return-object p0
.end method

.method public g1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 3

    iget-object p0, p0, LK8/v;->t:LF8/I;

    invoke-virtual {p0, p1, p2}, LF8/I;->g1(Lm8/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public h1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 3

    iget-object p0, p0, LK8/v;->t:LF8/I;

    invoke-virtual {p0, p1, p2}, LF8/I;->h1(Lm8/i;Ljava/lang/Runnable;)V

    return-void
.end method

.method public i1(Lm8/i;)Z
    .registers 2

    iget-object p0, p0, LK8/v;->t:LF8/I;

    invoke-virtual {p0, p1}, LF8/I;->i1(Lm8/i;)Z

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LK8/v;->u:Ljava/lang/String;

    return-object p0
.end method
