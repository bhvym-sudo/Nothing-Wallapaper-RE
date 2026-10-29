.class public final LU5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU5/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU5/e$b;
    }
.end annotation


# static fields
.field public static final u:LU5/e$b;

.field static final synthetic v:[LC8/k;

.field private static final w:Ljava/util/List;

.field private static final x:LO0/f$a;

.field private static final y:LO0/f$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LF8/L;

.field private final c:LF8/I;

.field private final d:Ly8/a;

.field private final e:Lcom/google/gson/Gson;

.field private final f:LF5/l;

.field private g:Ljava/lang/String;

.field private final h:LI8/z;

.field private final i:LI8/f;

.field private final j:LI8/z;

.field private k:Z

.field private final l:LF8/v;

.field private final m:LI8/f;

.field private final n:LI8/f;

.field private final o:LI8/f;

.field private final p:LI8/f;

.field private final q:LI8/A;

.field private final r:LI8/f;

.field private final s:LI8/f;

.field private final t:LU5/e$B;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    new-instance v0, Lkotlin/jvm/internal/y;

    const-string v1, "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    const/4 v2, 0x0

    const-class v3, LU5/e;

    const-string v4, "dataStore"

    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/y;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/F;->g(Lkotlin/jvm/internal/x;)LC8/j;

    move-result-object v0

    filled-new-array {v0}, [LC8/k;

    move-result-object v0

    sput-object v0, LU5/e;->v:[LC8/k;

    new-instance v0, LU5/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU5/e$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LU5/e;->u:LU5/e$b;

    const-string v0, "com.nothing.hearthstone.authority.APP_CARD.ql_card"

    const-string v1, "com.nothing.weather.widget.rectangle"

    const-string v2, "com.nothing.hearthstone.authority.APP_CARD.ql_transparent"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Li8/s;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LU5/e;->w:Ljava/util/List;

    const-string v0, "widget_settings_tips"

    invoke-static {v0}, LO0/i;->a(Ljava/lang/String;)LO0/f$a;

    move-result-object v0

    sput-object v0, LU5/e;->x:LO0/f$a;

    const-string v0, "clock_settings_tips"

    invoke-static {v0}, LO0/i;->a(Ljava/lang/String;)LO0/f$a;

    move-result-object v0

    sput-object v0, LU5/e;->y:LO0/f$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LF8/L;LF8/I;)V
    .registers 13

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU5/e;->a:Landroid/content/Context;

    iput-object p2, p0, LU5/e;->b:LF8/L;

    iput-object p3, p0, LU5/e;->c:LF8/I;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const-string v1, "widget_preferences"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LN0/a;->b(Ljava/lang/String;LM0/b;Lv8/l;LF8/L;ILjava/lang/Object;)Ly8/a;

    move-result-object v0

    iput-object v0, p0, LU5/e;->d:Ly8/a;

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, LU5/e;->e:Lcom/google/gson/Gson;

    sget-object v0, LF5/l;->g:LF5/l$a;

    invoke-virtual {v0, p1}, LF5/l$a;->a(Landroid/content/Context;)LF5/l;

    move-result-object v0

    iput-object v0, p0, LU5/e;->f:LF5/l;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v1, v2, v3, v2}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object v4

    iput-object v4, p0, LU5/e;->h:LI8/z;

    iput-object v4, p0, LU5/e;->i:LI8/f;

    invoke-static {v0, v1, v2, v3, v2}, LI8/G;->b(IILH8/a;ILjava/lang/Object;)LI8/z;

    move-result-object v1

    iput-object v1, p0, LU5/e;->j:LI8/z;

    iput-boolean v0, p0, LU5/e;->k:Z

    invoke-static {v2, v0, v2}, LF8/x;->b(LF8/x0;ILjava/lang/Object;)LF8/v;

    move-result-object v0

    iput-object v0, p0, LU5/e;->l:LF8/v;

    new-instance v6, LU5/e$a;

    invoke-direct {v6, p0, v2}, LU5/e$a;-><init>(LU5/e;Lm8/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p2

    invoke-static/range {v3 .. v8}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    invoke-direct {p0, p1}, LU5/e;->S(Landroid/content/Context;)LL0/i;

    move-result-object p2

    invoke-interface {p2}, LL0/i;->getData()LI8/f;

    move-result-object p2

    new-instance v0, LU5/e$s;

    invoke-direct {v0, v2}, LU5/e$s;-><init>(Lm8/e;)V

    invoke-static {p2, v0}, LI8/h;->f(LI8/f;Lv8/q;)LI8/f;

    move-result-object p2

    new-instance v0, LU5/e$v;

    invoke-direct {v0, p2}, LU5/e$v;-><init>(LI8/f;)V

    iput-object v0, p0, LU5/e;->m:LI8/f;

    invoke-direct {p0, p1}, LU5/e;->S(Landroid/content/Context;)LL0/i;

    move-result-object p1

    invoke-interface {p1}, LL0/i;->getData()LI8/f;

    move-result-object p1

    new-instance p2, LU5/e$f;

    invoke-direct {p2, v2}, LU5/e$f;-><init>(Lm8/e;)V

    invoke-static {p1, p2}, LI8/h;->f(LI8/f;Lv8/q;)LI8/f;

    move-result-object p1

    new-instance p2, LU5/e$w;

    invoke-direct {p2, p1}, LU5/e$w;-><init>(LI8/f;)V

    iput-object p2, p0, LU5/e;->n:LI8/f;

    new-instance p1, LU5/e$e;

    invoke-direct {p1, p0, v2}, LU5/e$e;-><init>(LU5/e;Lm8/e;)V

    invoke-static {p1}, LI8/h;->e(Lv8/p;)LI8/f;

    move-result-object p1

    invoke-static {p1, p3}, LI8/h;->D(LI8/f;Lm8/i;)LI8/f;

    move-result-object p1

    iput-object p1, p0, LU5/e;->o:LI8/f;

    new-instance p1, LU5/e$j;

    invoke-direct {p1, p0, v2}, LU5/e$j;-><init>(LU5/e;Lm8/e;)V

    invoke-static {p1}, LI8/h;->e(Lv8/p;)LI8/f;

    move-result-object p1

    invoke-static {p1, p3}, LI8/h;->D(LI8/f;Lm8/i;)LI8/f;

    move-result-object p1

    iput-object p1, p0, LU5/e;->p:LI8/f;

    invoke-static {v2}, LI8/Q;->a(Ljava/lang/Object;)LI8/A;

    move-result-object p2

    iput-object p2, p0, LU5/e;->q:LI8/A;

    new-instance v0, LU5/e$i;

    invoke-direct {v0, v2}, LU5/e$i;-><init>(Lm8/e;)V

    invoke-static {p1, p2, v0}, LI8/h;->l(LI8/f;LI8/f;Lv8/q;)LI8/f;

    move-result-object p1

    iput-object p1, p0, LU5/e;->r:LI8/f;

    new-instance p1, LU5/e$C;

    invoke-direct {p1, p0, v2}, LU5/e$C;-><init>(LU5/e;Lm8/e;)V

    invoke-static {p1}, LI8/h;->e(Lv8/p;)LI8/f;

    move-result-object p1

    invoke-static {p1, p3}, LI8/h;->D(LI8/f;Lm8/i;)LI8/f;

    move-result-object p1

    iput-object p1, p0, LU5/e;->s:LI8/f;

    new-instance p1, LU5/e$B;

    invoke-direct {p1, p0}, LU5/e$B;-><init>(LU5/e;)V

    iput-object p1, p0, LU5/e;->t:LU5/e$B;

    return-void
.end method

.method public static synthetic A(LU5/e;LF5/m;)Lcom/nothing/launcher/card/j;
    .registers 2

    invoke-static {p0, p1}, LU5/e;->W(LU5/e;LF5/m;)Lcom/nothing/launcher/card/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/nothing/launcher/card/j;)Ljava/lang/Iterable;
    .registers 1

    invoke-static {p0}, LU5/e;->X(Lcom/nothing/launcher/card/j;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(LU5/e;ILF5/m;)Z
    .registers 3

    invoke-static {p0, p1, p2}, LU5/e;->V(LU5/e;ILF5/m;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic D()LO0/f$a;
    .registers 1

    sget-object v0, LU5/e;->y:LO0/f$a;

    return-object v0
.end method

.method public static final synthetic E(LU5/e;)Z
    .registers 1

    iget-boolean p0, p0, LU5/e;->k:Z

    return p0
.end method

.method public static final synthetic F(LU5/e;)Landroid/content/Context;
    .registers 1

    iget-object p0, p0, LU5/e;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic G(LU5/e;)LF8/v;
    .registers 1

    iget-object p0, p0, LU5/e;->l:LF8/v;

    return-object p0
.end method

.method public static final synthetic H(LU5/e;)Lcom/google/gson/Gson;
    .registers 1

    iget-object p0, p0, LU5/e;->e:Lcom/google/gson/Gson;

    return-object p0
.end method

.method public static final synthetic I(LU5/e;)Ljava/lang/String;
    .registers 1

    iget-object p0, p0, LU5/e;->g:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic J()LO0/f$a;
    .registers 1

    sget-object v0, LU5/e;->x:LO0/f$a;

    return-object v0
.end method

.method public static final synthetic K(LU5/e;)LI8/f;
    .registers 1

    iget-object p0, p0, LU5/e;->s:LI8/f;

    return-object p0
.end method

.method public static final synthetic L(LU5/e;)Ljava/util/List;
    .registers 1

    invoke-direct {p0}, LU5/e;->U()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic M(LU5/e;)LI8/z;
    .registers 1

    iget-object p0, p0, LU5/e;->h:LI8/z;

    return-object p0
.end method

.method public static final synthetic N(LU5/e;[Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;)Ljava/util/List;
    .registers 2

    invoke-direct {p0, p1}, LU5/e;->Y([Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic O(LU5/e;Ljava/lang/String;)Ljava/util/List;
    .registers 2

    invoke-direct {p0, p1}, LU5/e;->Z(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic P(LU5/e;Ljava/util/List;)V
    .registers 2

    invoke-direct {p0, p1}, LU5/e;->b0(Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic Q(LU5/e;Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, LU5/e;->g:Ljava/lang/String;

    return-void
.end method

.method private final S(Landroid/content/Context;)LL0/i;
    .registers 4

    iget-object p0, p0, LU5/e;->d:Ly8/a;

    sget-object v0, LU5/e;->v:[LC8/k;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {p0, p1, v0}, Ly8/a;->a(Ljava/lang/Object;LC8/k;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LL0/i;

    return-object p0
.end method

.method private final U()Ljava/util/List;
    .registers 8

    invoke-direct {p0}, LU5/e;->a0()I

    move-result v0

    iget-object v1, p0, LU5/e;->f:LF5/l;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, LF5/l;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Li8/s;->K(Ljava/lang/Iterable;)LD8/h;

    move-result-object v1

    new-instance v2, LU5/b;

    invoke-direct {v2, p0, v0}, LU5/b;-><init>(LU5/e;I)V

    invoke-static {v1, v2}, LD8/k;->o(LD8/h;Lv8/l;)LD8/h;

    move-result-object v0

    new-instance v1, LU5/c;

    invoke-direct {v1, p0}, LU5/c;-><init>(LU5/e;)V

    invoke-static {v0, v1}, LD8/k;->x(LD8/h;Lv8/l;)LD8/h;

    move-result-object v0

    new-instance v1, LU5/d;

    invoke-direct {v1}, LU5/d;-><init>()V

    invoke-static {v0, v1}, LD8/k;->t(LD8/h;Lv8/l;)LD8/h;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, LD8/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_61

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh8/o;

    invoke-virtual {v2}, Lh8/o;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF2/r;

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_55

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_55
    check-cast v4, Ljava/util/List;

    invoke-virtual {v2}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nothing/launcher/card/j;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_35

    :cond_61
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_72
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_ab

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    new-instance v3, LS5/a;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF2/r;

    invoke-virtual {v4}, LF2/r;->a()I

    move-result v4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LF2/r;

    invoke-virtual {v5}, LF2/r;->c()I

    move-result v5

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LF2/r;

    invoke-virtual {v6}, LF2/r;->b()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-direct {v3, v4, v5, v6, v2}, LS5/a;-><init>(IILjava/lang/String;Ljava/util/List;)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_72

    :cond_ab
    iget-object p0, p0, LU5/e;->t:LU5/e$B;

    invoke-static {v0, p0}, Li8/s;->m0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final V(LU5/e;ILF5/m;)Z
    .registers 4

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, LU5/e;->c0(LF5/m;I)Z

    move-result p0

    return p0
.end method

.method private static final W(LU5/e;LF5/m;)Lcom/nothing/launcher/card/j;
    .registers 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/nothing/launcher/card/j;->Z:Lcom/nothing/launcher/card/j$a;

    iget-object p0, p0, LU5/e;->a:Landroid/content/Context;

    invoke-virtual {v0, p0, p1}, Lcom/nothing/launcher/card/j$a;->a(Landroid/content/Context;LF5/m;)Lcom/nothing/launcher/card/j;

    move-result-object p0

    return-object p0
.end method

.method private static final X(Lcom/nothing/launcher/card/j;)Ljava/lang/Iterable;
    .registers 6

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LF5/m;->H()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.nothing.hearthstone"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_39

    invoke-virtual {p0}, LF5/m;->q()I

    move-result v0

    if-nez v0, :cond_39

    new-instance v0, LF2/r;

    invoke-virtual {p0}, LF5/m;->H()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/nothing/launcher/card/j;->D0()Landroid/os/UserHandle;

    move-result-object v2

    invoke-virtual {p0}, LF5/m;->q()I

    move-result v3

    invoke-virtual {p0}, LF5/m;->f()I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, LF2/r;-><init>(Ljava/lang/String;Landroid/os/UserHandle;II)V

    invoke-static {v0, p0}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p0

    filled-new-array {p0}, [Lh8/o;

    move-result-object p0

    invoke-static {p0}, Li8/s;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_5a

    :cond_39
    new-instance v0, LF2/r;

    invoke-virtual {p0}, LF5/m;->H()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/nothing/launcher/card/j;->D0()Landroid/os/UserHandle;

    move-result-object v2

    invoke-virtual {p0}, LF5/m;->q()I

    move-result v3

    invoke-virtual {p0}, LF5/m;->r()I

    move-result v4

    invoke-direct {v0, v1, v2, v3, v4}, LF2/r;-><init>(Ljava/lang/String;Landroid/os/UserHandle;II)V

    invoke-static {v0, p0}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object p0

    filled-new-array {p0}, [Lh8/o;

    move-result-object p0

    invoke-static {p0}, Li8/s;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    :goto_5a
    check-cast p0, Ljava/lang/Iterable;

    return-object p0
.end method

.method private final Y([Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;)Ljava/util/List;
    .registers 11

    if-nez p1, :cond_8

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_10
    if-ge v3, v1, :cond_75

    aget-object v4, p1, v3

    sget-object v5, LF5/l;->g:LF5/l$a;

    iget-object v6, p0, LU5/e;->a:Landroid/content/Context;

    invoke-virtual {v5, v6}, LF5/l$a;->a(Landroid/content/Context;)LF5/l;

    move-result-object v5

    invoke-virtual {v4}, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->getId()I

    move-result v6

    invoke-virtual {v5, v6}, LF5/l;->l(I)LF5/m;

    move-result-object v5

    if-eqz v5, :cond_6c

    sget-object v6, Lcom/nothing/launcher/card/j;->Z:Lcom/nothing/launcher/card/j$a;

    iget-object v7, p0, LU5/e;->a:Landroid/content/Context;

    invoke-virtual {v6, v7, v5}, Lcom/nothing/launcher/card/j$a;->a(Landroid/content/Context;LF5/m;)Lcom/nothing/launcher/card/j;

    move-result-object v5

    new-instance v6, Lcom/nothing/launcher/card/t;

    invoke-virtual {v4}, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->getId()I

    move-result v7

    invoke-virtual {v5}, Lcom/nothing/launcher/card/j;->v0()Landroid/content/ComponentName;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Lcom/nothing/launcher/card/t;-><init>(ILandroid/content/ComponentName;)V

    invoke-virtual {v4}, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->getId()I

    move-result v7

    iput v7, v6, LC2/b;->q:I

    invoke-virtual {v4}, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->getSpanX()I

    move-result v7

    iput v7, v6, LC2/b;->u:I

    invoke-virtual {v4}, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->getSpanY()I

    move-result v7

    iput v7, v6, LC2/b;->v:I

    invoke-virtual {v4}, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->getCellX()I

    move-result v7

    iput v7, v6, LC2/b;->s:I

    invoke-virtual {v4}, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->getCellY()I

    move-result v4

    iput v4, v6, LC2/b;->t:I

    iput v2, v6, LC2/b;->r:I

    invoke-virtual {v5}, Lcom/nothing/launcher/card/j;->z0()I

    move-result v4

    iput v4, v6, LC2/b;->w:I

    invoke-virtual {v5}, Lcom/nothing/launcher/card/j;->A0()I

    move-result v4

    iput v4, v6, LC2/b;->x:I

    invoke-static {v5, v6}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v4

    goto :goto_6d

    :cond_6c
    const/4 v4, 0x0

    :goto_6d
    if-eqz v4, :cond_72

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_72
    add-int/lit8 v3, v3, 0x1

    goto :goto_10

    :cond_75
    invoke-static {v0}, Li8/s;->u0(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final Z(Ljava/lang/String;)Ljava/util/List;
    .registers 4

    if-eqz p1, :cond_33

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_9

    goto :goto_33

    :cond_9
    :try_start_9
    sget-object v0, Lh8/q;->r:Lh8/q$a;

    iget-object v0, p0, LU5/e;->e:Lcom/google/gson/Gson;

    const-class v1, [Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_19
    .catchall {:try_start_9 .. :try_end_19} :catchall_1a

    goto :goto_25

    :catchall_1a
    move-exception p1

    sget-object v0, Lh8/q;->r:Lh8/q$a;

    invoke-static {p1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_25
    invoke-static {p1}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2c

    const/4 p1, 0x0

    :cond_2c
    check-cast p1, [Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    invoke-direct {p0, p1}, LU5/e;->Y([Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_33
    :goto_33
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method private final a0()I
    .registers 5

    const/4 v0, 0x0

    :try_start_1
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    iget-object p0, p0, LU5/e;->a:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v1, "com.nothing.cardservice.host.api_level"

    invoke-virtual {p0, v1}, Landroid/content/pm/PackageManager;->queryApplicationProperty(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    const-string v1, "queryApplicationProperty(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_36

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/content/pm/PackageManager$Property;

    invoke-virtual {v2}, Landroid/content/pm/PackageManager$Property;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "com.android.systemui"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1a

    goto :goto_37

    :catchall_34
    move-exception p0

    goto :goto_4a

    :cond_36
    const/4 v1, 0x0

    :goto_37
    check-cast v1, Landroid/content/pm/PackageManager$Property;

    if-eqz v1, :cond_40

    invoke-virtual {v1}, Landroid/content/pm/PackageManager$Property;->getInteger()I

    move-result p0

    goto :goto_41

    :cond_40
    move p0, v0

    :goto_41
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_49
    .catchall {:try_start_1 .. :try_end_49} :catchall_34

    goto :goto_54

    :goto_4a
    sget-object v1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_54
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5f

    move-object p0, v0

    :cond_5f
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private final b0(Ljava/util/List;)V
    .registers 12

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_11
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_36

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/launcher/card/t;

    new-instance v2, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    invoke-virtual {v1}, Lcom/nothing/launcher/card/t;->m()I

    move-result v3

    iget v4, v1, LC2/b;->s:I

    iget v5, v1, LC2/b;->t:I

    iget v6, v1, LC2/b;->u:I

    iget v7, v1, LC2/b;->v:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-direct/range {v2 .. v9}, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;-><init>(IIIIIJ)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_36
    iget-object p1, p0, LU5/e;->e:Lcom/google/gson/Gson;

    invoke-virtual {p1, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LU5/e;->g:Ljava/lang/String;

    iget-object p1, p0, LU5/e;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const-string v0, "systemui_widget_infos"

    iget-object p0, p0, LU5/e;->g:Ljava/lang/String;

    invoke-static {p1, v0, p0}, Landroid/provider/Settings$Secure;->putString(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;)Z

    return-void
.end method

.method private final c0(LF5/m;I)Z
    .registers 3

    invoke-virtual {p1}, LF5/m;->x()I

    move-result p0

    if-gt p0, p2, :cond_1b

    sget-object p0, LU5/e;->w:Ljava/util/List;

    invoke-virtual {p1}, LF5/m;->b()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1b

    invoke-virtual {p1}, LF5/m;->j()I

    move-result p0

    const/4 p1, 0x3

    if-lt p0, p1, :cond_1b

    const/4 p0, 0x1

    return p0

    :cond_1b
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public R(Lm8/e;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, LU5/e;->l:LF8/v;

    invoke-interface {p0, p1}, LF8/T;->P0(Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_d

    return-object p0

    :cond_d
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public T()LI8/z;
    .registers 1

    iget-object p0, p0, LU5/e;->j:LI8/z;

    return-object p0
.end method

.method public a(Z)V
    .registers 8

    iget-object v0, p0, LU5/e;->b:LF8/L;

    iget-object v1, p0, LU5/e;->c:LF8/I;

    new-instance v3, LU5/e$k;

    const/4 v2, 0x0

    invoke-direct {v3, p0, p1, v2}, LU5/e$k;-><init>(LU5/e;ZLm8/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public b()V
    .registers 7

    iget-object v0, p0, LU5/e;->b:LF8/L;

    iget-object v1, p0, LU5/e;->c:LF8/I;

    new-instance v3, LU5/e$p;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, LU5/e$p;-><init>(LU5/e;Lm8/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public c()LI8/f;
    .registers 1

    iget-object p0, p0, LU5/e;->m:LI8/f;

    return-object p0
.end method

.method public d(Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p1, LU5/e$A;

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, LU5/e$A;

    iget v1, v0, LU5/e$A;->s:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LU5/e$A;->s:I

    goto :goto_18

    :cond_13
    new-instance v0, LU5/e$A;

    invoke-direct {v0, p0, p1}, LU5/e$A;-><init>(LU5/e;Lm8/e;)V

    :goto_18
    iget-object p1, v0, LU5/e$A;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LU5/e$A;->s:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_32

    if-ne v2, v4, :cond_2a

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_43

    :cond_2a
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_32
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    invoke-virtual {p0, v3}, LU5/e;->l(Z)V

    iget-object p0, p0, LU5/e;->h:LI8/z;

    iput v4, v0, LU5/e$A;->s:I

    invoke-static {p0, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_43

    return-object v1

    :cond_43
    :goto_43
    check-cast p1, Ljava/util/List;

    move-object p0, p1

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_51
    :goto_51
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lh8/o;

    invoke-virtual {v4}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/nothing/launcher/card/t;

    invoke-virtual {v4}, Lcom/nothing/launcher/card/t;->n()Z

    move-result v4

    if-eqz v4, :cond_51

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_51

    :cond_6e
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_72
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_82

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh8/o;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_72

    :cond_82
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_86
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_af

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh8/o;

    invoke-virtual {p1}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/launcher/card/t;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/nothing/launcher/card/t;->r(I)V

    invoke-virtual {p1}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/nothing/launcher/card/t;

    invoke-virtual {v0, v1}, Lcom/nothing/launcher/card/t;->s(I)V

    invoke-virtual {p1}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/nothing/launcher/card/t;

    invoke-virtual {p1, v3}, Lcom/nothing/launcher/card/t;->t(Z)V

    goto :goto_86

    :cond_af
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public e(Z)V
    .registers 2

    iget-object p0, p0, LU5/e;->q:LI8/A;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public f()V
    .registers 7

    iget-object v0, p0, LU5/e;->b:LF8/L;

    iget-object v1, p0, LU5/e;->c:LF8/I;

    new-instance v3, LU5/e$l;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, LU5/e$l;-><init>(LU5/e;Lm8/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public g(ILm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, LU5/e$h;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LU5/e$h;

    iget v1, v0, LU5/e$h;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LU5/e$h;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, LU5/e$h;

    invoke-direct {v0, p0, p2}, LU5/e$h;-><init>(LU5/e;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LU5/e$h;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LU5/e$h;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_33

    if-ne v2, v3, :cond_2b

    iget p1, v0, LU5/e$h;->q:I

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_47

    :cond_2b
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_33
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, LU5/e;->l(Z)V

    iget-object p0, p0, LU5/e;->h:LI8/z;

    iput p1, v0, LU5/e$h;->q:I

    iput v3, v0, LU5/e$h;->t:I

    invoke-static {p0, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_47

    return-object v1

    :cond_47
    :goto_47
    check-cast p2, Ljava/util/List;

    move-object p0, p2

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_50
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lh8/o;

    invoke-virtual {v2}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nothing/launcher/card/t;

    invoke-virtual {v2}, Lcom/nothing/launcher/card/t;->m()I

    move-result v2

    if-ne v2, p1, :cond_50

    goto :goto_6b

    :cond_6a
    const/4 v1, 0x0

    :goto_6b
    check-cast v1, Lh8/o;

    if-eqz v1, :cond_76

    invoke-interface {p2, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    :cond_76
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_7f
    :goto_7f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lh8/o;

    invoke-virtual {v1}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/launcher/card/t;

    invoke-virtual {v1}, Lcom/nothing/launcher/card/t;->n()Z

    move-result v1

    if-eqz v1, :cond_7f

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7f

    :cond_9c
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_a0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_b0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh8/o;

    invoke-interface {p2, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_a0

    :cond_b0
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public h(Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p1, LU5/e$t;

    if-eqz v0, :cond_13

    move-object v0, p1

    check-cast v0, LU5/e$t;

    iget v1, v0, LU5/e$t;->s:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LU5/e$t;->s:I

    goto :goto_18

    :cond_13
    new-instance v0, LU5/e$t;

    invoke-direct {v0, p0, p1}, LU5/e$t;-><init>(LU5/e;Lm8/e;)V

    :goto_18
    iget-object p1, v0, LU5/e$t;->q:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LU5/e$t;->s:I

    const/4 v3, 0x1

    if-eqz v2, :cond_31

    if-ne v2, v3, :cond_29

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_45

    :cond_29
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_31
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LU5/e;->c:LF8/I;

    new-instance v2, LU5/e$u;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, LU5/e$u;-><init>(LU5/e;Lm8/e;)V

    iput v3, v0, LU5/e$t;->s:I

    invoke-static {p1, v2, v0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_45

    return-object v1

    :cond_45
    :goto_45
    const-string p0, "withContext(...)"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public i(Ljava/lang/String;Lm8/e;)Ljava/lang/Object;
    .registers 11

    instance-of v0, p2, LU5/e$m;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LU5/e$m;

    iget v1, v0, LU5/e$m;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LU5/e$m;->u:I

    goto :goto_18

    :cond_13
    new-instance v0, LU5/e$m;

    invoke-direct {v0, p0, p2}, LU5/e$m;-><init>(LU5/e;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LU5/e$m;->s:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LU5/e$m;->u:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_42

    if-eq v2, v4, :cond_35

    if-ne v2, v3, :cond_2d

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_78

    :cond_2d
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_35
    iget-object p0, v0, LU5/e$m;->r:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Ljava/lang/String;

    iget-object p0, v0, LU5/e$m;->q:Ljava/lang/Object;

    check-cast p0, LU5/e;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_59

    :cond_42
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    new-instance p2, LU5/e$o;

    invoke-direct {p2, p0, v5}, LU5/e$o;-><init>(LU5/e;Lm8/e;)V

    iput-object p0, v0, LU5/e$m;->q:Ljava/lang/Object;

    iput-object p1, v0, LU5/e$m;->r:Ljava/lang/Object;

    iput v4, v0, LU5/e$m;->u:I

    const-wide/16 v6, 0x1388

    invoke-static {v6, v7, p2, v0}, LF8/Y0;->c(JLv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_59

    goto :goto_77

    :cond_59
    :goto_59
    check-cast p2, Lh8/A;

    if-nez p2, :cond_64

    const-string p2, "WidgetRepository"

    const-string v2, "restoreWidgetsFromSaveState: wait for first pipeline emit timed out, applying draft anyway"

    invoke-static {p2, v2}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :cond_64
    iget-object p2, p0, LU5/e;->c:LF8/I;

    new-instance v2, LU5/e$n;

    invoke-direct {v2, p0, p1, v5}, LU5/e$n;-><init>(LU5/e;Ljava/lang/String;Lm8/e;)V

    iput-object v5, v0, LU5/e$m;->q:Ljava/lang/Object;

    iput-object v5, v0, LU5/e$m;->r:Ljava/lang/Object;

    iput v3, v0, LU5/e$m;->u:I

    invoke-static {p2, v2, v0}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_78

    :goto_77
    return-object v1

    :cond_78
    :goto_78
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic j()LI8/f;
    .registers 1

    invoke-virtual {p0}, LU5/e;->T()LI8/z;

    move-result-object p0

    return-object p0
.end method

.method public k(Lm8/e;)Ljava/lang/Object;
    .registers 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, LU5/e$q;

    if-eqz v2, :cond_17

    move-object v2, v1

    check-cast v2, LU5/e$q;

    iget v3, v2, LU5/e$q;->t:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_17

    sub-int/2addr v3, v4

    iput v3, v2, LU5/e$q;->t:I

    goto :goto_1c

    :cond_17
    new-instance v2, LU5/e$q;

    invoke-direct {v2, v0, v1}, LU5/e$q;-><init>(LU5/e;Lm8/e;)V

    :goto_1c
    iget-object v1, v2, LU5/e$q;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, LU5/e$q;->t:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_41

    if-eq v4, v6, :cond_39

    if-ne v4, v5, :cond_31

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_144

    :cond_31
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_39
    iget-object v0, v2, LU5/e$q;->q:Ljava/lang/Object;

    check-cast v0, LU5/e;

    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_52

    :cond_41
    invoke-static {v1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object v1, v0, LU5/e;->h:LI8/z;

    iput-object v0, v2, LU5/e$q;->q:Ljava/lang/Object;

    iput v6, v2, LU5/e$q;->t:I

    invoke-static {v1, v2}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_52

    goto/16 :goto_143

    :cond_52
    :goto_52
    check-cast v1, Ljava/util/List;

    move-object v4, v1

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_60
    :goto_60
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lh8/o;

    invoke-virtual {v9}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/nothing/launcher/card/t;

    invoke-virtual {v9}, Lcom/nothing/launcher/card/t;->n()Z

    move-result v9

    if-eqz v9, :cond_60

    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_60

    :cond_7d
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_81
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_91

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lh8/o;

    invoke-interface {v1, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_81

    :cond_91
    new-instance v1, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lh8/o;

    invoke-virtual {v7}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/nothing/launcher/card/t;

    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a0

    :cond_b6
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_c3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/nothing/launcher/card/t;

    new-instance v9, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    invoke-virtual {v8}, Lcom/nothing/launcher/card/t;->m()I

    move-result v10

    iget v11, v8, LC2/b;->s:I

    iget v12, v8, LC2/b;->t:I

    iget v13, v8, LC2/b;->u:I

    iget v14, v8, LC2/b;->v:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v15

    invoke-direct/range {v9 .. v16}, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;-><init>(IIIIIJ)V

    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_c3

    :cond_e8
    iget-object v7, v0, LU5/e;->e:Lcom/google/gson/Gson;

    invoke-virtual {v7, v4}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_fb
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_113

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/nothing/launcher/card/t;

    invoke-virtual {v6}, Lcom/nothing/launcher/card/t;->m()I

    move-result v6

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_fb

    :cond_113
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "saveWidgetInfo ids:"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " info:"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v6, "WidgetRepository"

    invoke-static {v6, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, LU5/e;->c:LF8/I;

    new-instance v6, LU5/e$r;

    const/4 v7, 0x0

    invoke-direct {v6, v4, v0, v7}, LU5/e$r;-><init>(Ljava/lang/String;LU5/e;Lm8/e;)V

    iput-object v7, v2, LU5/e$q;->q:Ljava/lang/Object;

    iput v5, v2, LU5/e$q;->t:I

    invoke-static {v1, v6, v2}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_144

    :goto_143
    return-object v3

    :cond_144
    :goto_144
    sget-object v0, Lh8/A;->a:Lh8/A;

    return-object v0
.end method

.method public l(Z)V
    .registers 2

    iput-boolean p1, p0, LU5/e;->k:Z

    return-void
.end method

.method public m(Lm8/e;)Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, LU5/e;->a:Landroid/content/Context;

    invoke-direct {p0, v0}, LU5/e;->S(Landroid/content/Context;)LL0/i;

    move-result-object p0

    new-instance v0, LU5/e$x;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU5/e$x;-><init>(Lm8/e;)V

    invoke-static {p0, v0, p1}, LO0/j;->a(LL0/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_17

    return-object p0

    :cond_17
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public n(Lm8/e;)Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, LU5/e;->a:Landroid/content/Context;

    invoke-direct {p0, v0}, LU5/e;->S(Landroid/content/Context;)LL0/i;

    move-result-object p0

    new-instance v0, LU5/e$y;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LU5/e$y;-><init>(Lm8/e;)V

    invoke-static {p0, v0, p1}, LO0/j;->a(LL0/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_17

    return-object p0

    :cond_17
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public o()LI8/f;
    .registers 1

    iget-object p0, p0, LU5/e;->i:LI8/f;

    return-object p0
.end method

.method public p()LI8/f;
    .registers 1

    iget-object p0, p0, LU5/e;->n:LI8/f;

    return-object p0
.end method

.method public q(Lh8/o;)V
    .registers 9

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LU5/e;->b:LF8/L;

    iget-object v2, p0, LU5/e;->c:LF8/I;

    new-instance v4, LU5/e$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, LU5/e$c;-><init>(LU5/e;Lh8/o;Lm8/e;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public r()Z
    .registers 3

    iget-object p0, p0, LU5/e;->a:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string v0, "lock_screen_expand_widget_enable"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    if-eqz p0, :cond_11

    const/4 p0, 0x1

    return p0

    :cond_11
    return v1
.end method

.method public s(Lh8/o;Lm8/e;)Ljava/lang/Object;
    .registers 7

    instance-of v0, p2, LU5/e$d;

    if-eqz v0, :cond_13

    move-object v0, p2

    check-cast v0, LU5/e$d;

    iget v1, v0, LU5/e$d;->t:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_13

    sub-int/2addr v1, v2

    iput v1, v0, LU5/e$d;->t:I

    goto :goto_18

    :cond_13
    new-instance v0, LU5/e$d;

    invoke-direct {v0, p0, p2}, LU5/e$d;-><init>(LU5/e;Lm8/e;)V

    :goto_18
    iget-object p2, v0, LU5/e$d;->r:Ljava/lang/Object;

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LU5/e$d;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_36

    if-ne v2, v3, :cond_2e

    iget-object p0, v0, LU5/e$d;->q:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Lh8/o;

    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4a

    :cond_2e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_36
    invoke-static {p2}, Lh8/r;->b(Ljava/lang/Object;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, LU5/e;->l(Z)V

    iget-object p0, p0, LU5/e;->h:LI8/z;

    iput-object p1, v0, LU5/e$d;->q:Ljava/lang/Object;

    iput v3, v0, LU5/e$d;->t:I

    invoke-static {p0, v0}, LI8/h;->x(LI8/f;Lm8/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4a

    return-object v1

    :cond_4a
    :goto_4a
    check-cast p2, Ljava/util/List;

    move-object p0, p2

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_58
    :goto_58
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_75

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lh8/o;

    invoke-virtual {v2}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/nothing/launcher/card/t;

    invoke-virtual {v2}, Lcom/nothing/launcher/card/t;->n()Z

    move-result v2

    if-eqz v2, :cond_58

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_58

    :cond_75
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_79
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_89

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh8/o;

    invoke-interface {p2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_79

    :cond_89
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public t()[Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;
    .registers 3

    iget-object v0, p0, LU5/e;->g:Ljava/lang/String;

    if-eqz v0, :cond_12

    iget-object p0, p0, LU5/e;->e:Lcom/google/gson/Gson;

    const-class v1, [Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    invoke-virtual {p0, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    if-nez p0, :cond_11

    goto :goto_12

    :cond_11
    return-object p0

    :cond_12
    :goto_12
    const/4 p0, 0x0

    new-array p0, p0, [Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    return-object p0
.end method

.method public u()Ljava/util/List;
    .registers 3

    iget-object v0, p0, LU5/e;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "systemui_widget_infos"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, LU5/e;->Z(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public v()V
    .registers 7

    iget-object v0, p0, LU5/e;->b:LF8/L;

    iget-object v1, p0, LU5/e;->c:LF8/I;

    new-instance v3, LU5/e$z;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, LU5/e$z;-><init>(LU5/e;Lm8/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public w()LI8/f;
    .registers 1

    iget-object p0, p0, LU5/e;->o:LI8/f;

    return-object p0
.end method

.method public x()LI8/f;
    .registers 1

    iget-object p0, p0, LU5/e;->r:LI8/f;

    return-object p0
.end method

.method public y(I)V
    .registers 8

    iget-object v0, p0, LU5/e;->b:LF8/L;

    iget-object v1, p0, LU5/e;->c:LF8/I;

    new-instance v3, LU5/e$g;

    const/4 v2, 0x0

    invoke-direct {v3, p0, p1, v2}, LU5/e$g;-><init>(LU5/e;ILm8/e;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public z()V
    .registers 2

    iget-object p0, p0, LU5/e;->q:LI8/A;

    const/4 v0, 0x0

    invoke-interface {p0, v0}, LI8/A;->setValue(Ljava/lang/Object;)V

    return-void
.end method
