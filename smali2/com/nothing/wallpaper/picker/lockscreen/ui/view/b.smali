.class public final Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;

.field private static final b:Lk6/c;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;

    invoke-direct {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;-><init>()V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;->a:Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;

    new-instance v0, Lk6/c;

    const-string v1, "BitmapRectUtil"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lk6/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;->b:Lk6/c;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;F)Landroid/graphics/Bitmap;
    .registers 8

    const-string p0, "view"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p0

    int-to-float p0, p0

    mul-float/2addr p0, p2

    float-to-int p0, p0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    float-to-int v0, v0

    if-lez p0, :cond_26

    if-gtz v0, :cond_18

    goto :goto_26

    :cond_18
    new-instance v1, Lh8/o;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3b

    :cond_26
    :goto_26
    new-instance v1, Lh8/o;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3b
    invoke-virtual {v1}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v1}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    sget-object v3, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;->b:Lk6/c;

    sget-object v4, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    invoke-virtual {v3, v2, v1, v4}, Lk6/c;->p(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    if-lez p0, :cond_6a

    if-lez v0, :cond_6a

    const/high16 p0, 0x3f800000    # 1.0f

    cmpg-float p0, p2, p0

    if-nez p0, :cond_67

    goto :goto_6a

    :cond_67
    invoke-virtual {v2, p2, p2}, Landroid/graphics/Canvas;->scale(FF)V

    :cond_6a
    :goto_6a
    invoke-virtual {p1, v2}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    return-object v1
.end method

.method public final b(Landroid/graphics/Bitmap;)V
    .registers 2

    const-string p0, "bitmap"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isMutable()Z

    move-result p0

    if-eqz p0, :cond_16

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result p0

    if-nez p0, :cond_16

    sget-object p0, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/b;->b:Lk6/c;

    invoke-virtual {p0, p1}, Lk6/e;->m(Ljava/lang/Object;)V

    :cond_16
    return-void
.end method
