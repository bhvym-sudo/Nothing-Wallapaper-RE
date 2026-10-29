.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/n;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/n;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-static {p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;->l(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ClockHostEditPreview;FF)Lh8/A;

    move-result-object p0

    return-object p0
.end method
