.class public final LQ7/s$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf4/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ7/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field final synthetic a:LQ7/s;


# direct methods
.method public constructor <init>(LQ7/s;)V
    .registers 2

    iput-object p1, p0, LQ7/s$b;->a:LQ7/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lf4/h;)V
    .registers 8

    const-string v0, "update"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lf4/h;->b()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "install state updated:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MLKitSegmenter"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lf4/h;->b()I

    move-result v0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_51

    const/4 v2, 0x3

    if-eq v0, v2, :cond_44

    const/4 v2, 0x4

    if-eq v0, v2, :cond_33

    const/4 v2, 0x5

    if-eq v0, v2, :cond_44

    const/4 v2, 0x6

    if-eq v0, v2, :cond_51

    goto :goto_80

    :cond_33
    iget-object p1, p0, LQ7/s$b;->a:LQ7/s;

    invoke-static {p1}, LQ7/s;->p(LQ7/s;)V

    iget-object p1, p0, LQ7/s$b;->a:LQ7/s;

    invoke-static {p1}, LQ7/s;->n(LQ7/s;)Lf4/d;

    move-result-object p1

    if-eqz p1, :cond_80

    invoke-interface {p1, p0}, Lf4/d;->a(Lf4/a;)Lv4/k;

    return-void

    :cond_44
    iget-object p1, p0, LQ7/s$b;->a:LQ7/s;

    sget-object v0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$UnaAvailable;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$UnaAvailable;

    invoke-static {p1, v0}, LQ7/s;->q(LQ7/s;Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;)V

    iget-object p0, p0, LQ7/s$b;->a:LQ7/s;

    invoke-static {p0}, LQ7/s;->m(LQ7/s;)V

    return-void

    :cond_51
    iget-object p0, p0, LQ7/s$b;->a:LQ7/s;

    sget-object v0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing;->INSTANCE:Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing;

    invoke-static {p0, v0}, LQ7/s;->q(LQ7/s;Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;)V

    invoke-virtual {p1}, Lf4/h;->c()Lf4/h$a;

    move-result-object p0

    if-eqz p0, :cond_80

    invoke-virtual {p0}, Lf4/h$a;->a()J

    move-result-wide v2

    const/16 p1, 0x64

    int-to-long v4, p1

    mul-long/2addr v2, v4

    invoke-virtual {p0}, Lf4/h$a;->b()J

    move-result-wide p0

    div-long/2addr v2, p0

    long-to-int p0, v2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "module downloading progress: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_80
    :goto_80
    return-void
.end method
