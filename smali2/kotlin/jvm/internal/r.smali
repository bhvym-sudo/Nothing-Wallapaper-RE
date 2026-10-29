.class public abstract Lkotlin/jvm/internal/r;
.super Lkotlin/jvm/internal/t;
.source "SourceFile"

# interfaces
.implements LC8/g;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .registers 6

    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/t;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public c()LC8/i$a;
    .registers 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/z;->g()LC8/k;

    move-result-object p0

    check-cast p0, LC8/g;

    invoke-interface {p0}, LC8/i;->c()LC8/i$a;

    const/4 p0, 0x0

    return-object p0
.end method

.method protected computeReflected()LC8/b;
    .registers 1

    invoke-static {p0}, Lkotlin/jvm/internal/F;->e(Lkotlin/jvm/internal/r;)LC8/g;

    move-result-object p0

    return-object p0
.end method

.method public f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    invoke-interface {p0, p1}, LC8/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
