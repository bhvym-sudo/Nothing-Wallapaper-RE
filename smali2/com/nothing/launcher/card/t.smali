.class public final Lcom/nothing/launcher/card/t;
.super LC2/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/launcher/card/t$a;
    }
.end annotation


# static fields
.field public static final M:Lcom/nothing/launcher/card/t$a;


# instance fields
.field private final F:I

.field private final G:Landroid/content/ComponentName;

.field private H:I

.field private I:I

.field private J:Z

.field private K:I

.field private L:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/launcher/card/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/launcher/card/t$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/launcher/card/t;->M:Lcom/nothing/launcher/card/t$a;

    return-void
.end method

.method public constructor <init>(ILandroid/content/ComponentName;)V
    .registers 3

    invoke-direct {p0}, LC2/b;-><init>()V

    iput p1, p0, Lcom/nothing/launcher/card/t;->F:I

    iput-object p2, p0, Lcom/nothing/launcher/card/t;->G:Landroid/content/ComponentName;

    const/4 p2, -0x1

    iput p2, p0, Lcom/nothing/launcher/card/t;->H:I

    iput p2, p0, Lcom/nothing/launcher/card/t;->I:I

    iput p2, p0, LC2/b;->u:I

    iput p2, p0, LC2/b;->v:I

    iput p1, p0, LC2/b;->q:I

    invoke-static {}, Landroid/os/Process;->myUserHandle()Landroid/os/UserHandle;

    move-result-object p1

    iput-object p1, p0, LC2/b;->C:Landroid/os/UserHandle;

    return-void
.end method


# virtual methods
.method protected b()Ljava/lang/String;
    .registers 4

    invoke-super {p0}, LC2/b;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/nothing/launcher/card/t;->G:Landroid/content/ComponentName;

    iget p0, p0, Lcom/nothing/launcher/card/t;->F:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " providerName="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " widgetId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public d()Landroid/content/ComponentName;
    .registers 1

    iget-object p0, p0, Lcom/nothing/launcher/card/t;->G:Landroid/content/ComponentName;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, Lcom/nothing/launcher/card/t;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, Lcom/nothing/launcher/card/t;

    iget v1, p0, Lcom/nothing/launcher/card/t;->F:I

    iget v3, p1, Lcom/nothing/launcher/card/t;->F:I

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object p0, p0, Lcom/nothing/launcher/card/t;->G:Landroid/content/ComponentName;

    iget-object p1, p1, Lcom/nothing/launcher/card/t;->G:Landroid/content/ComponentName;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1e

    return v2

    :cond_1e
    return v0
.end method

.method public hashCode()I
    .registers 2

    iget v0, p0, Lcom/nothing/launcher/card/t;->F:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, Lcom/nothing/launcher/card/t;->G:Landroid/content/ComponentName;

    if-nez p0, :cond_e

    const/4 p0, 0x0

    goto :goto_12

    :cond_e
    invoke-virtual {p0}, Landroid/content/ComponentName;->hashCode()I

    move-result p0

    :goto_12
    add-int/2addr v0, p0

    return v0
.end method

.method public final k()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/t;->H:I

    return p0
.end method

.method public final l()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/t;->I:I

    return p0
.end method

.method public final m()I
    .registers 1

    iget p0, p0, Lcom/nothing/launcher/card/t;->F:I

    return p0
.end method

.method public final n()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/launcher/card/t;->J:Z

    return p0
.end method

.method public final o(Lcom/nothing/launcher/card/t;)Z
    .registers 4

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/nothing/launcher/card/t;->F:I

    iget v1, p1, Lcom/nothing/launcher/card/t;->F:I

    if-ne v0, v1, :cond_31

    iget v0, p0, LC2/b;->s:I

    iget v1, p1, LC2/b;->s:I

    if-ne v0, v1, :cond_31

    iget v0, p0, LC2/b;->t:I

    iget v1, p1, LC2/b;->t:I

    if-ne v0, v1, :cond_31

    iget v0, p0, LC2/b;->u:I

    iget v1, p1, LC2/b;->u:I

    if-ne v0, v1, :cond_31

    iget v0, p0, LC2/b;->v:I

    iget v1, p1, LC2/b;->v:I

    if-ne v0, v1, :cond_31

    iget v0, p0, Lcom/nothing/launcher/card/t;->H:I

    iget v1, p1, Lcom/nothing/launcher/card/t;->H:I

    if-ne v0, v1, :cond_31

    iget p0, p0, Lcom/nothing/launcher/card/t;->I:I

    iget p1, p1, Lcom/nothing/launcher/card/t;->I:I

    if-ne p0, p1, :cond_31

    const/4 p0, 0x1

    return p0

    :cond_31
    const/4 p0, 0x0

    return p0
.end method

.method public final p()Z
    .registers 2

    iget p0, p0, Lcom/nothing/launcher/card/t;->K:I

    and-int/lit8 v0, p0, 0x1

    if-eqz v0, :cond_e

    const/16 v0, 0x10

    and-int/2addr p0, v0

    if-ne p0, v0, :cond_c

    goto :goto_e

    :cond_c
    const/4 p0, 0x0

    return p0

    :cond_e
    :goto_e
    const/4 p0, 0x1

    return p0
.end method

.method public final q(Landroid/content/Context;Lcom/nothing/cardhost/g;)V
    .registers 5

    const-string v0, "launcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hostView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/nothing/launcher/card/t;->L:Z

    if-nez v0, :cond_18

    iget v0, p0, LC2/b;->u:I

    iget v1, p0, LC2/b;->v:I

    invoke-static {p2, p1, v0, v1}, LV5/a;->f(Lcom/nothing/cardhost/g;Landroid/content/Context;II)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/nothing/launcher/card/t;->L:Z

    :cond_18
    return-void
.end method

.method public final r(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/launcher/card/t;->H:I

    return-void
.end method

.method public final s(I)V
    .registers 2

    iput p1, p0, Lcom/nothing/launcher/card/t;->I:I

    return-void
.end method

.method public final t(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/launcher/card/t;->J:Z

    return-void
.end method
