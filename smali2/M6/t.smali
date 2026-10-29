.class public final synthetic LM6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Le3/K;

.field public final synthetic r:Ljava/util/List;

.field public final synthetic s:LM6/u;


# direct methods
.method public synthetic constructor <init>(Le3/K;Ljava/util/List;LM6/u;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/t;->q:Le3/K;

    iput-object p2, p0, LM6/t;->r:Ljava/util/List;

    iput-object p3, p0, LM6/t;->s:LM6/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, LM6/t;->q:Le3/K;

    iget-object v1, p0, LM6/t;->r:Ljava/util/List;

    iget-object p0, p0, LM6/t;->s:LM6/u;

    invoke-static {v0, v1, p0}, LM6/u$a;->b(Le3/K;Ljava/util/List;LM6/u;)V

    return-void
.end method
