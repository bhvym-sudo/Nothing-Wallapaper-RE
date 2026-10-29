.class public final LI7/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/f$a;
    }
.end annotation


# static fields
.field public static final c:LI7/f$a;


# instance fields
.field private final a:LJ7/i;

.field private final b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LI7/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LI7/f$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LI7/f;->c:LI7/f$a;

    return-void
.end method

.method public constructor <init>(LJ7/i;Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;)V
    .registers 4

    const-string v0, "lockScreenViewModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI7/f;->a:LJ7/i;

    iput-object p2, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    return-void
.end method

.method public static synthetic a(LI7/f;)V
    .registers 1

    invoke-static {p0}, LI7/f;->f(LI7/f;)V

    return-void
.end method

.method private final b(Lcom/nothing/launcher/card/t;)Ljava/lang/String;
    .registers 4

    invoke-virtual {p1}, Lcom/nothing/launcher/card/t;->m()I

    move-result p0

    iget v0, p1, LC2/b;->s:I

    iget p1, p1, LC2/b;->t:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "-"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final d()V
    .registers 9

    iget-object v0, p0, LI7/f;->a:LJ7/i;

    invoke-virtual {v0}, LJ7/i;->I()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v1}, Ly7/S;->I0()Ljava/util/List;

    move-result-object v1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lh8/o;

    invoke-virtual {v5}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/nothing/launcher/card/t;

    invoke-virtual {v5}, Lcom/nothing/launcher/card/t;->m()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_3b
    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_62

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/nothing/launcher/card/t;

    invoke-virtual {v5}, Lcom/nothing/launcher/card/t;->m()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4a

    :cond_62
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "restoreAddedWidgets backup: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " current: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "WidgetPersistStrategy"

    invoke-static {v3, v2}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_89
    :goto_89
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/nothing/launcher/card/t;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_99
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lh8/o;

    invoke-virtual {v6}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/nothing/launcher/card/t;

    invoke-virtual {v6}, Lcom/nothing/launcher/card/t;->m()I

    move-result v6

    invoke-virtual {v3}, Lcom/nothing/launcher/card/t;->m()I

    move-result v7

    if-ne v6, v7, :cond_99

    goto :goto_b8

    :cond_b7
    const/4 v5, 0x0

    :goto_b8
    if-nez v5, :cond_89

    invoke-virtual {v3}, Lcom/nothing/launcher/card/t;->m()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_89

    :cond_c6
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_ca
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v2, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v2, v1}, Ly7/S;->F0(I)V

    goto :goto_ca

    :cond_e0
    return-void
.end method

.method private static final f(LI7/f;)V
    .registers 2

    invoke-direct {p0}, LI7/f;->d()V

    iget-object v0, p0, LI7/f;->a:LJ7/i;

    invoke-virtual {v0}, LJ7/i;->B0()V

    iget-object p0, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->O3(Ljava/lang/Runnable;)V

    return-void
.end method

.method private final g()V
    .registers 11

    iget-object v0, p0, LI7/f;->a:LJ7/i;

    invoke-virtual {v0}, LJ7/i;->I()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v1}, Ly7/S;->I0()Ljava/util/List;

    move-result-object v1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lh8/o;

    invoke-virtual {v5}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/nothing/launcher/card/t;

    invoke-virtual {v5}, Lcom/nothing/launcher/card/t;->m()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_3b
    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_62

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/nothing/launcher/card/t;

    invoke-virtual {v6}, Lcom/nothing/launcher/card/t;->m()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4a

    :cond_62
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "saveDeletedWidgets backup:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " current:"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "WidgetPersistStrategy"

    invoke-static {v4, v2}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_89
    :goto_89
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lh8/o;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_99
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/nothing/launcher/card/t;

    invoke-virtual {v8}, Lcom/nothing/launcher/card/t;->m()I

    move-result v8

    invoke-virtual {v5}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/nothing/launcher/card/t;

    invoke-virtual {v9}, Lcom/nothing/launcher/card/t;->m()I

    move-result v9

    if-ne v8, v9, :cond_99

    goto :goto_b8

    :cond_b7
    const/4 v7, 0x0

    :goto_b8
    if-nez v7, :cond_89

    invoke-virtual {v5}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_89

    :cond_c2
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_cf
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/nothing/launcher/card/t;

    invoke-virtual {v3}, Lcom/nothing/launcher/card/t;->m()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_cf

    :cond_e7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveDeletedWidgets ids:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/nothing/wallpaper/common/log/c;->n(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_ff
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_138

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/nothing/launcher/card/t;

    iget-object v2, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v1}, Lcom/nothing/launcher/card/t;->m()I

    move-result v3

    invoke-virtual {v2, v3}, Ly7/S;->F0(I)V

    iget-object v2, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v2}, Ly7/S;->K0()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lcom/nothing/launcher/card/t;->m()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_12f

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_130

    :cond_12f
    const/4 v2, 0x2

    :goto_130
    sget-object v3, LR7/d;->r:LR7/d;

    const-string v4, "widget_remove"

    invoke-virtual {v3, v4, v1, v2}, LR7/d;->l(Ljava/lang/String;Lcom/nothing/launcher/card/t;I)V

    goto :goto_ff

    :cond_138
    return-void
