.class public final Lcom/nothing/wallpaper/picker/creative/AiWallpaperEntranceActivity;
.super LR5/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, LR5/b;-><init>()V

    return-void
.end method

.method public static synthetic R0(Lcom/nothing/wallpaper/picker/creative/AiWallpaperEntranceActivity;Landroid/view/View;)V
    .registers 2

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/picker/creative/AiWallpaperEntranceActivity;->S0(Lcom/nothing/wallpaper/picker/creative/AiWallpaperEntranceActivity;Landroid/view/View;)V

    return-void
.end method

.method private static final S0(Lcom/nothing/wallpaper/picker/creative/AiWallpaperEntranceActivity;Landroid/view/View;)V
    .registers 2

    sget-object p1, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity;->T:Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$a;

    invoke-virtual {p1, p0}, Lcom/nothing/wallpaper/picker/creative/CreativeWallpaperActivity$a;->c(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public K0()Landroidx/fragment/app/q;
    .registers 1

    sget-object p0, Lcom/nothing/wallpaper/picker/creative/a;->r:Lcom/nothing/wallpaper/picker/creative/a$a;

    invoke-virtual {p0}, Lcom/nothing/wallpaper/picker/creative/a$a;->a()Lcom/nothing/wallpaper/picker/creative/a;

    move-result-object p0

    return-object p0
.end method

.method public L0()Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v0, 0x7f1301f2

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "getString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public Q0()Z
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .registers 3

    invoke-super {p0, p1}, LR5/b;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, LR5/b;->J0()Landroid/widget/Button;

    move-result-object p1

    if-eqz p1, :cond_11

    new-instance v0, LS6/a;

    invoke-direct {v0, p0}, LS6/a;-><init>(Lcom/nothing/wallpaper/picker/creative/AiWallpaperEntranceActivity;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_11
    return-void
.end method
