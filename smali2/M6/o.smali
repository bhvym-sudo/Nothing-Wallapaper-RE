.class public final synthetic LM6/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LM6/k$d;

.field public final synthetic r:F


# direct methods
.method public synthetic constructor <init>(LM6/k$d;F)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM6/o;->q:LM6/k$d;

    iput p2, p0, LM6/o;->r:F

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, LM6/o;->q:LM6/k$d;

    iget p0, p0, LM6/o;->r:F

    invoke-static {v0, p0}, LM6/k$d;->e(LM6/k$d;F)V

    return-void
.end method
