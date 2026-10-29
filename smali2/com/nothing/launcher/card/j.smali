.class public final Lcom/nothing/launcher/card/j;
.super LF5/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/launcher/card/j$a;
    }
.end annotation


# static fields
.field public static final Z:Lcom/nothing/launcher/card/j$a;


# instance fields
.field private Q:I

.field private R:I

.field private S:I

.field private T:I

.field private U:I

.field private V:I

.field private W:I

.field private X:Landroid/graphics/drawable/Drawable;

.field private Y:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/launcher/card/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/launcher/card/j$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/launcher/card/j;->Z:Lcom/nothing/launcher/card/j$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, LF5/m;-><init>()V

    return-void
.end method

.method private final E0()V
    .registers 7

    invoke-virtual {p0}, LF5/m;->l()I

    move-result v0

    invoke-virtual {p0}, LF5/m;->k()I

    move-result v1

    invoke-virtual {p0}, LF5/m;->y()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v3, v2}, LB8/h;->f(II)I

    move-result v2

    invoke-virtual {p0}, LF5/m;->w()I

    move-result v4

    invoke-static {v3, v4}, LB8/h;->f(II)I

    move-result v3

    invoke-virtual {p0}, LF5/m;->u()I

    move-result v4

    if-lez v4, :cond_28

    invoke-virtual {p0}, LF5/m;->u()I

    move-result v4

    invoke-static {v2, v4}, LB8/h;->i(II)I

    move-result v4

    goto :goto_29

    :cond_28
    move v4, v2

    :goto_29
    invoke-virtual {p0}, LF5/m;->t()I

    move-result v5

    if-lez v5, :cond_38

    invoke-virtual {p0}, LF5/m;->t()I

    move-result v5

    invoke-static {v3, v5}, LB8/h;->i(II)I

    move-result v5

    goto :goto_39

    :cond_38
    move v5, v3

    :goto_39
    invoke-static {v0, v2}, LB8/h;->i(II)I

    move-result v2

    iput v2, p0, Lcom/nothing/launcher/card/j;->S:I

    invoke-static {v1, v3}, LB8/h;->i(II)I

    move-result v2

    iput v2, p0, Lcom/nothing/launcher/card/j;->T:I

    iput v4, p0, Lcom/nothing/launcher/card/j;->U:I

    iput v5, p0, Lcom/nothing/launcher/card/j;->V:I

    iput v0, p0, Lcom/nothing/launcher/card/j;->Q:I

    iput v1, p0, Lcom/nothing/launcher/card/j;->R:I

    return-void
.end method

