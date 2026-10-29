.class final LW6/x$e$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW6/x$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:LW6/x;

.field final synthetic s:LJ6/i;


# direct methods
.method constructor <init>(LW6/x;LJ6/i;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LW6/x$e$a;->r:LW6/x;

    iput-object p2, p0, LW6/x$e$a;->s:LJ6/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, LW6/x$e$a;

    iget-object v0, p0, LW6/x$e$a;->r:LW6/x;

    iget-object p0, p0, LW6/x$e$a;->s:LJ6/i;

    invoke-direct {p1, v0, p0, p2}, LW6/x$e$a;-><init>(LW6/x;LJ6/i;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LW6/x$e$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LW6/x$e$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LW6/x$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LW6/x$e$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LW6/x$e$a;->q:I

    if-nez v0, :cond_24

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LW6/x$e$a;->r:LW6/x;

    invoke-virtual {p1}, Landroidx/fragment/app/q;->getActivity()Landroidx/fragment/app/v;

    move-result-object v1

    if-eqz v1, :cond_21

    iget-object v2, p0, LW6/x$e$a;->s:LJ6/i;

    sget-object v0, Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity;->T:Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity$a;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/nothing/wallpaper/picker/edit/container/EditWallpaperActivity$a;->c(Landroid/content/Context;Lg3/x;ZZZ)Landroid/content/Intent;

    move-result-object p0

    const/4 p1, 0x1

    invoke-virtual {v1, p0, p1}, Lb/j;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_21
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_24
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
