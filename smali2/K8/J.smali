.class public final synthetic LK8/J;
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

    check-cast p1, LK8/O;

    check-cast p2, Lm8/i$b;

    invoke-static {p1, p2}, LK8/K;->c(LK8/O;Lm8/i$b;)LK8/O;

    move-result-object p0

    return-object p0
.end method
