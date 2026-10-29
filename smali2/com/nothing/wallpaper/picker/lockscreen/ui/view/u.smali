.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/u;
.super Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
    .registers 7

    const-string p0, "outRect"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "view"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "parent"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "state"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const p4, 0x7f070468

    invoke-virtual {p0, p4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p0

    float-to-int p0, p0

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p2

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p4

    const/4 v0, 0x0

    if-eqz p4, :cond_34

    invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->getItemCount()I

    move-result p4

    goto :goto_35

    :cond_34
    move p4, v0

    :goto_35
    invoke-virtual {p3}, Landroid/view/View;->getLayoutDirection()I

    move-result p3

    const/4 v1, 0x1

    if-ne p3, v1, :cond_3d

    move v0, v1

    :cond_3d
    if-nez p2, :cond_4a

    if-eqz v0, :cond_46

    mul-int/lit8 p3, p0, 0x2

    iput p3, p1, Landroid/graphics/Rect;->right:I

    goto :goto_4a

    :cond_46
    mul-int/lit8 p3, p0, 0x2

    iput p3, p1, Landroid/graphics/Rect;->left:I

    :cond_4a
    :goto_4a
    sub-int/2addr p4, v1

    if-ne p2, p4, :cond_58

    if-eqz v0, :cond_54

    mul-int/lit8 p3, p0, 0x2

    iput p3, p1, Landroid/graphics/Rect;->left:I

    goto :goto_58

    :cond_54
    mul-int/lit8 p3, p0, 0x2

    iput p3, p1, Landroid/graphics/Rect;->right:I

    :cond_58
    :goto_58
    if-ltz p2, :cond_63

    if-ge p2, p4, :cond_63

    if-eqz v0, :cond_61

    iput p0, p1, Landroid/graphics/Rect;->left:I

    return-void

    :cond_61
    iput p0, p1, Landroid/graphics/Rect;->right:I

    :cond_63
    return-void
.end method
