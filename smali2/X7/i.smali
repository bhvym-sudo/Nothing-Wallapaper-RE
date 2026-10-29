.class public final LX7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX7/i$a;,
        LX7/i$b;
    }
.end annotation


# static fields
.field public static final x:LX7/i$a;


# instance fields
.field private q:Landroid/content/Context;

.field private r:Landroid/view/View;

.field private s:Landroid/widget/ImageView;

.field private t:Landroid/widget/TextView;

.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/FrameLayout;

.field private w:Landroid/app/AlertDialog;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LX7/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX7/i$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LX7/i;->x:LX7/i$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Z)V
    .registers 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttons"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX7/i;->q:Landroid/content/Context;

    new-instance p1, Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, LX7/i;->q:Landroid/content/Context;

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, LX7/i;->q:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, LV7/c;->d:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, LX7/i;->r:Landroid/view/View;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, LX7/i;->l(Landroid/view/View;)V

    iget-object v0, p0, LX7/i;->q:Landroid/content/Context;

    invoke-direct {p0, v0, p2, p3}, LX7/i;->g(Landroid/content/Context;Ljava/util/List;Z)V

    iget-object p2, p0, LX7/i;->r:Landroid/view/View;

    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_4c

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/view/Window;->setDecorFitsSystemWindows(Z)V

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p2

    const/16 p3, 0x700

    invoke-virtual {p2, p3}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_4c
    iput-object p1, p0, LX7/i;->w:Landroid/app/AlertDialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_5f

    iget-object p2, p0, LX7/i;->q:Landroid/content/Context;

    sget p3, LV7/a;->a:I

    invoke-static {p2, p3}, Lr0/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_5f
    iget-object p1, p0, LX7/i;->w:Landroid/app/AlertDialog;

    if-eqz p1, :cond_66

    invoke-virtual {p1, p0}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    :cond_66
    return-void
.end method

