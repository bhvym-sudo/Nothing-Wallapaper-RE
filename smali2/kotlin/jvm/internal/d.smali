.class public abstract Lkotlin/jvm/internal/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC8/b;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/jvm/internal/d$a;
    }
.end annotation


# static fields
.field public static final NO_RECEIVER:Ljava/lang/Object;


# instance fields
.field private final isTopLevel:Z

.field private final name:Ljava/lang/String;

.field private final owner:Ljava/lang/Class;

.field protected final receiver:Ljava/lang/Object;

.field private transient reflected:LC8/b;

.field private final signature:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    invoke-static {}, Lkotlin/jvm/internal/d$a;->a()Lkotlin/jvm/internal/d$a;

    move-result-object v0

    sput-object v0, Lkotlin/jvm/internal/d;->NO_RECEIVER:Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    iput-object p2, p0, Lkotlin/jvm/internal/d;->owner:Ljava/lang/Class;

    iput-object p3, p0, Lkotlin/jvm/internal/d;->name:Ljava/lang/String;

    iput-object p4, p0, Lkotlin/jvm/internal/d;->signature:Ljava/lang/String;

    iput-boolean p5, p0, Lkotlin/jvm/internal/d;->isTopLevel:Z

    return-void
.end method


# virtual methods
.method public varargs call([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getReflected()LC8/b;

    move-result-object p0

    invoke-interface {p0, p1}, LC8/b;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public callBy(Ljava/util/Map;)Ljava/lang/Object;
    .registers 2

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getReflected()LC8/b;

    move-result-object p0

    invoke-interface {p0, p1}, LC8/b;->callBy(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public compute()LC8/b;
    .registers 2

    iget-object v0, p0, Lkotlin/jvm/internal/d;->reflected:LC8/b;

    if-nez v0, :cond_a

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->computeReflected()LC8/b;

    move-result-object v0

    iput-object v0, p0, Lkotlin/jvm/internal/d;->reflected:LC8/b;

    :cond_a
    return-object v0
.end method

.method protected abstract computeReflected()LC8/b;
.end method

.method public getAnnotations()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getReflected()LC8/b;

    move-result-object p0

    invoke-interface {p0}, LC8/a;->getAnnotations()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public getBoundReceiver()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, Lkotlin/jvm/internal/d;->receiver:Ljava/lang/Object;

    return-object p0
.end method

.method public getName()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lkotlin/jvm/internal/d;->name:Ljava/lang/String;

    return-object p0
.end method

.method public getOwner()LC8/d;
    .registers 2

    iget-object v0, p0, Lkotlin/jvm/internal/d;->owner:Ljava/lang/Class;

    if-nez v0, :cond_6

    const/4 p0, 0x0

    return-object p0

    :cond_6
    iget-boolean p0, p0, Lkotlin/jvm/internal/d;->isTopLevel:Z

    if-eqz p0, :cond_f

    invoke-static {v0}, Lkotlin/jvm/internal/F;->c(Ljava/lang/Class;)LC8/d;

    move-result-object p0

    return-object p0

    :cond_f
    invoke-static {v0}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object p0

    return-object p0
.end method

.method public getParameters()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getReflected()LC8/b;

    move-result-object p0

    invoke-interface {p0}, LC8/b;->getParameters()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method protected getReflected()LC8/b;
    .registers 2

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->compute()LC8/b;

    move-result-object v0

    if-eq v0, p0, :cond_7

    return-object v0

    :cond_7
    new-instance p0, Lu8/b;

    invoke-direct {p0}, Lu8/b;-><init>()V

    throw p0
.end method

.method public getReturnType()LC8/l;
    .registers 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getReflected()LC8/b;

    move-result-object p0

    invoke-interface {p0}, LC8/b;->getReturnType()LC8/l;

    const/4 p0, 0x0

    return-object p0
.end method

.method public getSignature()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lkotlin/jvm/internal/d;->signature:Ljava/lang/String;

    return-object p0
.end method

.method public getTypeParameters()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getReflected()LC8/b;

    move-result-object p0

    invoke-interface {p0}, LC8/b;->getTypeParameters()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public getVisibility()LC8/m;
    .registers 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getReflected()LC8/b;

    move-result-object p0

    invoke-interface {p0}, LC8/b;->getVisibility()LC8/m;

    move-result-object p0

    return-object p0
.end method

.method public isAbstract()Z
    .registers 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getReflected()LC8/b;

    move-result-object p0

    invoke-interface {p0}, LC8/b;->isAbstract()Z

    move-result p0

    return p0
.end method

.method public isFinal()Z
    .registers 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getReflected()LC8/b;

    move-result-object p0

    invoke-interface {p0}, LC8/b;->isFinal()Z

    move-result p0

    return p0
.end method

.method public isOpen()Z
    .registers 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/d;->getReflected()LC8/b;

    move-result-object p0

    invoke-interface {p0}, LC8/b;->isOpen()Z

    move-result p0

    return p0
.end method
