.class public final Lo7/g$i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/wallpaper/segmenter/Segmenter$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/g$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo7/g;

.field final synthetic b:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Lo7/g;Landroid/graphics/Bitmap;)V
    .registers 3

    iput-object p1, p0, Lo7/g$i$a;->a:Lo7/g;

    iput-object p2, p0, Lo7/g$i$a;->b:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason;)V
    .registers 8

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo7/g$i$a;->a:Lo7/g;

    invoke-static {v0}, Lo7/g;->J(Lo7/g;)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "segment wallpaper failed, reason:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " count:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ImageCropViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    instance-of p1, p1, Lcom/nothing/wallpaper/segmenter/Segmenter$FailReason$SubjectTransparent;

    if-nez p1, :cond_5d

    iget-object p1, p0, Lo7/g$i$a;->a:Lo7/g;

    invoke-static {p1}, Lo7/g;->J(Lo7/g;)I

    move-result p1

    const/4 v0, 0x3

    if-ge p1, v0, :cond_5d

    iget-object p1, p0, Lo7/g$i$a;->a:Lo7/g;

    invoke-static {p1}, Lo7/g;->J(Lo7/g;)I

    move-result p1

    iget-object v0, p0, Lo7/g$i$a;->a:Lo7/g;

    add-int/lit8 p1, p1, 0x1

    invoke-static {v0, p1}, Lo7/g;->Q(Lo7/g;I)V

    iget-object p1, p0, Lo7/g$i$a;->a:Lo7/g;

    invoke-static {p1}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v1

    new-instance v3, Lo7/g$i$a$a;

    iget-object p1, p0, Lo7/g$i$a;->a:Lo7/g;

    iget-object p0, p0, Lo7/g$i$a;->b:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    invoke-direct {v3, p1, p0, v2}, Lo7/g$i$a$a;-><init>(Lo7/g;Landroid/graphics/Bitmap;Lm8/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void

    :cond_5d
    iget-object p0, p0, Lo7/g$i$a;->a:Lo7/g;

    invoke-static {p0}, Lo7/g;->N(Lo7/g;)LI8/A;

    move-result-object p0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Landroid/graphics/Bitmap;)V
    .registers 8

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lo7/g$i$a;->a:Lo7/g;

    invoke-static {v0}, Lo7/g;->E(Lo7/g;)LD6/e;

    move-result-object v0

    invoke-interface {v0, p1}, LD6/e;->o(Landroid/graphics/Bitmap;)V

    iget-object v0, p0, Lo7/g$i$a;->a:Lo7/g;

    invoke-static {v0}, Lo7/g;->D(Lo7/g;)Lx6/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx6/k;->A(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lo7/g$i$a;->a:Lo7/g;

    invoke-static {p1}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    new-instance v3, Lo7/g$i$a$b;

    iget-object p1, p0, Lo7/g$i$a;->a:Lo7/g;

    const/4 v1, 0x0

    invoke-direct {v3, p1, v1}, Lo7/g$i$a$b;-><init>(Lo7/g;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    iget-object p0, p0, Lo7/g$i$a;->a:Lo7/g;

    invoke-static {p0}, Lo7/g;->N(Lo7/g;)LI8/A;

    move-result-object p0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void
.end method
