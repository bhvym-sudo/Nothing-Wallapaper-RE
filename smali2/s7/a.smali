.class public final Ls7/a;
.super Landroidx/lifecycle/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls7/a$b;
    }
.end annotation


# static fields
.field public static final m:Ls7/a$b;


# instance fields
.field private final c:Landroid/app/Application;

.field private final d:Landroidx/lifecycle/Q;

.field private final e:LK6/c;

.field private final f:Lh3/c;

.field private final g:LI8/O;

.field private final h:LI8/z;

.field private final i:LI8/E;

.field private j:Z

.field private k:Z

.field private l:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Ls7/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls7/a$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Ls7/a;->m:Ls7/a$b;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Landroidx/lifecycle/Q;)V
    .registers 12

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/lifecycle/b;-><init>(Landroid/app/Application;)V

    iput-object p1, p0, Ls7/a;->c:Landroid/app/Application;

    iput-object p2, p0, Ls7/a;->d:Landroidx/lifecycle/Q;

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.nothing.wallpaper.module.NTPickerInjector"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LK6/c;

    iput-object v0, p0, Ls7/a;->e:LK6/c;

    invoke-virtual {v0, p1}, Lh3/V;->k(Landroid/content/Context;)Lh3/c;

    move-result-object p1

    iput-object p1, p0, Ls7/a;->f:Lh3/c;

    const-string p1, "ui_state"

    sget-object v0, Lp7/c$c;->t:Lp7/c$c;

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object p1

    iput-object p1, p0, Ls7/a;->g:LI8/O;

    const/4 p1, 0x6

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p1, v2}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object p1

    iput-object p1, p0, Ls7/a;->h:LI8/z;

    invoke-static {p1}, LI8/h;->a(LI8/z;)LI8/E;

    move-result-object p1

    iput-object p1, p0, Ls7/a;->i:LI8/E;

    const-string p1, "select_live"

    invoke-virtual {p2, p1}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_4c

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_4c
    iput-boolean v1, p0, Ls7/a;->j:Z

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v3

    new-instance v6, Ls7/a$a;

    invoke-direct {v6, p0, v2}, Ls7/a$a;-><init>(Ls7/a;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public static final synthetic f(Ls7/a;)Landroid/app/Application;
    .registers 1

    iget-object p0, p0, Ls7/a;->c:Landroid/app/Application;

    return-object p0
.end method

.method public static final synthetic g(Ls7/a;)Landroidx/lifecycle/Q;
    .registers 1

    iget-object p0, p0, Ls7/a;->d:Landroidx/lifecycle/Q;

    return-object p0
.end method

.method public static final synthetic h(Ls7/a;)Lh3/c;
    .registers 1

    iget-object p0, p0, Ls7/a;->f:Lh3/c;

    return-object p0
.end method

.method public static final synthetic i(Ls7/a;)LI8/z;
    .registers 1

    iget-object p0, p0, Ls7/a;->h:LI8/z;

    return-object p0
.end method

.method public static final synthetic j(Ls7/a;Z)V
    .registers 2

    iput-boolean p1, p0, Ls7/a;->k:Z

    return-void
.end method

.method private final v(Lg3/x;)V
    .registers 8

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    new-instance v3, Ls7/a$d;

    const/4 v1, 0x0

    invoke-direct {v3, p1, p0, v1}, Ls7/a$d;-><init>(Lg3/x;Ls7/a;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method


# virtual methods
.method public final k()V
    .registers 3

    iget-object v0, p0, Ls7/a;->d:Landroidx/lifecycle/Q;

    iget-object p0, p0, Ls7/a;->g:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lp7/c;

    invoke-virtual {p0}, Lp7/c;->a()Lp7/c;

    move-result-object p0

    const-string v1, "ui_state"

    invoke-virtual {v0, v1, p0}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final l()V
    .registers 3

    iget-object v0, p0, Ls7/a;->d:Landroidx/lifecycle/Q;

    iget-object p0, p0, Ls7/a;->g:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lp7/c;

    invoke-virtual {p0}, Lp7/c;->b()Lp7/c;

    move-result-object p0

    const-string v1, "ui_state"

    invoke-virtual {v0, v1, p0}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final m()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Ls7/a;->l:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public final n(ZLm8/e;)Ljava/lang/Object;
    .registers 7

    new-instance v0, LF8/n;

    invoke-static {p2}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v0}, LF8/n;->G()V

    invoke-static {p0}, Ls7/a;->h(Ls7/a;)Lh3/c;

    move-result-object v1

    invoke-static {p0}, Ls7/a;->f(Ls7/a;)Landroid/app/Application;

    move-result-object v2

    new-instance v3, Ls7/a$c;

    invoke-direct {v3, p0, v0}, Ls7/a$c;-><init>(Ls7/a;LF8/l;)V

    invoke-interface {v1, v2, p1, v3}, Lh3/c;->a(Landroid/content/Context;ZLh3/c$a;)V

    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2a

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_2a
    return-object p0
.end method

.method public final o()Lh8/o;
    .registers 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ls7/a;->t()Z

    move-result v1

    if-eqz v1, :cond_10

    sget-object v1, Lk7/a;->q:Lk7/a;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_10
    invoke-virtual {p0}, Ls7/a;->s()Z

    move-result v1

    if-eqz v1, :cond_1b

    sget-object v1, Lk7/a;->r:Lk7/a;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1b
    iget-object p0, p0, Ls7/a;->g:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lp7/c;

    invoke-virtual {p0}, Lp7/c;->j()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {v0, p0}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p0

    return-object p0
.end method

.method public final p()LI8/E;
    .registers 1

    iget-object p0, p0, Ls7/a;->i:LI8/E;

    return-object p0
.end method

.method public final q()LI8/O;
    .registers 1

    iget-object p0, p0, Ls7/a;->g:LI8/O;

    return-object p0
.end method

.method public final r(Lg3/x;Lp7/a;Ljava/util/Set;)V
    .registers 10

    const-string v0, "wallpaper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "from"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "effects"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls7/a;->d:Landroidx/lifecycle/Q;

    const-string v1, "select_live"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Q;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-virtual {p0}, Ls7/a;->w()V

    return-void

    :cond_1d
    sget-object v0, Lk7/a;->r:Lk7/a;

    invoke-interface {p3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    sget-object v2, Lk7/a;->q:Lk7/a;

    invoke-interface {p3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p3

    invoke-static {p1}, LG6/e;->s(Lg3/x;)Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    iput-boolean v2, p0, Ls7/a;->j:Z

    iget-object v4, p0, Ls7/a;->d:Landroidx/lifecycle/Q;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Ls7/a;->v(Lg3/x;)V

    iget-boolean p1, p0, Ls7/a;->j:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_4a

    invoke-static {}, Lc3/a;->b()Z

    move-result p1

    if-nez p1, :cond_4a

    move p1, v3

    goto :goto_4b

    :cond_4a
    move p1, v1

    :goto_4b
    iget-object p0, p0, Ls7/a;->d:Landroidx/lifecycle/Q;

    sget-object v2, Lp7/c;->s:Lp7/c$a;

    sget-object v4, Lp7/a$c;->b:Lp7/a$c$a;

    invoke-virtual {v4}, Lp7/a$c$a;->b()Lp7/a$c;

    move-result-object v5

    invoke-static {p2, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_68

    sget-object v5, Lp7/a$a;->b:Lp7/a$a;

    invoke-static {p2, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_68

    if-eqz p1, :cond_66

    goto :goto_68

    :cond_66
    move v5, v1

    goto :goto_69

    :cond_68
    :goto_68
    move v5, v3

    :goto_69
    invoke-virtual {v4}, Lp7/a$c$a;->a()Lp7/a$c;

    move-result-object v4

    invoke-static {p2, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7f

    sget-object v4, Lp7/a$a;->b:Lp7/a$a;

    invoke-static {p2, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7f

    if-eqz p1, :cond_7e

    goto :goto_7f

    :cond_7e
    move v3, v1

    :cond_7f
    :goto_7f
    invoke-virtual {v2, v0, p3, v5, v3}, Lp7/c$a;->a(ZZZZ)Lp7/c;

    move-result-object p1

    const-string p2, "ui_state"

    invoke-virtual {p0, p2, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final s()Z
    .registers 1

    iget-object p0, p0, Ls7/a;->g:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lp7/c;

    invoke-virtual {p0}, Lp7/c;->f()Z

    move-result p0

    return p0
.end method

.method public final t()Z
    .registers 1

    iget-object p0, p0, Ls7/a;->g:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lp7/c;

    invoke-virtual {p0}, Lp7/c;->g()Z

    move-result p0

    return p0
.end method

.method public final u()Z
    .registers 2

    iget-object p0, p0, Ls7/a;->g:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lp7/c$b;

    if-eqz v0, :cond_d

    check-cast p0, Lp7/c$b;

    goto :goto_e

    :cond_d
    const/4 p0, 0x0

    :goto_e
    if-eqz p0, :cond_15

    invoke-virtual {p0}, Lp7/c$b;->m()Z

    move-result p0

    return p0

    :cond_15
    const/4 p0, 0x1

    return p0
.end method

.method public final w()V
    .registers 9

    iget-object v0, p0, Ls7/a;->g:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp7/c;

    instance-of v1, v0, Lp7/c$b;

    if-eqz v1, :cond_21

    iget-object p0, p0, Ls7/a;->d:Landroidx/lifecycle/Q;

    move-object v1, v0

    check-cast v1, Lp7/c$b;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lp7/c$b;->l(Lp7/c$b;ZIZZILjava/lang/Object;)Lp7/c$b;

    move-result-object v0

    const-string v1, "ui_state"

    invoke-virtual {p0, v1, v0}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_21
    return-void
.end method

.method public final x(Z)V
    .registers 7

    iget-object v0, p0, Ls7/a;->g:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp7/c;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_3e

    invoke-virtual {v0}, Lp7/c;->e()Z

    move-result p1

    xor-int/lit8 v3, p1, 0x1

    invoke-static {}, Lc3/a;->b()Z

    move-result v4

    if-nez v4, :cond_20

    iget-boolean v4, p0, Ls7/a;->j:Z

    if-eqz v4, :cond_20

    if-nez p1, :cond_20

    move v1, v2

    goto :goto_31

    :cond_20
    invoke-static {}, Lc3/a;->b()Z

    move-result v2

    if-nez v2, :cond_2d

    iget-boolean v2, p0, Ls7/a;->k:Z

    if-eqz v2, :cond_2d

    if-eqz p1, :cond_2d

    goto :goto_31

    :cond_2d
    invoke-virtual {v0}, Lp7/c;->d()Z

    move-result v1

    :goto_31
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p1, v1}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p1

    goto :goto_6f

    :cond_3e
    invoke-virtual {v0}, Lp7/c;->d()Z

    move-result p1

    xor-int/lit8 v3, p1, 0x1

    invoke-static {}, Lc3/a;->b()Z

    move-result v4

    if-nez v4, :cond_51

    iget-boolean v4, p0, Ls7/a;->j:Z

    if-eqz v4, :cond_51

    if-eqz p1, :cond_51

    goto :goto_63

    :cond_51
    invoke-static {}, Lc3/a;->b()Z

    move-result v1

    if-nez v1, :cond_5f

    iget-boolean v1, p0, Ls7/a;->k:Z

    if-eqz v1, :cond_5f

    if-nez p1, :cond_5f

    move v1, v2

    goto :goto_63

    :cond_5f
    invoke-virtual {v0}, Lp7/c;->e()Z

    move-result v1

    :goto_63
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {p1, v1}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p1

    :goto_6f
    invoke-virtual {p1}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {p1}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object p0, p0, Ls7/a;->d:Landroidx/lifecycle/Q;

    const-string v2, "ui_state"

    invoke-virtual {v0, v1, p1}, Lp7/c;->c(ZZ)Lp7/c;

    move-result-object p1

    invoke-virtual {p0, v2, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final y(Landroid/graphics/Bitmap;)V
    .registers 2

    iput-object p1, p0, Ls7/a;->l:Landroid/graphics/Bitmap;

    return-void
.end method
