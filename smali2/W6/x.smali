.class public final LW6/x;
.super LW6/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW6/x$a;
    }
.end annotation


# static fields
.field public static final J:LW6/x$a;


# instance fields
.field private final C:Ljava/util/List;

.field private D:Le3/q;

.field private E:LT6/g;

.field private final F:LZ6/d;

.field private final G:Lh8/h;

.field private H:I

.field private I:LF8/x0;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LW6/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW6/x$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LW6/x;->J:LW6/x$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 5

    invoke-direct {p0}, LW6/i;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LW6/x;->C:Ljava/util/List;

    new-instance v0, LZ6/d;

    new-instance v1, Landroidx/recyclerview/widget/PagerSnapHelper;

    invoke-direct {v1}, Landroidx/recyclerview/widget/PagerSnapHelper;-><init>()V

    invoke-direct {v0, v1}, LZ6/d;-><init>(Landroidx/recyclerview/widget/SnapHelper;)V

    iput-object v0, p0, LW6/x;->F:LZ6/d;

    const-class v0, La7/d;

    invoke-static {v0}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v0

    new-instance v1, LW6/x$f;

    invoke-direct {v1, p0}, LW6/x$f;-><init>(Landroidx/fragment/app/q;)V

    new-instance v2, LW6/x$g;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0}, LW6/x$g;-><init>(Lv8/a;Landroidx/fragment/app/q;)V

    new-instance v3, LW6/x$h;

    invoke-direct {v3, p0}, LW6/x$h;-><init>(Landroidx/fragment/app/q;)V

    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/X;->b(Landroidx/fragment/app/q;LC8/c;Lv8/a;Lv8/a;Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, LW6/x;->G:Lh8/h;

    return-void
.end method

.method private final A1()V
    .registers 5

    invoke-direct {p0}, LW6/x;->x1()V

    invoke-virtual {p0}, LW6/i;->I0()V

    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_58

    new-instance v1, LT6/g;

    iget-object v2, p0, LW6/x;->C:Ljava/util/List;

    new-instance v3, LW6/m;

    invoke-direct {v3, p0}, LW6/m;-><init>(LW6/x;)V

    invoke-direct {v1, v2, v3}, LT6/g;-><init>(Ljava/util/List;Lv8/l;)V

    iput-object v1, p0, LW6/x;->E:LT6/g;

    invoke-direct {p0, v0, v1}, LW6/x;->o1(Le3/q;LT6/g;)V

    iget-object v1, v0, Le3/q;->M:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;

    move-result-object v1

    if-eqz v1, :cond_2a

    invoke-static {}, LW6/i;->l0()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;->setChangeDuration(J)V

    :cond_2a
    iget-object v1, v0, Le3/q;->w:Landroid/widget/TextView;

    new-instance v2, LW6/o;

    invoke-direct {v2, p0}, LW6/o;-><init>(LW6/x;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, v0, Le3/q;->x:Landroid/widget/TextView;

    new-instance v2, LW6/p;

    invoke-direct {v2, p0}, LW6/p;-><init>(LW6/x;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, v0, Le3/q;->C:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    new-instance v2, LW6/q;

    invoke-direct {v2, p0}, LW6/q;-><init>(LW6/x;)V

    invoke-virtual {v1, v2}, Lcom/nothing/wallpaper/widget/AspectRatioImageView;->setOnSizeChanged(Lv8/p;)V

    iget-object v0, v0, Le3/q;->A:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f080189

    invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_58
    invoke-direct {p0}, LW6/x;->b2()V

    iget-object v0, p0, LW6/x;->F:LZ6/d;

    new-instance v1, LW6/r;

    invoke-direct {v1, p0}, LW6/r;-><init>(LW6/x;)V

    invoke-virtual {v0, v1}, LZ6/d;->t(Lv8/l;)V

    return-void
.end method

.method private static final B1(LW6/x;I)Lh8/A;
    .registers 2

    invoke-direct {p0, p1}, LW6/x;->u1(I)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final C1(LW6/x;Landroid/view/View;)V
    .registers 2

    invoke-direct {p0}, LW6/x;->I1()V

    return-void
.end method

.method private static final D1(LW6/x;Landroid/view/View;)V
    .registers 2

    invoke-direct {p0}, LW6/x;->L1()V

    return-void
.end method

.method private static final E1(LW6/x;II)Lh8/A;
    .registers 3

    invoke-direct {p0}, LW6/x;->c2()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final F1(LW6/x;F)Lh8/A;
    .registers 6

    float-to-double v0, p1

    const-wide v2, 0x3fd999999999999aL    # 0.4

    cmpl-double p1, v0, v2

    if-lez p1, :cond_13

    iget-object p1, p0, LW6/x;->F:LZ6/d;

    invoke-virtual {p1}, LZ6/d;->l()I

    move-result p1

    invoke-direct {p0, p1}, LW6/x;->R1(I)V

    :cond_13
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final G1(Le3/q;)V
    .registers 29

    move-object/from16 v0, p1

    invoke-virtual/range {p0 .. p0}, LW6/i;->w0()Z

    move-result v1

    if-eqz v1, :cond_9

    return-void

    :cond_9
    invoke-virtual/range {p0 .. p0}, LW6/i;->n0()LW6/e;

    move-result-object v2

    iget-object v3, v0, Le3/q;->I:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v1, "layoutSubjectPrompt"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Le3/q;->H:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v10, "layoutStylePrompt"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Le3/q;->J:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v11, "lottieProcessing"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Le3/q;->K:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v12, "lottieProcessingLoop"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v0, Le3/q;->E:Landroid/widget/ImageView;

    const-string v8, "ivSubjectPrompt"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LW6/i;->t0()I

    move-result v8

    const/4 v9, 0x1

    invoke-virtual/range {v2 .. v9}, LW6/e;->s(Landroid/view/View;Landroid/view/View;Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;Landroid/view/View;IZ)V

    invoke-virtual/range {p0 .. p0}, LW6/i;->n0()LW6/e;

    move-result-object v13

    iget-object v14, v0, Le3/q;->I:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v14, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v15, v0, Le3/q;->H:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v15, v10}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Le3/q;->J:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v2, v11}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Le3/q;->K:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v3, v12}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Le3/q;->D:Landroid/widget/ImageView;

    const-string v5, "ivStylePrompt"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LW6/i;->t0()I

    move-result v19

    const/16 v20, 0x0

    move-object/from16 v16, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    invoke-virtual/range {v13 .. v20}, LW6/e;->s(Landroid/view/View;Landroid/view/View;Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;Landroid/view/View;IZ)V

    invoke-virtual/range {p0 .. p0}, LW6/i;->n0()LW6/e;

    move-result-object v21

    iget-object v2, v0, Le3/q;->I:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LW6/i;->p0()F

    move-result v23

    invoke-static {}, LW6/i;->o0()F

    move-result v24

    invoke-static {}, LW6/i;->m0()J

    move-result-wide v25

    move-object/from16 v22, v2

    invoke-virtual/range {v21 .. v26}, LW6/e;->x(Landroid/view/View;FFJ)V

    invoke-virtual/range {p0 .. p0}, LW6/i;->n0()LW6/e;

    move-result-object v3

    iget-object v4, v0, Le3/q;->H:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v4, v10}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LW6/i;->p0()F

    move-result v5

    invoke-static {}, LW6/i;->o0()F

    move-result v6

    invoke-static {}, LW6/i;->m0()J

    move-result-wide v7

    invoke-virtual/range {v3 .. v8}, LW6/e;->x(Landroid/view/View;FFJ)V

    invoke-virtual/range {p0 .. p0}, LW6/i;->n0()LW6/e;

    move-result-object v1

    iget-object v0, v0, Le3/q;->A:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    const-string v2, "ivBlurPlaceholder"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LW6/i;->o0()F

    move-result v2

    invoke-static {}, LW6/i;->o0()F

    move-result v3

    invoke-virtual {v1, v0, v2, v3}, LW6/e;->z(Landroid/view/View;FF)V

    return-void
