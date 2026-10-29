.class public final synthetic Li7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Li7/d;

.field public final synthetic r:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Li7/d;Landroid/content/Context;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li7/b;->q:Li7/d;

    iput-object p2, p0, Li7/b;->r:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, Li7/b;->q:Li7/d;

    iget-object p0, p0, Li7/b;->r:Landroid/content/Context;

    invoke-static {v0, p0}, Li7/d;->g(Li7/d;Landroid/content/Context;)V

    return-void
.end method
