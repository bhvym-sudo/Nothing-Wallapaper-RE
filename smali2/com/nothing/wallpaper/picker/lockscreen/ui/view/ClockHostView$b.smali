.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$b;
.super Landroid/util/FloatProperty;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .registers 2

    const-string v0, "fraction"

    invoke-direct {p0, v0}, Landroid/util/FloatProperty;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)Ljava/lang/Float;
    .registers 2

    const-string p0, "host"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->o(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public b(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;F)V
    .registers 3

    const-string p0, "host"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;->q(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;F)V

    return-void
.end method

.method public bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    check-cast p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

    invoke-virtual {p0, p1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$b;->a(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;F)V
    .registers 3

    check-cast p1, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView$b;->b(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostView;F)V

    return-void
.end method
