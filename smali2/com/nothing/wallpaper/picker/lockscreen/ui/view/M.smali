.class public final synthetic Lcom/nothing/wallpaper/picker/lockscreen/ui/view/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;

.field public final synthetic r:LC7/a;


# direct methods
.method public synthetic constructor <init>(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;LC7/a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/M;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;

    iput-object p2, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/M;->r:LC7/a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .registers 4

    iget-object v0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/M;->q:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;

    iget-object p0, p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/M;->r:LC7/a;

    invoke-static {v0, p0, p1, p2}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;->e0(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/ShortCutPickerBottomSheet;LC7/a;Landroid/content/DialogInterface;I)V

    return-void
.end method
