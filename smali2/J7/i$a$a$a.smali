.class final LJ7/i$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ7/i$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic q:LJ7/i;


# direct methods
.method constructor <init>(LJ7/i;)V
    .registers 2

    iput-object p1, p0, LJ7/i$a$a$a;->q:LJ7/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lm8/e;)Ljava/lang/Object;
    .registers 3

    iget-object p2, p0, LJ7/i$a$a$a;->q:LJ7/i;

    invoke-virtual {p2}, LJ7/i;->e0()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->clear()V

    iget-object p0, p0, LJ7/i$a$a$a;->q:LJ7/i;

    invoke-virtual {p0}, LJ7/i;->e0()Ljava/util/List;

    move-result-object p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lm8/e;)Ljava/lang/Object;
    .registers 3

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, LJ7/i$a$a$a;->a(Ljava/util/List;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
