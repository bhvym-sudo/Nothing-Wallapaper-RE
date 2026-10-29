.class public final synthetic LR7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR7/b;->q:Ljava/lang/String;

    iput-object p2, p0, LR7/b;->r:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    iget-object v0, p0, LR7/b;->q:Ljava/lang/String;

    iget-object p0, p0, LR7/b;->r:Landroid/os/Bundle;

    invoke-static {v0, p0}, LR7/c;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
