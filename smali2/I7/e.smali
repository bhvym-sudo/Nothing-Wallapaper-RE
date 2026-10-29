.class public final synthetic LI7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LI7/f;


# direct methods
.method public synthetic constructor <init>(LI7/f;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI7/e;->q:LI7/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, LI7/e;->q:LI7/f;

    invoke-static {p0}, LI7/f;->a(LI7/f;)V

    return-void
.end method
