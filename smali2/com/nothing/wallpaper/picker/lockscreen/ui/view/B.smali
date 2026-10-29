.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroid/view/View;

.field public final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;

.field public final synthetic s:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;Z)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/B;->q:Landroid/view/View;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/B;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;

    iput-boolean p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/B;->s:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/B;->q:Landroid/view/View;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/B;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/B;->s:Z

    invoke-static {v0, v1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;->p0(Landroid/view/View;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/D;Z)V

    return-void
.end method
