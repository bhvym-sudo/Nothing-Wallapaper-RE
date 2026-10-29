.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$b;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;


# direct methods
.method public constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;Landroid/os/Handler;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .registers 2

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->l(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->i(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->h(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V

    return-void
.end method
