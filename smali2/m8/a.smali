.class public abstract Lm8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm8/i$b;


# instance fields
.field private final q:Lm8/i$c;


# direct methods
.method public constructor <init>(Lm8/i$c;)V
    .registers 3

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm8/a;->q:Lm8/i$c;

    return-void
.end method


# virtual methods
.method public U0(Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;
    .registers 3

    invoke-static {p0, p1, p2}, Lm8/i$b$a;->a(Lm8/i$b;Ljava/lang/Object;Lv8/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public b(Lm8/i$c;)Lm8/i$b;
    .registers 2

    invoke-static {p0, p1}, Lm8/i$b$a;->b(Lm8/i$b;Lm8/i$c;)Lm8/i$b;

    move-result-object p0

    return-object p0
.end method

.method public getKey()Lm8/i$c;
    .registers 1

    iget-object p0, p0, Lm8/a;->q:Lm8/i$c;

    return-object p0
.end method

.method public t0(Lm8/i$c;)Lm8/i;
    .registers 2

    invoke-static {p0, p1}, Lm8/i$b$a;->c(Lm8/i$b;Lm8/i$c;)Lm8/i;

    move-result-object p0

    return-object p0
.end method

.method public z(Lm8/i;)Lm8/i;
    .registers 2

    invoke-static {p0, p1}, Lm8/i$b$a;->d(Lm8/i$b;Lm8/i;)Lm8/i;

    move-result-object p0

    return-object p0
.end method
