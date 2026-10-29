.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->W(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;

.field final synthetic b:Z


# direct methods
.method public constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;Z)V
    .registers 3

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;

    iput-boolean p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$b;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .registers 10

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->O(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;)Z

    move-result p2

    if-eqz p2, :cond_1e

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    const-string p4, "getContext(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$b;->b:Z

    invoke-static {p2, p3, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->M(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;Landroid/content/Context;Z)I

    move-result p0

    int-to-float p0, p0

    goto :goto_49

    :cond_1e
    iget-boolean p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$b;->b:Z

    if-eqz p2, :cond_34

    iget-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;

    invoke-static {p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->N(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;)Lcom/android/launcher3/f;

    move-result-object p2

    iget p2, p2, Lcom/android/launcher3/f;->n:I

    iget-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;

    invoke-static {p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->N(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;)Lcom/android/launcher3/f;

    move-result-object p3

    iget p3, p3, Lcom/android/launcher3/f;->o:I

    sub-int/2addr p2, p3

    goto :goto_35

    :cond_34
    const/4 p2, 0x0

    :goto_35
    iget-object p3, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;

    invoke-static {p3}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;->N(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;)Lcom/android/launcher3/f;

    move-result-object p3

    iget p3, p3, Lcom/android/launcher3/f;->L:I

    int-to-float p3, p3

    int-to-float p2, p2

    sub-float/2addr p3, p2

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast$b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetSettingsToast;

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    sub-float p0, p3, p0

    :goto_49
    invoke-virtual {p1, p0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method
