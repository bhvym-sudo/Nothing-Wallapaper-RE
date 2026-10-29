.class public abstract LI6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lq6/b;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lq6/b;

    const-string v1, "WallpaperQuickSet"

    invoke-direct {v0, v1}, Lq6/b;-><init>(Ljava/lang/String;)V

    sput-object v0, LI6/a;->a:Lq6/b;

    return-void
.end method

.method public static final a(I)Z
    .registers 2

    const/4 v0, -0x1

    if-eq p0, v0, :cond_5

    const/4 p0, 0x1

    return p0

    :cond_5
    const/4 p0, 0x0

    return p0
.end method

.method public static final b(LJ6/e;Lh3/x;Landroid/graphics/Bitmap;ZI)I
    .registers 7

    const-string v0, "persister"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_4e

    invoke-virtual {p0}, LJ6/e;->g()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4e

    sget-object v0, LI6/a;->a:Lq6/b;

    const-string v1, "setWallpaperWithCache: try get result from cache"

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, LJ6/e;->f()LJ6/e$a;

    move-result-object p0

    instance-of v1, p0, LJ6/e$a$d;

    if-eqz v1, :cond_3b

    const-string p2, "setWallpaperWithCache: got reusable cache"

    invoke-virtual {v0, p2}, Lq6/b;->a(Ljava/lang/String;)V

    new-instance p2, Ljava/io/ByteArrayInputStream;

    check-cast p0, LJ6/e$a$d;

    invoke-virtual {p0}, LJ6/e$a$d;->a()Ljava/io/ByteArrayOutputStream;

    move-result-object p0

    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {p1, p2, p3, p4}, Lh3/x;->t(Ljava/io/InputStream;ZI)I

    move-result p0

    goto :goto_4f

    :cond_3b
    instance-of p0, p0, LJ6/e$a$a;

    if-eqz p0, :cond_49

    const-string p0, "setWallpaperWithCache: compression is done but no output"

    invoke-virtual {v0, p0}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3, p4}, Lh3/x;->o(Landroid/graphics/Bitmap;ZI)I

    move-result p0

    goto :goto_4f

    :cond_49
    const-string p0, "setWallpaperWithCache: compression was interrupted"

    invoke-virtual {v0, p0}, Lq6/b;->a(Ljava/lang/String;)V

    :cond_4e
    const/4 p0, -0x1

    :goto_4f
    sget-object p1, LI6/a;->a:Lq6/b;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "setWallpaperWithCache: settled wallpaper id is "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq6/b;->f(Ljava/lang/String;)V

    return p0
.end method
