.class public final LW6/U;
.super LW6/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW6/U$a;
    }
.end annotation


# static fields
.field public static final b0:LW6/U$a;


# instance fields
.field private C:Le3/s;

.field private final D:Lh8/h;

.field private E:Lcom/google/android/material/bottomsheet/a;

.field private final F:Ljava/util/List;

.field private final G:Ljava/util/List;

.field private H:LT6/b;

.field private I:LT6/b;

.field private final J:LZ6/d;

.field private final K:LZ6/d;

.field private L:I

.field private M:I

.field private N:I

.field private O:I

.field private P:Landroid/view/View;

.field private Q:Landroid/view/View;

.field private R:Landroid/view/View;

.field private S:Landroid/view/View;

.field private T:Landroid/view/View;

.field private U:Landroid/view/View;

.field private V:Z

.field private W:LW6/l;

.field private X:Z

.field private Y:Ljava/lang/String;

.field private final Z:LW6/U$i;

.field private final a0:LW6/U$e;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LW6/U$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW6/U$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LW6/U;->b0:LW6/U$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 5

    invoke-direct {p0}, LW6/i;-><init>()V

    const-class v0, La7/d;

    invoke-static {v0}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v0

    new-instance v1, LW6/U$f;

    invoke-direct {v1, p0}, LW6/U$f;-><init>(Landroidx/fragment/app/q;)V

    new-instance v2, LW6/U$g;

    const/4 v3, 0x0

    invoke-direct {v2, v3, p0}, LW6/U$g;-><init>(Lv8/a;Landroidx/fragment/app/q;)V

    new-instance v3, LW6/U$h;

    invoke-direct {v3, p0}, LW6/U$h;-><init>(Landroidx/fragment/app/q;)V

    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/X;->b(Landroidx/fragment/app/q;LC8/c;Lv8/a;Lv8/a;Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, LW6/U;->D:Lh8/h;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LW6/U;->F:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LW6/U;->G:Ljava/util/List;

    new-instance v0, LZ6/d;

    new-instance v1, Landroidx/recyclerview/widget/PagerSnapHelper;

    invoke-direct {v1}, Landroidx/recyclerview/widget/PagerSnapHelper;-><init>()V

    invoke-direct {v0, v1}, LZ6/d;-><init>(Landroidx/recyclerview/widget/SnapHelper;)V

    iput-object v0, p0, LW6/U;->J:LZ6/d;

    new-instance v0, LZ6/d;

    new-instance v1, Landroidx/recyclerview/widget/PagerSnapHelper;

    invoke-direct {v1}, Landroidx/recyclerview/widget/PagerSnapHelper;-><init>()V

    invoke-direct {v0, v1}, LZ6/d;-><init>(Landroidx/recyclerview/widget/SnapHelper;)V

    iput-object v0, p0, LW6/U;->K:LZ6/d;

    const/4 v0, 0x1

    iput-boolean v0, p0, LW6/U;->X:Z

    const-string v0, ""

    iput-object v0, p0, LW6/U;->Y:Ljava/lang/String;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, LW6/U$i;

    invoke-direct {v1, p0, v0}, LW6/U$i;-><init>(LW6/U;Landroid/os/Looper;)V

    iput-object v1, p0, LW6/U;->Z:LW6/U$i;

    new-instance v0, LW6/U$e;

    invoke-direct {v0, p0}, LW6/U$e;-><init>(LW6/U;)V

    iput-object v0, p0, LW6/U;->a0:LW6/U$e;

    return-void
.end method

.method private final A1(Le3/s;LT6/b;)V
    .registers 5

    iget-object v0, p1, Le3/s;->R:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iget-object p2, p0, LW6/U;->K:LZ6/d;

    iget-object v0, p1, Le3/s;->R:Landroidx/recyclerview/widget/RecyclerView;

    const-string v1, "rvSubjectPrompt"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, LZ6/d;->i(Landroidx/recyclerview/widget/RecyclerView;)V

    iget-object p1, p1, Le3/s;->R:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, LW6/U$c;

    invoke-direct {p2, p0}, LW6/U$c;-><init>(LW6/U;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method

.method private final A2(Z)V
    .registers 8

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    iget-object p0, p0, LW6/U;->C:Le3/s;

    if-eqz p0, :cond_c

    iget-object p0, p0, Le3/s;->B:Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;

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

.method private final B1()V
    .registers 6

    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object v0

    invoke-virtual {v0}, La7/d;->g0()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_48

    iget-object v3, p0, LW6/U;->G:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-eq v3, v4, :cond_48

    iget-object v3, p0, LW6/U;->G:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    iget-object v3, p0, LW6/U;->G:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, LW6/U;->I:LT6/b;

    const-string v3, "subjectAdapter"

    if-nez v0, :cond_2e

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2e
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    iget v0, p0, LW6/U;->L:I

    iget-object v4, p0, LW6/U;->I:LT6/b;

    if-nez v4, :cond_3b

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v4, v1

    :cond_3b
    invoke-virtual {v4}, LT6/b;->getItemCount()I

    move-result v3

    if-ge v0, v3, :cond_48

    iget-object v0, p0, LW6/U;->K:LZ6/d;

    iget v3, p0, LW6/U;->L:I

    invoke-virtual {v0, v3, v2}, LZ6/d;->q(IZ)V

    :cond_48
    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object v0

    invoke-virtual {v0}, La7/d;->f0()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_8e

    iget-object v3, p0, LW6/U;->F:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-eq v3, v4, :cond_8e

    iget-object v3, p0, LW6/U;->F:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    iget-object v3, p0, LW6/U;->F:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v3, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, LW6/U;->H:LT6/b;

    const-string v3, "styleAdapter"

    if-nez v0, :cond_74

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_74
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    iget v0, p0, LW6/U;->M:I

    iget-object v4, p0, LW6/U;->H:LT6/b;

    if-nez v4, :cond_81

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v4, v1

    :cond_81
    invoke-virtual {v4}, LT6/b;->getItemCount()I

    move-result v3

    if-ge v0, v3, :cond_8e

    iget-object v0, p0, LW6/U;->J:LZ6/d;

    iget v3, p0, LW6/U;->M:I

    invoke-virtual {v0, v3, v2}, LZ6/d;->q(IZ)V

    :cond_8e
    iget-object v0, p0, LW6/U;->F:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v3, 0x1

    xor-int/2addr v0, v3

    iget-object v4, p0, LW6/U;->G:Ljava/util/List;

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v3

    or-int/2addr v0, v4

    const/4 v4, 0x2

    if-eqz v0, :cond_bb

    invoke-direct {p0, v3, v3}, LW6/U;->F2(ZZ)V

    invoke-direct {p0, v3, v3, v3}, LW6/U;->w2(ZZZ)V

    invoke-direct {p0, v3, v3, v1}, LW6/U;->H2(ZZLv8/a;)V

    invoke-static {p0, v2, v2, v4, v1}, LW6/U;->C2(LW6/U;ZIILjava/lang/Object;)V

    invoke-direct {p0, v3}, LW6/U;->I2(Z)V

    invoke-direct {p0, v2, v2}, LW6/U;->E2(ZZ)V

    invoke-direct {p0, v3, v2, v3}, LW6/U;->D2(ZZZ)V

    return-void

    :cond_bb
    invoke-direct {p0, v2, v2}, LW6/U;->F2(ZZ)V

    invoke-direct {p0, v2, v3, v2}, LW6/U;->w2(ZZZ)V

    invoke-direct {p0, v2, v3, v1}, LW6/U;->H2(ZZLv8/a;)V

    invoke-static {p0, v3, v2, v4, v1}, LW6/U;->C2(LW6/U;ZIILjava/lang/Object;)V

    invoke-direct {p0, v2}, LW6/U;->I2(Z)V

    invoke-direct {p0, v3, v2}, LW6/U;->E2(ZZ)V

    invoke-direct {p0, v2, v2, v2}, LW6/U;->D2(ZZZ)V

    return-void
.end method

.method private final B2(ZI)V
    .registers 5

    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_24

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    goto :goto_a

    :cond_8
    const/16 p1, 0x8

    :goto_a
    iget-object v1, v0, Le3/s;->x:Le3/E;

    iget-object v1, v1, Le3/E;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, v0, Le3/s;->x:Le3/E;

    iget-object p1, p1, Le3/E;->x:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_24
    return-void
.end method

.method private final C1()V
    .registers 1

    iget-object p0, p0, LW6/U;->E:Lcom/google/android/material/bottomsheet/a;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Landroidx/appcompat/app/k;->dismiss()V

    :cond_7
    return-void
.end method

.method static synthetic C2(LW6/U;ZIILjava/lang/Object;)V
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_7

    const p2, 0x7f13021e

    :cond_7
    invoke-direct {p0, p1, p2}, LW6/U;->B2(ZI)V

    return-void
.end method

.method private final D1()V
    .registers 1

    iget-object p0, p0, LW6/U;->W:LW6/l;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, LW6/l;->f()V

    :cond_7
    return-void
.end method

.method private final D2(ZZZ)V
    .registers 10

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    iget-object p0, p0, LW6/U;->C:Le3/s;

    if-eqz p0, :cond_c

    iget-object p0, p0, Le3/s;->C:Landroid/widget/ImageView;

    :goto_a
    move-object v1, p0

    goto :goto_e

    :cond_c
    const/4 p0, 0x0

    goto :goto_a

    :goto_e
    const/4 v5, 0x0

    move v2, p1

    move v3, p2

    move v4, p3

    invoke-virtual/range {v0 .. v5}, LW6/e;->B(Landroid/view/View;ZZZLv8/a;)V

    return-void
.end method

.method private final E1()V
    .registers 3

    iget-object p0, p0, LW6/U;->C:Le3/s;

    if-eqz p0, :cond_f

    iget-object v0, p0, Le3/s;->O:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->setNeedInterceptTouchEvent(Z)V

    iget-object p0, p0, Le3/s;->N:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    invoke-virtual {p0, v1}, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->setNeedInterceptTouchEvent(Z)V

    :cond_f
    return-void
.end method

.method private final E2(ZZ)V
    .registers 5

    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_3b

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    goto :goto_9

    :cond_8
    const/4 p1, 0x4

    :goto_9
    iget-object v1, v0, Le3/s;->D:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, v0, Le3/s;->E:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, v0, Le3/s;->K:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Le3/s;->L:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Le3/s;->F:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, v0, Le3/s;->G:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, v0, Le3/s;->K:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v1, "lavPromptPlaceholder"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LW6/i;->z0(Lcom/airbnb/lottie/LottieAnimationView;Z)V

    iget-object p1, v0, Le3/s;->L:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v0, "lavPromptPlaceholder2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LW6/i;->z0(Lcom/airbnb/lottie/LottieAnimationView;Z)V

    :cond_3b
    return-void
.end method

.method private final F1()V
    .registers 3

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iget-object v1, p0, LW6/U;->F:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    iput v0, p0, LW6/U;->O:I

    iget v1, p0, LW6/U;->M:I

    if-ne v0, v1, :cond_18

    invoke-direct {p0}, LW6/U;->F1()V

    :cond_18
    return-void
.end method

.method private final F2(ZZ)V
    .registers 19

    move-object/from16 v0, p0

    invoke-virtual {v0}, LW6/i;->n0()LW6/e;

    move-result-object v1

    iget-object v2, v0, LW6/U;->C:Le3/s;

    const/4 v8, 0x0

    if-eqz v2, :cond_e

    iget-object v2, v2, Le3/s;->N:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    goto :goto_f

    :cond_e
    move-object v2, v8

    :goto_f
    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x1

    move/from16 v3, p1

    move/from16 v4, p2

    invoke-virtual/range {v1 .. v7}, LW6/e;->C(Landroid/view/View;ZZZZLv8/a;)V

    invoke-virtual {v0}, LW6/i;->n0()LW6/e;

    move-result-object v9

    iget-object v0, v0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_23

    iget-object v8, v0, Le3/s;->O:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    :cond_23
    move-object v10, v8

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v13, 0x1

    move/from16 v11, p1

    move/from16 v12, p2

    invoke-virtual/range {v9 .. v15}, LW6/e;->C(Landroid/view/View;ZZZZLv8/a;)V

    return-void
.end method

.method private final G1()V
    .registers 3

    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    iget-object v1, p0, LW6/U;->G:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    iput v0, p0, LW6/U;->N:I

    iget v1, p0, LW6/U;->L:I

    if-ne v0, v1, :cond_18

    invoke-direct {p0}, LW6/U;->G1()V

    :cond_18
    return-void
.end method

.method private final G2(ZZ)V
    .registers 11

    if-eqz p1, :cond_15

    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_15

    iget-object v0, v0, Le3/s;->P:Landroid/widget/TextView;

    if-eqz v0, :cond_15

    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object v1

    invoke-virtual {v1}, La7/d;->l0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_15
    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v2

    iget-object p0, p0, LW6/U;->C:Le3/s;

    if-eqz p0, :cond_21

    iget-object p0, p0, Le3/s;->P:Landroid/widget/TextView;

    :goto_1f
    move-object v3, p0

    goto :goto_23

    :cond_21
    const/4 p0, 0x0

    goto :goto_1f

    :goto_23
    const/4 v6, 0x1

    const/4 v7, 0x0

    move v4, p1

    move v5, p2

    invoke-virtual/range {v2 .. v7}, LW6/e;->B(Landroid/view/View;ZZZLv8/a;)V

    return-void
.end method

.method private final H1()La7/d;
    .registers 1

    iget-object p0, p0, LW6/U;->D:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La7/d;

    return-object p0
.end method

.method private final H2(ZZLv8/a;)V
    .registers 10

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    iget-object p0, p0, LW6/U;->C:Le3/s;

    if-eqz p0, :cond_c

    iget-object p0, p0, Le3/s;->z:Landroid/widget/TextView;

    :goto_a
    move-object v1, p0

    goto :goto_e

    :cond_c
    const/4 p0, 0x0

    goto :goto_a

    :goto_e
    const/4 v4, 0x1

    move v2, p1

    move v3, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, LW6/e;->B(Landroid/view/View;ZZZLv8/a;)V

    return-void
.end method

.method private final I1(LX6/d$a;Z)V
    .registers 11

    const-string v0, "NTCreativeSelectorFragment"

    const-string v1, "handleGenerateWallpaperFailure"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, LW6/U;->t2(LW6/U;ZZLv8/a;ILjava/lang/Object;)V

    const/4 p0, 0x0

    invoke-direct {v2, p0, p0}, LW6/U;->G2(ZZ)V

    invoke-direct {v2, p0}, LW6/U;->z2(Z)V

    invoke-direct {v2, p0}, LW6/U;->y2(Z)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {v2, p0, p0, v0, v1}, LW6/U;->v2(LW6/U;ZZILjava/lang/Object;)V

    invoke-direct {v2}, LW6/U;->B1()V

    if-eqz p2, :cond_27

    invoke-virtual {v2, p1}, LW6/i;->K0(LX6/d$a;)V

    :cond_27
    return-void
.end method

.method private final I2(Z)V
    .registers 4

    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_12

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object p0

    iget-object v0, v0, Le3/s;->H:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    const-string v1, "ivSelectedFrame"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p1}, LW6/e;->G(Landroid/widget/ImageView;Z)V

    :cond_12
    return-void
.end method

.method private final J1(LX6/d;Z)V
    .registers 8

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v0, v0, v1, v2}, LW6/U;->v2(LW6/U;ZZILjava/lang/Object;)V

    iget-object v1, p0, LW6/U;->C:Le3/s;

    if-eqz v1, :cond_d

    invoke-direct {p0, v1}, LW6/U;->r2(Le3/s;)V

    :cond_d
    iget-object v1, p0, LW6/U;->I:LT6/b;

    const-string v3, "subjectAdapter"

    if-nez v1, :cond_17

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v2

    :cond_17
    invoke-virtual {v1}, LT6/b;->d()Z

    move-result v1

    const/4 v4, 0x1

    if-nez v1, :cond_34

    iget-object v1, p0, LW6/U;->I:LT6/b;

    if-nez v1, :cond_26

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v2

    :cond_26
    invoke-virtual {v1, v4}, LT6/b;->g(Z)V

    iget-object v1, p0, LW6/U;->I:LT6/b;

    if-nez v1, :cond_31

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v2

    :cond_31
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_34
    iget-object v1, p0, LW6/U;->H:LT6/b;

    const-string v3, "styleAdapter"

    if-nez v1, :cond_3e

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v2

    :cond_3e
    invoke-virtual {v1}, LT6/b;->d()Z

    move-result v1

    if-nez v1, :cond_5a

    iget-object v1, p0, LW6/U;->H:LT6/b;

    if-nez v1, :cond_4c

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v2

    :cond_4c
    invoke-virtual {v1, v4}, LT6/b;->g(Z)V

    iget-object v1, p0, LW6/U;->H:LT6/b;

    if-nez v1, :cond_57

    invoke-static {v3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v2

    :cond_57
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_5a
    iget-object v1, p0, LW6/U;->K:LZ6/d;

    iget v3, p0, LW6/U;->L:I

    invoke-virtual {v1, v3, v0}, LZ6/d;->q(IZ)V

    iget-object v1, p0, LW6/U;->J:LZ6/d;

    iget v3, p0, LW6/U;->M:I

    invoke-virtual {v1, v3, v0}, LZ6/d;->q(IZ)V

    invoke-direct {p0, v0, v0}, LW6/U;->F2(ZZ)V

    invoke-direct {p0, v0}, LW6/U;->y2(Z)V

    invoke-direct {p0, v0}, LW6/U;->A2(Z)V

    instance-of v0, p1, LX6/d$b;

    if-eqz v0, :cond_b3

    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object v0

    check-cast p1, LX6/d$b;

    invoke-virtual {v0, p1}, La7/d;->u0(LX6/d$b;)Z

    move-result p1

    if-eqz p1, :cond_af

    :try_start_81
    invoke-virtual {p0}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type com.nothing.wallpaper.picker.creative.CreativeNavigator"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LS6/d;

    invoke-interface {p1}, LS6/d;->A()V
    :try_end_8f
    .catch Ljava/lang/Exception; {:try_start_81 .. :try_end_8f} :catch_90

    return-void

    :catch_90
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "showGeneratedWallpaper exception:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "NTCreativeSelectorFragment"

    invoke-static {p2, p1}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, LW6/U;->V2()V

    return-void

    :cond_af
    invoke-direct {p0, v2, p2}, LW6/U;->I1(LX6/d$a;Z)V

    return-void

    :cond_b3
    const-string v0, "null cannot be cast to non-null type com.nothing.wallpaper.picker.creative.model.WallpaperResult.Fail"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LX6/d$a;

    invoke-direct {p0, p1, p2}, LW6/U;->I1(LX6/d$a;Z)V

    return-void
.end method

.method private final J2()V
    .registers 6

    iget-object v0, p0, LW6/U;->E:Lcom/google/android/material/bottomsheet/a;

    const/4 v1, 0x1

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-ne v0, v1, :cond_c

    return-void

    :cond_c
    invoke-direct {p0}, LW6/U;->D1()V

    new-instance v0, Lcom/google/android/material/bottomsheet/a;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f14012b

    invoke-direct {v0, v2, v3}, Lcom/google/android/material/bottomsheet/a;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, LW6/U;->E:Lcom/google/android/material/bottomsheet/a;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0d0127

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-static {}, Lc3/a;->a()Z

    move-result v2

    if-eqz v2, :cond_3b

    new-instance v2, LW6/T;

    invoke-direct {v2, v0}, LW6/T;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    :cond_3b
    const v2, 0x7f0a04e7

    invoke-virtual {v0, v2}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f1301f2

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v2, 0x7f0a04e6

    invoke-virtual {v0, v2}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "requireViewById(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f1301f0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, LW6/U;->E:Lcom/google/android/material/bottomsheet/a;

    if-eqz v2, :cond_90

    invoke-virtual {v2}, Lb/q;->f()Lb/v;

    move-result-object v3

    iget-object v4, p0, LW6/U;->a0:LW6/U$e;

    invoke-virtual {v3, v4}, Lb/v;->i(Lb/u;)V

    new-instance v3, LW6/z;

    invoke-direct {v3, p0}, LW6/z;-><init>(LW6/U;)V

    invoke-virtual {v2, v3}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    invoke-virtual {v2, v1}, Lcom/google/android/material/bottomsheet/a;->setCanceledOnTouchOutside(Z)V

    invoke-virtual {v2, v0}, Lcom/google/android/material/bottomsheet/a;->setContentView(Landroid/view/View;)V

    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    :cond_90
    return-void
.end method

.method private final K1(Z)V
    .registers 9

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    invoke-virtual {v0}, LW6/e;->l()V

    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_e

    invoke-direct {p0, v0}, LW6/U;->r2(Le3/s;)V

    :cond_e
    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LW6/U;->t2(LW6/U;ZZLv8/a;ILjava/lang/Object;)V

    const/4 p0, 0x0

    invoke-direct {v1, p0, p0}, LW6/U;->G2(ZZ)V

    invoke-direct {v1, p0}, LW6/U;->z2(Z)V

    invoke-direct {v1, p0}, LW6/U;->y2(Z)V

    invoke-direct {v1, p0}, LW6/U;->A2(Z)V

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {v1, p0, p0, v0, v2}, LW6/U;->v2(LW6/U;ZZILjava/lang/Object;)V

    invoke-direct {v1}, LW6/U;->B1()V

    if-eqz p1, :cond_31

    invoke-virtual {v1, v2}, LW6/i;->K0(LX6/d$a;)V

    :cond_31
    return-void
.end method

.method private static final K2(Landroid/view/View;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 6

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "windowInsets"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/core/view/V$k;->d()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object p1

    const-string v0, "getInsets(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget p1, p1, Landroid/graphics/Insets;->bottom:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/view/View;->setPadding(IIII)V

    return-object p2
.end method

.method private final L1()V
    .registers 11

    invoke-direct {p0}, LW6/U;->E1()V

    new-instance v1, LW6/I;

    invoke-direct {v1, p0}, LW6/I;-><init>(LW6/U;)V

    const/4 v6, 0x0

    const/4 v7, 0x1

    invoke-direct {p0, v6, v7, v1}, LW6/U;->s2(ZZLv8/a;)V

    invoke-direct {p0, v6, v6}, LW6/U;->G2(ZZ)V

    invoke-direct {p0, v6}, LW6/U;->I2(Z)V

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static {p0, v6, v6, v8, v9}, LW6/U;->C2(LW6/U;ZIILjava/lang/Object;)V

    invoke-direct {p0, v6, v6}, LW6/U;->E2(ZZ)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LW6/U;->x2(LW6/U;ZZZILjava/lang/Object;)V

    new-instance v1, LW6/K;

    invoke-direct {v1, p0}, LW6/K;-><init>(LW6/U;)V

    invoke-direct {p0, v6, v7, v1}, LW6/U;->H2(ZZLv8/a;)V

    invoke-direct {p0, v6, v7, v7}, LW6/U;->D2(ZZZ)V

    invoke-direct {p0, v7}, LW6/U;->A2(Z)V

    invoke-static {p0, v7, v6, v8, v9}, LW6/U;->v2(LW6/U;ZZILjava/lang/Object;)V

    iget-object v1, p0, LW6/U;->C:Le3/s;

    if-eqz v1, :cond_41

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LW6/U;->k2(LW6/U;Le3/s;IIILjava/lang/Object;)V

    :cond_41
    return-void
.end method

.method private static final L2(LW6/U;Landroid/content/DialogInterface;)V
    .registers 2

    iget-object p0, p0, LW6/U;->a0:LW6/U$e;

    invoke-virtual {p0}, Lb/u;->h()V

    return-void
.end method

.method private static final M1(LW6/U;)Lh8/A;
    .registers 2

    invoke-virtual {p0}, LW6/i;->x0()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    invoke-direct {p0, v0, v0}, LW6/U;->G2(ZZ)V

    :cond_a
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final M2(Z)V
    .registers 3

    iput-boolean p1, p0, LW6/U;->V:Z

    invoke-direct {p0}, LW6/U;->i2()Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_34

    :cond_9
    invoke-direct {p0}, LW6/U;->C1()V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_34

    new-instance v0, LW6/l;

    invoke-direct {v0, p1}, LW6/l;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, LW6/U;->W:LW6/l;

    new-instance p1, LW6/A;

    invoke-direct {p1, p0}, LW6/A;-><init>(LW6/U;)V

    invoke-virtual {v0, p1}, LW6/l;->o(Lv8/l;)V

    new-instance p1, LW6/B;

    invoke-direct {p1, p0}, LW6/B;-><init>(LW6/U;)V

    invoke-virtual {v0, p1}, LW6/l;->q(Landroid/content/DialogInterface$OnShowListener;)V

    new-instance p1, LW6/C;

    invoke-direct {p1, p0}, LW6/C;-><init>(LW6/U;)V

    invoke-virtual {v0, p1}, LW6/l;->p(Landroid/content/DialogInterface$OnDismissListener;)V

    invoke-virtual {v0}, LW6/l;->s()V

    :cond_34
    :goto_34
    return-void
.end method

.method private static final N1(LW6/U;)Lh8/A;
    .registers 2

    invoke-virtual {p0}, LW6/i;->x0()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LW6/U;->z2(Z)V

    :cond_a
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final N2(LW6/U;Z)Lh8/A;
    .registers 2

    if-eqz p1, :cond_d

    iget-boolean p1, p0, LW6/U;->V:Z

    if-eqz p1, :cond_a

    invoke-direct {p0}, LW6/U;->p2()V

    goto :goto_d

    :cond_a
    invoke-direct {p0}, LW6/U;->o2()V

    :cond_d
    :goto_d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final O1(LX6/b;)V
    .registers 3

    instance-of v0, p1, LX6/b$b;

    if-eqz v0, :cond_a

    check-cast p1, LX6/b$b;

    invoke-direct {p0, p1}, LW6/U;->U2(LX6/b$b;)V

    return-void

    :cond_a
    instance-of v0, p1, LX6/b$a;

    if-eqz v0, :cond_14

    check-cast p1, LX6/b$a;

    invoke-direct {p0, p1}, LW6/U;->T2(LX6/b$a;)V

    return-void

    :cond_14
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0
.end method

.method private static final O2(LW6/U;Landroid/content/DialogInterface;)V
    .registers 2

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LW6/i;->k0(Z)V

    return-void
.end method

.method private final P1()V
    .registers 7

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LW6/U;->t2(LW6/U;ZZLv8/a;ILjava/lang/Object;)V

    const/4 p0, 0x0

    invoke-direct {v0, p0, p0}, LW6/U;->G2(ZZ)V

    invoke-direct {v0, p0}, LW6/U;->z2(Z)V

    invoke-direct {v0, p0}, LW6/U;->y2(Z)V

    invoke-direct {v0, p0}, LW6/U;->A2(Z)V

    invoke-direct {v0}, LW6/U;->B1()V

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p0, p0, v1, v2}, LW6/U;->v2(LW6/U;ZZILjava/lang/Object;)V

    return-void
.end method

.method private static final P2(LW6/U;Landroid/content/DialogInterface;)V
    .registers 2

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LW6/i;->k0(Z)V

    return-void
.end method

.method private final Q1()V
    .registers 13

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LW6/U;->t2(LW6/U;ZZLv8/a;ILjava/lang/Object;)V

    const/4 p0, 0x0

    invoke-direct {v0, p0, p0}, LW6/U;->G2(ZZ)V

    invoke-direct {v0, p0}, LW6/U;->I2(Z)V

    invoke-direct {v0, p0, p0}, LW6/U;->F2(ZZ)V

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p0, p0, v1, v2}, LW6/U;->C2(LW6/U;ZIILjava/lang/Object;)V

    invoke-direct {v0, p0}, LW6/U;->z2(Z)V

    invoke-direct {v0, p0}, LW6/U;->y2(Z)V

    const/4 v3, 0x1

    invoke-direct {v0, v3, v3}, LW6/U;->E2(ZZ)V

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v0

    invoke-static/range {v6 .. v11}, LW6/U;->x2(LW6/U;ZZZILjava/lang/Object;)V

    invoke-direct {v0, p0, p0, v2}, LW6/U;->H2(ZZLv8/a;)V

    invoke-direct {v0, p0, p0, p0}, LW6/U;->D2(ZZZ)V

    invoke-direct {v0, p0}, LW6/U;->A2(Z)V

    invoke-static {v0, p0, p0, v1, v2}, LW6/U;->v2(LW6/U;ZZILjava/lang/Object;)V

    return-void
