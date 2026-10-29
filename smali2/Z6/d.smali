.class public final LZ6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ6/d$a;
    }
.end annotation


# static fields
.field public static final i:LZ6/d$a;


# instance fields
.field private final a:Landroidx/recyclerview/widget/SnapHelper;

.field private b:Landroidx/recyclerview/widget/RecyclerView;

.field private c:I

.field private d:I

.field private e:I

.field private final f:Lh8/h;

.field private g:Lv8/l;

.field private final h:LZ6/d$b;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LZ6/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LZ6/d$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LZ6/d;->i:LZ6/d$a;

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/SnapHelper;)V
    .registers 3

    const-string v0, "snapHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ6/d;->a:Landroidx/recyclerview/widget/SnapHelper;

    new-instance p1, LZ6/a;

    invoke-direct {p1, p0}, LZ6/a;-><init>(LZ6/d;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, LZ6/d;->f:Lh8/h;

    new-instance p1, LZ6/d$b;

    invoke-direct {p1, p0}, LZ6/d$b;-><init>(LZ6/d;)V

    iput-object p1, p0, LZ6/d;->h:LZ6/d$b;

    return-void
.end method

.method public static synthetic a(LZ6/d;)V
    .registers 1

    invoke-static {p0}, LZ6/d;->r(LZ6/d;)V

    return-void
.end method

.method public static synthetic b(LZ6/d;)Z
    .registers 1

    invoke-static {p0}, LZ6/d;->p(LZ6/d;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(LZ6/d;)V
    .registers 1

    invoke-static {p0}, LZ6/d;->v(LZ6/d;)V

    return-void
.end method

.method public static final synthetic d(LZ6/d;)V
    .registers 1

    invoke-direct {p0}, LZ6/d;->j()V

    return-void
.end method

.method public static final synthetic e(LZ6/d;)I
    .registers 1

    iget p0, p0, LZ6/d;->d:I

    return p0
.end method

.method public static final synthetic f(LZ6/d;)V
    .registers 1

    invoke-direct {p0}, LZ6/d;->n()V

    return-void
.end method

.method public static final synthetic g(LZ6/d;)Z
    .registers 1

    invoke-direct {p0}, LZ6/d;->o()Z

    move-result p0

    return p0
.end method

.method public static final synthetic h(LZ6/d;I)V
    .registers 2

    iput p1, p0, LZ6/d;->d:I

    return-void
.end method

.method private final j()V
    .registers 4

    iget v0, p0, LZ6/d;->c:I

    if-gtz v0, :cond_5

    goto :goto_18

    :cond_5
    iget v1, p0, LZ6/d;->d:I

    iget v2, p0, LZ6/d;->e:I

    mul-int/2addr v2, v0

    sub-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, LZ6/d;->c:I

    if-lt v0, v1, :cond_18

    iget v0, p0, LZ6/d;->d:I

    div-int/2addr v0, v1

    iput v0, p0, LZ6/d;->e:I

    :cond_18
    :goto_18
    return-void
.end method

.method private final m(Landroidx/recyclerview/widget/SnapHelper;Landroidx/recyclerview/widget/RecyclerView;)I
    .registers 3

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object p0

    const/4 p2, -0x1

    if-nez p0, :cond_8

    return p2

    :cond_8
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/SnapHelper;->findSnapView(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_f

    return p2

    :cond_f
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->getPosition(Landroid/view/View;)I

    move-result p0

    return p0
.end method

.method private final n()V
    .registers 4

    iget v0, p0, LZ6/d;->d:I

    iget v1, p0, LZ6/d;->e:I

    iget v2, p0, LZ6/d;->c:I

    mul-int/2addr v1, v2

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, LZ6/d;->c:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    const v1, 0x38d1b717    # 1.0E-4f

    invoke-static {v0, v1}, LB8/h;->e(FF)F

    move-result v0

    invoke-direct {p0, v0}, LZ6/d;->s(F)V

    iget-object p0, p0, LZ6/d;->g:Lv8/l;

    if-eqz p0, :cond_26

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p0, v0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_26
    return-void
.end method

.method private final o()Z
    .registers 1

    iget-object p0, p0, LZ6/d;->f:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final p(LZ6/d;)Z
    .registers 1

    iget-object p0, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p0, :cond_9

    invoke-static {p0}, LH6/d;->c(Landroid/view/View;)Z

    move-result p0

    return p0

    :cond_9
    const/4 p0, 0x0

    return p0
.end method

.method private static final r(LZ6/d;)V
    .registers 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LZ6/d;->s(F)V

    return-void
.end method

.method private final s(F)V
    .registers 7

    iget-object v0, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    if-eqz v0, :cond_e

    iget v2, p0, LZ6/d;->e:I

    add-int/lit8 v2, v2, -0x2

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v0

    goto :goto_f

    :cond_e
    move-object v0, v1

    :goto_f
    check-cast v0, LT6/a;

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v0, :cond_18

    invoke-interface {v0, v2}, LT6/a;->a(F)V

    :cond_18
    iget-object v0, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v3, 0x1

    if-eqz v0, :cond_25

    iget v4, p0, LZ6/d;->e:I

    sub-int/2addr v4, v3

    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v0

    goto :goto_26

    :cond_25
    move-object v0, v1

    :goto_26
    check-cast v0, LT6/a;

    if-eqz v0, :cond_2f

    int-to-float v4, v3

    sub-float/2addr v4, p1

    invoke-interface {v0, v4}, LT6/a;->a(F)V

    :cond_2f
    iget-object v0, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_3a

    iget v4, p0, LZ6/d;->e:I

    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v0

    goto :goto_3b

    :cond_3a
    move-object v0, v1

    :goto_3b
    check-cast v0, LT6/a;

    if-eqz v0, :cond_42

    invoke-interface {v0, p1}, LT6/a;->a(F)V

    :cond_42
    iget-object v0, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_4e

    iget v4, p0, LZ6/d;->e:I

    add-int/2addr v4, v3

    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v0

    goto :goto_4f

    :cond_4e
    move-object v0, v1

    :goto_4f
    check-cast v0, LT6/a;

    if-eqz v0, :cond_58

    int-to-float v3, v3

    sub-float/2addr v3, p1

    invoke-interface {v0, v3}, LT6/a;->a(F)V

    :cond_58
    iget-object p1, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_64

    iget p0, p0, LZ6/d;->e:I

    add-int/lit8 p0, p0, 0x2

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v1

    :cond_64
    check-cast v1, LT6/a;

    if-eqz v1, :cond_6b

    invoke-interface {v1, v2}, LT6/a;->a(F)V

    :cond_6b
    return-void
.end method

.method private static final v(LZ6/d;)V
    .registers 4

    iget-object v0, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result v0

    goto :goto_11

    :cond_10
    move v0, v1

    :goto_11
    iget v2, p0, LZ6/d;->e:I

    if-gez v2, :cond_17

    iput v1, p0, LZ6/d;->e:I

    :cond_17
    iget v1, p0, LZ6/d;->e:I

    if-ge v1, v0, :cond_3e

    :try_start_1b
    iget-object v0, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_3e

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_22} :catch_23

    goto :goto_3e

    :catch_23
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateItemWidth error, exception:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ItemAlphaHelper"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3e
    :goto_3e
    invoke-direct {p0}, LZ6/d;->n()V

    return-void
.end method


# virtual methods
.method public final i(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 3

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, LZ6/d;->h:LZ6/d$b;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    iget-object p0, p0, LZ6/d;->a:Landroidx/recyclerview/widget/SnapHelper;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/SnapHelper;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method public final k()V
    .registers 3

    iget-object v0, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_9

    iget-object v1, p0, LZ6/d;->h:LZ6/d$b;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    :cond_9
    const/4 v0, 0x0

    iput-object v0, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, LZ6/d;->a:Landroidx/recyclerview/widget/SnapHelper;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/SnapHelper;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method public final l()I
    .registers 3

    iget-object v0, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_b

    iget-object v1, p0, LZ6/d;->a:Landroidx/recyclerview/widget/SnapHelper;

    invoke-direct {p0, v1, v0}, LZ6/d;->m(Landroidx/recyclerview/widget/SnapHelper;Landroidx/recyclerview/widget/RecyclerView;)I

    move-result p0

    return p0

    :cond_b
    const/4 p0, 0x0

    return p0
.end method

.method public final q(IZ)V
    .registers 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setCurrentItemPosition position:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ItemAlphaHelper"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iput p1, p0, LZ6/d;->e:I

    iget v0, p0, LZ6/d;->c:I

    mul-int/2addr v0, p1

    iput v0, p0, LZ6/d;->d:I

    if-eqz p2, :cond_27

    iget-object p2, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p2, :cond_2e

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    goto :goto_2e

    :cond_27
    iget-object p2, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p2, :cond_2e

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    :cond_2e
    :goto_2e
    iget-object p1, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_3a

    new-instance p2, LZ6/b;

    invoke-direct {p2, p0}, LZ6/b;-><init>(LZ6/d;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_3a
    return-void
.end method

.method public final t(Lv8/l;)V
    .registers 2

    iput-object p1, p0, LZ6/d;->g:Lv8/l;

    return-void
.end method

.method public final u(I)V
    .registers 3

    iput p1, p0, LZ6/d;->c:I

    iget-object p1, p0, LZ6/d;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_e

    new-instance v0, LZ6/c;

    invoke-direct {v0, p0}, LZ6/c;-><init>(LZ6/d;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_e
    return-void
.end method
