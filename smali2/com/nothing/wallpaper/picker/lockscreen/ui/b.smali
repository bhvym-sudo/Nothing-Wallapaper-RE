.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

.field public final synthetic r:Z


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/b;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    iput-boolean p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/b;->r:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/b;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/b;->r:Z

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$m;->u(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)Lh8/A;

    move-result-object p0

    return-object p0
.end method
