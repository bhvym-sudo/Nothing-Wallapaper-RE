.class public final LS7/c$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS7/c;->z0(Landroid/view/ViewGroup;Landroid/view/View;Landroidx/transition/z;Landroidx/transition/z;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LS7/c;


# direct methods
.method constructor <init>(LS7/c;)V
    .registers 2

    iput-object p1, p0, LS7/c$a;->a:LS7/c;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p0, p0, LS7/c$a;->a:LS7/c;

    invoke-virtual {p0}, LS7/c;->F0()Lv8/a;

    move-result-object p0

    if-eqz p0, :cond_13

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    :cond_13
    return-void
.end method
