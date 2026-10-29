.class public final LW6/e$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW6/e;->H(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LW6/e;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroid/view/animation/Animation;


# direct methods
.method constructor <init>(LW6/e;Landroid/view/View;Landroid/view/animation/Animation;)V
    .registers 4

    iput-object p1, p0, LW6/e$i;->a:LW6/e;

    iput-object p2, p0, LW6/e$i;->b:Landroid/view/View;

    iput-object p3, p0, LW6/e$i;->c:Landroid/view/animation/Animation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .registers 2

    iget-object p1, p0, LW6/e$i;->a:LW6/e;

    invoke-static {p1}, LW6/e;->e(LW6/e;)Ljava/util/HashMap;

    move-result-object p1

    iget-object p0, p0, LW6/e$i;->b:Landroid/view/View;

    invoke-virtual {p1, p0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .registers 2

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .registers 3

    iget-object p1, p0, LW6/e$i;->a:LW6/e;

    invoke-static {p1}, LW6/e;->e(LW6/e;)Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, LW6/e$i;->b:Landroid/view/View;

    iget-object p0, p0, LW6/e$i;->c:Landroid/view/animation/Animation;

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
