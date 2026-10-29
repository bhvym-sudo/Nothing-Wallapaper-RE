.class public final synthetic LJ6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LJ6/l$a;

.field public final synthetic r:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(LJ6/l$a;Ljava/util/List;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ6/k;->q:LJ6/l$a;

    iput-object p2, p0, LJ6/k;->r:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, LJ6/k;->q:LJ6/l$a;

    iget-object p0, p0, LJ6/k;->r:Ljava/util/List;

    invoke-static {v0, p0}, LJ6/l;->q(LJ6/l$a;Ljava/util/List;)V

    return-void
.end method
