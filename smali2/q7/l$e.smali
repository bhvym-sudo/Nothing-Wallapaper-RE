.class final synthetic Lq7/l$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/I;
.implements Lkotlin/jvm/internal/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq7/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field private final synthetic q:Lv8/l;


# direct methods
.method constructor <init>(Lv8/l;)V
    .registers 3

    const-string v0, "function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq7/l$e;->q:Lv8/l;

    return-void
.end method


# virtual methods
.method public final a()Lh8/e;
    .registers 1

    iget-object p0, p0, Lq7/l$e;->q:Lv8/l;

    return-object p0
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .registers 2

    iget-object p0, p0, Lq7/l$e;->q:Lv8/l;

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 4

    instance-of v0, p1, Landroidx/lifecycle/I;

    const/4 v1, 0x0

    if-eqz v0, :cond_18

    instance-of v0, p1, Lkotlin/jvm/internal/i;

    if-eqz v0, :cond_18

    invoke-interface {p0}, Lkotlin/jvm/internal/i;->a()Lh8/e;

    move-result-object p0

    check-cast p1, Lkotlin/jvm/internal/i;

    invoke-interface {p1}, Lkotlin/jvm/internal/i;->a()Lh8/e;

    move-result-object p1

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_18
    return v1
.end method

.method public final hashCode()I
    .registers 1

    invoke-interface {p0}, Lkotlin/jvm/internal/i;->a()Lh8/e;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0
.end method
