.class LB8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB8/c;


# instance fields
.field private final q:Ljava/lang/Comparable;

.field private final r:Ljava/lang/Comparable;


# direct methods
.method public constructor <init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V
    .registers 4

    const-string v0, "start"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endInclusive"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB8/d;->q:Ljava/lang/Comparable;

    iput-object p2, p0, LB8/d;->r:Ljava/lang/Comparable;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Comparable;
    .registers 1

    iget-object p0, p0, LB8/d;->q:Ljava/lang/Comparable;

    return-object p0
.end method

.method public b(Ljava/lang/Comparable;)Z
    .registers 2

    invoke-static {p0, p1}, LB8/c$a;->a(LB8/c;Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public c()Z
    .registers 1

    invoke-static {p0}, LB8/c$a;->b(LB8/c;)Z

    move-result p0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 4

    instance-of v0, p1, LB8/d;

    if-eqz v0, :cond_33

    invoke-virtual {p0}, LB8/d;->c()Z

    move-result v0

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, LB8/d;

    invoke-virtual {v0}, LB8/d;->c()Z

    move-result v0

    if-nez v0, :cond_31

    :cond_13
    invoke-virtual {p0}, LB8/d;->a()Ljava/lang/Comparable;

    move-result-object v0

    check-cast p1, LB8/d;

    invoke-virtual {p1}, LB8/d;->a()Ljava/lang/Comparable;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_33

    invoke-virtual {p0}, LB8/d;->f()Ljava/lang/Comparable;

    move-result-object p0

    invoke-virtual {p1}, LB8/d;->f()Ljava/lang/Comparable;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_33

    :cond_31
    const/4 p0, 0x1

    return p0

    :cond_33
    const/4 p0, 0x0

    return p0
.end method

.method public f()Ljava/lang/Comparable;
    .registers 1

    iget-object p0, p0, LB8/d;->r:Ljava/lang/Comparable;

    return-object p0
.end method

.method public hashCode()I
    .registers 2

    invoke-virtual {p0}, LB8/d;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 p0, -0x1

    return p0

    :cond_8
    invoke-virtual {p0}, LB8/d;->a()Ljava/lang/Comparable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LB8/d;->f()Ljava/lang/Comparable;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LB8/d;->a()Ljava/lang/Comparable;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LB8/d;->f()Ljava/lang/Comparable;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
