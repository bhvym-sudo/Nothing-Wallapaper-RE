.class public final synthetic LT6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:LT6/f;

.field public final synthetic r:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LT6/f;Ljava/lang/String;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT6/e;->q:LT6/f;

    iput-object p2, p0, LT6/e;->r:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, LT6/e;->q:LT6/f;

    iget-object p0, p0, LT6/e;->r:Ljava/lang/String;

    invoke-static {v0, p0}, LT6/f$a;->a(LT6/f;Ljava/lang/String;)V

    return-void
.end method
