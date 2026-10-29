.class public abstract LR5/b;
.super Landroidx/appcompat/app/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR5/b$a;
    }
.end annotation


# static fields
.field public static final T:LR5/b$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LR5/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LR5/b$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LR5/b;->T:LR5/b$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method

.method public static synthetic I0(Landroid/view/View;Landroid/view/View;Landroid/view/View;IIII)V
    .registers 7

    invoke-static/range {p0 .. p6}, LR5/b;->O0(Landroid/view/View;Landroid/view/View;Landroid/view/View;IIII)V

    return-void
.end method

.method private final M0()V
    .registers 3

    sget v0, LQ5/b;->f:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->F0(Landroidx/appcompat/widget/Toolbar;)V

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->v0()Landroidx/appcompat/app/a;

    move-result-object v0

    if-eqz v0, :cond_1c

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a;->s(Z)V

    invoke-virtual {p0}, LR5/b;->L0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroidx/appcompat/app/a;->u(Ljava/lang/CharSequence;)V

    :cond_1c
    return-void
.end method

.method private final N0()V
    .registers 5

    invoke-virtual {p0}, LR5/b;->Q0()Z

    move-result v0

    if-eqz v0, :cond_44

    sget v0, LQ5/b;->a:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_f

    goto :goto_13

    :cond_f
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_13
    sget v0, LQ5/b;->d:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    sget v1, LQ5/b;->e:I

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_44

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, LQ5/a;->a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    iput v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    new-instance v1, LR5/a;

    invoke-direct {v1, v0, p0}, LR5/a;-><init>(Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {p0, v1}, Landroid/view/View;->setOnScrollChangeListener(Landroid/view/View$OnScrollChangeListener;)V

    :cond_44
    return-void
.end method

.method private static final O0(Landroid/view/View;Landroid/view/View;Landroid/view/View;IIII)V
    .registers 7

    const-string p2, "$this_apply"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_8

    return-void

    :cond_8
    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    if-eqz p1, :cond_11

    const/4 p1, 0x0

    goto :goto_13

    :cond_11
    const/16 p1, 0x8

    :goto_13
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final P0()V
    .registers 1

    invoke-direct {p0}, LR5/b;->M0()V

    invoke-direct {p0}, LR5/b;->N0()V

    return-void
.end method


# virtual methods
.method public final J0()Landroid/widget/Button;
    .registers 2

    sget v0, LQ5/b;->b:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/Button;

    return-object p0
.end method

.method public abstract K0()Landroidx/fragment/app/q;
.end method

.method public abstract L0()Ljava/lang/String;
.end method

.method public abstract Q0()Z
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 4

    invoke-super {p0, p1}, Landroidx/fragment/app/v;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroidx/core/view/T;->b(Landroid/view/Window;Z)V

    sget v0, LQ5/c;->a:I

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->setContentView(I)V

    if-nez p1, :cond_27

    invoke-virtual {p0}, Landroidx/fragment/app/v;->o0()Landroidx/fragment/app/J;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/J;->p()Landroidx/fragment/app/S;

    move-result-object p1

    sget v0, LQ5/b;->c:I

    invoke-virtual {p0}, LR5/b;->K0()Landroidx/fragment/app/q;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/S;->r(ILandroidx/fragment/app/q;)Landroidx/fragment/app/S;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/S;->i()I

    :cond_27
    invoke-direct {p0}, LR5/b;->P0()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .registers 4

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_13

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0

    :cond_13
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method
