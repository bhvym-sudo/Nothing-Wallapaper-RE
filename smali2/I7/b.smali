.class public final LI7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LI7/f;

.field private final b:LI7/a;

.field private final c:LI7/c;

.field private final d:LI7/d;


# direct methods
.method public constructor <init>(LI7/f;LI7/a;LI7/c;LI7/d;)V
    .registers 6

    const-string v0, "widgetStrategy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clockStrategy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shortcutStrategy"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallpaperStrategy"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI7/b;->a:LI7/f;

    iput-object p2, p0, LI7/b;->b:LI7/a;

    iput-object p3, p0, LI7/b;->c:LI7/c;

    iput-object p4, p0, LI7/b;->d:LI7/d;

    return-void
.end method


# virtual methods
.method public final a()Z
    .registers 2

    iget-object v0, p0, LI7/b;->a:LI7/f;

    invoke-virtual {v0}, LI7/f;->c()Z

    move-result v0

    if-nez v0, :cond_23

    iget-object v0, p0, LI7/b;->b:LI7/a;

    invoke-virtual {v0}, LI7/a;->a()Z

    move-result v0

    if-nez v0, :cond_23

    iget-object v0, p0, LI7/b;->c:LI7/c;

    invoke-virtual {v0}, LI7/c;->a()Z

    move-result v0

    if-nez v0, :cond_23

    iget-object p0, p0, LI7/b;->d:LI7/d;

    invoke-virtual {p0}, LI7/d;->h()Z

    move-result p0

    if-eqz p0, :cond_21

    goto :goto_23

    :cond_21
    const/4 p0, 0x0

    return p0

    :cond_23
    :goto_23
    const/4 p0, 0x1

    return p0
.end method

.method public final b()Z
    .registers 1

    iget-object p0, p0, LI7/b;->d:LI7/d;

    invoke-virtual {p0}, LI7/d;->g()Z

    move-result p0

    return p0
.end method

.method public final c()V
    .registers 2

    iget-object v0, p0, LI7/b;->a:LI7/f;

    invoke-virtual {v0}, LI7/f;->e()V

    iget-object v0, p0, LI7/b;->b:LI7/a;

    invoke-virtual {v0}, LI7/a;->b()V

    iget-object v0, p0, LI7/b;->c:LI7/c;

    invoke-virtual {v0}, LI7/c;->b()V

    iget-object p0, p0, LI7/b;->d:LI7/d;

    invoke-virtual {p0}, LI7/d;->i()V

    return-void
.end method

.method public final d()V
    .registers 2

    iget-object v0, p0, LI7/b;->a:LI7/f;

    invoke-virtual {v0}, LI7/f;->h()V

    iget-object v0, p0, LI7/b;->b:LI7/a;

    invoke-virtual {v0}, LI7/a;->c()V

    iget-object v0, p0, LI7/b;->c:LI7/c;

    invoke-virtual {v0}, LI7/c;->c()V

    iget-object p0, p0, LI7/b;->d:LI7/d;

    invoke-virtual {p0}, LI7/d;->j()Z

    return-void
.end method
