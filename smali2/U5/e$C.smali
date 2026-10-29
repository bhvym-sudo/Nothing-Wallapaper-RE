.class final LU5/e$C;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU5/e;-><init>(Landroid/content/Context;LF8/L;LF8/I;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:LU5/e;


# direct methods
.method constructor <init>(LU5/e;Lm8/e;)V
    .registers 3

    iput-object p1, p0, LU5/e$C;->s:LU5/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static synthetic s(LU5/e;LU5/e$C$a;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LU5/e$C;->w(LU5/e;LU5/e$C$a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u(LU5/e;LH8/t;)V
    .registers 2

    invoke-static {p0, p1}, LU5/e$C;->x(LU5/e;LH8/t;)V

    return-void
.end method

.method private static final w(LU5/e;LU5/e$C$a;)Lh8/A;
    .registers 2

    invoke-static {p0}, LU5/e;->F(LU5/e;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method private static final x(LU5/e;LH8/t;)V
    .registers 7

    invoke-static {p0}, LU5/e;->F(LU5/e;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "systemui_widget_infos"

    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, LU5/e;->E(LU5/e;)Z

    move-result v1

    invoke-static {p0}, LU5/e;->I(LU5/e;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "send canUpdate:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " newInfo:"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " originInfo:"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "WidgetRepository"

    invoke-static {v2, v1}, Lcom/nothing/wallpaper/common/log/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, LU5/e;->E(LU5/e;)Z

    move-result v1

    if-eqz v1, :cond_58

    if-eqz v0, :cond_4e

    invoke-static {p0}, LU5/e;->I(LU5/e;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_58

    :cond_4e
    invoke-static {p0, v0}, LU5/e;->Q(LU5/e;Ljava/lang/String;)V

    invoke-static {p0, v0}, LU5/e;->O(LU5/e;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p1, p0}, LH8/w;->p(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_58
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LU5/e$C;

    iget-object p0, p0, LU5/e$C;->s:LU5/e;

    invoke-direct {v0, p0, p2}, LU5/e$C;-><init>(LU5/e;Lm8/e;)V

    iput-object p1, v0, LU5/e$C;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LH8/t;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LU5/e$C;->v(LH8/t;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LU5/e$C;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_4e

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LU5/e$C;->r:Ljava/lang/Object;

    check-cast p1, LH8/t;

    new-instance v1, LU5/e$C$a;

    iget-object v3, p0, LU5/e$C;->s:LU5/e;

    invoke-direct {v1, v3, p1}, LU5/e$C$a;-><init>(LU5/e;LH8/t;)V

    iget-object v3, p0, LU5/e$C;->s:LU5/e;

    invoke-static {v3}, LU5/e;->F(LU5/e;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v4, "systemui_widget_infos"

    invoke-static {v4}, Landroid/provider/Settings$Secure;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5, v1}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    iget-object v3, p0, LU5/e$C;->s:LU5/e;

    invoke-static {v3, p1}, LU5/e$C;->x(LU5/e;LH8/t;)V

    iget-object v3, p0, LU5/e$C;->s:LU5/e;

    new-instance v4, LU5/h;

    invoke-direct {v4, v3, v1}, LU5/h;-><init>(LU5/e;LU5/e$C$a;)V

    iput v2, p0, LU5/e$C;->q:I

    invoke-static {p1, v4, p0}, LH8/r;->a(LH8/t;Lv8/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_4e

    return-object v0

    :cond_4e
    :goto_4e
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final v(LH8/t;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, LU5/e$C;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LU5/e$C;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LU5/e$C;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
