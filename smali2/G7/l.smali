.class public final LG7/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LG7/l;

.field private static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    new-instance v0, LG7/l;

    invoke-direct {v0}, LG7/l;-><init>()V

    sput-object v0, LG7/l;->a:LG7/l;

    sget-object v0, LN1/a;->q:LN1/a;

    const v1, 0x7f0800b9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v0

    sget-object v1, LN1/a;->r:LN1/a;

    const v2, 0x7f0800ba

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v1

    sget-object v2, LA7/a;->r:LA7/a;

    const v3, 0x7f0800b7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v2

    sget-object v3, LA7/a;->q:LA7/a;

    const v4, 0x7f0800b8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Lh8/o;

    move-result-object v0

    invoke-static {v0}, Li8/N;->i([Lh8/o;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LG7/l;->b:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LJ7/i;LN1/a;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LG7/l;->g(LJ7/i;LN1/a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LJ7/i;LA7/a;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LG7/l;->e(LJ7/i;LA7/a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LG7/l;Ljava/lang/String;Z)Z
    .registers 3

    invoke-direct {p0, p1, p2}, LG7/l;->i(Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method private static final e(LJ7/i;LA7/a;)Lh8/A;
    .registers 3

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LJ7/i;->O0(LA7/a;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final g(LJ7/i;LN1/a;)Lh8/A;
    .registers 3

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LJ7/i;->Q0(LN1/a;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final h(LF8/L;LJ7/i;LI8/f;LI8/f;[Ljava/lang/Object;[Lh8/o;Lv8/l;)V
    .registers 16

    new-instance v0, LG7/l$a;

    const/4 v7, 0x0

    move-object v5, p2

    move-object v1, p3

    move-object v2, p4

    move-object v4, p5

    move-object v3, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v7}, LG7/l$a;-><init>(LI8/f;LI8/f;[Lh8/o;[Ljava/lang/Object;LJ7/i;Lv8/l;Lm8/e;)V

    move-object p3, v0

    const/4 p4, 0x3

    const/4 p5, 0x0

    move-object p0, p1

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-static/range {p0 .. p5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private final i(Ljava/lang/String;Z)Z
    .registers 3

    sget-object p0, LA7/e;->a:LA7/e;

    invoke-virtual {p0}, LA7/e;->a()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_11

    if-eqz p2, :cond_f

    goto :goto_11

    :cond_f
    const/4 p0, 0x0

    return p0

    :cond_11
    :goto_11
    const/4 p0, 0x1

    return p0
.end method

.method private final j(Lcom/android/launcher3/f;Landroid/view/View;)V
    .registers 4

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    if-eqz p0, :cond_14

    iget v0, p1, Lcom/android/launcher3/f;->r:I

    iput v0, p0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p1}, Lcom/android/launcher3/f;->i()I

    move-result p1

    iput p1, p0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p2, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_14
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final d(Le3/g;Lcom/android/launcher3/f;LJ7/i;LF8/L;)V
    .registers 15

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceProfile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lockScreenViewModel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LA7/a;->q:LA7/a;

    sget-object v1, LA7/a;->r:LA7/a;

    filled-new-array {v0, v1}, [LA7/a;

    move-result-object v7

    sget-object v0, LG7/l;->b:Ljava/util/Map;

    const/4 v1, 0x0

    aget-object v1, v7, v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p1, Le3/g;->H:Landroid/widget/ImageView;

    invoke-static {v1, v2}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v2, v7, v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p1, Le3/g;->w:Landroid/widget/ImageView;

    invoke-static {v0, v2}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v0

    filled-new-array {v1, v0}, [Lh8/o;

    move-result-object v8

    iget-object v0, p1, Le3/g;->H:Landroid/widget/ImageView;

    const-string v1, "left"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, v0}, LG7/l;->j(Lcom/android/launcher3/f;Landroid/view/View;)V

    iget-object v0, p1, Le3/g;->w:Landroid/widget/ImageView;

    const-string v1, "center"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, v0}, LG7/l;->j(Lcom/android/launcher3/f;Landroid/view/View;)V

    iget-object v0, p1, Le3/g;->x:Landroid/widget/LinearLayout;

    const-string v1, "clockAlign"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_b5

    invoke-virtual {p2}, Lcom/android/launcher3/f;->i()I

    move-result p2

    iput p2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p1, Le3/g;->H:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LH6/a;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_83

    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1301fd

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_8e

    :cond_83
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1301fc

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_8e
    invoke-virtual {p2, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object p1, p1, Le3/g;->w:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f1301fb

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    invoke-virtual {p3}, LJ7/i;->T()LI8/f;

    move-result-object v5

    invoke-virtual {p3}, LJ7/i;->U()LI8/f;

    move-result-object v6

    new-instance v9, LG7/j;

    invoke-direct {v9, p3}, LG7/j;-><init>(LJ7/i;)V

    move-object v2, p0

    move-object v4, p3

    move-object v3, p4

    invoke-direct/range {v2 .. v9}, LG7/l;->h(LF8/L;LJ7/i;LI8/f;LI8/f;[Ljava/lang/Object;[Lh8/o;Lv8/l;)V

    return-void

    :cond_b5
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final f(Le3/g;Lcom/android/launcher3/f;LJ7/i;LF8/L;)V
    .registers 15

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceProfile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lockScreenViewModel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LN1/a;->q:LN1/a;

    sget-object v1, LN1/a;->r:LN1/a;

    filled-new-array {v0, v1}, [LN1/a;

    move-result-object v7

    sget-object v0, LG7/l;->b:Ljava/util/Map;

    const/4 v1, 0x0

    aget-object v1, v7, v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p1, Le3/g;->G:Landroid/widget/ImageView;

    invoke-static {v1, v2}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v2, v7, v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p1, Le3/g;->I:Landroid/widget/ImageView;

    invoke-static {v0, v2}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v0

    filled-new-array {v1, v0}, [Lh8/o;

    move-result-object v8

    iget-object v0, p1, Le3/g;->G:Landroid/widget/ImageView;

    const-string v1, "large"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, v0}, LG7/l;->j(Lcom/android/launcher3/f;Landroid/view/View;)V

    iget-object v0, p1, Le3/g;->I:Landroid/widget/ImageView;

    const-string v1, "small"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, v0}, LG7/l;->j(Lcom/android/launcher3/f;Landroid/view/View;)V

    iget-object p2, p1, Le3/g;->I:Landroid/widget/ImageView;

    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f130202

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object p1, p1, Le3/g;->G:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f130201

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    invoke-virtual {p3}, LJ7/i;->V()LI8/f;

    move-result-object v5

    invoke-virtual {p3}, LJ7/i;->U()LI8/f;

    move-result-object v6

    new-instance v9, LG7/k;

    invoke-direct {v9, p3}, LG7/k;-><init>(LJ7/i;)V

    move-object v2, p0

    move-object v4, p3

    move-object v3, p4

    invoke-direct/range {v2 .. v9}, LG7/l;->h(LF8/L;LJ7/i;LI8/f;LI8/f;[Ljava/lang/Object;[Lh8/o;Lv8/l;)V

    return-void
.end method