.end method

.method private final Q2()V
    .registers 3

    iget-object p0, p0, LW6/U;->C:Le3/s;

    if-eqz p0, :cond_f

    iget-object v0, p0, Le3/s;->O:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->setNeedInterceptTouchEvent(Z)V

    iget-object p0, p0, Le3/s;->N:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    invoke-virtual {p0, v1}, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->setNeedInterceptTouchEvent(Z)V

    :cond_f
    return-void
.end method

.method public static synthetic R0(LW6/U;)V
    .registers 1

    invoke-static {p0}, LW6/U;->S1(LW6/U;)V

    return-void
.end method

.method private final R1(I)V
    .registers 5

    iget v0, p0, LW6/U;->M:I

    if-eq p1, v0, :cond_30

    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_10

    iget-object v0, v0, Le3/s;->N:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    if-eqz v0, :cond_10

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->setNeedInterceptTouchEvent(Z)V

    :cond_10
    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_30

    iget-object v0, v0, Le3/s;->Q:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_30

    iget v1, p0, LW6/U;->M:I

    sub-int/2addr p1, v1

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v1

    mul-int/2addr p1, v1

    invoke-virtual {p0, v0, p1}, LW6/i;->N0(Landroidx/recyclerview/widget/RecyclerView;I)V

    new-instance p1, LW6/E;

    invoke-direct {p1, p0}, LW6/E;-><init>(LW6/U;)V

    invoke-virtual {p0}, LW6/i;->s0()I

    move-result p0

    int-to-long v1, p0

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_30
    return-void
