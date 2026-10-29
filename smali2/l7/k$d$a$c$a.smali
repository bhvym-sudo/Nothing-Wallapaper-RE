.class final Ll7/k$d$a$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll7/k$d$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:Ll7/k;


# direct methods
.method constructor <init>(Ll7/k;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Ll7/k$d$a$c$a;->s:Ll7/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, Ll7/k$d$a$c$a;

    iget-object p0, p0, Ll7/k$d$a$c$a;->s:Ll7/k;

    invoke-direct {v0, p0, p2}, Ll7/k$d$a$c$a;-><init>(Ll7/k;Lm8/e;)V

    iput-object p1, v0, Ll7/k$d$a$c$a;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Landroid/app/WallpaperColors;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Ll7/k$d$a$c$a;->s(Landroid/app/WallpaperColors;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    iget v0, p0, Ll7/k$d$a$c$a;->q:I

    if-nez v0, :cond_25

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ll7/k$d$a$c$a;->r:Ljava/lang/Object;

    check-cast p1, Landroid/app/WallpaperColors;

    iget-object v0, p0, Ll7/k$d$a$c$a;->s:Ll7/k;

    invoke-static {p1}, LG6/h;->g(Landroid/app/WallpaperColors;)Z

    move-result v1

    invoke-virtual {v0, v1}, Ll7/k;->a1(Z)V

    iget-object p0, p0, Ll7/k$d$a$c$a;->s:Ll7/k;

    invoke-static {p1}, LG6/h;->h(Landroid/app/WallpaperColors;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p0, p1}, Ll7/k;->s0(Ll7/k;Z)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_25
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final s(Landroid/app/WallpaperColors;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, Ll7/k$d$a$c$a;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Ll7/k$d$a$c$a;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Ll7/k$d$a$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
