.class public final synthetic LG8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LF8/l;

.field public final synthetic r:LG8/f;


# direct methods
.method public synthetic constructor <init>(LF8/l;LG8/f;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG8/d;->q:LF8/l;

    iput-object p2, p0, LG8/d;->r:LG8/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, LG8/d;->q:LF8/l;

    iget-object p0, p0, LG8/d;->r:LG8/f;

    invoke-static {v0, p0}, LG8/f;->o1(LF8/l;LG8/f;)V

    return-void
.end method
