.class public final synthetic Lcom/nothing/launcher/card/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Lcom/nothing/launcher/card/s;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/launcher/card/s;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/launcher/card/q;->q:Lcom/nothing/launcher/card/s;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/launcher/card/q;->q:Lcom/nothing/launcher/card/s;

    invoke-static {p0, p1}, Lcom/nothing/launcher/card/s;->t0(Lcom/nothing/launcher/card/s;Landroid/view/View;)V

    return-void
.end method
