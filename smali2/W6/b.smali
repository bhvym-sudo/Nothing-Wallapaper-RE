.class public final synthetic LW6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroid/view/View;

.field public final synthetic r:Landroid/view/animation/AlphaAnimation;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/view/animation/AlphaAnimation;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/b;->q:Landroid/view/View;

    iput-object p2, p0, LW6/b;->r:Landroid/view/animation/AlphaAnimation;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, LW6/b;->q:Landroid/view/View;

    iget-object p0, p0, LW6/b;->r:Landroid/view/animation/AlphaAnimation;

    invoke-static {v0, p0}, LW6/e;->d(Landroid/view/View;Landroid/view/animation/AlphaAnimation;)V

    return-void
.end method
