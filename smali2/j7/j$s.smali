.class public final Lj7/j$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/nothing/wallpaper/segmenter/Segmenter$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j;-><init>(Landroid/content/Context;Lp7/a;Lg3/x;LD6/f;Lx6/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj7/j;


# direct methods
.method constructor <init>(Lj7/j;)V
    .registers 2

    iput-object p1, p0, Lj7/j$s;->a:Lj7/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;)V
    .registers 4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "segmenter state change:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "EditWallpaperViewModel"

    invoke-static {v0, p1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p0, p0, Lj7/j$s;->a:Lj7/j;

    invoke-static {p0}, Lj7/j;->I(Lj7/j;)V

    return-void
.end method
