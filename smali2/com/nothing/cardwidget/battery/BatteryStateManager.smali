.class public final Lcom/nothing/cardwidget/battery/BatteryStateManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/nothing/cardwidget/battery/BatteryStateManager;

.field private static final TAG:Ljava/lang/String; = "BatteryStateManager"

.field private static batteryStateInfo:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;",
            ">;"
        }
    .end annotation
.end field

.field private static caseBatteryInfo:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static currentHandleBatteryInfo:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "LM5/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/nothing/cardwidget/battery/BatteryStateManager;

    invoke-direct {v0}, Lcom/nothing/cardwidget/battery/BatteryStateManager;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryStateManager;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->caseBatteryInfo:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->batteryStateInfo:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->currentHandleBatteryInfo:Ljava/util/HashMap;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final clearBatteryState(Ljava/lang/String;)V
    .registers 2

    const-string p0, "uniqueId"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->batteryStateInfo:Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final clearOldCachedBatteryInfo(Ljava/util/Set;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string p0, "newAddresses"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->currentHandleBatteryInfo:Ljava/util/HashMap;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_14
    :goto_14
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_36

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_14

    :cond_36
    new-instance p0, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_47
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_63

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    sget-object v2, Lcom/nothing/cardwidget/battery/BatteryStateManager;->currentHandleBatteryInfo:Ljava/util/HashMap;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM5/a;

    invoke-interface {p0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_47

    :cond_63
    sget-object p0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->caseBatteryInfo:Ljava/util/HashMap;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_72
    :goto_72
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_94

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_72

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_72

    :cond_94
    new-instance p0, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result p1

    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_a5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    sget-object v1, Lcom/nothing/cardwidget/battery/BatteryStateManager;->caseBatteryInfo:Ljava/util/HashMap;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a5

    :cond_c1
    return-void
.end method

.method public final earProductsOnCombine(LM5/a;)LM5/a;
    .registers 24

    move-object/from16 v0, p1

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, LM5/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x10501908

    const/4 v4, -0x1

    if-eq v2, v3, :cond_a8

    const v3, -0x4bbb681

    if-eq v2, v3, :cond_2b

    const v3, 0x52a7f2ca

    if-eq v2, v3, :cond_21

    goto/16 :goto_b7

    :cond_21
    const-string v2, "NOTHINGX_DEVICE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b7

    goto/16 :goto_b1

    :cond_2b
    const-string v2, "FASTPAIR_DEVICE"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_35

    goto/16 :goto_b7

    :cond_35
    invoke-static {v0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerViewKt;->isSingleBattery(LM5/a;)Z

    move-result v1

    if-eqz v1, :cond_3d

    goto/16 :goto_b7

    :cond_3d
    invoke-virtual {v0}, LM5/a;->j()I

    move-result v1

    if-eq v1, v4, :cond_57

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v1

    if-eq v1, v4, :cond_57

    invoke-virtual {v0}, LM5/a;->j()I

    move-result v1

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_55
    move v6, v1

    goto :goto_6d

    :cond_57
    invoke-virtual {v0}, LM5/a;->j()I

    move-result v1

    if-ne v1, v4, :cond_68

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v1

    if-eq v1, v4, :cond_68

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v1

    goto :goto_55

    :cond_68
    invoke-virtual {v0}, LM5/a;->j()I

    move-result v1

    goto :goto_55

    :goto_6d
    new-instance v2, LM5/a;

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, LM5/a;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LM5/a;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, LM5/a;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, LM5/a;->d()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, LM5/a;->c()I

    move-result v9

    invoke-virtual {v0}, LM5/a;->j()I

    move-result v10

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v11

    invoke-virtual {v0}, LM5/a;->o()Z

    move-result v12

    invoke-virtual {v0}, LM5/a;->f()J

    move-result-wide v13

    invoke-virtual {v0}, LM5/a;->i()Ljava/util/List;

    move-result-object v18

    const/16 v19, 0x3800

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v2 .. v20}, LM5/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIZJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/h;)V

    return-object v2

    :cond_a8
    const-string v2, "AIRPODS"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b1

    goto :goto_b7

    :cond_b1
    :goto_b1
    invoke-static {v0}, Lcom/nothing/cardwidget/battery/view/BatteryContainerViewKt;->isSingleBattery(LM5/a;)Z

    move-result v1

    if-eqz v1, :cond_b8

    :cond_b7
    :goto_b7
    return-object v0

    :cond_b8
    invoke-virtual {v0}, LM5/a;->j()I

    move-result v1

    if-eq v1, v4, :cond_d8

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v1

    if-eq v1, v4, :cond_d8

    invoke-virtual {v0}, LM5/a;->j()I

    move-result v1

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {v0}, LM5/a;->i()Ljava/util/List;

    move-result-object v2

    :goto_d4
    move v7, v1

    move-object/from16 v19, v2

    goto :goto_f6

    :cond_d8
    invoke-virtual {v0}, LM5/a;->j()I

    move-result v1

    if-ne v1, v4, :cond_ed

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v1

    if-eq v1, v4, :cond_ed

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v1

    invoke-virtual {v0}, LM5/a;->n()Ljava/util/List;

    move-result-object v2

    goto :goto_d4

    :cond_ed
    invoke-virtual {v0}, LM5/a;->j()I

    move-result v1

    invoke-virtual {v0}, LM5/a;->k()Ljava/util/List;

    move-result-object v2

    goto :goto_d4

    :goto_f6
    new-instance v3, LM5/a;

    invoke-virtual {v0}, LM5/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, LM5/a;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, LM5/a;->g()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, LM5/a;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, LM5/a;->d()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, LM5/a;->c()I

    move-result v10

    invoke-virtual {v0}, LM5/a;->j()I

    move-result v11

    invoke-virtual {v0}, LM5/a;->m()I

    move-result v12

    invoke-virtual {v0}, LM5/a;->o()Z

    move-result v13

    invoke-virtual {v0}, LM5/a;->f()J

    move-result-wide v14

    const/16 v20, 0x3800

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v3 .. v21}, LM5/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIZJLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/h;)V

    return-object v3
