.class public final LD6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD6/e;


# instance fields
.field private A:Landroid/graphics/Bitmap;

.field private B:Landroid/graphics/Bitmap;

.field private C:LD6/k;

.field private D:LD6/h;

.field private E:F

.field private final F:LI8/z;

.field private final G:LI8/z;

.field private final H:LI8/f;

.field private final I:LI8/z;

.field private final J:LI8/E;

.field private final K:LI8/z;

.field private final L:LI8/f;

.field private final M:LI8/z;

.field private final N:LI8/f;

.field private final O:LI8/z;

.field private final P:LI8/f;

.field private Q:I

.field private R:Z

.field private volatile S:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

.field private volatile T:Z

.field private final q:Landroid/content/Context;

.field private final r:Lg3/x;

.field private final s:Z

.field private final t:Z

.field private final u:Z

.field private final v:Lq6/b;

.field private final w:LF8/L;

.field private x:LD6/p;

.field private y:LD6/h;

.field private z:Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lg3/x;ZZZ)V
    .registers 7

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD6/b;->q:Landroid/content/Context;

    iput-object p2, p0, LD6/b;->r:Lg3/x;

    iput-boolean p3, p0, LD6/b;->s:Z

    iput-boolean p4, p0, LD6/b;->t:Z

    iput-boolean p5, p0, LD6/b;->u:Z

    new-instance p1, Lq6/b;

    invoke-direct {p1, p0}, Lq6/b;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LD6/b;->v:Lq6/b;

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-static {p1, p2, p1}, LF8/T0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object p3

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object p4

    invoke-interface {p3, p4}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object p3

    invoke-static {p3}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object p3

    iput-object p3, p0, LD6/b;->w:LF8/L;

    const/high16 p3, 0x3f800000    # 1.0f

    iput p3, p0, LD6/b;->E:F

    const/4 p3, 0x0

    const/4 p4, 0x6

    invoke-static {p3, p3, p1, p4, p1}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object p5

    iput-object p5, p0, LD6/b;->F:LI8/z;

    invoke-static {p2, p3, p1, p4, p1}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object p5

    iput-object p5, p0, LD6/b;->G:LI8/z;

    iput-object p5, p0, LD6/b;->H:LI8/f;

    invoke-static {p2, p3, p1, p4, p1}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object p5

    iput-object p5, p0, LD6/b;->I:LI8/z;

    invoke-static {p5}, LI8/h;->a(LI8/z;)LI8/E;

    move-result-object p5

    iput-object p5, p0, LD6/b;->J:LI8/E;

    invoke-static {p2, p3, p1, p4, p1}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object p5

    iput-object p5, p0, LD6/b;->K:LI8/z;

    iput-object p5, p0, LD6/b;->L:LI8/f;

    invoke-static {p2, p3, p1, p4, p1}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object p5

    iput-object p5, p0, LD6/b;->M:LI8/z;

    iput-object p5, p0, LD6/b;->N:LI8/f;

    invoke-static {p2, p3, p1, p4, p1}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object p1

    iput-object p1, p0, LD6/b;->O:LI8/z;

    iput-object p1, p0, LD6/b;->P:LI8/f;

    return-void
.end method

