.class public final LG7/v$c$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/v$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic q:Lkotlin/jvm/internal/E;

.field final synthetic r:Lkotlin/jvm/internal/E;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;)V
    .registers 3

    iput-object p1, p0, LG7/v$c$a$b;->q:Lkotlin/jvm/internal/E;

    iput-object p2, p0, LG7/v$c$a$b;->r:Lkotlin/jvm/internal/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public j(Landroidx/lifecycle/x;)V
    .registers 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/h;->j(Landroidx/lifecycle/x;)V

    iget-object p0, p0, LG7/v$c$a$b;->r:Lkotlin/jvm/internal/E;

    iget-object p0, p0, Lkotlin/jvm/internal/E;->q:Ljava/lang/Object;

    check-cast p0, Ls6/i;

    if-eqz p0, :cond_14

    const/4 p1, 0x0

    invoke-interface {p0, p1}, Ls6/i;->c(Z)V

    :cond_14
    return-void
.end method

.method public onStop(Landroidx/lifecycle/x;)V
    .registers 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/h;->onStop(Landroidx/lifecycle/x;)V

    iget-object p1, p0, LG7/v$c$a$b;->q:Lkotlin/jvm/internal/E;

    iget-object p0, p0, LG7/v$c$a$b;->r:Lkotlin/jvm/internal/E;

    invoke-static {p1, p0}, LG7/v;->c(Lkotlin/jvm/internal/E;Lkotlin/jvm/internal/E;)V

    return-void
.end method
