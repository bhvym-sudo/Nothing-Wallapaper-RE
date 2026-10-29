.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LO2/h;

.field public final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;


# direct methods
.method public synthetic constructor <init>(LO2/h;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/F;->q:LO2/h;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/F;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/F;->q:LO2/h;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/F;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;->v(LO2/h;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;)V

    return-void
.end method