.method private final G0(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .registers 4

    iget-object v0, p0, Lcom/nothing/launcher/card/j;->X:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_e

    const/4 v0, 0x0

    invoke-virtual {p0}, LF5/m;->J()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/nothing/launcher/card/j;->F0(Landroid/content/Context;II)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    :cond_e
    return-object v0
.end method

.method public static synthetic n0(Landroid/graphics/drawable/Drawable;IIFLandroid/graphics/Canvas;)V
    .registers 5

    invoke-static {p0, p1, p2, p3, p4}, Lcom/nothing/launcher/card/j;->u0(Landroid/graphics/drawable/Drawable;IIFLandroid/graphics/Canvas;)V

    return-void
.end method

.method public static final synthetic o0(Lcom/nothing/launcher/card/j;LF5/m;)V
    .registers 2

    invoke-direct {p0, p1}, Lcom/nothing/launcher/card/j;->s0(LF5/m;)V

    return-void
.end method

.method public static final synthetic p0(Lcom/nothing/launcher/card/j;)V
    .registers 1

    invoke-direct {p0}, Lcom/nothing/launcher/card/j;->E0()V

    return-void
.end method

.method public static final synthetic q0(Lcom/nothing/launcher/card/j;I)V
    .registers 2

    iput p1, p0, Lcom/nothing/launcher/card/j;->W:I

    return-void
.end method

.method private final s0(LF5/m;)V
    .registers 3

    invoke-virtual {p1}, LF5/m;->e()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->Q(I)V

    invoke-virtual {p1}, LF5/m;->H()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF5/m;->j0(Ljava/lang/String;)V

    invoke-virtual {p1}, LF5/m;->f()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->R(I)V

    invoke-virtual {p1}, LF5/m;->J()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->k0(I)V

    invoke-virtual {p1}, LF5/m;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF5/m;->O(Ljava/lang/String;)V

    invoke-virtual {p1}, LF5/m;->s()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->b0(I)V

    invoke-virtual {p1}, LF5/m;->l()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->U(I)V

    invoke-virtual {p1}, LF5/m;->k()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->T(I)V

    invoke-virtual {p1}, LF5/m;->y()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->g0(I)V

    invoke-virtual {p1}, LF5/m;->w()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->e0(I)V

    invoke-virtual {p1}, LF5/m;->u()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->d0(I)V

    invoke-virtual {p1}, LF5/m;->t()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->c0(I)V

    invoke-virtual {p1}, LF5/m;->j()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->S(I)V

    invoke-virtual {p1}, LF5/m;->d()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->P(I)V

    invoke-virtual {p1}, LF5/m;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF5/m;->V(Ljava/lang/String;)V

    invoke-virtual {p1}, LF5/m;->L()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->m0(I)V

    invoke-virtual {p1}, LF5/m;->x()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->f0(I)V

    invoke-virtual {p1}, LF5/m;->K()Landroid/content/ComponentName;

    move-result-object v0

    invoke-virtual {p0, v0}, LF5/m;->l0(Landroid/content/ComponentName;)V

    invoke-virtual {p1}, LF5/m;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF5/m;->W(Ljava/lang/String;)V

    invoke-virtual {p1}, LF5/m;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF5/m;->X(Ljava/lang/String;)V

    invoke-virtual {p1}, LF5/m;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, LF5/m;->Y(Ljava/lang/String;)V

    invoke-virtual {p1}, LF5/m;->q()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->Z(I)V

    invoke-virtual {p1}, LF5/m;->r()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->a0(I)V

    invoke-virtual {p1}, LF5/m;->A()I

    move-result v0

    invoke-virtual {p0, v0}, LF5/m;->h0(I)V

    invoke-virtual {p1}, LF5/m;->C()I

    move-result p1

    invoke-virtual {p0, p1}, LF5/m;->i0(I)V

    return-void
.end method

.method private static final u0(Landroid/graphics/drawable/Drawable;IIFLandroid/graphics/Canvas;)V
    .registers 6

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {p4}, Landroid/graphics/Canvas;->save()I

    move-result p1

    invoke-virtual {p4, p3, p3}, Landroid/graphics/Canvas;->scale(FF)V

    invoke-virtual {p0, p4}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p4, p1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method


# virtual methods
.method public final A0()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/j;->T:I

    return p0
.end method

.method public final B0()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/j;->Q:I

    return p0
.end method

.method public final C0()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/j;->R:I

    return p0
.end method

.method public final D0()Landroid/os/UserHandle;
    .registers 2

    invoke-static {}, Landroid/os/Process;->myUserHandle()Landroid/os/UserHandle;

    move-result-object p0

    const-string v0, "myUserHandle(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final F0(Landroid/content/Context;II)Landroid/graphics/drawable/Drawable;
    .registers 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_6
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {p0}, LF5/m;->H()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;

    move-result-object p0

    const-string p1, "getResourcesForApplication(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3, p2, v0}, Landroid/content/res/Resources;->getDrawableForDensity(IILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_21
    .catchall {:try_start_6 .. :try_end_21} :catchall_22

    goto :goto_2d

    :catchall_22
    move-exception p0

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_2d
    invoke-static {p0}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_34

    goto :goto_35

    :cond_34
    move-object v0, p0

    :goto_35
    check-cast v0, Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final H0(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/launcher/card/j;->Y:Ljava/lang/String;

    return-void
.end method

.method public final I0(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/launcher/card/j;->S:I

    return-void
.end method

.method public final J0(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/launcher/card/j;->T:I

    return-void
.end method

.method public final K0(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/launcher/card/j;->X:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public final L0(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/launcher/card/j;->Q:I

    return-void
.end method

.method public final M0(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/launcher/card/j;->R:I

    return-void
.end method

.method public final r0(Lcom/nothing/launcher/card/j;)V
    .registers 3

    const-string v0, "cardInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/nothing/launcher/card/j;->s0(LF5/m;)V

    iget v0, p1, Lcom/nothing/launcher/card/j;->S:I

    iput v0, p0, Lcom/nothing/launcher/card/j;->S:I

    iget v0, p1, Lcom/nothing/launcher/card/j;->T:I

    iput v0, p0, Lcom/nothing/launcher/card/j;->T:I

    iget v0, p1, Lcom/nothing/launcher/card/j;->Q:I

    iput v0, p0, Lcom/nothing/launcher/card/j;->Q:I

    iget v0, p1, Lcom/nothing/launcher/card/j;->R:I

    iput v0, p0, Lcom/nothing/launcher/card/j;->R:I

    iget p1, p1, Lcom/nothing/launcher/card/j;->V:I

    iput p1, p0, Lcom/nothing/launcher/card/j;->U:I

    iput p1, p0, Lcom/nothing/launcher/card/j;->V:I

    return-void
.end method

.method public final t0(Landroid/content/Context;Landroid/graphics/Rect;)Landroid/graphics/Bitmap;
    .registers 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/nothing/launcher/card/j;->G0(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_8b

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_8b

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    if-lez v1, :cond_37

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    if-lez v1, :cond_37

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0, p1}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p0

    goto :goto_53

    :cond_37
    iget v1, p0, Lcom/nothing/launcher/card/j;->Q:I

    iget p0, p0, Lcom/nothing/launcher/card/j;->R:I

    invoke-static {p1, v1, p0}, LV5/a;->a(Landroid/content/Context;II)Landroid/util/Size;

    move-result-object p0

    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1, p0}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p0

    :goto_53
    invoke-virtual {p0}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v1

    int-to-float v1, v1

    int-to-float v2, p1

    div-float/2addr v1, v2

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    int-to-float v3, p0

    div-float/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    new-instance v3, Lcom/nothing/launcher/card/i;

    invoke-direct {v3, v0, p1, p0, v1}, Lcom/nothing/launcher/card/i;-><init>(Landroid/graphics/drawable/Drawable;IIF)V

    invoke-static {v2, p2, v3}, LB2/a;->c(IILB2/a;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_8b
    const/4 p0, 0x0

    return-object p0
.end method

.method public final v0()Landroid/content/ComponentName;
    .registers 1

    invoke-virtual {p0}, LF5/m;->K()Landroid/content/ComponentName;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    return-object p0
.end method

.method public final w0()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/launcher/card/j;->Y:Ljava/lang/String;

    return-object p0
.end method

.method public final x0(Landroid/content/Context;)Ljava/lang/String;
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/nothing/launcher/card/j;->Y:Ljava/lang/String;

    if-nez v0, :cond_1c

    invoke-virtual {p0, p1}, LF5/m;->I(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_14

    goto :goto_15

    :cond_14
    const/4 v0, 0x0

    :goto_15
    if-nez v0, :cond_1c

    invoke-virtual {p0, p1}, LF5/m;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1c
    return-object v0
.end method

.method public final y0()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/j;->W:I

    return p0
.end method

.method public final z0()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/j;->S:I

    return p0
.end method
