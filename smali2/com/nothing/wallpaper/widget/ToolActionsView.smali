.class public final Lcom/nothing/wallpaper/widget/ToolActionsView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "WrongViewCast"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/widget/ToolActionsView$a;
    }
.end annotation


# instance fields
.field private final q:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 10

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/widget/ToolActionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p2, p0, Lcom/nothing/wallpaper/widget/ToolActionsView;->q:Ljava/util/Map;

    .line 5
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p3, 0x7f0d0138

    const/4 v0, 0x1

    invoke-virtual {p1, p3, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    sget-object p1, Lcom/nothing/wallpaper/widget/ToolActionsView$a;->q:Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    const p3, 0x7f0a005d

    invoke-virtual {p0, p3}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    sget-object p1, Lcom/nothing/wallpaper/widget/ToolActionsView$a;->r:Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    const p3, 0x7f0a0060

    invoke-virtual {p0, p3}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    sget-object p1, Lcom/nothing/wallpaper/widget/ToolActionsView$a;->s:Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    const p3, 0x7f0a006e

    invoke-virtual {p0, p3}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-interface {p2, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V
    .registers 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_a

    const/4 p3, 0x0

    .line 2
    :cond_a
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/widget/ToolActionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic b(Landroid/view/View$OnClickListener;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/widget/ToolActionsView;->g(Landroid/view/View$OnClickListener;Landroid/view/View;)V

    return-void
.end method

.method private static final g(Landroid/view/View$OnClickListener;Landroid/view/View;)V
    .registers 2

    invoke-interface {p0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final varargs c([Lcom/nothing/wallpaper/widget/ToolActionsView$a;)V
    .registers 7

    const-string v0, "actions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_8
    if-ge v2, v0, :cond_1c

    aget-object v3, p1, v2

    iget-object v4, p0, Lcom/nothing/wallpaper/widget/ToolActionsView;->q:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageButton;

    if-eqz v3, :cond_19

    invoke-virtual {v3, v1}, Landroid/view/View;->setEnabled(Z)V

    :cond_19
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_1c
    return-void
.end method

.method public final varargs d([Lcom/nothing/wallpaper/widget/ToolActionsView$a;)V
    .registers 6

    const-string v0, "actions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_1c

    aget-object v2, p1, v1

    iget-object v3, p0, Lcom/nothing/wallpaper/widget/ToolActionsView;->q:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageButton;

    if-eqz v2, :cond_19

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    :cond_19
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_1c
    return-void
.end method

.method public final varargs e([Lcom/nothing/wallpaper/widget/ToolActionsView$a;)V
    .registers 6

    const-string v0, "actions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v0, :cond_1c

    aget-object v2, p1, v1

    iget-object v3, p0, Lcom/nothing/wallpaper/widget/ToolActionsView;->q:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageButton;

    if-eqz v2, :cond_19

    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_19
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_1c
    return-void
.end method

.method public final f(Lcom/nothing/wallpaper/widget/ToolActionsView$a;Landroid/view/View$OnClickListener;)V
    .registers 4

    const-string v0, "actionButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionClickListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/widget/ToolActionsView;->q:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageButton;

    if-eqz p0, :cond_1c

    new-instance p1, LT7/e;

    invoke-direct {p1, p2}, LT7/e;-><init>(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1c
    return-void
.end method

.method public final varargs h([Lcom/nothing/wallpaper/widget/ToolActionsView$a;)V
    .registers 7

    const-string v0, "actions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_8
    if-ge v2, v0, :cond_1c

    aget-object v3, p1, v2

    iget-object v4, p0, Lcom/nothing/wallpaper/widget/ToolActionsView;->q:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageButton;

    if-eqz v3, :cond_19

    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_19
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_1c
    return-void
.end method

.method public final varargs i([Lcom/nothing/wallpaper/widget/ToolActionsView$a;)V
    .registers 5

    const-string v0, "actions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/widget/ToolActionsView;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_33

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    invoke-static {p1, v1}, Li8/m;->C([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2b

    filled-new-array {v1}, [Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/nothing/wallpaper/widget/ToolActionsView;->h([Lcom/nothing/wallpaper/widget/ToolActionsView$a;)V

    goto :goto_11

    :cond_2b
    filled-new-array {v1}, [Lcom/nothing/wallpaper/widget/ToolActionsView$a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/nothing/wallpaper/widget/ToolActionsView;->e([Lcom/nothing/wallpaper/widget/ToolActionsView$a;)V

    goto :goto_11

    :cond_33
    return-void
.end method
