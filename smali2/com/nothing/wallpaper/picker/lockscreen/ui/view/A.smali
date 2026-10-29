.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;

.field public final synthetic r:LT1/a;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;LT1/a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/A;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/A;->r:LT1/a;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/A;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/A;->r:LT1/a;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;->d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$a$a;LT1/a;Landroid/view/View;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
