.class public final synthetic Lcom/nothing/cardwidget/pedometer/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/cardwidget/pedometer/PedometerContainer;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/cardwidget/pedometer/PedometerContainer;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/a;->q:Lcom/nothing/cardwidget/pedometer/PedometerContainer;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/a;->q:Lcom/nothing/cardwidget/pedometer/PedometerContainer;

    invoke-static {p0}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->e(Lcom/nothing/cardwidget/pedometer/PedometerContainer;)V

    return-void
.end method
