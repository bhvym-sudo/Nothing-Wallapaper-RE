.class public final LG7/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG7/d$a;
    }
.end annotation


# static fields
.field public static final a:LG7/d;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LG7/d;

    invoke-direct {v0}, LG7/d;-><init>()V

    sput-object v0, LG7/d;->a:LG7/d;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LS1/a;Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V
    .registers 3

    invoke-static {p0, p1, p2}, LG7/d;->g(LS1/a;Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V

    return-void
.end method

.method public static synthetic b(ZLJ7/i;LO1/b;)Lh8/A;
    .registers 3

    invoke-static {p0, p1, p2}, LG7/d;->i(ZLJ7/i;LO1/b;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZLJ7/i;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LG7/d;->j(ZLJ7/i;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(LG7/d;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;ZLO1/b;)V
    .registers 6

    invoke-direct/range {p0 .. p5}, LG7/d;->h(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;ZLO1/b;)V

    return-void
.end method

.method public static final synthetic e(LG7/d;LF8/L;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;)LF8/x0;
    .registers 5

    invoke-direct {p0, p1, p2, p3, p4}, LG7/d;->k(LF8/L;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;)LF8/x0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;Landroidx/lifecycle/x;)V
    .registers 14

    const-string v0, "hostView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lockViewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockViewFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, LS1/a;->c()V

    invoke-static {}, Li6/e;->j()Z

    move-result v3

    invoke-static {p3}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v0

    new-instance v1, LG7/d$b;

    const/4 v7, 0x0

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move-object v2, p3

    invoke-direct/range {v1 .. v7}, LG7/d$b;-><init>(Landroidx/lifecycle/x;ZLcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;Lm8/e;)V

    move-object p0, v6

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, v0

    move-object v7, v1

    invoke-static/range {v4 .. v9}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-interface {v2}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    move-result-object p1

    new-instance p2, LG7/a;

    invoke-direct {p2, p0}, LG7/a;-><init>(LS1/a;)V

    invoke-virtual {p1, p2}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    return-void
.end method

.method private static final g(LS1/a;Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V
    .registers 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LG7/d$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_24

    const/4 v0, 0x2

    if-eq p2, v0, :cond_20

    const/4 p1, 0x3

    if-eq p2, p1, :cond_1c

    return-void

    :cond_1c
    invoke-interface {p0}, LS1/a;->onDestroy()V

    return-void

    :cond_20
    invoke-interface {p0, p1}, LS1/a;->i(Landroidx/lifecycle/x;)V

    return-void

    :cond_24
    invoke-interface {p0, p1}, LS1/a;->e(Landroidx/lifecycle/x;)V

    return-void
.end method

.method private final h(Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;ZLO1/b;)V
    .registers 7

    move-object p0, p1

    move p1, p4

    new-instance p4, LG7/b;

    invoke-direct {p4, p1, p2}, LG7/b;-><init>(ZLJ7/i;)V

    move-object v0, p2

    move-object p2, p5

    new-instance p5, LG7/c;

    invoke-direct {p5, p1, v0}, LG7/c;-><init>(ZLJ7/i;)V

    invoke-interface/range {p0 .. p5}, Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;->a(ZLO1/b;LS1/a;Lv8/l;Lv8/a;)V

    return-void
.end method

.method private static final i(ZLJ7/i;LO1/b;)Lh8/A;
    .registers 4

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_a

    invoke-virtual {p1}, LJ7/i;->v0()V

    :cond_a
    invoke-virtual {p2}, LO1/b;->f()LN1/a;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    sget-object p2, LA7/f;->q:LA7/f;

    invoke-virtual {p1, p0, p2}, LJ7/i;->s0(LN1/a;LA7/f;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final j(ZLJ7/i;)Lh8/A;
    .registers 2

    if-eqz p0, :cond_7

    sget-object p0, LA7/f;->q:LA7/f;

    invoke-virtual {p1, p0}, LJ7/i;->u0(LA7/f;)V

    :cond_7
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private final k(LF8/L;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LJ7/i;LS1/a;)LF8/x0;
    .registers 21

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    new-instance v6, LG7/d$c;

    const/4 v9, 0x0

    invoke-direct {v6, v1, v0, v2, v9}, LG7/d$c;-><init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LS1/a;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v3, p1

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    new-instance v13, LG7/d$d;

    invoke-direct {v13, v1, v0, v2, v9}, LG7/d$d;-><init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;LS1/a;Lm8/e;)V

    const/4 v14, 0x3

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v10, p1

    invoke-static/range {v10 .. v15}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    new-instance v13, LG7/d$e;

    invoke-direct {v13, v1, v0, v9}, LG7/d$e;-><init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;Lm8/e;)V

    invoke-static/range {v10 .. v15}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    new-instance v13, LG7/d$f;

    invoke-direct {v13, v1, v0, v9}, LG7/d$f;-><init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/view/E;Lm8/e;)V

    invoke-static/range {v10 .. v15}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object v0

    return-object v0
.end method
