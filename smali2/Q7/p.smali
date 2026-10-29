.class public final synthetic LQ7/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LQ7/s;


# direct methods
.method public synthetic constructor <init>(LQ7/s;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ7/p;->q:LQ7/s;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, LQ7/p;->q:LQ7/s;

    invoke-static {p0}, LQ7/s;->d(LQ7/s;)V

    return-void
.end method
