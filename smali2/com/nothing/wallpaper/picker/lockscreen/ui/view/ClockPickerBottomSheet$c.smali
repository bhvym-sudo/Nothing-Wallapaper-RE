.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->o0(ZF)Landroid/animation/AnimatorSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$c;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$c;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->j0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)Landroid/view/ViewGroup;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$c;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->j0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;)Landroid/view/ViewGroup;

    move-result-object p0

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method