.method private final A0()V
    .registers 20

    move-object/from16 v0, p0

    iget-boolean v1, v0, LD6/b;->R:Z

    if-nez v1, :cond_cc

    iget-object v1, v0, LD6/b;->A:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_cc

    iget-object v1, v0, LD6/b;->z:Landroid/graphics/Point;

    if-nez v1, :cond_10

    goto/16 :goto_cc

    :cond_10
    iget-object v1, v0, LD6/b;->q:Landroid/content/Context;

    iget-object v2, v0, LD6/b;->r:Lg3/x;

    invoke-virtual {v2}, Lg3/x;->k()LC6/g;

    move-result-object v3

    iget-object v4, v0, LD6/b;->z:Landroid/graphics/Point;

    const-string v5, "viewSize"

    const/4 v6, 0x0

    if-nez v4, :cond_23

    invoke-static {v5}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v4, v6

    :cond_23
    invoke-static {v3, v4}, LG6/c;->i(LC6/g;Landroid/graphics/Point;)Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v3

    if-eqz v3, :cond_37

    new-instance v4, LD6/a$b;

    invoke-virtual {v3}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result v7

    invoke-virtual {v3}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getCenter()Landroid/graphics/PointF;

    move-result-object v3

    invoke-direct {v4, v7, v3}, LD6/a$b;-><init>(FLandroid/graphics/PointF;)V

    goto :goto_38

    :cond_37
    move-object v4, v6

    :goto_38
    new-instance v3, LD6/p;

    invoke-direct {v3, v1, v2, v4}, LD6/p;-><init>(Landroid/content/Context;Lg3/x;LD6/a$b;)V

    iput-object v3, v0, LD6/b;->x:LD6/p;

    new-instance v1, LD6/h;

    iget-object v2, v0, LD6/b;->w:LF8/L;

    new-instance v3, LD6/b$a;

    invoke-direct {v3, v0, v6}, LD6/b$a;-><init>(LD6/b;Lm8/e;)V

    const-wide/16 v7, 0x0

    invoke-direct {v1, v2, v7, v8, v3}, LD6/h;-><init>(LF8/L;JLv8/p;)V

    iput-object v1, v0, LD6/b;->y:LD6/h;

    new-instance v9, LD6/k;

    iget-object v1, v0, LD6/b;->A:Landroid/graphics/Bitmap;

    if-nez v1, :cond_5c

    const-string v1, "raw"

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v10, v6

    goto :goto_5d

    :cond_5c
    move-object v10, v1

    :goto_5d
    iget-object v11, v0, LD6/b;->q:Landroid/content/Context;

    iget-object v1, v0, LD6/b;->z:Landroid/graphics/Point;

    if-nez v1, :cond_68

    invoke-static {v5}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v12, v6

    goto :goto_69

    :cond_68
    move-object v12, v1

    :goto_69
    iget v13, v0, LD6/b;->E:F

    iget-object v14, v0, LD6/b;->r:Lg3/x;

    iget-boolean v15, v0, LD6/b;->u:Z

    invoke-direct/range {v9 .. v15}, LD6/k;-><init>(Landroid/graphics/Bitmap;Landroid/content/Context;Landroid/graphics/Point;FLg3/x;Z)V

    iput-object v9, v0, LD6/b;->C:LD6/k;

    new-instance v1, LD6/h;

    iget-object v2, v0, LD6/b;->w:LF8/L;

    new-instance v3, LD6/b$b;

    invoke-direct {v3, v0, v6}, LD6/b$b;-><init>(LD6/b;Lm8/e;)V

    invoke-direct {v1, v2, v7, v8, v3}, LD6/h;-><init>(LF8/L;JLv8/p;)V

    iput-object v1, v0, LD6/b;->D:LD6/h;

    iget-object v9, v0, LD6/b;->w:LF8/L;

    new-instance v12, LD6/b$c;

    invoke-direct {v12, v0, v6}, LD6/b$c;-><init>(LD6/b;Lm8/e;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    iget-object v1, v0, LD6/b;->x:LD6/p;

    if-nez v1, :cond_9a

    const-string v1, "colorCalculator"

    invoke-static {v1}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v1, v6

    :cond_9a
    invoke-virtual {v1}, LD6/p;->j()Landroid/app/WallpaperColors;

    move-result-object v1

    if-eqz v1, :cond_ae

    iget-object v7, v0, LD6/b;->w:LF8/L;

    new-instance v10, LD6/b$d;

    invoke-direct {v10, v0, v1, v6}, LD6/b$d;-><init>(LD6/b;Landroid/app/WallpaperColors;Lm8/e;)V

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    :cond_ae
    iget-object v13, v0, LD6/b;->w:LF8/L;

    new-instance v1, LD6/b$e;

    invoke-direct {v1, v0, v6}, LD6/b$e;-><init>(LD6/b;Lm8/e;)V

    const/16 v17, 0x3

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v13 .. v18}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    const/4 v1, 0x1

    iput-boolean v1, v0, LD6/b;->R:Z

    iget-object v1, v0, LD6/b;->S:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    if-eqz v1, :cond_cc

    invoke-virtual {v0, v1}, LD6/b;->y0(Lcom/nothing/wallpaper/effects/data/model/ViewScope;)V

    iput-object v6, v0, LD6/b;->S:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    :cond_cc
    :goto_cc
    return-void
