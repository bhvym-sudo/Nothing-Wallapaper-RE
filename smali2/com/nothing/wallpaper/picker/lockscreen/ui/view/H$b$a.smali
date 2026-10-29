.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;-><init>(LO2/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->a(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;)Z

    move-result v0

    if-nez v0, :cond_9

    return-void

    :cond_9
    sget-object v0, LF2/d;->e:LF2/i;

    const-wide/16 v1, 0x3de

    invoke-virtual {v0, p0, v1, v2}, LF2/i;->a(Ljava/lang/Runnable;J)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H$b;->b()LO2/l;

    move-result-object p0

    invoke-interface {p0}, LO2/l;->b()LO2/m;

    move-result-object p0

    invoke-interface {p0}, LO2/m;->b()V

    return-void
.end method
