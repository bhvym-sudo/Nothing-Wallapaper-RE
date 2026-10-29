.class public abstract Lo7/b;
.super Landroidx/lifecycle/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo7/b$a;
    }
.end annotation


# static fields
.field public static final i:Lo7/b$a;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lg3/x;

.field private final d:LI8/z;

.field private final e:LI8/z;

.field private final f:Landroidx/lifecycle/H;

.field private final g:Landroidx/lifecycle/C;

.field private h:LF8/x0;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lo7/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo7/b$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lo7/b;->i:Lo7/b$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lg3/x;)V
    .registers 6

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/a0;-><init>()V

    iput-object p1, p0, Lo7/b;->b:Landroid/content/Context;

    iput-object p2, p0, Lo7/b;->c:Lg3/x;

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p1, p2, v0, v1, v0}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object v2

    iput-object v2, p0, Lo7/b;->d:LI8/z;

    invoke-static {p1, p2, v0, v1, v0}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object p1

    iput-object p1, p0, Lo7/b;->e:LI8/z;

    new-instance p1, Landroidx/lifecycle/H;

    sget-object p2, Lm7/a$b;->a:Lm7/a$b;

    invoke-direct {p1, p2}, Landroidx/lifecycle/H;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lo7/b;->f:Landroidx/lifecycle/H;

    iput-object p1, p0, Lo7/b;->g:Landroidx/lifecycle/C;

    invoke-direct {p0}, Lo7/b;->m()V

    return-void
.end method

.method public static synthetic e(Li3/D0$a;Ljava/lang/CharSequence;Landroid/content/Intent;)V
    .registers 3

    invoke-static {p0, p1, p2}, Lo7/b;->p(Li3/D0$a;Ljava/lang/CharSequence;Landroid/content/Intent;)V

    return-void
.end method

