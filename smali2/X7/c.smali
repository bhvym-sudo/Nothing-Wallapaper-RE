.class public final synthetic LX7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Landroid/graphics/drawable/TransitionDrawable;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/drawable/TransitionDrawable;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX7/c;->a:Landroid/graphics/drawable/TransitionDrawable;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 2

    iget-object p0, p0, LX7/c;->a:Landroid/graphics/drawable/TransitionDrawable;

    invoke-static {p0, p1}, Lcom/nothing/widget/ui/NtCheckBox;->e(Landroid/graphics/drawable/TransitionDrawable;Landroid/animation/ValueAnimator;)V

    return-void
.end method
