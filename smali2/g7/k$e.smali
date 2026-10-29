.class public final Lg7/k$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg7/k;->L1(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg7/k;

.field final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(Lg7/k;Landroid/view/View;)V
    .registers 3

    iput-object p1, p0, Lg7/k$e;->a:Lg7/k;

    iput-object p2, p0, Lg7/k$e;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 10

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object p1, p0, Lg7/k$e;->a:Lg7/k;

    invoke-static {p1}, Lg7/k;->f1(Lg7/k;)Landroidx/viewpager2/widget/ViewPager2;

    move-result-object p1

    if-eqz p1, :cond_5f

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    instance-of p2, p1, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p2, :cond_17

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    goto :goto_18

    :cond_17
    const/4 p1, 0x0

    :goto_18
    iget-object p2, p0, Lg7/k$e;->b:Landroid/view/View;

    const p3, 0x7f0a0441

    invoke-virtual {p2, p3}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    int-to-float p2, p2

    const p3, 0x3f638866    # 0.8888f

    mul-float/2addr p2, p3

    if-eqz p1, :cond_5f

    invoke-static {p1}, Landroidx/core/view/K;->b(Landroid/view/ViewGroup;)LD8/h;

    move-result-object p1

    if-eqz p1, :cond_5f

    invoke-interface {p1}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_36
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    const p4, 0x7f0a03df

    invoke-virtual {p3, p4}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p3

    const-string p4, "requireViewById(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    float-to-int p4, p2

    invoke-virtual {p3}, Landroid/view/View;->getPaddingLeft()I

    move-result p5

    invoke-virtual {p3}, Landroid/view/View;->getPaddingRight()I

    move-result p6

    invoke-virtual {p3}, Landroid/view/View;->getPaddingBottom()I

    move-result p7

    invoke-virtual {p3, p5, p4, p6, p7}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_36

    :cond_5f
    iget-object p0, p0, Lg7/k$e;->a:Lg7/k;

    invoke-static {p0}, Lg7/k;->h1(Lg7/k;)V

    return-void
.end method
