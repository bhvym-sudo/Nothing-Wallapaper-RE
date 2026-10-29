.class public final synthetic LO8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/q;


# instance fields
.field public final synthetic q:LO8/f;


# direct methods
.method public synthetic constructor <init>(LO8/f;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO8/b;->q:LO8/f;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4

    iget-object p0, p0, LO8/b;->q:LO8/f;

    check-cast p1, LN8/k;

    invoke-static {p0, p1, p2, p3}, LO8/f;->u(LO8/f;LN8/k;Ljava/lang/Object;Ljava/lang/Object;)Lv8/q;

    move-result-object p0

    return-object p0
.end method
