.class public final synthetic LJ8/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# instance fields
.field public final synthetic q:LJ8/v;


# direct methods
.method public synthetic constructor <init>(LJ8/v;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ8/x;->q:LJ8/v;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LJ8/x;->q:LJ8/v;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Lm8/i$b;

    invoke-static {p0, p1, p2}, LJ8/y;->a(LJ8/v;ILm8/i$b;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method
