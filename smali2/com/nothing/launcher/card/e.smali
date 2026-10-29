.class public final synthetic Lcom/nothing/launcher/card/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Lcom/nothing/launcher/card/h;

.field public final synthetic r:Lcom/nothing/launcher/card/p;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/launcher/card/h;Lcom/nothing/launcher/card/p;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/launcher/card/e;->q:Lcom/nothing/launcher/card/h;

    iput-object p2, p0, Lcom/nothing/launcher/card/e;->r:Lcom/nothing/launcher/card/p;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, Lcom/nothing/launcher/card/e;->q:Lcom/nothing/launcher/card/h;

    iget-object p0, p0, Lcom/nothing/launcher/card/e;->r:Lcom/nothing/launcher/card/p;

    invoke-static {v0, p0}, Lcom/nothing/launcher/card/h;->a(Lcom/nothing/launcher/card/h;Lcom/nothing/launcher/card/p;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
