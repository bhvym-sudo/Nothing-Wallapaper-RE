.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/X;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/X;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;->b(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/TopAreaView;)V

    return-void
.end method
