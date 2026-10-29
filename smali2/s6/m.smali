.class public final synthetic Ls6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Ls6/p;


# direct methods
.method public synthetic constructor <init>(Ls6/p;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/m;->q:Ls6/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Ls6/m;->q:Ls6/p;

    invoke-static {p0}, Ls6/p;->e(Ls6/p;)V

    return-void
.end method
