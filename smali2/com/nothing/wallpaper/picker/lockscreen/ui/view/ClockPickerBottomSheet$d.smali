.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->q(ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;

.field final synthetic b:Z


# direct methods
.method public constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;Z)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;

    iput-boolean p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$d;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 10

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$d;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet$d;->b:Z

    const/4 p2, 0x0

    invoke-virtual {p1, p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockPickerBottomSheet;->q(ZZ)V

    return-void
.end method
