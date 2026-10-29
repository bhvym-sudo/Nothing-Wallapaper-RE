.class public final synthetic Ly7/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Ly7/o;


# direct methods
.method public synthetic constructor <init>(Ly7/o;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/m;->a:Ly7/o;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 2

    iget-object p0, p0, Ly7/m;->a:Ly7/o;

    invoke-static {p0, p1}, Ly7/o;->b(Ly7/o;Landroid/animation/ValueAnimator;)V

    return-void
.end method
