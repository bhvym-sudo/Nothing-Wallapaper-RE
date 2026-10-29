.class public final LK6/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK6/a;->h(Lg3/c;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg3/c;

.field final synthetic b:LK6/a;


# direct methods
.method constructor <init>(Lg3/c;LK6/a;)V
    .registers 3

    iput-object p1, p0, LK6/a$c;->a:Lg3/c;

    iput-object p2, p0, LK6/a$c;->b:LK6/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .registers 2

    iget-object v0, p0, LK6/a$c;->a:Lg3/c;

    invoke-interface {v0}, Lg3/c;->a()V

    iget-object p0, p0, LK6/a$c;->b:LK6/a;

    const/4 v0, 0x1

    invoke-static {p0, v0}, LK6/a;->p(LK6/a;Z)V

    return-void
.end method

.method public b(Lg3/a;)V
    .registers 4

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lg3/a;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "cape_category"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    return-void

    :cond_12
    iget-object v0, p0, LK6/a$c;->a:Lg3/c;

    invoke-interface {v0, p1}, Lg3/c;->b(Lg3/a;)V

    iget-object v0, p0, LK6/a$c;->b:LK6/a;

    invoke-static {v0, p1}, LK6/a;->k(LK6/a;Lg3/a;)I

    move-result v0

    if-ltz v0, :cond_32

    iget-object v1, p0, LK6/a$c;->b:LK6/a;

    invoke-static {v1}, LK6/a;->l(LK6/a;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iget-object p0, p0, LK6/a$c;->b:LK6/a;

    invoke-static {p0}, LK6/a;->l(LK6/a;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    :cond_32
    iget-object p0, p0, LK6/a$c;->b:LK6/a;

    invoke-static {p0}, LK6/a;->l(LK6/a;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
