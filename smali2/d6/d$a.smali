.class public final Ld6/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO2/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld6/d;-><init>(Lcom/nothing/systemui/shared/clocks/view/D;Ljava/lang/String;LO2/w;LK2/f;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld6/d;

.field final synthetic b:Z


# direct methods
.method constructor <init>(Ld6/d;Z)V
    .registers 3

    iput-object p1, p0, Ld6/d$a;->a:Ld6/d;

    iput-boolean p2, p0, Ld6/d$a;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZZZ)V
    .registers 5

    iget-boolean v0, p0, Ld6/d$a;->b:Z

    if-eqz v0, :cond_f

    iget-object p0, p0, Ld6/d$a;->a:Ld6/d;

    invoke-virtual {p0}, Ld6/d;->g()Lcom/nothing/systemui/shared/clocks/view/D;

    move-result-object p0

    const/4 p1, 0x1

    invoke-virtual {p0, p1, p1, p1}, Lcom/nothing/systemui/shared/clocks/view/D;->q(ZZZ)V

    return-void

    :cond_f
    iget-object p0, p0, Ld6/d$a;->a:Ld6/d;

    invoke-virtual {p0}, Ld6/d;->g()Lcom/nothing/systemui/shared/clocks/view/D;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3}, Lcom/nothing/systemui/shared/clocks/view/D;->q(ZZZ)V

    return-void
.end method

.method public b()V
    .registers 1

    iget-object p0, p0, Ld6/d$a;->a:Ld6/d;

    invoke-virtual {p0}, Ld6/d;->g()Lcom/nothing/systemui/shared/clocks/view/D;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->F()V

    return-void
.end method

.method public c(LO2/y;)V
    .registers 3

    const-string v0, "theme"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld6/d$a;->a:Ld6/d;

    invoke-virtual {v0, p1}, Ld6/d;->i(LO2/y;)V

    iget-object p0, p0, Ld6/d$a;->a:Ld6/d;

    invoke-virtual {p0}, Ld6/d;->g()Lcom/nothing/systemui/shared/clocks/view/D;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/nothing/systemui/shared/clocks/view/D;->v(LO2/y;)V

    return-void
.end method

.method public d(F)V
    .registers 2

    iget-object p0, p0, Ld6/d$a;->a:Ld6/d;

    invoke-virtual {p0}, Ld6/d;->g()Lcom/nothing/systemui/shared/clocks/view/D;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nothing/systemui/shared/clocks/view/D;->u()V

    return-void
.end method

.method public e(Landroid/graphics/Rect;)V
    .registers 2

    return-void
.end method
