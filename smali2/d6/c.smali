.class public final Ld6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO2/j;


# instance fields
.field private final a:Lcom/nothing/systemui/shared/clocks/view/D;

.field private final b:Lcom/nothing/systemui/shared/clocks/view/D;


# direct methods
.method public constructor <init>(Lcom/nothing/systemui/shared/clocks/view/D;Lcom/nothing/systemui/shared/clocks/view/D;)V
    .registers 4

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld6/c;->a:Lcom/nothing/systemui/shared/clocks/view/D;

    iput-object p2, p0, Ld6/c;->b:Lcom/nothing/systemui/shared/clocks/view/D;

    return-void
.end method


# virtual methods
.method public a(LY5/a;)V
    .registers 3

    iget-object v0, p0, Ld6/c;->a:Lcom/nothing/systemui/shared/clocks/view/D;

    invoke-virtual {v0, p1}, Lcom/nothing/systemui/shared/clocks/view/D;->y(LY5/a;)V

    iget-object p0, p0, Ld6/c;->b:Lcom/nothing/systemui/shared/clocks/view/D;

    if-eqz p0, :cond_c

    invoke-virtual {p0, p1}, Lcom/nothing/systemui/shared/clocks/view/D;->y(LY5/a;)V

    :cond_c
    return-void
.end method

.method public b(Z)V
    .registers 5

    iget-object v0, p0, Ld6/c;->a:Lcom/nothing/systemui/shared/clocks/view/D;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lcom/nothing/systemui/shared/clocks/view/D;->C(Lcom/nothing/systemui/shared/clocks/view/D;ZLjava/util/Locale;ILjava/lang/Object;)V

    iget-object p0, p0, Ld6/c;->b:Lcom/nothing/systemui/shared/clocks/view/D;

    if-eqz p0, :cond_e

    invoke-static {p0, p1, v1, v2, v1}, Lcom/nothing/systemui/shared/clocks/view/D;->C(Lcom/nothing/systemui/shared/clocks/view/D;ZLjava/util/Locale;ILjava/lang/Object;)V

    :cond_e
    return-void
.end method

.method public c(LO2/a;)V
    .registers 3

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld6/c;->a:Lcom/nothing/systemui/shared/clocks/view/D;

    invoke-virtual {v0, p1}, Lcom/nothing/systemui/shared/clocks/view/D;->o(LO2/a;)V

    iget-object p0, p0, Ld6/c;->b:Lcom/nothing/systemui/shared/clocks/view/D;

    if-eqz p0, :cond_11

    invoke-virtual {p0, p1}, Lcom/nothing/systemui/shared/clocks/view/D;->o(LO2/a;)V

    :cond_11
    return-void
.end method

.method public d(Landroid/content/res/Resources;)V
    .registers 2

    const-string p0, "resources"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public e(LO2/z;)V
    .registers 2

    const-string p0, "data"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public f(Ljava/util/TimeZone;)V
    .registers 6

    const-string v0, "timeZone"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld6/c;->a:Lcom/nothing/systemui/shared/clocks/view/D;

    invoke-virtual {v0, p1}, Lcom/nothing/systemui/shared/clocks/view/D;->w(Ljava/util/TimeZone;)V

    iget-object v0, p0, Ld6/c;->a:Lcom/nothing/systemui/shared/clocks/view/D;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lcom/nothing/systemui/shared/clocks/view/D;->C(Lcom/nothing/systemui/shared/clocks/view/D;ZLjava/util/Locale;ILjava/lang/Object;)V

    iget-object v0, p0, Ld6/c;->b:Lcom/nothing/systemui/shared/clocks/view/D;

    if-eqz v0, :cond_20

    invoke-virtual {v0, p1}, Lcom/nothing/systemui/shared/clocks/view/D;->w(Ljava/util/TimeZone;)V

    :cond_20
    iget-object p1, p0, Ld6/c;->b:Lcom/nothing/systemui/shared/clocks/view/D;

    if-eqz p1, :cond_31

    iget-object p0, p0, Ld6/c;->a:Lcom/nothing/systemui/shared/clocks/view/D;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result p0

    invoke-static {p1, p0, v2, v3, v2}, Lcom/nothing/systemui/shared/clocks/view/D;->C(Lcom/nothing/systemui/shared/clocks/view/D;ZLjava/util/Locale;ILjava/lang/Object;)V

    :cond_31
    return-void
.end method

.method public g(LX5/a;)V
    .registers 3

    iget-object v0, p0, Ld6/c;->a:Lcom/nothing/systemui/shared/clocks/view/D;

    invoke-virtual {v0, p1}, Lcom/nothing/systemui/shared/clocks/view/D;->p(LX5/a;)V

    iget-object p0, p0, Ld6/c;->b:Lcom/nothing/systemui/shared/clocks/view/D;

    if-eqz p0, :cond_c

    invoke-virtual {p0, p1}, Lcom/nothing/systemui/shared/clocks/view/D;->p(LX5/a;)V

    :cond_c
    return-void
.end method
