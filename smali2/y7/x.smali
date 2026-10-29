.class public final synthetic Ly7/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/android/launcher3/CellLayout;

.field public final synthetic b:F

.field public final synthetic c:I

.field public final synthetic d:Landroid/animation/ValueAnimator;


# direct methods
.method public synthetic constructor <init>(Lcom/android/launcher3/CellLayout;FILandroid/animation/ValueAnimator;)V
    .registers 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/x;->a:Lcom/android/launcher3/CellLayout;

    iput p2, p0, Ly7/x;->b:F

    iput p3, p0, Ly7/x;->c:I

    iput-object p4, p0, Ly7/x;->d:Landroid/animation/ValueAnimator;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 5

    iget-object v0, p0, Ly7/x;->a:Lcom/android/launcher3/CellLayout;

    iget v1, p0, Ly7/x;->b:F

    iget v2, p0, Ly7/x;->c:I

    iget-object p0, p0, Ly7/x;->d:Landroid/animation/ValueAnimator;

    invoke-static {v0, v1, v2, p0, p1}, Ly7/C;->e(Lcom/android/launcher3/CellLayout;FILandroid/animation/ValueAnimator;Landroid/animation/ValueAnimator;)V

    return-void
.end method
