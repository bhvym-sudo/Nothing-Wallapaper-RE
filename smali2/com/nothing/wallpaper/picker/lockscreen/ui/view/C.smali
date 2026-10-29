.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;

.field public final synthetic r:Lcom/android/launcher3/h$a;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;Lcom/android/launcher3/h$a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/C;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/C;->r:Lcom/android/launcher3/h$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/C;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/C;->r:Lcom/android/launcher3/h$a;

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->o0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;Lcom/android/launcher3/h$a;)V

    return-void
.end method
