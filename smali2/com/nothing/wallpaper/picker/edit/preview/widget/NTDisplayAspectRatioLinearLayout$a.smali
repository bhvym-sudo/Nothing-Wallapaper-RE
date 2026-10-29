.class public final Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;
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
    invoke-direct {p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;II)Landroid/graphics/Point;
    .registers 8

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LH3/s;->a()LH3/s;

    move-result-object p0

    invoke-virtual {p0, p1}, LH3/s;->d(Landroid/content/Context;)F

    move-result p0

    add-int/lit8 p1, p2, -0x1

    mul-int/lit8 p1, p1, 0xc

    sub-int/2addr p3, p1

    div-int/2addr p3, p2

    new-instance p1, Landroid/graphics/Point;

    int-to-float p2, p3

    mul-float/2addr p2, p0

    float-to-double v0, p2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p0, v0

    invoke-direct {p1, p3, p0}, Landroid/graphics/Point;-><init>(II)V

    return-object p1
.end method
