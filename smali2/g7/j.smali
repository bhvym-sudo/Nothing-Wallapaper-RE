.class public final synthetic Lg7/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:Lv8/l;


# direct methods
.method public synthetic constructor <init>(Lv8/l;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg7/j;->a:Lv8/l;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .registers 2

    iget-object p0, p0, Lg7/j;->a:Lv8/l;

    invoke-static {p0, p1}, Lg7/k;->V0(Lv8/l;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
