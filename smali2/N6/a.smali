.class public abstract LN6/a;
.super Landroidx/fragment/app/v;
.source "SourceFile"

# interfaces
.implements Lcom/android/wallpaper/picker/a$a;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/fragment/app/v;-><init>()V

    return-void
.end method


# virtual methods
.method public k()V
    .registers 1

    invoke-virtual {p0}, Lb/j;->f()Lb/v;

    move-result-object p0

    invoke-virtual {p0}, Lb/v;->l()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 5

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    if-nez v0, :cond_14

    sget-object v0, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "getApplication(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/NTPickerApplication$a;->b(Landroid/app/Application;)V

    :cond_14
    invoke-super {p0, p1}, Landroidx/fragment/app/v;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, Landroidx/core/view/T;->b(Landroid/view/Window;Z)V

    return-void
.end method

.method public q()Z
    .registers 1

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, LH3/a;->j(Landroid/content/Context;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method protected u0(Landroidx/fragment/app/q;)V
    .registers 3

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/v;->o0()Landroidx/fragment/app/J;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/J;->p()Landroidx/fragment/app/S;

    move-result-object p0

    const v0, 0x7f0a01f5

    invoke-virtual {p0, v0, p1}, Landroidx/fragment/app/S;->r(ILandroidx/fragment/app/q;)Landroidx/fragment/app/S;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/S;->k()V

    return-void
.end method

.method protected v0(Landroidx/fragment/app/q;)V
    .registers 7

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/v;->o0()Landroidx/fragment/app/J;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/J;->p()Landroidx/fragment/app/S;

    move-result-object v0

    const v1, 0x7f010028

    const v2, 0x7f010029

    const v3, 0x7f01002b

    const v4, 0x7f01002c

    invoke-virtual {v0, v3, v4, v1, v2}, Landroidx/fragment/app/S;->u(IIII)Landroidx/fragment/app/S;

    move-result-object v0

    const v1, 0x7f0a01f5

    invoke-virtual {v0, v1, p1}, Landroidx/fragment/app/S;->r(ILandroidx/fragment/app/q;)Landroidx/fragment/app/S;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/S;->g(Ljava/lang/String;)Landroidx/fragment/app/S;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/S;->i()I

    invoke-virtual {p0}, Landroidx/fragment/app/v;->o0()Landroidx/fragment/app/J;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/J;->g0()Z

    return-void
.end method
