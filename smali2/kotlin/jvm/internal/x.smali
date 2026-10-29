.class public abstract Lkotlin/jvm/internal/x;
.super Lkotlin/jvm/internal/z;
.source "SourceFile"

# interfaces
.implements LC8/j;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .registers 11

    sget-object v1, Lkotlin/jvm/internal/d;->NO_RECEIVER:Ljava/lang/Object;

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public c()LC8/j$a;
    .registers 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/z;->g()LC8/k;

    move-result-object p0

    check-cast p0, LC8/j;

    invoke-interface {p0}, LC8/j;->c()LC8/j$a;

    const/4 p0, 0x0

    return-object p0
.end method

.method protected computeReflected()LC8/b;
    .registers 1

    invoke-static {p0}, Lkotlin/jvm/internal/F;->g(Lkotlin/jvm/internal/x;)LC8/j;

    move-result-object p0

    return-object p0
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-interface {p0, p1, p2}, LC8/j;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
