.class public abstract Lkotlin/jvm/internal/k;
.super Lkotlin/jvm/internal/d;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/internal/j;
.implements LC8/e;


# instance fields
.field private final arity:I

.field private final flags:I


# direct methods
.method public constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .registers 15

    and-int/lit8 v0, p6, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    move v7, v1

    :goto_6
    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    goto :goto_f

    :cond_c
    const/4 v0, 0x0

    move v7, v0

    goto :goto_6

    :goto_f
    invoke-direct/range {v2 .. v7}, Lkotlin/jvm/internal/d;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    iput p1, v2, Lkotlin/jvm/internal/k;->arity:I

    shr-int/lit8 p0, p6, 0x1

    iput p0, v2, Lkotlin/jvm/internal/k;->flags:I

    return-void
.end method


# virtual methods
.method protected computeReflected()LC8/b;
    .registers 1

    invoke-static {p0}, Lkotlin/jvm/internal/F;->a(Lkotlin/jvm/internal/k;)LC8/e;

    move-result-object p0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p1, p0, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lkotlin/jvm/internal/k;

    const/4 v2, 0x0

    if-eqz v1, :cond_51

    check-cast p1, Lkotlin/jvm/internal/k;

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/d;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_50

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getSignature()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/d;->getSignature()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_50

    iget v1, p0, Lkotlin/jvm/internal/k;->flags:I

    iget v3, p1, Lkotlin/jvm/internal/k;->flags:I

    if-ne v1, v3, :cond_50

    iget v1, p0, Lkotlin/jvm/internal/k;->arity:I

    iget v3, p1, Lkotlin/jvm/internal/k;->arity:I

    if-ne v1, v3, :cond_50

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getBoundReceiver()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/jvm/internal/d;->getBoundReceiver()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_50

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getOwner()LC8/d;

    move-result-object p0

    invoke-virtual {p1}, Lkotlin/jvm/internal/d;->getOwner()LC8/d;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_50

    return v0

    :cond_50
    return v2

    :cond_51
    instance-of v0, p1, LC8/e;

    if-eqz v0, :cond_5e

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->compute()LC8/b;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_5e
    return v2
.end method

.method public getArity()I
    .registers 1

    iget p0, p0, Lkotlin/jvm/internal/k;->arity:I

    return p0
.end method

.method protected bridge synthetic getReflected()LC8/b;
    .registers 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/k;->getReflected()LC8/e;

    move-result-object p0

    return-object p0
.end method

.method protected getReflected()LC8/e;
    .registers 1

    .line 2
    invoke-super {p0}, Lkotlin/jvm/internal/d;->getReflected()LC8/b;

    move-result-object p0

    check-cast p0, LC8/e;

    return-object p0
.end method

.method public hashCode()I
    .registers 3

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getOwner()LC8/d;

    move-result-object v0

    if-nez v0, :cond_8

    const/4 v0, 0x0

    goto :goto_12

    :cond_8
    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getOwner()LC8/d;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    :goto_12
    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getSignature()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public isExternal()Z
    .registers 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/k;->getReflected()LC8/e;

    move-result-object p0

    invoke-interface {p0}, LC8/e;->isExternal()Z

    move-result p0

    return p0
.end method

.method public isInfix()Z
    .registers 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/k;->getReflected()LC8/e;

    move-result-object p0

    invoke-interface {p0}, LC8/e;->isInfix()Z

    move-result p0

    return p0
.end method

.method public isInline()Z
    .registers 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/k;->getReflected()LC8/e;

    move-result-object p0

    invoke-interface {p0}, LC8/e;->isInline()Z

    move-result p0

    return p0
.end method

.method public isOperator()Z
    .registers 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/k;->getReflected()LC8/e;

    move-result-object p0

    invoke-interface {p0}, LC8/e;->isOperator()Z

    move-result p0

    return p0
.end method

.method public isSuspend()Z
    .registers 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/k;->getReflected()LC8/e;

    move-result-object p0

    invoke-interface {p0}, LC8/e;->isSuspend()Z

    move-result p0

    return p0
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->compute()LC8/b;

    move-result-object v0

    if-eq v0, p0, :cond_b

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_b
    const-string v0, "<init>"

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    const-string p0, "constructor (Kotlin reflection is not available)"

    return-object p0

    :cond_1a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "function "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " (Kotlin reflection is not available)"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
