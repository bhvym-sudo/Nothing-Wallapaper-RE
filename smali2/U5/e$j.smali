.class final LU5/e$j;
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

    iput-object p1, p0, LU5/e$j;->s:LU5/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static synthetic s(LU5/e;LU5/e$j$a;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, LU5/e$j;->w(LU5/e;LU5/e$j$a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u(LU5/e;LH8/t;)V
    .registers 2

    invoke-static {p0, p1}, LU5/e$j;->x(LU5/e;LH8/t;)V

    return-void
.end method

.method private static final w(LU5/e;LU5/e$j$a;)Lh8/A;
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
    .registers 4

    invoke-static {p0}, LU5/e;->F(LU5/e;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string v0, "lock_screen_expand_widget_enable"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    if-eqz p0, :cond_12

    const/4 v1, 0x1

    :cond_12
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p1, p0}, LH8/w;->p(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 4

    new-instance v0, LU5/e$j;

    iget-object p0, p0, LU5/e$j;->s:LU5/e;

    invoke-direct {v0, p0, p2}, LU5/e$j;-><init>(LU5/e;Lm8/e;)V

    iput-object p1, v0, LU5/e$j;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LH8/t;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, LU5/e$j;->v(LH8/t;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 8

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LU5/e$j;->q:I

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

    iget-object p1, p0, LU5/e$j;->r:Ljava/lang/Object;

    check-cast p1, LH8/t;

    new-instance v1, LU5/e$j$a;

    iget-object v3, p0, LU5/e$j;->s:LU5/e;

    invoke-direct {v1, v3, p1}, LU5/e$j$a;-><init>(LU5/e;LH8/t;)V

    iget-object v3, p0, LU5/e$j;->s:LU5/e;

    invoke-static {v3}, LU5/e;->F(LU5/e;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v4, "lock_screen_expand_widget_enable"

    invoke-static {v4}, Landroid/provider/Settings$Secure;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5, v1}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    iget-object v3, p0, LU5/e$j;->s:LU5/e;

    invoke-static {v3, p1}, LU5/e$j;->x(LU5/e;LH8/t;)V

    iget-object v3, p0, LU5/e$j;->s:LU5/e;

    new-instance v4, LU5/g;

    invoke-direct {v4, v3, v1}, LU5/g;-><init>(LU5/e;LU5/e$j$a;)V

    iput v2, p0, LU5/e$j;->q:I

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

    invoke-virtual {p0, p1, p2}, LU5/e$j;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, LU5/e$j;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, LU5/e$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
