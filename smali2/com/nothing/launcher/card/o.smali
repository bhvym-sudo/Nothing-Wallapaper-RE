.class public final synthetic Lcom/nothing/launcher/card/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:LF5/m;

.field public final synthetic r:Lcom/nothing/launcher/card/p;

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(LF5/m;Lcom/nothing/launcher/card/p;I)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/launcher/card/o;->q:LF5/m;

    iput-object p2, p0, Lcom/nothing/launcher/card/o;->r:Lcom/nothing/launcher/card/p;

    iput p3, p0, Lcom/nothing/launcher/card/o;->s:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 4

    iget-object v0, p0, Lcom/nothing/launcher/card/o;->q:LF5/m;

    iget-object v1, p0, Lcom/nothing/launcher/card/o;->r:Lcom/nothing/launcher/card/p;

    iget p0, p0, Lcom/nothing/launcher/card/o;->s:I

    invoke-static {v0, v1, p0, p1}, Lcom/nothing/launcher/card/p;->w0(LF5/m;Lcom/nothing/launcher/card/p;ILandroid/view/View;)V

    return-void
.end method
