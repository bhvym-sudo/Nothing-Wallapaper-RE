.class public abstract Lkotlin/jvm/internal/p;
.super Lkotlin/jvm/internal/t;
.source "SourceFile"

# interfaces
.implements LC8/f;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .registers 6

    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/t;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected computeReflected()LC8/b;
    .registers 1

    invoke-static {p0}, Lkotlin/jvm/internal/F;->d(Lkotlin/jvm/internal/p;)LC8/f;

    move-result-object p0

    return-object p0
.end method

.method public invoke()Ljava/lang/Object;
    .registers 1

    invoke-interface {p0}, LC8/h;->get()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
