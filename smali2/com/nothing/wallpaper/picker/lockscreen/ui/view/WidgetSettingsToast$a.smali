.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;
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
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;Ljava/lang/String;ZZ)V
    .registers 8

    const-string p0, "fragment"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "text"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/fragment/app/q;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p0

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7f0d0191

    invoke-virtual {p0, v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type com.nothing.wallpaper.picker.lockscreen.ui.view.WidgetSettingsToast"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->J()Lcom/android/launcher3/dragndrop/DragLayer;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {p0, p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->R(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;Z)V

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->Q(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;LE7/a;)V

    invoke-static {p0, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->S(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    invoke-static {p0, p4}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->P(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;Z)V

    return-void
.end method
