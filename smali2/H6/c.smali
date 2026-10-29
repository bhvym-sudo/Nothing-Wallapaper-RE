.class public final synthetic LH6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic q:Landroid/graphics/drawable/RippleDrawable;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/drawable/RippleDrawable;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH6/c;->q:Landroid/graphics/drawable/RippleDrawable;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 3

    iget-object p0, p0, LH6/c;->q:Landroid/graphics/drawable/RippleDrawable;

    invoke-static {p0, p1, p2}, LH6/d;->a(Landroid/graphics/drawable/RippleDrawable;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method
