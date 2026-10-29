.class public final synthetic LS6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Landroid/animation/ValueAnimator;

.field public final synthetic b:F

.field public final synthetic c:I

.field public final synthetic d:Landroid/view/ViewGroup;


# direct methods
.method public synthetic constructor <init>(Landroid/animation/ValueAnimator;FILandroid/view/ViewGroup;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS6/c;->a:Landroid/animation/ValueAnimator;

    iput p2, p0, LS6/c;->b:F

    iput p3, p0, LS6/c;->c:I

    iput-object p4, p0, LS6/c;->d:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 5

    iget-object v0, p0, LS6/c;->a:Landroid/animation/ValueAnimator;

    iget v1, p0, LS6/c;->b:F

    iget v2, p0, LS6/c;->c:I

    iget-object p0, p0, LS6/c;->d:Landroid/view/ViewGroup;

    invoke-static {v0, v1, v2, p0, p1}, Lcom/nothing/wallpaper/picker/creative/a;->d0(Landroid/animation/ValueAnimator;FILandroid/view/ViewGroup;Landroid/animation/ValueAnimator;)V

    return-void
.end method
