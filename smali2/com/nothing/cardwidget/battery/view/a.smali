.class public final synthetic Lcom/nothing/cardwidget/battery/view/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

.field public final synthetic r:Landroid/graphics/drawable/Drawable;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/graphics/drawable/Drawable;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/view/a;->q:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    iput-object p2, p0, Lcom/nothing/cardwidget/battery/view/a;->r:Landroid/graphics/drawable/Drawable;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/nothing/cardwidget/battery/view/a;->q:Lcom/nothing/cardwidget/battery/view/BatteryCellView;

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/view/a;->r:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p0}, Lcom/nothing/cardwidget/battery/view/BatteryCellView;->b(Lcom/nothing/cardwidget/battery/view/BatteryCellView;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
