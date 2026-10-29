.class public final synthetic Lq7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Lq7/l;

.field public final synthetic r:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lq7/l;Landroid/content/Intent;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq7/b;->q:Lq7/l;

    iput-object p2, p0, Lq7/b;->r:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, Lq7/b;->q:Lq7/l;

    iget-object p0, p0, Lq7/b;->r:Landroid/content/Intent;

    invoke-static {v0, p0, p1}, Lq7/l;->z0(Lq7/l;Landroid/content/Intent;Landroid/view/View;)V

    return-void
.end method
