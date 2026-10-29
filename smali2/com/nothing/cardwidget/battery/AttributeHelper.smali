.class public final Lcom/nothing/cardwidget/battery/AttributeHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private animBatteryEnter:Landroid/animation/Animator;

.field private animBatteryExit:Landroid/animation/Animator;

.field private animChargingEnter:Landroid/animation/Animator;

.field private animChargingExit:Landroid/animation/Animator;

.field private animDeviceEnter:Landroid/animation/Animator;

.field private animDeviceExit:Landroid/animation/Animator;

.field private aodPermissionDrawable:Landroid/graphics/drawable/Drawable;

.field private batteryLevelTvColor:Ljava/lang/Integer;

.field private chargingDrawable:Landroid/graphics/drawable/Drawable;

.field private isAod:Ljava/lang/Boolean;

.field private lowBatteryLevelColor:Ljava/lang/Integer;

.field private normalLevelColor:Ljava/lang/Integer;

.field private permissionBgDrawable:Landroid/graphics/drawable/Drawable;

.field private permissionStr:Ljava/lang/String;

.field private permissionTvColor:Ljava/lang/Integer;

.field private powerSaveDrawable:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final getAnimBatteryEnter()Landroid/animation/Animator;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animBatteryEnter:Landroid/animation/Animator;

    return-object p0
.end method

.method public final getAnimBatteryExit()Landroid/animation/Animator;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animBatteryExit:Landroid/animation/Animator;

    return-object p0
.end method

.method public final getAnimChargingEnter()Landroid/animation/Animator;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animChargingEnter:Landroid/animation/Animator;

    return-object p0
.end method

.method public final getAnimChargingExit()Landroid/animation/Animator;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animChargingExit:Landroid/animation/Animator;

    return-object p0
.end method

.method public final getAnimDeviceEnter()Landroid/animation/Animator;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animDeviceEnter:Landroid/animation/Animator;

    return-object p0
.end method

.method public final getAnimDeviceExit()Landroid/animation/Animator;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animDeviceExit:Landroid/animation/Animator;

    return-object p0
.end method

.method public final getAodPermissionDrawable()Landroid/graphics/drawable/Drawable;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->aodPermissionDrawable:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public final getBatteryLevelTvColor()Ljava/lang/Integer;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->batteryLevelTvColor:Ljava/lang/Integer;

    return-object p0
.end method

.method public final getChargingDrawable()Landroid/graphics/drawable/Drawable;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->chargingDrawable:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public final getLowBatteryLevelColor()Ljava/lang/Integer;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->lowBatteryLevelColor:Ljava/lang/Integer;

    return-object p0
.end method

.method public final getNormalLevelColor()Ljava/lang/Integer;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->normalLevelColor:Ljava/lang/Integer;

    return-object p0
.end method

.method public final getPermissionBgDrawable()Landroid/graphics/drawable/Drawable;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->permissionBgDrawable:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public final getPermissionStr()Ljava/lang/String;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->permissionStr:Ljava/lang/String;

    return-object p0
.end method

.method public final getPermissionTvColor()Ljava/lang/Integer;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->permissionTvColor:Ljava/lang/Integer;

    return-object p0
.end method

