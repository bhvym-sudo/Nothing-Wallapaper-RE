.class public final synthetic Lt7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lv8/l;

.field public final synthetic r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;


# direct methods
.method public synthetic constructor <init>(Lv8/l;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/c;->q:Lv8/l;

    iput-object p2, p0, Lt7/c;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lt7/c;->q:Lv8/l;

    iget-object p0, p0, Lt7/c;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;->a(Lv8/l;Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreen;)V

    return-void
.end method
