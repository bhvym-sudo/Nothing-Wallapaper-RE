.class public final synthetic Ls6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Ls6/h;

.field public final synthetic r:Landroid/app/WallpaperColors;

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(Ls6/h;Landroid/app/WallpaperColors;I)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/d;->q:Ls6/h;

    iput-object p2, p0, Ls6/d;->r:Landroid/app/WallpaperColors;

    iput p3, p0, Ls6/d;->s:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Ls6/d;->q:Ls6/h;

    iget-object v1, p0, Ls6/d;->r:Landroid/app/WallpaperColors;

    iget p0, p0, Ls6/d;->s:I

    invoke-static {v0, v1, p0}, Ls6/h;->d(Ls6/h;Landroid/app/WallpaperColors;I)V

    return-void
.end method
