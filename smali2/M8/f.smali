.class public abstract LM8/f;
.super LF8/o0;
.source "SourceFile"


# instance fields
.field private final t:I

.field private final u:I

.field private final v:J

.field private final w:Ljava/lang/String;

.field private x:LM8/a;


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .registers 6

    invoke-direct {p0}, LF8/o0;-><init>()V

    iput p1, p0, LM8/f;->t:I

    iput p2, p0, LM8/f;->u:I

    iput-wide p3, p0, LM8/f;->v:J

    iput-object p5, p0, LM8/f;->w:Ljava/lang/String;

    invoke-direct {p0}, LM8/f;->l1()LM8/a;

    move-result-object p1

    iput-object p1, p0, LM8/f;->x:LM8/a;

    return-void
.end method

.method private final l1()LM8/a;
    .registers 7

    new-instance v0, LM8/a;

    iget v1, p0, LM8/f;->t:I

    iget v2, p0, LM8/f;->u:I

    iget-wide v3, p0, LM8/f;->v:J

    iget-object v5, p0, LM8/f;->w:Ljava/lang/String;

    invoke-direct/range {v0 .. v5}, LM8/a;-><init>(IIJLjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public g1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 9

    iget-object v0, p0, LM8/f;->x:LM8/a;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, LM8/a;->B(LM8/a;Ljava/lang/Runnable;ZZILjava/lang/Object;)V

    return-void
.end method

.method public h1(Lm8/i;Ljava/lang/Runnable;)V
    .registers 9

    iget-object v0, p0, LM8/f;->x:LM8/a;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object v1, p2

    invoke-static/range {v0 .. v5}, LM8/a;->B(LM8/a;Ljava/lang/Runnable;ZZILjava/lang/Object;)V

    return-void
.end method

.method public final m1(Ljava/lang/Runnable;ZZ)V
    .registers 4

    iget-object p0, p0, LM8/f;->x:LM8/a;

    invoke-virtual {p0, p1, p2, p3}, LM8/a;->z(Ljava/lang/Runnable;ZZ)V

    return-void
.end method
