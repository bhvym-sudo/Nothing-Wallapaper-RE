.class public final synthetic LN7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroidx/lifecycle/q;

.field public final synthetic r:LN7/f$a;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/q;LN7/f$a;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN7/e;->q:Landroidx/lifecycle/q;

    iput-object p2, p0, LN7/e;->r:LN7/f$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, LN7/e;->q:Landroidx/lifecycle/q;

    iget-object p0, p0, LN7/e;->r:LN7/f$a;

    invoke-static {v0, p0}, LN7/f;->c(Landroidx/lifecycle/q;LN7/f$a;)V

    return-void
.end method
