.class abstract LI8/c;
.super LJ8/e;
.source "SourceFile"


# instance fields
.field private final t:Lv8/p;


# direct methods
.method public constructor <init>(Lv8/p;Lm8/i;ILH8/a;)V
    .registers 5

    invoke-direct {p0, p2, p3, p4}, LJ8/e;-><init>(Lm8/i;ILH8/a;)V

    iput-object p1, p0, LI8/c;->t:Lv8/p;

    return-void
.end method

.method static synthetic q(LI8/c;LH8/t;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LI8/c;->t:Lv8/p;

    invoke-interface {p0, p1, p2}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_d

    return-object p0

    :cond_d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method protected j(LH8/t;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, LI8/c;->q(LI8/c;LH8/t;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "block["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LI8/c;->t:Lv8/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, LJ8/e;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
