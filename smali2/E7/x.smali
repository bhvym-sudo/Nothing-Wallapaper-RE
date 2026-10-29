.class public final synthetic LE7/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Le3/u;

.field public final synthetic b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method public synthetic constructor <init>(Le3/u;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE7/x;->a:Le3/u;

    iput-object p2, p0, LE7/x;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 3

    iget-object v0, p0, LE7/x;->a:Le3/u;

    iget-object p0, p0, LE7/x;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {v0, p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->E1(Le3/u;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Landroid/animation/ValueAnimator;)V

    return-void
.end method
