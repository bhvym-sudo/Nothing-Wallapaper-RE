.class public final LD6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD6/g;


# instance fields
.field private final q:Lw6/a;

.field private final r:Lq6/b;

.field private final s:LF8/L;

.field private final t:LI8/z;

.field private final u:LI8/f;

.field private v:LF8/x0;

.field private final w:Ljava/lang/Object;

.field private volatile x:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Lw6/a;)V
    .registers 5

    const-string v0, "effectApply"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD6/d;->q:Lw6/a;

    new-instance p1, Lq6/b;

    invoke-direct {p1, p0}, Lq6/b;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LD6/d;->r:Lq6/b;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {p1, v0, p1}, LF8/T0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object v1

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v2

    invoke-interface {v1, v2}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object v1

    invoke-static {v1}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object v1

    iput-object v1, p0, LD6/d;->s:LF8/L;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {v0, v1, p1, v2, p1}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object p1

    iput-object p1, p0, LD6/d;->t:LI8/z;

    iput-object p1, p0, LD6/d;->u:LI8/f;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD6/d;->w:Ljava/lang/Object;

    return-void
.end method

.method private final B(LC6/b;LC6/e;)Lw6/c;
    .registers 4

    invoke-virtual {p1}, LC6/b;->d()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p0

    invoke-virtual {p0}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getViewSize()Landroid/graphics/Point;

    move-result-object p0

    iget p0, p0, Landroid/graphics/Point;->x:I

    invoke-virtual {p1}, LC6/b;->b()LC6/d;

    move-result-object p2

    invoke-virtual {p2}, LC6/d;->g()Landroid/graphics/Rect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result p2

    int-to-float p2, p2

    const/high16 v0, 0x3f800000    # 1.0f

    mul-float/2addr p2, v0

    int-to-float p0, p0

    div-float/2addr p2, p0

    new-instance p0, Lw6/c;

    invoke-static {p1}, LG6/c;->l(LC6/b;)LC6/j;

    move-result-object p1

    sget-object v0, LF6/a$b;->d:LF6/a$b$a;

    invoke-virtual {v0, p2}, LF6/a$b$a;->a(F)LF6/a$b;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lw6/c;-><init>(LC6/j;LE6/a$a;)V

    return-object p0
.end method

.method public static final synthetic a(LD6/d;LC6/b;LC6/e;)Lw6/c;
    .registers 3

    invoke-direct {p0, p1, p2}, LD6/d;->B(LC6/b;LC6/e;)Lw6/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LD6/d;)Ljava/lang/Object;
    .registers 1

    iget-object p0, p0, LD6/d;->w:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic f(LD6/d;)Lw6/a;
    .registers 1

    iget-object p0, p0, LD6/d;->q:Lw6/a;

    return-object p0
.end method

.method public static final synthetic g(LD6/d;)Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, LD6/d;->x:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public static final synthetic j(LD6/d;)Lq6/b;
    .registers 1

    iget-object p0, p0, LD6/d;->r:Lq6/b;

    return-object p0
.end method

.method public static final synthetic u(LD6/d;)LI8/z;
    .registers 1

    iget-object p0, p0, LD6/d;->t:LI8/z;

    return-object p0
.end method

.method public static final synthetic z(LD6/d;Landroid/graphics/Bitmap;)V
    .registers 2

    iput-object p1, p0, LD6/d;->x:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public E(LC6/b;Ljava/util/List;)V
    .registers 12

    const-string v0, "cb"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requests"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD6/d;->t:LI8/z;

    invoke-interface {v0}, LI8/z;->g()V

    iget-object v2, p0, LD6/d;->v:LF8/x0;

    iget-object v0, p0, LD6/d;->s:LF8/L;

    new-instance v1, LD6/d$a;

    const/4 v6, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, LD6/d$a;-><init>(LF8/x0;Ljava/util/List;LD6/d;LC6/b;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, v0

    move-object v6, v1

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p1

    iput-object p1, p0, LD6/d;->v:LF8/x0;

    return-void
.end method

.method public N()LI8/f;
    .registers 1

    iget-object p0, p0, LD6/d;->u:LI8/f;

    return-object p0
.end method

.method public close()V
    .registers 4

    iget-object v0, p0, LD6/d;->s:LF8/L;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LF8/M;->d(LF8/L;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    iget-object p0, p0, LD6/d;->q:Lw6/a;

    invoke-virtual {p0}, Lw6/a;->b()V

    return-void
.end method
