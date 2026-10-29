.class public final LY6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP8/w;


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Li6/l;->a:Li6/l;

    invoke-virtual {v0, p1}, Li6/l;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LY6/a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(LP8/w$a;)LP8/D;
    .registers 6

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LP8/w$a;->b()LP8/B;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    iget-object p0, p0, LY6/a;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Li6/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_2a

    const-string p0, ""

    :cond_2a
    invoke-virtual {v0}, LP8/B;->h()LP8/B$a;

    move-result-object v0

    const-string v2, "Accept"

    const-string v3, "application/json;charset=utf-8"

    invoke-virtual {v0, v2, v3}, LP8/B$a;->a(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    move-result-object v0

    const-string v2, "timestamp"

    invoke-virtual {v0, v2, v1}, LP8/B$a;->a(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    move-result-object v0

    const-string v1, "auth"

    invoke-virtual {v0, v1, p0}, LP8/B$a;->a(Ljava/lang/String;Ljava/lang/String;)LP8/B$a;

    move-result-object p0

    invoke-virtual {p0}, LP8/B$a;->b()LP8/B;

    move-result-object p0

    invoke-interface {p1, p0}, LP8/w$a;->a(LP8/B;)LP8/D;

    move-result-object p0

    return-object p0
.end method
