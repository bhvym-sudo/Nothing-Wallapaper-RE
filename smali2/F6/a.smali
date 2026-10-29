.class public final LF6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE6/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF6/a$a;,
        LF6/a$b;
    }
.end annotation


# static fields
.field public static final a:LF6/a$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LF6/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LF6/a$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LF6/a;->a:LF6/a$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;LE6/a$a;)Landroid/graphics/Bitmap;
    .registers 12

    const-string p0, "source"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "params"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, LE6/a$a;->b()LC6/e;

    move-result-object p0

    sget-object v0, LC6/e$b;->c:LC6/e$b;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_9b

    instance-of p0, p3, LF6/a$b;

    if-eqz p0, :cond_93

    invoke-static {p1}, LG6/c;->d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p0

    if-eqz p2, :cond_33

    invoke-static {p2}, Lj6/b;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Point;

    move-result-object v0

    invoke-static {p1}, Lj6/b;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Point;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_30

    move-object v0, p2

    goto :goto_31

    :cond_30
    const/4 v0, 0x0

    :goto_31
    if-nez v0, :cond_46

    :cond_33
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v1, "createBitmap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_46
    invoke-static {v0, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "apply for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", reuse "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "GlassEffecter"

    invoke-static {v1, p2}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Lcom/nothing/effect/sdk/NTEffectFilter;

    invoke-direct {p2}, Lcom/nothing/effect/sdk/NTEffectFilter;-><init>()V

    new-instance v1, Lcom/nothing/effect/sdk/GlassParam;

    const/16 v2, 0x20

    int-to-float v2, v2

    check-cast p3, LF6/a$b;

    invoke-virtual {p3}, LF6/a$b;->d()F

    move-result p3

    mul-float/2addr v2, p3

    invoke-static {v2}, Lx8/a;->b(F)I

    move-result v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/nothing/effect/sdk/GlassParam;-><init>(IFFFILkotlin/jvm/internal/h;)V

    invoke-virtual {p2, p0, v0, v1}, Lcom/nothing/effect/sdk/NTEffectFilter;->b(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Lcom/nothing/effect/sdk/GlassParam;)Landroid/graphics/Bitmap;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_92

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_92
    return-object v0

    :cond_93
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "params must be GlassEffecter.Params."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "effect must be Glass."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
