.class final LB8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB8/b;


# instance fields
.field private final q:F

.field private final r:F


# direct methods
.method public constructor <init>(FF)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LB8/a;->q:F

    iput p2, p0, LB8/a;->r:F

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Comparable;
    .registers 1

    invoke-virtual {p0}, LB8/a;->e()Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Comparable;)Z
    .registers 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, LB8/a;->c(F)Z

    move-result p0

    return p0
.end method

.method public c(F)Z
    .registers 3

    iget v0, p0, LB8/a;->q:F

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_e

    iget p0, p0, LB8/a;->r:F

    cmpg-float p0, p1, p0

    if-gtz p0, :cond_e

    const/4 p0, 0x1

    return p0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method public d()Ljava/lang/Float;
    .registers 1

    iget p0, p0, LB8/a;->r:F

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public e()Ljava/lang/Float;
    .registers 1

    iget p0, p0, LB8/a;->q:F

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 4

    instance-of v0, p1, LB8/a;

    if-eqz v0, :cond_27

    invoke-virtual {p0}, LB8/a;->g()Z

    move-result v0

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, LB8/a;

    invoke-virtual {v0}, LB8/a;->g()Z

    move-result v0

    if-nez v0, :cond_25

    :cond_13
    iget v0, p0, LB8/a;->q:F

    check-cast p1, LB8/a;

    iget v1, p1, LB8/a;->q:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_27

    iget p0, p0, LB8/a;->r:F

    iget p1, p1, LB8/a;->r:F

    cmpg-float p0, p0, p1

    if-nez p0, :cond_27

    :cond_25
    const/4 p0, 0x1

    return p0

    :cond_27
    const/4 p0, 0x0

    return p0
.end method

.method public bridge synthetic f()Ljava/lang/Comparable;
    .registers 1

    invoke-virtual {p0}, LB8/a;->d()Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public g()Z
    .registers 2

    iget v0, p0, LB8/a;->q:F

    iget p0, p0, LB8/a;->r:F

    cmpg-float p0, v0, p0

    if-lez p0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public hashCode()I
    .registers 2

    invoke-virtual {p0}, LB8/a;->g()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 p0, -0x1

    return p0

    :cond_8
    iget v0, p0, LB8/a;->q:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget p0, p0, LB8/a;->r:F

    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, LB8/a;->q:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LB8/a;->r:F

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
