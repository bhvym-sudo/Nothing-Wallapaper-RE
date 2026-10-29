.class public final LL7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LL7/a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LL7/a;

    invoke-direct {v0}, LL7/a;-><init>()V

    sput-object v0, LL7/a;->a:LL7/a;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(LL7/a;Lo3/a;Lo3/a;)Z
    .registers 3

    invoke-direct {p0, p1, p2}, LL7/a;->c(Lo3/a;Lo3/a;)Z

    move-result p0

    return p0
.end method

.method public static final b(Landroid/content/Context;Landroid/view/ViewGroup;Lr2/c;Landroidx/lifecycle/x;Landroid/view/View$OnClickListener;)Landroid/widget/LinearLayout;
    .registers 20

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    const-string v2, "context"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "parent"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "viewModel"

    move-object/from16 v4, p2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "lifecycleOwner"

    move-object/from16 v5, p3

    invoke-static {v5, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "clickListener"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0d00cd

    const/4 v6, 0x0

    invoke-virtual {v2, v3, v0, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.widget.LinearLayout"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0a034f

    invoke-virtual {v0, v1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f130219

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    const p0, 0x7f0a0084

    invoke-virtual {v0, p0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p0

    const-string v1, "requireViewById(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p0

    check-cast v8, Landroid/widget/ImageView;

    const p0, 0x7f0a0351

    invoke-virtual {v0, p0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p0

    check-cast v6, Landroid/widget/ImageView;

    const p0, 0x7f0a0352

    invoke-virtual {v0, p0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, p0

    check-cast v7, Landroid/widget/ImageView;

    invoke-static {v5}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object p0

    new-instance v12, LL7/a$a;

    const/4 v9, 0x0

    move-object v3, v12

    invoke-direct/range {v3 .. v9}, LL7/a$a;-><init>(Lr2/c;Landroidx/lifecycle/x;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lm8/e;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v9, p0

    invoke-static/range {v9 .. v14}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-object v0
.end method

.method private final c(Lo3/a;Lo3/a;)Z
    .registers 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_d

    invoke-direct {p0, p1}, LL7/a;->d(Lo3/a;)Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_d

    :cond_b
    move p1, v1

    goto :goto_e

    :cond_d
    :goto_d
    move p1, v0

    :goto_e
    if-eqz p2, :cond_19

    invoke-direct {p0, p2}, LL7/a;->d(Lo3/a;)Z

    move-result p0

    if-eqz p0, :cond_17

    goto :goto_19

    :cond_17
    move p0, v1

    goto :goto_1a

    :cond_19
    :goto_19
    move p0, v0

    :goto_1a
    if-eqz p1, :cond_1f

    if-eqz p0, :cond_1f

    return v0

    :cond_1f
    return v1
.end method

.method private final d(Lo3/a;)Z
    .registers 3

    instance-of p0, p1, Lo3/a$b;

    const/4 v0, 0x0

    if-eqz p0, :cond_12

    check-cast p1, Lo3/a$b;

    invoke-virtual {p1}, Lo3/a$b;->b()I

    move-result p0

    const p1, 0x7f0801b0

    if-ne p0, p1, :cond_12

    const/4 p0, 0x1

    return p0

    :cond_12
    return v0
.end method
