.class public final synthetic Ly7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lv8/l;


# direct methods
.method public synthetic constructor <init>(Lv8/l;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/c;->a:Lv8/l;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 2

    iget-object p0, p0, Ly7/c;->a:Lv8/l;

    invoke-static {p0, p1}, Ly7/e;->c(Lv8/l;Landroid/animation/ValueAnimator;)V

    return-void
.end method