.end method

.method private final R2()V
    .registers 3

    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_10

    iget-object v0, v0, Le3/s;->H:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    if-eqz v0, :cond_10

    new-instance v1, LW6/F;

    invoke-direct {v1, p0}, LW6/F;-><init>(LW6/U;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_10
    return-void
.end method

.method public static synthetic S0(Landroid/view/View;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .registers 3

    invoke-static {p0, p1, p2}, LW6/U;->K2(Landroid/view/View;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0
.end method

.method private static final S1(LW6/U;)V
    .registers 2

    iget-object p0, p0, LW6/U;->C:Le3/s;

    if-eqz p0, :cond_c

    iget-object p0, p0, Le3/s;->N:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    if-eqz p0, :cond_c

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->setNeedInterceptTouchEvent(Z)V

    :cond_c
    return-void
.end method

.method private static final S2(LW6/U;)V
    .registers 12

    invoke-virtual {p0}, LW6/i;->w0()Z

    move-result v0

    if-eqz v0, :cond_8

    goto/16 :goto_1ce

    :cond_8
    invoke-static {}, LH3/s;->a()LH3/s;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v0, v1}, LH3/s;->e(Landroid/view/Display;)Landroid/graphics/Point;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2d

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    if-eqz v1, :cond_2d

    const v3, 0x7f070472

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    goto :goto_2e

    :cond_2d
    move v1, v2

    :goto_2e
    iget-object v3, p0, LW6/U;->C:Le3/s;

    if-eqz v3, :cond_3b

    iget-object v3, v3, Le3/s;->H:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    if-eqz v3, :cond_3b

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    goto :goto_3c

    :cond_3b
    move v3, v2

    :goto_3c
    iget-object v4, p0, LW6/U;->C:Le3/s;

    if-eqz v4, :cond_49

    iget-object v4, v4, Le3/s;->H:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    if-eqz v4, :cond_49

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    goto :goto_4a

    :cond_49
    move v4, v2

    :goto_4a
    sub-int v5, v3, v1

    invoke-virtual {p0, v5}, LW6/i;->E0(I)V

    sub-int v5, v4, v1

    div-int/lit8 v5, v5, 0x2

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v6

    sub-int v6, v4, v6

    div-int/lit8 v6, v6, 0x4

    mul-int/lit8 v6, v6, 0x3

    sub-int/2addr v6, v1

    invoke-virtual {p0, v6}, LW6/i;->H0(I)V

    iget-object v1, p0, LW6/U;->J:LZ6/d;

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v6

    invoke-virtual {v1, v6}, LZ6/d;->u(I)V

    iget-object v1, p0, LW6/U;->K:LZ6/d;

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v6

    invoke-virtual {v1, v6}, LZ6/d;->u(I)V

    iget-object v1, p0, LW6/U;->C:Le3/s;

    if-eqz v1, :cond_1ce

    iget-object v6, v1, Le3/s;->R:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    iput v5, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v6, v1, Le3/s;->Q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    iput v5, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget v0, v0, Landroid/graphics/Point;->x:I

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v6

    sub-int/2addr v0, v6

    div-int/lit8 v0, v0, 0x2

    iget-object v6, v1, Le3/s;->R:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6, v0, v2, v0, v2}, Landroid/view/View;->setPadding(IIII)V

    iget-object v6, v1, Le3/s;->Q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6, v0, v2, v0, v2}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v6, 0x7f07047b

    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    sub-int v6, v4, v5

    sub-int/2addr v6, v0

    iget-object v0, v1, Le3/s;->R:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const-string v7, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iput v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget-object v0, v1, Le3/s;->Q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iput v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v6, 0x7f070479

    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v8, 0x7f070477

    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    float-to-int v6, v6

    mul-int/lit8 v8, v0, 0x2

    sub-int/2addr v3, v8

    sub-int/2addr v4, v8

    sub-int v6, v4, v6

    div-int/lit8 v6, v6, 0x2

    iget-object v8, v1, Le3/s;->D:Landroid/widget/ImageView;

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    iget-object v9, v1, Le3/s;->E:Landroid/widget/ImageView;

    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    iput v3, v8, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v6, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v3, v9, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v6, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v8, v7}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    iput v0, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-static {v9, v7}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    iput v0, v9, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget-object v8, v1, Le3/s;->F:Landroid/widget/ImageView;

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    iget-object v9, v1, Le3/s;->G:Landroid/widget/ImageView;

    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    iput v3, v8, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v6, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v3, v9, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v6, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v8, v7}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    iput v0, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-static {v9, v7}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    iput v0, v9, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget-object v8, v1, Le3/s;->K:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    iget-object v9, v1, Le3/s;->L:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    iput v3, v8, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v6, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v3, v9, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v6, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v9, v7}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Landroid/view/ViewGroup$MarginLayoutParams;

    iput v0, v9, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-static {v8, v7}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    iput v0, v8, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v6, v1, Le3/s;->R:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    iget-object v1, v1, Le3/s;->Q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    iget-object v1, p0, LW6/U;->I:LT6/b;

    const-string v6, "subjectAdapter"

    const/4 v7, 0x0

    if-nez v1, :cond_160

    invoke-static {v6}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v7

    :cond_160
    new-instance v8, Landroid/graphics/Point;

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v9

    invoke-direct {v8, v9, v5}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v1, v8}, LT6/b;->h(Landroid/graphics/Point;)V

    iget-object v1, p0, LW6/U;->H:LT6/b;

    const-string v8, "styleAdapter"

    if-nez v1, :cond_176

    invoke-static {v8}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v7

    :cond_176
    new-instance v9, Landroid/graphics/Point;

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v10

    invoke-direct {v9, v10, v5}, Landroid/graphics/Point;-><init>(II)V

    invoke-virtual {v1, v9}, LT6/b;->h(Landroid/graphics/Point;)V

    iget-object v1, p0, LW6/U;->I:LT6/b;

    if-nez v1, :cond_18a

    invoke-static {v6}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v7

    :cond_18a
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    iget-object v1, p0, LW6/U;->H:LT6/b;

    if-nez v1, :cond_195

    invoke-static {v8}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_196

    :cond_195
    move-object v7, v1

    :goto_196
    invoke-virtual {v7}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    iget-object v1, p0, LW6/U;->K:LZ6/d;

    iget v5, p0, LW6/U;->L:I

    invoke-virtual {v1, v5, v2}, LZ6/d;->q(IZ)V

    iget-object v1, p0, LW6/U;->J:LZ6/d;

    iget v5, p0, LW6/U;->M:I

    invoke-virtual {v1, v5, v2}, LZ6/d;->q(IZ)V

    iget-object v1, p0, LW6/U;->C:Le3/s;

    if-eqz v1, :cond_1ce

    iget-object v1, v1, Le3/s;->B:Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;

    if-eqz v1, :cond_1ce

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f070471

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    iget-object p0, p0, LW6/U;->C:Le3/s;

    if-eqz p0, :cond_1c6

    iget-object p0, p0, Le3/s;->S:Landroid/widget/Toolbar;

    if-eqz p0, :cond_1c6

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    :cond_1c6
    add-int/2addr v5, v2

    add-int/2addr v5, v0

    invoke-virtual {v1, v5}, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->setHollowMarginTop(I)V

    invoke-virtual {v1, v3, v4}, Lcom/nothing/wallpaper/picker/creative/view/MaskHollowView;->c(II)V

    :cond_1ce
    :goto_1ce
    return-void
