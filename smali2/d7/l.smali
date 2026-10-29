.class public final Ld7/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld7/l;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Ld7/l;

    invoke-direct {v0}, Ld7/l;-><init>()V

    sput-object v0, Ld7/l;->a:Ld7/l;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Li7/d;Lkotlin/jvm/internal/E;Landroid/view/View;)V
    .registers 3

    invoke-static {p0, p1, p2}, Ld7/l;->n(Li7/d;Lkotlin/jvm/internal/E;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Li7/d;Landroid/content/DialogInterface;)V
    .registers 2

    invoke-static {p0, p1}, Ld7/l;->s(Li7/d;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic c(Li7/d;Le3/Z;Landroid/content/Context;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, Ld7/l;->p(Li7/d;Le3/Z;Landroid/content/Context;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/content/Context;Lkotlin/jvm/internal/E;Li7/d;Landroid/view/MenuItem;)Z
    .registers 4

    invoke-static {p0, p1, p2, p3}, Ld7/l;->k(Landroid/content/Context;Lkotlin/jvm/internal/E;Li7/d;Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Li7/d;Landroid/content/Context;Lkotlin/jvm/internal/E;Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V
    .registers 5

    invoke-static {p0, p1, p2, p3, p4}, Ld7/l;->l(Li7/d;Landroid/content/Context;Lkotlin/jvm/internal/E;Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V

    return-void
.end method

.method public static synthetic f(Le3/Z;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Ld7/l;->q(Le3/Z;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lkotlin/jvm/internal/E;Li7/d;Le3/Z;Landroid/content/Context;Lkotlin/jvm/internal/E;Landroid/view/View;)V
    .registers 6

    invoke-static/range {p0 .. p5}, Ld7/l;->o(Lkotlin/jvm/internal/E;Li7/d;Le3/Z;Landroid/content/Context;Lkotlin/jvm/internal/E;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Lkotlin/jvm/internal/E;Landroid/content/DialogInterface;)V
    .registers 2

    invoke-static {p0, p1}, Ld7/l;->r(Lkotlin/jvm/internal/E;Landroid/content/DialogInterface;)V

    return-void
.end method

.method private static final j(Lkotlin/jvm/internal/E;)V
    .registers 3

    iget-object v0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast v0, Landroid/app/Dialog;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_9
    iget-object v0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast v0, Landroid/app/Dialog;

    const/4 v1, 0x0

    if-eqz v0, :cond_13

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_13
    iget-object v0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast v0, Landroid/app/Dialog;

    if-eqz v0, :cond_1c

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    :cond_1c
    iput-object v1, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    return-void
.end method

.method private static final k(Landroid/content/Context;Lkotlin/jvm/internal/E;Li7/d;Landroid/view/MenuItem;)Z
    .registers 5

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3}, Landroid/view/MenuItem;->getItemId()I

    move-result p3

    const v0, 0x7f0a03c5

    if-ne p3, v0, :cond_13

    invoke-static {p0, p1, p2}, Ld7/l;->m(Landroid/content/Context;Lkotlin/jvm/internal/E;Li7/d;)V

    const/4 p0, 0x1

    return p0

    :cond_13
    const/4 p0, 0x0

    return p0
.end method

.method private static final l(Li7/d;Landroid/content/Context;Lkotlin/jvm/internal/E;Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V
    .registers 6

    const-string v0, "<unused var>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "event"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Landroidx/lifecycle/q$a;->ON_CREATE:Landroidx/lifecycle/q$a;

    if-ne p4, p3, :cond_12

    invoke-virtual {p0, p1}, Li7/d;->r(Landroid/content/Context;)V

    return-void

    :cond_12
    sget-object p3, Landroidx/lifecycle/q$a;->ON_DESTROY:Landroidx/lifecycle/q$a;

    if-ne p4, p3, :cond_1c

    invoke-static {p2}, Ld7/l;->j(Lkotlin/jvm/internal/E;)V

    invoke-virtual {p0, p1}, Li7/d;->v(Landroid/content/Context;)V

    :cond_1c
    return-void
.end method

.method private static final m(Landroid/content/Context;Lkotlin/jvm/internal/E;Li7/d;)V
    .registers 11

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d011e

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Le3/Z;->C(Landroid/view/View;)Le3/Z;

    move-result-object v4

    new-instance v1, Landroidx/appcompat/app/b$a;

    const v2, 0x7f14014c

    invoke-direct {v1, p0, v2}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v0}, Landroidx/appcompat/app/b$a;->n(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/E;

    invoke-direct {v2}, Lkotlin/jvm/internal/E;-><init>()V

    iget-object v1, v4, Le3/Z;->y:Landroid/widget/TextView;

    new-instance v3, Ld7/f;

    invoke-direct {v3, p2, p1}, Ld7/f;-><init>(Li7/d;Lkotlin/jvm/internal/E;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v7, v4, Le3/Z;->z:Landroid/widget/TextView;

    new-instance v1, Ld7/g;

    move-object v5, p0

    move-object v6, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Ld7/g;-><init>(Lkotlin/jvm/internal/E;Li7/d;Le3/Z;Landroid/content/Context;Lkotlin/jvm/internal/E;)V

    invoke-virtual {v7, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p0, v4, Le3/Z;->w:Landroid/widget/FrameLayout;

    new-instance p1, Ld7/h;

    invoke-direct {p1, v4}, Ld7/h;-><init>(Le3/Z;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p0, Ld7/i;

    invoke-direct {p0, v2}, Ld7/i;-><init>(Lkotlin/jvm/internal/E;)V

    invoke-virtual {v0, p0}, Landroidx/appcompat/app/b$a;->h(Landroid/content/DialogInterface$OnDismissListener;)Landroidx/appcompat/app/b$a;

    new-instance p0, Ld7/j;

    invoke-direct {p0, v3}, Ld7/j;-><init>(Li7/d;)V

    invoke-virtual {v0, p0}, Landroidx/appcompat/app/b$a;->g(Landroid/content/DialogInterface$OnCancelListener;)Landroidx/appcompat/app/b$a;

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p0

    iput-object p0, v6, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p0, Landroid/app/Dialog;

    if-eqz p0, :cond_5f

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    :cond_5f
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, p0}, Li7/d;->u(Ljava/lang/Boolean;)V

    return-void
.end method

.method private static final n(Li7/d;Lkotlin/jvm/internal/E;Landroid/view/View;)V
    .registers 3

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p2}, Li7/d;->u(Ljava/lang/Boolean;)V

    invoke-static {p1}, Ld7/l;->j(Lkotlin/jvm/internal/E;)V

    return-void
.end method

.method private static final o(Lkotlin/jvm/internal/E;Li7/d;Le3/Z;Landroid/content/Context;Lkotlin/jvm/internal/E;Landroid/view/View;)V
    .registers 6

    new-instance p5, Ld7/k;

    invoke-direct {p5, p1, p2, p3}, Ld7/k;-><init>(Li7/d;Le3/Z;Landroid/content/Context;)V

    iput-object p5, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p0}, Li7/d;->u(Ljava/lang/Boolean;)V

    invoke-static {p4}, Ld7/l;->j(Lkotlin/jvm/internal/E;)V

    return-void
.end method

.method private static final p(Li7/d;Le3/Z;Landroid/content/Context;)Lh8/A;
    .registers 10

    iget-object p1, p1, Le3/Z;->v:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Li7/d;->t(Z)V

    new-instance v2, Landroid/content/Intent;

    const-string p0, "android.intent.action.MAIN"

    invoke-direct {v2, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p0, "android.intent.category.HOME"

    invoke-virtual {v2, p0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p0, 0x10000000

    invoke-virtual {v2, p0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    sget-object v0, Li6/a;->a:Li6/a;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v6}, Li6/a;->b(Li6/a;Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;IILjava/lang/Object;)Z

    instance-of p0, v1, Landroid/app/Activity;

    if-eqz p0, :cond_2f

    move-object p2, v1

    check-cast p2, Landroid/app/Activity;

    goto :goto_30

    :cond_2f
    const/4 p2, 0x0

    :goto_30
    if-eqz p2, :cond_35

    invoke-virtual {p2}, Landroid/app/Activity;->finish()V

    :cond_35
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final q(Le3/Z;Landroid/view/View;)V
    .registers 2

    iget-object p0, p0, Le3/Z;->v:Landroid/widget/CheckBox;

    invoke-virtual {p0}, Landroid/widget/CompoundButton;->toggle()V

    return-void
.end method

.method private static final r(Lkotlin/jvm/internal/E;Landroid/content/DialogInterface;)V
    .registers 2

    iget-object p0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p0, Lv8/a;

    if-eqz p0, :cond_9

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    :cond_9
    return-void
.end method

.method private static final s(Li7/d;Landroid/content/DialogInterface;)V
    .registers 2

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Li7/d;->u(Ljava/lang/Boolean;)V

    return-void
.end method


# virtual methods
.method public final i(Landroid/content/Context;Landroid/widget/Toolbar;Lx3/b;Li7/d;Landroidx/lifecycle/x;)V
    .registers 17

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "toolbar"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "pickerViewModel"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "resetViewModel"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "lifecycleOwner"

    move-object/from16 v1, p5

    invoke-static {v1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lkotlin/jvm/internal/E;

    invoke-direct {p0}, Lkotlin/jvm/internal/E;-><init>()V

    invoke-virtual {p2}, Landroid/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object p2

    const v0, 0x7f0a03c5

    invoke-interface {p2, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v4

    new-instance p2, Ld7/d;

    invoke-direct {p2, p1, p0, p4}, Ld7/d;-><init>(Landroid/content/Context;Lkotlin/jvm/internal/E;Li7/d;)V

    invoke-interface {v4, p2}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    invoke-virtual {p4}, Li7/d;->p()Ljava/lang/Boolean;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_42

    invoke-static {p1, p0, p4}, Ld7/l;->m(Landroid/content/Context;Lkotlin/jvm/internal/E;Li7/d;)V

    :cond_42
    invoke-static {v1}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object p2

    new-instance v0, Ld7/l$a;

    const/4 v5, 0x0

    move-object v2, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v5}, Ld7/l$a;-><init>(Landroidx/lifecycle/x;Lx3/b;Li7/d;Landroid/view/MenuItem;Lm8/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v5, p2

    move-object v8, v0

    invoke-static/range {v5 .. v10}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-interface/range {p5 .. p5}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    move-result-object p2

    new-instance v0, Ld7/e;

    invoke-direct {v0, p4, p1, p0}, Ld7/e;-><init>(Li7/d;Landroid/content/Context;Lkotlin/jvm/internal/E;)V

    invoke-virtual {p2, v0}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    return-void
.end method
