.class public final Ly7/C$d;
.super Lw2/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly7/C;->A(ZZLv8/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lv8/a;

.field final synthetic c:Ly7/C;


# direct methods
.method constructor <init>(Lv8/a;Ly7/C;)V
    .registers 3

    iput-object p1, p0, Ly7/C$d;->b:Lv8/a;

    iput-object p2, p0, Ly7/C$d;->c:Ly7/C;

    invoke-direct {p0}, Lw2/e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/animation/Animator;)V
    .registers 2

    iget-object p0, p0, Ly7/C$d;->b:Lv8/a;

    if-eqz p0, :cond_7

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    :cond_7
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lw2/e;->onAnimationEnd(Landroid/animation/Animator;)V

    iget-object p0, p0, Ly7/C$d;->c:Ly7/C;

    invoke-static {p0}, Ly7/C;->h(Ly7/C;)Lcom/android/launcher3/CellLayout;

    move-result-object p0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    const-string v0, "animation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    iget-object p0, p0, Ly7/C$d;->c:Ly7/C;

    invoke-static {p0}, Ly7/C;->h(Ly7/C;)Lcom/android/launcher3/CellLayout;

    move-result-object p0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-void
.end method
