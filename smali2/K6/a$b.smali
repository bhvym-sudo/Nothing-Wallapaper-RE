.class public final LK6/a$b;
.super Lh3/n$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final d:Lt6/c;


# direct methods
.method public constructor <init>(Lg3/c;Landroid/content/Context;)V
    .registers 4

    const-string v0, "receiver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lh3/n$a;-><init>(Lg3/c;Landroid/content/Context;)V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p1

    invoke-interface {p1}, Lh3/H;->C()Ld3/a;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type com.nothing.wallpaper.config.NTFlags"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lt6/c;

    iput-object p1, p0, LK6/a$b;->d:Lt6/c;

    return-void
.end method

.method public static synthetic k(LK6/a$b;Lg3/a;)V
    .registers 2

    invoke-static {p0, p1}, LK6/a$b;->o(LK6/a$b;Lg3/a;)V

    return-void
.end method

.method private final m(Lg3/r$a;Lorg/xmlpull/v1/XmlPullParser;)V
    .registers 8

    iget-object p0, p0, Lh3/n$a;->c:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v0

    :cond_a
    :goto_a
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_17

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v2

    if-le v2, v0, :cond_65

    :cond_17
    const/4 v2, 0x1

    if-eq v1, v2, :cond_65

    const/4 v2, 0x2

    if-ne v1, v2, :cond_a

    const-string v1, "color-wallpaper"

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_47

    sget-object v1, LJ6/c;->G:LJ6/c$a;

    invoke-virtual {p1}, Lg3/r$a;->c()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getId(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v3

    const-string v4, "asAttributeSet(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2, v3}, LJ6/c$a;->b(Ljava/lang/String;Landroid/util/AttributeSet;)LJ6/c;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {p1, v1}, Lg3/r$a;->a(Lg3/x;)Lg3/r$a;

    goto :goto_a

    :cond_47
    const-string v1, "static-wallpaper"

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {p1}, Lg3/r$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v2

    invoke-static {p0, v1, v2}, Lg3/p;->y(Ljava/lang/String;Ljava/lang/String;Landroid/util/AttributeSet;)Lg3/p;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {p1, v1}, Lg3/r$a;->a(Lg3/x;)Lg3/r$a;

    goto :goto_a

    :cond_65
    return-void
.end method

.method private final n(Landroid/content/Context;)Lg3/a;
    .registers 5

    new-instance p0, LJ6/l;

    const v0, 0x7f1301df

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f130112

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lh3/n;->j(Landroid/content/Context;)I

    move-result p1

    const v1, 0x7f080317

    invoke-direct {p0, v0, v2, p1, v1}, LJ6/l;-><init>(Ljava/lang/String;Ljava/lang/String;II)V

    return-object p0
.end method

.method private static final o(LK6/a$b;Lg3/a;)V
    .registers 2

    filled-new-array {p1}, [Lg3/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    return-void
.end method

.method private final p()V
    .registers 3

    const-string v0, "NTF_CO_CA"

    invoke-static {v0}, La6/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_13

    sget-object v0, LK6/a;->h:LK6/a$a;

    const-string v1, "business_partner"

    invoke-virtual {p0, v1}, Lh3/n$a;->f(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, LK6/a$a;->d(Ljava/util/List;)V

    :cond_13
    return-void
.end method

.method private final q()V
    .registers 5

    const v0, 0x7f160005

    invoke-direct {p0, v0}, LK6/a$b;->r(I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3b

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_f
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg3/r;

    invoke-virtual {v1}, Lg3/r;->q()Ljava/util/List;

    move-result-object v2

    const-string v3, "getUnmodifiableWallpapers(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_f

    invoke-static {}, LK6/a;->n()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    filled-new-array {v1}, [Lg3/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    goto :goto_f

    :cond_3b
    return-void
.end method

.method private final r(I)Ljava/util/List;
    .registers 12

    const/4 v0, 0x1

    iget-object v1, p0, Lh3/n$a;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x0

    if-nez p1, :cond_b

    return-object v2

    :cond_b
    :try_start_b
    sget-object v3, Lh8/q;->r:Lh8/q$a;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    const-string v4, "getXml(...)"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :cond_21
    :goto_21
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v7

    const/4 v8, 0x3

    if-ne v7, v8, :cond_31

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v8

    if-le v8, v4, :cond_93

    goto :goto_31

    :catchall_2f
    move-exception p0

    goto :goto_98

    :cond_31
    :goto_31
    if-eq v7, v0, :cond_93

    const/4 v8, 0x2

    if-ne v7, v8, :cond_21

    const-string v7, "color-category"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_66

    new-instance v7, LJ6/b$a;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v8

    const-string v9, "asAttributeSet(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v7, v1, v8}, LJ6/b$a;-><init>(Landroid/content/res/Resources;Landroid/util/AttributeSet;)V

    add-int/lit8 v8, v5, 0x1

    add-int/lit16 v5, v5, 0x96

    invoke-virtual {v7, v5}, LJ6/b$a;->g(I)LJ6/b$a;

    invoke-direct {p0, v7, p1}, LK6/a$b;->m(Lg3/r$a;Lorg/xmlpull/v1/XmlPullParser;)V

    invoke-virtual {v7}, LJ6/b$a;->f()LJ6/b;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v5, v8

    goto :goto_21

    :cond_66
    const-string v7, "category"

    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_21

    new-instance v7, Lg3/r$a;

    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v8

    invoke-direct {v7, v1, v8}, Lg3/r$a;-><init>(Landroid/content/res/Resources;Landroid/util/AttributeSet;)V

    add-int/lit8 v8, v6, 0x1

    add-int/lit8 v6, v6, 0x64

    invoke-virtual {v7, v6}, Lg3/r$a;->d(I)Lg3/r$a;

    invoke-direct {p0, v7, p1}, LK6/a$b;->m(Lg3/r$a;Lorg/xmlpull/v1/XmlPullParser;)V

    invoke-virtual {v7}, Lg3/r$a;->b()Lg3/r;

    move-result-object v6

    const-string v7, "build(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v6, v8

    goto :goto_21

    :cond_93
    invoke-static {v3}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_97
    .catchall {:try_start_b .. :try_end_97} :catchall_2f

    goto :goto_a2

    :goto_98
    sget-object p1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p0}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_a2
    invoke-static {p0}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a9

    goto :goto_aa

    :cond_a9
    move-object v2, p0

    :goto_aa
    check-cast v2, Ljava/util/List;

    return-object v2
.end method

.method private final s(Lg3/r;Lg3/r;)Lg3/r;
    .registers 7

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lg3/r;->q()Ljava/util/List;

    move-result-object p2

    const-string v1, "getUnmodifiableWallpapers(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_19
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg3/x;

    instance-of v3, v2, Lg3/p;

    if-eqz v3, :cond_36

    move-object v3, v2

    check-cast v3, Lg3/p;

    invoke-virtual {v3}, Lg3/p;->A()I

    move-result v3

    if-eqz v3, :cond_36

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_19

    :cond_36
    invoke-static {v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_19

    :cond_3d
    invoke-virtual {p1}, Lg3/r;->q()Ljava/util/List;

    move-result-object p2

    invoke-static {p2, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_4a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6e

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg3/x;

    instance-of v2, v1, Lg3/p;

    if-eqz v2, :cond_67

    move-object v2, v1

    check-cast v2, Lg3/p;

    invoke-virtual {v2}, Lg3/p;->A()I

    move-result v2

    if-eqz v2, :cond_67

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4a

    :cond_67
    invoke-static {v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4a

    :cond_6e
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    const/4 v1, 0x1

    if-le p2, v1, :cond_7d

    new-instance p2, LK6/a$b$a;

    invoke-direct {p2}, LK6/a$b$a;-><init>()V

    invoke-static {v0, p2}, Li8/s;->y(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_7d
    const/4 p2, 0x0

    invoke-interface {p0, p2, v0}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    new-instance p2, Lg3/r;

    invoke-virtual {p1}, Lg3/a;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lg3/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lg3/a;->e()I

    move-result p1

    invoke-direct {p2, v0, v1, p0, p1}, Lg3/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    return-object p2
.end method

.method private final t()V
    .registers 3

    invoke-static {}, LK6/a;->n()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2b

    invoke-static {}, LK6/a;->n()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg3/a;

    filled-new-array {v1}, [Lg3/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    goto :goto_16

    :cond_2a
    return-void

    :cond_2b
    invoke-direct {p0}, LK6/a$b;->q()V

    return-void
.end method

.method private final u()V
    .registers 6

    iget-object v0, p0, LK6/a$b;->d:Lt6/c;

    invoke-virtual {v0}, Lt6/c;->x()Z

    move-result v0

    if-eqz v0, :cond_36

    sget-object v0, LJ6/i;->F:LJ6/i$a;

    iget-object v1, p0, Lh3/n$a;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, LJ6/i$a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lh3/n$a;->c:Landroid/content/Context;

    const-string v3, "mAppContext"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2, v1}, LJ6/i$a;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    new-instance v2, LJ6/h;

    iget-object v3, p0, Lh3/n$a;->c:Landroid/content/Context;

    const v4, 0x7f1301f2

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x1

    invoke-direct {v2, v3, v1, v0, v4}, LJ6/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V

    filled-new-array {v2}, [Lg3/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    :cond_36
    return-void
.end method


# virtual methods
.method protected b(Ljava/util/List;)Ljava/util/List;
    .registers 8

    const v0, 0x7f160003

    invoke-direct {p0, v0}, LK6/a$b;->r(I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_73

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_11
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    const-string v2, "nothing_category"

    const/4 v3, 0x0

    if-eqz v1, :cond_2c

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lg3/r;

    invoke-virtual {v4}, Lg3/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    goto :goto_2d

    :cond_2c
    move-object v1, v3

    :goto_2d
    check-cast v1, Lg3/r;

    if-nez v1, :cond_32

    goto :goto_73

    :cond_32
    if-eqz p1, :cond_56

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_3c
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v4

    if-eqz v4, :cond_54

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lg3/r;

    invoke-virtual {v5}, Lg3/a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3c

    move-object v3, v4

    :cond_54
    check-cast v3, Lg3/r;

    :cond_56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_62

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_62
    if-eqz v3, :cond_6f

    invoke-direct {p0, v3, v1}, LK6/a$b;->s(Lg3/r;Lg3/r;)Lg3/r;

    move-result-object p0

    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_6f
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0

    :cond_73
    :goto_73
    return-object p1
.end method

.method protected c(Lg3/x;)Z
    .registers 4

    instance-of p0, p1, Lg3/p;

    if-eqz p0, :cond_7

    check-cast p1, Lg3/p;

    goto :goto_8

    :cond_7
    const/4 p1, 0x0

    :goto_8
    const/4 p0, 0x0

    if-eqz p1, :cond_3a

    invoke-virtual {p1}, Lg3/p;->C()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_12

    goto :goto_3a

    :cond_12
    const-string v0, "NTF_ASTEROIDS"

    invoke-static {v0}, La6/a;->a(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2d

    const-string v0, "NTF_PJ_FRB"

    invoke-static {v0}, La6/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2d

    const-string v0, "NTF_PJ_FRP"

    invoke-static {v0}, La6/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2c

    goto :goto_2d

    :cond_2c
    return v1

    :cond_2d
    :goto_2d
    sget-object v0, Li6/e;->a:Li6/e;

    invoke-virtual {v0}, Li6/e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1, v1}, LE8/i;->B(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_3a

    return v1

    :cond_3a
    :goto_3a
    return p0
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, LK6/a$b;->l([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method protected g(Ljava/lang/String;Ljava/util/function/UnaryOperator;)Ljava/util/List;
    .registers 10

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lh3/n$a;->b:Lh3/P;

    invoke-interface {v1}, Lh3/P;->a()Landroid/content/res/Resources;

    move-result-object v1

    iget-object v2, p0, Lh3/n$a;->b:Lh3/P;

    invoke-interface {v2}, Lh3/P;->b()Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_72

    if-nez v2, :cond_16

    goto :goto_72

    :cond_16
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getSystemCategories pkg:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "NTCategoryProvider"

    invoke-static {v4, v3}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "com.nothing.wallpapersstub"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "getSystemCategories(...)"

    if-nez v3, :cond_3e

    invoke-super {p0, p1, p2}, Lh3/n$a;->g(Ljava/lang/String;Ljava/util/function/UnaryOperator;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_3e
    sget-object v3, LU7/b;->a:LU7/b;

    iget-object v5, p0, Lh3/n$a;->c:Landroid/content/Context;

    const-string v6, "mAppContext"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v5}, LU7/b;->d(Landroid/content/Context;)Landroid/content/ContentProviderClient;

    move-result-object v5

    if-nez v5, :cond_55

    invoke-super {p0, p1, p2}, Lh3/n$a;->g(Ljava/lang/String;Ljava/util/function/UnaryOperator;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_55
    invoke-virtual {v3, v1, v2, v5}, LU7/b;->g(Landroid/content/res/Resources;Ljava/lang/String;Landroid/content/ContentProviderClient;)Ljava/util/List;

    move-result-object p1

    if-eqz p2, :cond_65

    invoke-interface {p2, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_64

    goto :goto_65

    :cond_64
    move-object p1, p2

    :cond_65
    :goto_65
    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance p1, LK6/b;

    invoke-direct {p1, p0}, LK6/b;-><init>(LK6/a$b;)V

    invoke-interface {v0, p1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    :cond_72
    :goto_72
    return-object v0
.end method

.method protected varargs l([Ljava/lang/Void;)Ljava/lang/Void;
    .registers 4

    const-string v0, "voids"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lh3/I;->a()Lh3/H;

    move-result-object p1

    iget-object v0, p0, Lh3/n$a;->c:Landroid/content/Context;

    const-string v1, "mAppContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lh3/H;->v(Landroid/content/Context;)Lh3/P;

    move-result-object p1

    iput-object p1, p0, Lh3/n$a;->b:Lh3/P;

    iget-object p1, p0, Lh3/n$a;->c:Landroid/content/Context;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LK6/a$b;->n(Landroid/content/Context;)Lg3/a;

    move-result-object p1

    filled-new-array {p1}, [Lg3/a;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    invoke-direct {p0}, LK6/a$b;->u()V

    invoke-virtual {p0}, Lh3/n$a;->j()V

    invoke-direct {p0}, LK6/a$b;->t()V

    invoke-direct {p0}, LK6/a$b;->p()V

    const/4 p0, 0x0

    return-object p0
.end method
