.class public final Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private q:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final getNeedInterceptTouchEvent()Z
    .registers 1

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->q:Z

    return p0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .registers 3

    iget-boolean v0, p0, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->q:Z

    if-eqz v0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public final setNeedInterceptTouchEvent(Z)V
    .registers 2

    iput-boolean p1, p0, Lcom/nothing/wallpaper/picker/creative/view/InterceptFrameLayout;->q:Z

    return-void
.end method
