.class public final Ld6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO2/h;


# instance fields
.field private final a:Ld6/d;

.field private final b:Ld6/d;

.field private final c:Ld6/d;

.field private final d:LO2/j;

.field private final e:LO2/g;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:I

.field private final i:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ld6/f;Landroid/view/LayoutInflater;LO2/r;)V
    .registers 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "context"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "clockType"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "layoutInflater"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v4, "clock_alignment"

    iput-object v4, v0, Ld6/b;->f:Ljava/lang/String;

    const-string v4, "clock_text_size"

    iput-object v4, v0, Ld6/b;->g:Ljava/lang/String;

    const/4 v4, 0x1

    iput v4, v0, Ld6/b;->h:I

    iput v4, v0, Ld6/b;->i:I

    new-instance v4, Landroid/widget/FrameLayout;

    invoke-direct {v4, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    sget-object v5, Ld6/f;->t:Ld6/f;

    if-ne v2, v5, :cond_34

    sget-object v5, LO2/w;->s:LO2/w;

    :goto_32
    move-object v9, v5

    goto :goto_37

    :cond_34
    sget-object v5, LO2/w;->r:LO2/w;

    goto :goto_32

    :goto_37
    new-instance v6, Ld6/d;

    invoke-virtual {v2}, Ld6/f;->f()I

    move-result v5

    const/4 v14, 0x0

    invoke-virtual {v3, v5, v4, v14}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    const-string v15, "null cannot be cast to non-null type com.nothing.systemui.shared.clocks.view.NTClockView"

    invoke-static {v5, v15}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v5

    check-cast v7, Lcom/nothing/systemui/shared/clocks/view/D;

    const/16 v12, 0x10

    const/4 v13, 0x0

    const-string v8, "lockscreen_clock_view"

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v13}, Ld6/d;-><init>(Lcom/nothing/systemui/shared/clocks/view/D;Ljava/lang/String;LO2/w;LK2/f;ZILkotlin/jvm/internal/h;)V

    iput-object v6, v0, Ld6/b;->a:Ld6/d;

    new-instance v16, Ld6/d;

    invoke-virtual {v2}, Ld6/f;->f()I

    move-result v5

    invoke-virtual {v3, v5, v4, v14}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    invoke-static {v5, v15}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v5

    check-cast v17, Lcom/nothing/systemui/shared/clocks/view/D;

    const/16 v22, 0x1c

    const/16 v23, 0x0

    const-string v18, "lockscreen_clock_view_large"

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v23}, Ld6/d;-><init>(Lcom/nothing/systemui/shared/clocks/view/D;Ljava/lang/String;LO2/w;LK2/f;ZILkotlin/jvm/internal/h;)V

    move-object/from16 v5, v16

    iput-object v5, v0, Ld6/b;->b:Ld6/d;

    new-instance v6, Ld6/d;

    invoke-virtual {v2}, Ld6/f;->f()I

    move-result v5

    invoke-virtual {v3, v5, v4, v14}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    invoke-static {v3, v15}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, v3

    check-cast v7, Lcom/nothing/systemui/shared/clocks/view/D;

    const/4 v11, 0x1

    const-string v8, "lockscreen_clock_snapview"

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v11}, Ld6/d;-><init>(Lcom/nothing/systemui/shared/clocks/view/D;Ljava/lang/String;LO2/w;LK2/f;Z)V

    iput-object v6, v0, Ld6/b;->c:Ld6/d;

    new-instance v3, Ld6/c;

    invoke-virtual {v0}, Ld6/b;->h()Ld6/d;

    move-result-object v4

    invoke-virtual {v4}, Ld6/d;->g()Lcom/nothing/systemui/shared/clocks/view/D;

    move-result-object v4

    invoke-virtual {v0}, Ld6/b;->i()Ld6/d;

    move-result-object v5

    invoke-virtual {v5}, Ld6/d;->g()Lcom/nothing/systemui/shared/clocks/view/D;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ld6/c;-><init>(Lcom/nothing/systemui/shared/clocks/view/D;Lcom/nothing/systemui/shared/clocks/view/D;)V

    iput-object v3, v0, Ld6/b;->d:LO2/j;

    new-instance v6, LO2/g;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string v1, "getString(...)"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0x18

    const/4 v13, 0x0

    const-string v8, ""

    const-string v9, ""

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v13}, LO2/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/h;)V

    iput-object v6, v0, Ld6/b;->e:LO2/g;

    return-void
.end method


# virtual methods
.method public a()LO2/g;
    .registers 1

    iget-object p0, p0, Ld6/b;->e:LO2/g;

    return-object p0
.end method

.method public b()LO2/j;
    .registers 1

    iget-object p0, p0, Ld6/b;->d:LO2/j;

    return-object p0
.end method

.method public bridge synthetic c()LO2/l;
    .registers 1

    invoke-virtual {p0}, Ld6/b;->i()Ld6/d;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic d()LO2/l;
    .registers 1

    invoke-virtual {p0}, Ld6/b;->h()Ld6/d;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic e()LO2/l;
    .registers 1

    invoke-virtual {p0}, Ld6/b;->g()Ld6/d;

    move-result-object p0

    return-object p0
.end method

