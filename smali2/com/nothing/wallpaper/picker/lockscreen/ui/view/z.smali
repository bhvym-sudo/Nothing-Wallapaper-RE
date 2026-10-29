.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

.field public final synthetic r:Ljava/util/List;

.field public final synthetic s:Landroidx/recyclerview/widget/LinearLayoutManager;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/util/List;Landroidx/recyclerview/widget/LinearLayoutManager;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/z;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/z;->r:Ljava/util/List;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/z;->s:Landroidx/recyclerview/widget/LinearLayoutManager;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/z;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/z;->r:Ljava/util/List;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/z;->s:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-static {v0, v1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->a(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/util/List;Landroidx/recyclerview/widget/LinearLayoutManager;)V

    return-void
.end method
