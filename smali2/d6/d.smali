.class public final Ld6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO2/l;


# instance fields
.field private final a:Lcom/nothing/systemui/shared/clocks/view/D;

.field private b:Ld6/a;

.field private final c:LO2/k;

.field private d:LO2/y;

.field private final e:LO2/m;

.field private final f:LO2/x;


# direct methods
.method public constructor <init>(Lcom/nothing/systemui/shared/clocks/view/D;Ljava/lang/String;LO2/w;LK2/f;Z)V
    .registers 15

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockViewId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockTickRate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ld6/d;->a:Lcom/nothing/systemui/shared/clocks/view/D;

    .line 3
    new-instance p1, Ld6/a;

    invoke-virtual {p0}, Ld6/d;->g()Lcom/nothing/systemui/shared/clocks/view/D;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, v1}, Ld6/a;-><init>(Lcom/nothing/systemui/shared/clocks/view/D;FF)V

    iput-object p1, p0, Ld6/d;->b:Ld6/a;

    .line 4
    new-instance v2, LO2/k;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p3

    invoke-direct/range {v2 .. v8}, LO2/k;-><init>(LO2/w;ZZZILkotlin/jvm/internal/h;)V

    iput-object v2, p0, Ld6/d;->c:LO2/k;

    .line 5
    new-instance p1, LO2/y;

    invoke-virtual {p0}, Ld6/d;->g()Lcom/nothing/systemui/shared/clocks/view/D;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x106000b

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const/4 v0, 0x1

    invoke-direct {p1, v0, p3}, LO2/y;-><init>(ZLjava/lang/Integer;)V

    iput-object p1, p0, Ld6/d;->d:LO2/y;

    .line 6
    new-instance p1, Ld6/d$a;

    invoke-direct {p1, p0, p5}, Ld6/d$a;-><init>(Ld6/d;Z)V

    iput-object p1, p0, Ld6/d;->e:LO2/m;

    .line 7
    new-instance p1, LO2/x;

    invoke-virtual {p0}, Ld6/d;->g()Lcom/nothing/systemui/shared/clocks/view/D;

    move-result-object p3

    invoke-direct {p1, p3}, LO2/x;-><init>(Landroid/view/View;)V

    .line 8
    invoke-virtual {p1}, LO2/x;->b()Ljava/util/List;

    move-result-object p3

    const/4 v0, 0x0

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    invoke-virtual {p1}, LO2/x;->a()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 9
    invoke-virtual {p1}, LO2/x;->a()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 10
    const-string v2, "id"

    invoke-virtual {v0, p2, v2, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p3, p2}, Landroid/view/View;->setId(I)V

    .line 11
    iput-object p1, p0, Ld6/d;->f:LO2/x;

    .line 12
    invoke-virtual {p0}, Ld6/d;->g()Lcom/nothing/systemui/shared/clocks/view/D;

    move-result-object p1

    invoke-virtual {p1, p5}, Lcom/nothing/systemui/shared/clocks/view/D;->setIsSnapshotClockView(Z)V

    if-eqz p4, :cond_93

    .line 13
    invoke-virtual {p0}, Ld6/d;->g()Lcom/nothing/systemui/shared/clocks/view/D;

    move-result-object p0

    invoke-virtual {p0, p4}, Lcom/nothing/systemui/shared/clocks/view/D;->setMessageBuffer(LK2/f;)V

    :cond_93
    return-void
.end method

.method public synthetic constructor <init>(Lcom/nothing/systemui/shared/clocks/view/D;Ljava/lang/String;LO2/w;LK2/f;ZILkotlin/jvm/internal/h;)V
    .registers 14

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_6

    .line 14
    sget-object p3, LO2/w;->r:LO2/w;

    :cond_6
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_c

    const/4 p4, 0x0

    :cond_c
    move-object v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_12

    const/4 p5, 0x0

    :cond_12
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p5

    .line 15
    invoke-direct/range {v0 .. v5}, Ld6/d;-><init>(Lcom/nothing/systemui/shared/clocks/view/D;Ljava/lang/String;LO2/w;LK2/f;Z)V

    return-void
.end method


# virtual methods
.method public a()LO2/k;
    .registers 1

    iget-object p0, p0, Ld6/d;->c:LO2/k;

    return-object p0
.end method

.method public b()LO2/m;
    .registers 1

    iget-object p0, p0, Ld6/d;->e:LO2/m;

    return-object p0
.end method

.method public c(ZZZ)V
    .registers 4

    invoke-virtual {p0}, Ld6/d;->b()LO2/m;

    move-result-object p0

    invoke-interface {p0, p1, p2, p3}, LO2/m;->a(ZZZ)V

    return-void
.end method

.method public bridge synthetic d()LO2/d;
    .registers 1

    invoke-virtual {p0}, Ld6/d;->f()Ld6/a;

    move-result-object p0

    return-object p0
.end method

.method public e()LO2/y;
    .registers 1

    iget-object p0, p0, Ld6/d;->d:LO2/y;

    return-object p0
.end method

.method public f()Ld6/a;
    .registers 1

    iget-object p0, p0, Ld6/d;->b:Ld6/a;

    return-object p0
.end method

.method public g()Lcom/nothing/systemui/shared/clocks/view/D;
    .registers 1

    iget-object p0, p0, Ld6/d;->a:Lcom/nothing/systemui/shared/clocks/view/D;

    return-object p0
.end method

.method public bridge synthetic getView()Landroid/view/View;
    .registers 1

    invoke-virtual {p0}, Ld6/d;->g()Lcom/nothing/systemui/shared/clocks/view/D;

    move-result-object p0

    return-object p0
.end method

.method public h(Ld6/a;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ld6/d;->b:Ld6/a;

    return-void
.end method

.method public i(LO2/y;)V
    .registers 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ld6/d;->d:LO2/y;

    return-void
.end method
