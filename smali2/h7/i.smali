.class public final synthetic Lh7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Lh7/j;

.field public final synthetic r:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lh7/j;Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh7/i;->q:Lh7/j;

    iput-object p2, p0, Lh7/i;->r:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, Lh7/i;->q:Lh7/j;

    iget-object p0, p0, Lh7/i;->r:Landroid/content/Context;

    invoke-static {v0, p0, p1}, Lh7/j;->j(Lh7/j;Landroid/content/Context;Landroid/view/View;)V

    return-void
.end method
