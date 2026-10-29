.class public final Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/view/animation/Interpolator;
    .registers 1

    invoke-static {}, Lcom/nothing/wallpaper/picker/edit/preview/widget/WallpaperScreenContainer;->i()Landroid/view/animation/Interpolator;

    move-result-object p0

    return-object p0
.end method
