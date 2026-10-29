.class public final synthetic Ly7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lv8/p;


# direct methods
.method public synthetic constructor <init>(Lv8/p;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/b;->a:Lv8/p;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 2

    iget-object p0, p0, Ly7/b;->a:Lv8/p;

    invoke-static {p0, p1}, Ly7/e;->d(Lv8/p;Landroid/animation/ValueAnimator;)V

    return-void
.end method
