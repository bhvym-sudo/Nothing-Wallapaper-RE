.class final LW8/b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "f"
.end annotation


# instance fields
.field private final q:Le9/k;

.field private r:Z

.field final synthetic s:LW8/b;


# direct methods
.method public constructor <init>(LW8/b;)V
    .registers 3

    iput-object p1, p0, LW8/b$f;->s:LW8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le9/k;

    invoke-static {p1}, LW8/b;->l(LW8/b;)Le9/f;

    move-result-object p1

    invoke-interface {p1}, Le9/z;->e()Le9/C;

    move-result-object p1

    invoke-direct {v0, p1}, Le9/k;-><init>(Le9/C;)V

    iput-object v0, p0, LW8/b$f;->q:Le9/k;

    return-void
.end method


# virtual methods
.method public Z(Le9/e;J)V
    .registers 11

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LW8/b$f;->r:Z

    if-nez v0, :cond_1d

    invoke-virtual {p1}, Le9/e;->X0()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, LQ8/d;->l(JJJ)V

    iget-object p0, p0, LW8/b$f;->s:LW8/b;

    invoke-static {p0}, LW8/b;->l(LW8/b;)Le9/f;

    move-result-object p0

    invoke-interface {p0, p1, v5, v6}, Le9/z;->Z(Le9/e;J)V

    return-void

    :cond_1d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public close()V
    .registers 3

    iget-boolean v0, p0, LW8/b$f;->r:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, p0, LW8/b$f;->r:Z

    iget-object v0, p0, LW8/b$f;->s:LW8/b;

    iget-object v1, p0, LW8/b$f;->q:Le9/k;

    invoke-static {v0, v1}, LW8/b;->i(LW8/b;Le9/k;)V

    iget-object p0, p0, LW8/b$f;->s:LW8/b;

    const/4 v0, 0x3

    invoke-static {p0, v0}, LW8/b;->p(LW8/b;I)V

    return-void
.end method

.method public e()Le9/C;
    .registers 1

    iget-object p0, p0, LW8/b$f;->q:Le9/k;

    return-object p0
.end method

.method public flush()V
    .registers 2

    iget-boolean v0, p0, LW8/b$f;->r:Z

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-object p0, p0, LW8/b$f;->s:LW8/b;

    invoke-static {p0}, LW8/b;->l(LW8/b;)Le9/f;

    move-result-object p0

    invoke-interface {p0}, Le9/f;->flush()V

    return-void
.end method