.end method


# virtual methods
.method public final c()Z
    .registers 6

    iget-object v0, p0, LI7/f;->a:LJ7/i;

    invoke-virtual {v0}, LJ7/i;->H()Z

    move-result v0

    iget-object v1, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Q2()Z

    move-result v1

    const/4 v2, 0x1

    if-eq v0, v1, :cond_10

    return v2

    :cond_10
    iget-object v0, p0, LI7/f;->a:LJ7/i;

    invoke-virtual {v0}, LJ7/i;->I()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_41

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh8/o;

    invoke-virtual {v4}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/nothing/launcher/card/t;

    invoke-direct {p0, v4}, LI7/f;->b(Lcom/nothing/launcher/card/t;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :cond_41
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v1}, Ly7/S;->I0()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v3}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/nothing/launcher/card/t;

    invoke-direct {p0, v3}, LI7/f;->b(Lcom/nothing/launcher/card/t;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5a

    :cond_6e
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isWidgetChanged backup:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " current:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "WidgetPersistStrategy"

    invoke-static {v3, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, v2

    return p0
.end method

.method public final e()V
    .registers 5

    iget-object v0, p0, LI7/f;->a:LJ7/i;

    invoke-virtual {v0}, LJ7/i;->H()Z

    move-result v0

    iget-object v1, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Q2()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "restoreWidget expand origin:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " current:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "WidgetPersistStrategy"

    invoke-static {v2, v1}, Lcom/nothing/wallpaper/common/log/c;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->Q2()Z

    move-result v1

    if-eq v1, v0, :cond_57

    iget-object v1, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->M()Lcom/android/launcher3/Workspace;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object v1, p0, LI7/f;->a:LJ7/i;

    invoke-virtual {v1, v0}, LJ7/i;->D(Z)V

    iget-object v1, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->P2()Lj7/j;

    move-result-object v1

    if-eqz v1, :cond_4d

    invoke-virtual {v1, v0}, Lj7/j;->H0(Z)V

    :cond_4d
    iget-object v0, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    new-instance v1, LI7/e;

    invoke-direct {v1, p0}, LI7/e;-><init>(LI7/f;)V

    invoke-virtual {v0, v1}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->O3(Ljava/lang/Runnable;)V

    :cond_57
    iget-object v0, p0, LI7/f;->b:Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/picker/lockscreen/ui/LockScreenFragment;->S2()Ljava/lang/Runnable;

    move-result-object v0

    if-nez v0, :cond_67

    invoke-direct {p0}, LI7/f;->d()V

    iget-object p0, p0, LI7/f;->a:LJ7/i;

    invoke-virtual {p0}, LJ7/i;->B0()V

    :cond_67
    return-void
.end method

.method public final h()V
    .registers 2

    iget-object v0, p0, LI7/f;->a:LJ7/i;

    invoke-virtual {v0}, LJ7/i;->D0()V

    invoke-direct {p0}, LI7/f;->g()V

    iget-object p0, p0, LI7/f;->a:LJ7/i;

    invoke-virtual {p0}, LJ7/i;->F0()V

    return-void
.end method
