.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$b;
    }
.end annotation


# static fields
.field public static final F:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$b;

.field private static final G:Landroid/util/FloatProperty;


# instance fields
.field private A:LO1/b;

.field private B:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

.field private C:Landroid/animation/AnimatorSet;

.field private D:LF8/T;

.field private final E:Ljava/util/WeakHashMap;

.field private q:Lv8/l;

.field private r:Lv8/l;

.field private final s:Landroid/view/View;

.field private final t:Le3/c;

.field private final u:Lcom/android/launcher3/views/f;

.field private final v:Lcom/android/launcher3/f;

.field private final w:Lh8/h;

.field private final x:Lh8/h;

.field private final y:Ly7/e;

.field private z:LF8/L;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->F:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$b;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$a;

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$a;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->G:Landroid/util/FloatProperty;

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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    iput-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->s:Landroid/view/View;

    .line 5
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 p3, 0x1

    invoke-static {p2, p0, p3}, Le3/c;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/c;

    move-result-object p2

    const-string v0, "inflate(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    .line 6
    invoke-static {p1}, Lcom/android/launcher3/views/f;->y(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/android/launcher3/views/f;

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->u:Lcom/android/launcher3/views/f;

    .line 7
    invoke-interface {p1}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->v:Lcom/android/launcher3/f;

    .line 8
    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/e;

    invoke-direct {v1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/e;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)V

    invoke-static {v1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v1

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->w:Lh8/h;

    .line 9
    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/h;

    invoke-direct {v1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/h;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)V

    invoke-static {v1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v1

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->x:Lh8/h;

    .line 10
    new-instance v1, Ly7/e;

    invoke-interface {p1}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object p1

    const-string v2, "getDeviceProfile(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, p1}, Ly7/e;-><init>(Lcom/android/launcher3/f;)V

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->y:Ly7/e;

    .line 11
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->E:Ljava/util/WeakHashMap;

    const/4 p1, 0x0

    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 13
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 14
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 15
    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->b(Z)V

    const/4 p1, 0x0

    .line 16
    invoke-static {p1, p3, p1}, LF8/T0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object p1

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object p3

    invoke-interface {p1, p3}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p1

    invoke-static {p1}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->z:LF8/L;

    .line 17
    iget-object p1, p2, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    new-instance p3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/i;

    invoke-direct {p3, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/i;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)V

    invoke-virtual {p1, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->setOnClockChangedListener(Lv8/l;)V

    .line 18
    iget-object p0, p2, Le3/c;->y:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    const-string p1, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/widget/FrameLayout$LayoutParams;

    .line 19
    invoke-virtual {v0}, Lcom/android/launcher3/f;->h()I

    move-result p1

    iput p1, p0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 20
    iget-object p0, p2, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    iget-object p1, p2, Le3/c;->y:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->getRealHeight()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->setTopMarginDate(I)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic A(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)LF8/T;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->D:LF8/T;

    return-object p0
.end method

.method public static final synthetic B(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)F
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->getFraction()F

    move-result p0

    return p0
.end method

.method public static final synthetic C(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Landroid/view/View;)F
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->L(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method public static final synthetic D(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)LO1/b;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A:LO1/b;

    return-object p0
.end method

.method public static final synthetic E(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Landroid/animation/AnimatorSet;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->C:Landroid/animation/AnimatorSet;

    return-void
.end method

.method public static final synthetic F(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LF8/T;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->D:LF8/T;

    return-void
.end method

.method public static final synthetic G(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LA7/a;)Landroid/animation/Animator;
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->Y(LA7/a;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic H(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;F)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->b0(F)V

    return-void
.end method

.method private final I(LO1/b;)I
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->v:Lcom/android/launcher3/f;

    iget-boolean v0, v0, Lcom/android/launcher3/f;->e0:Z

    if-eqz v0, :cond_8

    const/4 p0, 0x0

    return p0

    :cond_8
    invoke-virtual {p1}, LO1/b;->f()LN1/a;

    move-result-object p1

    sget-object v0, LN1/a;->r:LN1/a;

    if-ne p1, v0, :cond_15

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->getMinClockHeight()I

    move-result p0

    return p0

    :cond_15
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->getMaxClockHeight()I

    move-result p0

    return p0
.end method

.method private final J(Ljava/lang/String;LN1/a;LA7/a;)Ljava/lang/String;
    .registers 4

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final K(Ljava/lang/String;LN1/a;LA7/a;)Landroid/view/View;
    .registers 10

    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->J(Ljava/lang/String;LN1/a;LA7/a;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->E:Ljava/util/WeakHashMap;

    invoke-virtual {v1, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    const v3, 0x7f0a0113

    if-eqz v1, :cond_2e

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Ld6/b;

    if-eqz v5, :cond_1d

    check-cast v4, Ld6/b;

    goto :goto_1e

    :cond_1d
    move-object v4, v2

    :goto_1e
    if-eqz v4, :cond_2e

    iget-object v5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->B:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    if-eqz v5, :cond_2e

    if-eqz v5, :cond_29

    invoke-virtual {v5, v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->L(LO2/h;)V

    :cond_29
    invoke-direct {p0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->O(Landroid/view/View;)Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_2e
    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->B:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    if-eqz v1, :cond_50

    invoke-virtual {v1, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->C(Ljava/lang/String;LN1/a;LA7/a;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_39

    goto :goto_50

    :cond_39
    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->B:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    if-eqz p2, :cond_46

    invoke-virtual {p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->A()LO2/h;

    move-result-object p2

    if-eqz p2, :cond_46

    invoke-virtual {p1, v3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_46
    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->E:Ljava/util/WeakHashMap;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->O(Landroid/view/View;)Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_50
    :goto_50
    return-object v2
.end method

.method private final L(Landroid/view/View;)F
    .registers 7

    const/4 p0, 0x0

    :try_start_1
    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;

    const v1, 0x3e4ccccd    # 0.2f

    invoke-virtual {v0, p1, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;->a(Landroid/view/View;F)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_a} :catch_21
    .catchall {:try_start_1 .. :try_end_a} :catchall_1c

    const/4 v2, 0x0

    const/4 v3, 0x2

    :try_start_c
    invoke-static {p1, v2, v3, p0}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->c(Landroid/graphics/Bitmap;IILjava/lang/Object;)I

    move-result p0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_10} :catch_1a
    .catchall {:try_start_c .. :try_end_10} :catchall_18

    int-to-float p0, p0

    div-float/2addr p0, v1

    if-eqz p1, :cond_17

    invoke-virtual {v0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;->b(Landroid/graphics/Bitmap;)V

    :cond_17
    return p0

    :catchall_18
    move-exception p0

    goto :goto_35

    :catch_1a
    move-exception p0

    goto :goto_25

    :catchall_1c
    move-exception p1

    move-object v4, p1

    move-object p1, p0

    move-object p0, v4

    goto :goto_35

    :catch_21
    move-exception p1

    move-object v4, p1

    move-object p1, p0

    move-object p0, v4

    :goto_25
    :try_start_25
    const-string v0, "ClockHostEditPreview"

    const-string v1, "getLeftNonTransparentPixel"

    invoke-static {v0, v1, p0}, Lcom/nothing/wallpaper/common/log/FileLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    :try_end_2c
    .catchall {:try_start_25 .. :try_end_2c} :catchall_18

    if-eqz p1, :cond_33

    sget-object p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;->b(Landroid/graphics/Bitmap;)V

    :cond_33
    const/4 p0, 0x0

    return p0

    :goto_35
    if-eqz p1, :cond_3c

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;

    invoke-virtual {v0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;->b(Landroid/graphics/Bitmap;)V

    :cond_3c
    throw p0
.end method

.method private static final M(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->v:Lcom/android/launcher3/f;

    iget p0, p0, Lcom/android/launcher3/f;->n:I

    return p0
.end method

.method private static final N(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->v:Lcom/android/launcher3/f;

    iget p0, p0, Lcom/android/launcher3/f;->o:I

    return p0
.end method

.method private final O(Landroid/view/View;)Landroid/view/View;
    .registers 3

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {p1, p0}, Landroid/view/View;->setTranslationY(F)V

    sget-object p0, LA3/f;->a:LA3/f;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1, v0}, LA3/f;->p(Landroid/view/View;F)V

    return-object p1
.end method

.method private final P(LN1/a;)Landroid/animation/Animator;
    .registers 6

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->y:Ly7/e;

    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/j;

    invoke-direct {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/j;-><init>()V

    new-instance v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/k;

    invoke-direct {v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/k;-><init>()V

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/l;

    invoke-direct {v3, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/l;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Ly7/e;->l(LN1/a;Lv8/a;Lv8/a;Lv8/p;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method private static final Q()Lh8/A;
    .registers 1

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0
.end method

.method private static final R()Lh8/A;
    .registers 1

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0
.end method

.method private static final S(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;IF)Lh8/A;
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object p0, p0, Le3/c;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditBorderView;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditBorderView;->d(I)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final T(LO1/b;LO1/b;Landroid/view/View;Landroid/view/View;)Landroid/animation/AnimatorSet;
    .registers 8

    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    invoke-virtual {p1}, LO1/b;->f()LN1/a;

    move-result-object v1

    invoke-virtual {p2}, LO1/b;->f()LN1/a;

    move-result-object v2

    if-eq v1, v2, :cond_20

    invoke-virtual {p2}, LO1/b;->f()LN1/a;

    move-result-object v1

    if-eqz v1, :cond_20

    invoke-virtual {p2}, LO1/b;->f()LN1/a;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->P(LN1/a;)Landroid/animation/Animator;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    :cond_20
    invoke-virtual {p1}, LO1/b;->d()LA7/a;

    move-result-object v1

    invoke-virtual {p2}, LO1/b;->d()LA7/a;

    move-result-object v2

    if-eq v1, v2, :cond_3b

    invoke-virtual {p2}, LO1/b;->d()LA7/a;

    move-result-object v1

    if-eqz v1, :cond_3b

    invoke-virtual {p2}, LO1/b;->d()LA7/a;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->Y(LA7/a;)Landroid/animation/Animator;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    :cond_3b
    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->y:Ly7/e;

    new-instance v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/o;

    invoke-direct {v2, p3, p0, p1, p4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/o;-><init>(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LO1/b;Landroid/view/View;)V

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/p;

    invoke-direct {p1, p4, p0, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/p;-><init>(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LO1/b;Landroid/view/View;)V

    new-instance p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/f;

    invoke-direct {p0, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/f;-><init>(Landroid/view/View;)V

    new-instance p2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/g;

    invoke-direct {p2, p4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/g;-><init>(Landroid/view/View;)V

    invoke-virtual {v1, v2, p1, p0, p2}, Ly7/e;->g(Lv8/a;Lv8/a;Lv8/l;Lv8/l;)Landroid/animation/Animator;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    return-object v0
.end method

.method private static final U(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LO1/b;Landroid/view/View;)Lh8/A;
    .registers 7

    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    move-result p1

    const/4 v0, 0x1

    const/high16 v1, 0x40000000    # 2.0f

    const/4 v2, 0x0

    if-ne p1, v0, :cond_1f

    invoke-virtual {p2}, LO1/b;->d()LA7/a;

    move-result-object p1

    sget-object p2, LA7/a;->q:LA7/a;

    if-ne p1, p2, :cond_18

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    int-to-float p1, p1

    goto :goto_2e

    :cond_18
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    :goto_1c
    int-to-float p1, p1

    div-float/2addr p1, v1

    goto :goto_2e

    :cond_1f
    invoke-virtual {p2}, LO1/b;->d()LA7/a;

    move-result-object p1

    sget-object p2, LA7/a;->q:LA7/a;

    if-ne p1, p2, :cond_29

    move p1, v2

    goto :goto_2e

    :cond_29
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p1

    goto :goto_1c

    :goto_2e
    invoke-virtual {p0, p1}, Landroid/view/View;->setPivotX(F)V

    invoke-virtual {p0, v2}, Landroid/view/View;->setPivotY(F)V

    invoke-virtual {p3, v2}, Landroid/view/View;->setAlpha(F)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final V(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LO1/b;Landroid/view/View;)Lh8/A;
    .registers 8

    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/high16 v3, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_1f

    invoke-virtual {p2}, LO1/b;->d()LA7/a;

    move-result-object v0

    sget-object v1, LA7/a;->q:LA7/a;

    if-ne v0, v1, :cond_18

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    int-to-float p3, p3

    goto :goto_2e

    :cond_18
    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    :goto_1c
    int-to-float p3, p3

    div-float/2addr p3, v3

    goto :goto_2e

    :cond_1f
    invoke-virtual {p2}, LO1/b;->d()LA7/a;

    move-result-object v0

    sget-object v1, LA7/a;->q:LA7/a;

    if-ne v0, v1, :cond_29

    move p3, v2

    goto :goto_2e

    :cond_29
    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    goto :goto_1c

    :goto_2e
    invoke-virtual {p0, p3}, Landroid/view/View;->setPivotX(F)V

    invoke-virtual {p0, v2}, Landroid/view/View;->setPivotY(F)V

    iget-object p1, p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object p1, p1, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    invoke-virtual {p1, p2, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->c(LO1/b;Landroid/view/View;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final W(Landroid/view/View;F)Lh8/A;
    .registers 5

    sget-object v0, LA3/f;->a:LA3/f;

    const v1, 0x3dcccccd    # 0.1f

    mul-float/2addr v1, p1

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v1, v2, v1

    invoke-virtual {v0, p0, v1}, LA3/f;->p(Landroid/view/View;F)V

    sub-float/2addr v2, p1

    invoke-virtual {p0, v2}, Landroid/view/View;->setAlpha(F)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final X(Landroid/view/View;F)Lh8/A;
    .registers 5

    sget-object v0, LA3/f;->a:LA3/f;

    const v1, 0x3dcccccd    # 0.1f

    mul-float/2addr v1, p1

    const v2, 0x3f666666    # 0.9f

    add-float/2addr v1, v2

    invoke-virtual {v0, p0, v1}, LA3/f;->p(Landroid/view/View;F)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final Y(LA7/a;)Landroid/animation/Animator;
    .registers 5

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->y:Ly7/e;

    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/m;

    invoke-direct {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/m;-><init>()V

    new-instance v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/n;

    invoke-direct {v2, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/n;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)V

    invoke-virtual {v0, p1, v1, v2}, Ly7/e;->e(LA7/a;Lv8/a;Lv8/p;)Landroid/animation/Animator;

    move-result-object p0

    return-object p0
.end method

.method private static final Z()Lh8/A;
    .registers 1

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0
.end method

.method private static final a0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;FF)Lh8/A;
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object p0, p0, Le3/c;->y:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->t(F)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final b0(F)V
    .registers 6

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object v0, p0, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    const-string v1, "clockFaceCurrent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    cmpl-float v1, p1, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_17

    move v1, v3

    goto :goto_18

    :cond_17
    move v1, v2

    :goto_18
    if-eqz v1, :cond_1b

    goto :goto_1d

    :cond_1b
    const/16 v2, 0x8

    :goto_1d
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, Le3/c;->y:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    int-to-float v0, v3

    sub-float/2addr v0, p1

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->C(F)V

    return-void
.end method

.method private final getFraction()F
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object p0, p0, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result p0

    return p0
.end method

.method private final getMaxClockHeight()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->w:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private final getMinClockHeight()I
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->x:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public static synthetic j(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)I
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->N(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)I

    move-result p0

    return p0
.end method

.method public static synthetic k()Lh8/A;
    .registers 1

    invoke-static {}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->Q()Lh8/A;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;FF)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->a0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;FF)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)I
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->M(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)I

    move-result p0

    return p0
.end method

.method public static synthetic n()Lh8/A;
    .registers 1

    invoke-static {}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->R()Lh8/A;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic o()Lh8/A;
    .registers 1

    invoke-static {}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->Z()Lh8/A;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic p(Landroid/view/View;F)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->W(Landroid/view/View;F)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LO1/b;Landroid/view/View;)Lh8/A;
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->V(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LO1/b;Landroid/view/View;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Landroid/view/View;F)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->X(Landroid/view/View;F)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Ljava/lang/String;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->v(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Ljava/lang/String;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;IF)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->S(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;IF)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LO1/b;Landroid/view/View;)Lh8/A;
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->U(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LO1/b;Landroid/view/View;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Ljava/lang/String;)Lh8/A;
    .registers 2

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->getOnClockChangedListener()Lv8/l;

    move-result-object p0

    if-eqz p0, :cond_9

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static final synthetic w(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)Le3/c;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    return-object p0
.end method

.method public static final synthetic x(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Ljava/lang/String;LN1/a;LA7/a;)Landroid/view/View;
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->K(Ljava/lang/String;LN1/a;LA7/a;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic y(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)Ly7/e;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->y:Ly7/e;

    return-object p0
.end method

.method public static final synthetic z(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)LF8/L;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->z:LF8/L;

    return-object p0
.end method


# virtual methods
.method public a(ZLO1/b;LS1/a;Lv8/l;Lv8/a;)V
    .registers 9

    const-string v0, "model"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockViewFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTransitionStart"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTransitionEnd"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LO1/b;->e()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setUpEditClockView "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ClockHostEditPreview"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, LO1/b;->e()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_35

    goto :goto_85

    :cond_35
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->E:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    instance-of v0, p3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    const/4 v1, 0x0

    if-eqz v0, :cond_42

    check-cast p3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    goto :goto_43

    :cond_42
    move-object p3, v1

    :goto_43
    if-nez p3, :cond_46

    goto :goto_85

    :cond_46
    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->B:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    invoke-virtual {p2}, LO1/b;->f()LN1/a;

    move-result-object p3

    if-nez p3, :cond_4f

    goto :goto_85

    :cond_4f
    invoke-virtual {p2}, LO1/b;->d()LA7/a;

    move-result-object p3

    if-nez p3, :cond_56

    goto :goto_85

    :cond_56
    invoke-virtual {p2}, LO1/b;->e()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, LO1/b;->f()LN1/a;

    move-result-object v0

    invoke-virtual {p2}, LO1/b;->d()LA7/a;

    move-result-object v2

    invoke-direct {p0, p3, v0, v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->K(Ljava/lang/String;LN1/a;LA7/a;)Landroid/view/View;

    move-result-object p3

    if-nez p3, :cond_69

    goto :goto_85

    :cond_69
    invoke-interface {p4, p2}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, LO1/b;->e()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p4, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_a4

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A:LO1/b;

    if-eqz p1, :cond_a4

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object p1, p1, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_86

    :goto_85
    return-void

    :cond_86
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object v0, v0, Le3/c;->y:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-virtual {v0, p2, p4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->A(LO1/b;Z)V

    iget-object p4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A:LO1/b;

    invoke-static {p4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0, p4, p2, p1, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->T(LO1/b;LO1/b;Landroid/view/View;Landroid/view/View;)Landroid/animation/AnimatorSet;

    move-result-object p1

    new-instance p3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$g;

    invoke-direct {p3, p5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$g;-><init>(Lv8/a;)V

    invoke-virtual {p1, p3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->C:Landroid/animation/AnimatorSet;

    goto :goto_d5

    :cond_a4
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->C:Landroid/animation/AnimatorSet;

    if-eqz p1, :cond_ab

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->cancel()V

    :cond_ab
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->C:Landroid/animation/AnimatorSet;

    if-eqz p1, :cond_b2

    invoke-virtual {p1}, Landroid/animation/Animator;->removeAllListeners()V

    :cond_b2
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->D:LF8/T;

    if-eqz p1, :cond_b9

    invoke-static {p1, v1, p4, v1}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_b9
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object p1, p1, Le3/c;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditBorderView;

    invoke-direct {p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->I(LO1/b;)I

    move-result p4

    invoke-virtual {p1, p4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditBorderView;->d(I)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object p1, p1, Le3/c;->y:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-virtual {p1, p2, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->A(LO1/b;Z)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object p1, p1, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    invoke-virtual {p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->c(LO1/b;Landroid/view/View;)V

    invoke-interface {p5}, Lv8/a;->invoke()Ljava/lang/Object;

    :goto_d5
    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A:LO1/b;

    return-void
.end method

.method public b(Z)V
    .registers 3

    if-eqz p1, :cond_12

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A:LO1/b;

    if-eqz p1, :cond_11

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object v0, v0, Le3/c;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditBorderView;

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->I(LO1/b;)I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditBorderView;->d(I)V

    :cond_11
    return-void

    :cond_12
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->v:Lcom/android/launcher3/f;

    iget-boolean p1, p1, Lcom/android/launcher3/f;->e0:Z

    if-eqz p1, :cond_1a

    const/4 p1, 0x0

    goto :goto_1c

    :cond_1a
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_1c
    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->b0(F)V

    return-void
.end method

.method public c(F)V
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object p0, p0, Le3/c;->w:Landroid/widget/FrameLayout;

    const v0, 0x3dcccccd    # 0.1f

    invoke-static {v0, p1}, LB8/h;->e(FF)F

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public d()V
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object v0, v0, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->E:Ljava/util/WeakHashMap;

    invoke-virtual {p0}, Ljava/util/WeakHashMap;->clear()V

    return-void
.end method

.method public e(LA7/a;LN1/a;Lv8/l;Lv8/a;)V
    .registers 21

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v0, p3

    const-string v2, "align"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "size"

    move-object/from16 v13, p2

    invoke-static {v13, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onTransitionStart"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onTransitionEnd"

    move-object/from16 v14, p4

    invoke-static {v14, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A:LO1/b;

    if-eqz v2, :cond_7b

    const/4 v4, 0x0

    if-eqz v2, :cond_2a

    invoke-virtual {v2}, LO1/b;->d()LA7/a;

    move-result-object v2

    goto :goto_2b

    :cond_2a
    move-object v2, v4

    :goto_2b
    if-ne v2, v3, :cond_2e

    goto :goto_7b

    :cond_2e
    iget-object v2, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object v2, v2, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v15

    if-eqz v15, :cond_7b

    invoke-virtual {v15}, Landroid/view/View;->getWidth()I

    move-result v2

    if-lez v2, :cond_7b

    invoke-virtual {v15}, Landroid/view/View;->getHeight()I

    move-result v2

    if-gtz v2, :cond_46

    goto :goto_7b

    :cond_46
    iget-object v2, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A:LO1/b;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v0, v2}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A:LO1/b;

    if-eqz v2, :cond_62

    const/16 v11, 0xbf

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v2 .. v12}, LO1/b;->b(LO1/b;Ljava/lang/String;LN1/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;LO2/f;LA7/a;LA7/g;ILjava/lang/Object;)LO1/b;

    move-result-object v4

    :cond_62
    iput-object v4, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A:LO1/b;

    iget-object v7, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->z:LF8/L;

    if-eqz v7, :cond_7b

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;

    const/4 v6, 0x0

    move-object/from16 v3, p1

    move-object v2, v13

    move-object v5, v14

    move-object v4, v15

    invoke-direct/range {v0 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$c;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LN1/a;LA7/a;Landroid/view/View;Lv8/a;Lm8/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    move-object v5, v7

    const/4 v7, 0x0

    move-object v8, v0

    invoke-static/range {v5 .. v10}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    :cond_7b
    :goto_7b
    return-void
.end method

.method public f(F)Landroid/animation/ObjectAnimator;
    .registers 5

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->G:Landroid/util/FloatProperty;

    const/4 v1, 0x1

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p1, v1, v2

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p0

    const-string p1, "ofFloat(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public getClockView()Landroid/view/View;
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object p0, p0, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic getIndicator()Landroid/view/View;
    .registers 1

    invoke-super {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->getIndicator()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public getOnClockChangedListener()Lv8/l;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv8/l;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->r:Lv8/l;

    return-object p0
.end method

.method public getOnClockSelectedListener()Lv8/l;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv8/l;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->q:Lv8/l;

    return-object p0
.end method

.method public getView()Landroid/view/View;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->s:Landroid/view/View;

    return-object p0
.end method

.method public h(F)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object p0, p0, Le3/c;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditBorderView;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditBorderView;->c(F)V

    return-void
.end method

.method public i(LN1/a;LA7/a;Lv8/l;Lv8/a;Lv8/a;)V
    .registers 23

    move-object/from16 v1, p0

    move-object/from16 v4, p1

    const/4 v0, 0x1

    const/4 v13, 0x0

    const-string v2, "size"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "align"

    move-object/from16 v14, p2

    invoke-static {v14, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onClockSizeChanged"

    move-object/from16 v15, p3

    invoke-static {v15, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onTransitionStart"

    move-object/from16 v3, p4

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onTransitionEnd"

    move-object/from16 v5, p5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A:LO1/b;

    if-eqz v2, :cond_102

    const/16 v16, 0x0

    if-eqz v2, :cond_34

    invoke-virtual {v2}, LO1/b;->f()LN1/a;

    move-result-object v2

    goto :goto_36

    :cond_34
    move-object/from16 v2, v16

    :goto_36
    if-ne v2, v4, :cond_3a

    goto/16 :goto_102

    :cond_3a
    iget-object v2, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A:LO1/b;

    if-eqz v2, :cond_4d

    const/16 v11, 0xfd

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v12}, LO1/b;->b(LO1/b;Ljava/lang/String;LN1/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;LO2/f;LA7/a;LA7/g;ILjava/lang/Object;)LO1/b;

    move-result-object v2

    goto :goto_4f

    :cond_4d
    move-object/from16 v2, v16

    :goto_4f
    iput-object v2, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A:LO1/b;

    iget-object v2, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object v2, v2, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    invoke-virtual {v2, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_102

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v3

    if-lez v3, :cond_102

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v3

    if-gtz v3, :cond_69

    goto/16 :goto_102

    :cond_69
    invoke-interface/range {p4 .. p4}, Lv8/a;->invoke()Ljava/lang/Object;

    sget-object v3, LN1/a;->r:LN1/a;

    if-ne v4, v3, :cond_74

    const v3, 0x3f337e87

    goto :goto_77

    :cond_74
    const v3, 0x3fb68eb0

    :goto_77
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f070466

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    const/16 v6, 0x1a4

    int-to-float v6, v6

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    iget v7, v7, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v7, v7

    div-float/2addr v6, v7

    mul-float/2addr v5, v6

    iget-object v6, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->y:Ly7/e;

    invoke-virtual {v6}, Ly7/e;->k()Landroid/animation/AnimatorSet;

    move-result-object v7

    iget-object v6, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->A:LO1/b;

    if-eqz v6, :cond_a0

    invoke-virtual {v6}, LO1/b;->d()LA7/a;

    move-result-object v16

    :cond_a0
    move-object/from16 v6, v16

    sget-object v8, LA7/a;->r:LA7/a;

    if-ne v6, v8, :cond_af

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    goto :goto_c5

    :cond_af
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const-string v8, "getContext(...)"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, LH6/a;->d(Landroid/content/Context;)Z

    move-result v6

    if-eqz v6, :cond_c5

    iget-object v6, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->v:Lcom/android/launcher3/f;

    iget v6, v6, Lcom/android/launcher3/f;->h:I

    int-to-float v6, v6

    sub-float v5, v6, v5

    :cond_c5
    :goto_c5
    invoke-virtual {v2, v5}, Landroid/view/View;->setPivotX(F)V

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Landroid/view/View;->setPivotY(F)V

    sget-object v5, Landroid/widget/FrameLayout;->SCALE_X:Landroid/util/Property;

    new-array v6, v0, [F

    aput v3, v6, v13

    invoke-static {v2, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    invoke-virtual {v7, v5}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    sget-object v5, Landroid/widget/FrameLayout;->SCALE_Y:Landroid/util/Property;

    new-array v0, v0, [F

    aput v3, v0, v13

    invoke-static {v2, v5, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    invoke-direct/range {p0 .. p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->P(LN1/a;)Landroid/animation/Animator;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v2, p5

    move-object v6, v14

    move-object v3, v15

    invoke-direct/range {v0 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview$f;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;Lv8/a;Lv8/l;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;LN1/a;LA7/a;)V

    invoke-virtual {v7, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v7}, Landroid/animation/AnimatorSet;->start()V

    iput-object v7, v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->C:Landroid/animation/AnimatorSet;

    :cond_102
    :goto_102
    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 4

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->z:LF8/L;

    if-eqz v0, :cond_c

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LF8/M;->d(LF8/L;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_c
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->C:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    :cond_13
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->C:Landroid/animation/AnimatorSet;

    if-eqz p0, :cond_1a

    invoke-virtual {p0}, Landroid/animation/Animator;->removeAllListeners()V

    :cond_1a
    return-void
.end method

.method protected onMeasure(II)V
    .registers 6

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->t:Le3/c;

    iget-object v0, p2, Le3/c;->w:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->getMaxClockHeight()I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    iget-object v0, p2, Le3/c;->y:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->getRealHeight()I

    move-result v1

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    iget-object v0, p2, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->getMaxClockHeight()I

    move-result v1

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    iget-object v0, p2, Le3/c;->x:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    iget-object p2, p2, Le3/c;->y:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-virtual {p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->getRealHeight()I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->setTopMarginDate(I)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->getMaxClockHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setOnClockChangedListener(Lv8/l;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv8/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->r:Lv8/l;

    return-void
.end method

.method public setOnClockSelectedListener(Lv8/l;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv8/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->q:Lv8/l;

    return-void
.end method
