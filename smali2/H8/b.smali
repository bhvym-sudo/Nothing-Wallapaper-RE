.class public final synthetic LH8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# instance fields
.field public final synthetic q:LH8/e;


# direct methods
.method public synthetic constructor <init>(LH8/e;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH8/b;->q:LH8/e;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget-object p0, p0, LH8/b;->q:LH8/e;

    check-cast p1, LN8/k;

    invoke-static {p0, p1, p2, p3}, LH8/e;->b(LH8/e;LN8/k;Ljava/lang/Object;Ljava/lang/Object;)Lv8/q;

    move-result-object p0

    return-object p0
.end method
