.class public Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity;
.super LN6/a;
.source "SourceFile"

# interfaces
.implements Lj7/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity$a;
    }
.end annotation


# static fields
.field public static final T:Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity$a;


# instance fields
.field private R:Lj7/j;

.field private S:Lo7/b;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity;->T:Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, LN6/a;-><init>()V

    return-void
.end method


# virtual methods
.method public E()V
    .registers 2

    new-instance v0, Lq7/l;

    invoke-direct {v0}, Lq7/l;-><init>()V

    invoke-virtual {p0, v0}, LN6/a;->v0(Landroidx/fragment/app/q;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 7

    invoke-super {p0, p1}, LN6/a;->onCreate(Landroid/os/Bundle;)V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p1

    invoke-interface {p1}, Lh3/H;->C()Ld3/a;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.nothing.wallpaper.config.NTFlags"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lt6/c;

    invoke-virtual {p1}, Lt6/c;->z()Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_29

    const p1, 0x7f010023

    const v2, 0x7f01005e

    invoke-virtual {p0, v1, v2, p1}, Landroid/app/Activity;->overrideActivityTransition(III)V

    const p1, 0x7f010022

    invoke-virtual {p0, v0, p1, v2}, Landroid/app/Activity;->overrideActivityTransition(III)V

    :cond_29
    const p1, 0x7f0d002e

    invoke-virtual {p0, p1}, Lb/j;->setContentView(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v2, "com.android.wallpaper.picker.wallpaper_info"

    const-class v3, Lg3/x;

    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg3/x;

    if-nez p1, :cond_40

    return-void

    :cond_40
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-string v3, "com.android.wallpaper.picker.asset_id_present"

    invoke-virtual {v2, v3, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "com.android.wallpaper.picker.view_as_home"

    invoke-virtual {v3, v4, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    const-string v4, "com.nothing.wallpaper.picker.new_wallpaper"

    invoke-virtual {v3, v4, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_63

    sget-object v0, Lp7/a$a;->b:Lp7/a$a;

    goto :goto_70

    :cond_63
    sget-object v0, Lp7/a$c;->b:Lp7/a$c$a;

    if-eqz v1, :cond_6c

    invoke-virtual {v0}, Lp7/a$c$a;->a()Lp7/a$c;

    move-result-object v0

    goto :goto_70

    :cond_6c
    invoke-virtual {v0}, Lp7/a$c$a;->b()Lp7/a$c;

    move-result-object v0

    :goto_70
    invoke-virtual {p0, p1, v0, v2}, Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity;->w0(Lg3/x;Lp7/a;Z)V

    return-void
.end method

.method protected final w0(Lg3/x;Lp7/a;Z)V
    .registers 12

    const-string v0, "wallpaper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editFrom"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, LG6/g;->d(Lg3/x;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Edit "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " from "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "EditWallpaperActivity"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, LG6/e;->s(Lg3/x;)Z

    move-result v0

    const-string v1, "getApplicationContext(...)"

    if-eqz v0, :cond_4a

    new-instance v2, LD6/b;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v5, 0x1

    move-object v4, p1

    invoke-direct/range {v2 .. v7}, LD6/b;-><init>(Landroid/content/Context;Lg3/x;ZZZ)V

    goto :goto_57

    :cond_4a
    move-object v4, p1

    new-instance v2, LD6/c;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p1, v4}, LD6/c;-><init>(Landroid/content/Context;Lg3/x;)V

    :goto_57
    invoke-static {v4}, LG6/e;->s(Lg3/x;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_a1

    invoke-virtual {v4}, Lg3/x;->k()LC6/g;

    move-result-object p1

    invoke-static {v4}, LG6/e;->i(Lg3/x;)Z

    move-result v3

    if-eqz v3, :cond_6d

    invoke-static {p0}, LG6/e;->c(Landroid/content/Context;)Lx6/c;

    move-result-object v3

    goto :goto_78

    :cond_6d
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v4, v3}, Lg3/x;->d(Landroid/content/Context;)Lcom/android/wallpaper/asset/a;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    :goto_78
    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v5

    const-string v6, "null cannot be cast to non-null type com.android.customization.module.CustomizationInjector"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, LK1/a;

    new-instance v6, Lx6/k;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v5, v7}, LK1/a;->o(Landroid/content/Context;)Lx6/q;

    move-result-object v5

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_9d

    invoke-virtual {p1}, LC6/g;->d()Ljava/lang/String;

    move-result-object v0

    :cond_9d
    invoke-direct {v6, v5, v7, v3, v0}, Lx6/k;-><init>(Lx6/q;Landroid/content/Context;Lcom/android/wallpaper/asset/a;Ljava/lang/String;)V

    move-object v0, v6

    :cond_a1
    invoke-static {p2, v4, v0, v2}, Lj7/n;->a(Lp7/a;Lg3/x;Lx6/k;LD6/f;)Landroidx/lifecycle/d0$c;

    move-result-object p1

    new-instance p2, Landroidx/lifecycle/d0;

    invoke-direct {p2, p0, p1}, Landroidx/lifecycle/d0;-><init>(Landroidx/lifecycle/f0;Landroidx/lifecycle/d0$c;)V

    const-class v0, Lj7/j;

    invoke-virtual {p2, v0}, Landroidx/lifecycle/d0;->b(Ljava/lang/Class;)Landroidx/lifecycle/a0;

    move-result-object p2

    check-cast p2, Lj7/j;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity;->R:Lj7/j;

    invoke-static {v4}, LG6/e;->s(Lg3/x;)Z

    move-result p2

    if-eqz p2, :cond_c8

    new-instance p2, Landroidx/lifecycle/d0;

    invoke-direct {p2, p0, p1}, Landroidx/lifecycle/d0;-><init>(Landroidx/lifecycle/f0;Landroidx/lifecycle/d0$c;)V

    const-class p1, Lo7/g;

    invoke-virtual {p2, p1}, Landroidx/lifecycle/d0;->b(Ljava/lang/Class;)Landroidx/lifecycle/a0;

    move-result-object p1

    check-cast p1, Lo7/b;

    goto :goto_d5

    :cond_c8
    new-instance p2, Landroidx/lifecycle/d0;

    invoke-direct {p2, p0, p1}, Landroidx/lifecycle/d0;-><init>(Landroidx/lifecycle/f0;Landroidx/lifecycle/d0$c;)V

    const-class p1, Lo7/h;

    invoke-virtual {p2, p1}, Landroidx/lifecycle/d0;->b(Ljava/lang/Class;)Landroidx/lifecycle/a0;

    move-result-object p1

    check-cast p1, Lo7/b;

    :goto_d5
    iput-object p1, p0, Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity;->S:Lo7/b;

    invoke-virtual {p0}, Landroidx/fragment/app/v;->o0()Landroidx/fragment/app/J;

    move-result-object p0

    const-string p1, "getSupportFragmentManager(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x7f0a01f5

    invoke-virtual {p0, p1}, Landroidx/fragment/app/J;->j0(I)Landroidx/fragment/app/q;

    move-result-object p2

    if-nez p2, :cond_112

    invoke-static {v4}, LG6/e;->s(Lg3/x;)Z

    move-result p2

    if-eqz p2, :cond_f5

    new-instance p2, Ll7/r;

    invoke-direct {p2}, Ll7/r;-><init>()V

    goto :goto_fa

    :cond_f5
    new-instance p2, Ll7/v;

    invoke-direct {p2}, Ll7/v;-><init>()V

    :goto_fa
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "is_asset_id_present"

    invoke-virtual {v0, v1, p3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-virtual {p2, v0}, Landroidx/fragment/app/q;->setArguments(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/J;->p()Landroidx/fragment/app/S;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/S;->b(ILandroidx/fragment/app/q;)Landroidx/fragment/app/S;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/S;->i()I

    :cond_112
    return-void
.end method
