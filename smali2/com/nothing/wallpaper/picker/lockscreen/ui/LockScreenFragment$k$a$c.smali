.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {v0, p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Lm8/e;)V

    iput-object p1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->s(Ljava/lang/Boolean;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->q:I

    if-nez v0, :cond_9a

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->r:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "lockScreenOpenState: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LockScreenFragment"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_88

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->N2()LE7/Z;

    move-result-object p1

    if-eqz p1, :cond_3c

    const/4 v1, 0x0

    invoke-static {p1, v2, v0, v1}, LE7/Z;->u(LE7/Z;ZILjava/lang/Object;)V

    :cond_3c
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->h2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Z

    move-result p1

    if-eqz p1, :cond_55

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->c2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Landroid/os/Handler;

    move-result-object p1

    iget-object v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Z1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v3, 0xbb8

    invoke-virtual {p1, v1, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_55
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-static {p1}, LH3/a;->b(Landroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_6b

    sget-object p0, LR7/d;->r:LR7/d;

    invoke-virtual {p0, v0}, LR7/d;->h(I)V

    goto :goto_97

    :cond_6b
    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p0

    invoke-static {p0}, LH3/a;->i(Landroid/content/Intent;)Z

    move-result p0

    if-eqz p0, :cond_82

    sget-object p0, LR7/d;->r:LR7/d;

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, LR7/d;->h(I)V

    goto :goto_97

    :cond_82
    sget-object p0, LR7/d;->r:LR7/d;

    invoke-virtual {p0, v2}, LR7/d;->h(I)V

    goto :goto_97

    :cond_88
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_97

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->s:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->y2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V

    :cond_97
    :goto_97
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_9a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(Ljava/lang/Boolean;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