.end method

.method public static final synthetic B(LD6/b;)LI8/z;
    .registers 1

    iget-object p0, p0, LD6/b;->O:LI8/z;

    return-object p0
.end method

.method public static final synthetic G(LD6/b;)LI8/z;
    .registers 1

    iget-object p0, p0, LD6/b;->M:LI8/z;

    return-object p0
.end method

.method public static final synthetic I(LD6/b;)LI8/z;
    .registers 1

    iget-object p0, p0, LD6/b;->G:LI8/z;

    return-object p0
.end method

.method public static final synthetic K(LD6/b;)LI8/z;
    .registers 1

    iget-object p0, p0, LD6/b;->K:LI8/z;

    return-object p0
.end method

.method public static final synthetic Q(LD6/b;)LI8/z;
    .registers 1

    iget-object p0, p0, LD6/b;->I:LI8/z;

    return-object p0
.end method

.method public static final synthetic U(LD6/b;I)V
    .registers 2

    iput p1, p0, LD6/b;->Q:I

    return-void
.end method

.method private final Y()V
    .registers 4

    iget-object v0, p0, LD6/b;->B:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_28

    iget-object v0, p0, LD6/b;->C:LD6/k;

    if-eqz v0, :cond_28

    const/4 v1, 0x0

    const-string v2, "bitmapCropper"

    if-nez v0, :cond_11

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    move-object v0, v1

    :cond_11
    invoke-virtual {v0}, LD6/k;->k()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_28

    iget-object v0, p0, LD6/b;->C:LD6/k;

    if-nez v0, :cond_1f

    invoke-static {v2}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_20

    :cond_1f
    move-object v1, v0

    :goto_20
    iget-object p0, p0, LD6/b;->B:Landroid/graphics/Bitmap;

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-virtual {v1, p0}, LD6/k;->n(Landroid/graphics/Bitmap;)V

    :cond_28
    return-void
.end method

.method public static final synthetic a(LD6/b;)LD6/k;
    .registers 1

    iget-object p0, p0, LD6/b;->C:LD6/k;

    return-object p0
.end method

.method public static final synthetic b(LD6/b;)LD6/h;
    .registers 1

    iget-object p0, p0, LD6/b;->D:LD6/h;

    return-object p0
.end method

.method public static final synthetic f(LD6/b;)LD6/p;
    .registers 1

    iget-object p0, p0, LD6/b;->x:LD6/p;

    return-object p0
.end method

.method public static final synthetic g(LD6/b;)LD6/h;
    .registers 1

    iget-object p0, p0, LD6/b;->y:LD6/h;

    return-object p0
.end method

.method public static final synthetic j(LD6/b;)Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, LD6/b;->B:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method public static final synthetic u(LD6/b;)Lq6/b;
    .registers 1

    iget-object p0, p0, LD6/b;->v:Lq6/b;

    return-object p0
.end method

.method public static final synthetic z(LD6/b;)Landroid/graphics/Point;
    .registers 1

    iget-object p0, p0, LD6/b;->z:Landroid/graphics/Point;

    return-object p0
.end method


# virtual methods
.method public final B0(Z)V
    .registers 6

    iget-boolean v0, p0, LD6/b;->T:Z

    iput-boolean p1, p0, LD6/b;->T:Z

    iget-object v1, p0, LD6/b;->v:Lq6/b;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setSuspendCropUpdates old:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " new:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lq6/b;->a(Ljava/lang/String;)V

    if-eqz v0, :cond_30

    if-nez p1, :cond_30

    iget-object p1, p0, LD6/b;->S:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    if-eqz p1, :cond_30

    const/4 v0, 0x0

    iput-object v0, p0, LD6/b;->S:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-virtual {p0, p1}, LD6/b;->y0(Lcom/nothing/wallpaper/effects/data/model/ViewScope;)V

    :cond_30
    return-void
.end method

.method public F0()LI8/f;
    .registers 1

    iget-object p0, p0, LD6/b;->H:LI8/f;

    return-object p0
.end method

.method public H0()LI8/f;
    .registers 1

    iget-object p0, p0, LD6/b;->L:LI8/f;

    return-object p0
