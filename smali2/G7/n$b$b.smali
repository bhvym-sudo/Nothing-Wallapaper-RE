.class final LG7/n$b$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/n$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LJ7/i;

.field final synthetic s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;


# direct methods
.method constructor <init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LG7/n$b$b;->r:LJ7/i;

    iput-object p2, p0, LG7/n$b$b;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, LG7/n$b$b;

    iget-object v0, p0, LG7/n$b$b;->r:LJ7/i;

    iget-object p0, p0, LG7/n$b$b;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    invoke-direct {p1, v0, p0, p2}, LG7/n$b$b;-><init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LG7/n$b$b;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LG7/n$b$b;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LG7/n$b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LG7/n$b$b;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LG7/n$b$b;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_32

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LG7/n$b$b;->r:LJ7/i;

    invoke-virtual {p1}, LJ7/i;->X()LI8/f;

    move-result-object p1

    new-instance v1, LG7/n$b$b$a;

    iget-object v3, p0, LG7/n$b$b;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    iget-object v4, p0, LG7/n$b$b;->r:LJ7/i;

    invoke-direct {v1, v3, v4}, LG7/n$b$b$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;LJ7/i;)V

    iput v2, p0, LG7/n$b$b;->q:I

    invoke-interface {p1, v1, p0}, LI8/f;->a(LI8/g;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_32

    return-object v0

    :cond_32
    :goto_32
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
