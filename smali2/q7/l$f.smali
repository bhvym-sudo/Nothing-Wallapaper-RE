.class public final Lq7/l$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq7/l;->g1(Landroid/content/ComponentName;Lr6/g;ILv8/a;)Lr6/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Landroid/view/View;

.field final synthetic r:Lr6/g;


# direct methods
.method public constructor <init>(Landroid/view/View;Lr6/g;)V
    .registers 3

    iput-object p1, p0, Lq7/l$f;->q:Landroid/view/View;

    iput-object p2, p0, Lq7/l$f;->r:Lr6/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .registers 2

    iget-object p1, p0, Lq7/l$f;->q:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p1, p0, Lq7/l$f;->r:Lr6/g;

    invoke-virtual {p1}, Lr6/g;->c0()Z

    iget-object p0, p0, Lq7/l$f;->r:Lr6/g;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lr6/g;->r0(Z)V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .registers 2

    return-void
.end method
