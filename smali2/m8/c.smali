.class public final synthetic Lm8/c;
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

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lm8/i$b;

    invoke-static {p1, p2}, Lm8/d;->c(Ljava/lang/String;Lm8/i$b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
