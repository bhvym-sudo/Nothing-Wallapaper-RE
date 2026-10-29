.class public final synthetic LQ7/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/l;


# instance fields
.field public final synthetic q:LQ7/s;


# direct methods
.method public synthetic constructor <init>(LQ7/s;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ7/q;->q:LQ7/s;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    iget-object p0, p0, LQ7/q;->q:LQ7/s;

    check-cast p1, Lf4/g;

    invoke-static {p0, p1}, LQ7/s;->b(LQ7/s;Lf4/g;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
