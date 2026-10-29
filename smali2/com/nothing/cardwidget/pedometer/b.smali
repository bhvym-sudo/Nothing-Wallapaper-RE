.class public final synthetic Lcom/nothing/cardwidget/pedometer/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/pedometer/b;->q:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    iget-object p0, p0, Lcom/nothing/cardwidget/pedometer/b;->q:Landroid/content/Context;

    invoke-static {p0, p1}, Lcom/nothing/cardwidget/pedometer/PedometerContainer;->X(Landroid/content/Context;Landroid/view/View;)V

    return-void
.end method
