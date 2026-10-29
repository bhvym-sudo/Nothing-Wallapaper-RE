.class public final synthetic LE7/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE7/J;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LE7/J;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->A1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
