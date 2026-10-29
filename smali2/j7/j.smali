.class public final Lj7/j;
.super Landroidx/lifecycle/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj7/j$a;,
        Lj7/j$b;
    }
.end annotation


# static fields
.field public static final T:Lj7/j$a;


# instance fields
.field private A:LF8/x0;

.field private final B:Z

.field private final C:Z

.field private final D:Z

.field private final E:Z

.field private final F:Lh8/h;

.field private final G:Lh8/h;

.field private final H:Lh8/h;

.field private final I:Lh8/h;

.field private J:Ljava/lang/Boolean;

.field private K:Z

.field private final L:LI8/A;

.field private final M:LI8/O;

.field private N:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

.field private volatile O:Landroid/graphics/Bitmap;

.field private volatile P:LC6/b;

.field private Q:LF8/x0;

.field private final R:Lj7/j$s;

.field private final S:Lh8/h;

.field private final b:Landroid/content/Context;

.field private final c:Lp7/a;

.field private final d:Lg3/x;

.field private final e:LD6/f;

.field private final f:Lx6/k;

.field private final g:Lq6/b;

.field private h:Lo7/b;

.field private i:LJ7/i;

.field private final j:LK1/a;

.field private final k:Lh8/h;

.field private l:LD6/g;

.field private final m:LI8/z;

.field private final n:LJ6/e;

.field private final o:LI8/f;

.field private final p:LI8/f;

.field private final q:LI8/z;

.field private final r:LI8/f;

.field private final s:Ljava/util/Set;

.field private final t:LI8/z;

.field private final u:LI8/f;

.field private final v:Landroidx/lifecycle/H;

.field private final w:Landroidx/lifecycle/C;

.field private x:LF8/x0;

