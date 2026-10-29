.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;
.super Lb/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;->d:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lb/u;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;->d:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/v;->o0()Landroidx/fragment/app/J;

    move-result-object v0

    const v1, 0x7f0a01f5

    invoke-virtual {v0, v1}, Landroidx/fragment/app/J;->j0(I)Landroidx/fragment/app/q;

    move-result-object v0

    if-eqz v0, :cond_25

    instance-of v0, v0, Lcom/android/wallpaper/picker/g;

    if-eqz v0, :cond_25

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;->d:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/v;->o0()Landroidx/fragment/app/J;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/J;->c1()Z

    return-void

    :cond_25
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;->d:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->V1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Z

    move-result v0

    if-eqz v0, :cond_2e

    return-void

    :cond_2e
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;->d:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v0

    invoke-virtual {v0}, LJ7/i;->a0()Z

    move-result v0

    if-eqz v0, :cond_40

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;->d:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    return-void

    :cond_40
    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;->d:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/q;->getParentFragment()Landroidx/fragment/app/q;

    move-result-object v0

    instance-of v0, v0, Lg7/k;

    if-eqz v0, :cond_50

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;->d:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->W1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    return-void

    :cond_50
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;->d:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
