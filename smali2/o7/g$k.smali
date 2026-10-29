.class public final Lo7/g$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/wallpaper/segmenter/Segmenter$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo7/g;-><init>(Landroid/content/Context;Lg3/x;Lp7/a;Lx6/k;LD6/e;Landroidx/lifecycle/Q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo7/g;


# direct methods
.method constructor <init>(Lo7/g;)V
    .registers 2

    iput-object p1, p0, Lo7/g$k;->a:Lo7/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;)V
    .registers 9

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "segmenter state change:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ImageCropViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lo7/g$k;->a:Lo7/g;

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v2

    new-instance v4, Lo7/g$k$a;

    iget-object p0, p0, Lo7/g$k;->a:Lo7/g;

    const/4 v0, 0x0

    invoke-direct {v4, p1, p0, v0}, Lo7/g$k$a;-><init>(Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;Lo7/g;Lm8/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method
