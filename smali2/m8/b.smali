.class public abstract Lm8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm8/i$c;


# instance fields
.field private final q:Lv8/l;

.field private final r:Lm8/i$c;


# direct methods
.method public constructor <init>(Lm8/i$c;Lv8/l;)V
    .registers 4

    const-string v0, "baseKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "safeCast"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lm8/b;->q:Lv8/l;

    instance-of p2, p1, Lm8/b;

    if-eqz p2, :cond_17

    check-cast p1, Lm8/b;

    iget-object p1, p1, Lm8/b;->r:Lm8/i$c;

    :cond_17
    iput-object p1, p0, Lm8/b;->r:Lm8/i$c;

    return-void
.end method


# virtual methods
.method public final a(Lm8/i$c;)Z
    .registers 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p1, p0, :cond_e

    iget-object p0, p0, Lm8/b;->r:Lm8/i$c;

    if-ne p0, p1, :cond_c

    goto :goto_e

    :cond_c
    const/4 p0, 0x0

    return p0

    :cond_e
    :goto_e
    const/4 p0, 0x1

    return p0
.end method

.method public final b(Lm8/i$b;)Lm8/i$b;
    .registers 3

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lm8/b;->q:Lv8/l;

    invoke-interface {p0, p1}, Lv8/l;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm8/i$b;

    return-object p0
.end method
