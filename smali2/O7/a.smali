.class public final LO7/a;
.super Landroidx/lifecycle/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO7/a$a;,
        LO7/a$b;
    }
.end annotation


# static fields
.field public static final f:LO7/a$a;


# instance fields
.field private final c:Landroid/app/Application;

.field private final d:Landroidx/lifecycle/Q;

.field private final e:LI8/O;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LO7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LO7/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LO7/a;->f:LO7/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;Landroidx/lifecycle/Q;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/lifecycle/b;-><init>(Landroid/app/Application;)V

    iput-object p1, p0, LO7/a;->c:Landroid/app/Application;

    iput-object p2, p0, LO7/a;->d:Landroidx/lifecycle/Q;

    const-string p1, "key_page_state"

    sget-object v0, LO7/a$b$a;->q:LO7/a$b$a;

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object p1

    iput-object p1, p0, LO7/a;->e:LI8/O;

    return-void
.end method


# virtual methods
.method public final f()V
    .registers 3

    iget-object p0, p0, LO7/a;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_page_state"

    sget-object v1, LO7/a$b$a;->q:LO7/a$b$a;

    invoke-virtual {p0, v0, v1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final g()LI8/O;
    .registers 1

    iget-object p0, p0, LO7/a;->e:LI8/O;

    return-object p0
.end method

.method public final h()Ljava/util/List;
    .registers 2

    iget-object p0, p0, LO7/a;->d:Landroidx/lifecycle/Q;

    const-string v0, "key_selected_wallpapers"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public final i()Z
    .registers 1

    iget-object p0, p0, LO7/a;->e:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    instance-of p0, p0, LO7/a$b$b;

    return p0
.end method

.method public final j(Ljava/util/List;)V
    .registers 7

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    const-string v1, "key_selected_wallpapers"

    if-eqz v0, :cond_5f

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_5f

    :cond_e
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_19
    :goto_19
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_36

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lg3/x;

    instance-of v4, v3, LJ6/i;

    if-eqz v4, :cond_19

    check-cast v3, LJ6/i;

    invoke-virtual {v3}, LJ6/i;->z()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_19

    :cond_36
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_5e

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_45
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_59

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg3/x;

    invoke-virtual {v2}, Lg3/x;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_45

    :cond_59
    iget-object p0, p0, LO7/a;->d:Landroidx/lifecycle/Q;

    invoke-virtual {p0, v1, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5e
    return-void

    :cond_5f
    :goto_5f
    iget-object p0, p0, LO7/a;->d:Landroidx/lifecycle/Q;

    const/4 p1, 0x0

    invoke-virtual {p0, v1, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final k(Ljava/lang/String;)V
    .registers 3

    const-string v0, "categoryCollectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LO7/a;->d:Landroidx/lifecycle/Q;

    new-instance v0, LO7/a$b$b;

    invoke-direct {v0, p1}, LO7/a$b$b;-><init>(Ljava/lang/String;)V

    const-string p1, "key_page_state"

    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
