.class public final synthetic LW6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LW6/x;


# direct methods
.method public synthetic constructor <init>(LW6/x;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW6/n;->q:LW6/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, LW6/n;->q:LW6/x;

    invoke-static {p0}, LW6/x;->S0(LW6/x;)V

    return-void
.end method