.end method

.method public bridge synthetic J0()LI8/f;
    .registers 1

    invoke-virtual {p0}, LD6/b;->t0()LI8/z;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic M()LI8/f;
    .registers 1

    invoke-virtual {p0}, LD6/b;->w0()LI8/E;

    move-result-object p0

    return-object p0
.end method

.method public N0(Landroid/graphics/Bitmap;)V
    .registers 9

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD6/b;->A:Landroid/graphics/Bitmap;

    iget-object v1, p0, LD6/b;->w:LF8/L;

    new-instance v4, LD6/b$h;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, LD6/b$h;-><init>(LD6/b;Landroid/graphics/Bitmap;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-direct {p0}, LD6/b;->A0()V

    invoke-direct {p0}, LD6/b;->Y()V

    return-void
.end method

.method public S()LI8/f;
    .registers 1

    iget-object p0, p0, LD6/b;->P:LI8/f;

    return-object p0
.end method

.method public final b0()Z
    .registers 1

    iget-boolean p0, p0, LD6/b;->s:Z

    return p0
.end method

.method public close()V
    .registers 4

    iget-object v0, p0, LD6/b;->w:LF8/L;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, LF8/M;->d(LF8/L;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    iget-boolean v0, p0, LD6/b;->R:Z

    if-eqz v0, :cond_19

    iget-object p0, p0, LD6/b;->x:LD6/p;

    if-nez p0, :cond_15

    const-string p0, "colorCalculator"

    invoke-static {p0}, Lkotlin/jvm/internal/n;->r(Ljava/lang/String;)V

    goto :goto_16

    :cond_15
    move-object v2, p0

    :goto_16
    invoke-virtual {v2}, LD6/p;->g()V

    :cond_19
    return-void
.end method

.method public m(Landroid/graphics/Point;F)V
    .registers 4

    const-string v0, "size"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD6/b;->z:Landroid/graphics/Point;

    iput p2, p0, LD6/b;->E:F

    invoke-direct {p0}, LD6/b;->A0()V

    invoke-direct {p0}, LD6/b;->Y()V

    return-void
.end method

.method public o(Landroid/graphics/Bitmap;)V
    .registers 9

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD6/b;->B:Landroid/graphics/Bitmap;

    iget-object v1, p0, LD6/b;->w:LF8/L;

    new-instance v4, LD6/b$g;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, LD6/b$g;-><init>(LD6/b;Landroid/graphics/Bitmap;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-direct {p0}, LD6/b;->Y()V

    return-void
.end method

.method public final q0()Z
    .registers 1

    iget-boolean p0, p0, LD6/b;->t:Z

    return p0
.end method

.method public t()LI8/f;
    .registers 1

    iget-object p0, p0, LD6/b;->N:LI8/f;

    return-object p0
.end method

.method public t0()LI8/z;
    .registers 1

    iget-object p0, p0, LD6/b;->F:LI8/z;

    return-object p0
.end method

.method public v0()I
    .registers 1

    iget p0, p0, LD6/b;->Q:I

    return p0
.end method

.method public w0()LI8/E;
    .registers 1

    iget-object p0, p0, LD6/b;->J:LI8/E;

    return-object p0
.end method

.method public y0(Lcom/nothing/wallpaper/effects/data/model/ViewScope;)V
    .registers 8

    const-string v0, "viewScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LD6/b;->R:Z

    if-nez v0, :cond_c

    iput-object p1, p0, LD6/b;->S:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    return-void

    :cond_c
    iget-boolean v0, p0, LD6/b;->T:Z

    if-eqz v0, :cond_29

    iput-object p1, p0, LD6/b;->S:Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    iget-object p0, p0, LD6/b;->v:Lq6/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onScopeChanged ignored while suspendCropUpdates=true, pending:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->a(Ljava/lang/String;)V

    return-void

    :cond_29
    iget-object v0, p0, LD6/b;->w:LF8/L;

    new-instance v3, LD6/b$f;

    const/4 v1, 0x0

    invoke-direct {v3, p0, p1, v1}, LD6/b$f;-><init>(LD6/b;Lcom/nothing/wallpaper/effects/data/model/ViewScope;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method
