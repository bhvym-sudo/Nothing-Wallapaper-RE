.class public final Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/widget/VerticallyRecyclerView$a;
    }
.end annotation


# static fields
.field public static final v:Lcom/nothing/wallpaper/widget/VerticallyRecyclerView$a;


# instance fields
.field private q:I

.field private r:I

.field private s:I

.field private t:I

.field private u:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->v:Lcom/nothing/wallpaper/widget/VerticallyRecyclerView$a;

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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, -0x1

    .line 4
    iput p2, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->q:I

    .line 5
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->t:I

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 3

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->requestDisallowInterceptTouchEvent(Z)V

    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 10

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->canScrollHorizontally()Z

    move-result v0

    goto :goto_12

    :cond_11
    move v0, v1

    :goto_12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v2

    if-eqz v2, :cond_1d

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$LayoutManager;->canScrollVertically()Z

    move-result v2

    goto :goto_1e

    :cond_1d
    move v2, v1

    :goto_1e
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v4

    const/4 v5, 0x1

    const/high16 v6, 0x3f000000    # 0.5f

    if-eqz v3, :cond_c0

    const/4 v7, 0x2

    if-eq v3, v7, :cond_51

    const/4 v0, 0x5

    if-eq v3, v0, :cond_33

    goto/16 :goto_de

    :cond_33
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->q:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    add-float/2addr v0, v6

    invoke-static {v0}, Lx8/a;->b(F)I

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->r:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    add-float/2addr v0, v6

    invoke-static {v0}, Lx8/a;->b(F)I

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->s:I

    goto/16 :goto_de

    :cond_51
    iget v3, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->q:I

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    if-gez v3, :cond_77

    iget p0, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->q:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Error processing scroll; pointer index for id "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " not found. Did any MotionEvents get skipped?"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "VerticallyRecyclerView"

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_77
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    add-float/2addr v4, v6

    invoke-static {v4}, Lx8/a;->b(F)I

    move-result v4

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    add-float/2addr v3, v6

    invoke-static {v3}, Lx8/a;->b(F)I

    move-result v3

    iget-boolean v6, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->u:Z

    if-nez v6, :cond_de

    iget v6, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->r:I

    sub-int/2addr v4, v6

    iget v6, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->s:I

    sub-int/2addr v3, v6

    if-eqz v0, :cond_a9

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v6, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->t:I

    if-le v0, v6, :cond_a9

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v6

    if-le v0, v6, :cond_a9

    iput-boolean v5, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->u:Z

    :cond_a9
    if-eqz v2, :cond_de

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v2, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->t:I

    if-le v0, v2, :cond_de

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-le v0, v2, :cond_de

    iput-boolean v5, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->u:Z

    goto :goto_de

    :cond_c0
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->q:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    add-float/2addr v0, v6

    invoke-static {v0}, Lx8/a;->b(F)I

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->r:I

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    add-float/2addr v0, v6

    invoke-static {v0}, Lx8/a;->b(F)I

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->s:I

    iput-boolean v1, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->u:Z

    :cond_de
    :goto_de
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_e9

    iget-boolean p0, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->u:Z

    if-eqz p0, :cond_e9

    return v5

    :cond_e9
    return v1
.end method

.method public setScrollingTouchSlop(I)V
    .registers 4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    if-eqz p1, :cond_15

    const/4 v1, 0x1

    if-eq p1, v1, :cond_e

    goto :goto_1b

    :cond_e
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledPagingTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->t:I

    goto :goto_1b

    :cond_15
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Lcom/nothing/wallpaper/widget/VerticallyRecyclerView;->t:I

    :goto_1b
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollingTouchSlop(I)V

    return-void
.end method
