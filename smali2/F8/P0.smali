.class final LF8/P0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final q:LF8/I;

.field private final r:LF8/l;


# direct methods
.method public constructor <init>(LF8/I;LF8/l;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF8/P0;->q:LF8/I;

    iput-object p2, p0, LF8/P0;->r:LF8/l;

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, LF8/P0;->r:LF8/l;

    iget-object p0, p0, LF8/P0;->q:LF8/I;

    sget-object v1, Lh8/A;->a:Lh8/A;

    invoke-interface {v0, p0, v1}, LF8/l;->q(LF8/I;Ljava/lang/Object;)V

    return-void
.end method
