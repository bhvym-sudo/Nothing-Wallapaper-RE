.class public final synthetic Lr6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lr6/g;

.field public final synthetic r:Landroid/app/WallpaperColors;

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(Lr6/g;Landroid/app/WallpaperColors;I)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr6/c;->q:Lr6/g;

    iput-object p2, p0, Lr6/c;->r:Landroid/app/WallpaperColors;

    iput p3, p0, Lr6/c;->s:I

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lr6/c;->q:Lr6/g;

    iget-object v1, p0, Lr6/c;->r:Landroid/app/WallpaperColors;

    iget p0, p0, Lr6/c;->s:I

    invoke-static {v0, v1, p0}, Lr6/g;->c(Lr6/g;Landroid/app/WallpaperColors;I)V

    return-void
.end method
