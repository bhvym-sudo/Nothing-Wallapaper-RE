.class final LP6/a$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP6/a$c;->d(Ljava/lang/Integer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:Ljava/lang/Object;

.field u:I

.field synthetic v:Z

.field final synthetic w:Lh3/c;

.field final synthetic x:LP6/a;

.field final synthetic y:Lg3/v;

.field final synthetic z:Landroid/app/WallpaperManager;


# direct methods
.method constructor <init>(Lh3/c;LP6/a;Lg3/v;Landroid/app/WallpaperManager;Lm8/e;)V
    .registers 6

    iput-object p1, p0, LP6/a$c$a;->w:Lh3/c;

    iput-object p2, p0, LP6/a$c$a;->x:LP6/a;

    iput-object p3, p0, LP6/a$c$a;->y:Lg3/v;

    iput-object p4, p0, LP6/a$c$a;->z:Landroid/app/WallpaperManager;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 9

    new-instance v0, LP6/a$c$a;

    iget-object v1, p0, LP6/a$c$a;->w:Lh3/c;

    iget-object v2, p0, LP6/a$c$a;->x:LP6/a;

    iget-object v3, p0, LP6/a$c$a;->y:Lg3/v;

    iget-object v4, p0, LP6/a$c$a;->z:Landroid/app/WallpaperManager;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LP6/a$c$a;-><init>(Lh3/c;LP6/a;Lg3/v;Landroid/app/WallpaperManager;Lm8/e;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    iput-boolean p0, v0, LP6/a$c$a;->v:Z

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LP6/a$c$a;->s(ZLm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 10

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LP6/a$c$a;->u:I

    const/4 v2, 0x1

    if-eqz v1, :cond_27

    if-ne v1, v2, :cond_1f

    iget-object v0, p0, LP6/a$c$a;->t:Ljava/lang/Object;

    check-cast v0, Landroid/app/WallpaperManager;

    iget-object v0, p0, LP6/a$c$a;->s:Ljava/lang/Object;

    check-cast v0, Lg3/v;

    iget-object v0, p0, LP6/a$c$a;->r:Ljava/lang/Object;

    check-cast v0, LP6/a;

    iget-object p0, p0, LP6/a$c$a;->q:Ljava/lang/Object;

    check-cast p0, Lh3/c;

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_1f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_27
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, LP6/a$c$a;->v:Z

    iget-object v1, p0, LP6/a$c$a;->w:Lh3/c;

    iget-object v3, p0, LP6/a$c$a;->x:LP6/a;

    iget-object v4, p0, LP6/a$c$a;->y:Lg3/v;

    iget-object v5, p0, LP6/a$c$a;->z:Landroid/app/WallpaperManager;

    iput-object v1, p0, LP6/a$c$a;->q:Ljava/lang/Object;

    iput-object v3, p0, LP6/a$c$a;->r:Ljava/lang/Object;

    iput-object v4, p0, LP6/a$c$a;->s:Ljava/lang/Object;

    iput-object v5, p0, LP6/a$c$a;->t:Ljava/lang/Object;

    iput-boolean p1, p0, LP6/a$c$a;->v:Z

    iput v2, p0, LP6/a$c$a;->u:I

    new-instance v6, LF8/n;

    invoke-static {p0}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v7

    invoke-direct {v6, v7, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v6}, LF8/n;->G()V

    invoke-static {v3}, LP6/a;->d(LP6/a;)Landroid/app/Activity;

    move-result-object v2

    new-instance v7, LP6/a$c$a$a;

    invoke-direct {v7, v3, v6, v4, v5}, LP6/a$c$a$a;-><init>(LP6/a;LF8/l;Lg3/v;Landroid/app/WallpaperManager;)V

    invoke-interface {v1, v2, p1, v7}, Lh3/c;->a(Landroid/content/Context;ZLh3/c$a;)V

    invoke-virtual {v6}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_65

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_65
    if-ne p1, v0, :cond_68

    return-object v0

    :cond_68
    return-object p1
.end method

.method public final s(ZLm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, LP6/a$c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LP6/a$c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LP6/a$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
