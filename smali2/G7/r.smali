.class public final synthetic LG7/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/u;


# instance fields
.field public final synthetic q:LS1/a;

.field public final synthetic r:LH7/d;


# direct methods
.method public synthetic constructor <init>(LS1/a;LH7/d;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG7/r;->q:LS1/a;

    iput-object p2, p0, LG7/r;->r:LH7/d;

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V
    .registers 4

    iget-object v0, p0, LG7/r;->q:LS1/a;

    iget-object p0, p0, LG7/r;->r:LH7/d;

    invoke-static {v0, p0, p1, p2}, LG7/s;->b(LS1/a;LH7/d;Landroidx/lifecycle/x;Landroidx/lifecycle/q$a;)V

    return-void
.end method
