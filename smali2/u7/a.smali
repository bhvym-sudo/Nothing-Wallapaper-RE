.class public final Lu7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LF8/I;

.field private final c:LH3/q;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;LF8/I;LH3/q;)V
    .registers 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previewUtils"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu7/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lu7/a;->b:LF8/I;

    iput-object p3, p0, Lu7/a;->c:LH3/q;

    const-string p1, "IconPackProviderClient"

    iput-object p1, p0, Lu7/a;->d:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a(Lu7/a;)Landroid/content/Context;
    .registers 1

    iget-object p0, p0, Lu7/a;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic b(Lu7/a;)LH3/q;
    .registers 1

    iget-object p0, p0, Lu7/a;->c:LH3/q;

    return-object p0
.end method

.method public static final synthetic c(Lu7/a;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lu7/a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic d(Lu7/a;Lm8/e;)Ljava/lang/Object;
    .registers 2

    invoke-direct {p0, p1}, Lu7/a;->i(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final g(Landroid/net/Uri;)LI8/f;
    .registers 4

    new-instance v0, Lu7/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lu7/a$c;-><init>(Lu7/a;Landroid/net/Uri;Lm8/e;)V

    invoke-static {v0}, LI8/h;->e(Lv8/p;)LI8/f;

    move-result-object p0

    new-instance p1, Lu7/a$d;

    invoke-direct {p1, v1}, Lu7/a$d;-><init>(Lm8/e;)V

    invoke-static {p0, p1}, LI8/h;->I(LI8/f;Lv8/p;)LI8/f;

    move-result-object p0

    return-object p0
.end method

.method private final i(Lm8/e;)Ljava/lang/Object;
    .registers 5

    iget-object v0, p0, Lu7/a;->b:LF8/I;

    new-instance v1, Lu7/a$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lu7/a$f;-><init>(Lu7/a;Lm8/e;)V

    invoke-static {v0, v1, p1}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e(Lu7/c;Lm8/e;)Ljava/lang/Object;
    .registers 8

    instance-of v0, p2, Lu7/a$a;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, Lu7/a$a;

    iget v1, v0, Lu7/a$a;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lu7/a$a;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, Lu7/a$a;

    invoke-direct {v0, p0, p2}, Lu7/a$a;-><init>(Lu7/a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, Lu7/a$a;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lu7/a$a;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_35

    if-ne v2, v3, :cond_2d

    iget-object p0, v0, Lu7/a$a;->q:Ljava/lang/Object;

    check-cast p0, Lu7/a;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4b

    :cond_2d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_35
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lu7/a;->b:LF8/I;

    new-instance v2, Lu7/a$b;

    const/4 v4, 0x0

    invoke-direct {v2, p1, p0, v4}, Lu7/a$b;-><init>(Lu7/c;Lu7/a;Lm8/e;)V

    iput-object p0, v0, Lu7/a$a;->q:Ljava/lang/Object;

    iput v3, v0, Lu7/a$a;->t:I

    invoke-static {p2, v2, v0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4b

    return-object v1

    :cond_4b
    :goto_4b
    check-cast p2, Landroid/graphics/drawable/Drawable;

    if-nez p2, :cond_68

    iget-object p1, p0, Lu7/a;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iget-object p0, p0, Lu7/a;->a:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    const p2, 0x7f080187

    invoke-virtual {p1, p2, p0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    const-string p1, "getDrawable(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_68
    return-object p2
.end method

.method public final f()Z
    .registers 2

    :try_start_0
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    iget-object p0, p0, Lu7/a;->c:LH3/q;

    const-string v0, "default_icon_pack"

    invoke-virtual {p0, v0}, LH3/q;->e(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_e
    .catchall {:try_start_0 .. :try_end_e} :catchall_f

    goto :goto_1a

    :catchall_f
    move-exception p0

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_1a
    invoke-static {p0}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    const/4 p0, 0x0

    :cond_21
    if-eqz p0, :cond_25

    const/4 p0, 0x1

    goto :goto_26

    :cond_25
    const/4 p0, 0x0

    :goto_26
    return p0
.end method

.method public final h()LI8/f;
    .registers 3

    iget-object v0, p0, Lu7/a;->c:LH3/q;

    const-string v1, "default_icon_pack"

    invoke-virtual {v0, v1}, LH3/q;->e(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_c

    const/4 p0, 0x0

    return-object p0

    :cond_c
    invoke-direct {p0, v0}, Lu7/a;->g(Landroid/net/Uri;)LI8/f;

    move-result-object v0

    new-instance v1, Lu7/a$e;

    invoke-direct {v1, v0, p0}, Lu7/a$e;-><init>(LI8/f;Lu7/a;)V

    invoke-static {v1}, LI8/h;->o(LI8/f;)LI8/f;

    move-result-object p0

    return-object p0
.end method
