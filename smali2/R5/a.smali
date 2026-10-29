.class public final synthetic LR5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnScrollChangeListener;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/view/View;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR5/a;->a:Landroid/view/View;

    iput-object p2, p0, LR5/a;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onScrollChange(Landroid/view/View;IIII)V
    .registers 13

    iget-object v0, p0, LR5/a;->a:Landroid/view/View;

    iget-object v1, p0, LR5/a;->b:Landroid/view/View;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-static/range {v0 .. v6}, LR5/b;->I0(Landroid/view/View;Landroid/view/View;Landroid/view/View;IIII)V

    return-void
.end method
