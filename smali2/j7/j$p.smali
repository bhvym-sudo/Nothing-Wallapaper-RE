.class public final Lj7/j$p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/U$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j;->Z0(Landroid/app/Activity;Ljava/util/List;ILandroid/service/wallpaper/IWallpaperEngine;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lj7/j;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:LD6/b;

.field final synthetic d:Lkotlin/jvm/internal/E;

.field final synthetic e:Lkotlin/jvm/internal/E;

.field final synthetic f:Ljava/util/List;

.field final synthetic g:Lkotlin/jvm/internal/E;

.field final synthetic h:I

.field final synthetic i:I


# direct methods
.method constructor <init>(Lj7/j;Landroid/app/Activity;LD6/b;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;Ljava/util/List;Lkotlin/jvm/internal/E;II)V
    .registers 10

    iput-object p1, p0, Lj7/j$p;->a:Lj7/j;

    iput-object p2, p0, Lj7/j$p;->b:Landroid/app/Activity;

    iput-object p3, p0, Lj7/j$p;->c:LD6/b;

    iput-object p4, p0, Lj7/j$p;->d:Lkotlin/jvm/internal/E;

    iput-object p5, p0, Lj7/j$p;->e:Lkotlin/jvm/internal/E;

    iput-object p6, p0, Lj7/j$p;->f:Ljava/util/List;

    iput-object p7, p0, Lj7/j$p;->g:Lkotlin/jvm/internal/E;

    iput p8, p0, Lj7/j$p;->h:I

    iput p9, p0, Lj7/j$p;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .registers 6

    iget-object v0, p0, Lj7/j$p;->a:Lj7/j;

    invoke-static {v0}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object v0

    iget v1, p0, Lj7/j$p;->i:I

    invoke-static {v1}, LG6/g;->b(I)Ljava/lang/String;

    move-result-object v1

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_14

    :cond_13
    const/4 p1, 0x0

    :goto_14
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "set wallpaper to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " failed, msg:"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lq6/b;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lj7/j$p;->c:LD6/b;

    if-eqz p1, :cond_38

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LD6/b;->B0(Z)V

    :cond_38
    iget-object p1, p0, Lj7/j$p;->a:Lj7/j;

    iget v0, p0, Lj7/j$p;->i:I

    iget p0, p0, Lj7/j$p;->h:I

    invoke-static {p1, v0, p0}, Lj7/j;->G(Lj7/j;II)V

    return-void
.end method

.method public b(Lg3/x;I)V
    .registers 11

    iget-object v0, p0, Lj7/j$p;->a:Lj7/j;

    invoke-static {v0}, Lj7/j;->x(Lj7/j;)Lq6/b;

    move-result-object v0

    if-eqz p1, :cond_f

    iget-object v1, p0, Lj7/j$p;->b:Landroid/app/Activity;

    invoke-static {p1, v1}, LG6/g;->d(Lg3/x;Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    goto :goto_10

    :cond_f
    const/4 p1, 0x0

    :goto_10
    invoke-static {p2}, LG6/g;->b(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "set "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " success."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lq6/b;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lj7/j$p;->c:LD6/b;

    const/4 v0, 0x0

    if-eqz p1, :cond_3d

    invoke-virtual {p1, v0}, LD6/b;->B0(Z)V

    :cond_3d
    iget-object v1, p0, Lj7/j$p;->a:Lj7/j;

    iget-object p1, p0, Lj7/j$p;->d:Lkotlin/jvm/internal/E;

    iget-object p1, p1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    iget-object p1, p0, Lj7/j$p;->e:Lkotlin/jvm/internal/E;

    iget-object p1, p1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroid/app/WallpaperColors;

    iget-object v5, p0, Lj7/j$p;->f:Ljava/util/List;

    iget-object p1, p0, Lj7/j$p;->g:Lkotlin/jvm/internal/E;

    iget-object p1, p1, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    if-eqz p1, :cond_56

    const/4 v0, 0x1

    :cond_56
    move v6, v0

    iget v7, p0, Lj7/j$p;->h:I

    move v2, p2

    invoke-static/range {v1 .. v7}, Lj7/j;->H(Lj7/j;ILjava/lang/String;Landroid/app/WallpaperColors;Ljava/util/List;ZI)V

    return-void
.end method
