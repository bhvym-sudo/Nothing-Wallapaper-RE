.class public final Lh8/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh8/h;
.implements Ljava/io/Serializable;


# instance fields
.field private q:Lv8/a;

.field private r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lv8/a;)V
    .registers 3

    const-string v0, "initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/B;->q:Lv8/a;

    sget-object p1, Lh8/y;->a:Lh8/y;

    iput-object p1, p0, Lh8/B;->r:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Z
    .registers 2

    iget-object p0, p0, Lh8/B;->r:Ljava/lang/Object;

    sget-object v0, Lh8/y;->a:Lh8/y;

    if-eq p0, v0, :cond_8

    const/4 p0, 0x1

    return p0

    :cond_8
    const/4 p0, 0x0

    return p0
.end method

.method public getValue()Ljava/lang/Object;
    .registers 3

    iget-object v0, p0, Lh8/B;->r:Ljava/lang/Object;

    sget-object v1, Lh8/y;->a:Lh8/y;

    if-ne v0, v1, :cond_14

    iget-object v0, p0, Lh8/B;->q:Lv8/a;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;)V

    invoke-interface {v0}, Lv8/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lh8/B;->r:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lh8/B;->q:Lv8/a;

    :cond_14
    iget-object p0, p0, Lh8/B;->r:Ljava/lang/Object;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .registers 2

    invoke-virtual {p0}, Lh8/B;->a()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Lh8/B;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_f
    const-string p0, "Lazy value not initialized yet."

    return-object p0
.end method
