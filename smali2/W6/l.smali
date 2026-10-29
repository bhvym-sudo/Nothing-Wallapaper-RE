.class public final LW6/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LW6/l$a;
    }
.end annotation


# static fields
.field public static final d:LW6/l$a;

.field private static final e:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Landroid/app/AlertDialog;

.field private c:Lv8/l;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LW6/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LW6/l$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LW6/l;->d:LW6/l$a;

    const-string v0, "is_policy_agree"

    sput-object v0, LW6/l;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/l;->a:Landroid/content/Context;

    return-void
.end method

.method public static synthetic a(LW6/l;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, LW6/l;->m(LW6/l;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(LW6/l;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, LW6/l;->n(LW6/l;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic c(LW6/l;)Landroid/content/Context;
    .registers 1

    iget-object p0, p0, LW6/l;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic d()Ljava/lang/String;
    .registers 1

    sget-object v0, LW6/l;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic e(LW6/l;Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, LW6/l;->k(Ljava/lang/String;)V

    return-void
.end method

.method private final g(Le3/m;)V
    .registers 10

    iget-object v0, p0, LW6/l;->a:Landroid/content/Context;

    invoke-static {v0}, Li6/e;->k(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, LW6/l;->a:Landroid/content/Context;

    const v1, 0x7f13020a

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_11
    move-object v2, v0

    goto :goto_1d

    :cond_13
    iget-object v0, p0, LW6/l;->a:Landroid/content/Context;

    const v1, 0x7f130209

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_11

    :goto_1d
    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget-object v0, p0, LW6/l;->a:Landroid/content/Context;

    const v1, 0x7f130208

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v0, "getString(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v7, LW6/l$b;

    invoke-direct {v7, p0}, LW6/l$b;-><init>(LW6/l;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LE8/i;->d0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result p0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, p0

    new-instance v2, Landroid/text/style/StyleSpan;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/16 v3, 0x21

    invoke-virtual {v0, v2, p0, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {v0, v7, p0, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    iget-object p0, p1, Le3/m;->x:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p0, p1, Le3/m;->x:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    return-void
.end method

.method private final h(Le3/m;)V
    .registers 10

    iget-object v0, p0, LW6/l;->a:Landroid/content/Context;

    const v1, 0x7f13020c

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v0, "getString(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LW6/l;->a:Landroid/content/Context;

    const v2, 0x7f13020b

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/text/SpannableString;

    invoke-direct {v0, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v1, LW6/l$c;

    invoke-direct {v1, p0}, LW6/l$c;-><init>(LW6/l;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LE8/i;->d0(Ljava/lang/CharSequence;Ljava/lang/String;IZILjava/lang/Object;)I

    move-result p0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    add-int/2addr v2, p0

    new-instance v3, Landroid/text/style/StyleSpan;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    const/16 v4, 0x21

    invoke-virtual {v0, v3, p0, v2, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {v0, v1, p0, v2, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    iget-object p0, p1, Le3/m;->y:Landroid/widget/TextView;

    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p0, p1, Le3/m;->y:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    return-void
.end method

.method private final i(Le3/m;)V
    .registers 2

    invoke-direct {p0, p1}, LW6/l;->g(Le3/m;)V

    invoke-direct {p0, p1}, LW6/l;->h(Le3/m;)V

    return-void
.end method

.method private final k(Ljava/lang/String;)V
    .registers 9

    sget-object v0, Li6/a;->a:Li6/a;

    iget-object v1, p0, LW6/l;->a:Landroid/content/Context;

    new-instance v2, Landroid/content/Intent;

    const-string p0, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v2, p0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Li6/a;->b(Li6/a;Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;IILjava/lang/Object;)Z

    return-void
.end method

.method private final l(Le3/m;)V
    .registers 4

    iget-object v0, p1, Le3/m;->A:Landroid/widget/TextView;

    new-instance v1, LW6/j;

    invoke-direct {v1, p0}, LW6/j;-><init>(LW6/l;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p1, Le3/m;->w:Landroid/widget/TextView;

    new-instance v0, LW6/k;

    invoke-direct {v0, p0}, LW6/k;-><init>(LW6/l;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final m(LW6/l;Landroid/view/View;)V
    .registers 4

    sget-object p1, LW6/l;->d:LW6/l$a;

    iget-object v0, p0, LW6/l;->a:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, LW6/l$a;->c(Landroid/content/Context;Z)V

    invoke-direct {p0, v1}, LW6/l;->r(Z)V

    return-void
.end method

.method private static final n(LW6/l;Landroid/view/View;)V
    .registers 2

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LW6/l;->r(Z)V

    return-void
.end method

.method private final r(Z)V
    .registers 3

    iget-object v0, p0, LW6/l;->c:Lv8/l;

    if-eqz v0, :cond_b

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    iget-object p0, p0, LW6/l;->b:Landroid/app/AlertDialog;

    if-eqz p0, :cond_12

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_12
    return-void
.end method


# virtual methods
.method public final f()V
    .registers 1

    iget-object p0, p0, LW6/l;->b:Landroid/app/AlertDialog;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_7
    return-void
.end method

.method public final j()Z
    .registers 3

    iget-object p0, p0, LW6/l;->b:Landroid/app/AlertDialog;

    const/4 v0, 0x0

    if-eqz p0, :cond_d

    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_d

    return v1

    :cond_d
    return v0
.end method

.method public final o(Lv8/l;)V
    .registers 2

    iput-object p1, p0, LW6/l;->c:Lv8/l;

    return-void
.end method

.method public final p(Landroid/content/DialogInterface$OnDismissListener;)V
    .registers 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LW6/l;->b:Landroid/app/AlertDialog;

    if-eqz p0, :cond_c

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_c
    return-void
.end method

.method public final q(Landroid/content/DialogInterface$OnShowListener;)V
    .registers 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LW6/l;->b:Landroid/app/AlertDialog;

    if-eqz p0, :cond_c

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    :cond_c
    return-void
.end method

.method public final s()V
    .registers 5

    iget-object v0, p0, LW6/l;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Le3/m;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Le3/m;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, LW6/l;->i(Le3/m;)V

    invoke-direct {p0, v0}, LW6/l;->l(Le3/m;)V

    const-string v1, "apply(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, LW6/l;->a:Landroid/content/Context;

    const v3, 0x7f14014c

    invoke-direct {v1, v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, LW6/l;->b:Landroid/app/AlertDialog;

    if-eqz v0, :cond_37

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_37
    return-void
.end method
