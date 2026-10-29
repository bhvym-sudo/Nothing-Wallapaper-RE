.class public final LJ7/b;
.super Landroidx/lifecycle/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ7/b$a;
    }
.end annotation


# static fields
.field public static final j:LJ7/b$a;


# instance fields
.field private final b:Landroidx/lifecycle/Q;

.field private c:F

.field private d:Z

.field private final e:LI8/A;

.field private f:Lz7/a;

.field private g:Z

.field private final h:LI8/O;

.field private final i:LI8/O;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LJ7/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ7/b$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LJ7/b;->j:LJ7/b$a;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/Q;)V
    .registers 5

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/a0;-><init>()V

    iput-object p1, p0, LJ7/b;->b:Landroidx/lifecycle/Q;

    const-string v0, "lock_screen_tran_x"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    if-eqz v0, :cond_19

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_1a

    :cond_19
    const/4 v0, 0x0

    :goto_1a
    iput v0, p0, LJ7/b;->c:F

    const-string v0, "lock_screen_show"

    invoke-virtual {p1, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-eqz v0, :cond_2c

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_2d

    :cond_2c
    move v0, v1

    :goto_2d
    iput-boolean v0, p0, LJ7/b;->d:Z

    const/4 v0, 0x0

    invoke-static {v0}, LI8/Q;->a(Ljava/lang/Object;)LI8/A;

    move-result-object v2

    iput-object v2, p0, LJ7/b;->e:LI8/A;

    const-string v2, "animation_params"

    invoke-virtual {p1, v2}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz7/a;

    iput-object v2, p0, LJ7/b;->f:Lz7/a;

    const-string v2, "key_start_from_lock"

    invoke-virtual {p1, v2}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_4e

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_4e
    iput-boolean v1, p0, LJ7/b;->g:Z

    const-string v1, "key_ui_state"

    sget-object v2, LJ7/n$b;->q:LJ7/n$b;

    invoke-virtual {p1, v1, v2}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object v1

    iput-object v1, p0, LJ7/b;->h:LI8/O;

    const-string v1, "selector_fragment_show"

    invoke-virtual {p1, v1, v0}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object p1

    iput-object p1, p0, LJ7/b;->i:LI8/O;

    return-void
.end method

.method private final e(LJ7/n;)V
    .registers 3

    iget-object p0, p0, LJ7/b;->b:Landroidx/lifecycle/Q;

    const-string v0, "key_ui_state"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final f()V
    .registers 2

    sget-object v0, LJ7/n$b;->q:LJ7/n$b;

    invoke-direct {p0, v0}, LJ7/b;->e(LJ7/n;)V

    return-void
.end method

.method public final g()Lz7/a;
    .registers 1

    iget-object p0, p0, LJ7/b;->f:Lz7/a;

    return-object p0
.end method

.method public final h()F
    .registers 1

    iget p0, p0, LJ7/b;->c:F

    return p0
.end method

.method public final i()Z
    .registers 1

    iget-boolean p0, p0, LJ7/b;->d:Z

    return p0
.end method

.method public final j()LI8/A;
    .registers 1

    iget-object p0, p0, LJ7/b;->e:LI8/A;

    return-object p0
.end method

.method public final k()LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/b;->i:LI8/O;

    return-object p0
.end method

.method public final l()Z
    .registers 1

    iget-boolean p0, p0, LJ7/b;->g:Z

    return p0
.end method

.method public final m()LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/b;->h:LI8/O;

    return-object p0
.end method

.method public final n(Ljava/lang/String;Z)V
    .registers 4

    const-string v0, "destinationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, LJ7/b;->y(Z)V

    const-string p2, "custom_widget"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_13

    sget-object p1, LJ7/n$d;->q:LJ7/n$d;

    goto :goto_20

    :cond_13
    const-string p2, "custom_short_cut"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1e

    sget-object p1, LJ7/n$c;->q:LJ7/n$c;

    goto :goto_20

    :cond_1e
    sget-object p1, LJ7/n$b;->q:LJ7/n$b;

    :goto_20
    invoke-direct {p0, p1}, LJ7/b;->e(LJ7/n;)V

    return-void
.end method

.method public final o()Z
    .registers 2

    iget-object p0, p0, LJ7/b;->h:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    sget-object v0, LJ7/n$a;->q:LJ7/n$a;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final p()Z
    .registers 2

    iget-object p0, p0, LJ7/b;->h:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    sget-object v0, LJ7/n$c;->q:LJ7/n$c;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final q()Z
    .registers 2

    iget-object p0, p0, LJ7/b;->h:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    sget-object v0, LJ7/n$d;->q:LJ7/n$d;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public final r()V
    .registers 2

    sget-object v0, LJ7/n$a;->q:LJ7/n$a;

    invoke-direct {p0, v0}, LJ7/b;->e(LJ7/n;)V

    return-void
.end method

.method public final s()V
    .registers 2

    sget-object v0, LJ7/n$c;->q:LJ7/n$c;

    invoke-direct {p0, v0}, LJ7/b;->e(LJ7/n;)V

    return-void
.end method

.method public final t()V
    .registers 2

    sget-object v0, LJ7/n$d;->q:LJ7/n$d;

    invoke-direct {p0, v0}, LJ7/b;->e(LJ7/n;)V

    return-void
.end method

.method public final u(Lz7/a;)V
    .registers 4

    iget-object v0, p0, LJ7/b;->b:Landroidx/lifecycle/Q;

    const-string v1, "animation_params"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, LJ7/b;->f:Lz7/a;

    return-void
.end method

.method public final v(F)V
    .registers 5

    iget-object v0, p0, LJ7/b;->b:Landroidx/lifecycle/Q;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "lock_screen_tran_x"

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iput p1, p0, LJ7/b;->c:F

    return-void
.end method

.method public final w(Z)V
    .registers 5

    iget-object v0, p0, LJ7/b;->b:Landroidx/lifecycle/Q;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "lock_screen_show"

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LJ7/b;->e:LI8/A;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, LI8/A;->setValue(Ljava/lang/Object;)V

    iput-boolean p1, p0, LJ7/b;->d:Z

    return-void
.end method

.method public final x(Z)V
    .registers 3

    iget-object p0, p0, LJ7/b;->b:Landroidx/lifecycle/Q;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v0, "selector_fragment_show"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final y(Z)V
    .registers 5

    iget-object v0, p0, LJ7/b;->b:Landroidx/lifecycle/Q;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "key_start_from_lock"

    invoke-virtual {v0, v2, v1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iput-boolean p1, p0, LJ7/b;->g:Z

    return-void
.end method
