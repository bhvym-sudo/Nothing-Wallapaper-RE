.class public final Ly7/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly7/r$b;,
        Ly7/r$c;
    }
.end annotation


# static fields
.field private static final A:Ly7/r$a;

.field public static final z:Ly7/r$b;


# instance fields
.field private final a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

.field private final b:LJ7/b;

.field private final c:Landroidx/cardview/widget/CardView;

.field private final d:Landroid/widget/Button;

.field private final e:Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;

.field private final f:Landroid/view/View;

.field private final g:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

.field private final h:Landroid/widget/ImageView;

.field private final i:Landroidx/cardview/widget/CardView;

.field private final j:Landroidx/cardview/widget/CardView;

.field private final k:Lcom/nothing/wallpaper/widget/RoundImageView;

.field private final l:Lcom/android/launcher3/Workspace;

.field private final m:Lcom/android/launcher3/dragndrop/DragLayer;

.field private final n:Lcom/android/launcher3/CellLayout;

.field private final o:Landroid/widget/TextView;

.field private final p:Landroid/widget/ImageButton;

.field private final q:Landroid/widget/TextView;

.field private final r:Landroid/widget/TextView;

.field private s:Ly7/r$c;

.field private final t:Lcom/android/launcher3/f;

.field private u:Landroid/animation/AnimatorSet;

.field private final v:Landroid/content/Context;

.field private final w:F

.field private x:F

.field private final y:Lh8/h;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Ly7/r$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly7/r$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Ly7/r;->z:Ly7/r$b;

    new-instance v0, Ly7/r$a;

    const-class v1, Landroid/graphics/RectF;

    invoke-direct {v0, v1}, Ly7/r$a;-><init>(Ljava/lang/Class;)V

    sput-object v0, Ly7/r;->A:Ly7/r$a;

    return-void
.end method

