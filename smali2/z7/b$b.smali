.class public final Lz7/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/data/DataFetcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final q:LS5/a;

.field private final r:Landroid/content/Context;

.field private final s:LK6/c;


# direct methods
.method public constructor <init>(LS5/a;Landroid/content/Context;)V
    .registers 4

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/b$b;->q:LS5/a;

    iput-object p2, p0, Lz7/b$b;->r:Landroid/content/Context;

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type com.nothing.wallpaper.module.NTPickerInjector"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LK6/c;

    iput-object p1, p0, Lz7/b$b;->s:LK6/c;

    return-void
.end method


# virtual methods
.method public cancel()V
    .registers 1

    return-void
.end method

.method public cleanup()V
    .registers 1

    return-void
.end method

.method public getDataClass()Ljava/lang/Class;
    .registers 1

    const-class p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public getDataSource()Lcom/bumptech/glide/load/DataSource;
    .registers 1

    sget-object p0, Lcom/bumptech/glide/load/DataSource;->LOCAL:Lcom/bumptech/glide/load/DataSource;

    return-object p0
.end method

.method public loadData(Lcom/bumptech/glide/Priority;Lcom/bumptech/glide/load/data/DataFetcher$DataCallback;)V
    .registers 4

    const-string v0, "priority"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "callback"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lz7/b$b;->q:LS5/a;

    iget-object v0, p0, Lz7/b$b;->r:Landroid/content/Context;

    iget-object p0, p0, Lz7/b$b;->s:LK6/c;

    invoke-virtual {p0, v0}, LK6/c;->J0(Landroid/content/Context;)Lcom/android/launcher3/f;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, LS5/a;->e(Landroid/content/Context;Lcom/android/launcher3/f;)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/bumptech/glide/load/data/DataFetcher$DataCallback;->onDataReady(Ljava/lang/Object;)V

    return-void
.end method