.field private final y:Lh8/h;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lj7/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj7/j$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lj7/j;->T:Lj7/j$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lp7/a;Lg3/x;LD6/f;Lx6/k;)V
    .registers 13

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editFrom"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperDataSource"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {p4}, [Ljava/lang/AutoCloseable;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/lifecycle/a0;-><init>([Ljava/lang/AutoCloseable;)V

    iput-object p1, p0, Lj7/j;->b:Landroid/content/Context;

    iput-object p2, p0, Lj7/j;->c:Lp7/a;

    iput-object p3, p0, Lj7/j;->d:Lg3/x;

    iput-object p4, p0, Lj7/j;->e:LD6/f;

    iput-object p5, p0, Lj7/j;->f:Lx6/k;

    new-instance p5, Lq6/b;

    const-string v0, "EditWallpaperViewModel"

    invoke-direct {p5, v0}, Lq6/b;-><init>(Ljava/lang/String;)V

    iput-object p5, p0, Lj7/j;->g:Lq6/b;

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.android.customization.module.CustomizationInjector"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LK1/a;

    iput-object v0, p0, Lj7/j;->j:LK1/a;

    new-instance v0, Lj7/b;

    invoke-direct {v0, p0}, Lj7/b;-><init>(Lj7/j;)V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lj7/j;->k:Lh8/h;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v1, v2, v3, v2}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object v4

    iput-object v4, p0, Lj7/j;->m:LI8/z;

    new-instance v5, LJ6/e;

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v6

    invoke-direct {v5, v6}, LJ6/e;-><init>(LF8/L;)V

    iput-object v5, p0, Lj7/j;->n:LJ6/e;

    instance-of v5, p4, LD6/e;

    if-eqz v5, :cond_65

    new-instance v5, Lj7/j$q;

    invoke-direct {v5, v4}, Lj7/j$q;-><init>(LI8/f;)V

    goto :goto_6e

    :cond_65
    new-instance v4, Lj7/j$v;

    invoke-direct {v4, v2}, Lj7/j$v;-><init>(Lm8/e;)V

    invoke-static {v4}, LI8/h;->A(Lv8/p;)LI8/f;

    move-result-object v5

    :goto_6e
    iput-object v5, p0, Lj7/j;->o:LI8/f;

    invoke-interface {p4}, LD6/f;->S()LI8/f;

    move-result-object p4

    iput-object p4, p0, Lj7/j;->p:LI8/f;

    invoke-static {v0, v1, v2, v3, v2}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object p4

    iput-object p4, p0, Lj7/j;->q:LI8/z;

    iput-object p4, p0, Lj7/j;->r:LI8/f;

    invoke-static {v0, v1, v2, v3, v2}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object p4

    iput-object p4, p0, Lj7/j;->t:LI8/z;

    new-instance v3, Lj7/j$r;

    invoke-direct {v3, p4}, Lj7/j$r;-><init>(LI8/f;)V

    iput-object v3, p0, Lj7/j;->u:LI8/f;

    new-instance p4, Landroidx/lifecycle/H;

    sget-object v3, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$None;->INSTANCE:Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$None;

    invoke-direct {p4, v3}, Landroidx/lifecycle/H;-><init>(Ljava/lang/Object;)V

    iput-object p4, p0, Lj7/j;->v:Landroidx/lifecycle/H;

    iput-object p4, p0, Lj7/j;->w:Landroidx/lifecycle/C;

    new-instance p4, Lj7/c;

    invoke-direct {p4, p0}, Lj7/c;-><init>(Lj7/j;)V

    invoke-static {p4}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p4

    iput-object p4, p0, Lj7/j;->y:Lh8/h;

    sget-object p4, LF6/a;->a:LF6/a$a;

    invoke-virtual {p4}, LF6/a$a;->a()Z

    move-result p4

    iput-boolean p4, p0, Lj7/j;->B:Z

    sget-object p4, Lp7/a$b;->b:Lp7/a$b;

    invoke-static {p2, p4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/2addr v3, v0

    iput-boolean v3, p0, Lj7/j;->C:Z

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v3

    invoke-interface {v3}, Lh3/H;->C()Ld3/a;

    move-result-object v3

    invoke-virtual {v3}, Ld3/a;->p()Z

    move-result v3

    iput-boolean v3, p0, Lj7/j;->D:Z

    invoke-virtual {p3}, Lg3/x;->s()Z

    move-result v4

    if-nez v4, :cond_c9

    if-eqz v3, :cond_c9

    goto :goto_ca

    :cond_c9
    move v0, v1

    :goto_ca
    iput-boolean v0, p0, Lj7/j;->E:Z

    new-instance v1, Lj7/d;

    invoke-direct {v1}, Lj7/d;-><init>()V

    invoke-static {v1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v1

    iput-object v1, p0, Lj7/j;->F:Lh8/h;

    new-instance v1, Lj7/e;

    invoke-direct {v1, p0}, Lj7/e;-><init>(Lj7/j;)V

    invoke-static {v1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v1

    iput-object v1, p0, Lj7/j;->G:Lh8/h;

    new-instance v1, Lj7/f;

    invoke-direct {v1, p0}, Lj7/f;-><init>(Lj7/j;)V

    invoke-static {v1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v1

    iput-object v1, p0, Lj7/j;->H:Lh8/h;

    new-instance v1, Lj7/g;

    invoke-direct {v1, p0}, Lj7/g;-><init>(Lj7/j;)V

    invoke-static {v1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v1

    iput-object v1, p0, Lj7/j;->I:Lh8/h;

    sget-object v1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$Initializing;->INSTANCE:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$Initializing;

    invoke-static {v1}, LI8/Q;->a(Ljava/lang/Object;)LI8/A;

    move-result-object v1

    iput-object v1, p0, Lj7/j;->L:LI8/A;

    invoke-static {v1}, LI8/h;->b(LI8/A;)LI8/O;

    move-result-object v1

    iput-object v1, p0, Lj7/j;->M:LI8/O;

    new-instance v1, Lj7/j$s;

    invoke-direct {v1, p0}, Lj7/j$s;-><init>(Lj7/j;)V

    iput-object v1, p0, Lj7/j;->R:Lj7/j$s;

    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-virtual {p3}, Lg3/x;->s()Z

    move-result v4

    if-eqz v4, :cond_11d

    sget-object v4, Lk7/a;->q:Lk7/a;

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_11d
    invoke-static {p3, p1}, LG6/e;->g(Lg3/x;Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_13c

    invoke-static {p3}, LG6/e;->i(Lg3/x;)Z

    move-result v4

    if-nez v4, :cond_137

    sget-object v4, Lp7/a$a;->b:Lp7/a$a;

    invoke-static {p2, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_13c

    invoke-static {p3, p1}, LG6/e;->q(Lg3/x;Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_13c

    :cond_137
    sget-object p1, Lk7/a;->r:Lk7/a;

    invoke-interface {v3, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_13c
    iput-object v3, p0, Lj7/j;->s:Ljava/util/Set;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "defaultEffects:"

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p5, p1}, Lq6/b;->a(Ljava/lang/String;)V

    invoke-static {p2, p4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_15e

    invoke-static {p3}, LG6/e;->i(Lg3/x;)Z

    move-result p1

    if-eqz p1, :cond_174

    :cond_15e
    new-instance p1, Lj7/h;

    invoke-direct {p1, p0}, Lj7/h;-><init>(Lj7/j;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    invoke-static {p1}, Lj7/j;->o(Lh8/h;)Lw6/a;

    move-result-object p1

    if-eqz p1, :cond_172

    new-instance v2, LD6/d;

    invoke-direct {v2, p1}, LD6/d;-><init>(Lw6/a;)V

    :cond_172
    iput-object v2, p0, Lj7/j;->l:LD6/g;

    :cond_174
    if-eqz v0, :cond_17d

    invoke-direct {p0}, Lj7/j;->t0()Lcom/nothing/wallpaper/segmenter/Segmenter;

    move-result-object p1

    invoke-interface {p1, v1}, Lcom/nothing/wallpaper/segmenter/Segmenter;->b(Lcom/nothing/wallpaper/segmenter/Segmenter$b;)V

    :cond_17d
    invoke-virtual {p0}, Lj7/j;->M0()V

    invoke-direct {p0}, Lj7/j;->F0()V

    new-instance p1, Lj7/i;

    invoke-direct {p1, p0}, Lj7/i;-><init>(Lj7/j;)V

    invoke-static {p1}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object p1

    iput-object p1, p0, Lj7/j;->S:Lh8/h;

    return-void
.end method

.method public static final synthetic A(Lj7/j;Lm8/e;)Ljava/lang/Object;
    .registers 2

    invoke-direct {p0, p1}, Lj7/j;->v0(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final A0(II)V
    .registers 6

    iget-object v0, p0, Lj7/j;->x:LF8/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_9
    iput-object v1, p0, Lj7/j;->x:LF8/x0;

    new-instance v0, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$End;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$End;-><init>(Z)V

    invoke-direct {p0, v0}, Lj7/j;->X0(Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)V

    invoke-direct {p0, p1, p2}, Lj7/j;->T0(II)V

    invoke-static {}, Lj7/m;->e()V

    return-void
.end method

.method public static final synthetic B(Lj7/j;)LD6/g;
    .registers 1

    iget-object p0, p0, Lj7/j;->l:LD6/g;

    return-object p0
.end method

.method private final B0(ILjava/lang/String;Landroid/app/WallpaperColors;Ljava/util/List;ZI)V
    .registers 19

    iget-object v0, p0, Lj7/j;->O:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_1d

    iget-object v0, p0, Lj7/j;->i:LJ7/i;

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, LJ7/i;->L()LI8/O;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    if-eqz v0, :cond_1d

    sget-object v1, LJ7/i;->d0:LJ7/i$b;

    iget-object v2, p0, Lj7/j;->b:Landroid/content/Context;

    invoke-virtual {v1, v2, v0}, LJ7/i$b;->e(Landroid/content/Context;Landroid/graphics/Rect;)V

    :cond_1d
    iget-object v0, p0, Lj7/j;->c:Lp7/a;

    sget-object v1, Lp7/a$b;->b:Lp7/a$b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-nez v0, :cond_34

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2d

    if-ne p1, v1, :cond_34

    :cond_2d
    sget-object v0, LJ7/i;->d0:LJ7/i$b;

    iget-object v2, p0, Lj7/j;->b:Landroid/content/Context;

    invoke-virtual {v0, v2}, LJ7/i$b;->d(Landroid/content/Context;)V

    :cond_34
    sget-object v0, Lj7/j;->T:Lj7/j$a;

    iget-object v2, p0, Lj7/j;->b:Landroid/content/Context;

    invoke-virtual {v0, v2}, Lj7/j$a;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_47

    iget-object v0, p0, Lj7/j;->i:LJ7/i;

    if-eqz v0, :cond_47

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v3, v1, v2}, LJ7/i;->S0(LJ7/i;ZZILjava/lang/Object;)V

    :cond_47
    if-eqz p2, :cond_64

    if-eqz p3, :cond_64

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v4

    new-instance v5, Lj7/j$g;

    const/4 v11, 0x0

    move-object v6, p0

    move v8, p1

    move-object v7, p2

    move-object v10, p3

    move/from16 v9, p6

    invoke-direct/range {v5 .. v11}, Lj7/j$g;-><init>(Lj7/j;Ljava/lang/String;IILandroid/app/WallpaperColors;Lm8/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    move-object v7, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    goto :goto_67

    :cond_64
    invoke-direct {p0}, Lj7/j;->D0()V

    :goto_67
    sget-object v5, LR7/d;->r:LR7/d;

    iget-object v6, p0, Lj7/j;->b:Landroid/content/Context;

    iget-object v7, p0, Lj7/j;->d:Lg3/x;

    move v10, p1

    move-object/from16 v8, p4

    move/from16 v9, p5

    invoke-virtual/range {v5 .. v10}, LR7/d;->e(Landroid/content/Context;Lg3/x;Ljava/util/List;ZI)V

    invoke-static {}, Lj7/m;->e()V

    return-void
.end method

.method public static final synthetic C(Lj7/j;)LI8/z;
    .registers 1

    iget-object p0, p0, Lj7/j;->m:LI8/z;

    return-object p0
.end method

.method private final C0()V
    .registers 5

    invoke-direct {p0}, Lj7/j;->j0()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object p0, p0, Lj7/j;->L:LI8/A;

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;->INSTANCE:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;

    invoke-interface {p0, v0}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_e
    iget-object v0, p0, Lj7/j;->d:Lg3/x;

    invoke-virtual {v0}, Lg3/x;->t()Z

    move-result v0

    if-nez v0, :cond_23

    iget-object p0, p0, Lj7/j;->L:LI8/A;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    sget-object v1, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->NOT_SUPPORT:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;)V

    invoke-interface {p0, v0}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_23
    iget-object v0, p0, Lj7/j;->d:Lg3/x;

    invoke-virtual {v0}, Lg3/x;->s()Z

    move-result v0

    if-eqz v0, :cond_38

    iget-object p0, p0, Lj7/j;->L:LI8/A;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    sget-object v1, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->APPLIED_GLASS_EFFECT:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;)V

    invoke-interface {p0, v0}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_38
    iget-object v0, p0, Lj7/j;->J:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4f

    iget-object p0, p0, Lj7/j;->L:LI8/A;

    new-instance v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    sget-object v1, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->EXTENDED_WIDGET:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;)V

    invoke-interface {p0, v0}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_4f
    invoke-direct {p0}, Lj7/j;->t0()Lcom/nothing/wallpaper/segmenter/Segmenter;

    move-result-object v0

    invoke-interface {v0}, Lcom/nothing/wallpaper/segmenter/Segmenter;->c()Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState;

    move-result-object v0

    instance-of v1, v0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Available;

    if-eqz v1, :cond_6f

    invoke-direct {p0}, Lj7/j;->j0()Z

    move-result v1

    if-eqz v1, :cond_69

    iget-object v1, p0, Lj7/j;->L:LI8/A;

    sget-object v2, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;->INSTANCE:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;

    invoke-interface {v1, v2}, LI8/A;->setValue(Ljava/lang/Object;)V

    goto :goto_8e

    :cond_69
    sget-object v1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOff;->INSTANCE:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOff;

    invoke-direct {p0, v1}, Lj7/j;->b1(Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;)V

    goto :goto_8e

    :cond_6f
    instance-of v1, v0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$UnaAvailable;

    if-eqz v1, :cond_7f

    iget-object v1, p0, Lj7/j;->L:LI8/A;

    new-instance v2, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;-><init>(Z)V

    invoke-interface {v1, v2}, LI8/A;->setValue(Ljava/lang/Object;)V

    goto :goto_8e

    :cond_7f
    instance-of v1, v0, Lcom/nothing/wallpaper/segmenter/Segmenter$ModuleState$Installing;

    if-eqz v1, :cond_8e

    iget-object v1, p0, Lj7/j;->L:LI8/A;

    new-instance v2, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$ModuleUnavailable;-><init>(Z)V

    invoke-interface {v1, v2}, LI8/A;->setValue(Ljava/lang/Object;)V

    :cond_8e
    :goto_8e
    invoke-direct {p0}, Lj7/j;->j0()Z

    move-result v1

    iget-object p0, p0, Lj7/j;->M:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initDepthState switch:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " state:"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " module:"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "EditWallpaperViewModel"

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic D(Lj7/j;)Lh3/a0;
    .registers 1

    invoke-direct {p0}, Lj7/j;->y0()Lh3/a0;

    move-result-object p0

    return-object p0
.end method

.method private final D0()V
    .registers 4

    iget-object v0, p0, Lj7/j;->x:LF8/x0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_9

    invoke-static {v0, v2, v1, v2}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_9
    iput-object v2, p0, Lj7/j;->x:LF8/x0;

    new-instance v0, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$End;

    invoke-direct {v0, v1}, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$End;-><init>(Z)V

    invoke-direct {p0, v0}, Lj7/j;->X0(Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)V

    return-void
.end method

.method public static final synthetic E(Lj7/j;)LI8/A;
    .registers 1

    iget-object p0, p0, Lj7/j;->L:LI8/A;

    return-object p0
.end method

.method private final E0()V
    .registers 3

    new-instance v0, Landroid/content/Intent;

    const-string v1, "nothing.action.wallpaper.SET_WALLPAPER"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object p0, p0, Lj7/j;->b:Landroid/content/Context;

    invoke-static {p0}, Lb1/a;->b(Landroid/content/Context;)Lb1/a;

    move-result-object p0

    invoke-virtual {p0, v0}, Lb1/a;->d(Landroid/content/Intent;)Z

    return-void
.end method

.method public static final synthetic F(Lj7/j;LC6/b;)V
    .registers 2

    invoke-direct {p0, p1}, Lj7/j;->z0(LC6/b;)V

    return-void
.end method

.method private final F0()V
    .registers 16

    invoke-direct {p0}, Lj7/j;->c0()LA6/c;

    move-result-object v0

    iget-object v1, p0, Lj7/j;->e:LD6/f;

    instance-of v1, v1, LD6/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_21

    iget-object v1, p0, Lj7/j;->f:Lx6/k;

    if-eqz v1, :cond_21

    if-eqz v0, :cond_21

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v3

    new-instance v6, Lj7/j$h;

    invoke-direct {v6, p0, v2}, Lj7/j$h;-><init>(Lj7/j;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    :cond_21
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v9

    new-instance v12, Lj7/j$i;

    invoke-direct {v12, p0, v2}, Lj7/j$i;-><init>(Lj7/j;Lm8/e;)V

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public static final synthetic G(Lj7/j;II)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lj7/j;->A0(II)V

    return-void
.end method

.method private static final G0(LA6/c;)V
    .registers 1

    invoke-virtual {p0}, LA6/c;->close()V

    return-void
.end method

.method public static final synthetic H(Lj7/j;ILjava/lang/String;Landroid/app/WallpaperColors;Ljava/util/List;ZI)V
    .registers 7

    invoke-direct/range {p0 .. p6}, Lj7/j;->B0(ILjava/lang/String;Landroid/app/WallpaperColors;Ljava/util/List;ZI)V

    return-void
.end method

.method public static final synthetic I(Lj7/j;)V
    .registers 1

    invoke-direct {p0}, Lj7/j;->C0()V

    return-void
.end method

.method private final I0(Ljava/util/List;Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 20

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lj7/j$j;

    if-eqz v2, :cond_17

    move-object v2, v1

    check-cast v2, Lj7/j$j;

    iget v3, v2, Lj7/j$j;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_17

    sub-int/2addr v3, v4

    iput v3, v2, Lj7/j$j;->x:I

    goto :goto_1c

    :cond_17
    new-instance v2, Lj7/j$j;

    invoke-direct {v2, v0, v1}, Lj7/j$j;-><init>(Lj7/j;Lm8/e;)V

    :goto_1c
    iget-object v1, v2, Lj7/j$j;->v:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lj7/j$j;->x:I

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_72

    if-eq v4, v7, :cond_55

    if-eq v4, v6, :cond_3c

    if-ne v4, v5, :cond_34

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_229

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3c
    iget-object v0, v2, Lj7/j$j;->u:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v4, v2, Lj7/j$j;->t:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    iget-object v6, v2, Lj7/j$j;->s:Ljava/lang/Object;

    check-cast v6, LC6/b;

    iget-object v7, v2, Lj7/j$j;->r:Ljava/lang/Object;

    check-cast v7, LA6/c;

    iget-object v9, v2, Lj7/j$j;->q:Ljava/lang/Object;

    check-cast v9, Lj7/j;

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_1e9

    :cond_55
    iget-object v0, v2, Lj7/j$j;->u:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v4, v2, Lj7/j$j;->t:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    iget-object v7, v2, Lj7/j$j;->s:Ljava/lang/Object;

    check-cast v7, LC6/b;

    iget-object v9, v2, Lj7/j$j;->r:Ljava/lang/Object;

    check-cast v9, LA6/c;

    iget-object v10, v2, Lj7/j$j;->q:Ljava/lang/Object;

    check-cast v10, Lj7/j;

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    move-object v5, v0

    move-object v6, v7

    move-object v7, v9

    move-object v0, v10

    goto/16 :goto_1d3

    :cond_72
    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-direct {v0}, Lj7/j;->c0()LA6/c;

    move-result-object v1

    if-nez v1, :cond_85

    iget-object v0, v0, Lj7/j;->g:Lq6/b;

    const-string v1, "prepareBlurPreview but blurImageUtil is null."

    invoke-virtual {v0, v1}, Lq6/b;->e(Ljava/lang/String;)V

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :cond_85
    move-object/from16 v4, p1

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_8d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_a3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, LC6/b;

    invoke-virtual {v11}, LC6/b;->c()LC6/a;

    move-result-object v11

    sget-object v12, LC6/a;->q:LC6/a;

    if-ne v11, v12, :cond_8d

    goto :goto_a4

    :cond_a3
    const/4 v10, 0x0

    :goto_a4
    check-cast v10, LC6/b;

    if-nez v10, :cond_ab

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :cond_ab
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_af
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_c5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, LC6/b;

    invoke-virtual {v11}, LC6/b;->c()LC6/a;

    move-result-object v11

    sget-object v12, LC6/a;->r:LC6/a;

    if-ne v11, v12, :cond_af

    goto :goto_c6

    :cond_c5
    const/4 v9, 0x0

    :goto_c6
    check-cast v9, LC6/b;

    if-nez v9, :cond_cd

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :cond_cd
    move-object/from16 v4, p2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_11f

    move-object/from16 v4, p2

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_df
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_f9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, LC6/f;

    invoke-virtual {v12}, LC6/f;->d()LC6/b;

    move-result-object v12

    invoke-virtual {v12}, LC6/b;->c()LC6/a;

    move-result-object v12

    sget-object v13, LC6/a;->q:LC6/a;

    if-ne v12, v13, :cond_df

    goto :goto_fa

    :cond_f9
    const/4 v11, 0x0

    :goto_fa
    check-cast v11, LC6/f;

    if-eqz v11, :cond_115

    invoke-virtual {v11}, LC6/f;->d()LC6/b;

    move-result-object v4

    if-nez v4, :cond_105

    goto :goto_115

    :cond_105
    invoke-static {v10, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11f

    iget-object v0, v0, Lj7/j;->g:Lq6/b;

    const-string v1, "Mismatch between original and cropped image, skipped."

    invoke-virtual {v0, v1}, Lq6/b;->a(Ljava/lang/String;)V

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :cond_115
    :goto_115
    iget-object v0, v0, Lj7/j;->g:Lq6/b;

    const-string v1, "didn\'t find setterEffectCroppedRect."

    invoke-virtual {v0, v1}, Lq6/b;->e(Ljava/lang/String;)V

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :cond_11f
    invoke-virtual {v9}, LC6/b;->a()LC6/i;

    move-result-object v4

    move-object/from16 v11, p2

    check-cast v11, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v11, v13}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_136
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    const-string v14, "all effect blur type bitmap ready."

    if-eqz v13, :cond_19d

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, LC6/f;

    invoke-virtual {v13}, LC6/f;->d()LC6/b;

    move-result-object v15

    invoke-virtual {v15}, LC6/b;->c()LC6/a;

    move-result-object v15

    sget-object v5, LC6/a;->q:LC6/a;

    if-ne v15, v5, :cond_18a

    invoke-virtual {v13}, LC6/f;->c()Lw6/c;

    move-result-object v5

    invoke-virtual {v5}, Lw6/c;->b()LE6/a$a;

    move-result-object v5

    if-eqz v5, :cond_15f

    invoke-virtual {v5}, LE6/a$a;->b()LC6/e;

    move-result-object v5

    goto :goto_160

    :cond_15f
    const/4 v5, 0x0

    :goto_160
    sget-object v15, LC6/e$b;->c:LC6/e$b;

    invoke-static {v5, v15}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_16d

    invoke-direct {v0}, Lj7/j;->m0()Landroid/graphics/Bitmap;

    move-result-object v5

    goto :goto_16e

    :cond_16d
    const/4 v5, 0x0

    :goto_16e
    iget-object v15, v0, Lj7/j;->g:Lq6/b;

    invoke-virtual {v15, v14}, Lq6/b;->a(Ljava/lang/String;)V

    sget-object v14, LC6/i;->h:LC6/i$a;

    invoke-virtual {v13}, LC6/f;->a()LC6/i;

    move-result-object v15

    invoke-virtual {v10}, LC6/b;->b()LC6/d;

    move-result-object v8

    invoke-virtual {v9}, LC6/b;->b()LC6/d;

    move-result-object v6

    invoke-static {v15, v5, v8, v6}, LG6/b;->g(LC6/i;Landroid/graphics/Bitmap;LC6/d;LC6/d;)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-virtual {v14, v5}, LC6/i$a;->a(Landroid/graphics/Bitmap;)LC6/i;

    move-result-object v5

    goto :goto_18e

    :cond_18a
    invoke-virtual {v13}, LC6/f;->a()LC6/i;

    move-result-object v5

    :goto_18e
    new-instance v6, Lh8/o;

    invoke-virtual {v13}, LC6/f;->b()LC6/e;

    move-result-object v8

    invoke-direct {v6, v8, v5}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v12, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x3

    const/4 v6, 0x2

    goto :goto_136

    :cond_19d
    iget-object v5, v0, Lj7/j;->g:Lq6/b;

    invoke-virtual {v5, v14}, Lq6/b;->a(Ljava/lang/String;)V

    new-instance v5, Lh8/o;

    sget-object v6, LC6/e$c;->c:LC6/e$c;

    invoke-direct {v5, v6, v4}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5}, [Lh8/o;

    move-result-object v4

    invoke-static {v4}, Li8/N;->j([Lh8/o;)Ljava/util/Map;

    move-result-object v4

    invoke-static {v4, v12}, Li8/N;->l(Ljava/util/Map;Ljava/lang/Iterable;)V

    invoke-direct {v0}, Lj7/j;->q0()Lv6/b;

    move-result-object v5

    invoke-virtual {v5, v4}, Lv6/b;->a(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    iget-object v6, v0, Lj7/j;->m:LI8/z;

    iput-object v0, v2, Lj7/j$j;->q:Ljava/lang/Object;

    iput-object v1, v2, Lj7/j$j;->r:Ljava/lang/Object;

    iput-object v10, v2, Lj7/j$j;->s:Ljava/lang/Object;

    iput-object v4, v2, Lj7/j$j;->t:Ljava/lang/Object;

    iput-object v5, v2, Lj7/j$j;->u:Ljava/lang/Object;

    iput v7, v2, Lj7/j$j;->x:I

    invoke-interface {v6, v5, v2}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_1d1

    goto :goto_228

    :cond_1d1
    move-object v7, v1

    move-object v6, v10

    :goto_1d3
    iput-object v0, v2, Lj7/j$j;->q:Ljava/lang/Object;

    iput-object v7, v2, Lj7/j$j;->r:Ljava/lang/Object;

    iput-object v6, v2, Lj7/j$j;->s:Ljava/lang/Object;

    iput-object v4, v2, Lj7/j$j;->t:Ljava/lang/Object;

    iput-object v5, v2, Lj7/j$j;->u:Ljava/lang/Object;

    const/4 v1, 0x2

    iput v1, v2, Lj7/j$j;->x:I

    invoke-static {v2}, LF8/e1;->a(Lm8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1e7

    goto :goto_228

    :cond_1e7
    move-object v9, v0

    move-object v0, v5

    :goto_1e9
    invoke-virtual {v7, v4, v0}, LA6/c;->w0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_22c

    iget-object v1, v9, Lj7/j;->g:Lq6/b;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "notifyBlurPreview with "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lq6/b;->a(Ljava/lang/String;)V

    iget-object v1, v9, Lj7/j;->t:LI8/z;

    new-instance v4, Lh8/o;

    invoke-virtual {v6}, LC6/b;->d()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Lh8/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, v2, Lj7/j$j;->q:Ljava/lang/Object;

    iput-object v0, v2, Lj7/j$j;->r:Ljava/lang/Object;

    iput-object v0, v2, Lj7/j$j;->s:Ljava/lang/Object;

    iput-object v0, v2, Lj7/j$j;->t:Ljava/lang/Object;

    iput-object v0, v2, Lj7/j$j;->u:Ljava/lang/Object;

    const/4 v0, 0x3

    iput v0, v2, Lj7/j$j;->x:I

    invoke-interface {v1, v4, v2}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_229

    :goto_228
    return-object v3

    :cond_229
    :goto_229
    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0

    :cond_22c
    iget-object v0, v9, Lj7/j;->g:Lq6/b;

    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BlurHelper savePreview for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " failed."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq6/b;->e(Ljava/lang/String;)V

    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0
.end method

.method public static final synthetic J(Lj7/j;)Z
    .registers 1

    iget-boolean p0, p0, Lj7/j;->C:Z

    return p0
.end method

.method private static final J0(Lj7/j;)Lv6/b;
    .registers 2

    new-instance v0, Lv6/b;

    invoke-direct {p0}, Lj7/j;->r0()Landroid/graphics/Point;

    move-result-object p0

    invoke-direct {v0, p0}, Lv6/b;-><init>(Landroid/graphics/Point;)V

    return-object v0
.end method

.method public static final synthetic K(Lj7/j;)Z
    .registers 1

    iget-boolean p0, p0, Lj7/j;->B:Z

    return p0
.end method

.method private static final K0(Lj7/j;)Landroid/graphics/Point;
    .registers 4

    sget-object v0, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout;->r:Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout$a;

    iget-object v1, p0, Lj7/j;->b:Landroid/content/Context;

    invoke-direct {p0}, Lj7/j;->s0()Landroid/graphics/Point;

    move-result-object v2

    iget v2, v2, Landroid/graphics/Point;->x:I

    invoke-direct {p0}, Lj7/j;->s0()Landroid/graphics/Point;

    move-result-object p0

    iget p0, p0, Landroid/graphics/Point;->y:I

    invoke-static {v2, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2, p0}, Lcom/nothing/wallpaper/picker/edit/preview/widget/NTDisplayAspectRatioLinearLayout$a;->a(Landroid/content/Context;II)Landroid/graphics/Point;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic L(Lj7/j;)V
    .registers 1

    invoke-direct {p0}, Lj7/j;->D0()V

    return-void
.end method

.method public static final synthetic M(Lj7/j;Ljava/util/List;Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-direct {p0, p1, p2, p3}, Lj7/j;->I0(Ljava/util/List;Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N(Lj7/j;Landroid/graphics/Bitmap;)V
    .registers 2

    invoke-direct {p0, p1}, Lj7/j;->O0(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private final N0()V
    .registers 6

    iget-boolean v0, p0, Lj7/j;->E:Z

    if-eqz v0, :cond_30

    sget-object v0, Lj7/j;->T:Lj7/j$a;

    iget-object v1, p0, Lj7/j;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lj7/j$a;->b(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lj7/j;->K:Z

    iget-object v1, p0, Lj7/j;->i:LJ7/i;

    if-eqz v1, :cond_18

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v0, v4, v2, v3}, LJ7/i;->S0(LJ7/i;ZZILjava/lang/Object;)V

    :cond_18
    iget-boolean p0, p0, Lj7/j;->K:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "depthSwitchInSystem:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "EditWallpaperViewModel"

    invoke-static {v0, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_30
    return-void
.end method

.method public static final synthetic O(Lj7/j;ZLm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0, p1, p2}, Lj7/j;->P0(ZLm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final O0(Landroid/graphics/Bitmap;)V
    .registers 2

    invoke-static {p1}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->k(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static final synthetic P(Lj7/j;II)V
    .registers 3

    invoke-direct {p0, p1, p2}, Lj7/j;->T0(II)V

    return-void
.end method

.method private final P0(ZLm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, Lj7/j$k;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, Lj7/j$k;

    iget v1, v0, Lj7/j$k;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lj7/j$k;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, Lj7/j$k;

    invoke-direct {v0, p0, p2}, Lj7/j$k;-><init>(Lj7/j;Lm8/e;)V

    :goto_18
    iget-object p2, v0, Lj7/j$k;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lj7/j$k;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_33

    if-ne v2, v3, :cond_2b

    iget-boolean p1, v0, Lj7/j$k;->q:Z

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4d

    :cond_2b
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_33
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-boolean p2, p0, Lj7/j;->D:Z

    if-eqz p2, :cond_67

    iget-object p2, p0, Lj7/j;->c:Lp7/a;

    instance-of p2, p2, Lp7/a$b;

    if-nez p2, :cond_67

    iget-object p0, p0, Lj7/j;->m:LI8/z;

    iput-boolean p1, v0, Lj7/j$k;->q:Z

    iput v3, v0, Lj7/j$k;->t:I

    invoke-static {p0, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4d

    return-object v1

    :cond_4d
    :goto_4d
    check-cast p2, Ljava/util/Map;

    sget-object p0, Lj7/m;->a:Lj7/m;

    if-eqz p1, :cond_5c

    sget-object p1, LC6/e$b;->c:LC6/e$b;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    goto :goto_64

    :cond_5c
    sget-object p1, LC6/e$c;->c:LC6/e$c;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    :goto_64
    invoke-virtual {p0, p1}, Lj7/m;->g(Landroid/graphics/Bitmap;)V

    :cond_67
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public static final synthetic Q(Lj7/j;Landroid/graphics/Bitmap;)V
    .registers 2

    iput-object p1, p0, Lj7/j;->O:Landroid/graphics/Bitmap;

    return-void
.end method

.method public static final Q0(Landroid/content/Context;Z)V
    .registers 3

    sget-object v0, Lj7/j;->T:Lj7/j$a;

    invoke-virtual {v0, p0, p1}, Lj7/j$a;->c(Landroid/content/Context;Z)V

    return-void
.end method

.method public static final synthetic R(Lj7/j;Lg3/k;ILandroid/service/wallpaper/IWallpaperEngine;Lm8/e;)Ljava/lang/Object;
    .registers 5

    invoke-direct {p0, p1, p2, p3, p4}, Lj7/j;->V0(Lg3/k;ILandroid/service/wallpaper/IWallpaperEngine;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final R0(Lj7/j;)Landroid/graphics/Point;
    .registers 2

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    iget-object p0, p0, Lj7/j;->b:Landroid/content/Context;

    invoke-interface {v0, p0}, Lh3/H;->e(Landroid/content/Context;)LH3/k;

    move-result-object p0

    invoke-static {}, LH3/s;->a()LH3/s;

    move-result-object v0

    invoke-virtual {p0}, LH3/k;->i()Landroid/view/Display;

    move-result-object p0

    invoke-virtual {v0, p0}, LH3/s;->e(Landroid/view/Display;)Landroid/graphics/Point;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic S(Lj7/j;LF8/x0;)V
    .registers 2

    iput-object p1, p0, Lj7/j;->x:LF8/x0;

    return-void
.end method

.method private static final S0()Lcom/nothing/wallpaper/segmenter/Segmenter;
    .registers 1

    invoke-static {}, LP7/b;->c()Lcom/nothing/wallpaper/segmenter/Segmenter;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic T(Lj7/j;Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)V
    .registers 2

    invoke-direct {p0, p1}, Lj7/j;->X0(Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)V

    return-void
.end method

.method private final T0(II)V
    .registers 4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_7

    const/4 v0, 0x2

    if-eq p1, v0, :cond_7

    return-void

    :cond_7
    sget-object p1, LF2/F;->t:LF2/F$a;

    iget-object p0, p0, Lj7/j;->b:Landroid/content/Context;

    invoke-virtual {p1, p0}, LF2/F$a;->a(Landroid/content/Context;)LF2/F;

    move-result-object p0

    invoke-virtual {p0, p2}, LF2/F;->q0(I)V

    return-void
.end method

.method public static final synthetic U(Lj7/j;LC6/b;)V
    .registers 2

    iput-object p1, p0, Lj7/j;->P:LC6/b;

    return-void
.end method

.method private static final V(Lj7/j;)LA6/c;
    .registers 3

    iget-object v0, p0, Lj7/j;->f:Lx6/k;

    if-eqz v0, :cond_13

    new-instance v1, LA6/c;

    iget-object p0, p0, Lj7/j;->b:Landroid/content/Context;

    invoke-direct {v1, p0}, LA6/c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lx6/k;->p()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, LA6/c;->O0(Ljava/lang/String;)V

    return-object v1

    :cond_13
    const/4 p0, 0x0

    return-object p0
.end method

.method private final V0(Lg3/k;ILandroid/service/wallpaper/IWallpaperEngine;Lm8/e;)Ljava/lang/Object;
    .registers 9

    instance-of v0, p4, Lj7/j$l;

    if-eqz v0, :cond_13

    move-object v0, p4

    check-cast v0, Lj7/j$l;

    iget v1, v0, Lj7/j$l;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lj7/j$l;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, Lj7/j$l;

    invoke-direct {v0, p0, p4}, Lj7/j$l;-><init>(Lj7/j;Lm8/e;)V

    :goto_18
    iget-object p0, v0, Lj7/j$l;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p4

    iget v1, v0, Lj7/j$l;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_35

    if-ne v1, v2, :cond_2d

    iget-object p1, v0, Lj7/j$l;->q:Ljava/lang/Object;

    check-cast p1, Lg3/k;

    invoke-static {p0}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_58

    :cond_2d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_35
    invoke-static {p0}, Lh8/r;->b(Ljava/lang/Object;)V

    sget-boolean p0, Lcom/android/launcher3/w;->i:Z

    if-nez p0, :cond_3f

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0

    :cond_3f
    invoke-static {p2}, Lh3/U;->d(I)I

    move-result p0

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object p2

    new-instance v1, Lj7/j$m;

    const/4 v3, 0x0

    invoke-direct {v1, p3, p0, v3}, Lj7/j$m;-><init>(Landroid/service/wallpaper/IWallpaperEngine;ILm8/e;)V

    iput-object p1, v0, Lj7/j$l;->q:Ljava/lang/Object;

    iput v2, v0, Lj7/j$l;->t:I

    invoke-static {p2, v1, v0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p4, :cond_58

    return-object p4

    :cond_58
    :goto_58
    check-cast p0, Landroid/app/wallpaper/WallpaperDescription;

    if-eqz p0, :cond_5f

    invoke-virtual {p1, p0}, Lg3/k;->C(Landroid/app/wallpaper/WallpaperDescription;)V

    :cond_5f
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final X(LC6/e;Lm8/e;)Ljava/lang/Object;
    .registers 13

    instance-of v0, p2, Lj7/j$d;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, Lj7/j$d;

    iget v1, v0, Lj7/j$d;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lj7/j$d;->w:I

    goto :goto_18

    :cond_13
    new-instance v0, Lj7/j$d;

    invoke-direct {v0, p0, p2}, Lj7/j$d;-><init>(Lj7/j;Lm8/e;)V

    :goto_18
    iget-object p2, v0, Lj7/j$d;->u:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lj7/j$d;->w:I

    const-string v3, "."

    const-string v4, ", colorScope="

    const-string v5, "buildEffectInfo but assetManager is NULL."

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v2, :cond_6c

    if-eq v2, v8, :cond_5f

    if-eq v2, v7, :cond_4f

    if-ne v2, v6, :cond_47

    iget-object p0, v0, Lj7/j$d;->t:Ljava/lang/Object;

    check-cast p0, Landroid/app/WallpaperColors;

    iget-object p1, v0, Lj7/j$d;->s:Ljava/lang/Object;

    check-cast p1, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    iget-object v1, v0, Lj7/j$d;->r:Ljava/lang/Object;

    check-cast v1, LC6/e;

    iget-object v0, v0, Lj7/j$d;->q:Ljava/lang/Object;

    check-cast v0, Lj7/j;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_16b

    :cond_47
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4f
    iget-object p0, v0, Lj7/j$d;->s:Ljava/lang/Object;

    check-cast p0, Landroid/app/WallpaperColors;

    iget-object p1, v0, Lj7/j$d;->r:Ljava/lang/Object;

    check-cast p1, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    iget-object v0, v0, Lj7/j$d;->q:Ljava/lang/Object;

    check-cast v0, Lj7/j;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_b9

    :cond_5f
    iget-object p0, v0, Lj7/j$d;->r:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, LC6/e;

    iget-object p0, v0, Lj7/j$d;->q:Ljava/lang/Object;

    check-cast p0, Lj7/j;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_8d

    :cond_6c
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lj7/j;->f:Lx6/k;

    if-eqz p2, :cond_262

    iget-object p2, p0, Lj7/j;->e:LD6/f;

    instance-of v2, p2, LD6/e;

    if-eqz v2, :cond_25a

    check-cast p2, LD6/e;

    invoke-interface {p2}, LD6/e;->H0()LI8/f;

    move-result-object p2

    iput-object p0, v0, Lj7/j$d;->q:Ljava/lang/Object;

    iput-object p1, v0, Lj7/j$d;->r:Ljava/lang/Object;

    iput v8, v0, Lj7/j$d;->w:I

    invoke-static {p2, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8d

    goto/16 :goto_164

    :cond_8d
    :goto_8d
    check-cast p2, Lh8/o;

    invoke-virtual {p2}, Lh8/o;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    invoke-virtual {p2}, Lh8/o;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/WallpaperColors;

    if-nez p1, :cond_148

    iget-object p1, p0, Lj7/j;->e:LD6/f;

    check-cast p1, LD6/e;

    invoke-interface {p1}, LD6/e;->t()LI8/f;

    move-result-object p1

    iput-object p0, v0, Lj7/j$d;->q:Ljava/lang/Object;

    iput-object v2, v0, Lj7/j$d;->r:Ljava/lang/Object;

    iput-object p2, v0, Lj7/j$d;->s:Ljava/lang/Object;

    iput v7, v0, Lj7/j$d;->w:I

    invoke-static {p1, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b5

    goto/16 :goto_164

    :cond_b5
    move-object v0, p0

    move-object p0, p2

    move-object p2, p1

    move-object p1, v2

    :goto_b9
    check-cast p2, Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_c1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_d7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LC6/b;

    invoke-virtual {v2}, LC6/b;->c()LC6/a;

    move-result-object v2

    sget-object v5, LC6/a;->q:LC6/a;

    if-ne v2, v5, :cond_c1

    goto :goto_d8

    :cond_d7
    move-object v1, v9

    :goto_d8
    check-cast v1, LC6/b;

    if-eqz v1, :cond_140

    invoke-virtual {v1}, LC6/b;->d()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p2

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_10a

    iget-object p0, v0, Lj7/j;->g:Lq6/b;

    invoke-virtual {v1}, LC6/b;->d()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buildEffectInfo scope mismatch, cropScope="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    return-object v9

    :cond_10a
    iget-object p2, v0, Lj7/j;->c:Lp7/a;

    sget-object v2, Lp7/a$b;->b:Lp7/a$b;

    invoke-static {p2, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_126

    iget-object p2, v0, Lj7/j;->d:Lg3/x;

    invoke-virtual {p2}, Lg3/x;->s()Z

    move-result p2

    if-eqz p2, :cond_126

    sget-object p2, LF6/a$b;->d:LF6/a$b$a;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/effects/data/model/ViewScope;->getScale()F

    move-result p1

    invoke-virtual {p2, p1}, LF6/a$b$a;->a(F)LF6/a$b;

    move-result-object v9

    :cond_126
    new-instance p1, Lh8/u;

    new-instance p2, LC6/g;

    iget-object v2, v0, Lj7/j;->f:Lx6/k;

    invoke-virtual {v2}, Lx6/k;->p()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, LG6/c;->l(LC6/b;)LC6/j;

    move-result-object v3

    invoke-direct {p2, v2, v3, v9}, LC6/g;-><init>(Ljava/lang/String;LC6/j;LE6/a$a;)V

    invoke-virtual {v1}, LC6/b;->a()LC6/i;

    move-result-object v1

    invoke-direct {p1, p2, v1, p0}, Lh8/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_201

    :cond_140
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "buildEffectInfo but didn\'t received CroppedBitmap for CropType.Setter."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_148
    iget-object v7, p0, Lj7/j;->l:LD6/g;

    if-eqz v7, :cond_254

    if-eqz v7, :cond_173

    invoke-interface {v7}, LD6/g;->N()LI8/f;

    move-result-object v5

    if-eqz v5, :cond_173

    iput-object p0, v0, Lj7/j$d;->q:Ljava/lang/Object;

    iput-object p1, v0, Lj7/j$d;->r:Ljava/lang/Object;

    iput-object v2, v0, Lj7/j$d;->s:Ljava/lang/Object;

    iput-object p2, v0, Lj7/j$d;->t:Ljava/lang/Object;

    iput v6, v0, Lj7/j$d;->w:I

    invoke-static {v5, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_165

    :goto_164
    return-object v1

    :cond_165
    move-object v1, v0

    move-object v0, p0

    move-object p0, p2

    move-object p2, v1

    move-object v1, p1

    move-object p1, v2

    :goto_16b
    check-cast p2, Ljava/util/List;

    move-object v2, v0

    move-object v0, p0

    move-object p0, v2

    move-object v2, p1

    move-object p1, v1

    goto :goto_175

    :cond_173
    move-object v0, p2

    move-object p2, v9

    :goto_175
    if-eqz p2, :cond_234

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_17d
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_195

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, LC6/f;

    invoke-virtual {v5}, LC6/f;->b()LC6/e;

    move-result-object v5

    invoke-static {v5, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_17d

    goto :goto_196

    :cond_195
    move-object v1, v9

    :goto_196
    check-cast v1, LC6/f;

    if-eqz v1, :cond_234

    invoke-virtual {v1}, LC6/f;->d()LC6/b;

    move-result-object p1

    invoke-virtual {p1}, LC6/b;->c()LC6/a;

    move-result-object p1

    sget-object p2, LC6/a;->q:LC6/a;

    if-ne p1, p2, :cond_22c

    invoke-virtual {v1}, LC6/f;->d()LC6/b;

    move-result-object p1

    invoke-virtual {p1}, LC6/b;->d()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1dc

    iget-object p0, p0, Lj7/j;->g:Lq6/b;

    invoke-virtual {v1}, LC6/f;->d()LC6/b;

    move-result-object p1

    invoke-virtual {p1}, LC6/b;->d()Lcom/nothing/wallpaper/effects/data/model/ViewScope;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "buildEffectInfo scope mismatch effectScope="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lq6/b;->e(Ljava/lang/String;)V

    return-object v9

    :cond_1dc
    new-instance p1, Lh8/u;

    new-instance p2, LC6/g;

    iget-object v2, p0, Lj7/j;->f:Lx6/k;

    invoke-virtual {v2}, Lx6/k;->p()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, LC6/f;->c()Lw6/c;

    move-result-object v3

    invoke-virtual {v3}, Lw6/c;->c()LC6/j;

    move-result-object v3

    invoke-virtual {v1}, LC6/f;->c()Lw6/c;

    move-result-object v4

    invoke-virtual {v4}, Lw6/c;->b()LE6/a$a;

    move-result-object v4

    invoke-direct {p2, v2, v3, v4}, LC6/g;-><init>(Ljava/lang/String;LC6/j;LE6/a$a;)V

    invoke-virtual {v1}, LC6/f;->a()LC6/i;

    move-result-object v1

    invoke-direct {p1, p2, v1, v0}, Lh8/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v0, p0

    :goto_201
    invoke-virtual {p1}, Lh8/u;->d()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LC6/g;

    new-instance p2, Lx6/f;

    iget-object v1, v0, Lj7/j;->f:Lx6/k;

    invoke-direct {p2, v1}, Lx6/f;-><init>(Lx6/k;)V

    invoke-virtual {p0, p2}, LC6/g;->g(Lx6/p;)V

    iget-object p2, v0, Lj7/j;->g:Lq6/b;

    invoke-virtual {p0}, LC6/g;->c()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buildEffectInfo: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lq6/b;->a(Ljava/lang/String;)V

    return-object p1

    :cond_22c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "buildEffectInfo but effectCropped type is not CropType.Setter."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_234
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, LC6/e;->a()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "buildEffectInfo but didn\'t received EffectBitmap for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " from wallpaperEffectBitmapDataSource."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_254
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_25a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed requirement."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_262
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final X0(Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)V
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setSavingState state:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "EditWallpaperViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lj7/j;->v:Landroidx/lifecycle/H;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/H;->l(Ljava/lang/Object;)V

    iget-object p0, p0, Lj7/j;->i:LJ7/i;

    if-eqz p0, :cond_22

    invoke-virtual {p0, p1}, LJ7/i;->V0(Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)V

    :cond_22
    return-void
.end method

.method private final Y(Landroid/graphics/Bitmap;)Z
    .registers 13

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "EditWallpaperViewModel"

    if-eqz v0, :cond_f

    const-string p0, "checkDepthApplicable depth bitmap is recycled"

    invoke-static {v2, p0}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_f
    iget-object v0, p0, Lj7/j;->i:LJ7/i;

    if-eqz v0, :cond_20

    invoke-virtual {v0}, LJ7/i;->L()LI8/O;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    goto :goto_21

    :cond_20
    const/4 v0, 0x0

    :goto_21
    if-eqz v0, :cond_c6

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-direct {p0}, Lj7/j;->s0()Landroid/graphics/Point;

    move-result-object v4

    iget v4, v4, Landroid/graphics/Point;->x:I

    sub-int/2addr v3, v4

    div-int/lit8 v3, v3, 0x2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-direct {p0}, Lj7/j;->s0()Landroid/graphics/Point;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Point;->y:I

    sub-int/2addr v4, v5

    div-int/lit8 v4, v4, 0x2

    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6}, Landroid/graphics/Rect;-><init>()V

    iget v5, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr v5, v3

    iget v7, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v7, v4

    iget v8, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v8, v3

    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v4

    invoke-virtual {v6, v5, v7, v8, v3}, Landroid/graphics/Rect;->set(IIII)V

    sget-object v3, LL6/b;->a:LL6/b;

    invoke-virtual {v3}, LL6/b;->d()F

    move-result v7

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "checkDepthApplicable overRate = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/nothing/wallpaper/common/log/c;->o(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v5, p1

    invoke-static/range {v5 .. v10}, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil;->f(Landroid/graphics/Bitmap;Landroid/graphics/Rect;FIILjava/lang/Object;)Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    move-result-object p1

    iput-object p1, p0, Lj7/j;->N:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    iget-object p1, p0, Lj7/j;->J:Ljava/lang/Boolean;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8d

    iget-object p1, p0, Lj7/j;->L:LI8/A;

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    sget-object v4, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->EXTENDED_WIDGET:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-direct {v3, v4}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;)V

    invoke-interface {p1, v3}, LI8/A;->setValue(Ljava/lang/Object;)V

    goto :goto_d2

    :cond_8d
    iget-object p1, p0, Lj7/j;->N:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    sget-object v3, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->SATISFIED:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    if-ne p1, v3, :cond_a4

    iget-object p1, p0, Lj7/j;->L:LI8/A;

    invoke-direct {p0}, Lj7/j;->j0()Z

    move-result v3

    if-eqz v3, :cond_9e

    sget-object v3, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;->INSTANCE:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;

    goto :goto_a0

    :cond_9e
    sget-object v3, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOff;->INSTANCE:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOff;

    :goto_a0
    invoke-interface {p1, v3}, LI8/A;->setValue(Ljava/lang/Object;)V

    goto :goto_d2

    :cond_a4
    sget-object v3, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->NO_OPAQUE:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    if-ne p1, v3, :cond_b5

    iget-object p1, p0, Lj7/j;->L:LI8/A;

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    sget-object v4, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->NO_OVERLAP:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-direct {v3, v4}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;)V

    invoke-interface {p1, v3}, LI8/A;->setValue(Ljava/lang/Object;)V

    goto :goto_d2

    :cond_b5
    sget-object v3, Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;->EXCEEDED:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    if-ne p1, v3, :cond_d2

    iget-object p1, p0, Lj7/j;->L:LI8/A;

    new-instance v3, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    sget-object v4, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->OVERLAP_TOO_MUCH:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-direct {v3, v4}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;)V

    invoke-interface {p1, v3}, LI8/A;->setValue(Ljava/lang/Object;)V

    goto :goto_d2

    :cond_c6
    move-object v5, p1

    iget-boolean p1, p0, Lj7/j;->K:Z

    if-eqz p1, :cond_d2

    iget-object p1, p0, Lj7/j;->L:LI8/A;

    sget-object v3, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;->INSTANCE:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;

    invoke-interface {p1, v3}, LI8/A;->setValue(Ljava/lang/Object;)V

    :cond_d2
    :goto_d2
    iget-object p1, p0, Lj7/j;->M:LI8/O;

    invoke-interface {p1}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p1

    iget-object p0, p0, Lj7/j;->N:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    invoke-static {v5}, Lj6/b;->a(Landroid/graphics/Bitmap;)Landroid/graphics/Point;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "checkDepthApplicable state:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " overlap:"

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " area:"

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " depth:"

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_10e

    const/4 p0, 0x1

    return p0

    :cond_10e
    return v1
.end method

.method private static final a0(Lj7/j;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-direct {p0}, Lj7/j;->s0()Landroid/graphics/Point;

    move-result-object p0

    invoke-static {p0}, LG6/f;->d(Landroid/graphics/Point;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private final b1(Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;)V
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateDepthStateByOverlap state:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "EditWallpaperViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lj7/j;->N:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    if-nez v0, :cond_1c

    const/4 v0, -0x1

    goto :goto_24

    :cond_1c
    sget-object v1, Lj7/j$b;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_24
    const/4 v1, 0x1

    if-eq v0, v1, :cond_54

    const/4 p1, 0x2

    if-eq v0, p1, :cond_47

    const/4 p1, 0x3

    if-eq v0, p1, :cond_3a

    iget-object p0, p0, Lj7/j;->L:LI8/A;

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->NO_SUBJECT:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-direct {p1, v0}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;)V

    invoke-interface {p0, p1}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_3a
    iget-object p0, p0, Lj7/j;->L:LI8/A;

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->OVERLAP_TOO_MUCH:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-direct {p1, v0}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;)V

    invoke-interface {p0, p1}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_47
    iget-object p0, p0, Lj7/j;->L:LI8/A;

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->NO_OVERLAP:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-direct {p1, v0}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;)V

    invoke-interface {p0, p1}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_54
    iget-object p0, p0, Lj7/j;->L:LI8/A;

    invoke-interface {p0, p1}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final c0()LA6/c;
    .registers 1

    iget-object p0, p0, Lj7/j;->k:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LA6/c;

    return-object p0
.end method

.method private final c1()V
    .registers 8

    iget-object v0, p0, Lj7/j;->h:Lo7/b;

    instance-of v1, v0, Lo7/g;

    if-eqz v1, :cond_35

    const-string v1, "null cannot be cast to non-null type com.nothing.wallpaper.picker.edit.crop.viewmodels.ImageCropWallpaperViewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lo7/g;

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    new-instance v4, Lj7/j$u;

    const/4 v2, 0x0

    invoke-direct {v4, v0, p0, v2}, Lj7/j$u;-><init>(Lo7/g;Lj7/j;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-virtual {v0}, Lo7/g;->e0()LI8/O;

    move-result-object v0

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_35

    iget-object p0, p0, Lj7/j;->i:LJ7/i;

    if-eqz p0, :cond_35

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, LJ7/i;->R0(ZZ)V

    :cond_35
    return-void
.end method

.method private final d1()V
    .registers 3

    iget-object v0, p0, Lj7/j;->d:Lg3/x;

    invoke-virtual {v0}, Lg3/x;->t()Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, Lj7/j;->i:LJ7/i;

    if-eqz v0, :cond_1b

    iget-boolean p0, p0, Lj7/j;->K:Z

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, LJ7/i;->R0(ZZ)V

    return-void

    :cond_13
    iget-object p0, p0, Lj7/j;->i:LJ7/i;

    if-eqz p0, :cond_1b

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, LJ7/i;->R0(ZZ)V

    :cond_1b
    return-void
.end method

.method public static synthetic e(LA6/c;)V
    .registers 1

    invoke-static {p0}, Lj7/j;->G0(LA6/c;)V

    return-void
.end method

.method private static final e1(Lj7/j;)Lh3/a0;
    .registers 6

    new-instance v0, Lh3/a0;

    iget-object v1, p0, Lj7/j;->j:LK1/a;

    iget-object v2, p0, Lj7/j;->b:Landroid/content/Context;

    invoke-interface {v1, v2}, Lh3/H;->A(Landroid/content/Context;)Lh3/U;

    move-result-object v1

    iget-object v2, p0, Lj7/j;->j:LK1/a;

    iget-object v3, p0, Lj7/j;->b:Landroid/content/Context;

    invoke-interface {v2, v3}, Lh3/H;->f(Landroid/content/Context;)Lh3/W;

    move-result-object v2

    iget-object v3, p0, Lj7/j;->j:LK1/a;

    iget-object v4, p0, Lj7/j;->b:Landroid/content/Context;

    invoke-interface {v3, v4}, Lh3/H;->q(Landroid/content/Context;)Lh3/S;

    move-result-object v3

    iget-object v4, p0, Lj7/j;->j:LK1/a;

    iget-object p0, p0, Lj7/j;->b:Landroid/content/Context;

    invoke-interface {v4, p0}, Lh3/H;->k(Landroid/content/Context;)Lh3/c;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lh3/a0;-><init>(Lh3/U;Lh3/W;Lh3/S;Lh3/c;)V

    return-object v0
.end method

.method public static synthetic f(Lj7/j;)Landroid/graphics/Point;
    .registers 1

    invoke-static {p0}, Lj7/j;->K0(Lj7/j;)Landroid/graphics/Point;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lj7/j;)Lw6/a;
    .registers 1

    invoke-static {p0}, Lj7/j;->n(Lj7/j;)Lw6/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lj7/j;)Landroid/graphics/Point;
    .registers 1

    invoke-static {p0}, Lj7/j;->R0(Lj7/j;)Landroid/graphics/Point;

    move-result-object p0

    return-object p0
.end method

.method private final h0(ILm8/e;)Ljava/lang/Object;
    .registers 5

    iget-boolean v0, p0, Lj7/j;->E:Z

    if-eqz v0, :cond_1f

    iget-object v0, p0, Lj7/j;->M:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;

    if-eqz v0, :cond_1f

    iget-object v0, p0, Lj7/j;->c:Lp7/a;

    sget-object v1, Lp7/a$b;->b:Lp7/a$b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    if-eqz p1, :cond_1f

    invoke-direct {p0, p2}, Lj7/j;->v0(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1f
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic i(Lj7/j;)Lv6/b;
    .registers 1

    invoke-static {p0}, Lj7/j;->J0(Lj7/j;)Lv6/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lj7/j;)Lh3/a0;
    .registers 1

    invoke-static {p0}, Lj7/j;->e1(Lj7/j;)Lh3/a0;

    move-result-object p0

    return-object p0
.end method

.method private final j0()Z
    .registers 1

    iget-object p0, p0, Lj7/j;->i:LJ7/i;

    if-eqz p0, :cond_17

    invoke-virtual {p0}, LJ7/i;->M()LI8/O;

    move-result-object p0

    if-eqz p0, :cond_17

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    if-eqz p0, :cond_17

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_17
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic k()Lcom/nothing/wallpaper/segmenter/Segmenter;
    .registers 1

    invoke-static {}, Lj7/j;->S0()Lcom/nothing/wallpaper/segmenter/Segmenter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l(Lj7/j;)Landroid/graphics/Bitmap;
    .registers 1

    invoke-static {p0}, Lj7/j;->a0(Lj7/j;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lj7/j;)LA6/c;
    .registers 1

    invoke-static {p0}, Lj7/j;->V(Lj7/j;)LA6/c;

    move-result-object p0

    return-object p0
.end method

.method private final m0()Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lj7/j;->S:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private static final n(Lj7/j;)Lw6/a;
    .registers 3

    iget-object v0, p0, Lj7/j;->f:Lx6/k;

    if-eqz v0, :cond_12

    new-instance v0, Lw6/a;

    iget-object v1, p0, Lj7/j;->j:LK1/a;

    invoke-interface {v1}, LK1/a;->B()Ljava/util/List;

    move-result-object v1

    iget-object p0, p0, Lj7/j;->f:Lx6/k;

    invoke-direct {v0, v1, p0}, Lw6/a;-><init>(Ljava/util/List;Lx6/k;)V

    return-object v0

    :cond_12
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final o(Lh8/h;)Lw6/a;
    .registers 1

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw6/a;

    return-object p0
.end method

.method public static final synthetic p(Lj7/j;LC6/e;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0, p1, p2}, Lj7/j;->X(LC6/e;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Lj7/j;Landroid/graphics/Bitmap;)Z
    .registers 2

    invoke-direct {p0, p1}, Lj7/j;->Y(Landroid/graphics/Bitmap;)Z

    move-result p0

    return p0
.end method

.method private final q0()Lv6/b;
    .registers 1

    iget-object p0, p0, Lj7/j;->I:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv6/b;

    return-object p0
.end method

.method public static final synthetic r(Lj7/j;)LA6/c;
    .registers 1

    invoke-direct {p0}, Lj7/j;->c0()LA6/c;

    move-result-object p0

    return-object p0
.end method

.method private final r0()Landroid/graphics/Point;
    .registers 1

    iget-object p0, p0, Lj7/j;->H:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Point;

    return-object p0
.end method

.method public static final synthetic s(Lj7/j;)LI8/z;
    .registers 1

    iget-object p0, p0, Lj7/j;->t:LI8/z;

    return-object p0
.end method

.method private final s0()Landroid/graphics/Point;
    .registers 2

    iget-object p0, p0, Lj7/j;->G:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    const-string v0, "getValue(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/graphics/Point;

    return-object p0
.end method

.method public static final synthetic t(Lj7/j;)Landroid/graphics/Bitmap;
    .registers 1

    iget-object p0, p0, Lj7/j;->O:Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private final t0()Lcom/nothing/wallpaper/segmenter/Segmenter;
    .registers 1

    iget-object p0, p0, Lj7/j;->F:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/wallpaper/segmenter/Segmenter;

    return-object p0
.end method

.method public static final synthetic u(Lj7/j;ILm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-direct {p0, p1, p2}, Lj7/j;->h0(ILm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic v(Lj7/j;)LJ6/e;
    .registers 1

    iget-object p0, p0, Lj7/j;->n:LJ6/e;

    return-object p0
.end method

.method private final v0(Lm8/e;)Ljava/lang/Object;
    .registers 6

    instance-of v0, p1, Lj7/j$e;

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, Lj7/j$e;

    iget v1, v0, Lj7/j$e;->s:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, Lj7/j$e;->s:I

    goto :goto_18

    :cond_13
    new-instance v0, Lj7/j$e;

    invoke-direct {v0, p0, p1}, Lj7/j$e;-><init>(Lj7/j;Lm8/e;)V

    :goto_18
    iget-object p1, v0, Lj7/j$e;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lj7/j$e;->s:I

    const/4 v3, 0x1

    if-eqz v2, :cond_31

    if-ne v2, v3, :cond_29

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_49

    :cond_29
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_31
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p0, p0, Lj7/j;->e:LD6/f;

    instance-of p1, p0, LD6/e;

    if-eqz p1, :cond_8f

    check-cast p0, LD6/e;

    invoke-interface {p0}, LD6/e;->t()LI8/f;

    move-result-object p0

    iput v3, v0, Lj7/j$e;->s:I

    invoke-static {p0, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_49

    return-object v1

    :cond_49
    :goto_49
    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_51
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_68

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LC6/b;

    invoke-virtual {v1}, LC6/b;->c()LC6/a;

    move-result-object v1

    sget-object v2, LC6/a;->s:LC6/a;

    if-ne v1, v2, :cond_51

    goto :goto_69

    :cond_68
    move-object p1, v0

    :goto_69
    check-cast p1, LC6/b;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getWallpaperDepthBitmap: "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "EditWallpaperViewModel"

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_8e

    invoke-virtual {p1}, LC6/b;->a()LC6/i;

    move-result-object p0

    if-eqz p0, :cond_8e

    invoke-virtual {p0}, LC6/i;->a()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_8e
    return-object v0

    :cond_8f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed requirement."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final synthetic w(Lj7/j;)LI8/z;
    .registers 1

    iget-object p0, p0, Lj7/j;->q:LI8/z;

    return-object p0
.end method

.method public static final synthetic x(Lj7/j;)Lq6/b;
    .registers 1

    iget-object p0, p0, Lj7/j;->g:Lq6/b;

    return-object p0
.end method

.method public static final synthetic y(Lj7/j;)LC6/b;
    .registers 1

    iget-object p0, p0, Lj7/j;->P:LC6/b;

    return-object p0
.end method

.method private final y0()Lh3/a0;
    .registers 1

    iget-object p0, p0, Lj7/j;->y:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh3/a0;

    return-object p0
.end method

.method public static final synthetic z(Lj7/j;)LD6/f;
    .registers 1

    iget-object p0, p0, Lj7/j;->e:LD6/f;

    return-object p0
.end method

.method private final z0(LC6/b;)V
    .registers 11

    iget-object v0, p0, Lj7/j;->Q:LF8/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_9
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v3

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v4

    new-instance v6, Lj7/j$f;

    invoke-direct {v6, p0, p1, v1}, Lj7/j$f;-><init>(Lj7/j;LC6/b;Lm8/e;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p1

    iput-object p1, p0, Lj7/j;->Q:LF8/x0;

    return-void
.end method


# virtual methods
.method public final H0(Z)V
    .registers 5

    iget-object v0, p0, Lj7/j;->J:Ljava/lang/Boolean;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_33

    :cond_d
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lj7/j;->J:Ljava/lang/Boolean;

    if-eqz p1, :cond_2c

    iget-object p1, p0, Lj7/j;->i:LJ7/i;

    if-eqz p1, :cond_1f

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v2, v2, v0, v1}, LJ7/i;->S0(LJ7/i;ZZILjava/lang/Object;)V

    :cond_1f
    iget-object p0, p0, Lj7/j;->L:LI8/A;

    new-instance p1, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;->EXTENDED_WIDGET:Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;

    invoke-direct {p1, v0}, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthNotApplicable;-><init>(Lcom/nothing/wallpaper/picker/lockscreen/depth/NotApplicableReason;)V

    invoke-interface {p0, p1}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_2c
    iget-object p1, p0, Lj7/j;->O:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_33

    invoke-direct {p0, p1}, Lj7/j;->Y(Landroid/graphics/Bitmap;)Z

    :cond_33
    :goto_33
    return-void
.end method

.method public final L0()V
    .registers 5

    iget-boolean v0, p0, Lj7/j;->E:Z

    if-nez v0, :cond_5

    goto :goto_2c

    :cond_5
    sget-object v0, Lj7/j;->T:Lj7/j$a;

    iget-object v1, p0, Lj7/j;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lj7/j$a;->b(Landroid/content/Context;)Z

    move-result v0

    iput-boolean v0, p0, Lj7/j;->K:Z

    if-nez v0, :cond_2c

    iget-object v0, p0, Lj7/j;->i:LJ7/i;

    if-eqz v0, :cond_1b

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v3, v1, v2}, LJ7/i;->S0(LJ7/i;ZZILjava/lang/Object;)V

    :cond_1b
    iget-object v0, p0, Lj7/j;->L:LI8/A;

    invoke-interface {v0}, LI8/A;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;

    if-eqz v0, :cond_2c

    iget-object p0, p0, Lj7/j;->L:LI8/A;

    sget-object v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOff;->INSTANCE:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOff;

    invoke-interface {p0, v0}, LI8/A;->setValue(Ljava/lang/Object;)V

    :cond_2c
    :goto_2c
    return-void
.end method

.method public final M0()V
    .registers 3

    const-string v0, "EditWallpaperViewModel"

    const-string v1, "reset"

    invoke-static {v0, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lj7/j;->N0()V

    invoke-direct {p0}, Lj7/j;->C0()V

    return-void
.end method

.method public final U0(Lo7/b;)V
    .registers 2

    iput-object p1, p0, Lj7/j;->h:Lo7/b;

    invoke-direct {p0}, Lj7/j;->c1()V

    return-void
.end method

.method public final W(Lk7/a;)V
    .registers 11

    const-string v0, "effect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj7/j;->l:LD6/g;

    if-nez v0, :cond_a

    goto :goto_35

    :cond_a
    sget-object v0, Lj7/j$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_35

    sget-object p1, LC6/e$b;->c:LC6/e$b;

    iget-object v1, p0, Lj7/j;->A:LF8/x0;

    const/4 v2, 0x0

    if-eqz v1, :cond_1f

    invoke-static {v1, v2, v0, v2}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_1f
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v3

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v4

    new-instance v6, Lj7/j$c;

    invoke-direct {v6, p0, p1, v2}, Lj7/j$c;-><init>(Lj7/j;LC6/e$b;Lm8/e;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p1

    iput-object p1, p0, Lj7/j;->A:LF8/x0;

    :cond_35
    :goto_35
    return-void
.end method

.method public final W0(LJ7/i;)V
    .registers 2

    iput-object p1, p0, Lj7/j;->i:LJ7/i;

    invoke-direct {p0}, Lj7/j;->d1()V

    return-void
.end method

.method public final Y0(Ljava/util/List;)V
    .registers 11

    const-string v0, "effect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lk7/a;

    sget-object v4, Lk7/a;->q:Lk7/a;

    if-ne v3, v4, :cond_b

    goto :goto_1f

    :cond_1e
    move-object v1, v2

    :goto_1f
    const/4 v0, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_25

    move v1, v3

    goto :goto_26

    :cond_25
    move v1, v0

    :goto_26
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lk7/a;

    sget-object v6, Lk7/a;->r:Lk7/a;

    if-ne v5, v6, :cond_2a

    goto :goto_3d

    :cond_3c
    move-object v4, v2

    :goto_3d
    if-eqz v4, :cond_40

    move v0, v3

    :cond_40
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v3

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v4

    new-instance v6, Lj7/j$n;

    invoke-direct {v6, p0, v1, v0, v2}, Lj7/j$n;-><init>(Lj7/j;ZZLm8/e;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final Z()V
    .registers 1

    iget-object p0, p0, Lj7/j;->n:LJ6/e;

    invoke-virtual {p0}, LJ6/e;->e()V

    return-void
.end method

.method public final Z0(Landroid/app/Activity;Ljava/util/List;ILandroid/service/wallpaper/IWallpaperEngine;)V
    .registers 23

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v6, p2

    const-string v0, "container"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "effect"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lj7/j;->v:Landroidx/lifecycle/H;

    invoke-virtual {v0}, Landroidx/lifecycle/C;->e()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Silence;->INSTANCE:Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Silence;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c4

    iget-object v0, v1, Lj7/j;->v:Landroidx/lifecycle/H;

    invoke-virtual {v0}, Landroidx/lifecycle/C;->e()Ljava/lang/Object;

    move-result-object v0

    sget-object v4, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Loading;->INSTANCE:Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Loading;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2e

    goto/16 :goto_c4

    :cond_2e
    iget-object v0, v1, Lj7/j;->e:LD6/f;

    instance-of v4, v0, LD6/b;

    const/4 v10, 0x0

    if-eqz v4, :cond_38

    check-cast v0, LD6/b;

    goto :goto_39

    :cond_38
    move-object v0, v10

    :goto_39
    const/4 v11, 0x1

    if-eqz v0, :cond_3f

    invoke-virtual {v0, v11}, LD6/b;->B0(Z)V

    :cond_3f
    invoke-direct {v1}, Lj7/j;->E0()V

    sget-object v4, LF2/F;->t:LF2/F$a;

    invoke-virtual {v4, v2}, LF2/F$a;->a(Landroid/content/Context;)LF2/F;

    move-result-object v4

    invoke-virtual {v4}, LF2/F;->Q()I

    move-result v8

    invoke-direct {v1, v3}, Lj7/j;->X0(Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)V

    iput-boolean v11, v1, Lj7/j;->z:Z

    new-instance v7, Lkotlin/jvm/internal/E;

    invoke-direct {v7}, Lkotlin/jvm/internal/E;-><init>()V

    new-instance v4, Lkotlin/jvm/internal/E;

    invoke-direct {v4}, Lkotlin/jvm/internal/E;-><init>()V

    new-instance v5, Lkotlin/jvm/internal/E;

    invoke-direct {v5}, Lkotlin/jvm/internal/E;-><init>()V

    move-object v3, v0

    new-instance v0, Lj7/j$p;

    move/from16 v9, p3

    invoke-direct/range {v0 .. v9}, Lj7/j$p;-><init>(Lj7/j;Landroid/app/Activity;LD6/b;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;Ljava/util/List;Lkotlin/jvm/internal/E;II)V

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_70
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_82

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lk7/a;

    sget-object v8, Lk7/a;->q:Lk7/a;

    if-ne v6, v8, :cond_70

    goto :goto_83

    :cond_82
    move-object v3, v10

    :goto_83
    const/4 v2, 0x0

    if-eqz v3, :cond_88

    move v6, v11

    goto :goto_89

    :cond_88
    move v6, v2

    :goto_89
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lk7/a;

    sget-object v9, Lk7/a;->r:Lk7/a;

    if-ne v8, v9, :cond_8d

    move-object v10, v3

    :cond_9f
    if-eqz v10, :cond_a2

    goto :goto_a3

    :cond_a2
    move v11, v2

    :goto_a3
    invoke-static/range {p0 .. p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v12

    new-instance v15, Lj7/j$o;

    move-object v8, v7

    move v7, v11

    const/4 v11, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p4

    move-object v9, v4

    move-object v10, v5

    move/from16 v4, p3

    move-object v5, v0

    move-object v0, v15

    invoke-direct/range {v0 .. v11}, Lj7/j$o;-><init>(Lj7/j;Landroid/app/Activity;Landroid/service/wallpaper/IWallpaperEngine;ILj7/j$p;ZZLkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;Lm8/e;)V

    const/16 v16, 0x3

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v12 .. v17}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    :cond_c4
    :goto_c4
    return-void
.end method

.method public final a1()V
    .registers 15

    iget-object v0, p0, Lj7/j;->O:Landroid/graphics/Bitmap;

    const-string v1, "EditWallpaperViewModel"

    if-nez v0, :cond_c

    const-string p0, "toggleDepthState depth bitmap is null"

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_c
    iget-object v0, p0, Lj7/j;->M:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    iget-object v2, p0, Lj7/j;->M:LI8/O;

    invoke-interface {v2}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    instance-of v3, v2, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOff;

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_49

    iget-object v2, p0, Lj7/j;->N:Lcom/nothing/wallpaper/common/bitmap/BitmapOpaqueUtil$OpaquePercentage;

    if-nez v2, :cond_3c

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v8

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v9

    new-instance v11, Lj7/j$t;

    invoke-direct {v11, p0, v7}, Lj7/j$t;-><init>(Lj7/j;Lm8/e;)V

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    goto :goto_41

    :cond_3c
    sget-object v2, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;->INSTANCE:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;

    invoke-direct {p0, v2}, Lj7/j;->b1(Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;)V

    :goto_41
    iget-object v2, p0, Lj7/j;->i:LJ7/i;

    if-eqz v2, :cond_78

    invoke-static {v2, v4, v6, v5, v7}, LJ7/i;->S0(LJ7/i;ZZILjava/lang/Object;)V

    goto :goto_78

    :cond_49
    instance-of v2, v2, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOn;

    if-eqz v2, :cond_5c

    iget-object v2, p0, Lj7/j;->L:LI8/A;

    sget-object v3, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOff;->INSTANCE:Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState$DepthOff;

    invoke-interface {v2, v3}, LI8/A;->setValue(Ljava/lang/Object;)V

    iget-object v2, p0, Lj7/j;->i:LJ7/i;

    if-eqz v2, :cond_78

    invoke-static {v2, v6, v6, v5, v7}, LJ7/i;->S0(LJ7/i;ZZILjava/lang/Object;)V

    goto :goto_78

    :cond_5c
    sget-object v2, Lj7/j;->T:Lj7/j$a;

    iget-object v3, p0, Lj7/j;->M:LI8/O;

    invoke-interface {v3}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;

    invoke-virtual {v2, v3}, Lj7/j$a;->a(Lcom/nothing/wallpaper/picker/lockscreen/depth/DepthEffectState;)Z

    move-result v2

    if-eqz v2, :cond_78

    iget-object v2, p0, Lj7/j;->i:LJ7/i;

    if-eqz v2, :cond_78

    invoke-direct {p0}, Lj7/j;->j0()Z

    move-result v3

    xor-int/2addr v3, v4

    invoke-static {v2, v3, v6, v5, v7}, LJ7/i;->S0(LJ7/i;ZZILjava/lang/Object;)V

    :cond_78
    :goto_78
    iget-object v2, p0, Lj7/j;->M:LI8/O;

    invoke-interface {v2}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {p0}, Lj7/j;->j0()Z

    move-result v3

    iget-object p0, p0, Lj7/j;->O:Landroid/graphics/Bitmap;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "toggleDepthState old:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " new:"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " switch:"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " depth:"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b0()Landroid/content/Context;
    .registers 1

    iget-object p0, p0, Lj7/j;->b:Landroid/content/Context;

    return-object p0
.end method

.method protected d()V
    .registers 4

    invoke-super {p0}, Landroidx/lifecycle/a0;->d()V

    const-string v0, "onCleared"

    invoke-static {v0}, Lcom/nothing/wallpaper/common/log/c;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lj7/j;->O:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_f
    iget-object v0, p0, Lj7/j;->P:LC6/b;

    if-eqz v0, :cond_22

    invoke-virtual {v0}, LC6/b;->a()LC6/i;

    move-result-object v0

    if-eqz v0, :cond_22

    invoke-virtual {v0}, LC6/i;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_22

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_22
    iget-boolean v0, p0, Lj7/j;->z:Z

    if-nez v0, :cond_2d

    iget-object v0, p0, Lj7/j;->f:Lx6/k;

    if-eqz v0, :cond_2d

    invoke-virtual {v0}, Lx6/k;->i()V

    :cond_2d
    invoke-direct {p0}, Lj7/j;->c0()LA6/c;

    move-result-object v0

    if-eqz v0, :cond_3f

    invoke-static {}, Li6/s;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lj7/a;

    invoke-direct {v2, v0}, Lj7/a;-><init>(LA6/c;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_3f
    iget-object v0, p0, Lj7/j;->l:LD6/g;

    if-eqz v0, :cond_46

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    :cond_46
    invoke-virtual {p0}, Lj7/j;->Z()V

    iget-boolean v0, p0, Lj7/j;->E:Z

    if-eqz v0, :cond_56

    invoke-direct {p0}, Lj7/j;->t0()Lcom/nothing/wallpaper/segmenter/Segmenter;

    move-result-object v0

    iget-object p0, p0, Lj7/j;->R:Lj7/j$s;

    invoke-interface {v0, p0}, Lcom/nothing/wallpaper/segmenter/Segmenter;->e(Lcom/nothing/wallpaper/segmenter/Segmenter$b;)V

    :cond_56
    return-void
.end method

.method public final d0()LI8/f;
    .registers 1

    iget-object p0, p0, Lj7/j;->u:LI8/f;

    return-object p0
.end method

.method public final e0()Lo7/b;
    .registers 1

    iget-object p0, p0, Lj7/j;->h:Lo7/b;

    return-object p0
.end method

.method public final f0()Ljava/util/Set;
    .registers 1

    iget-object p0, p0, Lj7/j;->s:Ljava/util/Set;

    return-object p0
.end method

.method public final g0()Z
    .registers 1

    iget-boolean p0, p0, Lj7/j;->E:Z

    return p0
.end method

.method public final i0()LI8/O;
    .registers 1

    iget-object p0, p0, Lj7/j;->M:LI8/O;

    return-object p0
.end method

.method public final k0()Z
    .registers 1

    iget-boolean p0, p0, Lj7/j;->K:Z

    return p0
.end method

.method public final l0()Lp7/a;
    .registers 1

    iget-object p0, p0, Lj7/j;->c:Lp7/a;

    return-object p0
.end method

.method public final n0()LI8/f;
    .registers 1

    iget-object p0, p0, Lj7/j;->r:LI8/f;

    return-object p0
.end method

.method public final o0()Landroidx/lifecycle/C;
    .registers 1

    iget-object p0, p0, Lj7/j;->w:Landroidx/lifecycle/C;

    return-object p0
.end method

.method public final p0()LJ7/i;
    .registers 1

    iget-object p0, p0, Lj7/j;->i:LJ7/i;

    return-object p0
.end method

.method public final u0()Lg3/x;
    .registers 1

    iget-object p0, p0, Lj7/j;->d:Lg3/x;

    return-object p0
.end method

.method public final w0()LI8/f;
    .registers 1

    iget-object p0, p0, Lj7/j;->o:LI8/f;

    return-object p0
.end method

.method public final x0()LI8/f;
    .registers 1

    iget-object p0, p0, Lj7/j;->p:LI8/f;

    return-object p0
.end method
