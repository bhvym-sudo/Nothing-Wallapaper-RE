.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview$a;
    }
.end annotation


# instance fields
.field private final q:Le3/t0;

.field private r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview$a;

.field private s:Z

.field private t:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 11

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .registers 8

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Le3/t0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/t0;

    move-result-object v0

    const-string v2, "inflate(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->q:Le3/t0;

    .line 5
    sget-object v2, La3/a;->t2:[I

    invoke-virtual {p1, p2, v2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    if-nez p3, :cond_26

    move p2, v1

    :cond_26
    iput-boolean p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->s:Z

    .line 7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f0704b9

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f0704b8

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    .line 10
    iget-object p3, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {p3, p1, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->f(II)V

    .line 11
    iget-object p3, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {p3, p1, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->h(II)V

    .line 12
    iget-object p3, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {p3, p2, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->c(II)V

    .line 13
    iget-object p3, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {p3, p2, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->d(II)V

    .line 14
    iget-object p3, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {p3, p1, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->f(II)V

    .line 15
    iget-object p3, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {p3, p1, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->h(II)V

    .line 16
    iget-object p1, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {p1, p2, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->c(II)V

    .line 17
    iget-object p1, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {p1, p2, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->d(II)V

    .line 18
    iget-object p1, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    new-instance p2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/P;

    invoke-direct {p2, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/P;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    iget-object p1, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    new-instance p2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/Q;

    invoke-direct {p2, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/Q;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    iget-object p1, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setSelected(Z)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 21
    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->setAnimAlpha(F)V

    .line 22
    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->s:Z

    if-eqz p0, :cond_96

    .line 23
    iget-object p0, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->setAnimAlpha(F)V

    .line 24
    iget-object p0, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->setAnimAlpha(F)V

    :cond_96
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/h;)V
    .registers 8

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_5

    const/4 p2, 0x0

    :cond_5
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_b

    move p3, v0

    :cond_b
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_10

    move p4, v0

    .line 2
    :cond_10
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic a(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->c(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;Landroid/view/View;)V

    return-void
.end method

.method private static final c(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;Landroid/view/View;)V
    .registers 3

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview$a;

    if-eqz p0, :cond_d

    const-string p1, "bottom_start"

    invoke-interface {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview$a;->a(Ljava/lang/String;)V

    :cond_d
    return-void
.end method

.method private static final d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;Landroid/view/View;)V
    .registers 3

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview$a;

    if-eqz p0, :cond_d

    const-string p1, "bottom_end"

    invoke-interface {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview$a;->a(Ljava/lang/String;)V

    :cond_d
    return-void
.end method

.method private final e(LC7/a;)Z
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->f(LC7/a;)Z

    move-result p1

    if-eqz p1, :cond_c

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->s:Z

    if-eqz p0, :cond_c

    const/4 p0, 0x1

    return p0

    :cond_c
    const/4 p0, 0x0

    return p0
.end method

.method private final f(LC7/a;)Z
    .registers 3

    invoke-virtual {p1}, LC7/a;->c()Ljava/lang/String;

    move-result-object p0

    const-string v0, "none"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_15

    invoke-virtual {p1}, LC7/a;->e()Z

    move-result p0

    if-nez p0, :cond_13

    goto :goto_15

    :cond_13
    const/4 p0, 0x0

    return p0

    :cond_15
    :goto_15
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final g(FZ)V
    .registers 11

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->q:Le3/t0;

    if-nez p2, :cond_e

    iget-object p2, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {p2, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->setAnimAlpha(F)V

    iget-object p2, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {p2, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->setAnimAlpha(F)V

    :cond_e
    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->t:Ljava/util/List;

    if-eqz p2, :cond_8b

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_18
    :goto_18
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh8/u;

    invoke-virtual {v1}, Lh8/u;->d()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "bottom_start"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/16 v3, 0x8

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_5a

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC7/a;

    invoke-direct {p0, v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->f(LC7/a;)Z

    move-result v2

    if-eqz v2, :cond_5a

    iget-object v1, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    const-string v2, "slotStart"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    cmpl-float v2, p1, v5

    if-lez v2, :cond_52

    goto :goto_53

    :cond_52
    move v4, v6

    :goto_53
    if-eqz v4, :cond_56

    move v3, v6

    :cond_56
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_18

    :cond_5a
    invoke-virtual {v1}, Lh8/u;->d()Ljava/lang/Object;

    move-result-object v2

    const-string v7, "bottom_end"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC7/a;

    invoke-direct {p0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->f(LC7/a;)Z

    move-result v1

    if-eqz v1, :cond_18

    iget-object v1, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    const-string v2, "slotEnd"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    cmpl-float v2, p1, v5

    if-lez v2, :cond_83

    goto :goto_84

    :cond_83
    move v4, v6

    :goto_84
    if-eqz v4, :cond_87

    move v3, v6

    :cond_87
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_18

    :cond_8b
    return-void
.end method

.method public final getOnSlotListener()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview$a;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview$a;

    return-object p0
.end method

.method public final getShowPreview()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->s:Z

    return p0
.end method

.method public final getSlotShortcuts()Ljava/util/List;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lh8/u;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->t:Ljava/util/List;

    return-object p0
.end method

.method public final setAnimAlpha(F)V
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->q:Le3/t0;

    iget-object v0, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v0}, Landroid/view/View;->isSelected()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_1b

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->q:Le3/t0;

    iget-object v0, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->setAnimAlpha(F)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->q:Le3/t0;

    iget-object p0, p0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {p0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->setAnimAlpha(F)V

    return-void

    :cond_1b
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->q:Le3/t0;

    iget-object v0, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->setAnimAlpha(F)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->q:Le3/t0;

    iget-object p0, p0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->setAnimAlpha(F)V

    return-void
.end method

.method public final setOnSlotListener(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview$a;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview$a;

    return-void
.end method

.method public final setShortcuts(Ljava/util/List;)V
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lh8/u;",
            ">;)V"
        }
    .end annotation

    const-string v0, "shortcuts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->t:Ljava/util/List;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->q:Le3/t0;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_f
    :goto_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_171

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh8/u;

    invoke-virtual {v1}, Lh8/u;->d()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "bottom_start"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const/16 v4, 0x8

    const v5, 0x7f0604bf

    const v6, 0x106000b

    const v7, 0x7f0604c0

    const-string v8, "none"

    const-string v9, "getContext(...)"

    if-eqz v2, :cond_ce

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC7/a;

    invoke-virtual {v2}, LC7/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_64

    iget-object v2, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC7/a;

    invoke-virtual {v6}, LC7/a;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    sget-object v8, LF2/h;->a:LF2/h;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v10, v7}, LF2/h;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->e(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    goto :goto_80

    :cond_64
    iget-object v2, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LC7/a;

    invoke-virtual {v7}, LC7/a;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v7

    sget-object v8, LF2/h;->a:LF2/h;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v10, v6}, LF2/h;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v6

    invoke-virtual {v2, v7, v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->e(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :goto_80
    iget-object v2, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC7/a;

    invoke-virtual {v6}, LC7/a;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7, v5}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v5

    invoke-virtual {v2, v6, v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->g(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    iget-object v2, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LC7/a;

    invoke-virtual {v5}, LC7/a;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v2, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v1}, Lh8/u;->f()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v2, v5}, Landroid/view/View;->setSelected(Z)V

    iget-object v2, v0, Le3/t0;->w:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    const-string v5, "slotStart"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC7/a;

    invoke-direct {p0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->e(LC7/a;)Z

    move-result v1

    if-eqz v1, :cond_c9

    move v3, v4

    :cond_c9
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_f

    :cond_ce
    invoke-virtual {v1}, Lh8/u;->d()Ljava/lang/Object;

    move-result-object v2

    const-string v10, "bottom_end"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LC7/a;

    invoke-virtual {v2}, LC7/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v8}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_107

    iget-object v2, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC7/a;

    invoke-virtual {v6}, LC7/a;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    sget-object v8, LF2/h;->a:LF2/h;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v10, v7}, LF2/h;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->e(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    goto :goto_123

    :cond_107
    iget-object v2, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LC7/a;

    invoke-virtual {v7}, LC7/a;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v7

    sget-object v8, LF2/h;->a:LF2/h;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v10, v6}, LF2/h;->i(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v6

    invoke-virtual {v2, v7, v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->e(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :goto_123
    iget-object v2, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC7/a;

    invoke-virtual {v6}, LC7/a;->b()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7, v5}, Landroid/content/Context;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v5

    invoke-virtual {v2, v6, v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->g(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    iget-object v2, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LC7/a;

    invoke-virtual {v5}, LC7/a;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v2, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    invoke-virtual {v1}, Lh8/u;->f()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v2, v5}, Landroid/view/View;->setSelected(Z)V

    iget-object v2, v0, Le3/t0;->v:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TransitionImageView;

    const-string v5, "slotEnd"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LC7/a;

    invoke-direct {p0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->e(LC7/a;)Z

    move-result v1

    if-eqz v1, :cond_16c

    move v3, v4

    :cond_16c
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_f

    :cond_171
    return-void
.end method

.method public final setShowPreview(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->s:Z

    return-void
.end method
