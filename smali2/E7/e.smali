.class public final LE7/e;
.super Landroid/widget/PopupWindow;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Z

.field private final c:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

.field private d:Landroid/view/View;

.field private e:Lv8/p;


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, LE7/e;->a:Landroid/content/Context;

    iput-boolean p2, p0, LE7/e;->b:Z

    iput-object p3, p0, LE7/e;->c:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    const p1, 0x7f140194

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-direct {p0}, LE7/e;->d()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p1

    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    invoke-static {p2, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p1, p3, p2}, Landroid/view/View;->measure(II)V

    const/4 p1, -0x2

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setHeight(I)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    return-void
.end method

.method public static synthetic a(LE7/e;ZLF7/f;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, LE7/e;->e(LE7/e;ZLF7/f;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final b(Landroid/view/View;)[I
    .registers 10

    const/4 v0, 0x2

    new-array v1, v0, [I

    new-array v0, v0, [I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p1, p0, LE7/e;->a:Landroid/content/Context;

    invoke-static {p1}, Li6/q;->d(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p1

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    iget-object v4, p0, LE7/e;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f07050f

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-ne v5, v7, :cond_47

    aput v4, v1, v6

    aget p1, v0, v7

    sub-int/2addr p1, v2

    sub-int/2addr p1, v4

    aput p1, v1, v7

    const p1, 0x7f140195

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    return-object v1

    :cond_47
    iget p1, p1, Landroid/graphics/Point;->x:I

    sub-int/2addr p1, v3

    sub-int/2addr p1, v4

    aput p1, v1, v6

    aget p1, v0, v7

    sub-int/2addr p1, v2

    sub-int/2addr p1, v4

    aput p1, v1, v7

    const p1, 0x7f140194

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    return-object v1
.end method

.method private final c()Ljava/util/List;
    .registers 14

    new-instance v0, LF7/f;

    sget-object v1, LE7/f;->s:LE7/f;

    iget-object v2, p0, LE7/e;->a:Landroid/content/Context;

    const v3, 0x7f1300da

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v6, "getString(...)"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v2, p0, LE7/e;->b:Z

    xor-int/lit8 v4, v2, 0x1

    const/4 v5, 0x1

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, LF7/f;-><init>(LE7/f;ILjava/lang/String;ZZ)V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v1

    invoke-interface {v1}, Lh3/H;->C()Ld3/a;

    move-result-object v1

    invoke-virtual {v1}, Ld3/a;->p()Z

    move-result v1

    if-eqz v1, :cond_61

    iget-object v1, p0, LE7/e;->c:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    if-eqz v1, :cond_61

    new-instance v7, LF7/f;

    sget-object v8, LE7/f;->q:LE7/f;

    iget-object v1, p0, LE7/e;->a:Landroid/content/Context;

    const v2, 0x7f1300d3

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const v3, 0x7f1300d9

    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v6}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v11, p0, LE7/e;->b:Z

    sget-object v1, Lj7/j;->T:Lj7/j$a;

    iget-object p0, p0, LE7/e;->c:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    invoke-virtual {v1, p0}, Lj7/j$a;->a(Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;)Z

    move-result v12

    const v9, 0x7f080160

    invoke-direct/range {v7 .. v12}, LF7/f;-><init>(LE7/f;ILjava/lang/String;ZZ)V

    filled-new-array {v7, v0}, [LF7/f;

    move-result-object p0

    invoke-static {p0}, Li8/s;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_61
    filled-new-array {v0}, [LF7/f;

    move-result-object p0

    invoke-static {p0}, Li8/s;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final d()Landroid/view/View;
    .registers 6

    iget-object v0, p0, LE7/e;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x7f0d0141

    invoke-virtual {v0, v3, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a03bc

    invoke-virtual {v0, v1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v2, "requireViewById(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v3, p0, LE7/e;->a:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v2, LF7/e;

    invoke-direct {p0}, LE7/e;->c()Ljava/util/List;

    move-result-object v3

    new-instance v4, LE7/d;

    invoke-direct {v4, p0}, LE7/d;-><init>(LE7/e;)V

    invoke-direct {v2, v3, v4}, LF7/e;-><init>(Ljava/util/List;Lv8/p;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object v0
.end method

.method private static final e(LE7/e;ZLF7/f;)Lh8/A;
    .registers 4

    const-string v0, "model"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LE7/e;->e:Lv8/p;

    if-eqz p0, :cond_14

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2}, LF7/f;->b()LE7/f;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public dismiss()V
    .registers 2

    const/4 v0, 0x0

    iput-object v0, p0, LE7/e;->e:Lv8/p;

    invoke-super {p0}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method public final f(Lv8/p;)V
    .registers 2

    iput-object p1, p0, LE7/e;->e:Lv8/p;

    return-void
.end method

.method public final g(Landroid/view/View;)V
    .registers 6

    const-string v0, "anchor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LE7/e;->d:Landroid/view/View;

    invoke-direct {p0, p1}, LE7/e;->b(Landroid/view/View;)[I

    move-result-object v0

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    aget v0, v0, v3

    invoke-virtual {p0, p1, v1, v2, v0}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    return-void
.end method
