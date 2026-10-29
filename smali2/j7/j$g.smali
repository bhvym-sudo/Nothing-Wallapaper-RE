.class final Lj7/j$g;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j;->B0(ILjava/lang/String;Landroid/app/WallpaperColors;Ljava/util/List;ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lj7/j;

.field final synthetic s:Ljava/lang/String;

.field final synthetic t:I

.field final synthetic u:I

.field final synthetic v:Landroid/app/WallpaperColors;


# direct methods
.method constructor <init>(Lj7/j;Ljava/lang/String;IILandroid/app/WallpaperColors;Lm8/e;)V
    .registers 7

    iput-object p1, p0, Lj7/j$g;->r:Lj7/j;

    iput-object p2, p0, Lj7/j$g;->s:Ljava/lang/String;

    iput p3, p0, Lj7/j$g;->t:I

    iput p4, p0, Lj7/j$g;->u:I

    iput-object p5, p0, Lj7/j$g;->v:Landroid/app/WallpaperColors;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 10

    new-instance v0, Lj7/j$g;

    iget-object v1, p0, Lj7/j$g;->r:Lj7/j;

    iget-object v2, p0, Lj7/j$g;->s:Ljava/lang/String;

    iget v3, p0, Lj7/j$g;->t:I

    iget v4, p0, Lj7/j$g;->u:I

    iget-object v5, p0, Lj7/j$g;->v:Landroid/app/WallpaperColors;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lj7/j$g;-><init>(Lj7/j;Ljava/lang/String;IILandroid/app/WallpaperColors;Lm8/e;)V

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lj7/j$g;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lj7/j$g;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lj7/j$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lj7/j$g;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lj7/j$g;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_33

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object p1

    new-instance v1, Lj7/j$g$a;

    iget-object v3, p0, Lj7/j$g;->r:Lj7/j;

    iget-object v4, p0, Lj7/j$g;->s:Ljava/lang/String;

    iget-object v5, p0, Lj7/j$g;->v:Landroid/app/WallpaperColors;

    const/4 v6, 0x0

    invoke-direct {v1, v3, v4, v5, v6}, Lj7/j$g$a;-><init>(Lj7/j;Ljava/lang/String;Landroid/app/WallpaperColors;Lm8/e;)V

    iput v2, p0, Lj7/j$g;->q:I

    invoke-static {p1, v1, p0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_33

    return-object v0

    :cond_33
    :goto_33
    check-cast p1, Ljava/lang/Boolean;

    iget-object v0, p0, Lj7/j$g;->r:Lj7/j;

    invoke-static {v0}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object v0

    iget-object v1, p0, Lj7/j$g;->s:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "notify blur success:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " for path "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->g(Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6e

    iget-object p0, p0, Lj7/j$g;->r:Lj7/j;

    invoke-static {p0}, Lj7/j;->L(Lj7/j;)V

    goto :goto_77

    :cond_6e
    iget-object p1, p0, Lj7/j$g;->r:Lj7/j;

    iget v0, p0, Lj7/j$g;->t:I

    iget p0, p0, Lj7/j$g;->u:I

    invoke-static {p1, v0, p0}, Lj7/j;->G(Lj7/j;II)V

    :goto_77
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
