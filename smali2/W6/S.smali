.class public final synthetic LW6/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# instance fields
.field public final synthetic q:LW6/U;


# direct methods
.method public synthetic constructor <init>(LW6/U;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/S;->q:LW6/U;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LW6/S;->q:LW6/U;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p0, p1, p2}, LW6/U;->c1(LW6/U;II)Lh8/A;

    move-result-object p0

    return-object p0
.end method
