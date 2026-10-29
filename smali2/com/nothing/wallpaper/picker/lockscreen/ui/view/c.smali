.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

.field public final synthetic r:LO1/b;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;LO1/b;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c;->r:LO1/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c;->r:LO1/b;

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;->a(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockEditContentView;LO1/b;)V

    return-void
.end method
