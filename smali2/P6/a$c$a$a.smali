.class final LP6/a$c$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LP6/a$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LP6/a;

.field final synthetic b:LF8/l;

.field final synthetic c:Lg3/v;

.field final synthetic d:Landroid/app/WallpaperManager;


# direct methods
.method constructor <init>(LP6/a;LF8/l;Lg3/v;Landroid/app/WallpaperManager;)V
    .registers 5

    iput-object p1, p0, LP6/a$c$a$a;->a:LP6/a;

    iput-object p2, p0, LP6/a$c$a$a;->b:LF8/l;

    iput-object p3, p0, LP6/a$c$a$a;->c:Lg3/v;

    iput-object p4, p0, LP6/a$c$a$a;->d:Landroid/app/WallpaperManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lg3/x;Lg3/x;I)V
    .registers 11

    iget-object p3, p0, LP6/a$c$a$a;->a:LP6/a;

    invoke-static {p3}, LP6/a;->e(LP6/a;)Landroidx/lifecycle/x;

    move-result-object p3

    invoke-static {p3}, Landroidx/lifecycle/y;->a(Landroidx/lifecycle/x;)Landroidx/lifecycle/r;

    move-result-object v0

    new-instance v3, LP6/a$c$a$a$a;

    iget-object p3, p0, LP6/a$c$a$a;->c:Lg3/v;

    iget-object v1, p0, LP6/a$c$a$a;->a:LP6/a;

    iget-object v2, p0, LP6/a$c$a$a;->d:Landroid/app/WallpaperManager;

    const/4 v6, 0x0

    invoke-direct {v3, p3, v1, v2, v6}, LP6/a$c$a$a$a;-><init>(Lg3/v;LP6/a;Landroid/app/WallpaperManager;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    iget-object p0, p0, LP6/a$c$a$a;->b:LF8/l;

    if-nez p1, :cond_22

    move-object p1, p2

    :cond_22
    invoke-interface {p0, p1, v6}, LF8/l;->k(Ljava/lang/Object;Lv8/l;)V

    return-void
.end method
