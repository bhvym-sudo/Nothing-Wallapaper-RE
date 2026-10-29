.class public final LC6/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC6/j$a;
    }
.end annotation


# static fields
.field public static final e:LC6/j$a;

.field private static final f:LC6/j;


# instance fields
.field private final a:F

.field private final b:Landroid/graphics/Rect;

.field private final c:Landroid/graphics/PointF;

.field private final d:Landroid/graphics/Point;


# direct methods
.method static constructor <clinit>()V
    .registers 9

    new-instance v0, LC6/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC6/j$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LC6/j;->e:LC6/j$a;

    new-instance v2, LC6/j;

    invoke-static {}, LG6/c;->h()Landroid/graphics/Rect;

    move-result-object v4

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, LC6/j;-><init>(FLandroid/graphics/Rect;Landroid/graphics/PointF;Landroid/graphics/Point;ILkotlin/jvm/internal/h;)V

    sput-object v2, LC6/j;->f:LC6/j;

    return-void
.end method

.method public constructor <init>(FLandroid/graphics/Rect;Landroid/graphics/PointF;Landroid/graphics/Point;)V
    .registers 6

    const-string v0, "rect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LC6/j;->a:F

    .line 3
    iput-object p2, p0, LC6/j;->b:Landroid/graphics/Rect;

    .line 4
    iput-object p3, p0, LC6/j;->c:Landroid/graphics/PointF;

    .line 5
    iput-object p4, p0, LC6/j;->d:Landroid/graphics/Point;

    return-void
.end method

.method public synthetic constructor <init>(FLandroid/graphics/Rect;Landroid/graphics/PointF;Landroid/graphics/Point;ILkotlin/jvm/internal/h;)V
    .registers 8

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_6

    move-object p3, v0

    :cond_6
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_b

    move-object p4, v0

    .line 6
    :cond_b
    invoke-direct {p0, p1, p2, p3, p4}, LC6/j;-><init>(FLandroid/graphics/Rect;Landroid/graphics/PointF;Landroid/graphics/Point;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .registers 5

    iget v0, p0, LC6/j;->a:F

    invoke-static {v0}, LG6/c;->f(F)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LC6/j;->b:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->flattenToString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LC6/j;->c:Landroid/graphics/PointF;

    const-string v3, ""

    if-eqz v2, :cond_18

    invoke-static {v2}, LG6/c;->e(Landroid/graphics/PointF;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_19

    :cond_18
    move-object v2, v3

    :cond_19
    iget-object p0, p0, LC6/j;->d:Landroid/graphics/Point;

    if-eqz p0, :cond_25

    invoke-virtual {p0}, Landroid/graphics/Point;->flattenToString()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_24

    goto :goto_25

    :cond_24
    move-object v3, p0

    :cond_25
    :goto_25
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "*|*"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final b()Landroid/graphics/PointF;
    .registers 1

    iget-object p0, p0, LC6/j;->c:Landroid/graphics/PointF;

    return-object p0
.end method

.method public final c()F
    .registers 1

    iget p0, p0, LC6/j;->a:F

    return p0
.end method

.method public final d()Landroid/graphics/Point;
    .registers 1

    iget-object p0, p0, LC6/j;->d:Landroid/graphics/Point;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_4

    return v0

    :cond_4
    if-eqz p1, :cond_b

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_c

    :cond_b
    const/4 v1, 0x0

    :goto_c
    const-class v2, LC6/j;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_16

    return v2

    :cond_16
    const-string v1, "null cannot be cast to non-null type com.nothing.wallpaper.effects.data.model.Scope"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LC6/j;

    iget v1, p0, LC6/j;->a:F

    iget v3, p1, LC6/j;->a:F

    cmpg-float v1, v1, v3

    if-nez v1, :cond_3c

    iget-object v1, p0, LC6/j;->b:Landroid/graphics/Rect;

    iget-object v3, p1, LC6/j;->b:Landroid/graphics/Rect;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    return v2

    :cond_30
    iget-object p0, p0, LC6/j;->c:Landroid/graphics/PointF;

    iget-object p1, p1, LC6/j;->c:Landroid/graphics/PointF;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3b

    return v2

    :cond_3b
    return v0

    :cond_3c
    return v2
.end method

.method public hashCode()I
    .registers 3

    iget v0, p0, LC6/j;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LC6/j;->b:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object p0, p0, LC6/j;->c:Landroid/graphics/PointF;

    if-eqz p0, :cond_1a

    invoke-virtual {p0}, Landroid/graphics/PointF;->hashCode()I

    move-result p0

    goto :goto_1b

    :cond_1a
    const/4 p0, 0x0

    :goto_1b
    add-int/2addr v0, p0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .registers 6

    iget v0, p0, LC6/j;->a:F

    iget-object v1, p0, LC6/j;->b:Landroid/graphics/Rect;

    iget-object v2, p0, LC6/j;->c:Landroid/graphics/PointF;

    iget-object p0, p0, LC6/j;->d:Landroid/graphics/Point;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Scope(scale="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", rect="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", center="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", viewSize="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
