.class final LE7/Z$f$a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE7/Z$f$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:LE7/Z;


# direct methods
.method constructor <init>(LE7/Z;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LE7/Z$f$a$a$a;->s:LE7/Z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LE7/Z$f$a$a$a;

    iget-object p0, p0, LE7/Z$f$a$a$a;->s:LE7/Z;

    invoke-direct {v0, p0, p2}, LE7/Z$f$a$a$a;-><init>(LE7/Z;Lm8/e;)V

    iput-object p1, v0, LE7/Z$f$a$a$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lh8/u;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LE7/Z$f$a$a$a;->s(Lh8/u;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LE7/Z$f$a$a$a;->q:I

    if-nez v0, :cond_41

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LE7/Z$f$a$a$a;->r:Ljava/lang/Object;

    check-cast p1, Lh8/u;

    const-string v0, "WallpaperUIHelper"

    const-string v1, "wallpaper image load complete"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LE7/Z$f$a$a$a;->s:LE7/Z;

    invoke-virtual {p1}, Lh8/u;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/davemorrissey/labs/subscaleview/ImageSource;

    invoke-virtual {p1}, Lh8/u;->f()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Point;

    invoke-static {v0, v1, v2}, LE7/Z;->n(LE7/Z;Lcom/davemorrissey/labs/subscaleview/ImageSource;Landroid/graphics/Point;)V

    iget-object v0, p0, LE7/Z$f$a$a$a;->s:LE7/Z;

    invoke-virtual {p1}, Lh8/u;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {v0, p1}, LE7/Z;->p(LE7/Z;Landroid/graphics/Bitmap;)V

    iget-object p1, p0, LE7/Z$f$a$a$a;->s:LE7/Z;

    invoke-static {p1}, LE7/Z;->h(LE7/Z;)Lcom/davemorrissey/labs/subscaleview/ImageSource;

    move-result-object p1

    if-eqz p1, :cond_3e

    iget-object p0, p0, LE7/Z$f$a$a$a;->s:LE7/Z;

    invoke-static {p0}, LE7/Z;->m(LE7/Z;)V

    :cond_3e
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_41
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(Lh8/u;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LE7/Z$f$a$a$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LE7/Z$f$a$a$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LE7/Z$f$a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
