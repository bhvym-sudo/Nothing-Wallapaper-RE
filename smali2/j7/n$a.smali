.class public final Lj7/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/d0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/n;->a(Lp7/a;Lg3/x;Lx6/k;LD6/f;)Landroidx/lifecycle/d0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lp7/a;

.field final synthetic c:Lg3/x;

.field final synthetic d:LD6/f;

.field final synthetic e:Lx6/k;

.field final synthetic f:Z


# direct methods
.method constructor <init>(Lp7/a;Lg3/x;LD6/f;Lx6/k;Z)V
    .registers 6

    iput-object p1, p0, Lj7/n$a;->b:Lp7/a;

    iput-object p2, p0, Lj7/n$a;->c:Lg3/x;

    iput-object p3, p0, Lj7/n$a;->d:LD6/f;

    iput-object p4, p0, Lj7/n$a;->e:Lx6/k;

    iput-boolean p5, p0, Lj7/n$a;->f:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Class;LZ0/a;)Landroidx/lifecycle/a0;
    .registers 12

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lj7/n$a;->b:Lp7/a;

    iget-object v4, p0, Lj7/n$a;->c:Lg3/x;

    iget-object v5, p0, Lj7/n$a;->d:LD6/f;

    iget-object v6, p0, Lj7/n$a;->e:Lx6/k;

    iget-boolean p0, p0, Lj7/n$a;->f:Z

    sget-object v0, Landroidx/lifecycle/d0$a;->h:LZ0/a$b;

    invoke-virtual {p2, v0}, LZ0/a;->a(LZ0/a$b;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_83

    move-object v2, v0

    check-cast v2, Landroid/app/Application;

    const-class v0, Lj7/j;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2d

    new-instance v1, Lj7/j;

    invoke-direct/range {v1 .. v6}, Lj7/j;-><init>(Landroid/content/Context;Lp7/a;Lg3/x;LD6/f;Lx6/k;)V

    return-object v1

    :cond_2d
    const-class v0, Lo7/g;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_58

    if-eqz p0, :cond_58

    invoke-static {p2}, Landroidx/lifecycle/U;->a(LZ0/a;)Landroidx/lifecycle/Q;

    move-result-object v7

    if-eqz v6, :cond_50

    new-instance v1, Lo7/g;

    const-string p0, "null cannot be cast to non-null type com.nothing.wallpaper.effects.data.source.IWallpaperBitmapDataSource"

    invoke-static {v5, p0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, LD6/e;

    move-object v8, v4

    move-object v4, v3

    move-object v3, v8

    move-object v8, v6

    move-object v6, v5

    move-object v5, v8

    invoke-direct/range {v1 .. v7}, Lo7/g;-><init>(Landroid/content/Context;Lg3/x;Lp7/a;Lx6/k;LD6/e;Landroidx/lifecycle/Q;)V

    return-object v1

    :cond_50
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "AssetManager is null when create ImageCropWallpaperViewModel."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_58
    const-class p2, Lo7/h;

    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_68

    if-nez p0, :cond_68

    new-instance p0, Lo7/h;

    invoke-direct {p0, v2, v3, v4, v5}, Lo7/h;-><init>(Landroid/content/Context;Lp7/a;Lg3/x;LD6/f;)V

    return-object p0

    :cond_68
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unknown ViewModel class: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_83
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Required value was null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
