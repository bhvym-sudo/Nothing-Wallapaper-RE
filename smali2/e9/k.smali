.class public Le9/k;
.super Le9/C;
.source "SourceFile"


# instance fields
.field private f:Le9/C;


# direct methods
.method public constructor <init>(Le9/C;)V
    .registers 3

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Le9/C;-><init>()V

    iput-object p1, p0, Le9/k;->f:Le9/C;

    return-void
.end method


# virtual methods
.method public a()Le9/C;
    .registers 1

    iget-object p0, p0, Le9/k;->f:Le9/C;

    invoke-virtual {p0}, Le9/C;->a()Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public b()Le9/C;
    .registers 1

    iget-object p0, p0, Le9/k;->f:Le9/C;

    invoke-virtual {p0}, Le9/C;->b()Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public c()J
    .registers 3

    iget-object p0, p0, Le9/k;->f:Le9/C;

    invoke-virtual {p0}, Le9/C;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public d(J)Le9/C;
    .registers 3

    iget-object p0, p0, Le9/k;->f:Le9/C;

    invoke-virtual {p0, p1, p2}, Le9/C;->d(J)Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public e()Z
    .registers 1

    iget-object p0, p0, Le9/k;->f:Le9/C;

    invoke-virtual {p0}, Le9/C;->e()Z

    move-result p0

    return p0
.end method

.method public f()V
    .registers 1

    iget-object p0, p0, Le9/k;->f:Le9/C;

    invoke-virtual {p0}, Le9/C;->f()V

    return-void
.end method

.method public g(JLjava/util/concurrent/TimeUnit;)Le9/C;
    .registers 5

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Le9/k;->f:Le9/C;

    invoke-virtual {p0, p1, p2, p3}, Le9/C;->g(JLjava/util/concurrent/TimeUnit;)Le9/C;

    move-result-object p0

    return-object p0
.end method

.method public final i()Le9/C;
    .registers 1

    iget-object p0, p0, Le9/k;->f:Le9/C;

    return-object p0
.end method

.method public final j(Le9/C;)Le9/k;
    .registers 3

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le9/k;->f:Le9/C;

    return-object p0
.end method
