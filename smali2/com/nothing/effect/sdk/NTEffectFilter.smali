.class public final Lcom/nothing/effect/sdk/NTEffectFilter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/effect/sdk/NTEffectFilter$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/nothing/effect/sdk/NTEffectFilter$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/effect/sdk/NTEffectFilter$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/effect/sdk/NTEffectFilter$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/effect/sdk/NTEffectFilter;->a:Lcom/nothing/effect/sdk/NTEffectFilter$a;

    const-string v0, "nt_effect"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .registers 8

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object p0

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    if-ne p0, v0, :cond_9

    return-object p1

    :cond_9
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    new-instance v2, Landroid/graphics/Picture;

    invoke-direct {v2}, Landroid/graphics/Picture;-><init>()V

    invoke-virtual {v2, p0, v1}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object v3

    const-string v4, "beginRecording(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v3, p1, v5, v5, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {v2}, Landroid/graphics/Picture;->endRecording()V

    invoke-static {v2, p0, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Picture;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    const-string p1, "createBitmap(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final native doImageEffect(ILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/Object;)Z
.end method


# virtual methods
.method public final b(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/nothing/effect/sdk/GlassParam;)Landroid/graphics/Bitmap;
    .registers 5

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "out"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1}, Lcom/nothing/effect/sdk/NTEffectFilter;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-direct {p0, v0, p2, p1, p3}, Lcom/nothing/effect/sdk/NTEffectFilter;->doImageEffect(ILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/Object;)Z

    return-object p2
.end method
