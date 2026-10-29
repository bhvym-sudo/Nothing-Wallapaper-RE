.class final Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LN1/a;Lm8/e;)Ljava/lang/Object;
    .registers 9

    instance-of v0, p2, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a$a;

    iget v1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a$a;->u:I

    goto :goto_18

    :cond_13
    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a$a;

    invoke-direct {v0, p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a$a;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a$a;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a$a;->u:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_3b

    if-ne v2, v4, :cond_33

    iget p0, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a$a;->r:I

    iget-object p1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a$a;->q:Ljava/lang/Object;

    check-cast p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object v5, p1

    move p1, p0

    move-object p0, v5

    goto :goto_5c

    :cond_33
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3b
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    sget-object p2, LN1/a;->r:LN1/a;

    if-ne p1, p2, :cond_44

    move p1, v4

    goto :goto_45

    :cond_44
    move p1, v3

    :goto_45
    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->getLockScreenViewModel()LJ7/i;

    move-result-object p2

    invoke-virtual {p2}, LJ7/i;->N()LI8/E;

    move-result-object p2

    iput-object p0, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a$a;->q:Ljava/lang/Object;

    iput p1, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a$a;->r:I

    iput v4, v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a$a;->u:I

    invoke-static {p2, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5c

    return-object v1

    :cond_5c
    :goto_5c
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Y1(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Le3/u;

    move-result-object v0

    if-nez v0, :cond_70

    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_70
    iget-object v0, v0, Le3/u;->R:Lcom/android/launcher3/Workspace;

    if-eqz p1, :cond_75

    move v3, v4

    :cond_75
    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->g2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)Z

    move-result p1

    invoke-virtual {v0, v3, p2, p1}, Lcom/android/launcher3/Workspace;->X(ZZZ)V

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-static {p0, v4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->s2(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LN1/a;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment$k$a$a$a;->a(LN1/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
