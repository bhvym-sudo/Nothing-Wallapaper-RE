.class abstract LW8/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/B;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "a"
.end annotation


# instance fields
.field private final q:Le9/k;

.field private r:Z

.field final synthetic s:LW8/b;


# direct methods
.method public constructor <init>(LW8/b;)V
    .registers 3

    iput-object p1, p0, LW8/b$a;->s:LW8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Le9/k;

    invoke-static {p1}, LW8/b;->m(LW8/b;)Le9/g;

    move-result-object p1

    invoke-interface {p1}, Le9/B;->e()Le9/C;

    move-result-object p1

    invoke-direct {v0, p1}, Le9/k;-><init>(Le9/C;)V

    iput-object v0, p0, LW8/b$a;->q:Le9/k;

    return-void
.end method


# virtual methods
.method public final a()V
    .registers 4

    iget-object v0, p0, LW8/b$a;->s:LW8/b;

    invoke-static {v0}, LW8/b;->n(LW8/b;)I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_a

    return-void

    :cond_a
    iget-object v0, p0, LW8/b$a;->s:LW8/b;

    invoke-static {v0}, LW8/b;->n(LW8/b;)I

    move-result v0

    const/4 v2, 0x5

    if-ne v0, v2, :cond_20

    iget-object v0, p0, LW8/b$a;->s:LW8/b;

    iget-object v2, p0, LW8/b$a;->q:Le9/k;

    invoke-static {v0, v2}, LW8/b;->i(LW8/b;Le9/k;)V

    iget-object p0, p0, LW8/b$a;->s:LW8/b;

    invoke-static {p0, v1}, LW8/b;->p(LW8/b;I)V

    return-void

    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, LW8/b$a;->s:LW8/b;

    invoke-static {p0}, LW8/b;->n(LW8/b;)I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final b(Z)V
    .registers 2

    iput-boolean p1, p0, LW8/b$a;->r:Z

    return-void
.end method

.method public e()Le9/C;
    .registers 1

    iget-object p0, p0, LW8/b$a;->q:Le9/k;

    return-object p0
.end method

.method public e1(Le9/e;J)J
    .registers 5

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_5
    iget-object v0, p0, LW8/b$a;->s:LW8/b;

    invoke-static {v0}, LW8/b;->m(LW8/b;)Le9/g;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Le9/B;->e1(Le9/e;J)J

    move-result-wide p0
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_f} :catch_10

    return-wide p0

    :catch_10
    move-exception p1

    iget-object p2, p0, LW8/b$a;->s:LW8/b;

    invoke-virtual {p2}, LW8/b;->f()LU8/f;

    move-result-object p2

    invoke-virtual {p2}, LU8/f;->z()V

    invoke-virtual {p0}, LW8/b$a;->a()V

    throw p1
.end method

.method protected final y()Z
    .registers 1

    iget-boolean p0, p0, LW8/b$a;->r:Z

    return p0
.end method
