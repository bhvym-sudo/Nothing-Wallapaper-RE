.class public final LC6/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC6/i$a;
    }
.end annotation


# static fields
.field public static final h:LC6/i$a;


# instance fields
.field private final a:Landroid/graphics/Point;

.field private final b:Landroid/graphics/Bitmap;

.field private final c:Z

.field private final d:Z

.field private final e:I

.field private final f:I

.field private final g:Landroid/graphics/Point;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LC6/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC6/i$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LC6/i;->h:LC6/i$a;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Point;Landroid/graphics/Bitmap;)V
    .registers 7

    const-string v0, "end"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bitmap"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC6/i;->a:Landroid/graphics/Point;

    iput-object p2, p0, LC6/i;->b:Landroid/graphics/Bitmap;

    iget v0, p1, Landroid/graphics/Point;->x:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_25

    iget v0, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-ne v0, v1, :cond_25

    move v0, v3

    goto :goto_26

    :cond_25
    move v0, v2

    :goto_26
    iput-boolean v0, p0, LC6/i;->c:Z

    iget v0, p1, Landroid/graphics/Point;->x:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-gt v0, v1, :cond_41

    iget v0, p1, Landroid/graphics/Point;->y:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-gt v0, v1, :cond_41

    iget v0, p1, Landroid/graphics/Point;->x:I

    if-lez v0, :cond_41

    iget v0, p1, Landroid/graphics/Point;->y:I

    if-lez v0, :cond_41

    move v2, v3

    :cond_41
    iput-boolean v2, p0, LC6/i;->d:Z

    iget v0, p1, Landroid/graphics/Point;->x:I

    iput v0, p0, LC6/i;->e:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    iput p1, p0, LC6/i;->f:I

    invoke-static {p2}, Lj6/b;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Point;

    move-result-object p1

    iput-object p1, p0, LC6/i;->g:Landroid/graphics/Point;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()Landroid/graphics/Bitmap;
    .registers 5

    monitor-enter p0

    :try_start_1
    iget-boolean v0, p0, LC6/i;->d:Z

    if-eqz v0, :cond_31

    iget-object v0, p0, LC6/i;->a:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->x:I

    iget-object v1, p0, LC6/i;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-lt v0, v1, :cond_20

    iget-object v0, p0, LC6/i;->a:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    iget-object v1, p0, LC6/i;->b:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-ge v0, v1, :cond_31

    goto :goto_20

    :catchall_1e
    move-exception v0

    goto :goto_35

    :cond_20
    :goto_20
    iget-object v0, p0, LC6/i;->b:Landroid/graphics/Bitmap;

    iget-object v1, p0, LC6/i;->a:Landroid/graphics/Point;

    iget v2, v1, Landroid/graphics/Point;->x:I

    iget v1, v1, Landroid/graphics/Point;->y:I

    const/4 v3, 0x0

    invoke-static {v0, v3, v3, v2, v1}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    goto :goto_33

    :cond_31
    iget-object v0, p0, LC6/i;->b:Landroid/graphics/Bitmap;
    :try_end_33
    .catchall {:try_start_1 .. :try_end_33} :catchall_1e

    :goto_33
    monitor-exit p0

    return-object v0

    :goto_35
    :try_start_35
    monitor-exit p0
    :try_end_36
    .catchall {:try_start_35 .. :try_end_36} :catchall_1e

    throw v0
.end method

.method public final b()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, LC6/i;->b:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public final c()Landroid/graphics/Point;
    .registers 1

    iget-object p0, p0, LC6/i;->a:Landroid/graphics/Point;

    return-object p0
.end method

.method public final d()I
    .registers 1

    iget p0, p0, LC6/i;->f:I

    return p0
.end method

.method public final e()I
    .registers 1

    iget p0, p0, LC6/i;->e:I

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    instance-of v1, p1, LC6/i;

    const/4 v2, 0x0

    if-nez v1, :cond_a

    return v2

    :cond_a
    check-cast p1, LC6/i;

    iget-object v1, p0, LC6/i;->a:Landroid/graphics/Point;

    iget-object v3, p1, LC6/i;->a:Landroid/graphics/Point;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object p0, p0, LC6/i;->b:Landroid/graphics/Bitmap;

    iget-object p1, p1, LC6/i;->b:Landroid/graphics/Bitmap;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_22

    return v2

    :cond_22
    return v0
.end method

.method public final f()Z
    .registers 1

    iget-boolean p0, p0, LC6/i;->c:Z

    return p0
.end method

.method public final g()Z
    .registers 1

    iget-boolean p0, p0, LC6/i;->d:Z

    return p0
.end method

.method public hashCode()I
    .registers 2

    iget-object v0, p0, LC6/i;->a:Landroid/graphics/Point;

    invoke-virtual {v0}, Landroid/graphics/Point;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, LC6/i;->b:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    iget-object v0, p0, LC6/i;->a:Landroid/graphics/Point;

    iget-object p0, p0, LC6/i;->b:Landroid/graphics/Bitmap;

    invoke-static {p0}, Lj6/b;->c(Landroid/graphics/Bitmap;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RegionBitmap(end="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bitmap="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
