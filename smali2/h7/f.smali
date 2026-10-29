.class public final Lh7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/f;


# instance fields
.field private final q:Lw7/b;

.field private final r:Ly1/e;

.field private final s:Landroidx/lifecycle/I;


# direct methods
.method public constructor <init>(Lw7/b;Ly1/e;)V
    .registers 4

    const-string v0, "launcherUpdateInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gridManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/f;->q:Lw7/b;

    iput-object p2, p0, Lh7/f;->r:Ly1/e;

    new-instance p1, Lh7/d;

    invoke-direct {p1, p0}, Lh7/d;-><init>(Lh7/f;)V

    iput-object p1, p0, Lh7/f;->s:Landroidx/lifecycle/I;

    return-void
.end method

.method public static synthetic b(Landroid/content/Context;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lh7/f;->k(Landroid/content/Context;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lh7/f;Ljava/lang/Object;)V
    .registers 2

    invoke-static {p0, p1}, Lh7/f;->l(Lh7/f;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic i(Lh7/f;)Ly1/e;
    .registers 1

    iget-object p0, p0, Lh7/f;->r:Ly1/e;

    return-object p0
.end method

.method public static final synthetic j(Lh7/f;)Landroidx/lifecycle/I;
    .registers 1

    iget-object p0, p0, Lh7/f;->s:Landroidx/lifecycle/I;

    return-object p0
.end method

.method private static final k(Landroid/content/Context;Landroid/view/View;)V
    .registers 2

    invoke-static {}, Lf7/a;->a()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static final l(Lh7/f;Ljava/lang/Object;)V
    .registers 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lh7/f;->m()V

    return-void
.end method

.method private final m()V
    .registers 2

    iget-object p0, p0, Lh7/f;->q:Lw7/b;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lw7/b;->b(Z)V

    return-void
.end method

.method private final n()Z
    .registers 1

    iget-object p0, p0, Lh7/f;->r:Ly1/e;

    invoke-virtual {p0}, Ly1/e;->i()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method public c(Landroid/view/View;Landroid/content/Context;)Landroid/view/View;
    .registers 10

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p1

    check-cast v2, Landroid/view/ViewGroup;

    const p1, 0x7f08027a

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    new-instance v6, Lh7/e;

    invoke-direct {v6, p2}, Lh7/e;-><init>(Landroid/content/Context;)V

    const v5, 0x7f130215

    move-object v1, p2

    invoke-static/range {v1 .. v6}, LM7/c;->f(Landroid/content/Context;Landroid/view/ViewGroup;Ljava/lang/Integer;Landroid/widget/ImageView$ScaleType;ILandroid/view/View$OnClickListener;)Landroid/widget/LinearLayout;

    move-result-object p1

    invoke-direct {p0}, Lh7/f;->n()Z

    move-result p2

    if-nez p2, :cond_32

    new-instance p2, Lh7/f$a;

    invoke-direct {p2, p0}, Lh7/f$a;-><init>(Lh7/f;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-object p1

    :cond_32
    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Landroid/view/View;->setClickable(Z)V

    const p0, 0x3e99999a    # 0.3f

    invoke-virtual {p1, p0}, Landroid/view/View;->setAlpha(F)V

    return-object p1
.end method

.method public e(Landroid/content/Context;)Z
    .registers 2

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lf7/b;->a:Lf7/b;

    invoke-virtual {p0, p1}, Lf7/b;->c(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method public f(Landroid/content/Context;)Li3/s0;
    .registers 3

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lh8/n;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "An operation is not implemented: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "Not yet implemented"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lh8/n;-><init>(Ljava/lang/String;)V

    throw p0
.end method
