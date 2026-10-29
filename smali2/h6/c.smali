.class public final Lh6/c;
.super Lcom/android/wallpaper/asset/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh6/c$a;
    }
.end annotation


# instance fields
.field private final b:Landroid/content/res/Resources;

.field private final c:I

.field private final d:Ljava/lang/String;

.field private final e:Ljava/util/concurrent/ExecutorService;

.field private f:Lcom/bumptech/glide/load/Key;

.field private final g:I

.field private final h:Lcom/bumptech/glide/request/RequestOptions;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;ILjava/lang/String;)V
    .registers 5

    const-string v0, "res"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/android/wallpaper/asset/a;-><init>()V

    iput-object p1, p0, Lh6/c;->b:Landroid/content/res/Resources;

    iput p2, p0, Lh6/c;->c:I

    iput-object p3, p0, Lh6/c;->d:Ljava/lang/String;

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object p3

    iput-object p3, p0, Lh6/c;->e:Ljava/util/concurrent/ExecutorService;

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p1

    iput p1, p0, Lh6/c;->g:I

    invoke-static {}, Lcom/bumptech/glide/request/RequestOptions;->centerCropTransform()Lcom/bumptech/glide/request/RequestOptions;

    move-result-object p1

    const-string p2, "centerCropTransform(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh6/c;->h:Lcom/bumptech/glide/request/RequestOptions;

    return-void
.end method

.method public static synthetic t(IILh6/c;Lcom/android/wallpaper/asset/a$d;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lh6/c;->x(IILh6/c;Lcom/android/wallpaper/asset/a$d;)V

    return-void
.end method

.method public static synthetic u(IILh6/c;Lcom/android/wallpaper/asset/a$d;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lh6/c;->w(IILh6/c;Lcom/android/wallpaper/asset/a$d;)V

    return-void
.end method

.method private final v()Landroid/graphics/Point;
    .registers 1

    sget-object p0, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object p0

    invoke-static {p0}, Li6/q;->d(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p0

    return-object p0
.end method

.method private static final w(IILh6/c;Lcom/android/wallpaper/asset/a$d;)V
    .registers 5

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p0, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    const-string p1, "createBitmap(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p2, Lh6/c;->g:I

    invoke-virtual {p0, p1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    invoke-virtual {p2, p3, p0}, Lcom/android/wallpaper/asset/a;->h(Lcom/android/wallpaper/asset/a$d;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private static final x(IILh6/c;Lcom/android/wallpaper/asset/a$d;)V
    .registers 5

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p0, p1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    const-string p1, "createBitmap(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p2, Lh6/c;->g:I

    invoke-virtual {p0, p1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    invoke-virtual {p2, p3, p0}, Lcom/android/wallpaper/asset/a;->h(Lcom/android/wallpaper/asset/a$d;Landroid/graphics/Bitmap;)V

    return-void
.end method


# virtual methods
.method public g(IIZLcom/android/wallpaper/asset/a$d;)V
    .registers 6

    const-string p3, "receiver"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Lh6/c;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lh6/b;

    invoke-direct {v0, p1, p2, p0, p4}, Lh6/b;-><init>(IILh6/c;Lcom/android/wallpaper/asset/a$d;)V

    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public i(Landroid/graphics/Rect;IIZLcom/android/wallpaper/asset/a$d;)V
    .registers 6

    const-string p1, "receiver"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lh6/c;->e:Ljava/util/concurrent/ExecutorService;

    new-instance p4, Lh6/a;

    invoke-direct {p4, p2, p3, p0, p5}, Lh6/a;-><init>(IILh6/c;Lcom/android/wallpaper/asset/a$d;)V

    invoke-interface {p1, p4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public j(Landroid/app/Activity;Lcom/android/wallpaper/asset/a$e;)V
    .registers 3

    const-string p1, "receiver"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lh6/c;->v()Landroid/graphics/Point;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/android/wallpaper/asset/a$e;->a(Landroid/graphics/Point;)V

    return-void
.end method

.method public n(Landroid/content/Context;Landroid/widget/ImageView;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/RequestManager;->asDrawable()Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    iget-object p0, p0, Lh6/c;->h:Lcom/bumptech/glide/request/RequestOptions;

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/request/BaseRequestOptions;->placeholder(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/bumptech/glide/RequestBuilder;->apply(Lcom/bumptech/glide/request/BaseRequestOptions;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p0

    invoke-static {}, Lcom/bumptech/glide/load/resource/drawable/DrawableTransitionOptions;->withCrossFade()Lcom/bumptech/glide/load/resource/drawable/DrawableTransitionOptions;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/RequestBuilder;->transition(Lcom/bumptech/glide/TransitionOptions;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public q(Landroid/app/Activity;Landroid/widget/ImageView;ILcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;)V
    .registers 7

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transformation"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/bumptech/glide/load/MultiTransformation;

    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/FitCenter;

    invoke-direct {v1}, Lcom/bumptech/glide/load/resource/bitmap/FitCenter;-><init>()V

    filled-new-array {v1, p4}, [Lcom/bumptech/glide/load/Transformation;

    move-result-object p4

    invoke-direct {v0, p4}, Lcom/bumptech/glide/load/MultiTransformation;-><init>([Lcom/bumptech/glide/load/Transformation;)V

    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(Landroid/app/Activity;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/RequestManager;->asDrawable()Lcom/bumptech/glide/RequestBuilder;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/bumptech/glide/RequestBuilder;->load(Ljava/lang/Object;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p0

    invoke-static {v0}, Lcom/bumptech/glide/request/RequestOptions;->bitmapTransform(Lcom/bumptech/glide/load/Transformation;)Lcom/bumptech/glide/request/RequestOptions;

    move-result-object p1

    new-instance p4, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {p4, p3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, p4}, Lcom/bumptech/glide/request/BaseRequestOptions;->placeholder(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/RequestBuilder;->apply(Lcom/bumptech/glide/request/BaseRequestOptions;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    return-void
.end method

.method public final y()Lcom/bumptech/glide/load/Key;
    .registers 5

    iget-object v0, p0, Lh6/c;->f:Lcom/bumptech/glide/load/Key;

    if-nez v0, :cond_1c

    new-instance v0, Lh6/c$a;

    iget-object v1, p0, Lh6/c;->b:Landroid/content/res/Resources;

    iget v2, p0, Lh6/c;->c:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getResourcePackageName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget v2, p0, Lh6/c;->c:I

    iget-object v3, p0, Lh6/c;->d:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lh6/c$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    iput-object v0, p0, Lh6/c;->f:Lcom/bumptech/glide/load/Key;

    :cond_1c
    return-object v0
.end method

.method public final z()Landroid/graphics/drawable/Drawable;
    .registers 2

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    iget p0, p0, Lh6/c;->g:I

    invoke-direct {v0, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    return-object v0
.end method
