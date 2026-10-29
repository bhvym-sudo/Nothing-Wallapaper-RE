.class public final LM6/u;
.super LM6/a;
.source "SourceFile"


# instance fields
.field private final r:Le3/K;

.field private final s:Z

.field private final t:Landroid/content/Context;

.field private final u:Z

.field private v:Lr6/g;


# direct methods
.method public constructor <init>(Le3/K;ZLv8/p;)V
    .registers 6

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, LM6/a;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LM6/u;->r:Le3/K;

    iput-boolean p2, p0, LM6/u;->s:Z

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, LM6/u;->t:Landroid/content/Context;

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p2

    invoke-interface {p2}, Lh3/H;->C()Ld3/a;

    move-result-object p2

    invoke-virtual {p2}, Ld3/a;->s()Z

    move-result p2

    iput-boolean p2, p0, LM6/u;->u:Z

    iget-object p1, p1, Le3/K;->z:Landroid/widget/LinearLayout;

    new-instance p2, LM6/p;

    invoke-direct {p2, p3, p0}, LM6/p;-><init>(Lv8/p;LM6/u;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic f(LM6/u;Landroid/graphics/Bitmap;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LM6/u;->o(LM6/u;Landroid/graphics/Bitmap;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(LM6/u;Lg3/x;ZLandroid/view/View;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, LM6/u;->s(LM6/u;Lg3/x;ZLandroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lv8/p;LM6/u;Landroid/view/View;)V
    .registers 3

    invoke-static {p0, p1, p2}, LM6/u;->j(Lv8/p;LM6/u;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(LM6/u;ZLandroidx/lifecycle/q;Lg3/x;Lg3/x;I)V
    .registers 6

    invoke-static/range {p0 .. p5}, LM6/u;->q(LM6/u;ZLandroidx/lifecycle/q;Lg3/x;Lg3/x;I)V

    return-void
.end method

.method private static final j(Lv8/p;LM6/u;Landroid/view/View;)V
    .registers 3

    invoke-virtual {p1}, LM6/a;->e()Lg3/a;

    move-result-object p1

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p0, p1, p2}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic k(LM6/u;)Le3/K;
    .registers 1

    iget-object p0, p0, LM6/u;->r:Le3/K;

    return-object p0
.end method

.method public static final synthetic l(LM6/u;)Z
    .registers 1

    iget-boolean p0, p0, LM6/u;->u:Z

    return p0
.end method

.method private final n(Lg3/k;Landroidx/lifecycle/q;Z)V
    .registers 12

    invoke-virtual {p1}, Lg3/k;->q()Landroid/app/WallpaperInfo;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/WallpaperInfo;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    const-string p1, "getComponent(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LM6/u;->v:Lr6/g;

    iget-object p1, p0, LM6/u;->r:Le3/K;

    iget-object v3, p1, Le3/K;->y:Lcom/nothing/wallpaper/widget/RoundImageView;

    const-string p1, "imageWallpaperCurrent"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v4, p3

    invoke-static/range {v0 .. v7}, LM6/u;->u(LM6/u;Landroid/content/ComponentName;Lr6/g;Landroid/view/View;ZLv8/a;ILjava/lang/Object;)Lr6/g;

    move-result-object p0

    new-instance p1, LM6/s;

    invoke-direct {p1, v0}, LM6/s;-><init>(LM6/u;)V

    invoke-static {p2, p1}, LN7/f;->g(Landroidx/lifecycle/q;Lv8/l;)Lh8/o;

    move-result-object p1

    invoke-virtual {p1}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/RemoteCallback;

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-static {p0, p2, p3, p2, p1}, Lq6/g;->c(Lr6/g;IZZLandroid/os/RemoteCallback;)V

    iput-object p0, v0, LM6/u;->v:Lr6/g;

    return-void
.end method

.method private static final o(LM6/u;Landroid/graphics/Bitmap;)Lh8/A;
    .registers 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LM6/u;->r:Le3/K;

    iget-object v0, v0, Le3/K;->y:Lcom/nothing/wallpaper/widget/RoundImageView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, LM6/u;->v:Lr6/g;

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Lr6/g;->e0()V

    :cond_13
    iget-object p1, p0, LM6/u;->v:Lr6/g;

    if-eqz p1, :cond_1a

    invoke-virtual {p1}, Lr6/g;->d0()V

    :cond_1a
    const/4 p1, 0x0

    iput-object p1, p0, LM6/u;->v:Lr6/g;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final p(ZLandroidx/lifecycle/q;)V
    .registers 6

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    iget-object v1, p0, LM6/u;->t:Landroid/content/Context;

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lh3/H;->k(Landroid/content/Context;)Lh3/c;

    move-result-object v0

    iget-object v1, p0, LM6/u;->t:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, LM6/q;

    invoke-direct {v2, p0, p1, p2}, LM6/q;-><init>(LM6/u;ZLandroidx/lifecycle/q;)V

    const/4 p0, 0x0

    invoke-interface {v0, v1, p0, v2}, Lh3/c;->a(Landroid/content/Context;ZLh3/c$a;)V

    return-void
.end method

.method private static final q(LM6/u;ZLandroidx/lifecycle/q;Lg3/x;Lg3/x;I)V
    .registers 7

    iget-object p5, p0, LM6/u;->t:Landroid/content/Context;

    instance-of v0, p5, Landroid/app/Activity;

    if-eqz v0, :cond_10

    check-cast p5, Landroid/app/Activity;

    invoke-virtual {p5}, Landroid/app/Activity;->isDestroyed()Z

    move-result p5

    if-nez p5, :cond_f

    goto :goto_10

    :cond_f
    return-void

    :cond_10
    :goto_10
    if-eqz p1, :cond_16

    if-nez p4, :cond_15

    goto :goto_16

    :cond_15
    move-object p3, p4

    :cond_16
    :goto_16
    invoke-static {p3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0, p3, p1, p2}, LM6/u;->r(Lg3/x;ZLandroidx/lifecycle/q;)V

    return-void
.end method

.method private final r(Lg3/x;ZLandroidx/lifecycle/q;)V
    .registers 7

    invoke-static {p1}, LG6/e;->i(Lg3/x;)Z

    move-result v0

    if-eqz v0, :cond_14

    if-nez p2, :cond_14

    const-string v0, "null cannot be cast to non-null type com.android.wallpaper.model.LiveWallpaperInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Lg3/k;

    invoke-direct {p0, v0, p3, p2}, LM6/u;->n(Lg3/k;Landroidx/lifecycle/q;Z)V

    goto :goto_2c

    :cond_14
    iget-object p3, p0, LM6/u;->t:Landroid/content/Context;

    invoke-virtual {p1, p3}, Lg3/x;->o(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;

    move-result-object p3

    if-eqz p3, :cond_2c

    iget-object v0, p0, LM6/u;->t:Landroid/content/Context;

    iget-object v1, p0, LM6/u;->r:Le3/K;

    iget-object v1, v1, Le3/K;->y:Lcom/nothing/wallpaper/widget/RoundImageView;

    const v2, 0x1010530

    invoke-static {v0, v2}, LH3/r;->a(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p3, v0, v1, v2}, Lcom/android/wallpaper/asset/a;->n(Landroid/content/Context;Landroid/widget/ImageView;I)V

    :cond_2c
    :goto_2c
    iget-object p3, p0, LM6/u;->r:Le3/K;

    iget-object p3, p3, Le3/K;->x:Landroid/widget/LinearLayout;

    new-instance v0, LM6/r;

    invoke-direct {v0, p0, p1, p2}, LM6/r;-><init>(LM6/u;Lg3/x;Z)V

    invoke-virtual {p3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final s(LM6/u;Lg3/x;ZLandroid/view/View;)V
    .registers 4

    iget-object p0, p0, LM6/u;->r:Le3/K;

    invoke-virtual {p0}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string p3, "null cannot be cast to non-null type com.android.wallpaper.model.WallpaperPreviewNavigator"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lg3/z;

    xor-int/lit8 p2, p2, 0x1

    invoke-interface {p0, p1, p2}, Lg3/z;->H(Lg3/x;Z)V

    return-void
.end method

.method private final t(Landroid/content/ComponentName;Lr6/g;Landroid/view/View;ZLv8/a;)Lr6/g;
    .registers 9

    const/4 v0, 0x1

    if-nez p2, :cond_27

    move-object v1, p0

    sget-object p0, Lr6/g;->I:Lr6/g$a;

    iget-object p2, v1, LM6/u;->r:Le3/K;

    invoke-virtual {p2}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string v1, "getContext(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p4, :cond_1c

    const/4 p4, 0x2

    move-object v2, p3

    move-object p3, p2

    move-object p2, v2

    goto :goto_20

    :cond_1c
    move-object p4, p3

    move-object p3, p2

    move-object p2, p4

    move p4, v0

    :goto_20
    invoke-virtual/range {p0 .. p5}, Lr6/g$a;->a(Landroid/content/ComponentName;Landroid/view/View;Landroid/content/Context;ILv8/a;)Lr6/g;

    move-result-object p0

    move-object p1, p2

    move-object p2, p0

    goto :goto_28

    :cond_27
    move-object p1, p3

    :goto_28
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p0

    if-eqz p0, :cond_35

    invoke-virtual {p2}, Lr6/g;->c0()Z

    invoke-virtual {p2, v0}, Lr6/g;->r0(Z)V

    return-object p2

    :cond_35
    new-instance p0, LM6/u$b;

    invoke-direct {p0, p1, p2}, LM6/u$b;-><init>(Landroid/view/View;Lr6/g;)V

    invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-object p2
.end method

.method static synthetic u(LM6/u;Landroid/content/ComponentName;Lr6/g;Landroid/view/View;ZLv8/a;ILjava/lang/Object;)Lr6/g;
    .registers 14

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_5

    const/4 p5, 0x0

    :cond_5
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, LM6/u;->t(Landroid/content/ComponentName;Lr6/g;Landroid/view/View;ZLv8/a;)Lr6/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public m(Lg3/a;Landroidx/lifecycle/x;)V
    .registers 6

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LM6/a;->d(Lg3/a;)V

    instance-of v0, p1, LJ6/l;

    if-eqz v0, :cond_9b

    check-cast p1, LJ6/l;

    iget-object v0, p0, LM6/u;->t:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LM6/u$a;

    invoke-direct {v1, p0}, LM6/u$a;-><init>(LM6/u;)V

    invoke-virtual {p1, v0, v1}, LJ6/l;->s(Landroid/content/Context;LJ6/l$a;)V

    iget-boolean p1, p0, LM6/u;->u:Z

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_5a

    if-eqz p2, :cond_33

    iget-boolean p1, p0, LM6/u;->s:Z

    invoke-interface {p2}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LM6/u;->p(ZLandroidx/lifecycle/q;)V

    :cond_33
    iget-object p1, p0, LM6/u;->r:Le3/K;

    iget-object p1, p1, Le3/K;->x:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, LM6/u;->r:Le3/K;

    iget-object p1, p1, Le3/K;->A:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, LM6/u;->r:Le3/K;

    iget-object p1, p1, Le3/K;->B:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, LM6/u;->r:Le3/K;

    iget-object p0, p0, Le3/K;->C:Lcom/nothing/wallpaper/widget/PhotoCoverView;

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    iput v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->endToEnd:I

    return-void

    :cond_5a
    iget-object p1, p0, LM6/u;->r:Le3/K;

    iget-object p1, p1, Le3/K;->x:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, LM6/u;->r:Le3/K;

    iget-object p1, p1, Le3/K;->z:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p1}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginEnd()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget-object p1, p0, LM6/u;->r:Le3/K;

    iget-object p1, p1, Le3/K;->C:Lcom/nothing/wallpaper/widget/PhotoCoverView;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    const/high16 p2, 0x41800000    # 16.0f

    invoke-static {p2}, Lcom/android/launcher3/w;->b(F)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget-object p1, p0, LM6/u;->r:Le3/K;

    iget-object p1, p1, Le3/K;->A:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, LM6/u;->r:Le3/K;

    iget-object p0, p0, Le3/K;->B:Landroid/widget/TextView;

    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_9b
    return-void
.end method
