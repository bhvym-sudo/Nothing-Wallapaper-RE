.class final Lj7/j$g$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field final synthetic r:Lj7/j;

.field final synthetic s:Ljava/lang/String;

.field final synthetic t:Landroid/app/WallpaperColors;


# direct methods
.method constructor <init>(Lj7/j;Ljava/lang/String;Landroid/app/WallpaperColors;Lm8/e;)V
    .registers 5

    iput-object p1, p0, Lj7/j$g$a;->r:Lj7/j;

    iput-object p2, p0, Lj7/j$g$a;->s:Ljava/lang/String;

    iput-object p3, p0, Lj7/j$g$a;->t:Landroid/app/WallpaperColors;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance p1, Lj7/j$g$a;

    iget-object v0, p0, Lj7/j$g$a;->r:Lj7/j;

    iget-object v1, p0, Lj7/j$g$a;->s:Ljava/lang/String;

    iget-object p0, p0, Lj7/j$g$a;->t:Landroid/app/WallpaperColors;

    invoke-direct {p1, v0, v1, p0, p2}, Lj7/j$g$a;-><init>(Lj7/j;Ljava/lang/String;Landroid/app/WallpaperColors;Lm8/e;)V

    return-object p1
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, Lj7/j$g$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lj7/j$g$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lj7/j$g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lj7/j$g$a;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Lj7/j$g$a;->q:I

    if-nez v0, :cond_21

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lj7/j$g$a;->r:Lj7/j;

    invoke-static {p1}, Lj7/j;->r(Lj7/j;)LA6/c;

    move-result-object p1

    if-eqz p1, :cond_1f

    iget-object v0, p0, Lj7/j$g$a;->s:Ljava/lang/String;

    iget-object p0, p0, Lj7/j$g$a;->t:Landroid/app/WallpaperColors;

    invoke-virtual {p1, v0, p0}, LA6/c;->t0(Ljava/lang/String;Landroid/app/WallpaperColors;)Z

    move-result p0

    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_1f
    const/4 p0, 0x0

    return-object p0

    :cond_21
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
