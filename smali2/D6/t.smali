.class public final LD6/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD6/t$a;,
        LD6/t$b;
    }
.end annotation


# static fields
.field public static final h:LD6/t$a;


# instance fields
.field private final a:Landroid/graphics/Point;

.field private final b:Landroid/graphics/Point;

.field private final c:Z

.field private final d:Lq6/b;

.field private final e:Lh8/h;

.field private final f:Lh8/h;

.field private final g:Lh8/h;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LD6/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LD6/t$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LD6/t;->h:LD6/t$a;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Point;Landroid/graphics/Point;Z)V
    .registers 5

    const-string v0, "viewSize"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenSize"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD6/t;->a:Landroid/graphics/Point;

    iput-object p2, p0, LD6/t;->b:Landroid/graphics/Point;

    iput-boolean p3, p0, LD6/t;->c:Z

    new-instance p1, Lq6/b;

    invoke-direct {p1, p0}, Lq6/b;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LD6/t;->d:Lq6/b;

    new-instance p1, LD6/q;

    invoke-direct {p1, p0}, LD6/q;-><init>(LD6/t;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, LD6/t;->e:Lh8/h;

    new-instance p1, LD6/r;

    invoke-direct {p1, p0}, LD6/r;-><init>(LD6/t;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, LD6/t;->f:Lh8/h;

    new-instance p1, LD6/s;

    invoke-direct {p1, p0}, LD6/s;-><init>(LD6/t;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, LD6/t;->g:Lh8/h;

    return-void
.end method

.method public static synthetic a(LD6/t;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, LD6/t;->e(LD6/t;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LD6/t;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, LD6/t;->d(LD6/t;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LD6/t;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, LD6/t;->j(LD6/t;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LD6/t;)Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, LD6/t;->b:Landroid/graphics/Point;

    invoke-static {p0}, LG6/f;->d(Landroid/graphics/Point;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private static final e(LD6/t;)Landroid/graphics/Bitmap;
    .registers 2

    iget-boolean v0, p0, LD6/t;->c:Z

    if-eqz v0, :cond_b

    iget-object p0, p0, LD6/t;->a:Landroid/graphics/Point;

    invoke-static {p0}, LG6/f;->d(Landroid/graphics/Point;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_b
    iget-object p0, p0, LD6/t;->a:Landroid/graphics/Point;

    invoke-static {p0}, LG6/f;->c(Landroid/graphics/Point;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private final g()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, LD6/t;->g:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final h()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, LD6/t;->f:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final i()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, LD6/t;->e:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private static final j(LD6/t;)Landroid/graphics/Bitmap;
    .registers 2

    iget-boolean v0, p0, LD6/t;->c:Z

    if-eqz v0, :cond_b

    iget-object p0, p0, LD6/t;->a:Landroid/graphics/Point;

    invoke-static {p0}, LG6/f;->d(Landroid/graphics/Point;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_b
    iget-object p0, p0, LD6/t;->a:Landroid/graphics/Point;

    invoke-static {p0}, LG6/f;->c(Landroid/graphics/Point;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final f(IILC6/a;)LC6/i;
    .registers 5

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LD6/t$b;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_34

    const/4 v0, 0x2

    if-eq p3, v0, :cond_28

    const/4 v0, 0x3

    if-ne p3, v0, :cond_22

    iget-object p3, p0, LD6/t;->d:Lq6/b;

    const-string v0, "get: reuse depthBitmapCache"

    invoke-virtual {p3, v0}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-direct {p0}, LD6/t;->h()Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_3f

    :cond_22
    new-instance p0, Lh8/m;

    invoke-direct {p0}, Lh8/m;-><init>()V

    throw p0

    :cond_28
    iget-object p3, p0, LD6/t;->d:Lq6/b;

    const-string v0, "get: reuse setterBitmapCache"

    invoke-virtual {p3, v0}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-direct {p0}, LD6/t;->i()Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_3f

    :cond_34
    iget-object p3, p0, LD6/t;->d:Lq6/b;

    const-string v0, "get: reuse blurBitmapCache"

    invoke-virtual {p3, v0}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-direct {p0}, LD6/t;->g()Landroid/graphics/Bitmap;

    move-result-object p0

    :goto_3f
    new-instance p3, LC6/i;

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0, p1, p2}, Landroid/graphics/Point;-><init>(II)V

    invoke-direct {p3, v0, p0}, LC6/i;-><init>(Landroid/graphics/Point;Landroid/graphics/Bitmap;)V

    return-object p3
.end method
