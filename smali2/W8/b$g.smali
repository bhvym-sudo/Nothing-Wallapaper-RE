.class final LW8/b$g;
.super LW8/b$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "g"
.end annotation


# instance fields
.field private t:Z

.field final synthetic u:LW8/b;


# direct methods
.method public constructor <init>(LW8/b;)V
    .registers 2

    iput-object p1, p0, LW8/b$g;->u:LW8/b;

    invoke-direct {p0, p1}, LW8/b$a;-><init>(LW8/b;)V

    return-void
.end method


# virtual methods
.method public close()V
    .registers 2

    invoke-virtual {p0}, LW8/b$a;->y()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-boolean v0, p0, LW8/b$g;->t:Z

    if-nez v0, :cond_e

    invoke-virtual {p0}, LW8/b$a;->a()V

    :cond_e
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LW8/b$a;->b(Z)V

    return-void
.end method

.method public e1(Le9/e;J)J
    .registers 7

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_30

    invoke-virtual {p0}, LW8/b$a;->y()Z

    move-result v0

    if-nez v0, :cond_28

    iget-boolean v0, p0, LW8/b$g;->t:Z

    const-wide/16 v1, -0x1

    if-eqz v0, :cond_18

    return-wide v1

    :cond_18
    invoke-super {p0, p1, p2, p3}, LW8/b$a;->e1(Le9/e;J)J

    move-result-wide p1

    cmp-long p3, p1, v1

    if-nez p3, :cond_27

    const/4 p1, 0x1

    iput-boolean p1, p0, LW8/b$g;->t:Z

    invoke-virtual {p0}, LW8/b$a;->a()V

    return-wide v1

    :cond_27
    return-wide p1

    :cond_28
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "closed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_30
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "byteCount < 0: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
