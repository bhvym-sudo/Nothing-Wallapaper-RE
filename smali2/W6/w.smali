.class public final synthetic LW6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LW6/x;

.field public final synthetic r:Le3/q;


# direct methods
.method public synthetic constructor <init>(LW6/x;Le3/q;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/w;->q:LW6/x;

    iput-object p2, p0, LW6/w;->r:Le3/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, LW6/w;->q:LW6/x;

    iget-object p0, p0, LW6/w;->r:Le3/q;

    invoke-static {v0, p0}, LW6/x;->V0(LW6/x;Le3/q;)V

    return-void
.end method
