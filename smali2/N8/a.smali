.class public final synthetic LN8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LN8/k;

.field public final synthetic r:LN8/b;


# direct methods
.method public synthetic constructor <init>(LN8/k;LN8/b;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN8/a;->q:LN8/k;

    iput-object p2, p0, LN8/a;->r:LN8/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, LN8/a;->q:LN8/k;

    iget-object p0, p0, LN8/a;->r:LN8/b;

    invoke-static {v0, p0}, LN8/b;->a(LN8/k;LN8/b;)V

    return-void
.end method