.method private final m()V
    .registers 7

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v1

    new-instance v3, Lo7/b$b;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lo7/b$b;-><init>(Lo7/b;Lm8/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method private static final p(Li3/D0$a;Ljava/lang/CharSequence;Landroid/content/Intent;)V
    .registers 3

    invoke-interface {p0, p1, p2}, Li3/D0$a;->a(Ljava/lang/CharSequence;Landroid/content/Intent;)V

    return-void
.end method

.method private final r()V
    .registers 8

    iget-object v0, p0, Lo7/b;->h:LF8/x0;

    if-eqz v0, :cond_12

    invoke-interface {v0}, LF8/x0;->O0()Z

    move-result v0

    if-nez v0, :cond_12

    const-string p0, "BaseCropWallpaperViewModel"

    const-string v0, "onExploreClicked already downloading!"

    invoke-static {p0, v0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_12
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v2

    new-instance v4, Lo7/b$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Lo7/b$c;-><init>(Lo7/b;Lm8/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object v0

    iput-object v0, p0, Lo7/b;->h:LF8/x0;

    return-void
.end method


# virtual methods
.method public final f()Landroid/content/Context;
    .registers 1

    iget-object p0, p0, Lo7/b;->b:Landroid/content/Context;

    return-object p0
.end method

.method public final g(Landroid/content/Context;)Ljava/util/List;
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lo7/b;->c:Lg3/x;

    invoke-virtual {p0, p1}, Lg3/x;->e(Landroid/content/Context;)Ljava/util/List;

    move-result-object p0

    const-string p1, "getAttributions(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final h()Landroidx/lifecycle/C;
    .registers 1

    iget-object p0, p0, Lo7/b;->g:Landroidx/lifecycle/C;

    return-object p0
.end method

.method protected final i()Landroidx/lifecycle/H;
    .registers 1

    iget-object p0, p0, Lo7/b;->f:Landroidx/lifecycle/H;

    return-object p0
.end method

.method public final j()Lg3/x;
    .registers 1

    iget-object p0, p0, Lo7/b;->c:Lg3/x;

    return-object p0
.end method

.method public abstract k()LI8/f;
.end method

.method public final l()LI8/z;
    .registers 1

    iget-object p0, p0, Lo7/b;->e:LI8/z;

    return-object p0
.end method

.method public final n()LI8/z;
    .registers 1

    iget-object p0, p0, Lo7/b;->d:LI8/z;

    return-object p0
.end method

.method public final o(Landroid/content/Context;Li3/D0$a;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lo7/b;->c:Lg3/x;

    new-instance v0, Lo7/a;

    invoke-direct {v0, p2}, Lo7/a;-><init>(Li3/D0$a;)V

    invoke-static {p1, p0, v0}, Li3/D0;->b(Landroid/content/Context;Lg3/x;Li3/D0$a;)V

    return-void
.end method

.method public final q(Landroid/content/Intent;Ljava/lang/CharSequence;)V
    .registers 10

    iget-object v0, p0, Lo7/b;->c:Lg3/x;

    iget-object v1, p0, Lo7/b;->b:Landroid/content/Context;

    invoke-static {v0, v1}, LG6/e;->o(Lg3/x;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_17

    if-eqz p2, :cond_17

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-nez p2, :cond_13

    goto :goto_17

    :cond_13
    invoke-direct {p0}, Lo7/b;->r()V

    return-void

    :cond_17
    :goto_17
    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p2

    if-eqz p2, :cond_28

    iget-object v0, p0, Lo7/b;->b:Landroid/content/Context;

    invoke-interface {p2, v0}, Lh3/H;->q(Landroid/content/Context;)Lh3/S;

    move-result-object p2

    if-eqz p2, :cond_28

    invoke-interface {p2}, Lh3/S;->b()V

    :cond_28
    if-eqz p1, :cond_3b

    const/high16 p2, 0x10000000

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    sget-object v0, Li6/a;->a:Li6/a;

    iget-object v1, p0, Lo7/b;->b:Landroid/content/Context;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    move-object v2, p1

    invoke-static/range {v0 .. v6}, Li6/a;->b(Li6/a;Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;IILjava/lang/Object;)Z

    :cond_3b
    return-void
.end method

.method public final s(Z)V
    .registers 8

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v1

    new-instance v3, Lo7/b$d;

    const/4 v2, 0x0

    invoke-direct {v3, p0, p1, v2}, Lo7/b$d;-><init>(Lo7/b;ZLm8/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final t(Landroid/content/Intent;Ljava/lang/CharSequence;)Z
    .registers 5

    iget-object v0, p0, Lo7/b;->c:Lg3/x;

    iget-object v1, p0, Lo7/b;->b:Landroid/content/Context;

    invoke-static {v0, v1}, LG6/e;->o(Lg3/x;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_15

    if-eqz p2, :cond_15

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-nez p2, :cond_13

    goto :goto_15

    :cond_13
    const/4 p0, 0x1

    return p0

    :cond_15
    :goto_15
    iget-object p0, p0, Lo7/b;->b:Landroid/content/Context;

    invoke-static {p0, p1}, Li3/D0;->c(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result p0

    return p0
.end method

.method public final u()Z
    .registers 2

    iget-object v0, p0, Lo7/b;->c:Lg3/x;

    invoke-virtual {v0}, Lg3/x;->q()Landroid/app/WallpaperInfo;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Landroid/app/WallpaperInfo;->getShowMetadataInPreview()Z

    move-result v0

    if-nez v0, :cond_1b

    iget-object v0, p0, Lo7/b;->c:Lg3/x;

    iget-object p0, p0, Lo7/b;->b:Landroid/content/Context;

    invoke-static {v0, p0}, LG6/e;->o(Lg3/x;Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_19

    goto :goto_1b

    :cond_19
    const/4 p0, 0x0

    return p0

    :cond_1b
    :goto_1b
    const/4 p0, 0x1

    return p0
.end method

.method public v()V
    .registers 1

    return-void
.end method
