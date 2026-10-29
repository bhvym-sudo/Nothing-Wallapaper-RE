.class public final synthetic Ls6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Ls6/h;


# direct methods
.method public synthetic constructor <init>(Ls6/h;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/e;->q:Ls6/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Ls6/e;->q:Ls6/h;

    invoke-static {p0}, Ls6/h;->f(Ls6/h;)V

    return-void
.end method
