.class public final LJ7/i;
.super Landroidx/lifecycle/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ7/i$b;,
        LJ7/i$c;
    }
.end annotation


# static fields
.field public static final d0:LJ7/i$b;


# instance fields
.field private final A:LI8/E;

.field private final B:LI8/O;

.field private final C:LI8/O;

.field private final D:LI8/O;

.field private final E:LI8/O;

.field private final F:LI8/O;

.field private final G:LI8/O;

.field private final H:LI8/O;

.field private final I:LI8/O;

.field private final J:LI8/O;

.field private final K:LI8/O;

.field private final L:LI8/f;

.field private final M:LI8/f;

.field private final N:LI8/f;

.field private final O:LI8/f;

.field private final P:LI8/f;

.field private Q:LF8/x0;

.field private R:Z

.field private S:Z

.field private final T:LI8/f;

.field private final U:LI8/E;

.field private final V:LJ7/i$K;

.field private final W:LI8/A;

.field private final X:LI8/O;

.field private final Y:LI8/f;

.field private final Z:LI8/O;

.field private final a0:LI8/f;

.field private final b:LU5/a;

.field private final b0:LI8/f;

.field private final c:LB7/a;

.field private c0:Ljava/util/List;

.field private final d:Lh3/c;

.field private final e:Landroidx/lifecycle/Q;

.field private final f:Landroid/content/Context;

.field private final g:LM1/b;

.field private final h:LF8/I;

.field private final i:LS1/a;

.field private final j:Landroid/content/res/Resources;

.field private final k:Lh8/h;

.field private final l:Z

.field private final m:Lh8/h;

.field private final n:LI8/O;

.field private final o:LI8/O;

.field private final p:LI8/O;

.field private final q:LI8/O;

.field private final r:Landroidx/lifecycle/H;

.field private final s:Landroidx/lifecycle/C;

.field private final t:LI8/E;

.field private final u:LI8/E;

.field private final v:LI8/E;

.field private final w:LI8/f;

.field private final x:LI8/z;

.field private final y:LI8/E;

.field private final z:LI8/z;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LJ7/i$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LJ7/i$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LJ7/i;->d0:LJ7/i$b;

    return-void
.end method

