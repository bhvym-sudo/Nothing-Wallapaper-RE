.class public final LQ7/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ7/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ7/a;->d(Landroid/graphics/Bitmap;Lcom/nothing/wallpaper/segmenter/Segmenter$a;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh8/o;

.field final synthetic b:Lcom/nothing/wallpaper/segmenter/Segmenter$a;

.field final synthetic c:LQ7/a;

.field final synthetic d:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Lh8/o;Lcom/nothing/wallpaper/segmenter/Segmenter$a;LQ7/a;Landroid/graphics/Bitmap;)V
    .registers 5

    iput-object p1, p0, LQ7/a$b;->a:Lh8/o;

    iput-object p2, p0, LQ7/a$b;->b:Lcom/nothing/wallpaper/segmenter/Segmenter$a;

    iput-object p3, p0, LQ7/a$b;->c:LQ7/a;

    iput-object p4, p0, LQ7/a$b;->d:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .registers 3

    const-string v0, "MLKitSegmenter"

    const-string v1, "onSegment failure"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LQ7/a$b;->a:Lh8/o;

    invoke-virtual {v0}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_20

    iget-object v0, p0, LQ7/a$b;->a:Lh8/o;

    invoke-virtual {v0}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_20
    iget-object p0, p0, LQ7/a$b;->b:Lcom/nothing/wallpaper/segmenter/Segmenter$a;

    sget-object v0, Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectNull;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectNull;

    invoke-interface {p0, v0}, Lcom/nothing/wallpaper/segmenter/Segmenter$a;->a(Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason;)V

    return-void
.end method

.method public b(Lh5/c;)V
    .registers 11

    const-string v0, "subject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lh5/c;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "onSegment success bitmap:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MLKitSegmenter"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lh5/c;->a()Landroid/graphics/Bitmap;

    move-result-object v3

    if-eqz v3, :cond_46

    iget-object v2, p0, LQ7/a$b;->c:LQ7/a;

    iget-object v0, p0, LQ7/a$b;->d:Landroid/graphics/Bitmap;

    iget-object v7, p0, LQ7/a$b;->a:Lh8/o;

    iget-object v8, p0, LQ7/a$b;->b:Lcom/nothing/wallpaper/segmenter/Segmenter$a;

    :try_start_2d
    invoke-virtual {p1}, Lh5/c;->b()Ljava/nio/FloatBuffer;

    move-result-object v4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    invoke-static/range {v2 .. v8}, LQ7/a;->f(LQ7/a;Landroid/graphics/Bitmap;Ljava/nio/FloatBuffer;IILh8/o;Lcom/nothing/wallpaper/segmenter/Segmenter$a;)V
    :try_end_3c
    .catchall {:try_start_2d .. :try_end_3c} :catchall_40

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_52

    :catchall_40
    move-exception v0

    move-object p0, v0

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    throw p0

    :cond_46
    iget-object p1, p0, LQ7/a$b;->b:Lcom/nothing/wallpaper/segmenter/Segmenter$a;

    const-string v0, "segment bitmap is null!"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectNull;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectNull;

    invoke-interface {p1, v0}, Lcom/nothing/wallpaper/segmenter/Segmenter$a;->a(Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason;)V

    :goto_52
    iget-object p1, p0, LQ7/a$b;->a:Lh8/o;

    invoke-virtual {p1}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_6b

    iget-object p0, p0, LQ7/a$b;->a:Lh8/o;

    invoke-virtual {p0}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_6b
    return-void
.end method
