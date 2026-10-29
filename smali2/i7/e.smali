.class public final synthetic Li7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# direct methods
.method public synthetic constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    check-cast p1, Lg3/x;

    invoke-static {p1}, Li7/g;->b(Lg3/x;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
