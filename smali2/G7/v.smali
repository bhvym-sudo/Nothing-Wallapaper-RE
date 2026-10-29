.class public final LG7/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG7/v$a;
    }
.end annotation


# static fields
.field public static final a:LG7/v;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LG7/v;

    invoke-direct {v0}, LG7/v;-><init>()V

    sput-object v0, LG7/v;->a:LG7/v;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lg3/v;Landroid/app/WallpaperColors;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LG7/v;->o(Lg3/v;Landroid/app/WallpaperColors;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/view/SurfaceView;Landroid/widget/ImageView;Lv8/a;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, LG7/v;->n(Landroid/view/SurfaceView;Landroid/widget/ImageView;Lv8/a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;)V
    .registers 2

    invoke-static {p0, p1}, LG7/v;->k(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;)V

    return-void
.end method

.method public static final synthetic d(ZLandroid/app/Activity;Landroidx/cardview/widget/CardView;Landroid/view/SurfaceView;)LH3/F;
    .registers 4

    invoke-static {p0, p1, p2, p3}, LG7/v;->l(ZLandroid/app/Activity;Landroidx/cardview/widget/CardView;Landroid/view/SurfaceView;)LH3/F;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lkotlin/jvm/internal/E;)Z
    .registers 1

    invoke-static {p0}, LG7/v;->m(Lkotlin/jvm/internal/E;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic f(Landroidx/lifecycle/x;Landroid/app/WallpaperManager;Lg3/v;)V
    .registers 3

    invoke-static {p0, p1, p2}, LG7/v;->p(Landroidx/lifecycle/x;Landroid/app/WallpaperManager;Lg3/v;)V

    return-void
.end method

.method public static final synthetic g()Z
    .registers 1

    invoke-static {}, LG7/v;->q()Z

    move-result v0

    return v0
.end method

.method public static final synthetic h(LG7/v;Lg3/k;Lv8/l;Landroid/view/SurfaceView;Lv8/a;)Ls6/h;
    .registers 5

    invoke-direct {p0, p1, p2, p3, p4}, LG7/v;->r(Lg3/k;Lv8/l;Landroid/view/SurfaceView;Lv8/a;)Ls6/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(LG7/v;Landroid/app/Activity;Lg3/x;Landroid/widget/ImageView;ZLjava/util/concurrent/atomic/AtomicBoolean;ZLv8/a;Lcom/android/wallpaper/asset/a$f;)V
    .registers 9

    invoke-direct/range {p0 .. p8}, LG7/v;->s(Landroid/app/Activity;Lg3/x;Landroid/widget/ImageView;ZLjava/util/concurrent/atomic/AtomicBoolean;ZLv8/a;Lcom/android/wallpaper/asset/a$f;)V

    return-void
.end method

.method public static final j(Landroid/app/Activity;Landroidx/cardview/widget/CardView;Lg3/v;Lv8/p;Landroidx/lifecycle/x;ZZLv8/a;Lcom/android/wallpaper/asset/a$f;)LG7/v$a;
    .registers 31

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v0, p2

    move-object/from16 v14, p7

    const-string v1, "activity"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "previewView"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "colorViewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "wallpaperInfoProvider"

    move-object/from16 v10, p3

    invoke-static {v10, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "lifecycleOwner"

    move-object/from16 v2, p4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onWallpaperShown"

    invoke-static {v14, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "loadCallback"

    move-object/from16 v15, p8

    invoke-static {v15, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f0a0530

    invoke-virtual {v8, v1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v1

    const-string v3, "requireViewById(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/SurfaceView;

    const v4, 0x7f0a00bc

    invoke-virtual {v8, v4}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v4

    check-cast v11, Landroid/widget/ImageView;

    const v4, 0x7f0a01e0

    invoke-virtual {v7, v4}, Landroid/app/Activity;->requireViewById(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/widget/ImageView;

    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    sget-object v4, LF2/F;->t:LF2/F$a;

    invoke-virtual {v4, v7}, LF2/F$a;->a(Landroid/content/Context;)LF2/F;

    move-result-object v4

    invoke-virtual {v4}, LF2/F;->Y()Z

    move-result v4

    if-eqz v4, :cond_6c

    const v4, 0x106001d

    goto :goto_6f

    :cond_6c
    const v4, 0x1060028

    :goto_6f
    invoke-static {v7, v4}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    new-instance v3, Lkotlin/jvm/internal/E;

    invoke-direct {v3}, Lkotlin/jvm/internal/E;-><init>()V

    new-instance v9, Lkotlin/jvm/internal/E;

    invoke-direct {v9}, Lkotlin/jvm/internal/E;-><init>()V

    new-instance v5, Lkotlin/jvm/internal/E;

    invoke-direct {v5}, Lkotlin/jvm/internal/E;-><init>()V

    new-instance v13, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v4, 0x0

    invoke-direct {v13, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v6, Lkotlin/jvm/internal/E;

    invoke-direct {v6}, Lkotlin/jvm/internal/E;-><init>()V

    new-instance v12, LG7/t;

    invoke-direct {v12, v1, v11, v14}, LG7/t;-><init>(Landroid/view/SurfaceView;Landroid/widget/ImageView;Lv8/a;)V

    new-instance v2, LG7/u;

    invoke-direct {v2, v0}, LG7/u;-><init>(Lg3/v;)V

    invoke-virtual {v1, v4}, Landroid/view/SurfaceView;->setZOrderOnTop(Z)V

    invoke-static {v7}, Landroid/app/WallpaperManager;->getInstance(Landroid/content/Context;)Landroid/app/WallpaperManager;

    move-result-object v16

    invoke-static/range {p4 .. p4}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v21

    new-instance v0, LG7/v$c;

    const/16 v20, 0x0

    move-object/from16 v17, p2

    move-object/from16 v18, v2

    move-object v4, v6

    move-object/from16 v19, v12

    move/from16 v12, p5

    move/from16 v6, p6

    move-object v2, v1

    move-object/from16 v1, p4

    invoke-direct/range {v0 .. v20}, LG7/v$c;-><init>(Landroidx/lifecycle/x;Landroid/view/SurfaceView;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;ZLandroid/app/Activity;Landroidx/cardview/widget/CardView;Lkotlin/jvm/internal/E;Lv8/p;Landroid/widget/ImageView;ZLjava/util/concurrent/atomic/AtomicBoolean;Lv8/a;Lcom/android/wallpaper/asset/a$f;Landroid/app/WallpaperManager;Lg3/v;Lv8/l;Lv8/a;Lm8/e;)V

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 p3, v0

    move/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p1, v3

    move-object/from16 p2, v4

    move-object/from16 p0, v21

    invoke-static/range {p0 .. p5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object v0

    new-instance v1, LG7/v$b;

    invoke-direct {v1, v0}, LG7/v$b;-><init>(LF8/x0;)V

    return-object v1
.end method

.method private static final k(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;)V
    .registers 2

    iget-object p0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p0, LF8/d0;

    if-eqz p0, :cond_9

    invoke-interface {p0}, LF8/d0;->dispose()V

    :cond_9
    iget-object p0, p1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p0, Ls6/i;

    if-eqz p0, :cond_12

    invoke-interface {p0}, Ls6/i;->a()V

    :cond_12
    const/4 p0, 0x0

    iput-object p0, p1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    return-void
.end method

.method private static final l(ZLandroid/app/Activity;Landroidx/cardview/widget/CardView;Landroid/view/SurfaceView;)LH3/F;
    .registers 10

    const/4 v0, 0x0

    if-eqz p0, :cond_16

    new-instance p0, Lg3/x$a;

    invoke-static {p1}, LG6/e;->f(Landroid/content/Context;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lg3/x$a;-><init>(Landroid/app/WallpaperColors;Ljava/lang/Integer;)V

    invoke-static {p0}, Ljava/util/concurrent/CompletableFuture;->completedFuture(Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;

    move-result-object p0

    :goto_14
    move-object v4, p0

    goto :goto_2b

    :cond_16
    new-instance p0, Lg3/x$a;

    const v1, 0x7f0600dd

    invoke-virtual {p1, v1}, Landroid/content/Context;->getColor(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lg3/x$a;-><init>(Landroid/app/WallpaperColors;Ljava/lang/Integer;)V

    invoke-static {p0}, Ljava/util/concurrent/CompletableFuture;->completedFuture(Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;

    move-result-object p0

    goto :goto_14

    :goto_2b
    new-instance v0, LH3/F;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v5, 0x0

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, LH3/F;-><init>(Landroid/content/Context;Landroid/view/View;Landroid/view/SurfaceView;Ljava/util/concurrent/Future;LH3/F$a;)V

    return-object v0
.end method

.method private static final m(Lkotlin/jvm/internal/E;)Z
    .registers 3

    iget-object p0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p0, Lg3/x;

    const/4 v0, 0x0

    if-eqz p0, :cond_f

    invoke-static {p0}, LG6/e;->i(Lg3/x;)Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_f

    return v1

    :cond_f
    return v0
.end method

.method private static final n(Landroid/view/SurfaceView;Landroid/widget/ImageView;Lv8/a;)Lh8/A;
    .registers 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    const/4 p0, 0x4

    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    invoke-interface {p2}, Lv8/a;->invoke()Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final o(Lg3/v;Landroid/app/WallpaperColors;)Lh8/A;
    .registers 2

    invoke-virtual {p0, p1}, Lg3/v;->j(Landroid/app/WallpaperColors;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final p(Landroidx/lifecycle/x;Landroid/app/WallpaperManager;Lg3/v;)V
    .registers 9

    invoke-static {p0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v0

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v1

    new-instance v3, LG7/v$d;

    const/4 p0, 0x0

    invoke-direct {v3, p1, p2, p0}, LG7/v$d;-><init>(Landroid/app/WallpaperManager;Lg3/v;Lm8/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private static final q()Z
    .registers 1

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    invoke-interface {v0}, Lh3/H;->C()Ld3/a;

    move-result-object v0

    invoke-virtual {v0}, Ld3/a;->p()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private final r(Lg3/k;Lv8/l;Landroid/view/SurfaceView;Lv8/a;)Ls6/h;
    .registers 16

    new-instance v4, LG7/v$e;

    invoke-direct {v4, p2, p4}, LG7/v$e;-><init>(Lv8/l;Lv8/a;)V

    sget-boolean p0, Lcom/android/launcher3/w;->i:Z

    const/4 p2, 0x1

    if-eqz p0, :cond_21

    new-instance v0, Ls6/h;

    sget-object v6, LH3/C$d;->r:LH3/C$d;

    invoke-virtual {p1}, Lg3/k;->A()Landroid/app/wallpaper/WallpaperDescription;

    move-result-object v8

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v7, 0x0

    move-object v1, p1

    move-object v2, p3

    invoke-direct/range {v0 .. v10}, Ls6/h;-><init>(Lg3/k;Landroid/view/SurfaceView;Landroid/view/SurfaceView;LH3/C$c;ILH3/C$d;ZLandroid/app/wallpaper/WallpaperDescription;ILkotlin/jvm/internal/h;)V

    invoke-virtual {v0, p2}, Ls6/h;->A(Z)V

    return-object v0

    :cond_21
    move-object v1, p1

    move-object v2, p3

    new-instance v0, Ls6/h;

    sget-object v6, LH3/C$d;->r:LH3/C$d;

    const/16 v9, 0xc0

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Ls6/h;-><init>(Lg3/k;Landroid/view/SurfaceView;Landroid/view/SurfaceView;LH3/C$c;ILH3/C$d;ZLandroid/app/wallpaper/WallpaperDescription;ILkotlin/jvm/internal/h;)V

    invoke-virtual {v0, p2}, Ls6/h;->A(Z)V

    return-object v0
.end method

.method private final s(Landroid/app/Activity;Lg3/x;Landroid/widget/ImageView;ZLjava/util/concurrent/atomic/AtomicBoolean;ZLv8/a;Lcom/android/wallpaper/asset/a$f;)V
    .registers 16

    if-nez p2, :cond_4

    goto/16 :goto_5d

    :cond_4
    invoke-virtual {p2, p1}, Lg3/x;->o(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;

    move-result-object v2

    const-string v0, "getThumbAsset(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_5d

    const/4 v0, 0x0

    const/4 v3, 0x1

    invoke-virtual {p5, v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v4

    if-nez v4, :cond_1c

    goto :goto_5d

    :cond_1c
    invoke-virtual {p3}, Landroid/view/View;->isLaidOut()Z

    move-result v4

    if-eqz v4, :cond_48

    invoke-virtual {p3}, Landroid/view/View;->isLayoutRequested()Z

    move-result v4

    if-nez v4, :cond_48

    move v4, v0

    new-instance v0, Lcom/android/wallpaper/asset/d;

    invoke-direct {v0, p1, v2}, Lcom/android/wallpaper/asset/d;-><init>(Landroid/content/Context;Lcom/android/wallpaper/asset/a;)V

    move v5, v3

    invoke-static {p1}, LG6/e;->f(Landroid/content/Context;)I

    move-result v3

    instance-of v2, v2, Lcom/android/wallpaper/asset/h;

    if-eqz v2, :cond_3f

    if-eqz p4, :cond_3a

    goto :goto_3f

    :cond_3a
    move-object v1, p1

    move-object v2, p3

    move v5, p6

    move-object v6, p8

    goto :goto_44

    :cond_3f
    :goto_3f
    move v4, v5

    move-object v1, p1

    move-object v2, p3

    move-object v6, p8

    move v5, p6

    :goto_44
    invoke-virtual/range {v0 .. v6}, Lcom/android/wallpaper/asset/a;->s(Landroid/app/Activity;Landroid/widget/ImageView;IZZLcom/android/wallpaper/asset/a$f;)V

    goto :goto_55

    :cond_48
    new-instance v0, LG7/v$f;

    move-object v1, p1

    move-object v3, p3

    move v4, p4

    move v5, p6

    move-object v6, p8

    invoke-direct/range {v0 .. v6}, LG7/v$f;-><init>(Landroid/app/Activity;Lcom/android/wallpaper/asset/a;Landroid/widget/ImageView;ZZLcom/android/wallpaper/asset/a$f;)V

    invoke-virtual {p3, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :goto_55
    new-instance v0, LG7/v$g;

    invoke-direct {v0, p7}, LG7/v$g;-><init>(Lv8/a;)V

    invoke-virtual {p3, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_5d
    :goto_5d
    return-void
.end method
