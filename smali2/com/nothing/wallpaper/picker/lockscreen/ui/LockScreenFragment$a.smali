.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;
    .registers 3

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v0, "showPreviewDimmingScrim"

    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;-><init>()V

    invoke-virtual {p1, p0}, Landroidx/fragment/app/q;->setArguments(Landroid/os/Bundle;)V

    return-object p1
.end method
