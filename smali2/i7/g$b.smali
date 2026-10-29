.class public final Li7/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg3/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li7/g;->h(Landroid/content/Context;Lv8/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv8/l;

.field final synthetic b:Li7/g;


# direct methods
.method constructor <init>(Lv8/l;Li7/g;)V
    .registers 3

    iput-object p1, p0, Li7/g$b;->a:Lv8/l;

    iput-object p2, p0, Li7/g$b;->b:Li7/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .registers 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, LK6/a;->h:LK6/a$a;

    invoke-virtual {v1}, LK6/a$a;->a()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_16

    iget-object v3, p0, Li7/g$b;->b:Li7/g;

    invoke-static {v3}, Li7/g;->c(Li7/g;)I

    move-result v4

    invoke-static {v3, v0, v2, v4}, Li7/g;->e(Li7/g;Ljava/util/List;Ljava/util/List;I)V

    :cond_16
    invoke-virtual {v1}, LK6/a$a;->c()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_25

    iget-object v2, p0, Li7/g$b;->b:Li7/g;

    invoke-static {v2}, Li7/g;->c(Li7/g;)I

    move-result v3

    invoke-static {v2, v0, v1, v3}, Li7/g;->e(Li7/g;Ljava/util/List;Ljava/util/List;I)V

    :cond_25
    iget-object p0, p0, Li7/g$b;->a:Lv8/l;

    invoke-interface {p0, v0}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b(Lg3/a;)V
    .registers 2

    return-void
.end method
