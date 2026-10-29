.class public final synthetic Ly7/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ly7/r;


# direct methods
.method public synthetic constructor <init>(ZLy7/r;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ly7/p;->a:Z

    iput-object p2, p0, Ly7/p;->b:Ly7/r;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 3

    iget-boolean v0, p0, Ly7/p;->a:Z

    iget-object p0, p0, Ly7/p;->b:Ly7/r;

    invoke-static {v0, p0, p1}, Ly7/r;->b(ZLy7/r;Landroid/animation/ValueAnimator;)V

    return-void
.end method
