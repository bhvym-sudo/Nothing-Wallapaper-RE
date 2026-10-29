.class public final synthetic Lq6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lq6/f;


# direct methods
.method public synthetic constructor <init>(Lq6/f;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq6/e;->q:Lq6/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    iget-object p0, p0, Lq6/e;->q:Lq6/f;

    invoke-static {p0}, Lq6/f;->a(Lq6/f;)V

    return-void
.end method
