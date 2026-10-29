.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

.field public final synthetic r:Z


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;Z)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/e0;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    iput-boolean p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/e0;->r:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/e0;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;

    iget-boolean p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/e0;->r:Z

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;->v0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/WidgetPickerBottomSheet;Z)V

    return-void
.end method
