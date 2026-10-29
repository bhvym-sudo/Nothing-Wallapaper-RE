.class public final Li7/a;
.super Lx3/b;
.source "SourceFile"


# instance fields
.field private final k:LI8/f;

.field private final l:I

.field private final m:Li7/g;


# direct methods
.method public constructor <init>(LD3/c;Lt3/a;Landroidx/lifecycle/Q;)V
    .registers 5

    const-string v0, "undoInteractor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperInteractor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Lx3/b;-><init>(LD3/c;Lt3/a;Landroidx/lifecycle/Q;)V

    invoke-virtual {p0}, Lx3/b;->k()LI8/O;

    move-result-object p1

    new-instance p2, Li7/a$a;

    invoke-direct {p2, p1}, Li7/a$a;-><init>(LI8/f;)V

    iput-object p2, p0, Li7/a;->k:LI8/f;

    const/16 p1, 0x8

    iput p1, p0, Li7/a;->l:I

    new-instance p2, Li7/g;

    invoke-direct {p2, p1}, Li7/g;-><init>(I)V

    iput-object p2, p0, Li7/a;->m:Li7/g;

    return-void
.end method


# virtual methods
.method protected d()V
    .registers 1

    invoke-super {p0}, Landroidx/lifecycle/a0;->d()V

    iget-object p0, p0, Li7/a;->m:Li7/g;

    invoke-virtual {p0}, Li7/g;->g()V

    return-void
.end method

.method public final n()Li7/g;
    .registers 1

    iget-object p0, p0, Li7/a;->m:Li7/g;

    return-object p0
.end method

.method public final o()LI8/f;
    .registers 1

    iget-object p0, p0, Li7/a;->k:LI8/f;

    return-object p0
.end method

.method public final p(Z)V
    .registers 4

    invoke-virtual {p0}, Lx3/b;->j()LI8/A;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, LI8/A;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lx3/b;->g()Landroidx/lifecycle/Q;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v0, "is_on_lock_screen"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
