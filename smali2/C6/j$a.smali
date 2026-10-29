.class public final LC6/j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC6/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, LC6/j$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LC6/j;
    .registers 9

    const/4 p0, 0x0

    if-eqz p1, :cond_54

    invoke-static {p1}, LE8/i;->f0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_54

    :cond_a
    const-string v0, "*|*"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, LE8/i;->D0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, LG6/c;->k(Ljava/lang/String;)F

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Landroid/graphics/Rect;->unflattenFromString(Ljava/lang/String;)Landroid/graphics/Rect;

    move-result-object v1

    if-nez v1, :cond_32

    return-object p0

    :cond_32
    const/4 v2, 0x2

    invoke-static {p1, v2}, Li8/s;->V(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_40

    invoke-static {v2}, LG6/c;->a(Ljava/lang/String;)Landroid/graphics/PointF;

    move-result-object v2

    goto :goto_41

    :cond_40
    move-object v2, p0

    :goto_41
    const/4 v3, 0x3

    invoke-static {p1, v3}, Li8/s;->V(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4e

    invoke-static {p1}, LG6/c;->b(Ljava/lang/String;)Landroid/graphics/Point;

    move-result-object p0

    :cond_4e
    new-instance p1, LC6/j;

    invoke-direct {p1, v0, v1, v2, p0}, LC6/j;-><init>(FLandroid/graphics/Rect;Landroid/graphics/PointF;Landroid/graphics/Point;)V

    return-object p1

    :cond_54
    :goto_54
    return-object p0
.end method
