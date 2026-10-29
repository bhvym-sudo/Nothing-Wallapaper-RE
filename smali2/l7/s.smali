.class public final synthetic Ll7/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic q:Ll7/v;


# direct methods
.method public synthetic constructor <init>(Ll7/v;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll7/s;->q:Ll7/v;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 3

    iget-object p0, p0, Ll7/s;->q:Ll7/v;

    invoke-static {p0, p1, p2}, Ll7/v;->p1(Ll7/v;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method
