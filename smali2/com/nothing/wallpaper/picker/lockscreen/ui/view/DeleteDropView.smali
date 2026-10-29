.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private final q:Le3/x0;

.field private final r:F

.field private final s:Lcom/android/launcher3/views/f;


# direct methods
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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 p3, 0x1

    invoke-static {p2, p0, p3}, Le3/x0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/x0;

    move-result-object p2

    const-string v0, "inflate(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;->q:Le3/x0;

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f07008c

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    iput p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;->r:F

    .line 6
    invoke-static {p1}, Lcom/android/launcher3/views/f;->y(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p2

    check-cast p2, Lcom/android/launcher3/views/f;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;->s:Lcom/android/launcher3/views/f;

    .line 7
    new-instance p2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView$a;

    invoke-direct {p2, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 8
    invoke-virtual {p0, p3}, Landroid/view/View;->setClipToOutline(Z)V

    const p2, 0x7f06029d

    .line 9
    invoke-static {p1, p2}, Lr0/a;->b(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic a(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;)F
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;->r:F

    return p0
.end method


# virtual methods
.method public final b(Lcom/android/launcher3/h$a;)Landroid/graphics/Rect;
    .registers 9

    const-string v0, "dragObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;->q:Le3/x0;

    iget-object v1, v1, Le3/x0;->v:Landroid/widget/TextView;

    iget-object v2, p1, Lcom/android/launcher3/h$a;->f:Lz2/h;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    iget-object p1, p1, Lcom/android/launcher3/h$a;->f:Lz2/h;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v3

    const/4 v4, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v5

    aget-object v4, v5, v4

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/DeleteDropView;->s:Lcom/android/launcher3/views/f;

    invoke-interface {p0}, Lcom/android/launcher3/views/f;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object p0

    invoke-virtual {p0, v1, v0}, Lcom/android/launcher3/views/g;->l(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-static {p0}, Lcom/android/launcher3/w;->g(Landroid/content/res/Resources;)Z

    move-result p0

    if-eqz p0, :cond_5a

    iget p0, v0, Landroid/graphics/Rect;->right:I

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int/2addr v1, v3

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr p0, v1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sub-int/2addr p0, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v1, p0}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p0

    goto :goto_71

    :cond_5a
    iget p0, v0, Landroid/graphics/Rect;->left:I

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int/2addr v1, v3

    div-int/lit8 v1, v1, 0x2

    add-int/2addr p0, v1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    add-int/2addr p0, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v1, p0}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p0

    :goto_71
    invoke-virtual {p0}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    iget v5, v0, Landroid/graphics/Rect;->top:I

    add-int v6, v5, v4

    invoke-virtual {v0, v1, v5, p0, v6}, Landroid/graphics/Rect;->set(IIII)V

    sub-int/2addr v2, v3

    neg-int p0, v2

    div-int/lit8 p0, p0, 0x2

    sub-int/2addr p1, v4

    neg-int p1, p1

    div-int/lit8 p1, p1, 0x2

    invoke-virtual {v0, p0, p1}, Landroid/graphics/Rect;->offset(II)V

    return-object v0
.end method
