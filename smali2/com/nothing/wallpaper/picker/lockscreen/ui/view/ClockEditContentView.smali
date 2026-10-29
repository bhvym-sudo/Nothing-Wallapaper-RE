.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private final q:Lcom/android/launcher3/views/f;

.field private final r:Lcom/android/launcher3/f;

.field private s:F

.field private t:I

.field private u:Lv8/l;

.field private v:LO1/b;


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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {p1}, Lcom/android/launcher3/views/f;->y(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/android/launcher3/views/f;

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->q:Lcom/android/launcher3/views/f;

    .line 5
    invoke-interface {p1}, Lcom/android/launcher3/views/f;->K()Lcom/android/launcher3/f;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->r:Lcom/android/launcher3/f;

    const/4 p1, 0x0

    .line 6
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;LO1/b;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;LO1/b;)V

    return-void
.end method

.method private final b()V
    .registers 1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    return-void
.end method

.method private static final d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;LO1/b;)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->u:Lv8/l;

    if-eqz p0, :cond_b

    invoke-virtual {p1}, LO1/b;->e()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    return-void
.end method


# virtual methods
.method public final c(LO1/b;Landroid/view/View;)V
    .registers 6

    const-string v0, "clockView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_8

    return-void

    :cond_8
    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->v:LO1/b;

    const/4 v0, 0x0

    iput v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->s:F

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_1b

    check-cast v0, Landroid/view/ViewGroup;

    goto :goto_1c

    :cond_1b
    const/4 v0, 0x0

    :goto_1c
    if-eqz v0, :cond_21

    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_21
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0x30

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->t:I

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->r:Lcom/android/launcher3/f;

    invoke-virtual {v2}, Lcom/android/launcher3/f;->h()I

    move-result v2

    add-int/2addr v1, v2

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c;

    invoke-direct {p2, p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;LO1/b;)V

    const-wide/16 v0, 0x32

    invoke-virtual {p0, p2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .registers 4

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    const/4 v0, 0x0

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->s:F

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final getOnClockChangedListener()Lv8/l;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv8/l;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->u:Lv8/l;

    return-object p0
.end method

.method public final getTopMarginDate()I
    .registers 1

    iget p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->t:I

    return p0
.end method

.method protected onDetachedFromWindow()V
    .registers 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->b()V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 6

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_22

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->v:LO1/b;

    if-eqz p1, :cond_13

    invoke-virtual {p1}, LO1/b;->e()Ljava/lang/String;

    move-result-object p1

    goto :goto_14

    :cond_13
    const/4 p1, 0x0

    :goto_14
    const-string p2, "OLD_QUICKLOOK"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_22

    iget p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->t:I

    neg-int p1, p1

    int-to-float p1, p1

    iput p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->s:F

    :cond_22
    return-void
.end method

.method public final setOnClockChangedListener(Lv8/l;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv8/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->u:Lv8/l;

    return-void
.end method

.method public final setTopMarginDate(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->t:I

    return-void
.end method
