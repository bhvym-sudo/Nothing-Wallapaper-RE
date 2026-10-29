.class public final Lq6/a$c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq6/a;->c(Landroid/view/View;ZLv8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lv8/a;


# direct methods
.method constructor <init>(Landroid/view/View;Lv8/a;)V
    .registers 3

    iput-object p1, p0, Lq6/a$c;->a:Landroid/view/View;

    iput-object p2, p0, Lq6/a$c;->b:Lv8/a;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p1, p0, Lq6/a$c;->a:Landroid/view/View;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, p0, Lq6/a$c;->b:Lv8/a;

    if-eqz p0, :cond_15

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    :cond_15
    return-void
.end method
