.class public final synthetic LZ6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LZ6/d;


# direct methods
.method public synthetic constructor <init>(LZ6/d;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ6/b;->q:LZ6/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, LZ6/b;->q:LZ6/d;

    invoke-static {p0}, LZ6/d;->a(LZ6/d;)V

    return-void
.end method
