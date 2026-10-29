.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;->j(Landroid/graphics/drawable/TransitionDrawable;JLandroid/view/animation/PathInterpolator;Lv8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;

.field final synthetic b:Lv8/a;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;Lv8/a;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton$b;->b:Lv8/a;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;

    const/4 p1, 0x0

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton;Landroid/animation/ValueAnimator;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/NtRadioButton$b;->b:Lv8/a;

    if-eqz p0, :cond_12

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    :cond_12
    return-void
.end method
