.class final Lu7/a$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu7/a;->g(Landroid/net/Uri;)LI8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field q:I

.field private synthetic r:Ljava/lang/Object;

.field final synthetic s:Lu7/a;

.field final synthetic t:Landroid/net/Uri;


# direct methods
.method constructor <init>(Lu7/a;Landroid/net/Uri;Lm8/e;)V
    .registers 4

    iput-object p1, p0, Lu7/a$c;->s:Lu7/a;

    iput-object p2, p0, Lu7/a$c;->t:Landroid/net/Uri;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILm8/e;)V

    return-void
.end method

.method public static synthetic s(Lu7/a;Lu7/a$c$a;)Lh8/A;
    .registers 2

    invoke-static {p0, p1}, Lu7/a$c;->v(Lu7/a;Lu7/a$c$a;)Lh8/A;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lu7/a;Lu7/a$c$a;)Lh8/A;
    .registers 2

    invoke-static {p0}, Lu7/a;->a(Lu7/a;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm8/e;)Lm8/e;
    .registers 5

    new-instance v0, Lu7/a$c;

    iget-object v1, p0, Lu7/a$c;->s:Lu7/a;

    iget-object p0, p0, Lu7/a$c;->t:Landroid/net/Uri;

    invoke-direct {v0, v1, p0, p2}, Lu7/a$c;-><init>(Lu7/a;Landroid/net/Uri;Lm8/e;)V

    iput-object p1, v0, Lu7/a$c;->r:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p1, LH8/t;

    check-cast p2, Lm8/e;

    invoke-virtual {p0, p1, p2}, Lu7/a$c;->u(LH8/t;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 9

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lu7/a$c;->q:I

    const/4 v2, 0x1

    if-eqz v1, :cond_17

    if-ne v1, v2, :cond_f

    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    goto :goto_62

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-static {p1}, Lh8/r;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lu7/a$c;->r:Ljava/lang/Object;

    check-cast p1, LH8/t;

    new-instance v1, Lu7/a$c$a;

    invoke-direct {v1, p1}, Lu7/a$c$a;-><init>(LH8/t;)V

    :try_start_23
    iget-object v3, p0, Lu7/a$c;->s:Lu7/a;

    invoke-static {v3}, Lu7/a;->a(Lu7/a;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    iget-object v4, p0, Lu7/a$c;->t:Landroid/net/Uri;

    invoke-virtual {v3, v4, v2, v1}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V
    :try_end_32
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_32} :catch_33

    goto :goto_52

    :catch_33
    move-exception v3

    iget-object v4, p0, Lu7/a$c;->s:Lu7/a;

    invoke-static {v4}, Lu7/a;->c(Lu7/a;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "observeUri register failed, msg:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lcom/nothing/wallpaper/common/log/c;->f(Ljava/lang/String;Ljava/lang/String;)V

    :goto_52
    iget-object v3, p0, Lu7/a$c;->s:Lu7/a;

    new-instance v4, Lu7/b;

    invoke-direct {v4, v3, v1}, Lu7/b;-><init>(Lu7/a;Lu7/a$c$a;)V

    iput v2, p0, Lu7/a$c;->q:I

    invoke-static {p1, v4, p0}, LH8/r;->a(LH8/t;Lv8/a;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v0, :cond_62

    return-object v0

    :cond_62
    :goto_62
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public final u(LH8/t;Lm8/e;)Ljava/lang/Object;
    .registers 3

    invoke-virtual {p0, p1, p2}, Lu7/a$c;->create(Ljava/lang/Object;Lm8/e;)Lm8/e;

    move-result-object p0

    check-cast p0, Lu7/a$c;

    sget-object p1, Lh8/A;->a:Lh8/A;

    invoke-virtual {p0, p1}, Lu7/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
