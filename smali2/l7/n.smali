.class public final synthetic Ll7/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Ll7/r;


# direct methods
.method public synthetic constructor <init>(Ll7/r;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll7/n;->a:Ll7/r;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 2

    iget-object p0, p0, Ll7/n;->a:Ll7/r;

    invoke-static {p0, p1}, Ll7/r;->q1(Ll7/r;Landroid/animation/ValueAnimator;)V

    return-void
.end method
