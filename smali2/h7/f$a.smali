.class public final Lh7/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh7/f;->c(Landroid/view/View;Landroid/content/Context;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Lh7/f;


# direct methods
.method constructor <init>(Lh7/f;)V
    .registers 2

    iput-object p1, p0, Lh7/f$a;->q:Lh7/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .registers 3

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lh7/f$a;->q:Lh7/f;

    invoke-static {p1}, Lh7/f;->i(Lh7/f;)Ly1/e;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ly1/e;->g(Landroid/os/Handler;)Landroidx/lifecycle/C;

    move-result-object p1

    iget-object p0, p0, Lh7/f$a;->q:Lh7/f;

    invoke-static {p0}, Lh7/f;->j(Lh7/f;)Landroidx/lifecycle/I;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroidx/lifecycle/C;->i(Landroidx/lifecycle/I;)V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .registers 3

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lh7/f$a;->q:Lh7/f;

    invoke-static {p1}, Lh7/f;->i(Lh7/f;)Ly1/e;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ly1/e;->g(Landroid/os/Handler;)Landroidx/lifecycle/C;

    move-result-object p1

    iget-object p0, p0, Lh7/f$a;->q:Lh7/f;

    invoke-static {p0}, Lh7/f;->j(Lh7/f;)Landroidx/lifecycle/I;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroidx/lifecycle/C;->m(Landroidx/lifecycle/I;)V

    return-void
.end method
