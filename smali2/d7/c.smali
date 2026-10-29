.class public final Ld7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld7/c;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Ld7/c;

    invoke-direct {v0}, Ld7/c;-><init>()V

    sput-object v0, Ld7/c;->a:Ld7/c;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LF8/x0;)V
    .registers 1

    invoke-static {p0}, Ld7/c;->c(LF8/x0;)V

    return-void
.end method

.method public static final b(Landroid/view/View;Landroidx/lifecycle/x;Ljava/util/List;Lv8/a;)LF8/d0;
    .registers 13

    const-string v0, "container"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "availableSections"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "highPriorityClickEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a03df

    invoke-virtual {p0, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p0

    const-string v0, "requireViewById(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/widget/FrameLayout;

    sget-object v0, Ld7/c;->a:Ld7/c;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p0, p2, p3}, Ld7/c;->d(Landroid/content/Context;Landroid/view/View;Ljava/util/List;Lv8/a;)V

    invoke-static {p1}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v3

    new-instance v6, Ld7/c$a;

    const/4 p2, 0x0

    invoke-direct {v6, p1, p0, p2}, Ld7/c$a;-><init>(Landroidx/lifecycle/x;Landroid/widget/FrameLayout;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p0

    new-instance p1, Ld7/a;

    invoke-direct {p1, p0}, Ld7/a;-><init>(LF8/x0;)V

    return-object p1
.end method

.method private static final c(LF8/x0;)V
    .registers 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method private final d(Landroid/content/Context;Landroid/view/View;Ljava/util/List;Lv8/a;)V
    .registers 7

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

    if-eqz p3, :cond_45

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lg3/f;

    invoke-interface {p3, p2, p1}, Lg3/f;->c(Landroid/view/View;Landroid/content/Context;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3b

    invoke-virtual {v0, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_3b
    instance-of v0, p3, Lr7/c;

    if-eqz v0, :cond_26

    check-cast p3, Lr7/c;

    invoke-virtual {p3, p2, p4}, Lr7/c;->L(Landroid/view/View;Lv8/a;)V

    goto :goto_26

    :cond_45
    return-void
.end method