.method public constructor <init>(LU5/a;LB7/a;Lh3/c;Landroidx/lifecycle/Q;Landroid/content/Context;LM1/b;LF8/I;LS1/a;Landroid/content/res/Resources;)V
    .registers 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    const-string v10, "repository"

    invoke-static {v1, v10}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "shortcutRepository"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "currentWallpaperInfoFactory"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "savedStateHandle"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "appContext"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "interactor"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "backgroundDispatcher"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "clockViewFactory"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "resources"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Landroidx/lifecycle/a0;-><init>()V

    iput-object v1, v0, LJ7/i;->b:LU5/a;

    iput-object v2, v0, LJ7/i;->c:LB7/a;

    iput-object v3, v0, LJ7/i;->d:Lh3/c;

    iput-object v4, v0, LJ7/i;->e:Landroidx/lifecycle/Q;

    iput-object v5, v0, LJ7/i;->f:Landroid/content/Context;

    iput-object v6, v0, LJ7/i;->g:LM1/b;

    iput-object v7, v0, LJ7/i;->h:LF8/I;

    iput-object v8, v0, LJ7/i;->i:LS1/a;

    iput-object v9, v0, LJ7/i;->j:Landroid/content/res/Resources;

    new-instance v3, LJ7/c;

    invoke-direct {v3}, LJ7/c;-><init>()V

    invoke-static {v3}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v3

    iput-object v3, v0, LJ7/i;->k:Lh8/h;

    invoke-virtual {v0}, LJ7/i;->a0()Z

    move-result v3

    iput-boolean v3, v0, LJ7/i;->l:Z

    new-instance v3, LJ7/d;

    invoke-direct {v3, v0}, LJ7/d;-><init>(LJ7/i;)V

    invoke-static {v3}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v3

    iput-object v3, v0, LJ7/i;->m:Lh8/h;

    const-string v3, "clock_area"

    const/4 v5, 0x0

    invoke-virtual {v4, v3, v5}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object v3

    iput-object v3, v0, LJ7/i;->n:LI8/O;

    const-string v3, "depth_switch_state"

    invoke-virtual {v4, v3, v5}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object v3

    iput-object v3, v0, LJ7/i;->o:LI8/O;

    new-instance v8, Lz7/c;

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    invoke-direct/range {v8 .. v14}, Lz7/c;-><init>(Ljava/lang/String;Ljava/lang/String;JILkotlin/jvm/internal/h;)V

    const-string v3, "select_widget_key"

    invoke-virtual {v4, v3, v8}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object v3

    iput-object v3, v0, LJ7/i;->p:LI8/O;

    const-string v8, "key_tips_state"

    sget-object v9, LJ7/m$b;->q:LJ7/m$b;

    invoke-virtual {v4, v8, v9}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object v8

    iput-object v8, v0, LJ7/i;->q:LI8/O;

    new-instance v8, Landroidx/lifecycle/H;

    sget-object v9, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$None;->INSTANCE:Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$None;

    invoke-direct {v8, v9}, Landroidx/lifecycle/H;-><init>(Ljava/lang/Object;)V

    iput-object v8, v0, LJ7/i;->r:Landroidx/lifecycle/H;

    iput-object v8, v0, LJ7/i;->s:Landroidx/lifecycle/C;

    invoke-interface {v1}, LU5/a;->x()LI8/f;

    move-result-object v8

    new-instance v9, LJ7/i$h;

    invoke-direct {v9, v5}, LJ7/i$h;-><init>(Lm8/e;)V

    invoke-static {v8, v9}, LI8/h;->E(LI8/f;Lv8/p;)LI8/f;

    move-result-object v8

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v9

    sget-object v10, LI8/K;->a:LI8/K$a;

    invoke-virtual {v10}, LI8/K$a;->c()LI8/K;

    move-result-object v11

    const/4 v12, 0x1

    invoke-static {v8, v9, v11, v12}, LI8/h;->J(LI8/f;LF8/L;LI8/K;I)LI8/E;

    move-result-object v8

    iput-object v8, v0, LJ7/i;->t:LI8/E;

    invoke-interface {v1}, LU5/a;->w()LI8/f;

    move-result-object v9

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v11

    invoke-virtual {v10}, LI8/K$a;->c()LI8/K;

    move-result-object v13

    invoke-static {v9, v11, v13, v12}, LI8/h;->J(LI8/f;LF8/L;LI8/K;I)LI8/E;

    move-result-object v9

    iput-object v9, v0, LJ7/i;->u:LI8/E;

    new-instance v11, LJ7/i$f;

    invoke-direct {v11, v5}, LJ7/i$f;-><init>(Lm8/e;)V

    invoke-static {v9, v8, v11}, LI8/h;->l(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object v8

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v11

    invoke-virtual {v10}, LI8/K$a;->c()LI8/K;

    move-result-object v13

    invoke-static {v8, v11, v13, v12}, LI8/h;->J(LI8/f;LF8/L;LI8/K;I)LI8/E;

    move-result-object v8

    iput-object v8, v0, LJ7/i;->v:LI8/E;

    invoke-interface {v1}, LU5/a;->o()LI8/f;

    move-result-object v8

    iput-object v8, v0, LJ7/i;->w:LI8/f;

    const/4 v8, 0x7

    const/4 v11, 0x0

    invoke-static {v11, v11, v5, v8, v5}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object v8

    iput-object v8, v0, LJ7/i;->x:LI8/z;

    iput-object v8, v0, LJ7/i;->y:LI8/E;

    const/4 v8, 0x5

    invoke-static {v11, v12, v5, v8, v5}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object v8

    iput-object v8, v0, LJ7/i;->z:LI8/z;

    iput-object v8, v0, LJ7/i;->A:LI8/E;

    invoke-virtual {v6}, LM1/b;->d()LI8/f;

    move-result-object v8

    new-instance v13, LJ7/i$g;

    invoke-direct {v13, v5}, LJ7/i$g;-><init>(Lm8/e;)V

    invoke-static {v8, v13}, LI8/h;->E(LI8/f;Lv8/p;)LI8/f;

    move-result-object v8

    const/4 v13, 0x2

    invoke-static {v7, v12, v5, v13, v5}, LF8/I;->k1(LF8/I;ILjava/lang/String;ILjava/lang/Object;)LF8/I;

    move-result-object v14

    invoke-static {v8, v14}, LI8/h;->D(LI8/f;Lm8/i;)LI8/f;

    move-result-object v8

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v14

    invoke-virtual {v10}, LI8/K$a;->c()LI8/K;

    move-result-object v15

    invoke-static {}, Li8/U;->d()Ljava/util/Set;

    move-result-object v11

    invoke-static {v8, v14, v15, v11}, LI8/h;->K(LI8/f;LF8/L;LI8/K;Ljava/lang/Object;)LI8/O;

    move-result-object v8

    iput-object v8, v0, LJ7/i;->B:LI8/O;

    invoke-virtual {v6}, LM1/b;->d()LI8/f;

    move-result-object v11

    new-instance v14, LJ7/i$e;

    invoke-direct {v14, v0, v5}, LJ7/i$e;-><init>(LJ7/i;Lm8/e;)V

    invoke-static {v11, v14}, LI8/h;->E(LI8/f;Lv8/p;)LI8/f;

    move-result-object v11

    invoke-static {v7, v12, v5, v13, v5}, LF8/I;->k1(LF8/I;ILjava/lang/String;ILjava/lang/Object;)LF8/I;

    move-result-object v7

    invoke-static {v11, v7}, LI8/h;->D(LI8/f;Lm8/i;)LI8/f;

    move-result-object v7

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v11

    invoke-virtual {v10}, LI8/K$a;->c()LI8/K;

    move-result-object v13

    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object v14

    invoke-static {v7, v11, v13, v14}, LI8/h;->K(LI8/f;LF8/L;LI8/K;Ljava/lang/Object;)LI8/O;

    move-result-object v7

    iput-object v7, v0, LJ7/i;->C:LI8/O;

    invoke-virtual {v6}, LM1/b;->i()LI8/f;

    move-result-object v11

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v13

    invoke-virtual {v10}, LI8/K$a;->c()LI8/K;

    move-result-object v14

    const-string v15, ""

    invoke-static {v11, v13, v14, v15}, LI8/h;->K(LI8/f;LF8/L;LI8/K;Ljava/lang/Object;)LI8/O;

    move-result-object v11

    iput-object v11, v0, LJ7/i;->D:LI8/O;

    invoke-virtual {v6}, LM1/b;->j()LI8/f;

    move-result-object v13

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v14

    invoke-virtual {v10}, LI8/K$a;->c()LI8/K;

    move-result-object v12

    sget-object v5, LN1/a;->q:LN1/a;

    invoke-static {v13, v14, v12, v5}, LI8/h;->K(LI8/f;LF8/L;LI8/K;Ljava/lang/Object;)LI8/O;

    move-result-object v5

    iput-object v5, v0, LJ7/i;->E:LI8/O;

    invoke-virtual {v6}, LM1/b;->h()LI8/f;

    move-result-object v12

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v13

    invoke-virtual {v10}, LI8/K$a;->c()LI8/K;

    move-result-object v14

    sget-object v2, LA7/a;->r:LA7/a;

    invoke-static {v12, v13, v14, v2}, LI8/h;->K(LI8/f;LF8/L;LI8/K;Ljava/lang/Object;)LI8/O;

    move-result-object v2

    iput-object v2, v0, LJ7/i;->F:LI8/O;

    invoke-virtual {v6}, LM1/b;->l()LI8/f;

    move-result-object v6

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v12

    invoke-virtual {v10}, LI8/K$a;->c()LI8/K;

    move-result-object v13

    sget-object v14, LA7/g;->q:LA7/g;

    invoke-static {v6, v12, v13, v14}, LI8/h;->K(LI8/f;LF8/L;LI8/K;Ljava/lang/Object;)LI8/O;

    move-result-object v6

    iput-object v6, v0, LJ7/i;->G:LI8/O;

    const-string v12, "select_clock_id"

    const/4 v13, 0x0

    invoke-virtual {v4, v12, v13}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object v12

    iput-object v12, v0, LJ7/i;->H:LI8/O;

    const-string v14, "select_clock_size"

    invoke-virtual {v4, v14, v13}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object v14

    iput-object v14, v0, LJ7/i;->I:LI8/O;

    move-object/from16 p8, v10

    const-string v10, "select_clock_align"

    invoke-virtual {v4, v10, v13}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object v10

    iput-object v10, v0, LJ7/i;->J:LI8/O;

    move-object/from16 p7, v15

    const-string v15, "select_dynamic_font"

    invoke-virtual {v4, v15, v13}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object v15

    iput-object v15, v0, LJ7/i;->K:LI8/O;

    new-instance v1, LJ7/i$v;

    invoke-direct {v1, v13}, LJ7/i$v;-><init>(Lm8/e;)V

    invoke-static {v11, v12, v1}, LI8/h;->l(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object v1

    iput-object v1, v0, LJ7/i;->L:LI8/f;

    new-instance v11, LJ7/i$w;

    invoke-direct {v11, v13}, LJ7/i$w;-><init>(Lm8/e;)V

    invoke-static {v5, v14, v11}, LI8/h;->l(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object v5

    iput-object v5, v0, LJ7/i;->M:LI8/f;

    new-instance v5, LJ7/i$u;

    invoke-direct {v5, v13}, LJ7/i$u;-><init>(Lm8/e;)V

    invoke-static {v2, v10, v5}, LI8/h;->l(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object v2

    iput-object v2, v0, LJ7/i;->N:LI8/f;

    new-instance v2, LJ7/i$G;

    invoke-direct {v2, v8}, LJ7/i$G;-><init>(LI8/f;)V

    new-instance v5, LJ7/i$x;

    invoke-direct {v5, v0, v13}, LJ7/i$x;-><init>(LJ7/i;Lm8/e;)V

    invoke-static {v6, v15, v1, v2, v5}, LI8/h;->j(LI8/f;LI8/f;LI8/f;LI8/f;Lv8/s;)LI8/f;

    move-result-object v1

    invoke-static {v1}, LI8/h;->o(LI8/f;)LI8/f;

    move-result-object v1

    iput-object v1, v0, LJ7/i;->O:LI8/f;

    new-instance v1, LJ7/i$H;

    invoke-direct {v1, v13, v0}, LJ7/i$H;-><init>(Lm8/e;LJ7/i;)V

    invoke-static {v7, v1}, LI8/h;->N(LI8/f;Lv8/q;)LI8/f;

    move-result-object v1

    new-instance v2, LJ7/i$J;

    invoke-direct {v2, v1}, LJ7/i$J;-><init>(LI8/f;)V

    iput-object v2, v0, LJ7/i;->P:LI8/f;

    invoke-interface/range {p1 .. p1}, LU5/a;->j()LI8/f;

    move-result-object v1

    iput-object v1, v0, LJ7/i;->T:LI8/f;

    new-instance v1, LJ7/i$t;

    invoke-direct {v1, v0, v13}, LJ7/i$t;-><init>(LJ7/i;Lm8/e;)V

    invoke-static {v9, v3, v1}, LI8/h;->l(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object v1

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v2

    invoke-virtual/range {p8 .. p8}, LI8/K$a;->c()LI8/K;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v5}, LI8/h;->J(LI8/f;LF8/L;LI8/K;I)LI8/E;

    move-result-object v1

    iput-object v1, v0, LJ7/i;->U:LI8/E;

    new-instance v1, LJ7/i$K;

    invoke-direct {v1, v0}, LJ7/i$K;-><init>(LJ7/i;)V

    iput-object v1, v0, LJ7/i;->V:LJ7/i$K;

    invoke-static {v13}, LI8/Q;->a(Ljava/lang/Object;)LI8/A;

    move-result-object v1

    iput-object v1, v0, LJ7/i;->W:LI8/A;

    invoke-interface/range {p2 .. p2}, LB7/a;->a()LI8/f;

    move-result-object v2

    new-instance v3, LJ7/i$z;

    invoke-direct {v3, v13}, LJ7/i$z;-><init>(Lm8/e;)V

    invoke-static {v2, v1, v3}, LI8/h;->l(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object v1

    new-instance v2, LJ7/i$I;

    invoke-direct {v2, v1}, LJ7/i$I;-><init>(LI8/f;)V

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    const/4 v15, 0x3

    const/16 v16, 0x0

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    move-object/from16 v5, p7

    move-object/from16 v10, p8

    const/4 v3, 0x1

    invoke-static/range {v10 .. v16}, LI8/K$a;->b(LI8/K$a;JJILjava/lang/Object;)LI8/K;

    move-result-object v6

    invoke-static {v2, v1, v6, v5}, LI8/h;->K(LI8/f;LF8/L;LI8/K;Ljava/lang/Object;)LI8/O;

    move-result-object v1

    iput-object v1, v0, LJ7/i;->X:LI8/O;

    invoke-interface/range {p2 .. p2}, LB7/a;->d()LI8/f;

    move-result-object v2

    new-instance v5, LJ7/i$r;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, LJ7/i$r;-><init>(Lm8/e;)V

    invoke-static {v2, v1, v5}, LI8/h;->l(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object v2

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v5

    invoke-static/range {v10 .. v16}, LI8/K$a;->b(LI8/K$a;JJILjava/lang/Object;)LI8/K;

    move-result-object v7

    invoke-static {v2, v5, v7, v3}, LI8/h;->J(LI8/f;LF8/L;LI8/K;I)LI8/E;

    move-result-object v2

    iput-object v2, v0, LJ7/i;->Y:LI8/f;

    const-string v5, "select_shortcuts"

    invoke-virtual {v4, v5, v6}, Landroidx/lifecycle/Q;->e(Ljava/lang/String;Ljava/lang/Object;)LI8/O;

    move-result-object v4

    iput-object v4, v0, LJ7/i;->Z:LI8/O;

    invoke-interface/range {p2 .. p2}, LB7/a;->b()LI8/f;

    move-result-object v5

    new-instance v7, LJ7/i$F;

    invoke-direct {v7, v0, v6}, LJ7/i$F;-><init>(LJ7/i;Lm8/e;)V

    invoke-static {v5, v2, v4, v1, v7}, LI8/h;->j(LI8/f;LI8/f;LI8/f;LI8/f;Lv8/s;)LI8/f;

    move-result-object v2

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v5

    const/4 v6, 0x3

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move/from16 p8, v6

    move-object/from16 p9, v7

    move-wide/from16 p4, v8

    move-object/from16 p3, v10

    move-wide/from16 p6, v11

    invoke-static/range {p3 .. p9}, LI8/K$a;->b(LI8/K$a;JJILjava/lang/Object;)LI8/K;

    move-result-object v6

    invoke-static {v2, v5, v6, v3}, LI8/h;->J(LI8/f;LF8/L;LI8/K;I)LI8/E;

    move-result-object v2

    iput-object v2, v0, LJ7/i;->a0:LI8/f;

    invoke-interface/range {p2 .. p2}, LB7/a;->d()LI8/f;

    move-result-object v5

    new-instance v6, LJ7/i$s;

    const/4 v13, 0x0

    invoke-direct {v6, v13}, LJ7/i$s;-><init>(Lm8/e;)V

    invoke-static {v5, v4, v1, v2, v6}, LI8/h;->j(LI8/f;LI8/f;LI8/f;LI8/f;Lv8/s;)LI8/f;

    move-result-object v1

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v2

    invoke-virtual {v10}, LI8/K$a;->c()LI8/K;

    move-result-object v4

    invoke-static {v1, v2, v4, v3}, LI8/h;->J(LI8/f;LF8/L;LI8/K;I)LI8/E;

    move-result-object v1

    iput-object v1, v0, LJ7/i;->b0:LI8/f;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, LJ7/i;->c0:Ljava/util/List;

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    new-instance v2, LJ7/i$a;

    invoke-direct {v2, v0, v13}, LJ7/i$a;-><init>(LJ7/i;Lm8/e;)V

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 p2, v1

    move-object/from16 p5, v2

    move/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p3, v5

    move-object/from16 p4, v6

    invoke-static/range {p2 .. p7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-virtual {v0}, LJ7/i;->a0()Z

    move-result v1

    if-eqz v1, :cond_30d

    invoke-direct {v0}, LJ7/i;->l0()LJ7/o;

    move-result-object v1

    invoke-static {v0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v2

    move-object/from16 v3, p1

    invoke-interface {v1, v2, v3}, LJ7/o;->d(LF8/L;LU5/a;)V

    invoke-direct {v0}, LJ7/i;->m0()V

    :cond_30d
    return-void
.end method

.method private final H0(LC7/a;ZLm8/e;)Ljava/lang/Object;
    .registers 6

    new-instance p3, LC7/b;

    iget-object v0, p0, LJ7/i;->X:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, LC7/a;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, v0, p1}, LC7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LJ7/i;->Z:LI8/O;

    invoke-interface {p1}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_23

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Li8/s;->u0(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_28

    :cond_23
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_28
    if-eqz p2, :cond_51

    iget-object p2, p0, LJ7/i;->X:LI8/O;

    invoke-interface {p2}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p2

    const-string v0, "bottom_start"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3a

    const-string v0, "bottom_end"

    :cond_3a
    new-instance p2, LJ7/e;

    invoke-direct {p2, v0}, LJ7/e;-><init>(Ljava/lang/String;)V

    new-instance v1, LJ7/f;

    invoke-direct {v1, p2}, LJ7/f;-><init>(Lv8/l;)V

    invoke-interface {p1, v1}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    new-instance p2, LC7/b;

    const-string v1, "none"

    invoke-direct {p2, v0, v1}, LC7/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_51
    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_67

    new-instance p2, LJ7/g;

    invoke-direct {p2, p0}, LJ7/g;-><init>(LJ7/i;)V

    new-instance v0, LJ7/h;

    invoke-direct {v0, p2}, LJ7/h;-><init>(Lv8/l;)V

    invoke-interface {p1, v0}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    :cond_67
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string p2, "select_shortcuts"

    invoke-virtual {p0, p2, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final I0(Ljava/lang/String;LC7/b;)Z
    .registers 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LC7/b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final J0(Lv8/l;Ljava/lang/Object;)Z
    .registers 2

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final K0(LJ7/i;LC7/b;)Z
    .registers 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LC7/b;->b()Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, LJ7/i;->X:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final L0(Lv8/l;Ljava/lang/Object;)Z
    .registers 2

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private final O()Landroid/graphics/Rect;
    .registers 2

    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v0, "clock_area_origin"

    invoke-virtual {p0, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Rect;

    return-object p0
.end method

.method public static synthetic S0(LJ7/i;ZZILjava/lang/Object;)V
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    const/4 p2, 0x0

    :cond_5
    invoke-virtual {p0, p1, p2}, LJ7/i;->R0(ZZ)V

    return-void
.end method

.method private final U0(Landroid/graphics/Rect;)V
    .registers 3

    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v0, "clock_area_origin"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private static final Y0()Z
    .registers 1

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v0

    invoke-interface {v0}, Lh3/H;->C()Ld3/a;

    move-result-object v0

    invoke-virtual {v0}, Ld3/a;->p()Z

    move-result v0

    return v0
.end method

.method private final Z0(Ljava/lang/String;Ljava/util/Set;)Z
    .registers 3

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p0

    invoke-interface {p0}, Lh3/H;->C()Ld3/a;

    move-result-object p0

    invoke-virtual {p0}, Ld3/a;->q()Z

    move-result p0

    if-eqz p0, :cond_16

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_16

    const/4 p0, 0x1

    return p0

    :cond_16
    const/4 p0, 0x0

    return p0
.end method

.method static synthetic a1(LJ7/i;Ljava/lang/String;Ljava/util/Set;ILjava/lang/Object;)Z
    .registers 5

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_c

    iget-object p2, p0, LJ7/i;->B:LI8/O;

    invoke-interface {p2}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Set;

    :cond_c
    invoke-direct {p0, p1, p2}, LJ7/i;->Z0(Ljava/lang/String;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method private static final d1(LJ7/i;)LJ7/o;
    .registers 2

    invoke-virtual {p0}, LJ7/i;->a0()Z

    move-result v0

    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    invoke-static {v0, p0}, LJ7/p;->a(ZLandroidx/lifecycle/Q;)LJ7/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Z
    .registers 1

    invoke-static {}, LJ7/i;->Y0()Z

    move-result v0

    return v0
.end method

.method public static synthetic f(Lv8/l;Ljava/lang/Object;)Z
    .registers 2

    invoke-static {p0, p1}, LJ7/i;->J0(Lv8/l;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic g(Ljava/lang/String;LC7/b;)Z
    .registers 2

    invoke-static {p0, p1}, LJ7/i;->I0(Ljava/lang/String;LC7/b;)Z

    move-result p0

    return p0
.end method

.method public static synthetic h(LJ7/i;)LJ7/o;
    .registers 1

    invoke-static {p0}, LJ7/i;->d1(LJ7/i;)LJ7/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lv8/l;Ljava/lang/Object;)Z
    .registers 2

    invoke-static {p0, p1}, LJ7/i;->L0(Lv8/l;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic j(LJ7/i;LC7/b;)Z
    .registers 2

    invoke-static {p0, p1}, LJ7/i;->K0(LJ7/i;LC7/b;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic k(LJ7/i;)Landroid/content/Context;
    .registers 1

    iget-object p0, p0, LJ7/i;->f:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic l(LJ7/i;)LS1/a;
    .registers 1

    iget-object p0, p0, LJ7/i;->i:LS1/a;

    return-object p0
.end method

.method private final l0()LJ7/o;
    .registers 1

    iget-object p0, p0, LJ7/i;->m:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ7/o;

    return-object p0
.end method

.method public static final synthetic m(LJ7/i;)Lh3/c;
    .registers 1

    iget-object p0, p0, LJ7/i;->d:Lh3/c;

    return-object p0
.end method

.method private final m0()V
    .registers 3

    sget-object v0, Lj7/j;->T:Lj7/j$a;

    iget-object v1, p0, LJ7/i;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lj7/j$a;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_18

    sget-object v0, LJ7/i;->d0:LJ7/i$b;

    iget-object v1, p0, LJ7/i;->f:Landroid/content/Context;

    invoke-virtual {v0, v1}, LJ7/i$b;->a(Landroid/content/Context;)Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_18

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, LJ7/i;->P0(Landroid/graphics/Rect;Z)V

    :cond_18
    return-void
.end method

.method public static final synthetic n(LJ7/i;)LM1/b;
    .registers 1

    iget-object p0, p0, LJ7/i;->g:LM1/b;

    return-object p0
.end method

.method public static final synthetic o(LJ7/i;)LU5/a;
    .registers 1

    iget-object p0, p0, LJ7/i;->b:LU5/a;

    return-object p0
.end method

.method public static final synthetic p(LJ7/i;)Landroid/content/res/Resources;
    .registers 1

    iget-object p0, p0, LJ7/i;->j:Landroid/content/res/Resources;

    return-object p0
.end method

.method public static final synthetic q(LJ7/i;)Landroidx/lifecycle/Q;
    .registers 1

    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    return-object p0
.end method

.method public static final synthetic r(LJ7/i;)LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/i;->X:LI8/O;

    return-object p0
.end method

.method public static final synthetic s(LJ7/i;)LB7/a;
    .registers 1

    iget-object p0, p0, LJ7/i;->c:LB7/a;

    return-object p0
.end method

.method public static final synthetic t(LJ7/i;)LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/i;->Z:LI8/O;

    return-object p0
.end method

.method public static final synthetic u(LJ7/i;)LJ7/i$K;
    .registers 1

    iget-object p0, p0, LJ7/i;->V:LJ7/i$K;

    return-object p0
.end method

.method public static final synthetic v(LJ7/i;)LI8/z;
    .registers 1

    iget-object p0, p0, LJ7/i;->x:LI8/z;

    return-object p0
.end method

.method public static final synthetic w(LJ7/i;)LI8/z;
    .registers 1

    iget-object p0, p0, LJ7/i;->z:LI8/z;

    return-object p0
.end method

.method public static final synthetic x(LJ7/i;)Landroidx/lifecycle/H;
    .registers 1

    iget-object p0, p0, LJ7/i;->r:Landroidx/lifecycle/H;

    return-object p0
.end method

.method public static final synthetic y(LJ7/i;LC7/a;ZLm8/e;)Ljava/lang/Object;
    .registers 4

    invoke-direct {p0, p1, p2, p3}, LJ7/i;->H0(LC7/a;ZLm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic z(LJ7/i;Ljava/lang/String;Ljava/util/Set;)Z
    .registers 3

    invoke-direct {p0, p1, p2}, LJ7/i;->Z0(Ljava/lang/String;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final A(Lh8/o;)V
    .registers 11

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LJ7/i;->l0()LJ7/o;

    move-result-object v0

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    iget-object v2, p0, LJ7/i;->b:LU5/a;

    invoke-interface {v0, v1, v2, p1}, LJ7/o;->e(LF8/L;LU5/a;Lh8/o;)V

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v3

    new-instance v6, LJ7/i$d;

    const/4 p1, 0x0

    invoke-direct {v6, p0, p1}, LJ7/i$d;-><init>(LJ7/i;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final A0()V
    .registers 7

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    new-instance v3, LJ7/i$n;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, LJ7/i$n;-><init>(LJ7/i;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final B()V
    .registers 3

    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v0, "key_tips_state"

    sget-object v1, LJ7/m$b;->q:LJ7/m$b;

    invoke-virtual {p0, v0, v1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final B0()V
    .registers 2

    invoke-direct {p0}, LJ7/i;->l0()LJ7/o;

    move-result-object v0

    iget-object p0, p0, LJ7/i;->b:LU5/a;

    invoke-interface {v0, p0}, LJ7/o;->a(LU5/a;)V

    return-void
.end method

.method public final C(I)V
    .registers 4

    invoke-direct {p0}, LJ7/i;->l0()LJ7/o;

    move-result-object v0

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    iget-object p0, p0, LJ7/i;->b:LU5/a;

    invoke-interface {v0, v1, p0, p1}, LJ7/o;->g(LF8/L;LU5/a;I)V

    return-void
.end method

.method public final C0()V
    .registers 8

    const/4 v0, 0x0

    iput-boolean v0, p0, LJ7/i;->S:Z

    iput-boolean v0, p0, LJ7/i;->R:Z

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    iget-object v2, p0, LJ7/i;->h:LF8/I;

    new-instance v4, LJ7/i$o;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, LJ7/i$o;-><init>(LJ7/i;Lm8/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final D(Z)V
    .registers 4

    invoke-direct {p0}, LJ7/i;->l0()LJ7/o;

    move-result-object v0

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    iget-object p0, p0, LJ7/i;->b:LU5/a;

    invoke-interface {v0, v1, p0, p1}, LJ7/o;->b(LF8/L;LU5/a;Z)V

    return-void
.end method

.method public final D0()V
    .registers 1

    iget-object p0, p0, LJ7/i;->b:LU5/a;

    invoke-interface {p0}, LU5/a;->b()V

    return-void
.end method

.method public final E()LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/i;->C:LI8/O;

    return-object p0
.end method

.method public final E0()V
    .registers 7

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    new-instance v3, LJ7/i$p;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, LJ7/i$p;-><init>(LJ7/i;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final F()LI8/E;
    .registers 1

    iget-object p0, p0, LJ7/i;->v:LI8/E;

    return-object p0
.end method

.method public final F0()V
    .registers 3

    invoke-direct {p0}, LJ7/i;->l0()LJ7/o;

    move-result-object v0

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    iget-object p0, p0, LJ7/i;->b:LU5/a;

    invoke-interface {v0, v1, p0}, LJ7/o;->c(LF8/L;LU5/a;)V

    return-void
.end method

.method public final G()LI8/f;
    .registers 1

    iget-object p0, p0, LJ7/i;->w:LI8/f;

    return-object p0
.end method

.method public final G0(LC7/a;Z)V
    .registers 11

    const-string v0, "shortcutInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LC7/a;->c()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "selectShortcut:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " replace:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LockScreenViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v2

    new-instance v5, LJ7/i$q;

    const/4 v0, 0x0

    invoke-direct {v5, p0, p1, p2, v0}, LJ7/i$q;-><init>(LJ7/i;LC7/a;ZLm8/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final H()Z
    .registers 1

    iget-object p0, p0, LJ7/i;->b:LU5/a;

    invoke-interface {p0}, LU5/a;->r()Z

    move-result p0

    return p0
.end method

.method public final I()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LJ7/i;->b:LU5/a;

    invoke-interface {p0}, LU5/a;->u()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public final J()LI8/E;
    .registers 1

    iget-object p0, p0, LJ7/i;->y:LI8/E;

    return-object p0
.end method

.method public final K()LI8/E;
    .registers 1

    iget-object p0, p0, LJ7/i;->A:LI8/E;

    return-object p0
.end method

.method public final L()LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/i;->n:LI8/O;

    return-object p0
.end method

.method public final M()LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/i;->o:LI8/O;

    return-object p0
.end method

.method public final M0(Ljava/lang/String;)V
    .registers 3

    const-string v0, "slot"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LJ7/i;->W:LI8/A;

    invoke-interface {p0, p1}, LI8/z;->h(Ljava/lang/Object;)Z

    return-void
.end method

.method public final N()LI8/E;
    .registers 1

    iget-object p0, p0, LJ7/i;->t:LI8/E;

    return-object p0
.end method

.method public final N0(Lz7/c;)V
    .registers 3

    const-string v0, "selectInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v0, "select_widget_key"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final O0(LA7/a;)V
    .registers 11

    const-string v0, "align"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setClockAlign: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LockScreenViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LJ7/i;->S:Z

    iget-boolean v0, p0, LJ7/i;->l:Z

    if-eqz v0, :cond_2a

    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v0, "select_clock_align"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_2a
    iget-object v0, p0, LJ7/i;->Q:LF8/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_33

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_33
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v3

    iget-object v4, p0, LJ7/i;->h:LF8/I;

    new-instance v6, LJ7/i$A;

    invoke-direct {v6, p0, p1, v1}, LJ7/i$A;-><init>(LJ7/i;LA7/a;Lm8/e;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p1

    iput-object p1, p0, LJ7/i;->Q:LF8/x0;

    return-void
.end method

.method public final P()LI8/f;
    .registers 1

    iget-object p0, p0, LJ7/i;->T:LI8/f;

    return-object p0
.end method

.method public final P0(Landroid/graphics/Rect;Z)V
    .registers 5

    const-string v0, "rect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setClockArea: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " force:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LockScreenViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p2, :cond_2f

    iget-object p2, p0, LJ7/i;->n:LI8/O;

    invoke-interface {p2}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_2e

    goto :goto_2f

    :cond_2e
    return-void

    :cond_2f
    :goto_2f
    iget-object p2, p0, LJ7/i;->n:LI8/O;

    invoke-interface {p2}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_3a

    invoke-direct {p0, p1}, LJ7/i;->U0(Landroid/graphics/Rect;)V

    :cond_3a
    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string p2, "clock_area"

    invoke-virtual {p0, p2, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final Q()Landroidx/lifecycle/C;
    .registers 1

    iget-object p0, p0, LJ7/i;->s:Landroidx/lifecycle/C;

    return-object p0
.end method

.method public final Q0(LN1/a;)V
    .registers 11

    const-string v0, "size"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setClockSize: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LockScreenViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LJ7/i;->S:Z

    iget-boolean v0, p0, LJ7/i;->l:Z

    if-eqz v0, :cond_2a

    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v0, "select_clock_size"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_2a
    iget-object v0, p0, LJ7/i;->Q:LF8/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_33

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_33
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v3

    iget-object v4, p0, LJ7/i;->h:LF8/I;

    new-instance v6, LJ7/i$B;

    invoke-direct {v6, p0, p1, v1}, LJ7/i$B;-><init>(LJ7/i;LN1/a;Lm8/e;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p1

    iput-object p1, p0, LJ7/i;->Q:LF8/x0;

    return-void
.end method

.method public final R()LI8/f;
    .registers 1

    iget-object p0, p0, LJ7/i;->b0:LI8/f;

    return-object p0
.end method

.method public final R0(ZZ)V
    .registers 4

    const-string v0, "depth_switch_state"

    if-eqz p2, :cond_18

    iget-object p2, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    invoke-virtual {p2, v0}, Landroidx/lifecycle/Q;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    if-nez p2, :cond_17

    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_17
    return-void

    :cond_18
    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final S()LI8/E;
    .registers 1

    iget-object p0, p0, LJ7/i;->U:LI8/E;

    return-object p0
.end method

.method public final T()LI8/f;
    .registers 1

    iget-object p0, p0, LJ7/i;->N:LI8/f;

    return-object p0
.end method

.method public final T0(LA7/g;)V
    .registers 11

    const-string v0, "dynamicFont"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setDynamicFont: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LockScreenViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, LJ7/i;->l:Z

    if-eqz v0, :cond_27

    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v0, "select_dynamic_font"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_27
    iget-object v0, p0, LJ7/i;->Q:LF8/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_30

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_30
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v3

    iget-object v4, p0, LJ7/i;->h:LF8/I;

    new-instance v6, LJ7/i$C;

    invoke-direct {v6, p0, p1, v1}, LJ7/i$C;-><init>(LJ7/i;LA7/g;Lm8/e;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p1

    iput-object p1, p0, LJ7/i;->Q:LF8/x0;

    return-void
.end method

.method public final U()LI8/f;
    .registers 1

    iget-object p0, p0, LJ7/i;->L:LI8/f;

    return-object p0
.end method

.method public final V()LI8/f;
    .registers 1

    iget-object p0, p0, LJ7/i;->M:LI8/f;

    return-object p0
.end method

.method public final V0(Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState;)V
    .registers 3

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, LJ7/i;->r:Landroidx/lifecycle/H;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/H;->n(Ljava/lang/Object;)V

    return-void
.end method

.method public final W()LI8/f;
    .registers 1

    iget-object p0, p0, LJ7/i;->O:LI8/f;

    return-object p0
.end method

.method public final W0(Ljava/lang/String;)V
    .registers 11

    const-string v0, "clockId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setClock: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LockScreenViewModel"

    invoke-static {v1, v0}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LJ7/i;->S:Z

    iget-boolean v1, p0, LJ7/i;->l:Z

    if-eqz v1, :cond_4e

    sget-object v0, LA7/e;->a:LA7/e;

    invoke-virtual {v0}, LA7/e;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO1/b;

    if-eqz v0, :cond_46

    iget-object v1, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v2, "select_clock_align"

    invoke-virtual {v0}, LO1/b;->d()LA7/a;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v2, "select_clock_size"

    invoke-virtual {v0}, LO1/b;->f()LN1/a;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_46
    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v0, "select_clock_id"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_4e
    iget-object v1, p0, LJ7/i;->Q:LF8/x0;

    const/4 v2, 0x0

    if-eqz v1, :cond_56

    invoke-static {v1, v2, v0, v2}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_56
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v3

    iget-object v4, p0, LJ7/i;->h:LF8/I;

    new-instance v6, LJ7/i$D;

    invoke-direct {v6, p0, p1, v2}, LJ7/i$D;-><init>(LJ7/i;Ljava/lang/String;Lm8/e;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p1

    iput-object p1, p0, LJ7/i;->Q:LF8/x0;

    return-void
.end method

.method public final X()LI8/f;
    .registers 1

    iget-object p0, p0, LJ7/i;->P:LI8/f;

    return-object p0
.end method

.method public final X0(Ljava/lang/String;)V
    .registers 11

    const-string v0, "clockId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LJ7/i;->l:Z

    if-eqz v0, :cond_11

    iget-object p0, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v0, "select_clock_id"

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_11
    iget-object v0, p0, LJ7/i;->Q:LF8/x0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1a

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LF8/x0$a;->a(LF8/x0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_1a
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v3

    iget-object v4, p0, LJ7/i;->h:LF8/I;

    new-instance v6, LJ7/i$E;

    invoke-direct {v6, p0, p1, v1}, LJ7/i$E;-><init>(LJ7/i;Ljava/lang/String;Lm8/e;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p1

    iput-object p1, p0, LJ7/i;->Q:LF8/x0;

    return-void
.end method

.method public final Y()[Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;
    .registers 1

    iget-object p0, p0, LJ7/i;->b:LU5/a;

    invoke-interface {p0}, LU5/a;->t()[Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    move-result-object p0

    return-object p0
.end method

.method public final Z()LI8/f;
    .registers 1

    iget-object p0, p0, LJ7/i;->a0:LI8/f;

    return-object p0
.end method

.method public final a0()Z
    .registers 1

    iget-object p0, p0, LJ7/i;->k:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public final b0()LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/i;->F:LI8/O;

    return-object p0
.end method

.method public final b1()V
    .registers 2

    iget-object v0, p0, LJ7/i;->n:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    invoke-direct {p0, v0}, LJ7/i;->U0(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final c0()LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/i;->D:LI8/O;

    return-object p0
.end method

.method public final c1()V
    .registers 3

    invoke-direct {p0}, LJ7/i;->l0()LJ7/o;

    move-result-object v0

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    iget-object p0, p0, LJ7/i;->b:LU5/a;

    invoke-interface {v0, v1, p0}, LJ7/o;->f(LF8/L;LU5/a;)V

    return-void
.end method

.method public final d0()LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/i;->E:LI8/O;

    return-object p0
.end method

.method public final e0()Ljava/util/List;
    .registers 1

    iget-object p0, p0, LJ7/i;->c0:Ljava/util/List;

    return-object p0
.end method

.method public final f0()LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/i;->q:LI8/O;

    return-object p0
.end method

.method public final g0()LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/i;->J:LI8/O;

    return-object p0
.end method

.method public final h0()LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/i;->H:LI8/O;

    return-object p0
.end method

.method public final i0()LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/i;->I:LI8/O;

    return-object p0
.end method

.method public final j0()LI8/O;
    .registers 1

    iget-object p0, p0, LJ7/i;->K:LI8/O;

    return-object p0
.end method

.method public final k0(ZLm8/e;)Ljava/lang/Object;
    .registers 6

    new-instance v0, LF8/n;

    invoke-static {p2}, Ln8/b;->c(Lm8/e;)Lm8/e;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, LF8/n;-><init>(Lm8/e;I)V

    invoke-virtual {v0}, LF8/n;->G()V

    invoke-static {p0}, LJ7/i;->m(LJ7/i;)Lh3/c;

    move-result-object v1

    invoke-static {p0}, LJ7/i;->k(LJ7/i;)Landroid/content/Context;

    move-result-object p0

    new-instance v2, LJ7/i$i;

    invoke-direct {v2, v0}, LJ7/i$i;-><init>(LF8/l;)V

    invoke-interface {v1, p0, p1, v2}, Lh3/c;->a(Landroid/content/Context;ZLh3/c$a;)V

    invoke-virtual {v0}, LF8/n;->A()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2a

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lm8/e;)V

    :cond_2a
    return-object p0
.end method

.method public final n0()Z
    .registers 1

    iget-boolean p0, p0, LJ7/i;->R:Z

    return p0
.end method

.method public final o0()Z
    .registers 13

    iget-object v0, p0, LJ7/i;->H:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, LJ7/i;->I:LI8/O;

    invoke-interface {v1}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LN1/a;

    iget-object v2, p0, LJ7/i;->J:LI8/O;

    invoke-interface {v2}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LA7/a;

    iget-object v3, p0, LJ7/i;->K:LI8/O;

    invoke-interface {v3}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LA7/g;

    const/4 v4, 0x0

    if-nez v0, :cond_2a

    if-nez v1, :cond_2a

    if-nez v2, :cond_2a

    if-nez v3, :cond_2a

    return v4

    :cond_2a
    iget-object v5, p0, LJ7/i;->D:LI8/O;

    invoke-interface {v5}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p0, LJ7/i;->F:LI8/O;

    invoke-interface {v6}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v6

    iget-object v7, p0, LJ7/i;->E:LI8/O;

    invoke-interface {v7}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v7

    iget-object v8, p0, LJ7/i;->G:LI8/O;

    invoke-interface {v8}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "isClockChanged user:"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "-"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, " system:"

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "LockScreenViewModel"

    invoke-static {v6, v5}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, p0, LJ7/i;->D:LI8/O;

    invoke-interface {v5}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_ac

    iget-object v0, p0, LJ7/i;->F:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_ac

    iget-object v0, p0, LJ7/i;->E:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_ac

    iget-object p0, p0, LJ7/i;->G:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    if-eq p0, v3, :cond_ab

    goto :goto_ac

    :cond_ab
    return v4

    :cond_ac
    :goto_ac
    const/4 p0, 0x1

    return p0
.end method

.method public final p0()Z
    .registers 1

    iget-boolean p0, p0, LJ7/i;->S:Z

    return p0
.end method

.method public final q0()Z
    .registers 10

    iget-object v0, p0, LJ7/i;->Z:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_c

    return v1

    :cond_c
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_13

    return v1

    :cond_13
    iget-object v2, p0, LJ7/i;->c0:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v4, "bottom_start"

    const/4 v5, 0x0

    if-eqz v3, :cond_36

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, LC7/b;

    invoke-virtual {v6}, LC7/b;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1b

    goto :goto_37

    :cond_36
    move-object v3, v5

    :goto_37
    check-cast v3, LC7/b;

    iget-object p0, p0, LJ7/i;->c0:Ljava/util/List;

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_41
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v6, "bottom_end"

    if-eqz v2, :cond_5b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, LC7/b;

    invoke-virtual {v7}, LC7/b;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_41

    goto :goto_5c

    :cond_5b
    move-object v2, v5

    :goto_5c
    check-cast v2, LC7/b;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_64
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LC7/b;

    invoke-virtual {v8}, LC7/b;->b()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_64

    goto :goto_7d

    :cond_7c
    move-object v7, v5

    :goto_7d
    check-cast v7, LC7/b;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_83
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LC7/b;

    invoke-virtual {v4}, LC7/b;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_83

    goto :goto_9c

    :cond_9b
    move-object v0, v5

    :goto_9c
    check-cast v0, LC7/b;

    if-eqz v3, :cond_a5

    invoke-virtual {v3}, LC7/b;->a()Ljava/lang/String;

    move-result-object p0

    goto :goto_a6

    :cond_a5
    move-object p0, v5

    :goto_a6
    if-eqz v7, :cond_ad

    invoke-virtual {v7}, LC7/b;->a()Ljava/lang/String;

    move-result-object v4

    goto :goto_ae

    :cond_ad
    move-object v4, v5

    :goto_ae
    invoke-static {p0, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    const-string v4, "none"

    const/4 v6, 0x1

    if-nez p0, :cond_db

    if-eqz v3, :cond_be

    invoke-virtual {v3}, LC7/b;->a()Ljava/lang/String;

    move-result-object p0

    goto :goto_bf

    :cond_be
    move-object p0, v5

    :goto_bf
    if-nez p0, :cond_d0

    if-eqz v7, :cond_c8

    invoke-virtual {v7}, LC7/b;->a()Ljava/lang/String;

    move-result-object p0

    goto :goto_c9

    :cond_c8
    move-object p0, v5

    :goto_c9
    invoke-static {p0, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_db

    return v6

    :cond_d0
    if-eqz v7, :cond_d7

    invoke-virtual {v7}, LC7/b;->a()Ljava/lang/String;

    move-result-object p0

    goto :goto_d8

    :cond_d7
    move-object p0, v5

    :goto_d8
    if-eqz p0, :cond_db

    return v6

    :cond_db
    if-eqz v2, :cond_e2

    invoke-virtual {v2}, LC7/b;->a()Ljava/lang/String;

    move-result-object p0

    goto :goto_e3

    :cond_e2
    move-object p0, v5

    :goto_e3
    if-eqz v0, :cond_ea

    invoke-virtual {v0}, LC7/b;->a()Ljava/lang/String;

    move-result-object v3

    goto :goto_eb

    :cond_ea
    move-object v3, v5

    :goto_eb
    invoke-static {p0, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_111

    if-eqz v2, :cond_f8

    invoke-virtual {v2}, LC7/b;->a()Ljava/lang/String;

    move-result-object p0

    goto :goto_f9

    :cond_f8
    move-object p0, v5

    :goto_f9
    if-nez p0, :cond_108

    if-eqz v0, :cond_101

    invoke-virtual {v0}, LC7/b;->a()Ljava/lang/String;

    move-result-object v5

    :cond_101
    invoke-static {v5, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_111

    return v6

    :cond_108
    if-eqz v0, :cond_10e

    invoke-virtual {v0}, LC7/b;->a()Ljava/lang/String;

    move-result-object v5

    :cond_10e
    if-eqz v5, :cond_111

    return v6

    :cond_111
    return v1
.end method

.method public final r0()Z
    .registers 2

    iget-object v0, p0, LJ7/i;->H:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_23

    iget-object v0, p0, LJ7/i;->I:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_23

    iget-object v0, p0, LJ7/i;->J:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_23

    iget-object p0, p0, LJ7/i;->K:LI8/O;

    invoke-interface {p0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_21

    goto :goto_23

    :cond_21
    const/4 p0, 0x0

    return p0

    :cond_23
    :goto_23
    const/4 p0, 0x1

    return p0
.end method

.method public final s0(LN1/a;LA7/f;)V
    .registers 10

    const-string v0, "size"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LA7/f;->q:LA7/f;

    if-eq p2, v0, :cond_14

    sget-object v0, LA7/f;->r:LA7/f;

    if-ne p2, v0, :cond_13

    goto :goto_14

    :cond_13
    return-void

    :cond_14
    :goto_14
    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v1

    new-instance v4, LJ7/i$j;

    const/4 p2, 0x0

    invoke-direct {v4, p0, p1, p2}, LJ7/i$j;-><init>(LJ7/i;LN1/a;Lm8/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final t0()V
    .registers 7

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    new-instance v3, LJ7/i$k;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, LJ7/i$k;-><init>(LJ7/i;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final u0(LA7/f;)V
    .registers 4

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LJ7/i;->R:Z

    sget-object v1, LA7/f;->q:LA7/f;

    if-ne p1, v1, :cond_e

    iput-boolean v0, p0, LJ7/i;->S:Z

    :cond_e
    return-void
.end method

.method public final v0()V
    .registers 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LJ7/i;->R:Z

    return-void
.end method

.method public final w0()V
    .registers 7

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v0

    new-instance v3, LJ7/i$l;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, LJ7/i$l;-><init>(LJ7/i;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final x0()V
    .registers 2

    iget-object p0, p0, LJ7/i;->r:Landroidx/lifecycle/H;

    sget-object v0, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Loading;->INSTANCE:Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$Loading;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/H;->n(Ljava/lang/Object;)V

    return-void
.end method

.method public final y0()V
    .registers 3

    const/4 v0, 0x0

    iput-boolean v0, p0, LJ7/i;->S:Z

    iput-boolean v0, p0, LJ7/i;->R:Z

    iget-object v0, p0, LJ7/i;->r:Landroidx/lifecycle/H;

    sget-object v1, Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$None;->INSTANCE:Lcom/nothing/wallpaper/picker/edit/preview/bean/LoadingState$None;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/H;->n(Ljava/lang/Object;)V

    iget-object p0, p0, LJ7/i;->b:LU5/a;

    const/4 v0, 0x1

    invoke-interface {p0, v0}, LU5/a;->l(Z)V

    return-void
.end method

.method public final z0()V
    .registers 12

    iget-object v0, p0, LJ7/i;->H:LI8/O;

    invoke-interface {v0}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x1

    if-eqz v0, :cond_17

    iget-object v2, p0, LJ7/i;->D:LI8/O;

    invoke-interface {v2}, LI8/O;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    goto :goto_18

    :cond_17
    const/4 v0, 0x0

    :goto_18
    iput-boolean v0, p0, LJ7/i;->S:Z

    iget-object v2, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v3, "select_clock_size"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v3, "select_clock_align"

    invoke-virtual {v2, v3, v4}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v3, "select_clock_id"

    invoke-virtual {v2, v3, v4}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, p0, LJ7/i;->e:Landroidx/lifecycle/Q;

    const-string v3, "select_dynamic_font"

    invoke-virtual {v2, v3, v4}, Landroidx/lifecycle/Q;->i(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v0, :cond_49

    invoke-static {p0}, Landroidx/lifecycle/b0;->a(Landroidx/lifecycle/a0;)LF8/L;

    move-result-object v5

    new-instance v8, LJ7/i$m;

    invoke-direct {v8, p0, v4}, LJ7/i$m;-><init>(LJ7/i;Lm8/e;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    :cond_49
    invoke-direct {p0}, LJ7/i;->O()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_52

    invoke-virtual {p0, v0, v1}, LJ7/i;->P0(Landroid/graphics/Rect;Z)V

    :cond_52
    return-void
.end method
