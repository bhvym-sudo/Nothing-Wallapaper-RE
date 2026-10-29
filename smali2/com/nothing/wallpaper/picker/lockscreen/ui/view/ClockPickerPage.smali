.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field private final q:Le3/g;

.field private r:Ly7/s;

.field private s:LF8/x0;

.field private final t:Lcom/android/launcher3/views/f;

.field private final u:Lcom/android/launcher3/f;

.field private v:I

.field private w:I


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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 p3, 0x1

    invoke-static {p2, p0, p3}, Le3/g;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/g;

    move-result-object p2

    const-string p3, "inflate(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->q:Le3/g;

    .line 5
    invoke-static {p1}, Lcom/android/launcher3/views/f;->y(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/android/launcher3/views/f;

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->t:Lcom/android/launcher3/views/f;

    .line 6
    invoke-interface {p1}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->u:Lcom/android/launcher3/f;

    .line 7
    iget p3, p1, Lcom/android/launcher3/f;->i:I

    int-to-float p3, p3

    const v0, 0x3c55b450

    mul-float/2addr p3, v0

    invoke-static {p3}, Lx8/a;->b(F)I

    move-result p3

    iput p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->v:I

    .line 8
    iget p1, p1, Lcom/android/launcher3/f;->i:I

    int-to-float p1, p1

    const p3, 0x3c8e7835

    mul-float/2addr p1, p3

    invoke-static {p1}, Lx8/a;->b(F)I

    move-result p1

    iput p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->w:I

    .line 9
    iget-object p1, p2, Le3/g;->E:Landroid/widget/ImageView;

    new-instance p3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/y;

    invoke-direct {p3, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/y;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    iget-object p1, p2, Le3/g;->C:Landroid/widget/TextView;

    const-string p3, "clockStyleText"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->v:I

    invoke-direct {p0, p1, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->g(Landroid/view/View;I)V

    .line 11
    iget-object p1, p2, Le3/g;->z:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    const-string p3, "clockListView"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->w:I

    invoke-direct {p0, p1, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->g(Landroid/view/View;I)V

    .line 12
    iget-object p1, p2, Le3/g;->B:Landroid/widget/TextView;

    const-string p3, "clockSizeText"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->v:I

    invoke-direct {p0, p1, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->g(Landroid/view/View;I)V

    .line 13
    iget-object p1, p2, Le3/g;->A:Landroid/widget/LinearLayout;

    const-string p3, "clockSize"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->w:I

    invoke-direct {p0, p1, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->g(Landroid/view/View;I)V

    .line 14
    iget-object p1, p2, Le3/g;->y:Landroid/widget/TextView;

    const-string p3, "clockAlignText"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->v:I

    invoke-direct {p0, p1, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->g(Landroid/view/View;I)V

    .line 15
    iget-object p1, p2, Le3/g;->x:Landroid/widget/LinearLayout;

    const-string p3, "clockAlign"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->w:I

    invoke-direct {p0, p1, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->g(Landroid/view/View;I)V

    .line 16
    iget-object p1, p2, Le3/g;->L:Landroid/widget/TextView;

    const-string p2, "unlockAnimationText"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->v:I

    invoke-direct {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->g(Landroid/view/View;I)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static b(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;Landroid/view/View;)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->r:Ly7/s;

    if-eqz p0, :cond_7

    invoke-interface {p0}, Ly7/s;->x()V

    :cond_7
    return-void
.end method

.method public static final synthetic c(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Le3/g;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->q:Le3/g;

    return-object p0
.end method

.method public static final synthetic d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Lcom/android/launcher3/f;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->u:Lcom/android/launcher3/f;

    return-object p0
.end method

.method public static final synthetic e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Ly7/s;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->r:Ly7/s;

    return-object p0
.end method

.method private final g(Landroid/view/View;I)V
    .registers 3

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    if-eqz p0, :cond_e

    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    iput p2, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {p1, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_e
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final f(Z)Landroid/animation/ObjectAnimator;
    .registers 4

    sget-object v0, LG7/p;->a:LG7/p;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->q:Le3/g;

    iget-object p0, p0, Le3/g;->K:Landroid/widget/LinearLayout;

    const-string v1, "unlockAnimation"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0, p1}, LG7/p;->d(Landroid/view/View;Z)Landroid/animation/ObjectAnimator;

    move-result-object p0

    return-object p0
.end method

.method public final getDynamicFontHeight()F
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->q:Le3/g;

    iget-object v0, v0, Le3/g;->K:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->w:I

    add-int/2addr v0, p0

    int-to-float p0, v0

    return p0
.end method

.method protected onAttachedToWindow()V
    .registers 8

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    sget-object v0, Ly7/s;->o:Ly7/s$a;

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly7/s$a;->a(Landroid/view/ViewParent;)Ly7/s;

    move-result-object v0

    if-nez v0, :cond_10

    goto :goto_2b

    :cond_10
    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->r:Ly7/s;

    invoke-static {p0}, Landroidx/lifecycle/g0;->a(Landroid/view/View;)Landroidx/lifecycle/x;

    move-result-object v0

    if-eqz v0, :cond_2b

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v1

    new-instance v4, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a;

    const/4 v2, 0x0

    invoke-direct {v4, v0, p0, v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a;-><init>(Landroidx/lifecycle/x;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->s:LF8/x0;

    :cond_2b
    :goto_2b
    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 4

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->q:Le3/g;

    iget-object v0, v0, Le3/g;->z:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->e()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->s:LF8/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_13

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_13
    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->s:LF8/x0;

    iput-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->r:Ly7/s;

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 2

    const/4 p0, 0x1

    return p0
.end method
