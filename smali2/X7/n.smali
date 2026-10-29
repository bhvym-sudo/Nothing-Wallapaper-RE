.class public final synthetic LX7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/nothing/widget/ui/NtSwitch;

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/widget/ui/NtSwitch;FFII)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX7/n;->a:Lcom/nothing/widget/ui/NtSwitch;

    iput p2, p0, LX7/n;->b:F

    iput p3, p0, LX7/n;->c:F

    iput p4, p0, LX7/n;->d:I

    iput p5, p0, LX7/n;->e:I

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 8

    iget-object v0, p0, LX7/n;->a:Lcom/nothing/widget/ui/NtSwitch;

    iget v1, p0, LX7/n;->b:F

    iget v2, p0, LX7/n;->c:F

    iget v3, p0, LX7/n;->d:I

    iget v4, p0, LX7/n;->e:I

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lcom/nothing/widget/ui/NtSwitch;->a(Lcom/nothing/widget/ui/NtSwitch;FFIILandroid/animation/ValueAnimator;)V

    return-void
.end method
