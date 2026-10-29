.class final LE7/Z$f$a$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE7/Z$f$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, LE7/Z$f$a$b$a;->s:LE7/Z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LE7/Z$f$a$b$a;

    iget-object p0, p0, LE7/Z$f$a$b$a;->s:LE7/Z;

    invoke-direct {v0, p0, p2}, LE7/Z$f$a$b$a;-><init>(LE7/Z;Lm8/e;)V

    iput-object p1, v0, LE7/Z$f$a$b$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Lh8/o;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LE7/Z$f$a$b$a;->s(Lh8/o;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LE7/Z$f$a$b$a;->q:I

    if-nez v0, :cond_30

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LE7/Z$f$a$b$a;->r:Ljava/lang/Object;

    check-cast p1, Lh8/o;

    const-string v0, "WallpaperUIHelper"

    const-string v1, "wallpaper depth image load complete"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LE7/Z$f$a$b$a;->s:LE7/Z;

    invoke-virtual {p1}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/davemorrissey/labs/subscaleview/ImageSource;

    invoke-static {v0, p1}, LE7/Z;->k(LE7/Z;Lcom/davemorrissey/labs/subscaleview/ImageSource;)V

    iget-object p1, p0, LE7/Z$f$a$b$a;->s:LE7/Z;

    invoke-virtual {p1}, LE7/Z;->z()Landroid/graphics/Point;

    move-result-object p1

    if-eqz p1, :cond_2d

    iget-object p0, p0, LE7/Z$f$a$b$a;->s:LE7/Z;

    invoke-static {p0}, LE7/Z;->m(LE7/Z;)V

    :cond_2d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_30
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(Lh8/o;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LE7/Z$f$a$b$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LE7/Z$f$a$b$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LE7/Z$f$a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
