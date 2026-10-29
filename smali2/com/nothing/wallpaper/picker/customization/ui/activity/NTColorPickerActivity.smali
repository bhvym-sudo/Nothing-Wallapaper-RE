.class public final Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity;
.super LN6/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity$a;
    }
.end annotation


# static fields
.field public static final S:Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity$a;


# instance fields
.field private final R:Lh8/h;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity;->S:Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, LN6/a;-><init>()V

    new-instance v0, Lb7/a;

    invoke-direct {v0, p0}, Lb7/a;-><init>(Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity;->R:Lh8/h;

    return-void
.end method

.method public static synthetic w0(Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity;)Lb2/c;
    .registers 1

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity;->y0(Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity;)Lb2/c;

    move-result-object p0

    return-object p0
.end method

.method private final x0(Landroid/os/Bundle;)V
    .registers 5

    invoke-static {}, LO6/b;->e()Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_48

    :cond_7
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "key_unlock_bauhaus_style"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_48

    :cond_15
    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LK1/p;

    invoke-virtual {v0}, Lh3/V;->i()Lg3/v;

    move-result-object v1

    new-instance v2, Landroidx/lifecycle/d0;

    invoke-virtual {v0, p0, v1}, LK1/p;->i0(Landroid/content/Context;Lg3/v;)Lb2/c$d;

    move-result-object v0

    invoke-direct {v2, p0, v0}, Landroidx/lifecycle/d0;-><init>(Landroidx/lifecycle/f0;Landroidx/lifecycle/d0$c;)V

    const-class v0, Lb2/c;

    invoke-static {v0}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroidx/lifecycle/d0;->a(LC8/c;)Landroidx/lifecycle/a0;

    move-result-object v0

    check-cast v0, Lb2/c;

    if-nez p1, :cond_48

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lb2/c;->A(Z)V

    invoke-static {p0}, LO6/b;->d(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_48

    invoke-virtual {v0, p1}, Lb2/c;->B(Z)V

    :cond_48
    :goto_48
    return-void
.end method

.method private static final y0(Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity;)Lb2/c;
    .registers 4

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.android.customization.module.ThemePickerInjector"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LK1/p;

    invoke-virtual {v0}, Lh3/V;->i()Lg3/v;

    move-result-object v1

    new-instance v2, Landroidx/lifecycle/d0;

    invoke-virtual {v0, p0, v1}, LK1/p;->i0(Landroid/content/Context;Lg3/v;)Lb2/c$d;

    move-result-object v0

    invoke-direct {v2, p0, v0}, Landroidx/lifecycle/d0;-><init>(Landroidx/lifecycle/f0;Landroidx/lifecycle/d0$c;)V

    const-class p0, Lb2/c;

    invoke-static {p0}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object p0

    invoke-virtual {v2, p0}, Landroidx/lifecycle/d0;->a(LC8/c;)Landroidx/lifecycle/a0;

    move-result-object p0

    check-cast p0, Lb2/c;

    return-object p0
.end method

.method private final z0()Lb2/c;
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity;->R:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb2/c;

    return-object p0
.end method


# virtual methods
.method public finish()V
    .registers 2

    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity;->z0()Lb2/c;

    move-result-object v0

    invoke-virtual {v0}, Lb2/c;->x()Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    :cond_e
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .registers 3

    const-string v0, "newConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lb/j;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p1, p1, 0x30

    const/16 v0, 0x10

    if-eq p1, v0, :cond_15

    const/16 v0, 0x20

    if-eq p1, v0, :cond_15

    goto :goto_22

    :cond_15
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity;->z0()Lb2/c;

    move-result-object p1

    invoke-virtual {p1}, Lb2/c;->z()Z

    move-result p1

    if-nez p1, :cond_22

    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    :cond_22
    :goto_22
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 5

    invoke-super {p0, p1}, LN6/a;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    invoke-interface {v0}, Lh3/H;->C()Ld3/a;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.nothing.wallpaper.config.NTFlags"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lt6/c;

    invoke-virtual {v0}, Lt6/c;->z()Z

    move-result v0

    if-eqz v0, :cond_29

    const/4 v0, 0x1

    const v1, 0x7f010023

    const v2, 0x7f01005e

    invoke-virtual {p0, v0, v2, v1}, Landroid/app/Activity;->overrideActivityTransition(III)V

    const/4 v0, 0x0

    const v1, 0x7f010022

    invoke-virtual {p0, v0, v1, v2}, Landroid/app/Activity;->overrideActivityTransition(III)V

    :cond_29
    const v0, 0x7f0d002a

    invoke-virtual {p0, v0}, Lb/j;->setContentView(I)V

    invoke-direct {p0, p1}, Lcom/nothing/wallpaper/picker/customization/ui/activity/NTColorPickerActivity;->x0(Landroid/os/Bundle;)V

    return-void
.end method
