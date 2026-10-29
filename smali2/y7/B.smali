.class public final synthetic Ly7/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:Lcom/android/launcher3/u;


# direct methods
.method public synthetic constructor <init>(FFFFLcom/android/launcher3/u;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly7/B;->a:F

    iput p2, p0, Ly7/B;->b:F

    iput p3, p0, Ly7/B;->c:F

    iput p4, p0, Ly7/B;->d:F

    iput-object p5, p0, Ly7/B;->e:Lcom/android/launcher3/u;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 8

    iget v0, p0, Ly7/B;->a:F

    iget v1, p0, Ly7/B;->b:F

    iget v2, p0, Ly7/B;->c:F

    iget v3, p0, Ly7/B;->d:F

    iget-object v4, p0, Ly7/B;->e:Lcom/android/launcher3/u;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Ly7/C;->a(FFFFLcom/android/launcher3/u;Landroid/animation/ValueAnimator;)V

    return-void
.end method
