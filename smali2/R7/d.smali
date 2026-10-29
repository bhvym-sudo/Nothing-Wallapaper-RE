.class public final LR7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/L;


# static fields
.field public static final r:LR7/d;


# instance fields
.field private final synthetic q:LF8/L;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LR7/d;

    invoke-direct {v0}, LR7/d;-><init>()V

    sput-object v0, LR7/d;->r:LR7/d;

    return-void
.end method

.method private constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, LF8/T0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object v0

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v1

    invoke-interface {v0, v1}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object v0

    invoke-static {v0}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object v0

    iput-object v0, p0, LR7/d;->q:LF8/L;

    return-void
.end method


# virtual methods
.method public final a(JJI)V
    .registers 7

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v0, "subject"

    invoke-virtual {p0, v0, p1, p2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string p1, "style"

    invoke-virtual {p0, p1, p3, p4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string p1, "failed"

    invoke-virtual {p0, p1, p5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object p1, LR7/c;->a:LR7/c;

    const-string p2, "wallpaper_ai_result_failed"

    invoke-virtual {p1, p2, p0}, LR7/c;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final b(IJJ)V
    .registers 7

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v0, "subject"

    invoke-virtual {p0, v0, p2, p3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string p2, "style"

    invoke-virtual {p0, p2, p4, p5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const/4 p2, 0x1

    const-string p3, "wallpaper_ai_create"

    if-eq p1, p2, :cond_26

    const/4 p2, 0x2

    if-eq p1, p2, :cond_24

    const/4 p2, 0x3

    if-eq p1, p2, :cond_21

    const/4 p2, 0x4

    if-eq p1, p2, :cond_1e

    goto :goto_26

    :cond_1e
    const-string p3, "wallpaper_ai_result_succeed"

    goto :goto_26

    :cond_21
    const-string p3, "wallpaper_ai_create_ram"

    goto :goto_26

    :cond_24
    const-string p3, "wallpaper_ai_recreate"

    :cond_26
    :goto_26
    sget-object p1, LR7/c;->a:LR7/c;

    invoke-virtual {p1, p3, p0}, LR7/c;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final c(I)V
    .registers 3

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v0, "result"

    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object p1, LR7/c;->a:LR7/c;

    const-string v0, "wallpaper_ai_load_prompt"

    invoke-virtual {p1, v0, p0}, LR7/c;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final d(J)V
    .registers 4

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v0, "tap"

    invoke-virtual {p0, v0, p1, p2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    sget-object p1, LR7/c;->a:LR7/c;

    const-string p2, "wallpaper_ai_save"

    invoke-virtual {p1, p2, p0}, LR7/c;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final e(Landroid/content/Context;Lg3/x;Ljava/util/List;ZI)V
    .registers 12

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "effect"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_c7

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    instance-of v1, p2, Lg3/i;

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_1f

    move-object v1, p2

    check-cast v1, Lg3/i;

    iget v1, v1, Lg3/i;->z:I

    if-eq v1, v4, :cond_25

    :cond_1f
    invoke-static {p2, p1}, LG6/e;->r(Lg3/x;Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_27

    :cond_25
    move p1, v4

    goto :goto_6e

    :cond_27
    sget-object p1, Lcom/nothing/wallpaper/NTPickerApplication;->q:Lcom/nothing/wallpaper/NTPickerApplication$a;

    invoke-virtual {p1}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object v1

    invoke-static {p2, v1}, LG6/e;->p(Lg3/x;Landroid/content/Context;)Z

    move-result v1

    const-string v5, "name"

    if-eqz v1, :cond_47

    invoke-virtual {p2}, Lg3/x;->r()Ljava/lang/String;

    move-result-object p1

    const-string p2, "getWallpaperId(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LR7/e;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v5, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    move p1, v3

    goto :goto_6e

    :cond_47
    invoke-virtual {p1}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object v1

    invoke-static {p2, v1}, LG6/e;->l(Lg3/x;Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_5a

    invoke-virtual {p2}, Lg3/x;->r()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v5, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    move p1, v2

    goto :goto_6e

    :cond_5a
    invoke-virtual {p1}, Lcom/nothing/wallpaper/NTPickerApplication$a;->a()Landroid/app/Application;

    move-result-object p1

    invoke-static {p2, p1}, LG6/e;->o(Lg3/x;Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_6d

    invoke-virtual {p2}, Lg3/x;->r()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v5, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x5

    goto :goto_6e

    :cond_6d
    const/4 p1, 0x4

    :goto_6e
    const-string p2, "type"

    invoke-virtual {v0, p2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_7e
    :goto_7e
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_a1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lk7/a;

    sget-object v1, Lk7/a;->r:Lk7/a;

    if-ne p3, v1, :cond_95

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_95
    sget-object v1, Lk7/a;->q:Lk7/a;

    if-ne p3, v1, :cond_7e

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7e

    :cond_a1
    if-eqz p4, :cond_aa

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_aa
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_b3

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_b3
    if-eqz p5, :cond_ba

    if-eq p5, v4, :cond_b8

    goto :goto_bb

    :cond_b8
    move v2, v4

    goto :goto_bb

    :cond_ba
    move v2, v3

    :goto_bb
    const-string p0, "screen"

    invoke-virtual {v0, p0, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object p0, LR7/c;->a:LR7/c;

    const-string p1, "wallpaper_apply"

    invoke-virtual {p0, p1, v0}, LR7/c;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_c7
    return-void
.end method

.method public final f()V
    .registers 3

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v0, "enter"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, LR7/c;->a:LR7/c;

    const-string v1, "customisation_enter"

    invoke-virtual {v0, v1, p0}, LR7/c;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final g(ZLjava/lang/String;Ljava/util/List;[Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;LN1/a;LA7/a;)V
    .registers 23

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    const-string v5, "clockId"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "shortcutIds"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "widgets"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v2

    const/4 v6, 0x0

    move v7, v6

    move v8, v7

    move v9, v8

    move v10, v9

    move v11, v10

    :goto_20
    const/4 v12, 0x1

    if-ge v7, v5, :cond_4f

    aget-object v13, v2, v7

    invoke-virtual {v13}, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->getSpanX()I

    move-result v14

    const/4 v15, 0x2

    if-eq v14, v12, :cond_3e

    if-eq v14, v15, :cond_2f

    goto :goto_4c

    :cond_2f
    invoke-virtual {v13}, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->getSpanY()I

    move-result v13

    if-eq v13, v12, :cond_3b

    if-eq v13, v15, :cond_38

    goto :goto_4c

    :cond_38
    add-int/lit8 v8, v8, 0x1

    goto :goto_4c

    :cond_3b
    add-int/lit8 v9, v9, 0x1

    goto :goto_4c

    :cond_3e
    invoke-virtual {v13}, Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;->getSpanY()I

    move-result v13

    if-eq v13, v12, :cond_4a

    if-eq v13, v15, :cond_47

    goto :goto_4c

    :cond_47
    add-int/lit8 v10, v10, 0x1

    goto :goto_4c

    :cond_4a
    add-int/lit8 v11, v11, 0x1

    :goto_4c
    add-int/lit8 v7, v7, 0x1

    goto :goto_20

    :cond_4f
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v7, "widget_area"

    move/from16 v13, p1

    invoke-virtual {v5, v7, v13}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v7, "clock"

    invoke-virtual {v5, v7, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "lockscreen_shortcut"

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "widgetsCount"

    array-length v1, v2

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "icons_l"

    invoke-virtual {v5, v0, v8}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "icons_m_l"

    invoke-virtual {v5, v0, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "icons_m_w"

    invoke-virtual {v5, v0, v10}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "icons_s"

    invoke-virtual {v5, v0, v11}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    if-eqz v3, :cond_8f

    sget-object v0, LN1/a;->r:LN1/a;

    if-ne v3, v0, :cond_89

    move v0, v12

    goto :goto_8a

    :cond_89
    move v0, v6

    :goto_8a
    const-string v1, "clock_size"

    invoke-virtual {v5, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_8f
    if-eqz v4, :cond_9b

    sget-object v0, LA7/a;->r:LA7/a;

    if-ne v4, v0, :cond_96

    move v6, v12

    :cond_96
    const-string v0, "clock_alignment"

    invoke-virtual {v5, v0, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_9b
    sget-object v0, LR7/c;->a:LR7/c;

    const-string v1, "lockscreen_customise"

    invoke-virtual {v0, v1, v5}, LR7/c;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final h(I)V
    .registers 3

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v0, "entrance"

    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    sget-object p1, LR7/c;->a:LR7/c;

    const-string v0, "lockscreen_customise"

    invoke-virtual {p1, v0, p0}, LR7/c;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final i()V
    .registers 3

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v0, "wallpaper"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, LR7/c;->a:LR7/c;

    const-string v1, "lockscreen_customise"

    invoke-virtual {v0, v1, p0}, LR7/c;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final j()V
    .registers 3

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v0, "tap"

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, LR7/c;->a:LR7/c;

    const-string v1, "wallpaper_more_tap"

    invoke-virtual {v0, v1, p0}, LR7/c;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final k(Ljava/lang/String;)V
    .registers 3

    const-string p0, "wallpaperId"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string v0, "tap"

    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, LR7/c;->a:LR7/c;

    const-string v0, "wallpaper_sug_tap"

    invoke-virtual {p1, v0, p0}, LR7/c;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final l(Ljava/lang/String;Lcom/nothing/launcher/card/t;I)V
    .registers 6

    const-string p0, "eventType"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "info"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-gtz p3, :cond_d

    goto :goto_6f

    :cond_d
    invoke-virtual {p2}, Lcom/nothing/launcher/card/t;->d()Landroid/content/ComponentName;

    move-result-object p0

    if-eqz p0, :cond_6f

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "widget_add"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_26

    const-string v1, "addway"

    invoke-virtual {v0, v1, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_2b

    :cond_26
    const-string v1, "removeway"

    invoke-virtual {v0, v1, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :goto_2b
    const-string p3, "package"

    invoke-virtual {p0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p3, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "provider"

    invoke-virtual {p0}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p3, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "widget_id"

    invoke-virtual {p2}, Lcom/nothing/launcher/card/t;->m()I

    move-result p3

    invoke-virtual {v0, p0, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "host"

    const-string p3, "Lockscreen"

    invoke-virtual {v0, p0, p3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget p0, p2, LC2/b;->u:I

    iget p2, p2, LC2/b;->v:I

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "x"

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p2, "size"

    invoke-virtual {v0, p2, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, LR7/c;->a:LR7/c;

    invoke-virtual {p0, p1, v0}, LR7/c;->b(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_6f
    :goto_6f
    return-void
.end method

.method public w0()Lm8/i;
    .registers 1

    iget-object p0, p0, LR7/d;->q:LF8/L;

    invoke-interface {p0}, LF8/L;->w0()Lm8/i;

    move-result-object p0

    return-object p0
.end method
