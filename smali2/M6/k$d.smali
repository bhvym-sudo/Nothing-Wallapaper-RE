.class public final LM6/k$d;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM6/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM6/k$d$a;
    }
.end annotation


# static fields
.field public static final z:LM6/k$d$a;


# instance fields
.field private final q:Le3/M;

.field private final r:Lv8/a;

.field private final s:F

.field private final t:Lv8/q;

.field private final u:Lv8/p;

.field private final v:Landroid/content/Context;

.field private w:Lg3/x;

.field private x:Z

.field private y:F


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LM6/k$d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LM6/k$d$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LM6/k$d;->z:LM6/k$d$a;

    return-void
.end method

.method public constructor <init>(Le3/M;Lv8/a;FLv8/q;Lv8/p;)V
    .registers 7

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isEditingMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onWallpaperSelected"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, LM6/k$d;->q:Le3/M;

    iput-object p2, p0, LM6/k$d;->r:Lv8/a;

    iput p3, p0, LM6/k$d;->s:F

    iput-object p4, p0, LM6/k$d;->t:Lv8/q;

    iput-object p5, p0, LM6/k$d;->u:Lv8/p;

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    iput-object p2, p0, LM6/k$d;->v:Landroid/content/Context;

    const/high16 p4, 0x3f800000    # 1.0f

    iput p4, p0, LM6/k$d;->y:F

    iget-object p5, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p5

    invoke-static {p5}, LH3/D;->n(Landroid/content/Context;)F

    move-result p5

    iput p5, p0, LM6/k$d;->y:F

    iget-object p5, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p5

    const/4 v0, 0x0

    cmpl-float v0, p3, v0

    if-lez v0, :cond_61

    cmpg-float p4, p3, p4

    if-gez p4, :cond_61

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string p4, "getContext(...)"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Li6/q;->d(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p2

    iget p2, p2, Landroid/graphics/Point;->y:I

    int-to-float p2, p2

    mul-float/2addr p3, p2

    float-to-int p2, p3

    goto :goto_6c

    :cond_61
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f07048b

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p2

    :goto_6c
    iput p2, p5, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object p1, p1, Le3/M;->y:Landroid/widget/ImageView;

    const-string p2, "indicatorIcon"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const-string p2, "itemView"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, LH6/d;->d(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(ZLM6/k$d;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LM6/k$d;->m(ZLM6/k$d;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LM6/k$d;F)V
    .registers 2

    invoke-static {p0, p1}, LM6/k$d;->p(LM6/k$d;F)V

    return-void
.end method

.method public static synthetic f(LM6/k$d;LJ6/i;Landroid/view/View;)Z
    .registers 3

    invoke-static {p0, p1, p2}, LM6/k$d;->k(LM6/k$d;LJ6/i;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic g(Lg3/x;LM6/k$d;Landroid/view/View;)V
    .registers 3

    invoke-static {p0, p1, p2}, LM6/k$d;->i(Lg3/x;LM6/k$d;Landroid/view/View;)V

    return-void
.end method

.method private static final i(Lg3/x;LM6/k$d;Landroid/view/View;)V
    .registers 4

    instance-of p2, p0, LJ6/i;

    if-eqz p2, :cond_18

    iget-object p2, p1, LM6/k$d;->r:Lv8/a;

    invoke-interface {p2}, Lv8/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_18

    check-cast p0, LJ6/i;

    invoke-direct {p1, p0}, LM6/k$d;->l(LJ6/i;)V

    return-void

    :cond_18
    iget-object p0, p1, LM6/k$d;->t:Lv8/q;

    iget-object p2, p1, LM6/k$d;->w:Lg3/x;

    iget-object p1, p1, LM6/k$d;->q:Le3/M;

    iget-object p1, p1, Le3/M;->x:Landroid/widget/ImageView;

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p2, p1, v0}, Lv8/q;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final j(LJ6/i;)V
    .registers 4

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, LM6/n;

    invoke-direct {v1, p0, p1}, LM6/n;-><init>(LM6/k$d;LJ6/i;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    invoke-virtual {p1}, LJ6/i;->z()Z

    move-result p1

    if-eqz p1, :cond_26

    iget-object p1, p0, LM6/k$d;->q:Le3/M;

    iget-object p1, p1, Le3/M;->A:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, LM6/k$d;->q:Le3/M;

    iget-object p1, p1, Le3/M;->w:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const p1, 0x3f5eb852    # 0.87f

    invoke-direct {p0, p1}, LM6/k$d;->o(F)V

    return-void

    :cond_26
    iget-object p1, p0, LM6/k$d;->q:Le3/M;

    iget-object p1, p1, Le3/M;->A:Landroid/widget/ImageView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, LM6/k$d;->q:Le3/M;

    iget-object p1, p1, Le3/M;->w:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-direct {p0, p1}, LM6/k$d;->o(F)V

    return-void
.end method

.method private static final k(LM6/k$d;LJ6/i;Landroid/view/View;)Z
    .registers 3

    invoke-direct {p0, p1}, LM6/k$d;->l(LJ6/i;)V

    const/4 p0, 0x1

    return p0
.end method

.method private final l(LJ6/i;)V
    .registers 12

    iget-boolean v0, p0, LM6/k$d;->x:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_16

    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const p1, 0x7f1301f9

    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void

    :cond_16
    iget-object v0, p0, LM6/k$d;->q:Le3/M;

    iget-object v0, v0, Le3/M;->A:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_21

    const/4 v1, 0x1

    :cond_21
    move v3, v1

    iget-object v0, p0, LM6/k$d;->q:Le3/M;

    iget-object v2, v0, Le3/M;->v:Landroidx/cardview/widget/CardView;

    const-string v0, "cardView"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x30

    const/4 v9, 0x0

    const v4, 0x3f5eb852    # 0.87f

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lq6/a;->b(Landroid/view/View;ZFFZZILjava/lang/Object;)V

    iget-object v0, p0, LM6/k$d;->q:Le3/M;

    iget-object v2, v0, Le3/M;->w:Landroid/widget/ImageView;

    const-string v0, "dimmingScrim"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x1

    move v7, v3

    invoke-static/range {v2 .. v7}, Lq6/a;->a(Landroid/view/View;ZFFZZ)V

    iget-object v0, p0, LM6/k$d;->q:Le3/M;

    iget-object v0, v0, Le3/M;->A:Landroid/widget/ImageView;

    const-string v1, "selectedIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LM6/m;

    invoke-direct {v1, v3, p0}, LM6/m;-><init>(ZLM6/k$d;)V

    invoke-static {v0, v3, v1}, Lq6/a;->c(Landroid/view/View;ZLv8/a;)V

    iget-boolean v0, p0, LM6/k$d;->x:Z

    if-eqz v0, :cond_6a

    iget-object v0, p0, LM6/k$d;->q:Le3/M;

    iget-object v0, v0, Le3/M;->y:Landroid/widget/ImageView;

    const-string v1, "indicatorIcon"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/lit8 v1, v3, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lq6/a;->c(Landroid/view/View;ZLv8/a;)V

    :cond_6a
    iget-object v0, p0, LM6/k$d;->u:Lv8/p;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lv8/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, LM6/k$d;->t:Lv8/q;

    iget-object v0, p0, LM6/k$d;->w:Lg3/x;

    iget-object p0, p0, LM6/k$d;->q:Le3/M;

    iget-object p0, p0, Le3/M;->x:Landroid/widget/ImageView;

    const-string v1, "image"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0, p0, v1}, Lv8/q;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final m(ZLM6/k$d;)Lh8/A;
    .registers 3

    if-eqz p0, :cond_b

    iget-object p0, p1, LM6/k$d;->q:Le3/M;

    iget-object p0, p0, Le3/M;->v:Landroidx/cardview/widget/CardView;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_17

    :cond_b
    iget-object p0, p1, LM6/k$d;->q:Le3/M;

    iget-object p0, p0, Le3/M;->v:Landroidx/cardview/widget/CardView;

    const-string v0, "cardView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p0}, LM6/k$d;->n(Landroid/view/View;)V

    :goto_17
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final n(Landroid/view/View;)V
    .registers 5

    iget-object p0, p0, LM6/k$d;->v:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    const/4 v1, 0x1

    const v2, 0x101030e

    invoke-virtual {p0, v2, v0, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    filled-new-array {v2}, [I

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p0

    const-string v0, "obtainStyledAttributes(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Landroid/graphics/drawable/RippleDrawable;

    if-eqz v1, :cond_2d

    check-cast v0, Landroid/graphics/drawable/RippleDrawable;

    goto :goto_2e

    :cond_2d
    const/4 v0, 0x0

    :goto_2e
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz v0, :cond_36

    invoke-virtual {p1, v0}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :cond_36
    return-void
.end method

.method private final o(F)V
    .registers 4

    iget-object v0, p0, LM6/k$d;->q:Le3/M;

    iget-object v0, v0, Le3/M;->v:Landroidx/cardview/widget/CardView;

    new-instance v1, LM6/o;

    invoke-direct {v1, p0, p1}, LM6/o;-><init>(LM6/k$d;F)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final p(LM6/k$d;F)V
    .registers 3

    iget-object v0, p0, LM6/k$d;->q:Le3/M;

    iget-object v0, v0, Le3/M;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    iget-object v0, p0, LM6/k$d;->q:Le3/M;

    iget-object v0, v0, Le3/M;->w:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    iget-object v0, p0, LM6/k$d;->q:Le3/M;

    iget-object v0, v0, Le3/M;->v:Landroidx/cardview/widget/CardView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    iget-object p0, p0, LM6/k$d;->q:Le3/M;

    iget-object p0, p0, Le3/M;->v:Landroidx/cardview/widget/CardView;

    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleX(F)V

    return-void
.end method


# virtual methods
.method public final h(Lg3/x;Ljava/util/Set;)V
    .registers 8

    const-string v0, "wallpaper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appliedIds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LM6/k$d;->w:Lg3/x;

    invoke-virtual {p1}, Lg3/x;->r()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    iput-boolean p2, p0, LM6/k$d;->x:Z

    iget-object p2, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, LM6/l;

    invoke-direct {v0, p1, p0}, LM6/l;-><init>(Lg3/x;LM6/k$d;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    instance-of p2, p1, LJ6/i;

    const/4 v0, 0x0

    if-eqz p2, :cond_30

    move-object p2, p1

    check-cast p2, LJ6/i;

    invoke-direct {p0, p2}, LM6/k$d;->j(LJ6/i;)V

    invoke-virtual {p2}, LJ6/i;->z()Z

    move-result p2

    goto :goto_31

    :cond_30
    move p2, v0

    :goto_31
    iget-object v1, p0, LM6/k$d;->q:Le3/M;

    iget-object v2, p0, LM6/k$d;->v:Landroid/content/Context;

    invoke-virtual {p1, v2}, Lg3/x;->b(Landroid/content/Context;)Ljava/util/concurrent/Future;

    iget-object v2, v1, Le3/M;->x:Landroid/widget/ImageView;

    iget-object v3, p0, LM6/k$d;->v:Landroid/content/Context;

    const-string v4, "context"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v3}, LG6/g;->c(Lg3/x;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LM6/k$d;->v:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1, v2}, Lg3/x;->o(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;

    move-result-object p1

    iget-object v2, p0, LM6/k$d;->v:Landroid/content/Context;

    iget-object v3, v1, Le3/M;->x:Landroid/widget/ImageView;

    const v4, 0x1010530

    invoke-static {v2, v4}, LH3/r;->a(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {p1, v2, v3, v4}, Lcom/android/wallpaper/asset/a;->n(Landroid/content/Context;Landroid/widget/ImageView;I)V

    iget-object p1, v1, Le3/M;->y:Landroid/widget/ImageView;

    const-string v2, "indicatorIcon"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v2, p0, LM6/k$d;->x:Z

    if-eqz v2, :cond_6f

    if-nez p2, :cond_6f

    const/4 p2, 0x1

    goto :goto_70

    :cond_6f
    move p2, v0

    :goto_70
    const/16 v2, 0x8

    if-eqz p2, :cond_76

    move p2, v0

    goto :goto_77

    :cond_76
    move p2, v2

    :goto_77
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, v1, Le3/M;->v:Landroidx/cardview/widget/CardView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, v1, Le3/M;->B:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, v1, Le3/M;->x:Landroid/widget/ImageView;

    iget p2, p0, LM6/k$d;->y:F

    invoke-virtual {p1, p2}, Landroid/view/View;->setScaleX(F)V

    iget-object p1, v1, Le3/M;->x:Landroid/widget/ImageView;

    iget p0, p0, LM6/k$d;->y:F

    invoke-virtual {p1, p0}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method