.end method

.method public static synthetic T0(LW6/U;)Lh8/A;
    .registers 1

    invoke-static {p0}, LW6/U;->Y2(LW6/U;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final T1(I)V
    .registers 5

    iget v0, p0, LW6/U;->L:I

    if-eq p1, v0, :cond_30

    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_10

    iget-object v0, v0, Le3/s;->O:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    if-eqz v0, :cond_10

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->setNeedInterceptTouchEvent(Z)V

    :cond_10
    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_30

    iget-object v0, v0, Le3/s;->R:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_30

    iget v1, p0, LW6/U;->L:I

    sub-int/2addr p1, v1

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v1

    mul-int/2addr p1, v1

    invoke-virtual {p0, v0, p1}, LW6/i;->N0(Landroidx/recyclerview/widget/RecyclerView;I)V

    new-instance p1, LW6/D;

    invoke-direct {p1, p0}, LW6/D;-><init>(LW6/U;)V

    invoke-virtual {p0}, LW6/i;->s0()I

    move-result p0

    int-to-long v1, p0

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_30
    return-void
.end method

.method private final T2(LX6/b$a;)V
    .registers 15

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateLoadPromptFail "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NTCreativeSelectorFragment"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LW6/i;->w0()Z

    move-result v0

    if-eqz v0, :cond_1d

    return-void

    :cond_1d
    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LW6/U;->t2(LW6/U;ZZLv8/a;ILjava/lang/Object;)V

    const/4 p0, 0x0

    invoke-direct {v1, p0, p0}, LW6/U;->G2(ZZ)V

    invoke-direct {v1, p0}, LW6/U;->I2(Z)V

    invoke-direct {v1, p0, p0}, LW6/U;->F2(ZZ)V

    invoke-direct {v1, p0}, LW6/U;->z2(Z)V

    invoke-direct {v1, p0}, LW6/U;->y2(Z)V

    const/4 v0, 0x1

    invoke-direct {v1, v0, p0}, LW6/U;->E2(ZZ)V

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, v1

    invoke-static/range {v7 .. v12}, LW6/U;->x2(LW6/U;ZZZILjava/lang/Object;)V

    const/4 v2, 0x0

    invoke-direct {v1, p0, p0, v2}, LW6/U;->H2(ZZLv8/a;)V

    invoke-direct {v1, p0, p0, p0}, LW6/U;->D2(ZZZ)V

    invoke-direct {v1, p0}, LW6/U;->A2(Z)V

    const/4 v3, 0x2

    invoke-static {v1, p0, p0, v3, v2}, LW6/U;->v2(LW6/U;ZZILjava/lang/Object;)V

    invoke-virtual {v1}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object p0

    const-string v2, "requireContext(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Li6/m;->a(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_8b

    sget-object p0, La7/d;->v:La7/d$b;

    invoke-virtual {p1}, LX6/b$a;->a()Ljava/lang/Exception;

    move-result-object v2

    invoke-virtual {p0, v2}, La7/d$b;->c(Ljava/lang/Exception;)Z

    move-result v2

    if-eqz v2, :cond_73

    const p0, 0x7f13022e

    invoke-direct {v1, v0, p0}, LW6/U;->B2(ZI)V

    return-void

    :cond_73
    invoke-virtual {p1}, LX6/b$a;->a()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {p0, p1}, La7/d$b;->d(Ljava/lang/Exception;)Z

    move-result p0

    if-eqz p0, :cond_84

    const p0, 0x7f130232

    invoke-direct {v1, v0, p0}, LW6/U;->B2(ZI)V

    return-void

    :cond_84
    const p0, 0x7f130229

    invoke-direct {v1, v0, p0}, LW6/U;->B2(ZI)V

    return-void

    :cond_8b
    const p0, 0x7f13021e

    invoke-direct {v1, v0, p0}, LW6/U;->B2(ZI)V

    return-void
.end method

.method public static synthetic U0(LW6/U;Z)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LW6/U;->N2(LW6/U;Z)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final U1(LW6/U;)V
    .registers 2

    iget-object p0, p0, LW6/U;->C:Le3/s;

    if-eqz p0, :cond_c

    iget-object p0, p0, Le3/s;->O:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    if-eqz p0, :cond_c

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->setNeedInterceptTouchEvent(Z)V

    :cond_c
    return-void
.end method

.method private final U2(LX6/b$b;)V
    .registers 3

    invoke-virtual {p0}, LW6/i;->w0()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    invoke-direct {p0}, LW6/U;->V2()V

    invoke-direct {p0, p1}, LW6/U;->W2(LX6/b$b;)V

    return-void
.end method

.method public static synthetic V0(LW6/U;Landroid/content/DialogInterface;)V
    .registers 2

    invoke-static {p0, p1}, LW6/U;->L2(LW6/U;Landroid/content/DialogInterface;)V

    return-void
.end method

.method private final V1()V
    .registers 6

    const/4 v0, 0x0

    iput-boolean v0, p0, LW6/U;->X:Z

    invoke-direct {p0}, LW6/U;->E1()V

    iget-object v1, p0, LW6/U;->H:LT6/b;

    const-string v2, "styleAdapter"

    const/4 v3, 0x0

    if-nez v1, :cond_11

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v3

    :cond_11
    invoke-virtual {v1, v0}, LT6/b;->g(Z)V

    iget-object v1, p0, LW6/U;->I:LT6/b;

    const-string v4, "subjectAdapter"

    if-nez v1, :cond_1e

    invoke-static {v4}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v3

    :cond_1e
    invoke-virtual {v1, v0}, LT6/b;->g(Z)V

    iget-object v0, p0, LW6/U;->H:LT6/b;

    if-nez v0, :cond_29

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v3

    :cond_29
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    iget-object v0, p0, LW6/U;->I:LT6/b;

    if-nez v0, :cond_34

    invoke-static {v4}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_35

    :cond_34
    move-object v3, v0

    :goto_35
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    iget v0, p0, LW6/U;->O:I

    iget v1, p0, LW6/U;->M:I

    sub-int/2addr v0, v1

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v1

    mul-int/2addr v0, v1

    iget v1, p0, LW6/U;->N:I

    iget v2, p0, LW6/U;->L:I

    sub-int/2addr v1, v2

    invoke-virtual {p0}, LW6/i;->q0()I

    move-result v2

    mul-int/2addr v1, v2

    iget-object v2, p0, LW6/U;->C:Le3/s;

    if-eqz v2, :cond_66

    iget-object v3, v2, Le3/s;->Q:Landroidx/recyclerview/widget/RecyclerView;

    const-string v4, "rvStylePrompt"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v4, 0x320

    invoke-virtual {p0, v3, v0, v4}, LW6/i;->O0(Landroidx/recyclerview/widget/RecyclerView;II)V

    iget-object v0, v2, Le3/s;->R:Landroidx/recyclerview/widget/RecyclerView;

    const-string v2, "rvSubjectPrompt"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1, v4}, LW6/i;->O0(Landroidx/recyclerview/widget/RecyclerView;II)V

    :cond_66
    iget-object v0, p0, LW6/U;->Z:LW6/U$i;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p0, p0, LW6/U;->Z:LW6/U$i;

    const-wide/16 v2, 0x384

    invoke-virtual {p0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method private final V2()V
    .registers 13

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LW6/U;->t2(LW6/U;ZZLv8/a;ILjava/lang/Object;)V

    const/4 p0, 0x0

    invoke-direct {v0, p0, p0}, LW6/U;->G2(ZZ)V

    invoke-direct {v0, v1}, LW6/U;->I2(Z)V

    invoke-direct {v0, v1, v1}, LW6/U;->F2(ZZ)V

    const/4 v2, 0x2

    invoke-static {v0, p0, p0, v2, v3}, LW6/U;->C2(LW6/U;ZIILjava/lang/Object;)V

    invoke-direct {v0, p0}, LW6/U;->z2(Z)V

    invoke-direct {v0, p0}, LW6/U;->y2(Z)V

    invoke-direct {v0, p0, p0}, LW6/U;->E2(ZZ)V

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-object v6, v0

    invoke-static/range {v6 .. v11}, LW6/U;->x2(LW6/U;ZZZILjava/lang/Object;)V

    invoke-direct {v0, v1, v1, v3}, LW6/U;->H2(ZZLv8/a;)V

    invoke-direct {v0, v1, p0, v1}, LW6/U;->D2(ZZZ)V

    invoke-direct {v0, p0}, LW6/U;->A2(Z)V

    invoke-static {v0, p0, p0, v2, v3}, LW6/U;->v2(LW6/U;ZZILjava/lang/Object;)V

    return-void
.end method

.method public static synthetic W0(LW6/U;)V
    .registers 1

    invoke-static {p0}, LW6/U;->U1(LW6/U;)V

    return-void
.end method

.method private final W1(La7/d$c;Z)V
    .registers 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleUiStateOnChanged "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NTCreativeSelectorFragment"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LW6/i;->x0()Z

    move-result v0

    invoke-virtual {p0, v0}, LW6/i;->k0(Z)V

    instance-of v0, p1, La7/d$c$h;

    if-eqz v0, :cond_25

    invoke-direct {p0}, LW6/U;->Q1()V

    return-void

    :cond_25
    instance-of v0, p1, La7/d$c$f;

    if-eqz v0, :cond_35

    check-cast p1, La7/d$c$f;

    invoke-virtual {p1}, La7/d$c$f;->e()LX6/b;

    move-result-object p1

    if-eqz p1, :cond_66

    invoke-direct {p0, p1}, LW6/U;->O1(LX6/b;)V

    return-void

    :cond_35
    instance-of v0, p1, La7/d$c$g;

    if-eqz v0, :cond_3d

    invoke-direct {p0}, LW6/U;->P1()V

    return-void

    :cond_3d
    instance-of v0, p1, La7/d$c$c;

    if-eqz v0, :cond_47

    xor-int/lit8 p1, p2, 0x1

    invoke-direct {p0, p1}, LW6/U;->K1(Z)V

    return-void

    :cond_47
    instance-of v0, p1, La7/d$c$d;

    if-eqz v0, :cond_4f

    invoke-direct {p0}, LW6/U;->V1()V

    return-void

    :cond_4f
    instance-of v0, p1, La7/d$c$e;

    if-eqz v0, :cond_57

    invoke-direct {p0}, LW6/U;->L1()V

    return-void

    :cond_57
    instance-of v0, p1, La7/d$c$b;

    if-eqz v0, :cond_66

    check-cast p1, La7/d$c$b;

    invoke-virtual {p1}, La7/d$c$b;->e()LX6/d;

    move-result-object p1

    xor-int/lit8 p2, p2, 0x1

    invoke-direct {p0, p1, p2}, LW6/U;->J1(LX6/d;Z)V

    :cond_66
    return-void
.end method

.method private final W2(LX6/b$b;)V
    .registers 6

    invoke-virtual {p1}, LX6/b$b;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_91

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;

    invoke-static {v0}, LX6/a;->b(Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_4c

    iget-object v1, p0, LW6/U;->G:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;->getPrompts()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-eq v1, v3, :cond_4c

    iget-object v1, p0, LW6/U;->G:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, p0, LW6/U;->G:Ljava/util/List;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;->getPrompts()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, LW6/U;->I:LT6/b;

    if-nez v0, :cond_47

    const-string v0, "subjectAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_48

    :cond_47
    move-object v2, v0

    :goto_48
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    goto :goto_80

    :cond_4c
    invoke-static {v0}, LX6/a;->a(Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;)Z

    move-result v1

    if-eqz v1, :cond_80

    iget-object v1, p0, LW6/U;->F:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;->getPrompts()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-eq v1, v3, :cond_80

    iget-object v1, p0, LW6/U;->F:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, p0, LW6/U;->F:Ljava/util/List;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/PromptCategory;->getPrompts()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, LW6/U;->H:LT6/b;

    if-nez v0, :cond_7c

    const-string v0, "styleAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_7d

    :cond_7c
    move-object v2, v0

    :goto_7d
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_80
    :goto_80
    iget-object v0, p0, LW6/U;->J:LZ6/d;

    iget v1, p0, LW6/U;->M:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LZ6/d;->q(IZ)V

    iget-object v0, p0, LW6/U;->K:LZ6/d;

    iget v1, p0, LW6/U;->L:I

    invoke-virtual {v0, v1, v2}, LZ6/d;->q(IZ)V

    goto/16 :goto_a

    :cond_91
    return-void
.end method

.method public static synthetic X0(LW6/U;Landroid/content/DialogInterface;)V
    .registers 2

    invoke-static {p0, p1}, LW6/U;->O2(LW6/U;Landroid/content/DialogInterface;)V

    return-void
.end method

.method private final X1()V
    .registers 4

    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_2c

    iget-object v1, v0, Le3/s;->y:Landroid/widget/TextView;

    const v2, 0x7f1301f2

    invoke-virtual {p0, v2}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Le3/s;->S:Landroid/widget/Toolbar;

    const v2, 0x7f0f0004

    invoke-virtual {v1, v2}, Landroid/widget/Toolbar;->inflateMenu(I)V

    iget-object v1, v0, Le3/s;->S:Landroid/widget/Toolbar;

    new-instance v2, LW6/G;

    invoke-direct {v2, p0}, LW6/G;-><init>(LW6/U;)V

    invoke-virtual {v1, v2}, Landroid/widget/Toolbar;->setOnMenuItemClickListener(Landroid/widget/Toolbar$OnMenuItemClickListener;)V

    iget-object v0, v0, Le3/s;->S:Landroid/widget/Toolbar;

    new-instance v1, LW6/H;

    invoke-direct {v1, p0}, LW6/H;-><init>(LW6/U;)V

    invoke-virtual {v0, v1}, Landroid/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2c
    invoke-virtual {p0}, LW6/i;->y0()Z

    move-result v0

    if-eqz v0, :cond_3d

    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_39

    iget-object v0, v0, Le3/s;->S:Landroid/widget/Toolbar;

    goto :goto_3a

    :cond_39
    const/4 v0, 0x0

    :goto_3a
    invoke-virtual {p0, v0}, LW6/i;->J0(Landroid/widget/Toolbar;)V

    :cond_3d
    return-void
.end method

.method private final X2()V
    .registers 11

    iget-object v0, p0, LW6/U;->K:LZ6/d;

    iget v1, p0, LW6/U;->L:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LZ6/d;->q(IZ)V

    iget-object v0, p0, LW6/U;->J:LZ6/d;

    iget v1, p0, LW6/U;->M:I

    invoke-virtual {v0, v1, v2}, LZ6/d;->q(IZ)V

    new-instance v0, LW6/y;

    invoke-direct {v0, p0}, LW6/y;-><init>(LW6/U;)V

    const/4 v1, 0x1

    invoke-direct {p0, v2, v1, v0}, LW6/U;->s2(ZZLv8/a;)V

    invoke-direct {p0, v2}, LW6/U;->I2(Z)V

    const/4 v0, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v2, v2, v0, v3}, LW6/U;->C2(LW6/U;ZIILjava/lang/Object;)V

    invoke-direct {p0, v2, v2}, LW6/U;->E2(ZZ)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v9}, LW6/U;->x2(LW6/U;ZZZILjava/lang/Object;)V

    new-instance p0, LW6/J;

    invoke-direct {p0, v4}, LW6/J;-><init>(LW6/U;)V

    invoke-direct {v4, v2, v1, p0}, LW6/U;->H2(ZZLv8/a;)V

    invoke-static {v4, v1, v2, v0, v3}, LW6/U;->v2(LW6/U;ZZILjava/lang/Object;)V

    invoke-direct {v4, v2, v1, v2}, LW6/U;->D2(ZZZ)V

    invoke-direct {v4, v1}, LW6/U;->A2(Z)V

    iget-object p0, v4, LW6/U;->C:Le3/s;

    if-eqz p0, :cond_48

    iget v0, v4, LW6/U;->O:I

    iget v1, v4, LW6/U;->N:I

    invoke-direct {v4, p0, v0, v1}, LW6/U;->j2(Le3/s;II)V

    :cond_48
    return-void
