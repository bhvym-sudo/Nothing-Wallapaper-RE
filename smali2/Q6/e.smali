.class public final LQ6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ6/e;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LQ6/e;

    invoke-direct {v0}, LQ6/e;-><init>()V

    sput-object v0, LQ6/e;->a:LQ6/e;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lv8/l;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, LQ6/e;->e(Lv8/l;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic b(LQ6/e;Ljava/util/List;Landroid/view/ViewGroup;Lv8/l;)V
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LQ6/e;->d(Ljava/util/List;Landroid/view/ViewGroup;Lv8/l;)V

    return-void
.end method

.method public static final c(Landroid/content/Context;Landroid/view/ViewGroup;Lb2/c;Landroidx/lifecycle/x;Lv8/l;)Landroid/widget/LinearLayout;
    .registers 16

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationOnClick"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0060

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.widget.LinearLayout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p1

    check-cast v4, Landroid/widget/LinearLayout;

    const p1, 0x7f0a034f

    invoke-virtual {v4, p1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const v0, 0x7f130205

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    sget-object p1, LQ6/e;->a:LQ6/e;

    invoke-direct {p1, p0, v4}, LQ6/e;->f(Landroid/content/Context;Landroid/view/View;)V

    invoke-static {p3}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object p0

    new-instance v1, LQ6/e$a;

    const/4 v6, 0x0

    move-object v3, p2

    move-object v2, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, LQ6/e$a;-><init>(Landroidx/lifecycle/x;Lb2/c;Landroid/widget/LinearLayout;Lv8/l;Lm8/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object v5, p0

    move-object v8, v1

    invoke-static/range {v5 .. v10}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-object v4
.end method

.method private final d(Ljava/util/List;Landroid/view/ViewGroup;Lv8/l;)V
    .registers 12

    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    const/16 v0, 0x20

    const/4 v1, 0x0

    if-ne p0, v0, :cond_13

    const/4 p0, 0x1

    goto :goto_14

    :cond_13
    move p0, v1

    :goto_14
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_39

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LB3/a;

    invoke-virtual {v3}, LB3/a;->g()LI8/O;

    move-result-object v3

    invoke-interface {v3}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1b

    goto :goto_3a

    :cond_39
    const/4 v2, 0x0

    :goto_3a
    check-cast v2, LB3/a;

    if-nez v2, :cond_45

    invoke-static {p1, v1}, Li8/s;->V(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, LB3/a;

    :cond_45
    if-eqz v2, :cond_9b

    invoke-virtual {v2}, LB3/a;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb2/a;

    if-eqz p1, :cond_9b

    const v0, 0x7f0a0353

    invoke-virtual {p2, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v3, "requireViewById(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x7f0a0350

    invoke-virtual {p2, v4}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, LB3/a;->e()Lq3/a;

    move-result-object v2

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const-string v7, "getContext(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Lq3/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v6, "Bauhaus"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v6, 0x8

    if-eqz v2, :cond_87

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_9b

    :cond_87
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v5, v1}, Landroid/view/View;->setVisibility(I)V

    sget-object v0, LY1/a;->a:LY1/a;

    invoke-virtual {p2, v4}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/android/customization/picker/color/ui/view/ColorOptionIconView;

    invoke-virtual {v0, v1, p1, p0}, LY1/a;->a(Lcom/android/customization/picker/color/ui/view/ColorOptionIconView;Lb2/a;Z)V

    :cond_9b
    :goto_9b
    new-instance p0, LQ6/d;

    invoke-direct {p0, p3}, LQ6/d;-><init>(Lv8/l;)V

    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final e(Lv8/l;Landroid/view/View;)V
    .registers 2

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final f(Landroid/content/Context;Landroid/view/View;)V
    .registers 13

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const p1, 0x7f0603ff

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v2

    new-instance v1, Lb2/a;

    move v3, v2

    move v4, v2

    move v5, v2

    move v6, v2

    move v7, v2

    move v8, v2

    move v9, v2

    invoke-direct/range {v1 .. v9}, Lb2/a;-><init>(IIIIIIII)V

    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    const/16 p1, 0x20

    if-ne p0, p1, :cond_2a

    const/4 p0, 0x1

    goto :goto_2b

    :cond_2a
    const/4 p0, 0x0

    :goto_2b
    sget-object p1, LY1/a;->a:LY1/a;

    const v0, 0x7f0a0350

    invoke-virtual {p2, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p2

    const-string v0, "requireViewById(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/android/customization/picker/color/ui/view/ColorOptionIconView;

    invoke-virtual {p1, p2, v1, p0}, LY1/a;->a(Lcom/android/customization/picker/color/ui/view/ColorOptionIconView;Lb2/a;Z)V

    return-void
.end method
