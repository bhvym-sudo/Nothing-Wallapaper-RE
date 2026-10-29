.class public final synthetic LM6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# instance fields
.field public final synthetic q:Z

.field public final synthetic r:LM6/k$d;


# direct methods
.method public synthetic constructor <init>(ZLM6/k$d;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LM6/m;->q:Z

    iput-object p2, p0, LM6/m;->r:LM6/k$d;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 2

    iget-boolean v0, p0, LM6/m;->q:Z

    iget-object p0, p0, LM6/m;->r:LM6/k$d;

    invoke-static {v0, p0}, LM6/k$d;->d(ZLM6/k$d;)Lh8/A;

    move-result-object p0

    return-object p0
.end method
