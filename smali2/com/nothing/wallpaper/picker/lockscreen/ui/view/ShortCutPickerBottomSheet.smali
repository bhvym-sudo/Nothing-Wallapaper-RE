.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;
.super Lcom/android/launcher3/views/e;
.source "SourceFile"

# interfaces
.implements Ly7/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/launcher3/views/e;",
        "Ly7/t;"
    }
.end annotation


# static fields
.field public static final U:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$a;


# instance fields
.field private final P:Lcom/android/launcher3/f;

.field private Q:LE7/a;

.field private R:LF8/x0;

.field private S:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;

.field private T:Landroid/app/Dialog;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->U:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$a;

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

    invoke-direct/range {v1 .. v6}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/h;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/android/launcher3/views/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    iget-object p1, p0, Lcom/android/launcher3/views/e;->r:Landroid/content/Context;

    check-cast p1, Ly7/u;

    invoke-virtual {p1}, Ly7/u;->K()Lcom/android/launcher3/f;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->P:Lcom/android/launcher3/f;

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
    invoke-direct {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic e0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;LC7/a;Landroid/content/DialogInterface;I)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->r0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;LC7/a;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic f0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;Landroid/content/DialogInterface;I)V
    .registers 3

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->s0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic g0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;)V
    .registers 1

    invoke-virtual {p0}, Lcom/android/launcher3/a;->A()V

    return-void
.end method

.method private final getOtherSideUsed()LC7/a;
    .registers 4

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->Q:LE7/a;

    const/4 v0, 0x0

    if-nez p0, :cond_b

    const-string p0, "bottomSheetCallback"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p0, v0

    :cond_b
    invoke-interface {p0}, LE7/a;->N()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;->getSlotShortcuts()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_41

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_35

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lh8/u;

    invoke-virtual {v2}, Lh8/u;->f()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_1b

    goto :goto_36

    :cond_35
    move-object v1, v0

    :goto_36
    check-cast v1, Lh8/u;

    if-eqz v1, :cond_41

    invoke-virtual {v1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LC7/a;

    return-object p0

    :cond_41
    return-object v0
.end method

.method public static final synthetic h0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;)V
    .registers 1

    invoke-virtual {p0}, Lcom/android/launcher3/views/e;->N()V

    return-void
.end method

.method public static final synthetic i0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;)LE7/a;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->Q:LE7/a;

    return-object p0
.end method

.method public static final synthetic j0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;)LC7/a;
    .registers 1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->getOtherSideUsed()LC7/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->S:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;

    return-object p0
.end method

.method public static final synthetic l0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;LE7/a;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->Q:LE7/a;

    return-void
.end method

.method public static final synthetic m0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/android/launcher3/a;->q:Z

    return-void
.end method

