.class public final Ld7/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld7/m;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Ld7/m;

    invoke-direct {v0}, Ld7/m;-><init>()V

    sput-object v0, Ld7/m;->a:Ld7/m;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/view/ViewGroup;Ljava/util/List;)V
    .registers 5

    const-string v0, "container"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenOptionsSections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ld7/m;->a:Ld7/m;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p0, p1}, Ld7/m;->b(Landroid/content/Context;Landroid/view/ViewGroup;Ljava/util/List;)V

    return-void
.end method

.method private final b(Landroid/content/Context;Landroid/view/ViewGroup;Ljava/util/List;)V
    .registers 6

    check-cast p3, Ljava/lang/Iterable;

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_b
    :goto_b
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lg3/f;

    invoke-interface {v1, p1}, Lg3/f;->e(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_22
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_26
    :goto_26
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lg3/f;

    invoke-interface {p3, p2, p1}, Lg3/f;->c(Landroid/view/View;Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_26

    invoke-virtual {v0, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_26

    :cond_3c
    return-void
.end method
