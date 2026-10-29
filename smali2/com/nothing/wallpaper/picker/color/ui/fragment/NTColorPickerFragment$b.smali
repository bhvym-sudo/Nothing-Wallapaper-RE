.class public final Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->Q0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$b;->a:Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .registers 2

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$b;->a:Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->M0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;)Landroid/view/animation/Animation;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Landroid/view/animation/Animation;->cancel()V

    :cond_b
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment$b;->a:Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;->J0(Lcom/nothing/wallpaper/picker/color/ui/fragment/NTColorPickerFragment;)Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_18

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_18
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method
