.class public final synthetic Lcom/nothing/cardwidget/pedometer/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroid/graphics/drawable/AnimationDrawable;

.field public final synthetic r:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/drawable/AnimationDrawable;Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/c;->q:Landroid/graphics/drawable/AnimationDrawable;

    iput-object p2, p0, Lcom/nothing/cardwidget/pedometer/c;->r:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/nothing/cardwidget/pedometer/c;->q:Landroid/graphics/drawable/AnimationDrawable;

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/c;->r:Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;

    invoke-static {v0, p0}, Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;->f(Landroid/graphics/drawable/AnimationDrawable;Lcom/nothing/cardwidget/pedometer/PedometerViewPagerAdapter$PedometerWalkingViewHolder;)V

    return-void
.end method
