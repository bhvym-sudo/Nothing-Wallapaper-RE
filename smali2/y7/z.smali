.class public final synthetic Ly7/z;
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

    check-cast p1, Lh8/o;

    invoke-static {p1}, Ly7/C;->c(Lh8/o;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method
