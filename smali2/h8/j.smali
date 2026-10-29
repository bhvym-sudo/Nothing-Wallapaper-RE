.class abstract Lh8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh8/j$a;
    }
.end annotation


# direct methods
.method public static a(Lh8/l;Lv8/a;)Lh8/h;
    .registers 4

    const-string v0, "mode"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lh8/j$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-eq p0, v0, :cond_2d

    if-eq p0, v1, :cond_27

    const/4 v0, 0x3

    if-ne p0, v0, :cond_21

    new-instance p0, Lh8/B;

    invoke-direct {p0, p1}, Lh8/B;-><init>(Lv8/a;)V

    return-object p0

    :cond_21
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0

    :cond_27
    new-instance p0, Lh8/s;

    invoke-direct {p0, p1}, Lh8/s;-><init>(Lv8/a;)V

    return-object p0

    :cond_2d
    new-instance p0, Lh8/t;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, v1, v0}, Lh8/t;-><init>(Lv8/a;Ljava/lang/Object;ILkotlin/jvm/internal/h;)V

    return-object p0
.end method

.method public static b(Lv8/a;)Lh8/h;
    .registers 4

    const-string v0, "initializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh8/t;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Lh8/t;-><init>(Lv8/a;Ljava/lang/Object;ILkotlin/jvm/internal/h;)V

    return-object v0
.end method
