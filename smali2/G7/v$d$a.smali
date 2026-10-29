.class final LG7/v$d$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/v$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lg3/v;

.field final synthetic s:Landroid/app/WallpaperColors;


# direct methods
.method constructor <init>(Lg3/v;Landroid/app/WallpaperColors;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LG7/v$d$a;->r:Lg3/v;

    iput-object p2, p0, LG7/v$d$a;->s:Landroid/app/WallpaperColors;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance p1, LG7/v$d$a;

    iget-object v0, p0, LG7/v$d$a;->r:Lg3/v;

    iget-object p0, p0, LG7/v$d$a;->s:Landroid/app/WallpaperColors;

    invoke-direct {p1, v0, p0, p2}, LG7/v$d$a;-><init>(Lg3/v;Landroid/app/WallpaperColors;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LG7/v$d$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LG7/v$d$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LG7/v$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LG7/v$d$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, LG7/v$d$a;->q:I

    if-nez v0, :cond_14

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LG7/v$d$a;->r:Lg3/v;

    iget-object p0, p0, LG7/v$d$a;->s:Landroid/app/WallpaperColors;

    invoke-virtual {p1, p0}, Lg3/v;->j(Landroid/app/WallpaperColors;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_14
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
