.class public final LG7/v$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LH3/C$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/v;->r(Lg3/k;Lv8/l;Landroid/view/SurfaceView;Lv8/a;)Ls6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Lv8/l;

.field final synthetic r:Lv8/a;


# direct methods
.method constructor <init>(Lv8/l;Lv8/a;)V
    .registers 3

    iput-object p1, p0, LG7/v$e;->q:Lv8/l;

    iput-object p2, p0, LG7/v$e;->r:Lv8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m()V
    .registers 1

    iget-object p0, p0, LG7/v$e;->r:Lv8/a;

    invoke-interface {p0}, Lv8/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public onWallpaperColorsChanged(Landroid/app/WallpaperColors;I)V
    .registers 3

    iget-object p0, p0, LG7/v$e;->q:Lv8/l;

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
