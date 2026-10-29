.class public final LJ7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ7/o;


# instance fields
.field private final a:Landroidx/lifecycle/Q;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:LO8/a;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/Q;)V
    .registers 4

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ7/a;->a:Landroidx/lifecycle/Q;

    const-string p1, "edit_widgets_json"

    iput-object p1, p0, LJ7/a;->b:Ljava/lang/String;

    const-string p1, "expand_widget"

    iput-object p1, p0, LJ7/a;->c:Ljava/lang/String;

    const/4 p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v1, p1, v0}, LO8/g;->b(ZILjava/lang/Object;)LO8/a;

    move-result-object p1

    iput-object p1, p0, LJ7/a;->d:LO8/a;

    return-void
.end method

.method public static final synthetic h(LJ7/a;)LO8/a;
    .registers 1

    iget-object p0, p0, LJ7/a;->d:LO8/a;

    return-object p0
.end method

.method public static final synthetic i(LJ7/a;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LJ7/a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic j(LJ7/a;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LJ7/a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic k(LJ7/a;)Landroidx/lifecycle/Q;
    .registers 1

    iget-object p0, p0, LJ7/a;->a:Landroidx/lifecycle/Q;

    return-object p0
.end method

.method public static final synthetic l(LJ7/a;LU5/a;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0, p1, p2}, LJ7/a;->m(LU5/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final m(LU5/a;Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, LJ7/a$f;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LJ7/a$f;

    iget v1, v0, LJ7/a$f;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LJ7/a$f;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, LJ7/a$f;

    invoke-direct {v0, p0, p2}, LJ7/a$f;-><init>(LJ7/a;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LJ7/a$f;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LJ7/a$f;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_35

    if-ne v2, v3, :cond_2d

    iget-object p0, v0, LJ7/a$f;->q:Ljava/lang/Object;

    check-cast p0, LJ7/a;

    :try_start_29
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V
    :try_end_2c
    .catchall {:try_start_29 .. :try_end_2c} :catchall_55

    goto :goto_45

    :cond_2d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_35
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    :try_start_38
    sget-object p2, Lh8/q;->r:Lh8/q$a;

    iput-object p0, v0, LJ7/a$f;->q:Ljava/lang/Object;

    iput v3, v0, LJ7/a$f;->t:I

    invoke-interface {p1, v0}, LU5/a;->h(Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_45

    return-object v1

    :cond_45
    :goto_45
    check-cast p2, Ljava/lang/String;

    iget-object p1, p0, LJ7/a;->a:Landroidx/lifecycle/Q;

    iget-object p0, p0, LJ7/a;->b:Ljava/lang/String;

    invoke-virtual {p1, p0, p2}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_54
    .catchall {:try_start_38 .. :try_end_54} :catchall_55

    goto :goto_60

    :catchall_55
    move-exception p0

    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_60
    invoke-static {p0}, Lh8/q;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_80

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "persistEditWidgetsToSavedState failed: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "WidgetEditCoordinator"

    invoke-static {p1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_80
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public a(LU5/a;)V
    .registers 4

    const-string v0, "repository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJ7/a;->a:Landroidx/lifecycle/Q;

    iget-object v1, p0, LJ7/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Q;->f(Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, LJ7/a;->a:Landroidx/lifecycle/Q;

    iget-object p0, p0, LJ7/a;->c:Ljava/lang/String;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/Q;->f(Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {p1}, LU5/a;->f()V

    return-void
.end method

.method public b(LF8/L;LU5/a;Z)V
    .registers 11

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, LJ7/a$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p2, p3, v0}, LJ7/a$c;-><init>(LJ7/a;LU5/a;ZLm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public c(LF8/L;LU5/a;)V
    .registers 10

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, LJ7/a$d;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p2, v0}, LJ7/a$d;-><init>(LJ7/a;LU5/a;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public d(LF8/L;LU5/a;)V
    .registers 10

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJ7/a;->a:Landroidx/lifecycle/Q;

    iget-object v1, p0, LJ7/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_1a

    invoke-interface {p2}, LU5/a;->z()V

    goto :goto_21

    :cond_1a
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {p2, v1}, LU5/a;->e(Z)V

    :goto_21
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "scheduleWidgetRestoreOnInit expand:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WidgetEditCoordinator"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LJ7/a;->a:Landroidx/lifecycle/Q;

    iget-object p0, p0, LJ7/a;->b:Ljava/lang/String;

    invoke-virtual {v0, p0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_59

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_4a

    goto :goto_59

    :cond_4a
    new-instance v4, LJ7/a$g;

    const/4 v0, 0x0

    invoke-direct {v4, p2, p0, v0}, LJ7/a$g;-><init>(LU5/a;Ljava/lang/String;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void

    :cond_59
    :goto_59
    invoke-interface {p2}, LU5/a;->f()V

    return-void
.end method

.method public e(LF8/L;LU5/a;Lh8/o;)V
    .registers 11

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, LJ7/a$a;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p2, p3, v0}, LJ7/a$a;-><init>(LJ7/a;LU5/a;Lh8/o;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public f(LF8/L;LU5/a;)V
    .registers 10

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, LJ7/a$e;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p2, v0}, LJ7/a$e;-><init>(LJ7/a;LU5/a;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public g(LF8/L;LU5/a;I)V
    .registers 11

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, LJ7/a$b;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p2, p3, v0}, LJ7/a$b;-><init>(LJ7/a;LU5/a;ILm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method
