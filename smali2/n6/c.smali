.class public final synthetic Ln6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/C;

.field public final synthetic b:Landroidx/viewpager2/widget/ViewPager2;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/C;Landroidx/viewpager2/widget/ViewPager2;Z)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/c;->a:Lkotlin/jvm/internal/C;

    iput-object p2, p0, Ln6/c;->b:Landroidx/viewpager2/widget/ViewPager2;

    iput-boolean p3, p0, Ln6/c;->c:Z

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 4

    iget-object v0, p0, Ln6/c;->a:Lkotlin/jvm/internal/C;

    iget-object v1, p0, Ln6/c;->b:Landroidx/viewpager2/widget/ViewPager2;

    iget-boolean p0, p0, Ln6/c;->c:Z

    invoke-static {v0, v1, p0, p1}, Ln6/d;->a(Lkotlin/jvm/internal/C;Landroidx/viewpager2/widget/ViewPager2;ZLandroid/animation/ValueAnimator;)V

    return-void
.end method
