.class public final synthetic LS7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:LS7/c;


# direct methods
.method public synthetic constructor <init>(LS7/c;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS7/b;->a:LS7/c;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 2

    iget-object p0, p0, LS7/b;->a:LS7/c;

    invoke-static {p0, p1}, LS7/c;->D0(LS7/c;Landroid/animation/ValueAnimator;)V

    return-void
.end method
