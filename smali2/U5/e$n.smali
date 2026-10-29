.class final LU5/e$n;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU5/e;->i(Ljava/lang/String;Lm8/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:LU5/e;

.field final synthetic t:Ljava/lang/String;


# direct methods
.method constructor <init>(LU5/e;Ljava/lang/String;Lm8/e;)V
    .registers 4

    iput-object p1, p0, LU5/e$n;->s:LU5/e;

    iput-object p2, p0, LU5/e$n;->t:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance v0, LU5/e$n;

    iget-object v1, p0, LU5/e$n;->s:LU5/e;

    iget-object p0, p0, LU5/e$n;->t:Ljava/lang/String;

    invoke-direct {v0, v1, p0, p2}, LU5/e$n;-><init>(LU5/e;Ljava/lang/String;Lm8/e;)V

    iput-object p1, v0, LU5/e$n;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(LF8/L;Lm8/e;)Ljava/lang/Object;
    .registers 3

    .line 1
    invoke-virtual {p0, p1, p2}, LU5/e$n;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LU5/e$n;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LU5/e$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    .line 2
    check-cast p1, LF8/L;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LU5/e$n;->invoke(LF8/L;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 7

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LU5/e$n;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_18

    if-ne v1, v2, :cond_10

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto/16 :goto_bc

    :cond_10
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_18
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LU5/e$n;->r:Ljava/lang/Object;

    check-cast p1, LF8/L;

    iget-object p1, p0, LU5/e$n;->s:LU5/e;

    iget-object v1, p0, LU5/e$n;->t:Ljava/lang/String;

    :try_start_23
    sget-object v3, Lh8/q;->r:Lh8/q$a;

    invoke-static {p1}, LU5/e;->H(LU5/e;)Lcom/google/gson/Gson;

    move-result-object p1

    const-class v3, [Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    invoke-virtual {p1, v1, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_35
    .catchall {:try_start_23 .. :try_end_35} :catchall_36

    goto :goto_41

    :catchall_36
    move-exception p1

    sget-object v1, Lh8/q;->r:Lh8/q$a;

    invoke-static {p1}, Lh8/r;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lh8/q;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_41
    invoke-static {p1}, Lh8/q;->f(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_48

    const/4 p1, 0x0

    :cond_48
    check-cast p1, [Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;

    iget-object v1, p0, LU5/e$n;->s:LU5/e;

    invoke-static {v1, p1}, LU5/e;->N(LU5/e;[Lcom/nothing/launcher/card/data/CardWidgetSimpleInfo;)Ljava/util/List;

    move-result-object p1

    iget-object v1, p0, LU5/e$n;->s:LU5/e;

    invoke-static {v1}, LU5/e;->F(LU5/e;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v4, "systemui_widget_infos"

    invoke-static {v3, v4}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, LU5/e;->Q(LU5/e;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Li8/s;->u(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_75
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_93

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh8/o;

    invoke-virtual {v4}, Lh8/o;->d()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/nothing/launcher/card/t;

    invoke-virtual {v4}, Lcom/nothing/launcher/card/t;->m()I

    move-result v4

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_75

    :cond_93
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "restoreWidgetsFromSaveState ids:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "WidgetRepository"

    invoke-static {v3, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LU5/e$n;->s:LU5/e;

    invoke-static {v1}, LU5/e;->M(LU5/e;)LI8/z;

    move-result-object v1

    iput v2, p0, LU5/e$n;->q:I

    invoke-interface {v1, p1, p0}, LI8/z;->b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_bc

    return-object v0

    :cond_bc
    :goto_bc
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
