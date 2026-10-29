.class public abstract Lcom/nothing/wallpaper/db/WallpaperDatabase;
.super Lg1/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nothing/wallpaper/db/WallpaperDatabase$a;
    }
.end annotation


# static fields
.field public static final p:Lcom/nothing/wallpaper/db/WallpaperDatabase$a;

.field private static volatile q:Lcom/nothing/wallpaper/db/WallpaperDatabase;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/nothing/wallpaper/db/WallpaperDatabase$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/db/WallpaperDatabase$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lcom/nothing/wallpaper/db/WallpaperDatabase;->p:Lcom/nothing/wallpaper/db/WallpaperDatabase$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lg1/q;-><init>()V

    return-void
.end method

.method public static final synthetic B()Lcom/nothing/wallpaper/db/WallpaperDatabase;
    .registers 1

    sget-object v0, Lcom/nothing/wallpaper/db/WallpaperDatabase;->q:Lcom/nothing/wallpaper/db/WallpaperDatabase;

    return-object v0
.end method

.method public static final synthetic C(Lcom/nothing/wallpaper/db/WallpaperDatabase;)V
    .registers 1

    sput-object p0, Lcom/nothing/wallpaper/db/WallpaperDatabase;->q:Lcom/nothing/wallpaper/db/WallpaperDatabase;

    return-void
.end method


# virtual methods
.method public abstract D()Lu6/a;
.end method

.method public abstract E()Lu6/c;
.end method
