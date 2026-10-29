.class public abstract Lkotlin/jvm/internal/v;
.super Lkotlin/jvm/internal/z;
.source "SourceFile"

# interfaces
.implements LC8/h;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .registers 6

    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected computeReflected()LC8/b;
    .registers 1

    invoke-static {p0}, Lkotlin/jvm/internal/F;->f(Lkotlin/jvm/internal/v;)LC8/h;

    move-result-object p0

    return-object p0
.end method

.method public invoke()Ljava/lang/Object;
    .registers 1

    invoke-interface {p0}, LC8/h;->get()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
