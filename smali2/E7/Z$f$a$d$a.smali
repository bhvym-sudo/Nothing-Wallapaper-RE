.class final LE7/Z$f$a$d$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE7/Z$f$a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Z

.field final synthetic s:LE7/Z;


# direct methods
.method constructor <init>(LE7/Z;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LE7/Z$f$a$d$a;->s:LE7/Z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LE7/Z$f$a$d$a;

    iget-object p0, p0, LE7/Z$f$a$d$a;->s:LE7/Z;

    invoke-direct {v0, p0, p2}, LE7/Z$f$a$d$a;-><init>(LE7/Z;Lm8/e;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    iput-boolean p0, v0, LE7/Z$f$a$d$a;->r:Z

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LE7/Z$f$a$d$a;->s(ZLm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LE7/Z$f$a$d$a;->q:I

    if-nez v0, :cond_39

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, LE7/Z$f$a$d$a;->r:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "collect expand widget change:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WallpaperUIHelper"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LE7/Z$f$a$d$a;->s:LE7/Z;

    invoke-static {v0, p1}, LE7/Z;->l(LE7/Z;Z)V

    iget-object p0, p0, LE7/Z$f$a$d$a;->s:LE7/Z;

    invoke-virtual {p0}, LE7/Z;->y()Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->P2()Lj7/j;

    move-result-object p0

    if-eqz p0, :cond_36

    invoke-virtual {p0, p1}, Lj7/j;->H0(Z)V

    :cond_36
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_39
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(ZLm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LE7/Z$f$a$d$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LE7/Z$f$a$d$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LE7/Z$f$a$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