.method public f(ZFFLO2/i;)V
    .registers 7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initialize() isDarkTheme = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", dozeFraction = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", foldFraction = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", clockListener = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    const-string v0, "NTClockController"

    invoke-static {v0, p4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Ld6/b;->h()Ld6/d;

    move-result-object p4

    new-instance v0, Ld6/a;

    invoke-virtual {p0}, Ld6/b;->h()Ld6/d;

    move-result-object v1

    invoke-virtual {v1}, Ld6/d;->g()Lcom/nothing/systemui/shared/clocks/view/D;

    move-result-object v1

    invoke-direct {v0, v1, p2, p3}, Ld6/a;-><init>(Lcom/nothing/systemui/shared/clocks/view/D;FF)V

    invoke-virtual {p4, v0}, Ld6/d;->h(Ld6/a;)V

    invoke-virtual {p0}, Ld6/b;->g()Ld6/d;

    move-result-object p2

    invoke-virtual {p2}, Ld6/d;->b()LO2/m;

    move-result-object p2

    invoke-virtual {p0}, Ld6/b;->g()Ld6/d;

    move-result-object p3

    invoke-virtual {p3}, Ld6/d;->e()LO2/y;

    move-result-object p3

    const/4 p4, 0x0

    const/4 v0, 0x2

    invoke-static {p3, p1, p4, v0, p4}, LO2/y;->b(LO2/y;ZLjava/lang/Integer;ILjava/lang/Object;)LO2/y;

    move-result-object p3

    invoke-interface {p2, p3}, LO2/m;->c(LO2/y;)V

    invoke-virtual {p0}, Ld6/b;->h()Ld6/d;

    move-result-object p2

    invoke-virtual {p2}, Ld6/d;->b()LO2/m;

    move-result-object p2

    invoke-virtual {p0}, Ld6/b;->h()Ld6/d;

    move-result-object p3

    invoke-virtual {p3}, Ld6/d;->e()LO2/y;

    move-result-object p3

    invoke-static {p3, p1, p4, v0, p4}, LO2/y;->b(LO2/y;ZLjava/lang/Integer;ILjava/lang/Object;)LO2/y;

    move-result-object p3

    invoke-interface {p2, p3}, LO2/m;->c(LO2/y;)V

    invoke-virtual {p0}, Ld6/b;->b()LO2/j;

    move-result-object p2

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object p3

    const-string v1, "getDefault(...)"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p3}, LO2/j;->f(Ljava/util/TimeZone;)V

    invoke-virtual {p0}, Ld6/b;->h()Ld6/d;

    move-result-object p2

    invoke-virtual {p2}, Ld6/d;->b()LO2/m;

    move-result-object p2

    invoke-interface {p2}, LO2/m;->b()V

    invoke-virtual {p0}, Ld6/b;->g()Ld6/d;

    move-result-object p2

    invoke-virtual {p2}, Ld6/d;->b()LO2/m;

    move-result-object p2

    invoke-interface {p2}, LO2/m;->b()V

    invoke-virtual {p0}, Ld6/b;->i()Ld6/d;

    move-result-object p2

    invoke-virtual {p2}, Ld6/d;->b()LO2/m;

    move-result-object p2

    invoke-virtual {p0}, Ld6/b;->i()Ld6/d;

    move-result-object p3

    invoke-virtual {p3}, Ld6/d;->e()LO2/y;

    move-result-object p3

    invoke-static {p3, p1, p4, v0, p4}, LO2/y;->b(LO2/y;ZLjava/lang/Integer;ILjava/lang/Object;)LO2/y;

    move-result-object p1

    invoke-interface {p2, p1}, LO2/m;->c(LO2/y;)V

    invoke-virtual {p0}, Ld6/b;->i()Ld6/d;

    move-result-object p1

    invoke-virtual {p1}, Ld6/d;->b()LO2/m;

    move-result-object p1

    invoke-interface {p1}, LO2/m;->b()V

    invoke-virtual {p0}, Ld6/b;->h()Ld6/d;

    move-result-object p1

    invoke-virtual {p1}, Ld6/d;->b()LO2/m;

    move-result-object p1

    const/4 p2, 0x1

    invoke-interface {p1, p2, p2, p2}, LO2/m;->a(ZZZ)V

    invoke-virtual {p0}, Ld6/b;->g()Ld6/d;

    move-result-object p1

    invoke-virtual {p1}, Ld6/d;->b()LO2/m;

    move-result-object p1

    invoke-interface {p1, p2, p2, p2}, LO2/m;->a(ZZZ)V

    invoke-virtual {p0}, Ld6/b;->i()Ld6/d;

    move-result-object p0

    invoke-virtual {p0}, Ld6/d;->b()LO2/m;

    move-result-object p0

    invoke-interface {p0, p2, p2, p2}, LO2/m;->a(ZZZ)V

    return-void
.end method

.method public g()Ld6/d;
    .registers 1

    iget-object p0, p0, Ld6/b;->b:Ld6/d;

    return-object p0
.end method

.method public h()Ld6/d;
    .registers 1

    iget-object p0, p0, Ld6/b;->a:Ld6/d;

    return-object p0
.end method

.method public i()Ld6/d;
    .registers 1

    iget-object p0, p0, Ld6/b;->c:Ld6/d;

    return-object p0
.end method
