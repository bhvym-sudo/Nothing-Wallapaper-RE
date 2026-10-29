.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

.field public final synthetic b:F

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;FF)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/d0;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    iput p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/d0;->b:F

    iput p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/d0;->c:F

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/d0;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    iget v1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/d0;->b:F

    iget p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/d0;->c:F

    invoke-static {v0, v1, p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->w0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;FFLandroid/animation/ValueAnimator;)V

    return-void
.end method