.end method

.method public static synthetic Y0(LW6/U;Landroid/view/MenuItem;)Z
    .registers 2

    invoke-static {p0, p1}, LW6/U;->Y1(LW6/U;Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method

.method private static final Y1(LW6/U;Landroid/view/MenuItem;)Z
    .registers 3

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f0a02ec

    if-ne p1, v0, :cond_e

    invoke-direct {p0}, LW6/U;->J2()V

    const/4 p0, 0x1

    return p0

    :cond_e
    const/4 p0, 0x0

    return p0
.end method

.method private static final Y2(LW6/U;)Lh8/A;
    .registers 2

    invoke-virtual {p0}, LW6/i;->x0()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    invoke-direct {p0, v0, v0}, LW6/U;->G2(ZZ)V

    :cond_a
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static synthetic Z0(LW6/U;)V
    .registers 1

    invoke-static {p0}, LW6/U;->S2(LW6/U;)V

    return-void
.end method

.method private static final Z1(LW6/U;Landroid/view/View;)V
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

.method private static final Z2(LW6/U;)Lh8/A;
    .registers 2

    invoke-virtual {p0}, LW6/i;->x0()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LW6/U;->z2(Z)V

    :cond_a
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static synthetic a1(LW6/U;I)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LW6/U;->c2(LW6/U;I)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final a2()V
    .registers 7

    invoke-direct {p0}, LW6/U;->X1()V

    invoke-virtual {p0}, LW6/i;->I0()V

    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_8e

    new-instance v1, LT6/b;

    iget-object v2, p0, LW6/U;->F:Ljava/util/List;

    iget-object v3, p0, LW6/U;->Z:LW6/U$i;

    new-instance v4, LW6/M;

    invoke-direct {v4, p0}, LW6/M;-><init>(LW6/U;)V

    const/4 v5, 0x1

    invoke-direct {v1, v2, v5, v3, v4}, LT6/b;-><init>(Ljava/util/List;ZLandroid/os/Handler;Lv8/l;)V

    iput-object v1, p0, LW6/U;->H:LT6/b;

    new-instance v1, LT6/b;

    iget-object v2, p0, LW6/U;->G:Ljava/util/List;

    iget-object v3, p0, LW6/U;->Z:LW6/U$i;

    new-instance v4, LW6/N;

    invoke-direct {v4, p0}, LW6/N;-><init>(LW6/U;)V

    const/4 v5, 0x0

    invoke-direct {v1, v2, v5, v3, v4}, LT6/b;-><init>(Ljava/util/List;ZLandroid/os/Handler;Lv8/l;)V

    iput-object v1, p0, LW6/U;->I:LT6/b;

    iget-object v1, p0, LW6/U;->H:LT6/b;

    const/4 v2, 0x0

    if-nez v1, :cond_37

    const-string v1, "styleAdapter"

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v2

    :cond_37
    invoke-direct {p0, v0, v1}, LW6/U;->z1(Le3/s;LT6/b;)V

    iget-object v1, p0, LW6/U;->I:LT6/b;

    if-nez v1, :cond_44

    const-string v1, "subjectAdapter"

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_45

    :cond_44
    move-object v2, v1

    :goto_45
    invoke-direct {p0, v0, v2}, LW6/U;->A1(Le3/s;LT6/b;)V

    iget-object v1, v0, Le3/s;->C:Landroid/widget/ImageView;

    new-instance v2, LW6/O;

    invoke-direct {v2, p0}, LW6/O;-><init>(LW6/U;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, v0, Le3/s;->w:Landroid/widget/TextView;

    new-instance v2, LW6/P;

    invoke-direct {v2, p0}, LW6/P;-><init>(LW6/U;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, v0, Le3/s;->z:Landroid/widget/TextView;

    new-instance v2, LW6/Q;

    invoke-direct {v2, p0}, LW6/Q;-><init>(LW6/U;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, v0, Le3/s;->K:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v2, "lavPromptPlaceholder"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, LW6/i;->G0(Lcom/airbnb/lottie/LottieAnimationView;)V

    iget-object v1, v0, Le3/s;->L:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v2, "lavPromptPlaceholder2"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, LW6/i;->G0(Lcom/airbnb/lottie/LottieAnimationView;)V

    iget-object v1, v0, Le3/s;->H:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    new-instance v2, LW6/S;

    invoke-direct {v2, p0}, LW6/S;-><init>(LW6/U;)V

    invoke-virtual {v1, v2}, Lcom/nothing/wallpaper/widget/AspectRatioImageView;->setOnSizeChanged(Lv8/p;)V

    iget-object v0, v0, Le3/s;->A:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    const-string v1, "ivBlurPlaceholder"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LW6/i;->D0(Landroid/widget/ImageView;)V

    :cond_8e
    return-void
.end method

.method public static synthetic b1(LW6/U;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, LW6/U;->e2(LW6/U;Landroid/view/View;)V

    return-void
.end method

.method private static final b2(LW6/U;I)Lh8/A;
    .registers 2

    invoke-direct {p0, p1}, LW6/U;->R1(I)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static synthetic c1(LW6/U;II)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, LW6/U;->g2(LW6/U;II)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final c2(LW6/U;I)Lh8/A;
    .registers 2

    invoke-direct {p0, p1}, LW6/U;->T1(I)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static synthetic d1(LW6/U;)Lh8/A;
    .registers 1

    invoke-static {p0}, LW6/U;->Z2(LW6/U;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final d2(LW6/U;Landroid/view/View;)V
    .registers 2

    invoke-direct {p0}, LW6/U;->o2()V

    return-void
.end method

.method public static synthetic e1(LW6/U;Landroid/content/DialogInterface;)V
    .registers 2

    invoke-static {p0, p1}, LW6/U;->P2(LW6/U;Landroid/content/DialogInterface;)V

    return-void
.end method

.method private static final e2(LW6/U;Landroid/view/View;)V
    .registers 2

    invoke-direct {p0}, LW6/U;->o2()V

    return-void
.end method

.method public static synthetic f1(LW6/U;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, LW6/U;->d2(LW6/U;Landroid/view/View;)V

    return-void
.end method

.method private static final f2(LW6/U;Landroid/view/View;)V
    .registers 2

    invoke-direct {p0}, LW6/U;->p2()V

    return-void
.end method

.method public static synthetic g1(LW6/U;I)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LW6/U;->b2(LW6/U;I)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final g2(LW6/U;II)Lh8/A;
    .registers 3

    invoke-direct {p0}, LW6/U;->R2()V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static synthetic h1(LW6/U;)Lh8/A;
    .registers 1

    invoke-static {p0}, LW6/U;->N1(LW6/U;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final h2()Z
    .registers 3

    iget-object p0, p0, LW6/U;->E:Lcom/google/android/material/bottomsheet/a;

    const/4 v0, 0x0

    if-eqz p0, :cond_d

    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_d

    return v1

    :cond_d
    return v0
.end method

.method public static synthetic i1(LW6/U;)Lh8/A;
    .registers 1

    invoke-static {p0}, LW6/U;->M1(LW6/U;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final i2()Z
    .registers 1

    iget-object p0, p0, LW6/U;->W:LW6/l;

    if-eqz p0, :cond_9

    invoke-virtual {p0}, LW6/l;->j()Z

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic j1(LW6/U;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, LW6/U;->f2(LW6/U;Landroid/view/View;)V

    return-void
.end method

.method private final j2(Le3/s;II)V
    .registers 4

    invoke-direct {p0}, LW6/U;->E1()V

    invoke-direct {p0, p1, p2, p3}, LW6/U;->m2(Le3/s;II)V

    invoke-direct {p0, p1, p2, p3}, LW6/U;->l2(Le3/s;II)V

    return-void
.end method

.method public static synthetic k1(LW6/U;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, LW6/U;->Z1(LW6/U;Landroid/view/View;)V

    return-void
.end method

.method static synthetic k2(LW6/U;Le3/s;IIILjava/lang/Object;)V
    .registers 6

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_6

    iget p2, p0, LW6/U;->M:I

    :cond_6
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_c

    iget p3, p0, LW6/U;->L:I

    :cond_c
    invoke-direct {p0, p1, p2, p3}, LW6/U;->j2(Le3/s;II)V

    return-void
.end method

.method public static synthetic l1(LW6/U;Z)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LW6/U;->q2(LW6/U;Z)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private final l2(Le3/s;II)V
    .registers 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v1, Le3/s;->R:Landroidx/recyclerview/widget/RecyclerView;

    move/from16 v3, p3

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_12

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    goto :goto_13

    :cond_12
    move-object v2, v3

    :goto_13
    iput-object v2, v0, LW6/U;->P:Landroid/view/View;

    iget-object v2, v1, Le3/s;->Q:Landroidx/recyclerview/widget/RecyclerView;

    move/from16 v4, p2

    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v2

    if-eqz v2, :cond_21

    iget-object v3, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    :cond_21
    iput-object v3, v0, LW6/U;->Q:Landroid/view/View;

    iget-object v9, v0, LW6/U;->P:Landroid/view/View;

    const-string v2, "lavProcessingLoop"

    const-string v3, "lavProcessing"

    const-string v12, "layoutStylePromptList"

    const-string v13, "layoutSubjectPromptList"

    if-eqz v9, :cond_4f

    invoke-virtual {v0}, LW6/i;->n0()LW6/e;

    move-result-object v4

    iget-object v5, v1, Le3/s;->O:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    invoke-static {v5, v13}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v1, Le3/s;->N:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    invoke-static {v6, v12}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v1, Le3/s;->I:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v7, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v1, Le3/s;->J:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v8, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, LW6/i;->t0()I

    move-result v10

    const/4 v11, 0x1

    invoke-virtual/range {v4 .. v11}, LW6/e;->s(Landroid/view/View;Landroid/view/View;Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;Landroid/view/View;IZ)V

    :cond_4f
    iget-object v4, v0, LW6/U;->Q:Landroid/view/View;

    if-eqz v4, :cond_7c

    invoke-virtual {v0}, LW6/i;->n0()LW6/e;

    move-result-object v14

    iget-object v15, v1, Le3/s;->O:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    invoke-static {v15, v13}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Le3/s;->N:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    invoke-static {v5, v12}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v1, Le3/s;->I:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v6, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Le3/s;->J:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, LW6/i;->t0()I

    move-result v20

    const/16 v21, 0x0

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    move-object/from16 v16, v5

    move-object/from16 v17, v6

    invoke-virtual/range {v14 .. v21}, LW6/e;->s(Landroid/view/View;Landroid/view/View;Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;Landroid/view/View;IZ)V

    :cond_7c
    invoke-virtual {v0}, LW6/i;->n0()LW6/e;

    move-result-object v22

    iget-object v2, v1, Le3/s;->N:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    invoke-static {v2, v12}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LW6/i;->p0()F

    move-result v24

    invoke-static {}, LW6/i;->o0()F

    move-result v25

    invoke-static {}, LW6/i;->m0()J

    move-result-wide v26

    move-object/from16 v23, v2

    invoke-virtual/range {v22 .. v27}, LW6/e;->x(Landroid/view/View;FFJ)V

    invoke-virtual {v0}, LW6/i;->n0()LW6/e;

    move-result-object v3

    iget-object v4, v1, Le3/s;->O:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    invoke-static {v4, v13}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LW6/i;->p0()F

    move-result v5

    invoke-static {}, LW6/i;->o0()F

    move-result v6

    invoke-static {}, LW6/i;->m0()J

    move-result-wide v7

    invoke-virtual/range {v3 .. v8}, LW6/e;->x(Landroid/view/View;FFJ)V

    invoke-virtual {v0}, LW6/i;->n0()LW6/e;

    move-result-object v2

    iget-object v1, v1, Le3/s;->A:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    const-string v3, "ivBlurPlaceholder"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LW6/i;->o0()F

    move-result v3

    invoke-static {}, LW6/i;->o0()F

    move-result v4

    invoke-virtual {v2, v1, v3, v4}, LW6/e;->z(Landroid/view/View;FF)V

    iget-object v1, v0, LW6/U;->P:Landroid/view/View;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_cc

    move v1, v3

    goto :goto_cd

    :cond_cc
    move v1, v2

    :goto_cd
    iget-object v4, v0, LW6/U;->Q:Landroid/view/View;

    if-nez v4, :cond_d2

    move v2, v3

    :cond_d2
    or-int/2addr v1, v2

    if-eqz v1, :cond_d8

    invoke-direct {v0, v3}, LW6/U;->y2(Z)V

    :cond_d8
    return-void
.end method

.method public static final synthetic m1(LW6/U;)V
    .registers 1

    invoke-direct {p0}, LW6/U;->C1()V

    return-void
.end method

.method private final m2(Le3/s;II)V
    .registers 8

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p3, :cond_13

    iget-object p3, p1, Le3/s;->R:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, v1}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object p3

    if-eqz p3, :cond_f

    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    goto :goto_10

    :cond_f
    move-object p3, v0

    :goto_10
    iput-object p3, p0, LW6/U;->R:Landroid/view/View;

    goto :goto_4b

    :cond_13
    iget-object v2, p0, LW6/U;->G:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    if-ne p3, v2, :cond_2c

    iget-object v2, p1, Le3/s;->R:Landroidx/recyclerview/widget/RecyclerView;

    sub-int/2addr p3, v1

    invoke-virtual {v2, p3}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object p3

    if-eqz p3, :cond_28

    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    goto :goto_29

    :cond_28
    move-object p3, v0

    :goto_29
    iput-object p3, p0, LW6/U;->R:Landroid/view/View;

    goto :goto_4b

    :cond_2c
    iget-object v2, p1, Le3/s;->R:Landroidx/recyclerview/widget/RecyclerView;

    add-int/lit8 v3, p3, -0x1

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v2

    if-eqz v2, :cond_39

    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    goto :goto_3a

    :cond_39
    move-object v2, v0

    :goto_3a
    iput-object v2, p0, LW6/U;->R:Landroid/view/View;

    iget-object v2, p1, Le3/s;->R:Landroidx/recyclerview/widget/RecyclerView;

    add-int/2addr p3, v1

    invoke-virtual {v2, p3}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object p3

    if-eqz p3, :cond_48

    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    goto :goto_49

    :cond_48
    move-object p3, v0

    :goto_49
    iput-object p3, p0, LW6/U;->S:Landroid/view/View;

    :goto_4b
    if-nez p2, :cond_5a

    iget-object p1, p1, Le3/s;->Q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object p1

    if-eqz p1, :cond_57

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    :cond_57
    iput-object v0, p0, LW6/U;->T:Landroid/view/View;

    goto :goto_8e

    :cond_5a
    iget-object p3, p0, LW6/U;->F:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    sub-int/2addr p3, v1

    if-ne p2, p3, :cond_71

    iget-object p1, p1, Le3/s;->Q:Landroidx/recyclerview/widget/RecyclerView;

    sub-int/2addr p2, v1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object p1

    if-eqz p1, :cond_6e

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    :cond_6e
    iput-object v0, p0, LW6/U;->T:Landroid/view/View;

    goto :goto_8e

    :cond_71
    iget-object p3, p1, Le3/s;->Q:Landroidx/recyclerview/widget/RecyclerView;

    add-int/lit8 v2, p2, -0x1

    invoke-virtual {p3, v2}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object p3

    if-eqz p3, :cond_7e

    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    goto :goto_7f

    :cond_7e
    move-object p3, v0

    :goto_7f
    iput-object p3, p0, LW6/U;->T:Landroid/view/View;

    iget-object p1, p1, Le3/s;->Q:Landroidx/recyclerview/widget/RecyclerView;

    add-int/2addr p2, v1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object p1

    if-eqz p1, :cond_8c

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    :cond_8c
    iput-object v0, p0, LW6/U;->U:Landroid/view/View;

    :goto_8e
    iget-object p1, p0, LW6/U;->R:Landroid/view/View;

    if-eqz p1, :cond_99

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object p2

    invoke-virtual {p2, p1}, LW6/e;->H(Landroid/view/View;)V

    :cond_99
    iget-object p1, p0, LW6/U;->S:Landroid/view/View;

    if-eqz p1, :cond_a4

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object p2

    invoke-virtual {p2, p1}, LW6/e;->H(Landroid/view/View;)V

    :cond_a4
    iget-object p1, p0, LW6/U;->T:Landroid/view/View;

    if-eqz p1, :cond_af

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object p2

    invoke-virtual {p2, p1}, LW6/e;->H(Landroid/view/View;)V

    :cond_af
    iget-object p1, p0, LW6/U;->U:Landroid/view/View;

    if-eqz p1, :cond_ba

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object p0

    invoke-virtual {p0, p1}, LW6/e;->H(Landroid/view/View;)V

    :cond_ba
    return-void
.end method

.method public static final synthetic n1(LW6/U;)LT6/b;
    .registers 1

    iget-object p0, p0, LW6/U;->H:LT6/b;

    return-object p0
.end method

.method private final n2()V
    .registers 9

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getViewLifecycleOwner()Landroidx/lifecycle/x;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v2

    new-instance v5, LW6/U$d;

    const/4 v0, 0x0

    invoke-direct {v5, p0, v0}, LW6/U$d;-><init>(LW6/U;Lm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public static final synthetic o1(LW6/U;)LZ6/d;
    .registers 1

    iget-object p0, p0, LW6/U;->J:LZ6/d;

    return-object p0
.end method

.method private final o2()V
    .registers 11

    const-string v0, "NTCreativeSelectorFragment"

    const-string v1, "onGenerate"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    invoke-virtual {v0}, LW6/e;->i()V

    invoke-virtual {p0}, LW6/i;->w0()Z

    move-result v0

    if-eqz v0, :cond_16

    goto/16 :goto_99

    :cond_16
    sget-object v0, LW6/l;->d:LW6/l$a;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LW6/l$a;->b(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_2c

    invoke-direct {p0, v1}, LW6/U;->M2(Z)V

    return-void

    :cond_2c
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Li6/m;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_9a

    iget v0, p0, LW6/U;->L:I

    iget-object v2, p0, LW6/U;->G:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ge v0, v2, :cond_46

    move v0, v3

    goto :goto_47

    :cond_46
    move v0, v1

    :goto_47
    iget v2, p0, LW6/U;->M:I

    iget-object v4, p0, LW6/U;->F:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_52

    move v1, v3

    :cond_52
    and-int/2addr v0, v1

    if-eqz v0, :cond_99

    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object v0

    invoke-virtual {v0}, La7/d;->Q()V

    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object v0

    iget-object v1, p0, LW6/U;->G:Ljava/util/List;

    iget v2, p0, LW6/U;->L:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-object v2, p0, LW6/U;->F:Ljava/util/List;

    iget v4, p0, LW6/U;->M:I

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    invoke-virtual {v0, v1, v2, v3}, La7/d;->W(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Z)V

    sget-object v4, LR7/d;->r:LR7/d;

    iget-object v0, p0, LW6/U;->G:Ljava/util/List;

    iget v1, p0, LW6/U;->L:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v6

    iget-object v0, p0, LW6/U;->F:Ljava/util/List;

    iget p0, p0, LW6/U;->M:I

    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v8

    const/4 v5, 0x1

    invoke-virtual/range {v4 .. v9}, LR7/d;->b(IJJ)V

    :cond_99
    :goto_99
    return-void

    :cond_9a
    invoke-virtual {p0}, LW6/i;->L0()V

    return-void
.end method

.method public static final synthetic p1(LW6/U;)I
    .registers 1

    iget p0, p0, LW6/U;->M:I

    return p0
.end method

.method private final p2()V
    .registers 11

    const-string v0, "NTCreativeSelectorFragment"

    const-string v1, "onRandomGenerate"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    invoke-virtual {v0}, LW6/e;->i()V

    invoke-virtual {p0}, LW6/i;->w0()Z

    move-result v0

    if-eqz v0, :cond_16

    goto/16 :goto_9c

    :cond_16
    sget-object v0, LW6/l;->d:LW6/l$a;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "requireContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LW6/l$a;->b(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2c

    invoke-direct {p0, v1}, LW6/U;->M2(Z)V

    return-void

    :cond_2c
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Li6/m;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3d

    invoke-virtual {p0}, LW6/i;->L0()V

    return-void

    :cond_3d
    iget-object v0, p0, LW6/U;->G:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v1

    iget-object v2, p0, LW6/U;->F:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v1

    and-int/2addr v0, v2

    if-eqz v0, :cond_9c

    invoke-direct {p0}, LW6/U;->G1()V

    invoke-direct {p0}, LW6/U;->F1()V

    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object v0

    invoke-virtual {v0}, La7/d;->Q()V

    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object v0

    iget-object v2, p0, LW6/U;->G:Ljava/util/List;

    iget v3, p0, LW6/U;->N:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    iget-object v3, p0, LW6/U;->F:Ljava/util/List;

    iget v4, p0, LW6/U;->O:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    invoke-virtual {v0, v2, v3, v1}, La7/d;->w0(Lcom/nothing/wallpaper/picker/creative/model/Prompt;Lcom/nothing/wallpaper/picker/creative/model/Prompt;Z)V

    sget-object v4, LR7/d;->r:LR7/d;

    iget-object v0, p0, LW6/U;->G:Ljava/util/List;

    iget v1, p0, LW6/U;->L:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v6

    iget-object v0, p0, LW6/U;->F:Ljava/util/List;

    iget p0, p0, LW6/U;->M:I

    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/creative/model/Prompt;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/creative/model/Prompt;->getPromptWordId()J

    move-result-wide v8

    const/4 v5, 0x3

    invoke-virtual/range {v4 .. v9}, LR7/d;->b(IJJ)V

    :cond_9c
    :goto_9c
    return-void
.end method

.method public static final synthetic q1(LW6/U;)LT6/b;
    .registers 1

    iget-object p0, p0, LW6/U;->I:LT6/b;

    return-object p0
.end method

.method private static final q2(LW6/U;Z)Lh8/A;
    .registers 5

    invoke-virtual {p0}, LW6/i;->r0()La7/d$c;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onStart network changed:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NTCreativeSelectorFragment"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_3a

    invoke-virtual {p0}, LW6/i;->r0()La7/d$c;

    move-result-object p1

    sget-object v0, La7/d$c$g;->v:La7/d$c$g;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3a

    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object p1

    const/4 v0, 0x0

    iget-object p0, p0, LW6/U;->Y:Ljava/lang/String;

    invoke-virtual {p1, v0, p0}, La7/d;->h0(ZLjava/lang/String;)V

    :cond_3a
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static final synthetic r1(LW6/U;)LZ6/d;
    .registers 1

    iget-object p0, p0, LW6/U;->K:LZ6/d;

    return-object p0
.end method

.method private final r2(Le3/s;)V
    .registers 7

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    invoke-virtual {v0}, LW6/e;->i()V

    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v3, 0xa

    invoke-virtual {v0, v3, v4}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object v1, p0, LW6/U;->R:Landroid/view/View;

    if-eqz v1, :cond_1b

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_1b
    iget-object v1, p0, LW6/U;->S:Landroid/view/View;

    if-eqz v1, :cond_22

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_22
    iget-object v1, p0, LW6/U;->T:Landroid/view/View;

    if-eqz v1, :cond_29

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_29
    iget-object v1, p0, LW6/U;->U:Landroid/view/View;

    if-eqz v1, :cond_30

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_30
    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    iget-object v1, p1, Le3/s;->O:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    const-string v3, "layoutSubjectPromptList"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p1, Le3/s;->N:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    const-string v4, "layoutStylePromptList"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v3}, LW6/e;->w(Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f010010

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    iget-object v1, p0, LW6/U;->P:Landroid/view/View;

    if-eqz v1, :cond_57

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_57
    iget-object v1, p0, LW6/U;->Q:Landroid/view/View;

    if-eqz v1, :cond_5e

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_5e
    iget-object v0, p0, LW6/U;->P:Landroid/view/View;

    if-eqz v0, :cond_65

    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    :cond_65
    iget-object v0, p0, LW6/U;->Q:Landroid/view/View;

    if-eqz v0, :cond_6c

    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    :cond_6c
    iget-object v0, p0, LW6/U;->P:Landroid/view/View;

    if-eqz v0, :cond_75

    sget-object v1, LA3/f;->a:LA3/f;

    invoke-virtual {v1, v0, v2}, LA3/f;->p(Landroid/view/View;F)V

    :cond_75
    iget-object v0, p0, LW6/U;->Q:Landroid/view/View;

    if-eqz v0, :cond_7e

    sget-object v1, LA3/f;->a:LA3/f;

    invoke-virtual {v1, v0, v2}, LA3/f;->p(Landroid/view/View;F)V

    :cond_7e
    iget-object v0, p1, Le3/s;->N:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setRenderEffect(Landroid/graphics/RenderEffect;)V

    iget-object v0, p1, Le3/s;->O:Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;

    invoke-virtual {v0, v1}, Landroid/view/View;->setRenderEffect(Landroid/graphics/RenderEffect;)V

    iget-object p1, p1, Le3/s;->A:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setRenderEffect(Landroid/graphics/RenderEffect;)V

    invoke-direct {p0}, LW6/U;->Q2()V

    return-void
.end method

.method public static final synthetic s1(LW6/U;)I
    .registers 1

    iget p0, p0, LW6/U;->L:I

    return p0
.end method

.method private final s2(ZZLv8/a;)V
    .registers 10

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    iget-object p0, p0, LW6/U;->C:Le3/s;

    if-eqz p0, :cond_c

    iget-object p0, p0, Le3/s;->S:Landroid/widget/Toolbar;

    :goto_a
    move-object v1, p0

    goto :goto_e

    :cond_c
    const/4 p0, 0x0

    goto :goto_a

    :goto_e
    const/4 v4, 0x1

    move v2, p1

    move v3, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v5}, LW6/e;->B(Landroid/view/View;ZZZLv8/a;)V

    return-void
.end method

.method public static final synthetic t1(LW6/U;)La7/d;
    .registers 1

    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object p0

    return-object p0
.end method

.method static synthetic t2(LW6/U;ZZLv8/a;ILjava/lang/Object;)V
    .registers 6

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_5

    const/4 p3, 0x0

    :cond_5
    invoke-direct {p0, p1, p2, p3}, LW6/U;->s2(ZZLv8/a;)V

    return-void
.end method

.method public static final synthetic u1(LW6/U;La7/d$c;Z)V
    .registers 3

    invoke-direct {p0, p1, p2}, LW6/U;->W1(La7/d$c;Z)V

    return-void
.end method

.method private final u2(ZZ)V
    .registers 10

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    iget-object p0, p0, LW6/U;->C:Le3/s;

    if-eqz p0, :cond_c

    iget-object p0, p0, Le3/s;->A:Lcom/nothing/wallpaper/widget/AspectRatioImageView;

    :goto_a
    move-object v1, p0

    goto :goto_e

    :cond_c
    const/4 p0, 0x0

    goto :goto_a

    :goto_e
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x1

    move v2, p1

    move v3, p2

    invoke-virtual/range {v0 .. v6}, LW6/e;->C(Landroid/view/View;ZZZZLv8/a;)V

    return-void
.end method

.method public static final synthetic v1(LW6/U;Z)V
    .registers 2

    iput-boolean p1, p0, LW6/U;->X:Z

    return-void
.end method

.method static synthetic v2(LW6/U;ZZILjava/lang/Object;)V
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    :cond_5
    invoke-direct {p0, p1, p2}, LW6/U;->u2(ZZ)V

    return-void
.end method

.method public static final synthetic w1(LW6/U;I)V
    .registers 2

    iput p1, p0, LW6/U;->M:I

    return-void
.end method

.method private final w2(ZZZ)V
    .registers 10

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object v0

    iget-object p0, p0, LW6/U;->C:Le3/s;

    if-eqz p0, :cond_c

    iget-object p0, p0, Le3/s;->w:Landroid/widget/TextView;

    :goto_a
    move-object v1, p0

    goto :goto_e

    :cond_c
    const/4 p0, 0x0

    goto :goto_a

    :goto_e
    const/4 v5, 0x0

    move v2, p1

    move v3, p2

    move v4, p3

    invoke-virtual/range {v0 .. v5}, LW6/e;->B(Landroid/view/View;ZZZLv8/a;)V

    return-void
.end method

.method public static final synthetic x1(LW6/U;I)V
    .registers 2

    iput p1, p0, LW6/U;->L:I

    return-void
.end method

.method static synthetic x2(LW6/U;ZZZILjava/lang/Object;)V
    .registers 6

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_5

    const/4 p3, 0x1

    :cond_5
    invoke-direct {p0, p1, p2, p3}, LW6/U;->w2(ZZZ)V

    return-void
.end method

.method public static final synthetic y1(LW6/U;)V
    .registers 1

    invoke-direct {p0}, LW6/U;->X2()V

    return-void
.end method

.method private final y2(Z)V
    .registers 5

    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_19

    invoke-virtual {p0}, LW6/i;->n0()LW6/e;

    move-result-object p0

    iget-object v1, v0, Le3/s;->I:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v2, "lavProcessing"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Le3/s;->J:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v2, "lavProcessingLoop"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1, v0, p1}, LW6/e;->D(Lcom/airbnb/lottie/LottieAnimationView;Lcom/airbnb/lottie/LottieAnimationView;Z)V

    :cond_19
    return-void
.end method

.method private final z1(Le3/s;LT6/b;)V
    .registers 5

    iget-object v0, p1, Le3/s;->Q:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    iget-object p2, p0, LW6/U;->J:LZ6/d;

    iget-object v0, p1, Le3/s;->Q:Landroidx/recyclerview/widget/RecyclerView;

    const-string v1, "rvStylePrompt"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, LZ6/d;->i(Landroidx/recyclerview/widget/RecyclerView;)V

    iget-object p1, p1, Le3/s;->Q:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, LW6/U$b;

    invoke-direct {p2, p0}, LW6/U$b;-><init>(LW6/U;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    return-void
.end method

.method private final z2(Z)V
    .registers 2

    iget-object p0, p0, LW6/U;->C:Le3/s;

    if-eqz p0, :cond_e

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    goto :goto_9

    :cond_8
    const/4 p1, 0x4

    :goto_9
    iget-object p0, p0, Le3/s;->T:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_e
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .registers 5

    invoke-super {p0, p1}, LW6/i;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, LW6/i;->v0()V

    if-eqz p1, :cond_f

    const-string v0, "last_language"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_10

    :cond_f
    const/4 p1, 0x0

    :goto_10
    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "requireContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Li6/e;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, LW6/U;->Y:Ljava/lang/String;

    const/4 v0, 0x1

    if-eqz p1, :cond_2b

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_29

    goto :goto_2b

    :cond_29
    const/4 v1, 0x0

    goto :goto_2c

    :cond_2b
    :goto_2b
    move v1, v0

    :goto_2c
    xor-int/2addr v1, v0

    iget-object v2, p0, LW6/U;->Y:Ljava/lang/String;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v0

    and-int/2addr p1, v1

    if-eqz p1, :cond_48

    const-string p1, "NTCreativeSelectorFragment"

    const-string v1, "onCreate update promptList"

    invoke-static {p1, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object p1

    iget-object p0, p0, LW6/U;->Y:Ljava/lang/String;

    invoke-virtual {p1, v0, p0}, La7/d;->h0(ZLjava/lang/String;)V

    return-void

    :cond_48
    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object p1

    iget-object p0, p0, LW6/U;->Y:Ljava/lang/String;

    invoke-virtual {p1, p0}, La7/d;->j0(Ljava/lang/String;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .registers 4

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Le3/s;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/s;

    move-result-object p1

    iput-object p1, p0, LW6/U;->C:Le3/s;

    invoke-direct {p0}, LW6/U;->a2()V

    invoke-virtual {p1}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object p0

    const-string p1, "let(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public onDestroy()V
    .registers 2

    invoke-super {p0}, Landroidx/fragment/app/q;->onDestroy()V

    invoke-direct {p0}, LW6/U;->C1()V

    invoke-direct {p0}, LW6/U;->D1()V

    iget-object p0, p0, LW6/U;->Z:LW6/U$i;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public onDestroyView()V
    .registers 2

    invoke-super {p0}, LW6/i;->onDestroyView()V

    iget-object v0, p0, LW6/U;->J:LZ6/d;

    invoke-virtual {v0}, LZ6/d;->k()V

    iget-object v0, p0, LW6/U;->K:LZ6/d;

    invoke-virtual {v0}, LZ6/d;->k()V

    const/4 v0, 0x0

    iput-object v0, p0, LW6/U;->C:Le3/s;

    iput-object v0, p0, LW6/U;->P:Landroid/view/View;

    iput-object v0, p0, LW6/U;->Q:Landroid/view/View;

    iput-object v0, p0, LW6/U;->R:Landroid/view/View;

    iput-object v0, p0, LW6/U;->S:Landroid/view/View;

    iput-object v0, p0, LW6/U;->T:Landroid/view/View;

    iput-object v0, p0, LW6/U;->U:Landroid/view/View;

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .registers 4

    const-string v0, "outState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/q;->onSaveInstanceState(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/q;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_2e

    const-string v0, "last_language"

    iget-object v1, p0, LW6/U;->Y:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "show_about_dialog"

    invoke-direct {p0}, LW6/U;->h2()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "show_policy_dialog_from_random"

    iget-boolean v1, p0, LW6/U;->V:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "show_policy_dialog"

    invoke-direct {p0}, LW6/U;->i2()Z

    move-result p0

    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_2e
    return-void
.end method

.method public onStart()V
    .registers 2

    invoke-super {p0}, LW6/i;->onStart()V

    new-instance v0, LW6/L;

    invoke-direct {v0, p0}, LW6/L;-><init>(LW6/U;)V

    invoke-virtual {p0, v0}, LW6/i;->B0(Lv8/l;)V

    return-void
.end method

.method public onStop()V
    .registers 5

    invoke-super {p0}, LW6/i;->onStop()V

    const-string v0, "NTCreativeSelectorFragment"

    const-string v1, "onStop"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LW6/U;->y2(Z)V

    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v0, v2, v3}, La7/d;->I(La7/d;ZILjava/lang/Object;)V

    iget-object v0, p0, LW6/U;->C:Le3/s;

    if-eqz v0, :cond_1e

    invoke-direct {p0, v0}, LW6/U;->r2(Le3/s;)V

    :cond_1e
    invoke-virtual {p0}, LW6/i;->P0()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .registers 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/q;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    const-string p1, "NTCreativeSelectorFragment"

    const-string v0, "onViewCreated"

    invoke-static {p1, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    if-eqz p2, :cond_19

    const-string v0, "show_about_dialog"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    goto :goto_1a

    :cond_19
    move v0, p1

    :goto_1a
    if-eqz v0, :cond_1f

    invoke-direct {p0}, LW6/U;->J2()V

    :cond_1f
    if-eqz p2, :cond_28

    const-string v0, "show_policy_dialog_from_random"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    goto :goto_29

    :cond_28
    move v0, p1

    :goto_29
    iput-boolean v0, p0, LW6/U;->V:Z

    if-eqz p2, :cond_33

    const-string p1, "show_policy_dialog"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    :cond_33
    if-eqz p1, :cond_3a

    iget-boolean p1, p0, LW6/U;->V:Z

    invoke-direct {p0, p1}, LW6/U;->M2(Z)V

    :cond_3a
    invoke-direct {p0}, LW6/U;->n2()V

    return-void
.end method

.method public q()Z
    .registers 3

    iget-boolean v0, p0, LW6/U;->X:Z

    const/4 v1, 0x1

    if-nez v0, :cond_6

    return v1

    :cond_6
    invoke-direct {p0}, LW6/U;->h2()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-direct {p0}, LW6/U;->C1()V

    return v1

    :cond_10
    invoke-direct {p0}, LW6/U;->i2()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-direct {p0}, LW6/U;->D1()V

    return v1

    :cond_1a
    invoke-virtual {p0}, LW6/i;->x0()Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object p0

    invoke-virtual {p0, v1}, La7/d;->H(Z)V

    return v1

    :cond_28
    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La7/d;->E0(I)V

    invoke-direct {p0}, LW6/U;->H1()La7/d;

    move-result-object p0

    invoke-virtual {p0, v1}, La7/d;->F0(I)V

    return v1
.end method