.method public final getPowerSaveDrawable()Landroid/graphics/drawable/Drawable;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->powerSaveDrawable:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public final getRemoteResource(Landroid/util/AttributeSet;Landroid/content/Context;)V
    .registers 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, LJ5/a;->a:LJ5/a$a;

    const-string v4, "permissionStr"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->permissionStr:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v6

    const-string v4, "isAod"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->isAod:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v7

    const-string v4, "animChargingEnter"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->animChargingEnter:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v8

    const-string v4, "animChargingExit"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->animChargingExit:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v9

    const-string v4, "animDeviceEnter"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->animDeviceEnter:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v10

    const-string v4, "animDeviceExit"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->animDeviceExit:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v11

    const-string v4, "animBatteryEnter"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->animBatteryEnter:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v12

    const-string v4, "animBatteryExit"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->animBatteryExit:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v13

    const-string v4, "aodPermissionDrawable"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->aodPermissionDrawable:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v14

    const-string v4, "chargingDrawable"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->chargingDrawable:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v15

    const-string v4, "powerSaveDrawable"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->powerSaveDrawable:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v16

    const-string v4, "permissionBgDrawable"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->permissionBgDrawable:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v17

    const-string v4, "normalLevelColor"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->normalLevelColor:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v18

    const-string v4, "lowBatteryLevelColor"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->lowBatteryLevelColor:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v19

    const-string v4, "batteryLevelTvColor"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->batteryLevelTvColor:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v20

    const-string v4, "permissionTvColor"

    invoke-virtual {v3, v2, v4}, LJ5/a$a;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    sget v5, Lcom/nothing/cardwidget/R$attr;->permissionTvColor:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v21

    filled-new-array/range {v6 .. v21}, [Lh8/o;

    move-result-object v4

    invoke-static {v4}, Li8/N;->i([Lh8/o;)Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, LJ5/a$a;->k(Landroid/util/AttributeSet;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_161
    :goto_161
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_329

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    sget v6, Lcom/nothing/cardwidget/R$attr;->permissionStr:I

    const/4 v7, 0x0

    if-ne v5, v6, :cond_191

    if-eqz v1, :cond_18e

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->j(Landroid/content/Context;Landroid/util/AttributeSet;I)Ljava/lang/String;

    move-result-object v7

    :cond_18e
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->permissionStr:Ljava/lang/String;

    goto :goto_161

    :cond_191
    sget v6, Lcom/nothing/cardwidget/R$attr;->isAod:I

    if-ne v5, v6, :cond_1af

    if-eqz v1, :cond_1ac

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    const/4 v6, 0x0

    invoke-virtual {v5, v2, v1, v4, v6}, LJ5/a$a;->d(Landroid/content/Context;Landroid/util/AttributeSet;IZ)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    :cond_1ac
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod:Ljava/lang/Boolean;

    goto :goto_161

    :cond_1af
    sget v6, Lcom/nothing/cardwidget/R$attr;->animChargingEnter:I

    if-ne v5, v6, :cond_1c8

    if-eqz v1, :cond_1c5

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->b(Landroid/content/Context;Landroid/util/AttributeSet;I)Landroid/animation/Animator;

    move-result-object v7

    :cond_1c5
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animChargingEnter:Landroid/animation/Animator;

    goto :goto_161

    :cond_1c8
    sget v6, Lcom/nothing/cardwidget/R$attr;->animChargingExit:I

    if-ne v5, v6, :cond_1e1

    if-eqz v1, :cond_1de

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->b(Landroid/content/Context;Landroid/util/AttributeSet;I)Landroid/animation/Animator;

    move-result-object v7

    :cond_1de
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animChargingExit:Landroid/animation/Animator;

    goto :goto_161

    :cond_1e1
    sget v6, Lcom/nothing/cardwidget/R$attr;->animDeviceEnter:I

    if-ne v5, v6, :cond_1fb

    if-eqz v1, :cond_1f7

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->b(Landroid/content/Context;Landroid/util/AttributeSet;I)Landroid/animation/Animator;

    move-result-object v7

    :cond_1f7
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animDeviceEnter:Landroid/animation/Animator;

    goto/16 :goto_161

    :cond_1fb
    sget v6, Lcom/nothing/cardwidget/R$attr;->animDeviceExit:I

    if-ne v5, v6, :cond_215

    if-eqz v1, :cond_211

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->b(Landroid/content/Context;Landroid/util/AttributeSet;I)Landroid/animation/Animator;

    move-result-object v7

    :cond_211
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animDeviceExit:Landroid/animation/Animator;

    goto/16 :goto_161

    :cond_215
    sget v6, Lcom/nothing/cardwidget/R$attr;->animBatteryEnter:I

    if-ne v5, v6, :cond_22f

    if-eqz v1, :cond_22b

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->b(Landroid/content/Context;Landroid/util/AttributeSet;I)Landroid/animation/Animator;

    move-result-object v7

    :cond_22b
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animBatteryEnter:Landroid/animation/Animator;

    goto/16 :goto_161

    :cond_22f
    sget v6, Lcom/nothing/cardwidget/R$attr;->animBatteryExit:I

    if-ne v5, v6, :cond_249

    if-eqz v1, :cond_245

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->b(Landroid/content/Context;Landroid/util/AttributeSet;I)Landroid/animation/Animator;

    move-result-object v7

    :cond_245
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animBatteryExit:Landroid/animation/Animator;

    goto/16 :goto_161

    :cond_249
    sget v6, Lcom/nothing/cardwidget/R$attr;->aodPermissionDrawable:I

    if-ne v5, v6, :cond_263

    if-eqz v1, :cond_25f

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->g(Landroid/content/Context;Landroid/util/AttributeSet;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    :cond_25f
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->aodPermissionDrawable:Landroid/graphics/drawable/Drawable;

    goto/16 :goto_161

    :cond_263
    sget v6, Lcom/nothing/cardwidget/R$attr;->chargingDrawable:I

    if-ne v5, v6, :cond_27d

    if-eqz v1, :cond_279

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->g(Landroid/content/Context;Landroid/util/AttributeSet;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    :cond_279
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->chargingDrawable:Landroid/graphics/drawable/Drawable;

    goto/16 :goto_161

    :cond_27d
    sget v6, Lcom/nothing/cardwidget/R$attr;->powerSaveDrawable:I

    if-ne v5, v6, :cond_297

    if-eqz v1, :cond_293

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->g(Landroid/content/Context;Landroid/util/AttributeSet;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    :cond_293
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->powerSaveDrawable:Landroid/graphics/drawable/Drawable;

    goto/16 :goto_161

    :cond_297
    sget v6, Lcom/nothing/cardwidget/R$attr;->permissionBgDrawable:I

    if-ne v5, v6, :cond_2b1

    if-eqz v1, :cond_2ad

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->g(Landroid/content/Context;Landroid/util/AttributeSet;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    :cond_2ad
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->permissionBgDrawable:Landroid/graphics/drawable/Drawable;

    goto/16 :goto_161

    :cond_2b1
    sget v6, Lcom/nothing/cardwidget/R$attr;->normalLevelColor:I

    if-ne v5, v6, :cond_2cf

    if-eqz v1, :cond_2cb

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->e(Landroid/content/Context;Landroid/util/AttributeSet;I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :cond_2cb
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->normalLevelColor:Ljava/lang/Integer;

    goto/16 :goto_161

    :cond_2cf
    sget v6, Lcom/nothing/cardwidget/R$attr;->lowBatteryLevelColor:I

    if-ne v5, v6, :cond_2ed

    if-eqz v1, :cond_2e9

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->e(Landroid/content/Context;Landroid/util/AttributeSet;I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :cond_2e9
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->lowBatteryLevelColor:Ljava/lang/Integer;

    goto/16 :goto_161

    :cond_2ed
    sget v6, Lcom/nothing/cardwidget/R$attr;->batteryLevelTvColor:I

    if-ne v5, v6, :cond_30b

    if-eqz v1, :cond_307

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->e(Landroid/content/Context;Landroid/util/AttributeSet;I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :cond_307
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->batteryLevelTvColor:Ljava/lang/Integer;

    goto/16 :goto_161

    :cond_30b
    sget v6, Lcom/nothing/cardwidget/R$attr;->permissionTvColor:I

    if-ne v5, v6, :cond_161

    if-eqz v1, :cond_325

    sget-object v5, LJ5/a;->a:LJ5/a$a;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual {v5, v2, v1, v4}, LJ5/a$a;->e(Landroid/content/Context;Landroid/util/AttributeSet;I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :cond_325
    iput-object v7, v0, Lcom/nothing/cardwidget/battery/AttributeHelper;->permissionTvColor:Ljava/lang/Integer;

    goto/16 :goto_161

    :cond_329
    return-void
.end method

.method public final isAod()Ljava/lang/Boolean;
    .registers 1

    iget-object p0, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final setAnimBatteryEnter(Landroid/animation/Animator;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animBatteryEnter:Landroid/animation/Animator;

    return-void
.end method

.method public final setAnimBatteryExit(Landroid/animation/Animator;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animBatteryExit:Landroid/animation/Animator;

    return-void
.end method

.method public final setAnimChargingEnter(Landroid/animation/Animator;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animChargingEnter:Landroid/animation/Animator;

    return-void
.end method

.method public final setAnimChargingExit(Landroid/animation/Animator;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animChargingExit:Landroid/animation/Animator;

    return-void
.end method

.method public final setAnimDeviceEnter(Landroid/animation/Animator;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animDeviceEnter:Landroid/animation/Animator;

    return-void
.end method

.method public final setAnimDeviceExit(Landroid/animation/Animator;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->animDeviceExit:Landroid/animation/Animator;

    return-void
.end method

.method public final setAod(Ljava/lang/Boolean;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->isAod:Ljava/lang/Boolean;

    return-void
.end method

.method public final setAodPermissionDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->aodPermissionDrawable:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public final setBatteryLevelTvColor(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->batteryLevelTvColor:Ljava/lang/Integer;

    return-void
.end method

.method public final setChargingDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->chargingDrawable:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public final setLowBatteryLevelColor(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->lowBatteryLevelColor:Ljava/lang/Integer;

    return-void
.end method

.method public final setNormalLevelColor(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->normalLevelColor:Ljava/lang/Integer;

    return-void
.end method

.method public final setPermissionBgDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->permissionBgDrawable:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public final setPermissionStr(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->permissionStr:Ljava/lang/String;

    return-void
.end method

.method public final setPermissionTvColor(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->permissionTvColor:Ljava/lang/Integer;

    return-void
.end method

.method public final setPowerSaveDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    iput-object p1, p0, Lcom/nothing/cardwidget/battery/AttributeHelper;->powerSaveDrawable:Landroid/graphics/drawable/Drawable;

    return-void
.end method
