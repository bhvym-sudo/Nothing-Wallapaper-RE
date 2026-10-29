.class public final Lcom/nothing/launcher/card/m;
.super Lcom/android/launcher3/m;
.source "SourceFile"


# instance fields
.field private final G:Lcom/nothing/launcher/card/j;

.field private final H:I

.field public I:Lcom/nothing/cardhost/g;

.field private J:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lcom/nothing/launcher/card/j;)V
    .registers 3

    const-string v0, "cardWidgetMetaInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/android/launcher3/m;-><init>()V

    iput-object p1, p0, Lcom/nothing/launcher/card/m;->G:Lcom/nothing/launcher/card/j;

    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->y0()I

    move-result v0

    iput v0, p0, Lcom/nothing/launcher/card/m;->H:I

    const/4 v0, 0x0

    iput v0, p0, LC2/b;->r:I

    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->D0()Landroid/os/UserHandle;

    move-result-object v0

    iput-object v0, p0, LC2/b;->C:Landroid/os/UserHandle;

    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->v0()Landroid/content/ComponentName;

    move-result-object v0

    iput-object v0, p0, Lcom/android/launcher3/m;->F:Landroid/content/ComponentName;

    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->B0()I

    move-result v0

    iput v0, p0, LC2/b;->u:I

    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->C0()I

    move-result v0

    iput v0, p0, LC2/b;->v:I

    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->z0()I

    move-result v0

    iput v0, p0, LC2/b;->w:I

    invoke-virtual {p1}, Lcom/nothing/launcher/card/j;->A0()I

    move-result p1

    iput p1, p0, LC2/b;->x:I

    return-void
.end method


# virtual methods
.method public final m()Landroid/os/Bundle;
    .registers 1

    iget-object p0, p0, Lcom/nothing/launcher/card/m;->J:Landroid/os/Bundle;

    return-object p0
.end method

.method public final n()Lcom/nothing/launcher/card/j;
    .registers 1

    iget-object p0, p0, Lcom/nothing/launcher/card/m;->G:Lcom/nothing/launcher/card/j;

    return-object p0
.end method

.method public final o(Landroid/content/Context;)Landroid/os/Bundle;
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, LC2/b;->u:I

    iget p0, p0, LC2/b;->v:I

    invoke-static {p1, v0, p0}, LV5/a;->b(Landroid/content/Context;II)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public final p()Lcom/nothing/launcher/card/a;
    .registers 2

    new-instance v0, Lcom/nothing/launcher/card/a;

    iget-object p0, p0, Lcom/nothing/launcher/card/m;->G:Lcom/nothing/launcher/card/j;

    invoke-direct {v0, p0}, Lcom/nothing/launcher/card/a;-><init>(LF5/m;)V

    return-object v0
.end method

.method public final q(Landroid/os/Bundle;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/launcher/card/m;->J:Landroid/os/Bundle;

    return-void
.end method
