.class final LG7/n$b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/n$b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

.field final synthetic r:LJ7/i;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;LJ7/i;)V
    .registers 3

    iput-object p1, p0, LG7/n$b$b$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    iput-object p2, p0, LG7/n$b$b$a;->r:LJ7/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p2, p0, LG7/n$b$b$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    iget-object p0, p0, LG7/n$b$b$a;->r:LJ7/i;

    invoke-virtual {p0}, LJ7/i;->p0()Z

    move-result p0

    invoke-virtual {p2, p1, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->l(IZ)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, LG7/n$b$b$a;->a(ILm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
