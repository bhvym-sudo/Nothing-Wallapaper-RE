.class public final Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;
.super Landroid/view/SurfaceView;
.source "SourceFile"


# instance fields
.field private q:LH3/F;

.field private final r:Ljava/util/ArrayList;

.field private s:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 11

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->r:Ljava/util/ArrayList;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 5
    iput p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->s:F

    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Landroid/view/SurfaceView;->setZOrderOnTop(Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V
    .registers 8

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_b

    move p3, v0

    :cond_b
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_10

    move p4, v0

    .line 2
    :cond_10
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic a(Lv8/l;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->i(Lv8/l;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;)V

    return-void
.end method

.method public static synthetic b(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;)V
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->d(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;)V

    return-void
.end method

.method private static final d(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;)V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->r:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_6

    :cond_16
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->r:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->f(Z)V

    return-void
.end method

.method private final f(Z)V
    .registers 4

    if-nez p1, :cond_d

    iget p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->s:F

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v0

    cmpg-float p1, p1, v0

    if-nez p1, :cond_d

    return-void

    :cond_d
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getSurfaceControl()Landroid/view/SurfaceControl;

    move-result-object p1

    if-eqz p1, :cond_4f

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getSurfaceControl()Landroid/view/SurfaceControl;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/SurfaceControl;->isValid()Z

    move-result p1

    if-eqz p1, :cond_4f

    new-instance p1, Landroid/view/SurfaceControl$Transaction;

    invoke-direct {p1}, Landroid/view/SurfaceControl$Transaction;-><init>()V

    :try_start_22
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getSurfaceControl()Landroid/view/SurfaceControl;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/view/SurfaceControl$Transaction;->setAlpha(Landroid/view/SurfaceControl;F)Landroid/view/SurfaceControl$Transaction;

    invoke-virtual {p0}, Landroid/view/SurfaceView;->getViewRootImpl()Landroid/view/ViewRootImpl;

    move-result-object v0

    if-eqz v0, :cond_39

    invoke-virtual {v0, p1}, Landroid/view/ViewRootImpl;->applyTransactionOnDraw(Landroid/view/SurfaceControl$Transaction;)Z

    goto :goto_3e

    :catchall_37
    move-exception p0

    goto :goto_49

    :cond_39
    invoke-virtual {p1}, Landroid/view/SurfaceControl$Transaction;->apply()V

    sget-object v0, Lh8/A;->a:Lh8/A;
    :try_end_3e
    .catchall {:try_start_22 .. :try_end_3e} :catchall_37

    :goto_3e
    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result p1

    iput p1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->s:F

    return-void

    :goto_49
    :try_start_49
    throw p0
    :try_end_4a
    .catchall {:try_start_49 .. :try_end_4a} :catchall_4a

    :catchall_4a
    move-exception v0

    invoke-static {p1, p0}, Ls8/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_4f
    return-void
.end method

.method static synthetic g(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;ZILjava/lang/Object;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_5

    const/4 p1, 0x0

    :cond_5
    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->f(Z)V

    return-void
.end method

.method private static final i(Lv8/l;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;)V
    .registers 2

    iget-object p1, p1, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->q:LH3/F;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, LH3/F;->c()Landroid/widget/ImageView;

    move-result-object p1

    goto :goto_a

    :cond_9
    const/4 p1, 0x0

    :goto_a
    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c()V
    .registers 7

    new-instance v0, LH3/F;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lg3/x$a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "getContext(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, LG6/e;->f(Landroid/content/Context;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v2, v4, v3}, Lg3/x$a;-><init>(Landroid/app/WallpaperColors;Ljava/lang/Integer;)V

    invoke-static {v2}, Ljava/util/concurrent/CompletableFuture;->completedFuture(Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;

    move-result-object v4

    new-instance v5, Lt7/b;

    invoke-direct {v5, p0}, Lt7/b;-><init>(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;)V

    move-object v3, p0

    move-object v2, p0

    invoke-direct/range {v0 .. v5}, LH3/F;-><init>(Landroid/content/Context;Landroid/view/View;Landroid/view/SurfaceView;Ljava/util/concurrent/Future;LH3/F$a;)V

    iput-object v0, v2, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->q:LH3/F;

    invoke-virtual {v2}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object p0

    iget-object v0, v2, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->q:LH3/F;

    invoke-interface {p0, v0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    const/4 p0, 0x1

    invoke-virtual {v2, p0}, Landroid/view/SurfaceView;->setZOrderMediaOverlay(Z)V

    return-void
.end method

.method public final e()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->q:LH3/F;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LH3/F;->b()V

    :cond_7
    invoke-virtual {p0}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->q:LH3/F;

    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->q:LH3/F;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->r:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final h(Lv8/l;)V
    .registers 4

    const-string v0, "callBackView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->q:LH3/F;

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, LH3/F;->d()Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_11

    :cond_10
    const/4 v0, 0x0

    :goto_11
    if-eqz v0, :cond_1e

    invoke-virtual {v0}, LH3/F;->c()Landroid/widget/ImageView;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p1, p0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1e
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->r:Ljava/util/ArrayList;

    new-instance v1, Lt7/c;

    invoke-direct {v1, p1, p0}, Lt7/c;-><init>(Lv8/l;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public setAlpha(F)V
    .registers 4

    invoke-super {p0, p1}, Landroid/view/SurfaceView;->setAlpha(F)V

    const/4 p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->g(Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;ZILjava/lang/Object;)V

    return-void
.end method
