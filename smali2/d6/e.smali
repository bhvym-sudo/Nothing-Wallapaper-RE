.class public final Ld6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO2/u;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/view/LayoutInflater;

.field private final c:Landroid/content/res/Resources;

.field private final d:Z

.field private final e:Landroid/os/Vibrator;

.field private final f:Ljava/lang/String;

.field private final g:Z

.field private h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/LayoutInflater;Landroid/content/res/Resources;ZLandroid/os/Vibrator;)V
    .registers 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutInflater"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld6/e;->a:Landroid/content/Context;

    iput-object p2, p0, Ld6/e;->b:Landroid/view/LayoutInflater;

    iput-object p3, p0, Ld6/e;->c:Landroid/content/res/Resources;

    iput-boolean p4, p0, Ld6/e;->d:Z

    iput-object p5, p0, Ld6/e;->e:Landroid/os/Vibrator;

    const-string p1, "NTClockProvider"

    iput-object p1, p0, Ld6/e;->f:Ljava/lang/String;

    const-string p2, "ro.phone.shell.persist_color"

    invoke-static {p2}, Landroid/os/SystemProperties;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Community Edition"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3e

    const-string p2, "ro.product.device"

    invoke-static {p2}, Landroid/os/SystemProperties;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Asteroids"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3e

    const/4 p2, 0x1

    goto :goto_3f

    :cond_3e
    const/4 p2, 0x0

    :goto_3f
    iput-boolean p2, p0, Ld6/e;->g:Z

    const-string p2, "init"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Ld6/e;->b()Z

    move-result p1

    iput-boolean p1, p0, Ld6/e;->h:Z

    return-void
.end method

.method private final b()Z
    .registers 1

    const-string p0, "NTF_SUPPORT_OLD_QUICKLOOK"

    invoke-static {p0}, La6/a;->a(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public a(LO2/v;)Ld6/b;
    .registers 6

    const-string v0, "settings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-le v0, v1, :cond_be

    invoke-virtual {p1}, LO2/v;->h()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v1, Ld6/f;->z:Ld6/f;

    invoke-virtual {v1}, Ld6/f;->e()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    goto/16 :goto_139

    :cond_23
    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v2, Ld6/f;->t:Ld6/f;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_38

    :goto_35
    move-object v1, v2

    goto/16 :goto_139

    :cond_38
    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v2, Ld6/f;->A:Ld6/f;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4b

    goto :goto_35

    :cond_4b
    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v2, Ld6/f;->s:Ld6/f;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5e

    goto :goto_35

    :cond_5e
    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v2, Ld6/f;->B:Ld6/f;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_71

    goto :goto_35

    :cond_71
    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v2, Ld6/f;->C:Ld6/f;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_84

    goto :goto_35

    :cond_84
    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v2, Ld6/f;->y:Ld6/f;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_97

    goto :goto_35

    :cond_97
    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v2, Ld6/f;->x:Ld6/f;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_aa

    goto :goto_35

    :cond_aa
    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v2, Ld6/f;->D:Ld6/f;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_139

    goto/16 :goto_35

    :cond_be
    invoke-virtual {p1}, LO2/v;->h()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v1, Ld6/f;->w:Ld6/f;

    invoke-virtual {v1}, Ld6/f;->e()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d5

    goto :goto_139

    :cond_d5
    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v2, Ld6/f;->v:Ld6/f;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e9

    goto/16 :goto_35

    :cond_e9
    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v2, Ld6/f;->t:Ld6/f;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_fd

    goto/16 :goto_35

    :cond_fd
    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v2, Ld6/f;->A:Ld6/f;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_111

    goto/16 :goto_35

    :cond_111
    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v2, Ld6/f;->s:Ld6/f;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_125

    goto/16 :goto_35

    :cond_125
    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    sget-object v2, Ld6/f;->u:Ld6/f;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_139

    goto/16 :goto_35

    :cond_139
    :goto_139
    new-instance p1, Ld6/b;

    iget-object v0, p0, Ld6/e;->a:Landroid/content/Context;

    iget-object p0, p0, Ld6/e;->b:Landroid/view/LayoutInflater;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v1, p0, v2}, Ld6/b;-><init>(Landroid/content/Context;Ld6/f;Landroid/view/LayoutInflater;LO2/r;)V

    return-object p1
