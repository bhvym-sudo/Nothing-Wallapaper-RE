.class public final LQ7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/wallpaper/segmenter/Segmenter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ7/a$a;
    }
.end annotation


# static fields
.field public static final c:LQ7/a$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:LQ7/s;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LQ7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LQ7/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LQ7/a;->c:LQ7/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ7/a;->a:Landroid/content/Context;

    return-void
.end method

.method public static final synthetic f(LQ7/a;Landroid/graphics/Bitmap;Ljava/nio/FloatBuffer;IILh8/o;Lcom/nothing/wallpaper/segmenter/Segmenter$a;)V
    .registers 7

    invoke-direct/range {p0 .. p6}, LQ7/a;->g(Landroid/graphics/Bitmap;Ljava/nio/FloatBuffer;IILh8/o;Lcom/nothing/wallpaper/segmenter/Segmenter$a;)V

    return-void
.end method

.method private final g(Landroid/graphics/Bitmap;Ljava/nio/FloatBuffer;IILh8/o;Lcom/nothing/wallpaper/segmenter/Segmenter$a;)V
    .registers 9

    sget-object v0, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->a:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->j(Landroid/graphics/Bitmap;I)Z

    move-result v0

    if-eqz v0, :cond_16

    const-string p0, "MLKitSegmenter"

    const-string p1, "segment bitmap is transparent!"

    invoke-static {p0, p1}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectTransparent;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectTransparent;

    invoke-interface {p6, p0}, Lcom/nothing/wallpaper/segmenter/Segmenter$a;->a(Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason;)V

    return-void

    :cond_16
    iget-object v0, p0, LQ7/a;->a:Landroid/content/Context;

    invoke-virtual {p5}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Landroid/graphics/Bitmap;

    invoke-direct {p0, v0, p5, p1, p2}, LQ7/a;->h(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/nio/FloatBuffer;)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-static {p0, p3, p4}, Lj6/d;->d(Landroid/graphics/Bitmap;II)Lh8/o;

    move-result-object p1

    invoke-virtual {p1}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_35

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_35
    invoke-virtual {p1}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    invoke-interface {p6, p0}, Lcom/nothing/wallpaper/segmenter/Segmenter$a;->b(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private final h(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/nio/FloatBuffer;)Landroid/graphics/Bitmap;
    .registers 29

    new-instance v0, Lj6/a$c;

    const v22, 0x3c000

    const/16 v23, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x8

    const/4 v3, 0x1

    const/4 v4, 0x3

    const/4 v5, 0x5

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x3

    const/4 v9, 0x1

    const/4 v10, 0x6

    const/4 v11, 0x4

    const/16 v12, 0x64

    const v13, 0x3e19999a    # 0.15f

    const v14, 0x3f733333    # 0.95f

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v0 .. v23}, Lj6/a$c;-><init>(ZIIIIIZIZIIIFFIIIFZZZILkotlin/jvm/internal/h;)V

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object v4, v0

    move-object/from16 v0, p1

    invoke-static {v0, v1, v2, v3, v4}, Lj6/a;->n(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/nio/FloatBuffer;Lj6/a$c;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .registers 3

    const-string v0, "MLKitSegmenter"

    const-string v1, "init segmenter"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LQ7/a;->b:LQ7/s;

    if-nez v0, :cond_14

    new-instance v0, LQ7/s;

    iget-object v1, p0, LQ7/a;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, LQ7/s;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, LQ7/a;->b:LQ7/s;

    :cond_14
    return-void
.end method

.method public b(Lcom/nothing/wallpaper/segmenter/Segmenter$b;)V
    .registers 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LQ7/a;->b:LQ7/s;

    if-eqz p0, :cond_c

    invoke-virtual {p0, p1}, LQ7/s;->r(Lcom/nothing/wallpaper/segmenter/Segmenter$b;)V

    :cond_c
    return-void
.end method

.method public c()Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;
    .registers 1

    iget-object p0, p0, LQ7/a;->b:LQ7/s;

    if-eqz p0, :cond_c

    invoke-virtual {p0}, LQ7/s;->y()Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;

    move-result-object p0

    if-nez p0, :cond_b

    goto :goto_c

    :cond_b
    return-object p0

    :cond_c
    :goto_c
    sget-object p0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$UnaAvailable;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$UnaAvailable;

    return-object p0
.end method

.method public close()V
    .registers 3

    const-string v0, "MLKitSegmenter"

    const-string v1, "close segmenter"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LQ7/a;->b:LQ7/s;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, LQ7/s;->O()V

    invoke-virtual {v0}, LQ7/s;->w()V

    :cond_11
    const/4 v0, 0x0

    iput-object v0, p0, LQ7/a;->b:LQ7/s;

    return-void
.end method

.method public d(Landroid/graphics/Bitmap;Lcom/nothing/wallpaper/segmenter/Segmenter$a;)Z
    .registers 8

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQ7/a;->b:LQ7/s;

    const-string v1, "MLKitSegmenter"

    const/4 v2, 0x0

    if-eqz v0, :cond_41

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_41

    :cond_18
    const-wide/32 v3, 0x1700000

    invoke-static {p1, v3, v4}, Lj6/d;->e(Landroid/graphics/Bitmap;J)Lh8/o;

    move-result-object v0

    if-nez v0, :cond_2c

    const-string p0, "scale bitmap to max memory error!"

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$InputNull;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$InputNull;

    invoke-interface {p2, p0}, Lcom/nothing/wallpaper/segmenter/Segmenter$a;->a(Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason;)V

    return v2

    :cond_2c
    iget-object v1, p0, LQ7/a;->b:LQ7/s;

    if-eqz v1, :cond_40

    invoke-virtual {v0}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    new-instance v3, LQ7/a$b;

    invoke-direct {v3, v0, p2, p0, p1}, LQ7/a$b;-><init>(Lh8/o;Lcom/nothing/wallpaper/segmenter/Segmenter$a;LQ7/a;Landroid/graphics/Bitmap;)V

    invoke-virtual {v1, v2, v3}, LQ7/s;->I(Landroid/graphics/Bitmap;LQ7/f$a;)Z

    move-result p0

    return p0

    :cond_40
    return v2

    :cond_41
    :goto_41
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "segment fail, segmenter is null, isRecycled is "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$InputNull;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$InputNull;

    invoke-interface {p2, p0}, Lcom/nothing/wallpaper/segmenter/Segmenter$a;->a(Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason;)V

    return v2
.end method

.method public e(Lcom/nothing/wallpaper/segmenter/Segmenter$b;)V
    .registers 3

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LQ7/a;->b:LQ7/s;

    if-eqz p0, :cond_c

    invoke-virtual {p0, p1}, LQ7/s;->N(Lcom/nothing/wallpaper/segmenter/Segmenter$b;)V

    :cond_c
    return-void
.end method
