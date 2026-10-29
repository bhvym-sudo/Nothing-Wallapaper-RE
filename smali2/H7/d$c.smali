.class public final LH7/d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH7/d;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:LH7/d;

.field final synthetic c:I

.field final synthetic d:I


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;LH7/d;II)V
    .registers 5

    iput-object p1, p0, LH7/d$c;->a:Landroid/view/ViewGroup;

    iput-object p2, p0, LH7/d$c;->b:LH7/d;

    iput p3, p0, LH7/d$c;->c:I

    iput p4, p0, LH7/d$c;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 10

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object p1, p0, LH7/d$c;->a:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iget-object p2, p0, LH7/d$c;->a:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    iget-object p3, p0, LH7/d$c;->b:LH7/d;

    invoke-static {p3}, LH7/d;->e(LH7/d;)Le3/I;

    move-result-object p3

    invoke-virtual {p3}, Landroidx/databinding/g;->o()Landroid/view/View;

    move-result-object p3

    iget-object p4, p0, LH7/d$c;->b:LH7/d;

    invoke-static {p3}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    iget p5, p0, LH7/d$c;->c:I

    iget p6, p0, LH7/d$c;->d:I

    invoke-static {p4, p3, p5, p6}, LH7/d;->f(LH7/d;Landroid/view/View;II)V

    if-lez p1, :cond_2d

    int-to-float p1, p1

    iget p2, p0, LH7/d$c;->d:I

    :goto_2a
    int-to-float p2, p2

    div-float/2addr p1, p2

    goto :goto_31

    :cond_2d
    int-to-float p1, p2

    iget p2, p0, LH7/d$c;->c:I

    goto :goto_2a

    :goto_31
    invoke-virtual {p3, p1}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {p3, p1}, Landroid/view/View;->setScaleY(F)V

    iget-object p1, p0, LH7/d$c;->b:LH7/d;

    invoke-static {p1}, LH6/a;->d(Landroid/content/Context;)Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_46

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    int-to-float p1, p1

    goto :goto_47

    :cond_46
    move p1, p2

    :goto_47
    invoke-virtual {p3, p1}, Landroid/view/View;->setPivotX(F)V

    invoke-virtual {p3, p2}, Landroid/view/View;->setPivotY(F)V

    iget-object p1, p0, LH7/d$c;->a:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object p0, p0, LH7/d$c;->a:Landroid/view/ViewGroup;

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p3, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    return-void
.end method
