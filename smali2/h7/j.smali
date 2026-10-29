.class public final Lh7/j;
.super Lq2/b;
.source "SourceFile"


# instance fields
.field private final t:Lg3/f$a;

.field private final u:Lr2/c;

.field private final v:Landroidx/lifecycle/x;


# direct methods
.method public constructor <init>(Lg3/f$a;Lr2/c;Landroidx/lifecycle/x;)V
    .registers 5

    const-string v0, "navigationController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lq2/b;-><init>(Lg3/f$a;Lr2/c;Landroidx/lifecycle/x;)V

    iput-object p1, p0, Lh7/j;->t:Lg3/f$a;

    iput-object p2, p0, Lh7/j;->u:Lr2/c;

    iput-object p3, p0, Lh7/j;->v:Landroidx/lifecycle/x;

    return-void
.end method

.method public static synthetic j(Lh7/j;Landroid/content/Context;Landroid/view/View;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lh7/j;->k(Lh7/j;Landroid/content/Context;Landroid/view/View;)V

    return-void
.end method

.method private static final k(Lh7/j;Landroid/content/Context;Landroid/view/View;)V
    .registers 3

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p2

    invoke-interface {p2}, Lh3/H;->C()Ld3/a;

    move-result-object p2

    invoke-virtual {p2}, Ld3/a;->s()Z

    move-result p2

    if-eqz p2, :cond_16

    iget-object p0, p0, Lh7/j;->t:Lg3/f$a;

    const-string p1, "custom_short_cut"

    invoke-interface {p0, p1}, Lg3/f$a;->P(Ljava/lang/String;)V

    return-void

    :cond_16
    invoke-static {}, Lf7/c;->b()Landroid/content/Intent;

    move-result-object p0

    const p2, 0x10008000

    invoke-virtual {p0, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public c(Landroid/view/View;Landroid/content/Context;)Landroid/view/View;
    .registers 6

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Lh7/j;->u:Lr2/c;

    iget-object v1, p0, Lh7/j;->v:Landroidx/lifecycle/x;

    new-instance v2, Lh7/i;

    invoke-direct {v2, p0, p2}, Lh7/i;-><init>(Lh7/j;Landroid/content/Context;)V

    invoke-static {p2, p1, v0, v1, v2}, LL7/a;->b(Landroid/content/Context;Landroid/view/ViewGroup;Lr2/c;Landroidx/lifecycle/x;Landroid/view/View$OnClickListener;)Landroid/widget/LinearLayout;

    move-result-object p0

    return-object p0
.end method
