.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;I)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/S;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;

    iput p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/S;->r:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/S;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;

    iget p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/S;->r:I

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;->T(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortcutPickerPage;I)V

    return-void
.end method