.method private final n0(LC7/a;)Z
    .registers 2

    invoke-virtual {p1}, LC7/a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->getOtherSideUsed()LC7/a;

    move-result-object p0

    if-eqz p0, :cond_f

    invoke-virtual {p0}, LC7/a;->c()Ljava/lang/String;

    move-result-object p0

    goto :goto_10

    :cond_f
    const/4 p0, 0x0

    :goto_10
    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private final p0(Landroid/view/MotionEvent;)Z
    .registers 2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->S:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;

    if-nez p0, :cond_a

    const-string p0, "shortcutPickerPage"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_a
    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->a0(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private final q0(LC7/a;)V
    .registers 5

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->T:Landroid/app/Dialog;

    const/4 v1, 0x1

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-ne v0, v1, :cond_c

    return-void

    :cond_c
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f130289

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v2, 0x7f13028b

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v2, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/M;

    invoke-direct {v2, p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/M;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;LC7/a;)V

    const p1, 0x7f13028c

    invoke-virtual {v0, p1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/N;

    invoke-direct {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/N;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;)V

    const v2, 0x7f1301f8

    invoke-virtual {p1, v2, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->T:Landroid/app/Dialog;

    if-eqz p1, :cond_46

    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    :cond_46
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->T:Landroid/app/Dialog;

    if-eqz p1, :cond_4d

    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    :cond_4d
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->T:Landroid/app/Dialog;

    if-eqz p0, :cond_54

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    :cond_54
    return-void
.end method

.method private static final r0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;LC7/a;Landroid/content/DialogInterface;I)V
    .registers 4

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->Q:LE7/a;

    if-nez p2, :cond_a

    const-string p2, "bottomSheetCallback"

    invoke-static {p2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p2, 0x0

    :cond_a
    invoke-interface {p2}, LE7/a;->getLockScreenViewModel()LJ7/i;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p1, p3}, LJ7/i;->G0(LC7/a;Z)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->T:Landroid/app/Dialog;

    if-eqz p0, :cond_19

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_19
    return-void
.end method

.method private static final s0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;Landroid/content/DialogInterface;I)V
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->T:Landroid/app/Dialog;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_7
    return-void
.end method

.method private final t0(Landroid/view/MotionEvent;)Z
    .registers 3

    invoke-virtual {p0}, Lcom/android/launcher3/views/e;->getPopupContainer()Lcom/android/launcher3/views/g;

    move-result-object v0

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->Q:LE7/a;

    if-nez p0, :cond_e

    const-string p0, "bottomSheetCallback"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_e
    invoke-interface {p0}, LE7/a;->N()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPreview;

    move-result-object p0

    invoke-virtual {v0, p0, p1}, Lcom/android/launcher3/views/g;->n(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method protected I(Z)V
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->P:Lcom/android/launcher3/f;

    iget v0, v0, Lcom/android/launcher3/f;->N:I

    int-to-long v0, v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/launcher3/views/e;->S(ZJ)V

    return-void
.end method

.method protected J(I)Z
    .registers 2

    and-int/lit8 p0, p1, 0x2

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public b(Landroid/view/View;LC7/a;)V
    .registers 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "info"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, LC7/a;->e()Z

    move-result p1

    if-eqz p1, :cond_3e

    invoke-virtual {p2}, LC7/a;->f()Z

    move-result p1

    if-nez p1, :cond_3e

    invoke-virtual {p2}, LC7/a;->c()Ljava/lang/String;

    move-result-object p1

    const-string v0, "none"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2c

    invoke-direct {p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->n0(LC7/a;)Z

    move-result p1

    if-eqz p1, :cond_2c

    invoke-direct {p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->q0(LC7/a;)V

    return-void

    :cond_2c
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->Q:LE7/a;

    if-nez p0, :cond_36

    const-string p0, "bottomSheetCallback"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_36
    invoke-interface {p0}, LE7/a;->getLockScreenViewModel()LJ7/i;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, LJ7/i;->G0(LC7/a;Z)V

    :cond_3e
    return-void
.end method

.method public final getClosedTranslationShift()F
    .registers 1

    const/high16 p0, 0x3f800000    # 1.0f

    return p0
.end method

.method public final getContentHeight()I
    .registers 1

    iget-object p0, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    return p0
.end method

.method public k(Landroid/view/MotionEvent;)Z
    .registers 3

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1d

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->t0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_1a

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->p0(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_1a

    :cond_18
    const/4 v0, 0x0

    goto :goto_1b

    :cond_1a
    :goto_1a
    const/4 v0, 0x1

    :goto_1b
    iput-boolean v0, p0, Lcom/android/launcher3/views/e;->D:Z

    :cond_1d
    invoke-super {p0, p1}, Lcom/android/launcher3/views/e;->k(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public final o0(Z)V
    .registers 2

    if-eqz p1, :cond_a

    invoke-virtual {p0}, Lcom/android/launcher3/views/e;->b0()Lw2/j;

    move-result-object p0

    invoke-virtual {p0}, Lw2/j;->m()V

    return-void

    :cond_a
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->setTranslationShift(F)V

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/O;

    invoke-direct {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/O;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method protected onAttachedToWindow()V
    .registers 8

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-static {p0}, Landroidx/lifecycle/g0;->a(Landroid/view/View;)Landroidx/lifecycle/x;

    move-result-object v0

    if-eqz v0, :cond_1c

    invoke-static {v0}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v1

    new-instance v4, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b;

    const/4 v2, 0x0

    invoke-direct {v4, v0, p0, v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet$b;-><init>(Landroidx/lifecycle/x;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->R:LF8/x0;

    :cond_1c
    return-void
.end method

.method protected onDetachedFromWindow()V
    .registers 4

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->T:Landroid/app/Dialog;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_a
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->T:Landroid/app/Dialog;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->R:LF8/x0;

    if-eqz v1, :cond_15

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v0}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_15
    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->R:LF8/x0;

    return-void
.end method

.method protected onFinishInflate()V
    .registers 3

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    const v0, 0x7f0a0155

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f080093

    invoke-virtual {v0, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_20

    iget-object v1, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    invoke-virtual {p0, v0, v1}, Lcom/android/launcher3/views/e;->Z(Landroid/graphics/drawable/Drawable;Landroid/view/View;)V

    :cond_20
    const v0, 0x7f0a0425

    invoke-virtual {p0, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->S:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;

    return-void
.end method

.method protected onLayout(ZIIII)V
    .registers 6

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    iget-object p1, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    sub-int/2addr p4, p1

    div-int/lit8 p4, p4, 0x2

    iget-object p2, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    sub-int p3, p5, p3

    add-int/2addr p1, p4

    invoke-virtual {p2, p4, p3, p1, p5}, Landroid/view/ViewGroup;->layout(IIII)V

    iget p1, p0, Lcom/android/launcher3/views/e;->z:F

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->setTranslationShift(F)V

    return-void
.end method

.method protected onMeasure(II)V
    .registers 9

    iget-object v1, p0, Lcom/android/launcher3/views/e;->u:Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->P:Lcom/android/launcher3/f;

    iget v5, v0, Lcom/android/launcher3/f;->P:I

    const/4 v3, 0x0

    move-object v0, p0

    move v2, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-virtual {v0, p0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method protected setTranslationShift(F)V
    .registers 2

    invoke-super {p0, p1}, Lcom/android/launcher3/views/e;->setTranslationShift(F)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->Q:LE7/a;

    if-nez p0, :cond_d

    const-string p0, "bottomSheetCallback"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_d
    invoke-interface {p0, p1}, LE7/a;->G(F)V

    return-void
.end method

.method public y(Landroid/view/View;LC7/a;)V
    .registers 3

    const-string p0, "view"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "info"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
