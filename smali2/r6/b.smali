.class public final synthetic Lr6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lr6/g;

.field public final synthetic r:Landroid/service/wallpaper/IWallpaperEngine;


# direct methods
.method public synthetic constructor <init>(Lr6/g;Landroid/service/wallpaper/IWallpaperEngine;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr6/b;->q:Lr6/g;

    iput-object p2, p0, Lr6/b;->r:Landroid/service/wallpaper/IWallpaperEngine;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Lr6/b;->q:Lr6/g;

    iget-object p0, p0, Lr6/b;->r:Landroid/service/wallpaper/IWallpaperEngine;

    invoke-static {v0, p0}, Lr6/g;->Y(Lr6/g;Landroid/service/wallpaper/IWallpaperEngine;)V

    return-void
.end method
