.class public final synthetic LE7/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Landroid/view/View;

.field public final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE7/B;->q:Landroid/view/View;

    iput-object p2, p0, LE7/B;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, LE7/B;->q:Landroid/view/View;

    iget-object p0, p0, LE7/B;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->L1(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
