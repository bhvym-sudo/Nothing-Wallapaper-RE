.class public final synthetic Lcom/nothing/launcher/card/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/launcher/card/s;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/launcher/card/s;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/launcher/card/r;->q:Lcom/nothing/launcher/card/s;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Lcom/nothing/launcher/card/r;->q:Lcom/nothing/launcher/card/s;

    invoke-static {p0}, Lcom/nothing/launcher/card/s;->u0(Lcom/nothing/launcher/card/s;)V

    return-void
.end method
