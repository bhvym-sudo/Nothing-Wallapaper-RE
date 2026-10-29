.class public final Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$a;
    }
.end annotation


# static fields
.field public static final A:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$a;

.field private static final B:Landroid/view/animation/Interpolator;


# instance fields
.field private q:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

.field private r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

.field private s:Landroid/view/SurfaceView;

.field private t:Li3/M0;

.field private u:Landroid/view/View;

.field private v:Landroid/view/View;

.field private w:Z

.field private final x:Landroid/graphics/PointF;

.field private y:Landroid/app/WallpaperColors;

.field private z:Landroid/app/WallpaperColors;


# direct methods
.method static constructor <clinit>()V
    .registers 4

    new-instance v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->A:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$a;

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v3, v1, v1, v2}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->B:Landroid/view/animation/Interpolator;

    return-void
.end method

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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    new-instance p1, Landroid/graphics/PointF;

    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->x:Landroid/graphics/PointF;

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final A(Lg3/x;Lm8/e;)Ljava/lang/Object;
    .registers 6

    const/4 v0, 0x0

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1, v1}, Lg3/x;->b(Landroid/content/Context;)Ljava/util/concurrent/Future;

    move-result-object p1

    goto :goto_d

    :cond_c
    move-object p1, v0

    :goto_d
    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v1

    new-instance v2, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;

    invoke-direct {v2, p0, p1, v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$e;-><init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Ljava/util/concurrent/Future;Lm8/e;)V

    invoke-static {v1, v2, p2}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_21

    return-object p0

    :cond_21
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final C(Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Landroid/widget/ImageView;)Lh8/A;
    .registers 4

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final E(Lr6/g;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/widget/ImageView;)Lh8/A;
    .registers 5

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getSurfaceControl()Landroid/view/SurfaceControl;

    move-result-object p3

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    move-result-object p1

    const-string v0, "getSurfaceFrame(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3, p1}, Lr6/g;->n0(Landroid/view/SurfaceControl;Landroid/graphics/Rect;)V

    invoke-direct {p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->y()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final F(Z)V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    if-eqz v0, :cond_11

    if-eqz p1, :cond_d

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->w:Z

    if-eqz p0, :cond_d

    const/high16 p0, 0x3f800000    # 1.0f

    goto :goto_e

    :cond_d
    const/4 p0, 0x0

    :goto_e
    invoke-virtual {v0, p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->setAlpha(F)V

    :cond_11
    return-void
.end method

.method static synthetic G(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;ZILjava/lang/Object;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result p1

    :cond_8
    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->F(Z)V

    return-void
.end method

.method private static final I(Lr6/g;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/widget/ImageView;)Lh8/A;
    .registers 5

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getSurfaceControl()Landroid/view/SurfaceControl;

    move-result-object p3

    invoke-virtual {p1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    move-result-object p1

    const-string v0, "getSurfaceFrame(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3, p1}, Lr6/g;->n0(Landroid/view/SurfaceControl;Landroid/graphics/Rect;)V

    invoke-direct {p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->x()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final K(Landroid/graphics/Bitmap;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/widget/ImageView;)Lh8/A;
    .registers 4

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {p2}, Landroid/view/View;->isLaidOut()Z

    move-result p0

    if-eqz p0, :cond_18

    invoke-virtual {p2}, Landroid/view/View;->isLayoutRequested()Z

    move-result p0

    if-nez p0, :cond_18

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->o(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)V

    goto :goto_20

    :cond_18
    new-instance p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$f;

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$f;-><init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)V

    invoke-virtual {p2, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :goto_20
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static synthetic M(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/app/Activity;Lg3/x;Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Lm8/e;ILjava/lang/Object;)Ljava/lang/Object;
    .registers 14

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_5

    const/4 p3, 0x0

    :cond_5
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_c

    sget-object p4, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    :cond_c
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->L(Landroid/app/Activity;Lg3/x;Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final N(Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Lg3/x;Landroid/app/Activity;Landroid/widget/ImageView;)Lh8/A;
    .registers 7

    const-string v0, "it"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_11

    invoke-virtual {p5, p0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    invoke-virtual {p5, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-direct {p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->y()V

    goto :goto_19

    :cond_11
    new-instance p0, Lt7/j;

    invoke-direct {p0, p2}, Lt7/j;-><init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)V

    invoke-direct {p2, p3, p4, p5, p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->w(Lg3/x;Landroid/app/Activity;Landroid/widget/ImageView;Lv8/a;)V

    :goto_19
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final O(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Lh8/A;
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->y()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static synthetic a(Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Landroid/widget/ImageView;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->C(Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Landroid/widget/ImageView;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lr6/g;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/widget/ImageView;)Lh8/A;
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->E(Lr6/g;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/widget/ImageView;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroid/graphics/Bitmap;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/widget/ImageView;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->K(Landroid/graphics/Bitmap;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/widget/ImageView;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lr6/g;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/widget/ImageView;)Lh8/A;
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->I(Lr6/g;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/widget/ImageView;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Lg3/x;Landroid/app/Activity;Landroid/widget/ImageView;)Lh8/A;
    .registers 6

    invoke-static/range {p0 .. p5}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->N(Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Lg3/x;Landroid/app/Activity;Landroid/widget/ImageView;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->O(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;ZLandroid/animation/ValueAnimator;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->v(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;ZLandroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static final synthetic h(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Landroid/app/WallpaperColors;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->z:Landroid/app/WallpaperColors;

    return-object p0
.end method

.method public static final synthetic i()Landroid/view/animation/Interpolator;
    .registers 1

    sget-object v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->B:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method public static final synthetic j(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Li3/M0;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->t:Li3/M0;

    return-object p0
.end method

.method public static final synthetic k(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Landroid/graphics/PointF;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->x:Landroid/graphics/PointF;

    return-object p0
.end method

.method public static final synthetic l(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    return-object p0
.end method

.method public static final synthetic m(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->q:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    return-object p0
.end method

.method public static final synthetic n(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)Landroid/view/SurfaceView;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->s:Landroid/view/SurfaceView;

    return-object p0
.end method

.method public static final synthetic o(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->x()V

    return-void
.end method

.method public static final synthetic p(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/app/WallpaperColors;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->z:Landroid/app/WallpaperColors;

    return-void
.end method

.method public static final synthetic q(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Li3/M0;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->t:Li3/M0;

    return-void
.end method

.method private final s(Z)V
    .registers 5

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->y:Landroid/app/WallpaperColors;

    if-eqz v0, :cond_1d

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->z:Landroid/app/WallpaperColors;

    if-eqz v1, :cond_1d

    invoke-static {v1, v0}, LG6/h;->e(Landroid/app/WallpaperColors;Landroid/app/WallpaperColors;)Z

    move-result v2

    if-eqz v2, :cond_f

    goto :goto_10

    :cond_f
    const/4 v1, 0x0

    :goto_10
    if-eqz v1, :cond_1d

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->t:Li3/M0;

    if-eqz p0, :cond_1d

    if-eqz p1, :cond_19

    goto :goto_1a

    :cond_19
    move-object v0, v1

    :goto_1a
    invoke-static {p0, v0}, LG6/h;->j(Li3/M0;Landroid/app/WallpaperColors;)V

    :cond_1d
    return-void
.end method

.method static synthetic t(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;ZILjava/lang/Object;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result p1

    :cond_8
    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->s(Z)V

    return-void
.end method

.method private final u(Z)V
    .registers 8

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->u:Landroid/view/View;

    const-wide/16 v1, 0x190

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz v0, :cond_23

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz p1, :cond_11

    move v5, v3

    goto :goto_12

    :cond_11
    move v5, v4

    :goto_12
    invoke-virtual {v0, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    sget-object v5, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->B:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v5}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    :cond_23
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->v:Landroid/view/View;

    if-eqz v0, :cond_5e

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz p1, :cond_2e

    move v3, v4

    :cond_2e
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz p1, :cond_39

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->x:Landroid/graphics/PointF;

    iget v3, v3, Landroid/graphics/PointF;->x:F

    goto :goto_3a

    :cond_39
    move v3, v4

    :goto_3a
    invoke-virtual {v0, v3}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    if-eqz p1, :cond_44

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->x:Landroid/graphics/PointF;

    iget v4, v3, Landroid/graphics/PointF;->y:F

    :cond_44
    invoke-virtual {v0, v4}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    sget-object v1, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->B:Landroid/view/animation/Interpolator;

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lt7/d;

    invoke-direct {v1, p0, p1}, Lt7/d;-><init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Z)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    :cond_5e
    return-void
.end method

.method private static final v(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;ZLandroid/animation/ValueAnimator;)V
    .registers 4

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->w:Z

    if-eqz v0, :cond_26

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    if-eqz p0, :cond_26

    if-eqz p1, :cond_1f

    goto :goto_23

    :cond_1f
    const/4 p1, 0x1

    int-to-float p1, p1

    sub-float p2, p1, p2

    :goto_23
    invoke-virtual {p0, p2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->setAlpha(F)V

    :cond_26
    return-void
.end method

.method private final w(Lg3/x;Landroid/app/Activity;Landroid/widget/ImageView;Lv8/a;)V
    .registers 7

    if-eqz p1, :cond_3d

    invoke-static {p1}, LG6/e;->s(Lg3/x;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3d

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lg3/x;->o(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;

    move-result-object p1

    if-eqz p1, :cond_3d

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    const v0, 0x1010530

    invoke-static {p0, v0}, LH3/r;->a(Landroid/content/Context;I)I

    move-result p0

    invoke-virtual {p1, p2, p3, p0, v1}, Lcom/android/wallpaper/asset/a;->r(Landroid/app/Activity;Landroid/widget/ImageView;IZ)V

    invoke-virtual {p3}, Landroid/view/View;->isLaidOut()Z

    move-result p0

    if-eqz p0, :cond_35

    invoke-virtual {p3}, Landroid/view/View;->isLayoutRequested()Z

    move-result p0

    if-nez p0, :cond_35

    invoke-interface {p4}, Lv8/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_35
    new-instance p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$c;

    invoke-direct {p0, p4}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$c;-><init>(Lv8/a;)V

    invoke-virtual {p3, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_3d
    return-void
.end method

.method private final x()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_8
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->s:Landroid/view/SurfaceView;

    if-eqz p0, :cond_f

    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_f
    return-void
.end method

.method private final y()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->q:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_8
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->s:Landroid/view/SurfaceView;

    if-eqz p0, :cond_f

    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final B(Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;)V
    .registers 4

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scaleType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->q:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    if-eqz p0, :cond_16

    new-instance v0, Lt7/h;

    invoke-direct {v0, p1, p2}, Lt7/h;-><init>(Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->h(Lv8/l;)V

    :cond_16
    return-void
.end method

.method public final D(Lr6/g;Z)V
    .registers 5

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->q:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    if-eqz v0, :cond_11

    new-instance v1, Lt7/g;

    invoke-direct {v1, p1, v0, p0}, Lt7/g;-><init>(Lr6/g;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)V

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->h(Lv8/l;)V

    :cond_11
    const/4 p1, 0x1

    xor-int/2addr p2, p1

    iput-boolean p2, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->w:Z

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-static {p0, p2, p1, v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->G(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;ZILjava/lang/Object;)V

    return-void
.end method

.method public final H(Lr6/g;)V
    .registers 5

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->w:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v1, v0, v2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->G(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;ZILjava/lang/Object;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    if-eqz v0, :cond_19

    new-instance v1, Lt7/e;

    invoke-direct {v1, p1, v0, p0}, Lt7/e;-><init>(Lr6/g;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)V

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->h(Lv8/l;)V

    :cond_19
    return-void
.end method

.method public final J(Landroid/graphics/Bitmap;)V
    .registers 5

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->w:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v1, v0, v2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->G(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;ZILjava/lang/Object;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    if-eqz v0, :cond_19

    new-instance v1, Lt7/f;

    invoke-direct {v1, p1, p0}, Lt7/f;-><init>(Landroid/graphics/Bitmap;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;)V

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->h(Lv8/l;)V

    :cond_19
    return-void
.end method

.method public final L(Landroid/app/Activity;Lg3/x;Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Lm8/e;)Ljava/lang/Object;
    .registers 14

    instance-of v0, p5, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;

    if-eqz v0, :cond_13

    move-object v0, p5

    check-cast v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;

    iget v1, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->x:I

    goto :goto_18

    :cond_13
    new-instance v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;

    invoke-direct {v0, p0, p5}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;-><init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Lm8/e;)V

    :goto_18
    iget-object p5, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->v:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_4e

    if-ne v2, v3, :cond_46

    iget-object p0, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->u:Ljava/lang/Object;

    move-object p4, p0

    check-cast p4, Landroid/widget/ImageView$ScaleType;

    iget-object p0, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->t:Ljava/lang/Object;

    move-object p3, p0

    check-cast p3, Landroid/graphics/Bitmap;

    iget-object p0, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->s:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Lg3/x;

    iget-object p0, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->r:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Landroid/app/Activity;

    iget-object p0, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->q:Ljava/lang/Object;

    check-cast p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;

    invoke-static {p5}, Lh8/r;->b(Ljava/lang/Object;)V

    :cond_40
    move-object v5, p0

    move-object v7, p1

    move-object v6, p2

    move-object v3, p3

    move-object v4, p4

    goto :goto_64

    :cond_46
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4e
    invoke-static {p5}, Lh8/r;->b(Ljava/lang/Object;)V

    iput-object p0, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->q:Ljava/lang/Object;

    iput-object p1, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->r:Ljava/lang/Object;

    iput-object p2, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->s:Ljava/lang/Object;

    iput-object p3, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->t:Ljava/lang/Object;

    iput-object p4, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->u:Ljava/lang/Object;

    iput v3, v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$g;->x:I

    invoke-direct {p0, p2, v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->A(Lg3/x;Lm8/e;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_40

    return-object v1

    :goto_64
    iget-object p0, v5, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->q:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    if-eqz p0, :cond_70

    new-instance v2, Lt7/i;

    invoke-direct/range {v2 .. v7}, Lt7/i;-><init>(Landroid/graphics/Bitmap;Landroid/widget/ImageView$ScaleType;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Lg3/x;Landroid/app/Activity;)V

    invoke-virtual {p0, v2}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->h(Lv8/l;)V

    :cond_70
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method protected onFinishInflate()V
    .registers 4

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    const v0, 0x7f0a0530

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->q:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    const v0, 0x7f0a0532

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    const v0, 0x7f0a0551

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/SurfaceView;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->s:Landroid/view/SurfaceView;

    const v0, 0x7f0a051a

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->u:Landroid/view/View;

    const v0, 0x7f0a0401

    invoke-virtual {p0, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$d;

    invoke-direct {v1, p0, p0, v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$d;-><init>(Landroid/view/View;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroid/view/View;)V

    invoke-static {p0, v1}, Landroidx/core/view/y;->a(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/y;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->v:Landroid/view/View;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->G(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;ZILjava/lang/Object;)V

    return-void
.end method

.method public final r(Landroidx/lifecycle/x;LH3/q;)V
    .registers 10

    const-string v0, "lifecycleOwner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previewUtils"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v1

    new-instance v4, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, p2, v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$b;-><init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;Landroidx/lifecycle/x;LH3/q;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public setSelected(Z)V
    .registers 6

    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result v0

    if-eq p1, v0, :cond_33

    invoke-static {p0}, Landroidx/core/view/H;->M(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->u(Z)V

    goto :goto_2d

    :cond_10
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->u:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    if-eqz v0, :cond_1f

    if-eqz p1, :cond_1b

    move v3, v2

    goto :goto_1c

    :cond_1b
    move v3, v1

    :goto_1c
    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    :cond_1f
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->v:Landroid/view/View;

    if-eqz v0, :cond_2a

    if-eqz p1, :cond_26

    goto :goto_27

    :cond_26
    move v1, v2

    :goto_27
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    :cond_2a
    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->F(Z)V

    :goto_2d
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->t(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;ZILjava/lang/Object;)V

    :cond_33
    invoke-super {p0, p1}, Landroid/view/View;->setSelected(Z)V

    return-void
.end method

.method public final z(Landroid/app/WallpaperColors;)V
    .registers 4

    const-string v0, "color"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->y:Landroid/app/WallpaperColors;

    const/4 p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->t(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;ZILjava/lang/Object;)V

    return-void
.end method
