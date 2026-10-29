.class public final synthetic Ly7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lv8/p;

.field public final synthetic b:LA7/a;


# direct methods
.method public synthetic constructor <init>(Lv8/p;LA7/a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/a;->a:Lv8/p;

    iput-object p2, p0, Ly7/a;->b:LA7/a;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 3

    iget-object v0, p0, Ly7/a;->a:Lv8/p;

    iget-object p0, p0, Ly7/a;->b:LA7/a;

    invoke-static {v0, p0, p1}, Ly7/e;->a(Lv8/p;LA7/a;Landroid/animation/ValueAnimator;)V

    return-void
.end method
