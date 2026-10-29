.class final Lj7/j$l;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/j;->V0(Lg3/k;ILandroid/service/wallpaper/IWallpaperEngine;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:Ljava/lang/Object;

.field synthetic r:Ljava/lang/Object;

.field final synthetic s:Lj7/j;

.field t:I


# direct methods
.method constructor <init>(Lj7/j;Lm8/e;)V
    .registers 3

    iput-object p1, p0, Lj7/j$l;->s:Lj7/j;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lm8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iput-object p1, p0, Lj7/j$l;->r:Ljava/lang/Object;

    iget p1, p0, Lj7/j$l;->t:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj7/j$l;->t:I

    iget-object p1, p0, Lj7/j$l;->s:Lj7/j;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, p0}, Lj7/j;->R(Lj7/j;Lg3/k;ILandroid/service/wallpaper/IWallpaperEngine;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
