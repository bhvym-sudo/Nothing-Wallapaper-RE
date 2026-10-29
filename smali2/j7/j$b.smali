.class public abstract synthetic Lj7/j$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj7/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "b"
.end annotation


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .registers 3

    invoke-static {}, Lk7/a;->values()[Lk7/a;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_8
    sget-object v2, Lk7/a;->q:Lk7/a;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_10} :catch_10

    :catch_10
    sput-object v0, Lj7/j$b;->a:[I

    invoke-static {}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->values()[Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_19
    sget-object v2, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->SATISFIED:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_21
    .catch Ljava/lang/NoSuchFieldError; {:try_start_19 .. :try_end_21} :catch_21

    :catch_21
    :try_start_21
    sget-object v1, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->NO_OPAQUE:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_2a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_21 .. :try_end_2a} :catch_2a

    :catch_2a
    :try_start_2a
    sget-object v1, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->EXCEEDED:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_33
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2a .. :try_end_33} :catch_33

    :catch_33
    sput-object v0, Lj7/j$b;->b:[I

    return-void
.end method
