.class public final Lh7/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/f;


# instance fields
.field private final q:Lg3/f$a;


# direct methods
.method public constructor <init>(Lg3/f$a;)V
    .registers 3

    const-string v0, "navigationController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/q;->q:Lg3/f$a;

    return-void
.end method

.method public static synthetic b(ZLh7/q;Landroid/content/Context;Landroid/view/View;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, Lh7/q;->g(ZLh7/q;Landroid/content/Context;Landroid/view/View;)V

    return-void
.end method

.method private static final g(ZLh7/q;Landroid/content/Context;Landroid/view/View;)V
    .registers 4

    if-eqz p0, :cond_3

    return-void

    :cond_3
    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p0

    invoke-interface {p0}, Lh3/H;->C()Ld3/a;

    move-result-object p0

    invoke-virtual {p0}, Ld3/a;->s()Z

    move-result p0

    if-eqz p0, :cond_19

    iget-object p0, p1, Lh7/q;->q:Lg3/f$a;

    const-string p1, "custom_widget"

    invoke-interface {p0, p1}, Lg3/f$a;->P(Ljava/lang/String;)V

    return-void

    :cond_19
    invoke-static {}, Lf7/c;->c()Landroid/content/Intent;

    move-result-object p0

    const p1, 0x10008000

    invoke-virtual {p0, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {p2, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private final i()Z
    .registers 2

    new-instance p0, Landroid/os/UserHandle;

    invoke-static {}, Landroid/os/UserHandle;->myUserId()I

    move-result v0

    invoke-direct {p0, v0}, Landroid/os/UserHandle;-><init>(I)V

    invoke-virtual {p0}, Landroid/os/UserHandle;->isSystem()Z

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

    invoke-direct {p0}, Lh7/q;->i()Z

    move-result v0

    move-object v2, p1

    check-cast v2, Landroid/view/ViewGroup;

    const p1, 0x7f080284

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v4, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    new-instance v6, Lh7/p;

    invoke-direct {v6, v0, p0, p2}, Lh7/p;-><init>(ZLh7/q;Landroid/content/Context;)V

    const v5, 0x7f1302d3

    move-object v1, p2

    invoke-static/range {v1 .. v6}, LM7/c;->f(Landroid/content/Context;Landroid/view/ViewGroup;Ljava/lang/Integer;Landroid/widget/ImageView$ScaleType;ILandroid/view/View$OnClickListener;)Landroid/widget/LinearLayout;

    move-result-object p0

    if-eqz v0, :cond_3c

    const p1, 0x7f0a0354

    invoke-virtual {p0, p1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setClickable(Z)V

    const p1, 0x3e99999a    # 0.3f

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    :cond_3c
    return-object p0
.end method

.method public e(Landroid/content/Context;)Z
    .registers 2

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

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
