.class public final synthetic Lh7/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Z

.field public final synthetic r:Lh7/q;

.field public final synthetic s:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(ZLh7/q;Landroid/content/Context;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lh7/p;->q:Z

    iput-object p2, p0, Lh7/p;->r:Lh7/q;

    iput-object p3, p0, Lh7/p;->s:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 4

    iget-boolean v0, p0, Lh7/p;->q:Z

    iget-object v1, p0, Lh7/p;->r:Lh7/q;

    iget-object p0, p0, Lh7/p;->s:Landroid/content/Context;

    invoke-static {v0, v1, p0, p1}, Lh7/q;->b(ZLh7/q;Landroid/content/Context;Landroid/view/View;)V

    return-void
.end method
