.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {v0, p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    iput-object p1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LJ7/m;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;->s(LJ7/m;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1b

    if-ne v1, v2, :cond_13

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;->r:Ljava/lang/Object;

    check-cast v0, LJ7/m;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_39

    :cond_13
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1b
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;->r:Ljava/lang/Object;

    check-cast p1, LJ7/m;

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object v1

    invoke-virtual {v1}, LJ7/i;->V()LI8/f;

    move-result-object v1

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;->r:Ljava/lang/Object;

    iput v2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;->q:I

    invoke-static {v1, p0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_37

    return-object v0

    :cond_37
    move-object v0, p1

    move-object p1, v1

    :goto_39
    check-cast p1, LN1/a;

    sget-object v1, LN1/a;->r:LN1/a;

    const/4 v3, 0x0

    if-ne p1, v1, :cond_42

    move p1, v2

    goto :goto_43

    :cond_42
    move p1, v3

    :goto_43
    sget-object v1, LJ7/m$c;->q:LJ7/m$c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v4, "getString(...)"

    if-eqz v1, :cond_5f

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->z:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$a;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    const v1, 0x7f1302d8

    invoke-virtual {p0, v1}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1, v3, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$a;->a(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ljava/lang/String;ZZ)V

    goto :goto_78

    :cond_5f
    sget-object v1, LJ7/m$a;->q:LJ7/m$a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_78

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->z:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$a;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    const v1, 0x7f13008c

    invoke-virtual {p0, v1}, Landroidx/fragment/app/q;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1, v2, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$a;->a(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ljava/lang/String;ZZ)V

    :cond_78
    :goto_78
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final s(LJ7/m;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$j$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
