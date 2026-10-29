.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$a;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;ZILjava/lang/Object;)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x1

    :cond_5
    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet$a;->a(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Z)Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;
    .registers 6

    const-string p0, "fragment"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/q;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p0

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7f0d018d

    invoke-virtual {p0, v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type com.nothing.wallpaper.picker.lockscreen.ui.view.WidgetPickerBottomSheet"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->B0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;LE7/a;)V

    invoke-static {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->x0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;)V

    const/4 p1, 0x1

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->C0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;Z)V

    invoke-virtual {p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/c0;->j0(Z)V

    return-object p0
.end method