.method public constructor <init>(Le3/u;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;Lcom/android/launcher3/views/f;LJ7/b;)V
    .registers 10

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockHost"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shareViewModel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ly7/r;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    iput-object p4, p0, Ly7/r;->b:LJ7/b;

    iget-object v0, p1, Le3/u;->H:Landroidx/cardview/widget/CardView;

    const-string v1, "translationAll"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ly7/r;->c:Landroidx/cardview/widget/CardView;

    iget-object v1, p1, Le3/u;->A:Landroid/widget/Button;

    const-string v2, "btnWallpaper"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ly7/r;->d:Landroid/widget/Button;

    iget-object v1, p1, Le3/u;->Q:Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;

    const-string v2, "wallpaperThumbnail"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ly7/r;->e:Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;

    invoke-interface {p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getIndicator()Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Ly7/r;->f:Landroid/view/View;

    iget-object p2, p1, Le3/u;->G:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    const-string v1, "shortcutPreview"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ly7/r;->g:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    iget-object v1, p1, Le3/u;->E:Landroid/widget/ImageView;

    const-string v2, "fingerprintView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ly7/r;->h:Landroid/widget/ImageView;

    iget-object v1, p1, Le3/u;->O:Landroidx/cardview/widget/CardView;

    const-string v2, "wallpaperPreview"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ly7/r;->i:Landroidx/cardview/widget/CardView;

    iget-object v1, p1, Le3/u;->L:Landroidx/cardview/widget/CardView;

    const-string v2, "wallpaperDepthPreview"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ly7/r;->j:Landroidx/cardview/widget/CardView;

    iget-object v1, p1, Le3/u;->F:Lcom/nothing/wallpaper/widget/RoundImageView;

    const-string v2, "previewDimmingScrim"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ly7/r;->k:Lcom/nothing/wallpaper/widget/RoundImageView;

    iget-object v1, p1, Le3/u;->R:Lcom/android/launcher3/Workspace;

    const-string v2, "workspace"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ly7/r;->l:Lcom/android/launcher3/Workspace;

    iget-object v1, p1, Le3/u;->D:Lcom/android/launcher3/dragndrop/DragLayer;

    const-string v2, "dragLayer"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ly7/r;->m:Lcom/android/launcher3/dragndrop/DragLayer;

    iget-object v1, p1, Le3/u;->R:Lcom/android/launcher3/Workspace;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/android/launcher3/Workspace;->f(I)Lcom/android/launcher3/CellLayout;

    move-result-object v1

    iput-object v1, p0, Ly7/r;->n:Lcom/android/launcher3/CellLayout;

    iget-object v1, p1, Le3/u;->J:Landroid/widget/TextView;

    const-string v3, "tvPinchTip"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ly7/r;->o:Landroid/widget/TextView;

    iget-object v1, p1, Le3/u;->z:Landroid/widget/ImageButton;

    const-string v3, "btnEffects"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ly7/r;->p:Landroid/widget/ImageButton;

    iget-object v1, p1, Le3/u;->x:Landroid/widget/TextView;

    const-string v3, "actionDone"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ly7/r;->q:Landroid/widget/TextView;

    iget-object p1, p1, Le3/u;->w:Landroid/widget/TextView;

    const-string v1, "actionCancel"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly7/r;->r:Landroid/widget/TextView;

    invoke-interface {p3}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object p1

    iput-object p1, p0, Ly7/r;->t:Lcom/android/launcher3/f;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ly7/r;->v:Landroid/content/Context;

    new-instance p3, Ly7/q;

    invoke-direct {p3}, Ly7/q;-><init>()V

    invoke-static {p3}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p3

    iput-object p3, p0, Ly7/r;->y:Lh8/h;

    invoke-virtual {p4}, LJ7/b;->l()Z

    move-result p3

    if-nez p3, :cond_145

    invoke-virtual {p4}, LJ7/b;->g()Lz7/a;

    move-result-object p3

    if-eqz p3, :cond_145

    invoke-virtual {p4}, LJ7/b;->g()Lz7/a;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f07061e

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    invoke-virtual {p3}, Lz7/a;->a()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    invoke-virtual {p3}, Lz7/a;->b()Landroid/graphics/RectF;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v1, v3

    invoke-virtual {p3}, Lz7/a;->a()Landroid/graphics/RectF;

    move-result-object v3

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    invoke-virtual {p3}, Lz7/a;->b()Landroid/graphics/RectF;

    move-result-object v4

    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    move-result v4

    div-float/2addr v3, v4

    invoke-static {v1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v1

    mul-float/2addr v1, p1

    iput v1, p0, Ly7/r;->x:F

    invoke-virtual {p4}, LJ7/b;->i()Z

    move-result p1

    if-eqz p1, :cond_124

    new-instance p1, Ly7/r$c;

    invoke-virtual {p3}, Lz7/a;->a()Landroid/graphics/RectF;

    move-result-object p3

    filled-new-array {v0}, [Landroid/view/View;

    move-result-object v0

    invoke-direct {p1, p3, v0}, Ly7/r$c;-><init>(Landroid/graphics/RectF;[Landroid/view/View;)V

    iput-object p1, p0, Ly7/r;->s:Ly7/r$c;

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-direct {p0, p1}, Ly7/r;->l(F)V

    invoke-virtual {p2, v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->setShowPreview(Z)V

    goto :goto_13e

    :cond_124
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance p1, Ly7/r$c;

    invoke-virtual {p3}, Lz7/a;->b()Landroid/graphics/RectF;

    move-result-object p3

    filled-new-array {v0}, [Landroid/view/View;

    move-result-object v0

    invoke-direct {p1, p3, v0}, Ly7/r$c;-><init>(Landroid/graphics/RectF;[Landroid/view/View;)V

    iput-object p1, p0, Ly7/r;->s:Ly7/r$c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/r;->l(F)V

    const/4 p1, 0x1

    invoke-virtual {p2, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->setShowPreview(Z)V

    :goto_13e
    invoke-virtual {p4}, LJ7/b;->i()Z

    move-result p1

    invoke-direct {p0, p1}, Ly7/r;->m(Z)V

    :cond_145
    return-void
.end method

.method public static synthetic a()Z
    .registers 1

    invoke-static {}, Ly7/r;->h()Z

    move-result v0

    return v0
.end method

.method public static synthetic b(ZLy7/r;Landroid/animation/ValueAnimator;)V
    .registers 3

    invoke-static {p0, p1, p2}, Ly7/r;->e(ZLy7/r;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static final synthetic c(Ly7/r;)Lcom/android/launcher3/CellLayout;
    .registers 1

    iget-object p0, p0, Ly7/r;->n:Lcom/android/launcher3/CellLayout;

    return-object p0
.end method

.method private static final e(ZLy7/r;Landroid/animation/ValueAnimator;)V
    .registers 4

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getAnimatedValue(...)"

    if-eqz p0, :cond_15

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lu5/a;->d(Ljava/lang/Object;)F

    move-result p0

    goto :goto_23

    :cond_15
    const/4 p0, 0x1

    int-to-float p0, p0

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lu5/a;->d(Ljava/lang/Object;)F

    move-result p2

    sub-float/2addr p0, p2

    :goto_23
    invoke-direct {p1, p0}, Ly7/r;->l(F)V

    return-void
.end method

.method private final g()Z
    .registers 1

    iget-object p0, p0, Ly7/r;->y:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final h()Z
    .registers 1

    invoke-static {}, Li6/e;->j()Z

    move-result v0

    return v0
.end method

.method private final l(F)V
    .registers 5

    iget-object v0, p0, Ly7/r;->h:Landroid/widget/ImageView;

    const/4 v1, 0x1

    int-to-float v1, v1

    sub-float/2addr v1, p1

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Ly7/r;->g:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    iget-object v2, p0, Ly7/r;->b:LJ7/b;

    invoke-virtual {v2}, LJ7/b;->p()Z

    move-result v2

    invoke-virtual {v0, p1, v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->g(FZ)V

    invoke-direct {p0}, Ly7/r;->g()Z

    move-result v0

    if-eqz v0, :cond_2c

    iget-object v0, p0, Ly7/r;->n:Lcom/android/launcher3/CellLayout;

    invoke-virtual {v0, p1}, Lcom/android/launcher3/CellLayout;->setGridAlpha(F)V

    iget-object v0, p0, Ly7/r;->b:LJ7/b;

    invoke-virtual {v0}, LJ7/b;->q()Z

    move-result v0

    if-nez v0, :cond_3a

    iget-object v0, p0, Ly7/r;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    invoke-interface {v0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->h(F)V

    goto :goto_3a

    :cond_2c
    iget-object v0, p0, Ly7/r;->n:Lcom/android/launcher3/CellLayout;

    invoke-virtual {v0}, Lcom/android/launcher3/CellLayout;->getAnimBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v2, 0xff

    int-to-float v2, v2

    mul-float/2addr v2, p1

    float-to-int v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :cond_3a
    :goto_3a
    iget-object v0, p0, Ly7/r;->n:Lcom/android/launcher3/CellLayout;

    invoke-virtual {v0}, Lcom/android/launcher3/CellLayout;->getEmptyView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Ly7/r;->i:Landroidx/cardview/widget/CardView;

    iget v2, p0, Ly7/r;->x:F

    mul-float/2addr v1, v2

    iget v2, p0, Ly7/r;->w:F

    mul-float/2addr v2, p1

    add-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    iget-object v0, p0, Ly7/r;->j:Landroidx/cardview/widget/CardView;

    iget-object v1, p0, Ly7/r;->i:Landroidx/cardview/widget/CardView;

    invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getRadius()F

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    iget-object v0, p0, Ly7/r;->k:Lcom/nothing/wallpaper/widget/RoundImageView;

    iget-object v1, p0, Ly7/r;->i:Landroidx/cardview/widget/CardView;

    invoke-virtual {v1}, Landroidx/cardview/widget/CardView;->getRadius()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/widget/RoundImageView;->setRoundRadius(F)V

    iget-object v0, p0, Ly7/r;->b:LJ7/b;

    invoke-virtual {v0}, LJ7/b;->q()Z

    move-result v0

    if-eqz v0, :cond_71

    const v0, 0x3dcccccd    # 0.1f

    goto :goto_72

    :cond_71
    move v0, p1

    :goto_72
    iget-object v1, p0, Ly7/r;->b:LJ7/b;

    invoke-virtual {v1}, LJ7/b;->q()Z

    move-result v1

    if-eqz v1, :cond_7b

    const/4 p1, 0x0

    :cond_7b
    iget-object v1, p0, Ly7/r;->d:Landroid/widget/Button;

    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, p0, Ly7/r;->e:Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;

    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, p0, Ly7/r;->l:Lcom/android/launcher3/Workspace;

    iget-object v2, p0, Ly7/r;->t:Lcom/android/launcher3/f;

    iget v2, v2, Lcom/android/launcher3/f;->F:F

    mul-float/2addr v2, p1

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    iget-object v1, p0, Ly7/r;->f:Landroid/view/View;

    if-eqz v1, :cond_96

    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    :cond_96
    iget-object v1, p0, Ly7/r;->o:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, p0, Ly7/r;->p:Landroid/widget/ImageButton;

    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Ly7/r;->q:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p0, p0, Ly7/r;->r:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method private final m(Z)V
    .registers 2

    iget-object p0, p0, Ly7/r;->m:Lcom/android/launcher3/dragndrop/DragLayer;

    if-eqz p1, :cond_6

    const/4 p1, 0x2

    goto :goto_7

    :cond_6
    const/4 p1, 0x4

    :goto_7
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    return-void
.end method


# virtual methods
.method public final d(Z)Landroid/animation/AnimatorSet;
    .registers 6

    invoke-direct {p0, p1}, Ly7/r;->m(Z)V

    iget-object v0, p0, Ly7/r;->b:LJ7/b;

    invoke-virtual {v0}, LJ7/b;->g()Lz7/a;

    move-result-object v0

    if-nez v0, :cond_11

    new-instance p0, Landroid/animation/AnimatorSet;

    invoke-direct {p0}, Landroid/animation/AnimatorSet;-><init>()V

    return-object p0

    :cond_11
    new-instance v1, Landroid/graphics/RectF;

    if-eqz p1, :cond_1d

    invoke-virtual {v0}, Lz7/a;->a()Landroid/graphics/RectF;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    goto :goto_24

    :cond_1d
    invoke-virtual {v0}, Lz7/a;->b()Landroid/graphics/RectF;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    :goto_24
    iget-object v0, p0, Ly7/r;->s:Ly7/r$c;

    sget-object v2, Ly7/r;->A:Ly7/r$a;

    new-instance v3, LS7/d;

    invoke-direct {v3}, LS7/d;-><init>()V

    filled-new-array {v1}, [Landroid/graphics/RectF;

    move-result-object v1

    invoke-static {v0, v2, v3, v1}, Landroid/animation/ObjectAnimator;->ofObject(Ljava/lang/Object;Landroid/util/Property;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-string v1, "ofObject(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_6a

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    new-instance v2, Ly7/p;

    invoke-direct {v2, p1, p0}, Ly7/p;-><init>(ZLy7/r;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v2, p0, Ly7/r;->g:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {v2, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->setShowPreview(Z)V

    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-virtual {p1, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    invoke-virtual {p1, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    new-instance v0, Ly7/r$d;

    invoke-direct {v0, p0}, Ly7/r$d;-><init>(Ly7/r;)V

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iput-object p1, p0, Ly7/r;->u:Landroid/animation/AnimatorSet;

    return-object p1

    nop

    :array_6a
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final f()V
    .registers 3

    iget-object v0, p0, Ly7/r;->b:LJ7/b;

    invoke-virtual {v0}, LJ7/b;->g()Lz7/a;

    move-result-object v0

    if-nez v0, :cond_9

    return-void

    :cond_9
    iget-object v1, p0, Ly7/r;->s:Ly7/r$c;

    if-eqz v1, :cond_14

    invoke-virtual {v0}, Lz7/a;->a()Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v1, v0}, Ly7/r$c;->b(Landroid/graphics/RectF;)V

    :cond_14
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, v0}, Ly7/r;->l(F)V

    iget-object p0, p0, Ly7/r;->g:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->setShowPreview(Z)V

    return-void
.end method

.method public final i()Z
    .registers 3

    iget-object p0, p0, Ly7/r;->u:Landroid/animation/AnimatorSet;

    const/4 v0, 0x0

    if-eqz p0, :cond_d

    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_d

    return v1

    :cond_d
    return v0
.end method

.method public final j(F)V
    .registers 2

    invoke-virtual {p0}, Ly7/r;->i()Z

    return-void
.end method

.method public final k(F)V
    .registers 5

    invoke-virtual {p0}, Ly7/r;->i()Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_3f

    :cond_7
    const/4 v0, 0x1

    int-to-float v0, v0

    sub-float/2addr v0, p1

    iget-object p1, p0, Ly7/r;->d:Landroid/widget/Button;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Ly7/r;->e:Lcom/nothing/wallpaper/widget/RoundedOverlayImageView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Ly7/r;->p:Landroid/widget/ImageButton;

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Ly7/r;->r:Landroid/widget/TextView;

    const v1, 0x3dcccccd    # 0.1f

    invoke-static {v1, v0}, LB8/h;->e(FF)F

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Ly7/r;->q:Landroid/widget/TextView;

    invoke-static {v1, v0}, LB8/h;->e(FF)F

    move-result v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Ly7/r;->l:Lcom/android/launcher3/Workspace;

    iget-object v1, p0, Ly7/r;->t:Lcom/android/launcher3/f;

    iget v1, v1, Lcom/android/launcher3/f;->F:F

    mul-float/2addr v1, v0

    invoke-virtual {p1, v1}, Landroid/view/View;->setTranslationY(F)V

    iget-object p0, p0, Ly7/r;->f:Landroid/view/View;

    if-eqz p0, :cond_3f

    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    :cond_3f
    :goto_3f
    return-void
.end method