.end method

.method public final getBatteryStateInfo()Ljava/util/HashMap;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;",
            ">;"
        }
    .end annotation

    sget-object p0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->batteryStateInfo:Ljava/util/HashMap;

    return-object p0
.end method

.method public final getCaseBatteryInfo()Ljava/util/HashMap;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    sget-object p0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->caseBatteryInfo:Ljava/util/HashMap;

    return-object p0
.end method

.method public final getCurrentHandleBatteryInfo()Ljava/util/HashMap;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "LM5/a;",
            ">;"
        }
    .end annotation

    sget-object p0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->currentHandleBatteryInfo:Ljava/util/HashMap;

    return-object p0
.end method

.method public final initState(LM5/a;Ljava/lang/String;)Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;
    .registers 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uniqueId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LM5/a;->c()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_17

    sget-object p1, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->INIT_IN_CASE:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    invoke-virtual {p0, p2, p1}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->setBatteryState(Ljava/lang/String;Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;)V

    return-object p1

    :cond_17
    sget-object p1, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;->NORMAL:Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    invoke-virtual {p0, p2, p1}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->setBatteryState(Ljava/lang/String;Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;)V

    return-object p1
.end method

.method public final queryBatteryState(LM5/a;Ljava/lang/String;)Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;
    .registers 3

    const-string p0, "<this>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "uniqueId"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->batteryStateInfo:Ljava/util/HashMap;

    invoke-virtual {p0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    if-nez p0, :cond_1a

    sget-object p0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->INSTANCE:Lcom/nothing/cardwidget/battery/BatteryStateManager;

    invoke-virtual {p0, p1, p2}, Lcom/nothing/cardwidget/battery/BatteryStateManager;->initState(LM5/a;Ljava/lang/String;)Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;

    move-result-object p0

    :cond_1a
    return-object p0
.end method

.method public final setBatteryState(Ljava/lang/String;Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;)V
    .registers 3

    const-string p0, "uniqueId"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "state"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/nothing/cardwidget/battery/BatteryStateManager;->batteryStateInfo:Ljava/util/HashMap;

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final setBatteryStateInfo(Ljava/util/HashMap;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/nothing/cardwidget/battery/BatteryConfig$BatteryState;",
            ">;)V"
        }
    .end annotation

    const-string p0, "<set-?>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/nothing/cardwidget/battery/BatteryStateManager;->batteryStateInfo:Ljava/util/HashMap;

    return-void
.end method

.method public final setCaseBatteryInfo(Ljava/util/HashMap;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string p0, "<set-?>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/nothing/cardwidget/battery/BatteryStateManager;->caseBatteryInfo:Ljava/util/HashMap;

    return-void
.end method

.method public final setCurrentHandleBatteryInfo(Ljava/util/HashMap;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "LM5/a;",
            ">;)V"
        }
    .end annotation

    const-string p0, "<set-?>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/nothing/cardwidget/battery/BatteryStateManager;->currentHandleBatteryInfo:Ljava/util/HashMap;

    return-void
.end method
