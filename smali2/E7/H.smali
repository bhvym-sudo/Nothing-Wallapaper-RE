.class public final synthetic LE7/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

.field public final synthetic r:LE7/e;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;LE7/e;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE7/H;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    iput-object p2, p0, LE7/H;->r:LE7/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, LE7/H;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    iget-object p0, p0, LE7/H;->r:LE7/e;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, LE7/f;

    invoke-static {v0, p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->o1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;LE7/e;ZLE7/f;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
