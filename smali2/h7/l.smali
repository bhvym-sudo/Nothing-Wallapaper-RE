.class public final synthetic Lh7/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Landroid/content/Context;

.field public final synthetic r:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/l;->q:Landroid/content/Context;

    iput-object p2, p0, Lh7/l;->r:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, Lh7/l;->q:Landroid/content/Context;

    iget-object p0, p0, Lh7/l;->r:Landroid/view/View;

    invoke-static {v0, p0, p1}, Lh7/m;->b(Landroid/content/Context;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method
