.class public final LQ6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQ6/c;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LQ6/c;

    invoke-direct {v0}, LQ6/c;-><init>()V

    sput-object v0, LQ6/c;->a:LQ6/c;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/view/View;Landroid/view/View;Lb2/a;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, LQ6/c;->c(Landroid/view/View;Landroid/view/View;Lb2/a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroid/view/View;Lb2/c;Landroidx/lifecycle/x;)LY1/c$a;
    .registers 19

    move-object/from16 v2, p0

    move-object/from16 v1, p2

    const-string v0, "view"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    move-object/from16 v3, p1

    invoke-static {v3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a013f

    invoke-virtual {v2, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v4, "requireViewById(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v0

    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    const v0, 0x7f0a0138

    invoke-virtual {v2, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v0

    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    new-instance v7, LP6/e;

    invoke-direct {v7}, LP6/e;-><init>()V

    invoke-virtual {v6, v7}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const/4 v8, 0x0

    invoke-direct {v0, v4, v8, v8}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v0, Lp6/a;

    const/16 v4, 0x1a

    invoke-direct {v0, v4}, Lp6/a;-><init>(I)V

    invoke-virtual {v6, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    new-instance v4, LK7/b;

    new-instance v9, LQ6/a;

    invoke-direct {v9, v2}, LQ6/a;-><init>(Landroid/view/View;)V

    const v10, 0x7f0d011b

    invoke-direct {v4, v10, v1, v9}, LK7/b;-><init>(ILandroidx/lifecycle/x;Lv8/p;)V

    invoke-virtual {v5, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    new-instance v9, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-direct {v9, v10, v8, v8}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v5, v9}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v8, Lp6/a;

    const/16 v9, 0x2a

    invoke-direct {v8, v9}, Lp6/a;-><init>(I)V

    invoke-virtual {v5, v8}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    invoke-static {v1}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v10

    new-instance v13, LQ6/c$a;

    const/4 v9, 0x0

    move-object v8, v0

    move-object v0, v13

    invoke-direct/range {v0 .. v9}, LQ6/c$a;-><init>(Landroidx/lifecycle/x;Landroid/view/View;Lb2/c;LK7/b;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;LP6/e;Lp6/a;Lm8/e;)V

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v10 .. v15}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    sget-object v0, LY1/c;->a:LY1/c;

    invoke-virtual {v0, v5}, LY1/c;->g(Landroidx/recyclerview/widget/RecyclerView;)LY1/c$a;

    move-result-object v0

    return-object v0
.end method

.method private static final c(Landroid/view/View;Landroid/view/View;Lb2/a;)Lh8/A;
    .registers 4

    const-string v0, "foregroundView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/android/customization/picker/color/ui/view/ColorOptionIconView;

    if-eqz v0, :cond_11

    check-cast p1, Lcom/android/customization/picker/color/ui/view/ColorOptionIconView;

    goto :goto_12

    :cond_11
    const/4 p1, 0x0

    :goto_12
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p0, p0, 0x30

    const/16 v0, 0x20

    if-ne p0, v0, :cond_24

    const/4 p0, 0x1

    goto :goto_25

    :cond_24
    const/4 p0, 0x0

    :goto_25
    if-eqz p1, :cond_2c

    sget-object v0, LY1/a;->a:LY1/a;

    invoke-virtual {v0, p1, p2, p0}, LY1/a;->a(Lcom/android/customization/picker/color/ui/view/ColorOptionIconView;Lb2/a;Z)V

    :cond_2c
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
