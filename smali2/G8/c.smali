.class public final synthetic LG8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/d0;


# instance fields
.field public final synthetic q:LG8/f;

.field public final synthetic r:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(LG8/f;Ljava/lang/Runnable;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG8/c;->q:LG8/f;

    iput-object p2, p0, LG8/c;->r:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final dispose()V
    .registers 2

    iget-object v0, p0, LG8/c;->q:LG8/f;

    iget-object p0, p0, LG8/c;->r:Ljava/lang/Runnable;

    invoke-static {v0, p0}, LG8/f;->p1(LG8/f;Ljava/lang/Runnable;)V

    return-void
.end method
