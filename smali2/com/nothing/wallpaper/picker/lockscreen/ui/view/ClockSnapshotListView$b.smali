.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->g(Ljava/lang/String;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;Lv8/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

.field final synthetic s:Ljava/lang/String;

.field final synthetic t:Lv8/l;

.field final synthetic u:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/lang/String;Lv8/l;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;Lm8/e;)V
    .registers 6

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->s:Ljava/lang/String;

    iput-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->t:Lv8/l;

    iput-object p4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->u:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->s:Ljava/lang/String;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->t:Lv8/l;

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->u:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/lang/String;Lv8/l;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_31

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-static {}, LF8/b0;->a()LF8/I;

    move-result-object p1

    new-instance v1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b$a;

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->u:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->s:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-direct {v1, v3, v4, v5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/H;Ljava/lang/String;Lm8/e;)V

    iput v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->q:I

    invoke-static {p1, v1, p0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_31

    return-object v0

    :cond_31
    :goto_31
    check-cast p1, Landroid/view/View;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->r:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->s:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;->d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Ljava/lang/String;Landroid/view/View;)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView$b;->t:Lv8/l;

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
