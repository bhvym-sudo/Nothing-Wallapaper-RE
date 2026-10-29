.class public final Lo7/g;
.super Lo7/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo7/g$c;
    }
.end annotation


# static fields
.field public static final C:Lo7/g$c;


# instance fields
.field private A:I

.field private final B:Lo7/g$k;

.field private final j:Lp7/a;

.field private final k:Lx6/k;

.field private final l:LD6/e;

.field private final m:Landroidx/lifecycle/Q;

.field private final n:Lq6/b;

.field private final o:LF8/o0;

.field private final p:Lcom/android/wallpaper/asset/a;

.field private final q:Lo7/i;

.field private final r:LI8/A;

.field private final s:LI8/A;

.field private final t:LI8/O;

.field private final u:LI8/f;

.field private final v:LI8/f;

.field private final w:LI8/f;

.field private x:LF8/x0;

.field private final y:Lh8/h;

.field private final z:Lh8/h;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lo7/g$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo7/g$c;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lo7/g;->C:Lo7/g$c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lg3/x;Lp7/a;Lx6/k;LD6/e;Landroidx/lifecycle/Q;)V
    .registers 15

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editFrom"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "assetManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmapDataSource"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lo7/b;-><init>(Landroid/content/Context;Lg3/x;)V

    iput-object p3, p0, Lo7/g;->j:Lp7/a;

    iput-object p4, p0, Lo7/g;->k:Lx6/k;

    iput-object p5, p0, Lo7/g;->l:LD6/e;

    iput-object p6, p0, Lo7/g;->m:Landroidx/lifecycle/Q;

    new-instance p3, Lq6/b;

    const-string v0, "ImageCropViewModel"

    invoke-direct {p3, v0}, Lq6/b;-><init>(Ljava/lang/String;)V

    iput-object p3, p0, Lo7/g;->n:Lq6/b;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    const-string v2, "newSingleThreadExecutor(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, LF8/q0;->a(Ljava/util/concurrent/ExecutorService;)LF8/o0;

    move-result-object v1

    iput-object v1, p0, Lo7/g;->o:LF8/o0;

    invoke-static {p2, p1}, LG6/e;->e(Lg3/x;Landroid/content/Context;)Lcom/android/wallpaper/asset/a;

    move-result-object p1

    iput-object p1, p0, Lo7/g;->p:Lcom/android/wallpaper/asset/a;

    new-instance p1, Lo7/i;

    invoke-virtual {p2}, Lg3/x;->k()LC6/g;

    move-result-object v1

    invoke-direct {p1, v1, p6}, Lo7/i;-><init>(LC6/g;Landroidx/lifecycle/Q;)V

    iput-object p1, p0, Lo7/g;->q:Lo7/i;

    sget-object p6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p6}, LI8/Q;->a(Ljava/lang/Object;)LI8/A;

    move-result-object p6

    iput-object p6, p0, Lo7/g;->r:LI8/A;

    const/4 v1, 0x0

    invoke-static {v1}, LI8/Q;->a(Ljava/lang/Object;)LI8/A;

    move-result-object v2

    iput-object v2, p0, Lo7/g;->s:LI8/A;

    invoke-static {v2}, LI8/h;->b(LI8/A;)LI8/O;

    move-result-object v2

    iput-object v2, p0, Lo7/g;->t:LI8/O;

    invoke-interface {p5}, LD6/e;->F0()LI8/f;

    move-result-object v2

    new-instance v3, Lo7/g$e;

    invoke-direct {v3, p0, v1}, Lo7/g$e;-><init>(Lo7/g;Lm8/e;)V

    invoke-static {v2, p6, v3}, LI8/h;->B(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object v2

    iput-object v2, p0, Lo7/g;->u:LI8/f;

    invoke-interface {p5}, LD6/e;->M()LI8/f;

    move-result-object v2

    new-instance v3, Lo7/g$d;

    invoke-direct {v3, p0, v1}, Lo7/g$d;-><init>(Lo7/g;Lm8/e;)V

    invoke-static {v2, p6, v3}, LI8/h;->B(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object p6

    iput-object p6, p0, Lo7/g;->v:LI8/f;

    invoke-interface {p5}, LD6/f;->S()LI8/f;

    move-result-object p5

    iput-object p5, p0, Lo7/g;->w:LI8/f;

    new-instance p5, Lo7/c;

    invoke-direct {p5, p2}, Lo7/c;-><init>(Lg3/x;)V

    invoke-static {p5}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p5

    iput-object p5, p0, Lo7/g;->y:Lh8/h;

    new-instance p5, Lo7/d;

    invoke-direct {p5}, Lo7/d;-><init>()V

    invoke-static {p5}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p5

    iput-object p5, p0, Lo7/g;->z:Lh8/h;

    new-instance p5, Lo7/g$k;

    invoke-direct {p5, p0}, Lo7/g$k;-><init>(Lo7/g;)V

    iput-object p5, p0, Lo7/g;->B:Lo7/g$k;

    invoke-virtual {p2}, Lg3/x;->k()LC6/g;

    move-result-object p5

    if-eqz p5, :cond_b3

    invoke-virtual {p5}, LC6/g;->c()Ljava/lang/String;

    move-result-object p5

    goto :goto_b4

    :cond_b3
    move-object p5, v1

    :goto_b4
    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "restore from effectInfo "

    invoke-virtual {p6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {v0, p5}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p5, Lo7/e;

    invoke-direct {p5, p0}, Lo7/e;-><init>(Lo7/g;)V

    invoke-virtual {p4, p5}, Lx6/k;->B(Lv8/a;)V

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v2

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v3

    new-instance v5, Lo7/g$a;

    invoke-direct {v5, p0, p2, v1}, Lo7/g$a;-><init>(Lo7/g;Lg3/x;Lm8/e;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    new-instance p2, Lo7/f;

    invoke-direct {p2, p0}, Lo7/f;-><init>(Lo7/g;)V

    invoke-virtual {p1, p2}, Lo7/i;->n(Lv8/l;)V

    invoke-direct {p0}, Lo7/g;->g0()Landroid/graphics/Point;

    move-result-object p1

    if-eqz p1, :cond_111

    invoke-direct {p0}, Lo7/g;->d0()Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_111

    const-string p1, "restore viewSize and previewScale from savedInstance."

    invoke-virtual {p3, p1}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lo7/g;->g0()Landroid/graphics/Point;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0}, Lo7/g;->d0()Ljava/lang/Float;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-direct {p0, p1, p2}, Lo7/g;->o0(Landroid/graphics/Point;F)V

    :cond_111
    return-void
.end method

.method private static final A(Lo7/g;)Lh8/A;
    .registers 2

    invoke-virtual {p0}, Lo7/b;->i()Landroidx/lifecycle/H;

    move-result-object p0

    sget-object v0, Lm7/a$a;->a:Lm7/a$a;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/H;->l(Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final B(Lo7/g;Lcom/nothing/wallpaper/effects/data/model/ViewScope;)Lh8/A;
    .registers 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v2

    new-instance v4, Lo7/g$b;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lo7/g$b;-><init>(Lo7/g;Lcom/nothing/wallpaper/effects/data/model/ViewScope;Lm8/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static final synthetic C(Lo7/g;Landroid/graphics/Bitmap;)Lcom/davemorrissey/labs/subscaleview/ImageSource;
    .registers 2

    invoke-direct {p0, p1}, Lo7/g;->T(Landroid/graphics/Bitmap;)Lcom/davemorrissey/labs/subscaleview/ImageSource;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D(Lo7/g;)Lx6/k;
    .registers 1

    iget-object p0, p0, Lo7/g;->k:Lx6/k;

    return-object p0
.end method

.method public static final synthetic E(Lo7/g;)LD6/e;
    .registers 1

    iget-object p0, p0, Lo7/g;->l:LD6/e;

    return-object p0
.end method

.method public static final synthetic F(Lo7/g;)LI8/A;
    .registers 1

    iget-object p0, p0, Lo7/g;->r:LI8/A;

    return-object p0
.end method

.method public static final synthetic G(Lo7/g;)Z
    .registers 1

    invoke-direct {p0}, Lo7/g;->X()Z

    move-result p0

    return p0
.end method

.method public static final synthetic H(Lo7/g;)Lp7/a;
    .registers 1

    iget-object p0, p0, Lo7/g;->j:Lp7/a;

    return-object p0
.end method

.method public static final synthetic I(Lo7/g;)Lq6/b;
    .registers 1

    iget-object p0, p0, Lo7/g;->n:Lq6/b;

    return-object p0
.end method

.method public static final synthetic J(Lo7/g;)I
    .registers 1

    iget p0, p0, Lo7/g;->A:I

    return p0
.end method

.method public static final synthetic K(Lo7/g;)Lcom/nothing/wallpaper/segmenter/Segmenter;
    .registers 1

    invoke-direct {p0}, Lo7/g;->f0()Lcom/nothing/wallpaper/segmenter/Segmenter;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic L(Lo7/g;)Lo7/g$k;
    .registers 1

    iget-object p0, p0, Lo7/g;->B:Lo7/g$k;

    return-object p0
.end method

.method public static final synthetic M(Lo7/g;)Lo7/i;
    .registers 1

    iget-object p0, p0, Lo7/g;->q:Lo7/i;

    return-object p0
.end method

.method public static final synthetic N(Lo7/g;)LI8/A;
    .registers 1

    iget-object p0, p0, Lo7/g;->s:LI8/A;

    return-object p0
.end method

.method public static final synthetic O(Lo7/g;Landroid/graphics/Bitmap;)Z
    .registers 2

    invoke-direct {p0, p1}, Lo7/g;->h0(Landroid/graphics/Bitmap;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic P(Lo7/g;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-direct {p0}, Lo7/g;->i0()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic Q(Lo7/g;I)V
    .registers 2

    iput p1, p0, Lo7/g;->A:I

    return-void
.end method

.method public static final synthetic R(Lo7/g;)V
    .registers 1

    invoke-direct {p0}, Lo7/g;->r0()V

    return-void
.end method

.method public static final synthetic S(Lo7/g;Landroid/graphics/Bitmap;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0, p1, p2}, Lo7/g;->s0(Landroid/graphics/Bitmap;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final T(Landroid/graphics/Bitmap;)Lcom/davemorrissey/labs/subscaleview/ImageSource;
    .registers 7

    invoke-direct {p0, p1}, Lo7/g;->h0(Landroid/graphics/Bitmap;)Z

    move-result v0

    const-string v1, "cachedBitmap(...)"

    if-nez v0, :cond_10

    invoke-static {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->cachedBitmap(Landroid/graphics/Bitmap;)Lcom/davemorrissey/labs/subscaleview/ImageSource;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_10
    iget-object v0, p0, Lo7/g;->p:Lcom/android/wallpaper/asset/a;

    instance-of v2, v0, Lx6/c;

    const-string v3, "uri(...)"

    const/4 v4, 0x1

    if-nez v2, :cond_3e

    instance-of v2, v0, Lcom/android/wallpaper/asset/h;

    if-eqz v2, :cond_1e

    goto :goto_3e

    :cond_1e
    instance-of p0, v0, Lcom/android/wallpaper/asset/g;

    if-eqz p0, :cond_33

    check-cast v0, Lcom/android/wallpaper/asset/g;

    invoke-virtual {v0}, Lcom/android/wallpaper/asset/g;->U()Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->uri(Landroid/net/Uri;)Lcom/davemorrissey/labs/subscaleview/ImageSource;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->setLargeBmp(Z)V

    return-object p0

    :cond_33
    invoke-static {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->cachedBitmap(Landroid/graphics/Bitmap;)Lcom/davemorrissey/labs/subscaleview/ImageSource;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->setLargeBmp(Z)V

    return-object p0

    :cond_3e
    :goto_3e
    invoke-virtual {p0}, Lo7/g;->Z()Lw6/b;

    move-result-object p0

    instance-of v0, p0, Lw6/b$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_4a

    check-cast p0, Lw6/b$a;

    goto :goto_4b

    :cond_4a
    move-object p0, v1

    :goto_4b
    if-eqz p0, :cond_52

    invoke-virtual {p0}, Lw6/b$a;->a()Lcom/android/wallpaper/asset/a;

    move-result-object p0

    goto :goto_53

    :cond_52
    move-object p0, v1

    :goto_53
    instance-of v0, p0, Lx6/g;

    if-eqz v0, :cond_5a

    check-cast p0, Lx6/g;

    goto :goto_5b

    :cond_5a
    move-object p0, v1

    :goto_5b
    if-eqz p0, :cond_61

    invoke-virtual {p0}, Lx6/g;->S()Landroid/net/Uri;

    move-result-object v1

    :cond_61
    if-eqz v1, :cond_6e

    invoke-static {v1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->uri(Landroid/net/Uri;)Lcom/davemorrissey/labs/subscaleview/ImageSource;

    move-result-object p0

    invoke-static {p0, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->setLargeBmp(Z)V

    return-object p0

    :cond_6e
    invoke-static {p1}, Lcom/davemorrissey/labs/subscaleview/ImageSource;->cachedBitmap(Landroid/graphics/Bitmap;)Lcom/davemorrissey/labs/subscaleview/ImageSource;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final U(Lg3/x;)Z
    .registers 1

    invoke-virtual {p0}, Lg3/x;->s()Z

    move-result p0

    if-nez p0, :cond_16

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p0

    invoke-interface {p0}, Lh3/H;->C()Ld3/a;

    move-result-object p0

    invoke-virtual {p0}, Ld3/a;->p()Z

    move-result p0

    if-eqz p0, :cond_16

    const/4 p0, 0x1

    return p0

    :cond_16
    const/4 p0, 0x0

    return p0
.end method

.method private final X()Z
    .registers 1

    iget-object p0, p0, Lo7/g;->y:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private final d0()Ljava/lang/Float;
    .registers 2

    iget-object p0, p0, Lo7/g;->m:Landroidx/lifecycle/Q;

    const-string v0, "key_preview_scale"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    return-object p0
.end method

.method private final f0()Lcom/nothing/wallpaper/segmenter/Segmenter;
    .registers 1

    iget-object p0, p0, Lo7/g;->z:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/segmenter/Segmenter;

    return-object p0
.end method

.method private final g0()Landroid/graphics/Point;
    .registers 2

    iget-object p0, p0, Lo7/g;->m:Landroidx/lifecycle/Q;

    const-string v0, "key_view_size"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Point;

    return-object p0
.end method

.method private final h0(Landroid/graphics/Bitmap;)Z
    .registers 3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object p0

    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    if-ne p0, v0, :cond_a

    const/4 p0, 0x2

    goto :goto_b

    :cond_a
    const/4 p0, 0x4

    :goto_b
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    mul-int/2addr v0, p1

    mul-int/2addr v0, p0

    const/high16 p0, 0x3c00000

    if-le v0, p0, :cond_1b

    const/4 p0, 0x1

    return p0

    :cond_1b
    const/4 p0, 0x0

    return p0
.end method

.method private final i0()Landroid/graphics/Bitmap;
    .registers 5

    iget-object v0, p0, Lo7/g;->k:Lx6/k;

    invoke-virtual {v0}, Lx6/k;->m()Lw6/d;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Lw6/d;->c()Lw6/b;

    move-result-object v0

    if-eqz v0, :cond_15

    const/4 v3, 0x2

    invoke-static {v0, v2, v2, v3, v1}, LG6/a;->c(Lw6/b;ZZILjava/lang/Object;)Landroid/graphics/Bitmap;

    move-result-object v1

    :cond_15
    if-nez v1, :cond_6b

    invoke-virtual {p0}, Lo7/b;->j()Lg3/x;

    move-result-object v0

    invoke-virtual {v0}, Lg3/x;->k()LC6/g;

    move-result-object v0

    if-nez v0, :cond_6b

    sget-object v0, Lj7/j;->T:Lj7/j$a;

    invoke-virtual {p0}, Lo7/b;->f()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v3}, Lj7/j$a;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6b

    invoke-virtual {p0}, Lo7/b;->f()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wallpaper"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.WallpaperManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/WallpaperManager;

    invoke-virtual {p0}, Lo7/b;->f()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getUserId()I

    move-result v1

    invoke-static {v0, v1, v2}, Ln6/e;->a(Landroid/app/WallpaperManager;IZ)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_51

    iget-object p0, p0, Lo7/g;->k:Lx6/k;

    invoke-virtual {p0, v0}, Lx6/k;->A(Landroid/graphics/Bitmap;)V

    :cond_51
    if-eqz v0, :cond_54

    const/4 v2, 0x1

    :cond_54
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "loadDepthBitmap from system success:"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "ImageCropViewModel"

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_6b
    return-object v1
.end method

.method public static synthetic l0(Lo7/g;ZILjava/lang/Object;)V
    .registers 4

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_5

    const/4 p1, 0x0

    :cond_5
    invoke-virtual {p0, p1}, Lo7/g;->k0(Z)V

    return-void
.end method

.method private final o0(Landroid/graphics/Point;F)V
    .registers 10

    invoke-direct {p0}, Lo7/g;->r0()V

    iget-object v0, p0, Lo7/g;->l:LD6/e;

    invoke-interface {v0, p1, p2}, LD6/e;->m(Landroid/graphics/Point;F)V

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    new-instance v4, Lo7/g$h;

    const/4 p1, 0x0

    invoke-direct {v4, p0, p1}, Lo7/g$h;-><init>(Lo7/g;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-direct {p0}, Lo7/g;->t0()V

    return-void
.end method

.method private final p0(Landroid/graphics/Bitmap;Lm8/e;)Ljava/lang/Object;
    .registers 6

    iget-object v0, p0, Lo7/g;->o:LF8/o0;

    new-instance v1, Lo7/g$i;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lo7/g$i;-><init>(Lo7/g;Landroid/graphics/Bitmap;Lm8/e;)V

    invoke-static {v0, v1, p2}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final q0()Lcom/nothing/wallpaper/segmenter/Segmenter;
    .registers 1

    invoke-static {}, LP7/b;->c()Lcom/nothing/wallpaper/segmenter/Segmenter;

    move-result-object v0

    return-object v0
.end method

.method private final r0()V
    .registers 8

    invoke-direct {p0}, Lo7/g;->g0()Landroid/graphics/Point;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    new-instance v4, Lo7/g$j;

    const/4 v2, 0x0

    invoke-direct {v4, p0, v0, v2}, Lo7/g$j;-><init>(Lo7/g;Landroid/graphics/Point;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private final s0(Landroid/graphics/Bitmap;Lm8/e;)Ljava/lang/Object;
    .registers 7

    invoke-virtual {p0}, Lo7/b;->j()Lg3/x;

    move-result-object v0

    invoke-virtual {v0}, Lg3/x;->t()Z

    move-result v0

    invoke-virtual {p0}, Lo7/b;->j()Lg3/x;

    move-result-object v1

    invoke-virtual {v1}, Lg3/x;->s()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "segment wallpaper, support:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " applied:"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ImageCropViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo7/b;->j()Lg3/x;

    move-result-object v0

    invoke-virtual {v0}, Lg3/x;->t()Z

    move-result v0

    if-eqz v0, :cond_51

    invoke-virtual {p0}, Lo7/b;->j()Lg3/x;

    move-result-object v0

    invoke-virtual {v0}, Lg3/x;->s()Z

    move-result v0

    if-eqz v0, :cond_43

    goto :goto_51

    :cond_43
    invoke-direct {p0, p1, p2}, Lo7/g;->p0(Landroid/graphics/Bitmap;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4e

    return-object p0

    :cond_4e
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_51
    :goto_51
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final t0()V
    .registers 10

    invoke-direct {p0}, Lo7/g;->g0()Landroid/graphics/Point;

    move-result-object v0

    if-eqz v0, :cond_3b

    invoke-direct {p0}, Lo7/g;->d0()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_3b

    invoke-virtual {p0}, Lo7/b;->i()Landroidx/lifecycle/H;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/C;->e()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lm7/a$a;->a:Lm7/a$a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3b

    iget-object v0, p0, Lo7/g;->x:LF8/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_25

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_25
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v3

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v4

    new-instance v6, Lo7/g$l;

    invoke-direct {v6, p0, v1}, Lo7/g$l;-><init>(Lo7/g;Lm8/e;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object v0

    iput-object v0, p0, Lo7/g;->x:LF8/x0;

    :cond_3b
    return-void
.end method

.method public static synthetic w()Lcom/nothing/wallpaper/segmenter/Segmenter;
    .registers 1

    invoke-static {}, Lo7/g;->q0()Lcom/nothing/wallpaper/segmenter/Segmenter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic x(Lo7/g;Lcom/nothing/wallpaper/effects/data/model/ViewScope;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lo7/g;->B(Lo7/g;Lcom/nothing/wallpaper/effects/data/model/ViewScope;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lo7/g;)Lh8/A;
    .registers 1

    invoke-static {p0}, Lo7/g;->A(Lo7/g;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lg3/x;)Z
    .registers 1

    invoke-static {p0}, Lo7/g;->U(Lg3/x;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final V()Lcom/android/wallpaper/asset/a;
    .registers 1

    iget-object p0, p0, Lo7/g;->p:Lcom/android/wallpaper/asset/a;

    return-object p0
.end method

.method public final W()Lcom/nothing/wallpaper/effects/data/model/ViewScope;
    .registers 1

    iget-object p0, p0, Lo7/g;->q:Lo7/i;

    invoke-virtual {p0}, Lo7/i;->h()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p0

    return-object p0
.end method

.method public final Y()LI8/f;
    .registers 1

    iget-object p0, p0, Lo7/g;->v:LI8/f;

    return-object p0
.end method

.method public final Z()Lw6/b;
    .registers 1

    iget-object p0, p0, Lo7/g;->k:Lx6/k;

    invoke-virtual {p0}, Lx6/k;->q()Lw6/d;

    move-result-object p0

    invoke-virtual {p0}, Lw6/d;->c()Lw6/b;

    move-result-object p0

    return-object p0
.end method

.method public final a0()LI8/f;
    .registers 1

    iget-object p0, p0, Lo7/g;->u:LI8/f;

    return-object p0
.end method

.method public final b0()Lcom/nothing/wallpaper/effects/data/model/ViewScope;
    .registers 1

    iget-object p0, p0, Lo7/g;->q:Lo7/i;

    invoke-virtual {p0}, Lo7/i;->f()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p0

    return-object p0
.end method

.method public c0()I
    .registers 1

    iget-object p0, p0, Lo7/g;->l:LD6/e;

    invoke-interface {p0}, LD6/f;->v0()I

    move-result p0

    return p0
.end method

.method protected d()V
    .registers 3

    invoke-super {p0}, Landroidx/lifecycle/a0;->d()V

    iget-object v0, p0, Lo7/g;->o:LF8/o0;

    invoke-virtual {v0}, LF8/o0;->close()V

    invoke-direct {p0}, Lo7/g;->X()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-direct {p0}, Lo7/g;->f0()Lcom/nothing/wallpaper/segmenter/Segmenter;

    move-result-object v0

    iget-object v1, p0, Lo7/g;->B:Lo7/g$k;

    invoke-interface {v0, v1}, Lcom/nothing/wallpaper/segmenter/Segmenter;->e(Lcom/nothing/wallpaper/segmenter/Segmenter$b;)V

    :cond_17
    iget-object p0, p0, Lo7/g;->l:LD6/e;

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final e0()LI8/O;
    .registers 1

    iget-object p0, p0, Lo7/g;->t:LI8/O;

    return-object p0
.end method

.method public final j0(Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;)V
    .registers 12

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v1

    new-instance v2, Lo7/g$f;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Lo7/g$f;-><init>(Lo7/g;Landroid/graphics/PointF;Ljava/lang/Float;Ljava/lang/String;Lm8/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public k()LI8/f;
    .registers 1

    iget-object p0, p0, Lo7/g;->w:LI8/f;

    return-object p0
.end method

.method public final k0(Z)V
    .registers 2

    iget-object p0, p0, Lo7/g;->q:Lo7/i;

    invoke-virtual {p0, p1}, Lo7/i;->k(Z)V

    return-void
.end method

.method public final m0(Ljava/lang/Float;Landroid/graphics/PointF;)V
    .registers 9

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v1

    new-instance v3, Lo7/g$g;

    const/4 v2, 0x0

    invoke-direct {v3, p0, p1, p2, v2}, Lo7/g$g;-><init>(Lo7/g;Ljava/lang/Float;Landroid/graphics/PointF;Lm8/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final n0(Landroid/graphics/Point;F)V
    .registers 6

    const-string v0, "size"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo7/g;->m:Landroidx/lifecycle/Q;

    const-string v1, "key_view_size"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lo7/g;->m:Landroidx/lifecycle/Q;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "key_preview_scale"

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, Lo7/g;->o0(Landroid/graphics/Point;F)V

    return-void
.end method

.method public v()V
    .registers 4

    invoke-virtual {p0}, Lo7/g;->W()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "update original scope:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ImageCropViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lo7/g;->q:Lo7/i;

    invoke-virtual {p0}, Lo7/g;->W()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p0

    invoke-virtual {v0, p0}, Lo7/i;->q(Lcom/nothing/wallpaper/effects/data/model/ViewScope;)V

    return-void
.end method