.end method

.method public bridge synthetic createClock(LO2/v;)LO2/h;
    .registers 2

    invoke-virtual {p0, p1}, Ld6/e;->a(LO2/v;)Ld6/b;

    move-result-object p0

    return-object p0
.end method

.method public getClockPickerConfig(LO2/v;)LO2/t;
    .registers 13

    const-string v0, "settings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ld6/e;->getClocks()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_18

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_a5

    :cond_18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO2/s;

    invoke-virtual {v1}, LO2/s;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LO2/v;->h()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    iget-boolean v0, p0, Ld6/e;->d:Z

    if-nez v0, :cond_40

    invoke-static {}, Li8/s;->l()Ljava/util/List;

    move-result-object v0

    :goto_3e
    move-object v7, v0

    goto :goto_51

    :cond_40
    sget-object v0, LO2/n;->h:LO2/n$a;

    sget-object v1, LQ2/y;->a:LQ2/y$a;

    invoke-virtual {v1, p1}, LQ2/y$a;->a(LO2/v;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, LO2/v;->g()LO2/f;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LO2/n$a;->a(Ljava/util/List;LO2/f;)Ljava/util/List;

    move-result-object v0

    goto :goto_3e

    :goto_51
    iget-object v0, p0, Ld6/e;->f:Ljava/lang/String;

    invoke-virtual {p1}, LO2/v;->h()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getClockPickerConfig:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, LO2/t;

    invoke-virtual {p1}, LO2/v;->h()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_75

    const-string p1, "DEFAULT"

    :cond_75
    move-object v2, p1

    iget-object p1, p0, Ld6/e;->c:Landroid/content/res/Resources;

    sget v0, LI2/f;->d:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string p1, "getString(...)"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld6/e;->c:Landroid/content/res/Resources;

    sget v4, LI2/f;->c:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ld6/e;->c:Landroid/content/res/Resources;

    sget p1, LI2/c;->a:I

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    const-string p0, "getDrawable(...)"

    invoke-static {v5, p0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v6, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, LO2/t;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZLjava/util/List;LO2/b;ILkotlin/jvm/internal/h;)V

    return-object v1

    :cond_a5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, LO2/v;->h()Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, Ld6/e;->f:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is unsupported by "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getClocks()Ljava/util/List;
    .registers 18

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x23

    if-gt v2, v3, :cond_f

    const/4 v2, 0x1

    goto :goto_10

    :cond_f
    const/4 v2, 0x0

    :goto_10
    iget-boolean v3, v0, Ld6/e;->g:Z

    const-string v4, "getString(...)"

    if-eqz v3, :cond_33

    new-instance v5, LO2/s;

    iget-object v3, v0, Ld6/e;->a:Landroid/content/Context;

    sget-object v6, Ld6/f;->D:Ld6/f;

    invoke-virtual {v6}, Ld6/f;->e()I

    move-result v6

    invoke-virtual {v3, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, LO2/s;-><init>(Ljava/lang/String;ZLjava/lang/String;ZILkotlin/jvm/internal/h;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_33
    new-instance v6, LO2/s;

    iget-object v3, v0, Ld6/e;->a:Landroid/content/Context;

    if-eqz v2, :cond_40

    sget-object v5, Ld6/f;->w:Ld6/f;

    :goto_3b
    invoke-virtual {v5}, Ld6/f;->e()I

    move-result v5

    goto :goto_43

    :cond_40
    sget-object v5, Ld6/f;->z:Ld6/f;

    goto :goto_3b

    :goto_43
    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, LO2/s;-><init>(Ljava/lang/String;ZLjava/lang/String;ZILkotlin/jvm/internal/h;)V

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v7, LO2/s;

    iget-object v3, v0, Ld6/e;->a:Landroid/content/Context;

    if-eqz v2, :cond_63

    sget-object v5, Ld6/f;->v:Ld6/f;

    :goto_5e
    invoke-virtual {v5}, Ld6/f;->e()I

    move-result v5

    goto :goto_66

    :cond_63
    sget-object v5, Ld6/f;->y:Ld6/f;

    goto :goto_5e

    :goto_66
    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, LO2/s;-><init>(Ljava/lang/String;ZLjava/lang/String;ZILkotlin/jvm/internal/h;)V

    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v8, LO2/s;

    iget-object v3, v0, Ld6/e;->a:Landroid/content/Context;

    sget-object v5, Ld6/f;->t:Ld6/f;

    invoke-virtual {v5}, Ld6/f;->e()I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, LO2/s;-><init>(Ljava/lang/String;ZLjava/lang/String;ZILkotlin/jvm/internal/h;)V

    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v9, LO2/s;

    iget-object v3, v0, Ld6/e;->a:Landroid/content/Context;

    sget-object v5, Ld6/f;->s:Ld6/f;

    invoke-virtual {v5}, Ld6/f;->e()I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, LO2/s;-><init>(Ljava/lang/String;ZLjava/lang/String;ZILkotlin/jvm/internal/h;)V

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v10, LO2/s;

    iget-object v3, v0, Ld6/e;->a:Landroid/content/Context;

    if-eqz v2, :cond_c0

    sget-object v5, Ld6/f;->u:Ld6/f;

    :goto_bb
    invoke-virtual {v5}, Ld6/f;->e()I

    move-result v5

    goto :goto_c3

    :cond_c0
    sget-object v5, Ld6/f;->x:Ld6/f;

    goto :goto_bb

    :goto_c3
    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v15, 0xe

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, LO2/s;-><init>(Ljava/lang/String;ZLjava/lang/String;ZILkotlin/jvm/internal/h;)V

    invoke-interface {v1, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v3, v0, Ld6/e;->h:Z

    if-eqz v3, :cond_f8

    new-instance v5, LO2/s;

    iget-object v3, v0, Ld6/e;->a:Landroid/content/Context;

    sget-object v6, Ld6/f;->A:Ld6/f;

    invoke-virtual {v6}, Ld6/f;->e()I

    move-result v6

    invoke-virtual {v3, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, LO2/s;-><init>(Ljava/lang/String;ZLjava/lang/String;ZILkotlin/jvm/internal/h;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f8
    if-nez v2, :cond_160

    new-instance v6, LO2/s;

    iget-object v2, v0, Ld6/e;->a:Landroid/content/Context;

    sget-object v3, Ld6/f;->B:Ld6/f;

    invoke-virtual {v3}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "NTF_KEYGUARD_SPACE_AGE_CLOCKFACE_SUPPORT_TRANSITION"

    invoke-static {v2}, La6/a;->a(Ljava/lang/String;)Z

    move-result v10

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v12}, LO2/s;-><init>(Ljava/lang/String;ZLjava/lang/String;ZILkotlin/jvm/internal/h;)V

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v7, LO2/s;

    iget-object v2, v0, Ld6/e;->a:Landroid/content/Context;

    sget-object v3, Ld6/f;->C:Ld6/f;

    invoke-virtual {v3}, Ld6/f;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, LO2/s;-><init>(Ljava/lang/String;ZLjava/lang/String;ZILkotlin/jvm/internal/h;)V

    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v2, v0, Ld6/e;->g:Z

    if-nez v2, :cond_160

    const-string v2, "NTF_COMMUNITY_KEYGUARD_CLOCK"

    invoke-static {v2}, La6/a;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_160

    new-instance v5, LO2/s;

    iget-object v0, v0, Ld6/e;->a:Landroid/content/Context;

    sget-object v2, Ld6/f;->D:Ld6/f;

    invoke-virtual {v2}, Ld6/f;->e()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-direct/range {v5 .. v11}, LO2/s;-><init>(Ljava/lang/String;ZLjava/lang/String;ZILkotlin/jvm/internal/h;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_160
    return-object v1
.end method

.method public initialize(LO2/r;)V
    .registers 2

    return-void
.end method
