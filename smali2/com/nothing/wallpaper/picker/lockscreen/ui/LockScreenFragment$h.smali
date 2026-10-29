.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->a3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method public constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$h;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 10

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$h;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    new-instance p2, Ly7/r;

    iget-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$h;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Le3/u;

    move-result-object p3

    if-nez p3, :cond_15

    const-string p3, "binding"

    invoke-static {p3}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 p3, 0x0

    :cond_15
    iget-object p4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$h;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l()Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;

    move-result-object p4

    iget-object p5, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$h;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->b2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Ly7/u;

    move-result-object p5

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$h;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->T2()LJ7/b;

    move-result-object p0

    invoke-direct {p2, p3, p4, p5, p0}, Ly7/r;-><init>(Le3/u;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;Lcom/android/launcher3/views/f;LJ7/b;)V

    invoke-static {p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->l2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ly7/r;)V

    return-void
.end method