.end method

.method private final H1()V
    .registers 9

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v2

    new-instance v5, LW6/x$d;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, LW6/x$d;-><init>(LW6/x;Lm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private final I1()V
    .registers 3

    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_17

    iget-object v0, v0, Le3/q;->G:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->getNeedInterceptTouchEvent()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_17

    const-string p0, "NTCreativePromptResultFragment"

    const-string v0, "recyclerView is scrolling!"

    invoke-static {p0, v0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_17
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "requireContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Li6/m;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object p0

    invoke-virtual {p0}, La7/d;->x0()V

    return-void

    :cond_2e
    invoke-virtual {p0}, LW6/i;->L0()V

    return-void
.end method

.method private final J1()V
    .registers 3

    iget-object v0, p0, LW6/x;->C:Ljava/util/List;

    invoke-static {v0}, Li8/s;->U(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    if-eqz v0, :cond_2b

    invoke-static {v0}, LX6/c;->a(Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;)Z

    move-result v1

    if-eqz v1, :cond_2b

    iget-object v1, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, LW6/x;->E:LT6/g;

    if-nez v0, :cond_1f

    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1f
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRemoved(I)V

    invoke-direct {p0}, LW6/x;->b2()V

    iget-object p0, p0, LW6/x;->F:LZ6/d;

    invoke-virtual {p0, v1, v1}, LZ6/d;->q(IZ)V

    :cond_2b
    return-void
.end method

.method private final K1(Le3/q;)V
    .registers 6

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    invoke-virtual {v0}, LW6/e;->i()V

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    iget-object v1, p1, Le3/q;->I:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "layoutSubjectPrompt"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p1, Le3/q;->H:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v3, "layoutStylePrompt"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, LW6/e;->w(Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const v0, 0x7f010010

    invoke-static {p0, v0}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p0

    iget-object v0, p1, Le3/q;->E:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    iget-object v0, p1, Le3/q;->D:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    iget-object p0, p1, Le3/q;->E:Landroid/widget/ImageView;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p0, p1, Le3/q;->D:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    sget-object p0, LA3/f;->a:LA3/f;

    iget-object v1, p1, Le3/q;->E:Landroid/widget/ImageView;

    const-string v2, "ivSubjectPrompt"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0}, LA3/f;->p(Landroid/view/View;F)V

    iget-object v1, p1, Le3/q;->D:Landroid/widget/ImageView;

    const-string v2, "ivStylePrompt"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0}, LA3/f;->p(Landroid/view/View;F)V

    iget-object p0, p1, Le3/q;->I:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setRenderEffect(Landroid/graphics/RenderEffect;)V

    iget-object p0, p1, Le3/q;->H:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p0, v0}, Landroid/view/View;->setRenderEffect(Landroid/graphics/RenderEffect;)V

    iget-object p0, p1, Le3/q;->A:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    invoke-virtual {p0, v0}, Landroid/view/View;->setRenderEffect(Landroid/graphics/RenderEffect;)V

    return-void
.end method

.method private final L1()V
    .registers 9

    iget v0, p0, LW6/x;->H:I

    iget-object v1, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_b

    return-void

    :cond_b
    iget-object v0, p0, LW6/x;->I:LF8/x0;

    if-eqz v0, :cond_1d

    invoke-interface {v0}, LF8/x0;->O0()Z

    move-result v0

    if-nez v0, :cond_1d

    const-string p0, "NTCreativePromptResultFragment"

    const-string v0, "setAsWallpaperJob not completed"

    invoke-static {p0, v0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1d
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v2

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v3

    new-instance v5, LW6/x$e;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, LW6/x$e;-><init>(LW6/x;Lm8/e;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object v0

    iput-object v0, p0, LW6/x;->I:LF8/x0;

    return-void
.end method

.method private final M1(ZZLv8/a;)V
    .registers 11

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    iget-object p0, p0, LW6/x;->D:Le3/q;

    if-eqz p0, :cond_c

    iget-object p0, p0, Le3/q;->A:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    :goto_a
    move-object v1, p0

    goto :goto_e

    :cond_c
    const/4 p0, 0x0

    goto :goto_a

    :goto_e
    const/4 v4, 0x1

    const/4 v5, 0x0

    move v2, p1

    move v3, p2

    move-object v6, p3

    invoke-virtual/range {v0 .. v6}, LW6/e;->C(Landroid/view/View;ZZZZLv8/a;)V

    return-void
.end method

.method static synthetic N1(LW6/x;ZZLv8/a;ILjava/lang/Object;)V
    .registers 6

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_a

    const/4 p3, 0x0

    :cond_a
    invoke-direct {p0, p1, p2, p3}, LW6/x;->M1(ZZLv8/a;)V

    return-void
.end method

.method private final O1(Z)V
    .registers 5

    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_19

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object p0

    iget-object v1, v0, Le3/q;->J:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v2, "lottieProcessing"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Le3/q;->K:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v2, "lottieProcessingLoop"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0, p1}, LW6/e;->D(Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;Z)V

    :cond_19
    return-void
.end method

.method private final P1(Z)V
    .registers 2

    iget-object p0, p0, LW6/x;->D:Le3/q;

    if-eqz p0, :cond_e

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    goto :goto_9

    :cond_8
    const/4 p1, 0x4

    :goto_9
    iget-object p0, p0, Le3/q;->O:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_e
    return-void
.end method

.method private final Q1(Z)V
    .registers 8

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    iget-object p0, p0, LW6/x;->D:Le3/q;

    if-eqz p0, :cond_c

    iget-object p0, p0, Le3/q;->B:Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;

    :goto_a
    move-object v1, p0

    goto :goto_e

    :cond_c
    const/4 p0, 0x0

    goto :goto_a

    :goto_e
    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v3, 0x0

    move v2, p1

    invoke-virtual/range {v0 .. v5}, LW6/e;->B(Landroid/view/View;ZZZLv8/a;)V

    return-void
.end method

.method public static synthetic R0(LW6/x;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, LW6/x;->D1(LW6/x;Landroid/view/View;)V

    return-void
.end method

.method private final R1(I)V
    .registers 4

    iget-object v0, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_1e

    iget-object v0, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_12

    goto :goto_1e

    :cond_12
    iget-object p0, p0, LW6/x;->D:Le3/q;

    if-eqz p0, :cond_1e

    iget-object p0, p0, Le3/q;->L:Lcom/nothing/wallpaper/picker/creative/view/NTPageIndicator;

    if-eqz p0, :cond_1e

    int-to-float p1, p1

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/creative/view/NTPageIndicator;->setLocation(F)V

    :cond_1e
    :goto_1e
    return-void
.end method

.method public static synthetic S0(LW6/x;)V
    .registers 1

    invoke-static {p0}, LW6/x;->n1(LW6/x;)V

    return-void
.end method

.method private final S1(ZZ)V
    .registers 16

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    iget-object v1, p0, LW6/x;->D:Le3/q;

    const/4 v6, 0x0

    if-eqz v1, :cond_c

    iget-object v1, v1, Le3/q;->I:Landroidx/constraintlayout/widget/ConstraintLayout;

    goto :goto_d

    :cond_c
    move-object v1, v6

    :goto_d
    const/4 v4, 0x1

    const/4 v5, 0x0

    move v2, p1

    move v3, p2

    invoke-virtual/range {v0 .. v5}, LW6/e;->B(Landroid/view/View;ZZZLv8/a;)V

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v7

    iget-object p0, p0, LW6/x;->D:Le3/q;

    if-eqz p0, :cond_1e

    iget-object v6, p0, Le3/q;->H:Landroidx/constraintlayout/widget/ConstraintLayout;

    :cond_1e
    move-object v8, v6

    const/4 v11, 0x1

    const/4 v12, 0x0

    move v9, v2

    move v10, v3

    invoke-virtual/range {v7 .. v12}, LW6/e;->B(Landroid/view/View;ZZZLv8/a;)V

    return-void
.end method

.method public static synthetic T0(LW6/x;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, LW6/x;->z1(LW6/x;Landroid/view/View;)V

    return-void
.end method

.method static synthetic T1(LW6/x;ZZILjava/lang/Object;)V
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    :cond_5
    invoke-direct {p0, p1, p2}, LW6/x;->S1(ZZ)V

    return-void
.end method

.method public static synthetic U0(LW6/x;F)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LW6/x;->F1(LW6/x;F)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final U1(ZZ)V
    .registers 9

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    iget-object p0, p0, LW6/x;->D:Le3/q;

    if-eqz p0, :cond_c

    iget-object p0, p0, Le3/q;->w:Landroid/widget/TextView;

    :goto_a
    move-object v1, p0

    goto :goto_e

    :cond_c
    const/4 p0, 0x0

    goto :goto_a

    :goto_e
    const/4 v4, 0x1

    const/4 v5, 0x0

    move v2, p1

    move v3, p2

    invoke-virtual/range {v0 .. v5}, LW6/e;->B(Landroid/view/View;ZZZLv8/a;)V

    return-void
.end method

.method public static synthetic V0(LW6/x;Le3/q;)V
    .registers 2

    invoke-static {p0, p1}, LW6/x;->m1(LW6/x;Le3/q;)V

    return-void
.end method

.method private final V1(Z)V
    .registers 3

    iget-object p0, p0, LW6/x;->D:Le3/q;

    if-eqz p0, :cond_1a

    iget-object p0, p0, Le3/q;->N:Landroid/widget/Toolbar;

    if-eqz p0, :cond_1a

    invoke-virtual {p0}, Landroid/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object p0

    if-eqz p0, :cond_1a

    const v0, 0x7f0a02ed

    invoke-interface {p0, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p0

    if-eqz p0, :cond_1a

    invoke-interface {p0, p1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_1a
    return-void
.end method

.method public static synthetic W0(LW6/x;II)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, LW6/x;->E1(LW6/x;II)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final W1(Z)V
    .registers 4

    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_12

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object p0

    iget-object v0, v0, Le3/q;->C:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    const-string v1, "ivSelectedFrame"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1}, LW6/e;->G(Landroid/widget/ImageView;Z)V

    :cond_12
    return-void
.end method

.method public static synthetic X0(LW6/x;)V
    .registers 1

    invoke-static {p0}, LW6/x;->v1(LW6/x;)V

    return-void
.end method

.method private final X1(ZZ)V
    .registers 9

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    iget-object p0, p0, LW6/x;->D:Le3/q;

    if-eqz p0, :cond_c

    iget-object p0, p0, Le3/q;->x:Landroid/widget/TextView;

    :goto_a
    move-object v1, p0

    goto :goto_e

    :cond_c
    const/4 p0, 0x0

    goto :goto_a

    :goto_e
    const/4 v4, 0x1

    const/4 v5, 0x0

    move v2, p1

    move v3, p2

    invoke-virtual/range {v0 .. v5}, LW6/e;->B(Landroid/view/View;ZZZLv8/a;)V

    return-void
.end method

.method public static synthetic Y0(LW6/x;ILandroid/graphics/Point;)V
    .registers 3

    invoke-static {p0, p1, p2}, LW6/x;->d2(LW6/x;ILandroid/graphics/Point;)V

    return-void
.end method

.method private final Y1(LX6/d$a;Z)V
    .registers 9

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LW6/x;->N1(LW6/x;ZZLv8/a;ILjava/lang/Object;)V

    const/4 p0, 0x0

    invoke-direct {v0, p0}, LW6/x;->P1(Z)V

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, LW6/x;->X1(ZZ)V

    invoke-direct {v0, v1}, LW6/x;->W1(Z)V

    invoke-direct {v0, v1, p0}, LW6/x;->U1(ZZ)V

    invoke-direct {v0, v1}, LW6/x;->V1(Z)V

    invoke-direct {v0, p0}, LW6/x;->Q1(Z)V

    invoke-direct {v0, p0}, LW6/x;->O1(Z)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p0, p0, v1, v2}, LW6/x;->T1(LW6/x;ZZILjava/lang/Object;)V

    invoke-direct {v0}, LW6/x;->J1()V

    invoke-direct {v0}, LW6/x;->p1()V

    if-eqz p2, :cond_30

    invoke-virtual {v0, p1}, LW6/i;->K0(LX6/d$a;)V

    :cond_30
    return-void
.end method

.method public static synthetic Z0(LW6/x;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, LW6/x;->C1(LW6/x;Landroid/view/View;)V

    return-void
.end method

.method private final Z1(Ljava/util/List;Z)V
    .registers 8

    invoke-direct {p0}, LW6/x;->a2()V

    invoke-static {p1}, Li8/s;->U(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    const/4 v0, 0x0

    if-nez p1, :cond_10

    invoke-direct {p0, v0, p2}, LW6/x;->Y1(LX6/d$a;Z)V

    goto :goto_79

    :cond_10
    sget-object p2, La7/d;->v:La7/d$b;

    iget-object v1, p0, LW6/x;->C:Ljava/util/List;

    invoke-virtual {p2, v1}, La7/d$b;->a(Ljava/util/List;)Z

    move-result p2

    const-string v1, "adapter"

    if-eqz p2, :cond_2f

    iget-object p2, p0, LW6/x;->E:LT6/g;

    if-nez p2, :cond_24

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p2, v0

    :cond_24
    iget-object v2, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {p2, v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRemoved(I)V

    :cond_2f
    iget-object p2, p0, LW6/x;->C:Ljava/util/List;

    invoke-static {p2}, Li8/s;->U(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    const/4 v2, 0x0

    if-eqz p2, :cond_5b

    invoke-static {p2}, LX6/c;->a(Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;)Z

    move-result v3

    if-eqz v3, :cond_5b

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getId()J

    move-result-wide v3

    invoke-virtual {p2, v3, v4}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->setId(J)V

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->setLink(Ljava/lang/String;)V

    iget-object p1, p0, LW6/x;->E:LT6/g;

    if-nez p1, :cond_56

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_57

    :cond_56
    move-object v0, p1

    :goto_57
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    goto :goto_74

    :cond_5b
    iget-object p2, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_74

    iget-object p2, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {p2, v2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object p1, p0, LW6/x;->E:LT6/g;

    if-nez p1, :cond_70

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_71

    :cond_70
    move-object v0, p1

    :goto_71
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemInserted(I)V

    :cond_74
    :goto_74
    iget-object p1, p0, LW6/x;->F:LZ6/d;

    invoke-virtual {p1, v2, v2}, LZ6/d;->q(IZ)V

    :goto_79
    invoke-direct {p0}, LW6/x;->p1()V

    return-void
.end method

.method public static synthetic a1(LW6/x;Landroid/view/MenuItem;)Z
    .registers 2

    invoke-static {p0, p1}, LW6/x;->y1(LW6/x;Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method

.method private final a2()V
    .registers 12

    iget-object v0, p0, LW6/x;->E:LT6/g;

    const-string v1, "adapter"

    const/4 v2, 0x0

    if-nez v0, :cond_b

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v2

    :cond_b
    invoke-virtual {v0}, LT6/g;->d()Landroid/graphics/Point;

    move-result-object v0

    iget v0, v0, Landroid/graphics/Point;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-gtz v0, :cond_17

    move v0, v4

    goto :goto_18

    :cond_17
    move v0, v3

    :goto_18
    iget-object v5, p0, LW6/x;->E:LT6/g;

    if-nez v5, :cond_20

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v5, v2

    :cond_20
    invoke-virtual {v5}, LT6/g;->d()Landroid/graphics/Point;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Point;->x:I

    if-gtz v1, :cond_2a

    move v1, v4

    goto :goto_2b

    :cond_2a
    move v1, v3

    :goto_2b
    or-int/2addr v0, v1

    if-eqz v0, :cond_31

    invoke-direct {p0}, LW6/x;->c2()V

    :cond_31
    invoke-direct {p0, v3}, LW6/x;->P1(Z)V

    invoke-direct {p0, v4, v4}, LW6/x;->X1(ZZ)V

    invoke-direct {p0, v4, v4}, LW6/x;->U1(ZZ)V

    invoke-direct {p0, v4}, LW6/x;->W1(Z)V

    invoke-direct {p0, v4}, LW6/x;->V1(Z)V

    invoke-direct {p0, v3}, LW6/x;->Q1(Z)V

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, p0

    invoke-static/range {v5 .. v10}, LW6/x;->N1(LW6/x;ZZLv8/a;ILjava/lang/Object;)V

    invoke-direct {v5, v3}, LW6/x;->O1(Z)V

    const/4 p0, 0x2

    invoke-static {v5, v3, v3, p0, v2}, LW6/x;->T1(LW6/x;ZZILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic b1(LW6/x;I)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LW6/x;->B1(LW6/x;I)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final b2()V
    .registers 3

    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_11

    iget-object v0, v0, Le3/q;->L:Lcom/nothing/wallpaper/picker/creative/view/NTPageIndicator;

    if-eqz v0, :cond_11

    iget-object v1, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/creative/view/NTPageIndicator;->setNumPages(I)V

    :cond_11
    iget v0, p0, LW6/x;->H:I

    iget-object v1, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_31

    iget-object v0, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_31

    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_31

    iget-object v0, v0, Le3/q;->L:Lcom/nothing/wallpaper/picker/creative/view/NTPageIndicator;

    if-eqz v0, :cond_31

    iget p0, p0, LW6/x;->H:I

    int-to-float p0, p0

    invoke-virtual {v0, p0}, Lcom/nothing/wallpaper/picker/creative/view/NTPageIndicator;->setLocation(F)V

    :cond_31
    return-void
.end method

.method public static final synthetic c1(LW6/x;)LZ6/d;
    .registers 1

    iget-object p0, p0, LW6/x;->F:LZ6/d;

    return-object p0
.end method

.method private final c2()V
    .registers 5

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_38

    :cond_7
    invoke-static {}, LH3/s;->a()LH3/s;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v1, v0}, LH3/s;->e(Landroid/view/Display;)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_27

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    if-eqz v1, :cond_27

    const v2, 0x7f070472

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    goto :goto_28

    :cond_27
    const/4 v1, 0x0

    :goto_28
    iget-object v2, p0, LW6/x;->D:Le3/q;

    if-eqz v2, :cond_38

    iget-object v2, v2, Le3/q;->C:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    if-eqz v2, :cond_38

    new-instance v3, LW6/s;

    invoke-direct {v3, p0, v1, v0}, LW6/s;-><init>(LW6/x;ILandroid/graphics/Point;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_38
    :goto_38
    return-void
.end method

.method public static final synthetic d1(LW6/x;)I
    .registers 1

    iget p0, p0, LW6/x;->H:I

    return p0
.end method

.method private static final d2(LW6/x;ILandroid/graphics/Point;)V
    .registers 13

    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_95

    iget-object v1, v0, Le3/q;->C:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    iget-object v2, v0, Le3/q;->C:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f070479

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    sub-int v4, v1, p1

    invoke-virtual {p0, v4}, LW6/i;->E0(I)V

    sub-int v4, v2, p1

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v5

    sub-int v5, v2, v5

    div-int/lit8 v5, v5, 0x4

    mul-int/lit8 v5, v5, 0x3

    sub-int/2addr v5, p1

    invoke-virtual {p0, v5}, LW6/i;->H0(I)V

    iget-object v5, p0, LW6/x;->F:LZ6/d;

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v6

    invoke-virtual {v5, v6}, LZ6/d;->u(I)V

    iget-object v5, p0, LW6/x;->E:LT6/g;

    const/4 v6, 0x0

    const-string v7, "adapter"

    if-nez v5, :cond_45

    invoke-static {v7}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v5, v6

    :cond_45
    new-instance v8, Landroid/graphics/Point;

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v9

    invoke-direct {v8, v9, v4}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v5, v8}, LT6/g;->g(Landroid/graphics/Point;)V

    iget-object v4, v0, Le3/q;->B:Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;

    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v8, 0x7f070471

    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    iget-object v8, v0, Le3/q;->N:Landroid/widget/Toolbar;

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    add-int/2addr v5, v8

    add-int/2addr v5, v3

    invoke-virtual {v4, v5}, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->setHollowMarginTop(I)V

    mul-int/lit8 v3, v3, 0x2

    sub-int v5, v1, v3

    sub-int v3, v2, v3

    invoke-virtual {v4, v5, v3}, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->c(II)V

    iget p2, p2, Landroid/graphics/Point;->x:I

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v3

    sub-int/2addr p2, v3

    div-int/lit8 p2, p2, 0x2

    iget-object v3, v0, Le3/q;->M:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v4, 0x0

    invoke-virtual {v3, p2, v4, p2, v4}, Landroid/view/View;->setPadding(IIII)V

    iget-object p2, v0, Le3/q;->M:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    iget-object p2, p0, LW6/x;->E:LT6/g;

    if-nez p2, :cond_8e

    invoke-static {v7}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_8f

    :cond_8e
    move-object v6, p2

    :goto_8f
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    invoke-direct {p0, v0, v1, v2, p1}, LW6/x;->e2(Le3/q;III)V

    :cond_95
    return-void
.end method

.method public static final synthetic e1(LW6/x;)La7/d;
    .registers 1

    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object p0

    return-object p0
.end method

.method private final e2(Le3/q;III)V
    .registers 8

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070477

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070479

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    mul-int/lit8 v1, v1, 0x2

    sub-int/2addr p2, v1

    sub-int v1, p3, v1

    sub-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x2

    iget-object v0, p1, Le3/q;->E:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v2, p1, Le3/q;->D:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput p2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v1, 0x7f07047b

    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    float-to-int p2, p2

    sub-int p4, p3, p4

    div-int/lit8 p4, p4, 0x2

    sub-int/2addr p3, p4

    const-string p4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-static {v0, p4}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    add-int/2addr p3, p2

    iput p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-static {v2, p4}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    iput p3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object p2, p1, Le3/q;->E:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/view/View;->requestLayout()V

    iget-object p2, p1, Le3/q;->D:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/view/View;->requestLayout()V

    new-instance p2, Lcom/bumptech/glide/request/RequestOptions;

    invoke-direct {p2}, Lcom/bumptech/glide/request/RequestOptions;-><init>()V

    new-instance p3, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;

    invoke-direct {p3}, Lcom/bumptech/glide/load/resource/bitmap/CenterCrop;-><init>()V

    new-instance p4, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07047a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    invoke-direct {p4, v0}, Lcom/bumptech/glide/load/resource/bitmap/RoundedCorners;-><init>(I)V

    filled-new-array {p3, p4}, [Lcom/bumptech/glide/load/Transformation;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/bumptech/glide/request/BaseRequestOptions;->transform([Lcom/bumptech/glide/load/Transformation;)Lcom/bumptech/glide/request/BaseRequestOptions;

    move-result-object p2

    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object p3

    invoke-virtual {p3}, La7/d;->c0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p3

    if-eqz p3, :cond_a3

    iget-object p4, p1, Le3/q;->E:Landroid/widget/ImageView;

    invoke-static {p4}, Lcom/bumptech/glide/Glide;->with(Landroid/view/View;)Lcom/bumptech/glide/RequestManager;

    move-result-object p4

    invoke-virtual {p3}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPhotoLink()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/bumptech/glide/RequestBuilder;->apply(Lcom/bumptech/glide/request/BaseRequestOptions;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p3

    iget-object p4, p1, Le3/q;->E:Landroid/widget/ImageView;

    invoke-virtual {p3, p4}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_a3
    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object p0

    invoke-virtual {p0}, La7/d;->b0()Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    move-result-object p0

    if-eqz p0, :cond_c4

    iget-object p3, p1, Le3/q;->D:Landroid/widget/ImageView;

    invoke-static {p3}, Lcom/bumptech/glide/Glide;->with(Landroid/view/View;)Lcom/bumptech/glide/RequestManager;

    move-result-object p3

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPhotoLink()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/String;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/bumptech/glide/RequestBuilder;->apply(Lcom/bumptech/glide/request/BaseRequestOptions;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object p0

    iget-object p1, p1, Le3/q;->D:Landroid/widget/ImageView;

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_c4
    return-void
.end method

.method public static final synthetic f1(LW6/x;)Ljava/util/List;
    .registers 1

    iget-object p0, p0, LW6/x;->C:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic g1(LW6/x;LX6/d;Z)V
    .registers 3

    invoke-direct {p0, p1, p2}, LW6/x;->s1(LX6/d;Z)V

    return-void
.end method

.method public static final synthetic h1(LW6/x;La7/d$c;Z)V
    .registers 3

    invoke-direct {p0, p1, p2}, LW6/x;->w1(La7/d$c;Z)V

    return-void
.end method

.method public static final synthetic i1(LW6/x;I)V
    .registers 2

    invoke-direct {p0, p1}, LW6/x;->R1(I)V

    return-void
.end method

.method public static final synthetic j1(LW6/x;I)V
    .registers 2

    iput p1, p0, LW6/x;->H:I

    return-void
.end method

.method public static final synthetic k1(LW6/x;)V
    .registers 1

    invoke-direct {p0}, LW6/x;->b2()V

    return-void
.end method

.method private final l1()V
    .registers 5

    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_1f

    const/4 v1, 0x0

    iput v1, p0, LW6/x;->H:I

    iget-object v1, v0, Le3/q;->M:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, LW6/w;

    invoke-direct {v2, p0, v0}, LW6/w;-><init>(LW6/x;Le3/q;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    iget-object v0, v0, Le3/q;->M:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, LW6/n;

    invoke-direct {v1, p0}, LW6/n;-><init>(LW6/x;)V

    invoke-static {}, LW6/i;->l0()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1f
    return-void
.end method

.method private static final m1(LW6/x;Le3/q;)V
    .registers 11

    iget-object v0, p0, LW6/x;->C:Ljava/util/List;

    new-instance v1, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    const-wide/16 v2, -0x1

    const-string v4, ""

    invoke-direct {v1, v2, v3, v4}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;-><init>(JLjava/lang/String;)V

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    iget-object v0, p0, LW6/x;->E:LT6/g;

    const/4 v1, 0x0

    const-string v3, "adapter"

    if-nez v0, :cond_1a

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1a
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemInserted(I)V

    iget-object v0, p0, LW6/x;->E:LT6/g;

    if-nez v0, :cond_25

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_26

    :cond_25
    move-object v1, v0

    :goto_26
    iget-object v0, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRangeChanged(II)V

    iget-object v0, p0, LW6/x;->F:LZ6/d;

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v1}, LZ6/d;->q(IZ)V

    iget-object v0, p1, Le3/q;->M:Landroidx/recyclerview/widget/RecyclerView;

    const-string v3, "rvPromptGenerateResult"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget v3, p0, LW6/x;->H:I

    sub-int/2addr v2, v3

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v3

    mul-int/2addr v2, v3

    invoke-virtual {p0, v0, v2}, LW6/i;->N0(Landroidx/recyclerview/widget/RecyclerView;I)V

    invoke-direct {p0, v1}, LW6/x;->Q1(Z)V

    invoke-direct {p0}, LW6/x;->b2()V

    invoke-direct {p0, p1}, LW6/x;->G1(Le3/q;)V

    invoke-direct {p0, v1, v1}, LW6/x;->S1(ZZ)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, LW6/x;->N1(LW6/x;ZZLv8/a;ILjava/lang/Object;)V

    return-void
.end method

.method private static final n1(LW6/x;)V
    .registers 3

    invoke-virtual {p0}, LW6/i;->x0()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object p0, p0, LW6/x;->F:LZ6/d;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, LZ6/d;->q(IZ)V

    :cond_d
    return-void
.end method

.method private final o1(Le3/q;LT6/g;)V
    .registers 5

    iget-object v0, p1, Le3/q;->M:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iget-object p2, p0, LW6/x;->F:LZ6/d;

    iget-object v0, p1, Le3/q;->M:Landroidx/recyclerview/widget/RecyclerView;

    const-string v1, "rvPromptGenerateResult"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, LZ6/d;->i(Landroidx/recyclerview/widget/RecyclerView;)V

    iget-object p1, p1, Le3/q;->M:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, LW6/x$b;

    invoke-direct {p2, p0}, LW6/x$b;-><init>(LW6/x;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method

.method private final p1()V
    .registers 4

    iget-object v0, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object v1

    invoke-virtual {v1}, La7/d;->a0()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_44

    const-string v0, "NTCreativePromptResultFragment"

    const-string v1, "checkWallpapersCount not same!"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, LW6/x;->C:Ljava/util/List;

    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object v1

    invoke-virtual {v1}, La7/d;->a0()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, LW6/x;->E:LT6/g;

    if-nez v0, :cond_39

    const-string v0, "adapter"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_39
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    iget-object v0, p0, LW6/x;->F:LZ6/d;

    iget v1, p0, LW6/x;->H:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LZ6/d;->q(IZ)V

    :cond_44
    invoke-direct {p0}, LW6/x;->b2()V

    return-void
.end method

.method private final q1()La7/d;
    .registers 1

    iget-object p0, p0, LW6/x;->G:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La7/d;

    return-object p0
.end method

.method private final r1(Z)V
    .registers 10

    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_7

    invoke-direct {p0, v0}, LW6/x;->K1(Le3/q;)V

    :cond_7
    const/4 v0, 0x0

    invoke-direct {p0, v0}, LW6/x;->P1(Z)V

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, LW6/x;->X1(ZZ)V

    invoke-direct {p0, v1, v0}, LW6/x;->U1(ZZ)V

    invoke-direct {p0, v1}, LW6/x;->W1(Z)V

    invoke-direct {p0, v1}, LW6/x;->V1(Z)V

    invoke-direct {p0}, LW6/x;->J1()V

    invoke-direct {p0}, LW6/x;->p1()V

    invoke-direct {p0, v0}, LW6/x;->Q1(Z)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, LW6/x;->N1(LW6/x;ZZLv8/a;ILjava/lang/Object;)V

    invoke-direct {v2, v0}, LW6/x;->O1(Z)V

    const/4 p0, 0x2

    const/4 v1, 0x0

    invoke-static {v2, v0, v0, p0, v1}, LW6/x;->T1(LW6/x;ZZILjava/lang/Object;)V

    if-eqz p1, :cond_37

    invoke-virtual {v2, v1}, LW6/i;->K0(LX6/d$a;)V

    :cond_37
    iget-object p0, v2, LW6/x;->D:Le3/q;

    if-eqz p0, :cond_42

    iget-object p0, p0, Le3/q;->G:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    if-eqz p0, :cond_42

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->setNeedInterceptTouchEvent(Z)V

    :cond_42
    return-void
.end method

.method private final s1(LX6/d;Z)V
    .registers 5

    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_7

    invoke-direct {p0, v0}, LW6/x;->K1(Le3/q;)V

    :cond_7
    instance-of v0, p1, LX6/d$b;

    const/4 v1, 0x0

    if-eqz v0, :cond_35

    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object v0

    check-cast p1, LX6/d$b;

    invoke-virtual {v0, p1}, La7/d;->u0(LX6/d$b;)Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-virtual {p1}, LX6/d$b;->a()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0, p2}, LW6/x;->Z1(Ljava/util/List;Z)V

    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object p2

    invoke-virtual {p1}, LX6/d$b;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Li8/s;->S(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    invoke-virtual {p2, p1}, La7/d;->A0(Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;)V

    goto :goto_42

    :cond_31
    invoke-direct {p0, v1, p2}, LW6/x;->Y1(LX6/d$a;Z)V

    goto :goto_42

    :cond_35
    instance-of v0, p1, LX6/d$a;

    if-eqz v0, :cond_3f

    check-cast p1, LX6/d$a;

    invoke-direct {p0, p1, p2}, LW6/x;->Y1(LX6/d$a;Z)V

    goto :goto_42

    :cond_3f
    invoke-direct {p0, v1, p2}, LW6/x;->Y1(LX6/d$a;Z)V

    :goto_42
    iget-object p0, p0, LW6/x;->D:Le3/q;

    if-eqz p0, :cond_4e

    iget-object p0, p0, Le3/q;->G:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    if-eqz p0, :cond_4e

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->setNeedInterceptTouchEvent(Z)V

    :cond_4e
    return-void
.end method

.method private final t1()V
    .registers 3

    iget-object v0, p0, LW6/x;->D:Le3/q;

    const/4 v1, 0x1

    if-eqz v0, :cond_c

    iget-object v0, v0, Le3/q;->G:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    if-eqz v0, :cond_c

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->setNeedInterceptTouchEvent(Z)V

    :cond_c
    invoke-direct {p0, v1}, LW6/x;->P1(Z)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0}, LW6/x;->X1(ZZ)V

    invoke-direct {p0, v0, v0}, LW6/x;->U1(ZZ)V

    invoke-direct {p0, v0}, LW6/x;->W1(Z)V

    invoke-direct {p0, v0}, LW6/x;->V1(Z)V

    invoke-direct {p0}, LW6/x;->l1()V

    return-void
.end method

.method private final u1(I)V
    .registers 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleOnItemClicked "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NTCreativePromptResultFragment"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, LW6/x;->H:I

    if-ne p1, v0, :cond_1e

    invoke-direct {p0}, LW6/x;->L1()V

    return-void

    :cond_1e
    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_2a

    iget-object v0, v0, Le3/q;->G:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    if-eqz v0, :cond_2a

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->setNeedInterceptTouchEvent(Z)V

    :cond_2a
    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_4a

    iget-object v0, v0, Le3/q;->M:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_4a

    iget v1, p0, LW6/x;->H:I

    sub-int/2addr p1, v1

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v1

    mul-int/2addr p1, v1

    invoke-virtual {p0, v0, p1}, LW6/i;->N0(Landroidx/recyclerview/widget/RecyclerView;I)V

    new-instance p1, LW6/t;

    invoke-direct {p1, p0}, LW6/t;-><init>(LW6/x;)V

    invoke-virtual {p0}, LW6/i;->s0()I

    move-result p0

    int-to-long v1, p0

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4a
    return-void
.end method

.method private static final v1(LW6/x;)V
    .registers 2

    iget-object p0, p0, LW6/x;->D:Le3/q;

    if-eqz p0, :cond_c

    iget-object p0, p0, Le3/q;->G:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    if-eqz p0, :cond_c

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->setNeedInterceptTouchEvent(Z)V

    :cond_c
    return-void
.end method

.method private final w1(La7/d$c;Z)V
    .registers 11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleUiStateOnChanged:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NTCreativePromptResultFragment"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    instance-of v0, p1, La7/d$c$c;

    if-eqz v0, :cond_20

    xor-int/lit8 p1, p2, 0x1

    invoke-direct {p0, p1}, LW6/x;->r1(Z)V

    return-void

    :cond_20
    instance-of v0, p1, La7/d$c$i;

    if-nez v0, :cond_66

    instance-of v0, p1, La7/d$c$d;

    if-nez v0, :cond_66

    instance-of v0, p1, La7/d$c$e;

    if-eqz v0, :cond_2d

    goto :goto_66

    :cond_2d
    instance-of v0, p1, La7/d$c$b;

    if-eqz v0, :cond_60

    iget-object v0, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_54

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v2

    new-instance v5, LW6/x$c;

    const/4 v0, 0x0

    invoke-direct {v5, p0, p1, p2, v0}, LW6/x$c;-><init>(LW6/x;La7/d$c;ZLm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void

    :cond_54
    check-cast p1, La7/d$c$b;

    invoke-virtual {p1}, La7/d$c$b;->e()LX6/d;

    move-result-object p1

    xor-int/lit8 p2, p2, 0x1

    invoke-direct {p0, p1, p2}, LW6/x;->s1(LX6/d;Z)V

    return-void

    :cond_60
    if-eqz p2, :cond_65

    invoke-direct {p0}, LW6/x;->p1()V

    :cond_65
    return-void

    :cond_66
    :goto_66
    invoke-direct {p0}, LW6/x;->t1()V

    return-void
.end method

.method private final x1()V
    .registers 4

    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_2d

    iget-object v1, v0, Le3/q;->z:Landroid/widget/TextView;

    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object v2

    invoke-virtual {v2}, La7/d;->l0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Le3/q;->N:Landroid/widget/Toolbar;

    const v2, 0x7f0f0005

    invoke-virtual {v1, v2}, Landroid/widget/Toolbar;->inflateMenu(I)V

    iget-object v1, v0, Le3/q;->N:Landroid/widget/Toolbar;

    new-instance v2, LW6/u;

    invoke-direct {v2, p0}, LW6/u;-><init>(LW6/x;)V

    invoke-virtual {v1, v2}, Landroid/widget/Toolbar;->setOnMenuItemClickListener(Landroid/widget/Toolbar$OnMenuItemClickListener;)V

    iget-object v0, v0, Le3/q;->N:Landroid/widget/Toolbar;

    new-instance v1, LW6/v;

    invoke-direct {v1, p0}, LW6/v;-><init>(LW6/x;)V

    invoke-virtual {v0, v1}, Landroid/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2d
    invoke-virtual {p0}, LW6/i;->y0()Z

    move-result v0

    if-eqz v0, :cond_3e

    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_3a

    iget-object v0, v0, Le3/q;->N:Landroid/widget/Toolbar;

    goto :goto_3b

    :cond_3a
    const/4 v0, 0x0

    :goto_3b
    invoke-virtual {p0, v0}, LW6/i;->J0(Landroid/widget/Toolbar;)V

    :cond_3e
    return-void
.end method

.method private static final y1(LW6/x;Landroid/view/MenuItem;)Z
    .registers 3

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f0a02ed

    if-ne p1, v0, :cond_30

    iget p1, p0, LW6/x;->H:I

    iget-object v0, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_2e

    iget-object p1, p0, LW6/x;->C:Ljava/util/List;

    iget v0, p0, LW6/x;->H:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/creative/model/Wallpaper;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2e

    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object p0

    invoke-virtual {p0, p1}, La7/d;->v0(Ljava/lang/String;)V

    :cond_2e
    const/4 p0, 0x1

    return p0

    :cond_30
    const/4 p0, 0x0

    return p0
.end method

.method private static final z1(LW6/x;Landroid/view/View;)V
    .registers 2

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    move-result-object p0

    if-eqz p0, :cond_f

    invoke-virtual {p0}, Lb/j;->f()Lb/v;

    move-result-object p0

    if-eqz p0, :cond_f

    invoke-virtual {p0}, Lb/v;->l()V

    :cond_f
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .registers 3

    invoke-super {p0, p1}, LW6/i;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "NTCreativePromptResultFragment"

    const-string v0, "onCreate"

    invoke-static {p1, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LW6/i;->k0(Z)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 4

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Le3/q;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/q;

    move-result-object p1

    iput-object p1, p0, LW6/x;->D:Le3/q;

    invoke-direct {p0}, LW6/x;->A1()V

    invoke-virtual {p1}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object p0

    const-string p1, "let(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public onDestroyView()V
    .registers 2

    invoke-super {p0}, LW6/i;->onDestroyView()V

    iget-object v0, p0, LW6/x;->F:LZ6/d;

    invoke-virtual {v0}, LZ6/d;->k()V

    const/4 v0, 0x0

    iput-object v0, p0, LW6/x;->D:Le3/q;

    return-void
.end method

.method public onStop()V
    .registers 5

    invoke-super {p0}, LW6/i;->onStop()V

    iget-object v0, p0, LW6/x;->C:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onStop "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NTCreativePromptResultFragment"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LW6/x;->C:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2f

    sget-object v0, LJ6/h;->i:LJ6/h$a;

    invoke-virtual {v0, v1}, LJ6/h$a;->b(Z)V

    :cond_2f
    iget-object v0, p0, LW6/x;->D:Le3/q;

    if-eqz v0, :cond_36

    invoke-direct {p0, v0}, LW6/x;->K1(Le3/q;)V

    :cond_36
    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, La7/d;->I(La7/d;ZILjava/lang/Object;)V

    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object p0

    invoke-virtual {p0}, La7/d;->K()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/q;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, LW6/x;->H1()V

    return-void
.end method

.method public q()Z
    .registers 3

    invoke-virtual {p0}, LW6/i;->r0()La7/d$c;

    move-result-object v0

    sget-object v1, La7/d$c$e;->v:La7/d$c$e;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_30

    invoke-virtual {p0}, LW6/i;->r0()La7/d$c;

    move-result-object v0

    sget-object v1, La7/d$c$d;->v:La7/d$c$d;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    goto :goto_30

    :cond_19
    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La7/d;->H(Z)V

    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object v0

    invoke-virtual {v0, v1}, La7/d;->H0(I)V

    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object p0

    invoke-virtual {p0}, La7/d;->z0()V

    return v1

    :cond_30
    :goto_30
    invoke-direct {p0}, LW6/x;->q1()La7/d;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, La7/d;->H(Z)V

    return v0
.end method
