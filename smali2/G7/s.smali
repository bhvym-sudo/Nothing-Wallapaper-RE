.class public final LG7/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG7/s$a;,
        LG7/s$b;
    }
.end annotation


# static fields
.field public static final a:LG7/s;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LG7/s;

    invoke-direct {v0}, LG7/s;-><init>()V

    sput-object v0, LG7/s;->a:LG7/s;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LK6/c;Lb/j;)Landroidx/lifecycle/d0$c;
    .registers 2

    invoke-static {p0, p1}, LG7/s;->e(LK6/c;Lb/j;)Landroidx/lifecycle/d0$c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LS1/a;LH7/d;Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V
    .registers 4

    invoke-static {p0, p1, p2, p3}, LG7/s;->g(LS1/a;LH7/d;Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V

    return-void
.end method

.method public static final synthetic c(Lh8/h;)LT1/b;
    .registers 1

    invoke-static {p0}, LG7/s;->f(Lh8/h;)LT1/b;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lb/j;Landroidx/lifecycle/x;Landroid/view/ViewGroup;)LG7/s$a;
    .registers 17

    move-object/from16 v0, p2

    const-string v1, "activity"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "lifecycleOwner"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "previewContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.nothing.wallpaper.module.NTPickerInjector"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, LK6/c;

    new-instance v2, Landroidx/lifecycle/d0;

    invoke-virtual {v1, p0}, LK6/c;->K0(Lb/j;)LJ7/i$c;

    move-result-object v4

    invoke-direct {v2, p0, v4}, Landroidx/lifecycle/d0;-><init>(Landroidx/lifecycle/f0;Landroidx/lifecycle/d0$c;)V

    const-class v4, LJ7/i;

    invoke-virtual {v2, v4}, Landroidx/lifecycle/d0;->b(Ljava/lang/Class;)Landroidx/lifecycle/a0;

    move-result-object v2

    move-object v4, v2

    check-cast v4, LJ7/i;

    new-instance v2, LG7/q;

    invoke-direct {v2, v1, p0}, LG7/q;-><init>(LK6/c;Lb/j;)V

    new-instance v6, Landroidx/lifecycle/c0;

    const-class v5, LT1/b;

    invoke-static {v5}, Lkotlin/jvm/internal/F;->b(Ljava/lang/Class;)LC8/c;

    move-result-object v5

    new-instance v7, LG7/s$c;

    invoke-direct {v7, p0}, LG7/s$c;-><init>(Lb/j;)V

    new-instance v8, LG7/s$d;

    const/4 v9, 0x0

    invoke-direct {v8, v9, p0}, LG7/s$d;-><init>(Lv8/a;Lb/j;)V

    invoke-direct {v6, v5, v7, v2, v8}, Landroidx/lifecycle/c0;-><init>(LC8/c;Lv8/a;Lv8/a;Lv8/a;)V

    invoke-virtual {v1, p0}, LK6/c;->d0(Lb/j;)LS1/a;

    move-result-object v7

    new-instance v5, LH7/d;

    invoke-direct {v5, p0, v0}, LH7/d;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;)V

    invoke-static {p1}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object p0

    new-instance v2, LG7/s$f;

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v2 .. v8}, LG7/s$f;-><init>(Landroidx/lifecycle/x;LJ7/i;LH7/d;Lh8/h;LS1/a;Lm8/e;)V

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v10, 0x0

    move-object v8, p0

    move-object v11, v2

    invoke-static/range {v8 .. v13}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    move-result-object p0

    invoke-interface {p1}, Landroidx/lifecycle/x;->getLifecycle()Landroidx/lifecycle/q;

    move-result-object v0

    new-instance v1, LG7/r;

    invoke-direct {v1, v7, v5}, LG7/r;-><init>(LS1/a;LH7/d;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/q;->a(Landroidx/lifecycle/w;)V

    new-instance v0, LG7/s$e;

    invoke-direct {v0, p0, v5}, LG7/s$e;-><init>(LF8/x0;LH7/d;)V

    return-object v0
.end method

.method private static final e(LK6/c;Lb/j;)Landroidx/lifecycle/d0$c;
    .registers 2

    invoke-virtual {p0, p1}, LK6/c;->I0(Lb/j;)LT1/b$b;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lh8/h;)LT1/b;
    .registers 1

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LT1/b;

    return-object p0
.end method

.method private static final g(LS1/a;LH7/d;Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V
    .registers 5

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LG7/s$b;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_27

    const/4 v0, 0x2

    if-eq p3, v0, :cond_23

    const/4 p2, 0x3

    if-eq p3, p2, :cond_1c

    return-void

    :cond_1c
    invoke-virtual {p1}, LH7/d;->destroy()V

    invoke-interface {p0}, LS1/a;->onDestroy()V

    return-void

    :cond_23
    invoke-interface {p0, p2}, LS1/a;->i(Landroidx/lifecycle/x;)V

    return-void

    :cond_27
    invoke-interface {p0, p2}, LS1/a;->e(Landroidx/lifecycle/x;)V

    return-void
.end method
