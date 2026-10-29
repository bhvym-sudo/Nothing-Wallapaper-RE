.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    invoke-direct {v0, p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;Lm8/e;)V

    iput-object p1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->q:I

    if-nez v0, :cond_9e

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->r:Ljava/lang/Object;

    check-cast p1, LF8/L;

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->c(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Le3/g;

    move-result-object v0

    iget-object v0, v0, Le3/g;->z:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;

    const-string v1, "clockListView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    invoke-static {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Ly7/s;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v1}, Ly7/s;->getLockScreenViewModel()LJ7/i;

    move-result-object v1

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    invoke-static {v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Ly7/s;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v2}, Ly7/s;->getClockViewFactory()LS1/a;

    move-result-object v2

    invoke-static {v0, v1, v2, p1}, LG7/n;->a(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockSnapshotListView;LJ7/i;LS1/a;LF8/L;)V

    sget-object v0, LG7/l;->a:LG7/l;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    invoke-static {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->c(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Le3/g;

    move-result-object v1

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    invoke-static {v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Lcom/android/launcher3/f;

    move-result-object v2

    const-string v3, "access$getDeviceProfile$p(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    invoke-static {v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Ly7/s;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v4}, Ly7/s;->getLockScreenViewModel()LJ7/i;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v4, p1}, LG7/l;->f(Le3/g;Lcom/android/launcher3/f;LJ7/i;LF8/L;)V

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    invoke-static {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->c(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Le3/g;

    move-result-object v1

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    invoke-static {v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->d(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Lcom/android/launcher3/f;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    invoke-static {v3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Ly7/s;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v3}, Ly7/s;->getLockScreenViewModel()LJ7/i;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3, p1}, LG7/l;->d(Le3/g;Lcom/android/launcher3/f;LJ7/i;LF8/L;)V

    sget-object v0, LG7/p;->a:LG7/p;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    invoke-static {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->c(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Le3/g;

    move-result-object v1

    iget-object v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    invoke-static {v2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Ly7/s;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v2}, Ly7/s;->getLockScreenViewModel()LJ7/i;

    move-result-object v2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage$a$a$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;->e(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerPage;)Ly7/s;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v2, p0, p1}, LG7/p;->b(Le3/g;LJ7/i;Ly7/s;LF8/L;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_9e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