.method public static synthetic a(Ljava/util/List;LX7/i;Landroid/view/View;)V
    .registers 3

    invoke-static {p0, p1, p2}, LX7/i;->h(Ljava/util/List;LX7/i;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Ljava/util/List;ILX7/i;Landroid/view/View;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, LX7/i;->j(Ljava/util/List;ILX7/i;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Ljava/util/List;ILX7/i;Landroid/view/View;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, LX7/i;->i(Ljava/util/List;ILX7/i;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Ljava/util/List;ILX7/i;Landroid/view/View;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, LX7/i;->k(Ljava/util/List;ILX7/i;Landroid/view/View;)V

    return-void
.end method

.method private final f(LW7/b;)I
    .registers 2

    sget-object p0, LX7/i$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p0, p0, p1

    const/4 p1, 0x1

    if-eq p0, p1, :cond_14

    const/4 p1, 0x2

    if-eq p0, p1, :cond_11

    sget p0, LV7/d;->b:I

    return p0

    :cond_11
    sget p0, LV7/d;->a:I

    return p0

    :cond_14
    sget p0, LV7/d;->c:I

    return p0
.end method

.method private final g(Landroid/content/Context;Ljava/util/List;Z)V
    .registers 13

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object p0, p0, LX7/i;->v:Landroid/widget/FrameLayout;

    if-eqz p0, :cond_1ee

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_10
    iget-object v0, p0, LX7/i;->v:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_17
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const v2, 0x3ecccccd    # 0.4f

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x1

    const-string v5, "requireViewById(...)"

    const/4 v6, 0x0

    if-ne v0, v4, :cond_88

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p3, LV7/c;->b:I

    invoke-virtual {p1, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    sget p3, LV7/b;->h:I

    invoke-virtual {p1, p3}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p3

    invoke-static {p3, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Landroid/widget/TextView;

    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW7/a;

    invoke-virtual {v0}, LW7/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LW7/a;

    invoke-virtual {v0}, LW7/a;->d()LW7/b;

    move-result-object v0

    invoke-direct {p0, v0}, LX7/i;->f(LW7/b;)I

    move-result v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setTextAppearance(I)V

    new-instance p3, LX7/e;

    invoke-direct {p3, p2, p0}, LX7/e;-><init>(Ljava/util/List;LX7/i;)V

    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LW7/a;

    invoke-virtual {p3}, LW7/a;->a()Z

    move-result p3

    invoke-virtual {p1, p3}, Landroid/view/View;->setClickable(Z)V

    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LW7/a;

    invoke-virtual {p2}, LW7/a;->a()Z

    move-result p2

    if-eqz p2, :cond_7c

    move v2, v3

    :cond_7c
    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    iget-object p2, p0, LX7/i;->v:Landroid/widget/FrameLayout;

    if-eqz p2, :cond_1e7

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto/16 :goto_1e7

    :cond_88
    if-nez p3, :cond_9c

    invoke-direct {p0, p2}, LX7/i;->s(Ljava/util/List;)Z

    move-result p3

    if-eqz p3, :cond_91

    goto :goto_9c

    :cond_91
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p3, LV7/c;->a:I

    invoke-virtual {p1, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    goto :goto_a6

    :cond_9c
    :goto_9c
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p3, LV7/c;->c:I

    invoke-virtual {p1, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    :goto_a6
    const/4 p3, 0x3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    move v0, v6

    :goto_b0
    if-ge v0, p3, :cond_1e0

    if-nez v0, :cond_b6

    move v1, v4

    goto :goto_b7

    :cond_b6
    move v1, v6

    :goto_b7
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v4

    if-ne v0, v7, :cond_c0

    move v7, v4

    goto :goto_c1

    :cond_c0
    move v7, v6

    :goto_c1
    if-eqz v1, :cond_120

    sget v1, LV7/b;->j:I

    invoke-virtual {p1, v1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/FrameLayout;

    sget v7, LV7/b;->i:I

    invoke-virtual {p1, v7}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Landroid/widget/TextView;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LW7/a;

    invoke-virtual {v8}, LW7/a;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LW7/a;

    invoke-virtual {v8}, LW7/a;->d()LW7/b;

    move-result-object v8

    invoke-direct {p0, v8}, LX7/i;->f(LW7/b;)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextAppearance(I)V

    new-instance v7, LX7/f;

    invoke-direct {v7, p2, v0, p0}, LX7/f;-><init>(Ljava/util/List;ILX7/i;)V

    invoke-virtual {v1, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LW7/a;

    invoke-virtual {v7}, LW7/a;->a()Z

    move-result v7

    invoke-virtual {v1, v7}, Landroid/view/View;->setClickable(Z)V

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LW7/a;

    invoke-virtual {v7}, LW7/a;->a()Z

    move-result v7

    if-eqz v7, :cond_11a

    move v7, v3

    goto :goto_11b

    :cond_11a
    move v7, v2

    :goto_11b
    invoke-virtual {v1, v7}, Landroid/view/View;->setAlpha(F)V

    goto/16 :goto_1dc

    :cond_120
    if-eqz v7, :cond_17e

    sget v1, LV7/b;->e:I

    invoke-virtual {p1, v1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/FrameLayout;

    sget v7, LV7/b;->d:I

    invoke-virtual {p1, v7}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Landroid/widget/TextView;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LW7/a;

    invoke-virtual {v8}, LW7/a;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LW7/a;

    invoke-virtual {v8}, LW7/a;->d()LW7/b;

    move-result-object v8

    invoke-direct {p0, v8}, LX7/i;->f(LW7/b;)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextAppearance(I)V

    new-instance v7, LX7/g;

    invoke-direct {v7, p2, v0, p0}, LX7/g;-><init>(Ljava/util/List;ILX7/i;)V

    invoke-virtual {v1, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LW7/a;

    invoke-virtual {v7}, LW7/a;->a()Z

    move-result v7

    invoke-virtual {v1, v7}, Landroid/view/View;->setClickable(Z)V

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LW7/a;

    invoke-virtual {v7}, LW7/a;->a()Z

    move-result v7

    if-eqz v7, :cond_179

    move v7, v3

    goto :goto_17a

    :cond_179
    move v7, v2

    :goto_17a
    invoke-virtual {v1, v7}, Landroid/view/View;->setAlpha(F)V

    goto :goto_1dc

    :cond_17e
    sget v1, LV7/b;->g:I

    invoke-virtual {p1, v1}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/widget/FrameLayout;

    sget v7, LV7/b;->f:I

    invoke-virtual {p1, v7}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Landroid/widget/TextView;

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LW7/a;

    invoke-virtual {v8}, LW7/a;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LW7/a;

    invoke-virtual {v8}, LW7/a;->d()LW7/b;

    move-result-object v8

    invoke-direct {p0, v8}, LX7/i;->f(LW7/b;)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setTextAppearance(I)V

    new-instance v7, LX7/h;

    invoke-direct {v7, p2, v0, p0}, LX7/h;-><init>(Ljava/util/List;ILX7/i;)V

    invoke-virtual {v1, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LW7/a;

    invoke-virtual {v7}, LW7/a;->a()Z

    move-result v7

    invoke-virtual {v1, v7}, Landroid/view/View;->setClickable(Z)V

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LW7/a;

    invoke-virtual {v7}, LW7/a;->a()Z

    move-result v7

    if-eqz v7, :cond_1d8

    move v7, v3

    goto :goto_1d9

    :cond_1d8
    move v7, v2

    :goto_1d9
    invoke-virtual {v1, v7}, Landroid/view/View;->setAlpha(F)V

    :goto_1dc
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_b0

    :cond_1e0
    iget-object p2, p0, LX7/i;->v:Landroid/widget/FrameLayout;

    if-eqz p2, :cond_1e7

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1e7
    :goto_1e7
    iget-object p0, p0, LX7/i;->v:Landroid/widget/FrameLayout;

    if-eqz p0, :cond_1ee

    invoke-virtual {p0, v6}, Landroid/view/View;->setVisibility(I)V

    :cond_1ee
    return-void
.end method

.method private static final h(Ljava/util/List;LX7/i;Landroid/view/View;)V
    .registers 3

    const-string p2, "$infos"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$0"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LW7/a;

    invoke-virtual {p0}, LW7/a;->c()Lv8/a;

    move-result-object p0

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    iget-object p0, p1, LX7/i;->w:Landroid/app/AlertDialog;

    if-eqz p0, :cond_1f

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_1f
    return-void
.end method

.method private static final i(Ljava/util/List;ILX7/i;Landroid/view/View;)V
    .registers 4

    const-string p3, "$infos"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "this$0"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LW7/a;

    invoke-virtual {p0}, LW7/a;->c()Lv8/a;

    move-result-object p0

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    iget-object p0, p2, LX7/i;->w:Landroid/app/AlertDialog;

    if-eqz p0, :cond_1e

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_1e
    return-void
.end method

.method private static final j(Ljava/util/List;ILX7/i;Landroid/view/View;)V
    .registers 4

    const-string p3, "$infos"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "this$0"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LW7/a;

    invoke-virtual {p0}, LW7/a;->c()Lv8/a;

    move-result-object p0

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    iget-object p0, p2, LX7/i;->w:Landroid/app/AlertDialog;

    if-eqz p0, :cond_1e

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_1e
    return-void
.end method

.method private static final k(Ljava/util/List;ILX7/i;Landroid/view/View;)V
    .registers 4

    const-string p3, "$infos"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "this$0"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LW7/a;

    invoke-virtual {p0}, LW7/a;->c()Lv8/a;

    move-result-object p0

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    iget-object p0, p2, LX7/i;->w:Landroid/app/AlertDialog;

    if-eqz p0, :cond_1e

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_1e
    return-void
.end method

.method private final l(Landroid/view/View;)V
    .registers 3

    sget v0, LV7/b;->k:I

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, LX7/i;->s:Landroid/widget/ImageView;

    sget v0, LV7/b;->c:I

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, LX7/i;->t:Landroid/widget/TextView;

    sget v0, LV7/b;->b:I

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, LX7/i;->u:Landroid/widget/TextView;

    sget v0, LV7/b;->a:I

    invoke-virtual {p1, v0}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, LX7/i;->v:Landroid/widget/FrameLayout;

    return-void
.end method

.method private final m(Landroid/widget/TextView;)Z
    .registers 5

    invoke-virtual {p1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object p0

    const/4 p1, 0x0

    if-nez p0, :cond_8

    return p1

    :cond_8
    invoke-virtual {p0}, Landroid/text/Layout;->getLineCount()I

    move-result v0

    move v1, p1

    :goto_d
    if-ge v1, v0, :cond_1a

    invoke-virtual {p0, v1}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v2

    if-lez v2, :cond_17

    const/4 p0, 0x1

    return p0

    :cond_17
    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_1a
    return p1
.end method

.method private final s(Ljava/util/List;)Z
    .registers 9

    sget-object v0, LY7/a;->a:LY7/a$a;

    iget-object v1, p0, LX7/i;->q:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->screenWidthDp:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, LY7/a$a;->a(F)I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    invoke-virtual {v0, v2}, LY7/a$a;->a(F)I

    move-result v3

    const/high16 v4, 0x41800000    # 16.0f

    invoke-virtual {v0, v4}, LY7/a$a;->a(F)I

    move-result v0

    iget-object v4, p0, LX7/i;->q:Landroid/content/Context;

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    sget v5, LV7/c;->a:I

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    sget v5, LV7/b;->i:I

    invoke-virtual {v4, v5}, Landroid/view/View;->requireViewById(I)Landroid/view/View;

    move-result-object v4

    const-string v5, "requireViewById(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Landroid/widget/TextView;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x2

    if-le v5, v6, :cond_4d

    mul-int/lit8 v2, v0, 0x4

    sub-int/2addr v1, v2

    mul-int/2addr v3, v6

    sub-int/2addr v1, v3

    int-to-float v1, v1

    const/high16 v2, 0x40400000    # 3.0f

    :goto_48
    div-float/2addr v1, v2

    mul-int/2addr v0, v6

    int-to-float v0, v0

    sub-float/2addr v1, v0

    goto :goto_53

    :cond_4d
    mul-int/lit8 v5, v0, 0x4

    sub-int/2addr v1, v5

    sub-int/2addr v1, v3

    int-to-float v1, v1

    goto :goto_48

    :goto_53
    const/4 v0, 0x3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v2, 0x0

    move v3, v2

    :goto_5e
    if-ge v3, v0, :cond_89

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LW7/a;

    invoke-virtual {v5}, LW7/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    float-to-int v5, v1

    const/high16 v6, 0x40000000    # 2.0f

    invoke-static {v5, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    invoke-virtual {v4, v6, v2}, Landroid/view/View;->measure(II)V

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    invoke-virtual {v4, v2, v2, v5, v6}, Landroid/view/View;->layout(IIII)V

    invoke-direct {p0, v4}, LX7/i;->m(Landroid/widget/TextView;)Z

    move-result v5

    if-eqz v5, :cond_86

    const/4 p0, 0x1

    return p0

    :cond_86
    add-int/lit8 v3, v3, 0x1

    goto :goto_5e

    :cond_89
    return v2
.end method


# virtual methods
.method public final e()Landroid/app/AlertDialog;
    .registers 1

    iget-object p0, p0, LX7/i;->w:Landroid/app/AlertDialog;

    return-object p0
.end method

.method public final n(Z)V
    .registers 2

    iget-object p0, p0, LX7/i;->w:Landroid/app/AlertDialog;

    if-eqz p0, :cond_7

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    :cond_7
    return-void
.end method

.method public final o(Z)V
    .registers 2

    iget-object p0, p0, LX7/i;->w:Landroid/app/AlertDialog;

    if-eqz p0, :cond_7

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    :cond_7
    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .registers 2

    iget-object p0, p0, LX7/i;->w:Landroid/app/AlertDialog;

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_7
    return-void
.end method

.method public final p(Ljava/lang/String;)V
    .registers 3

    const-string v0, "content"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LX7/i;->u:Landroid/widget/TextView;

    if-eqz v0, :cond_c

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_c
    iget-object p0, p0, LX7/i;->u:Landroid/widget/TextView;

    if-eqz p0, :cond_1d

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_18

    const/4 p1, 0x0

    goto :goto_1a

    :cond_18
    const/16 p1, 0x8

    :goto_1a
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_1d
    return-void
.end method

.method public final q(Ljava/lang/String;)V
    .registers 3

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    iget-object v0, p0, LX7/i;->t:Landroid/widget/TextView;

    if-eqz v0, :cond_f

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_f
    iget-object p0, p0, LX7/i;->t:Landroid/widget/TextView;

    if-eqz p0, :cond_17

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_17
    return-void
.end method

.method public final r()V
    .registers 3

    iget-object v0, p0, LX7/i;->w:Landroid/app/AlertDialog;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_7
    iget-object p0, p0, LX7/i;->w:Landroid/app/AlertDialog;

    if-eqz p0, :cond_10

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p0

    goto :goto_11

    :cond_10
    const/4 p0, 0x0

    :goto_11
    if-eqz p0, :cond_25

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    invoke-virtual {p0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/WindowManager$LayoutParams;->copyFrom(Landroid/view/WindowManager$LayoutParams;)I

    const/4 v1, -0x1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    invoke-virtual {p0, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_25
    return-void
.end method
