.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Le3/e;


# direct methods
.method public synthetic constructor <init>(ILe3/e;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/t;->q:I

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/t;->r:Le3/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/t;->q:I

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/t;->r:Le3/e;

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->k(ILe3/e;)V

    return-void
.end method
