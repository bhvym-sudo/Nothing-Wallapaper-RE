.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->G2(Z)Landroid/animation/AnimatorSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method constructor <init>(ZLcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 3

    iput-boolean p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$c;->a:Z

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$c;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 4

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$c;->a:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_20

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$c;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Le3/u;

    move-result-object p1

    if-nez p1, :cond_18

    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object p1, v0

    :cond_18
    iget-object p1, p1, Le3/u;->H:Landroidx/cardview/widget/CardView;

    const/high16 v1, -0x1000000

    invoke-virtual {p1, v1}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    goto :goto_2e

    :cond_20
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$c;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->w2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$c;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->a2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$l;

    move-result-object p1

    invoke-virtual {p1}, Lb/u;->h()V

    :goto_2e
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$c;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->N2()LE7/Z;

    move-result-object p0

    if-eqz p0, :cond_3b

    const/4 p1, 0x0

    const/4 v1, 0x1

    invoke-static {p0, p1, v1, v0}, LE7/Z;->u(LE7/Z;ZILjava/lang/Object;)V

    :cond_3b
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$c;->a:Z

    if-nez p1, :cond_1d

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$c;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Le3/u;

    move-result-object p0

    if-nez p0, :cond_17

    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p0, 0x0

    :cond_17
    iget-object p0, p0, Le3/u;->H:Landroidx/cardview/widget/CardView;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_1d
    return-void
.end method
