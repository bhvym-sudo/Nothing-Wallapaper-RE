.class public final synthetic LK8/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    check-cast p2, Lm8/i$b;

    invoke-static {p1, p2}, LK8/K;->b(Ljava/lang/Object;Lm8/i$b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
