.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$q;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->K3(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$q;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    iput-boolean p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$q;->b:Z

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$q;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$q;->b:Z

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->j2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$q;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    const/4 p1, 0x1

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->j2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)V

    return-void
.end method
