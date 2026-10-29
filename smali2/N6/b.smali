.class public abstract LN6/b;
.super LN6/a;
.source "SourceFile"


# instance fields
.field private final R:Ljava/lang/String;

.field private S:Lcom/nothing/wallpaper/segmenter/Segmenter;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, LN6/a;-><init>()V

    const-string v0, "BaseEntranceActivity"

    iput-object v0, p0, LN6/b;->R:Ljava/lang/String;

    return-void
.end method

.method private final w0()V
    .registers 3

    const v0, 0x7f010024

    const v1, 0x7f010026

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .registers 4

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/v;->onActivityResult(IILandroid/content/Intent;)V

    invoke-virtual {p0, p1, p2, p3}, LN6/b;->y0(IILandroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_4f

    invoke-static {p0}, LH3/a;->j(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_13

    invoke-direct {p0}, LN6/b;->w0()V

    return-void

    :cond_13
    invoke-virtual {p0}, Landroidx/fragment/app/v;->o0()Landroidx/fragment/app/J;

    move-result-object p1

    const-string p2, "getSupportFragmentManager(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1c
    invoke-virtual {p1}, Landroidx/fragment/app/J;->r0()I

    move-result p2

    if-lez p2, :cond_26

    invoke-virtual {p1}, Landroidx/fragment/app/J;->c1()Z

    goto :goto_1c

    :cond_26
    invoke-virtual {p0}, LN6/b;->x0()Landroidx/fragment/app/q;

    move-result-object p2

    if-eqz p2, :cond_4f

    iget-object p0, p0, LN6/b;->R:Ljava/lang/String;

    const-string p3, "Manually trigger fragment onCreateView"

    invoke-static {p0, p3}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/J;->p()Landroidx/fragment/app/S;

    move-result-object p0

    const-string p3, "beginTransaction(...)"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Landroidx/fragment/app/S;->m(Landroidx/fragment/app/q;)Landroidx/fragment/app/S;

    invoke-virtual {p0}, Landroidx/fragment/app/S;->i()I

    invoke-virtual {p1}, Landroidx/fragment/app/J;->p()Landroidx/fragment/app/S;

    move-result-object p0

    invoke-static {p0, p3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Landroidx/fragment/app/S;->h(Landroidx/fragment/app/q;)Landroidx/fragment/app/S;

    invoke-virtual {p0}, Landroidx/fragment/app/S;->i()I

    :cond_4f
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 4

    invoke-super {p0, p1}, LN6/a;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, LN6/b;->R:Ljava/lang/String;

    const-string v0, "onCreate"

    invoke-static {p1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p1

    if-nez p1, :cond_1e

    sget-object p1, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    const-string v1, "getApplication(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/nothing/wallpaper/NTPickerApplication$a;->b(Landroid/app/Application;)V

    :cond_1e
    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p1

    invoke-interface {p1}, Lh3/H;->C()Ld3/a;

    move-result-object p1

    invoke-virtual {p1}, Ld3/a;->p()Z

    move-result p1

    if-eqz p1, :cond_37

    invoke-static {}, LP7/b;->c()Lcom/nothing/wallpaper/segmenter/Segmenter;

    move-result-object p1

    iput-object p1, p0, LN6/b;->S:Lcom/nothing/wallpaper/segmenter/Segmenter;

    if-eqz p1, :cond_37

    invoke-interface {p1}, Lcom/nothing/wallpaper/segmenter/Segmenter;->a()V

    :cond_37
    return-void
.end method

.method protected onDestroy()V
    .registers 3

    invoke-super {p0}, Landroidx/fragment/app/v;->onDestroy()V

    iget-object v0, p0, LN6/b;->R:Ljava/lang/String;

    const-string v1, "onDestroy"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p0, p0, LN6/b;->S:Lcom/nothing/wallpaper/segmenter/Segmenter;

    if-eqz p0, :cond_11

    invoke-interface {p0}, Lcom/nothing/wallpaper/segmenter/Segmenter;->close()V

    :cond_11
    return-void
.end method

.method public abstract x0()Landroidx/fragment/app/q;
.end method

.method protected abstract y0(IILandroid/content/Intent;)Z
.end method
