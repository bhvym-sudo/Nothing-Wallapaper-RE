.class public final synthetic Lcom/nothing/launcher/card/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Lcom/nothing/launcher/card/h;

.field public final synthetic r:Lcom/nothing/launcher/card/p;

.field public final synthetic s:Lcom/nothing/launcher/card/j;

.field public final synthetic t:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/launcher/card/h;Lcom/nothing/launcher/card/p;Lcom/nothing/launcher/card/j;Landroid/os/Bundle;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/launcher/card/d;->q:Lcom/nothing/launcher/card/h;

    iput-object p2, p0, Lcom/nothing/launcher/card/d;->r:Lcom/nothing/launcher/card/p;

    iput-object p3, p0, Lcom/nothing/launcher/card/d;->s:Lcom/nothing/launcher/card/j;

    iput-object p4, p0, Lcom/nothing/launcher/card/d;->t:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, Lcom/nothing/launcher/card/d;->q:Lcom/nothing/launcher/card/h;

    iget-object v1, p0, Lcom/nothing/launcher/card/d;->r:Lcom/nothing/launcher/card/p;

    iget-object v2, p0, Lcom/nothing/launcher/card/d;->s:Lcom/nothing/launcher/card/j;

    iget-object p0, p0, Lcom/nothing/launcher/card/d;->t:Landroid/os/Bundle;

    invoke-static {v0, v1, v2, p0}, Lcom/nothing/launcher/card/h;->b(Lcom/nothing/launcher/card/h;Lcom/nothing/launcher/card/p;Lcom/nothing/launcher/card/j;Landroid/os/Bundle;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
