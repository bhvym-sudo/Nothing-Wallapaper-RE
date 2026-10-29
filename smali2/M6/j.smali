.class public final synthetic LM6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/p;


# instance fields
.field public final synthetic q:LM6/k;


# direct methods
.method public synthetic constructor <init>(LM6/k;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/j;->q:LM6/k;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3

    iget-object p0, p0, LM6/j;->q:LM6/k;

    check-cast p1, Lg3/x;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p0, p1, p2}, LM6/k;->d(LM6/k;Lg3/x;Z)Lh8/A;

    move-result-object p0

    return-object p0
.end method
