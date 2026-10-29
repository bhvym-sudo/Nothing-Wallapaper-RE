.class public final synthetic Lr6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lr6/g;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lr6/g;Ljava/lang/String;Landroid/os/Bundle;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr6/f;->q:Lr6/g;

    iput-object p2, p0, Lr6/f;->r:Ljava/lang/String;

    iput-object p3, p0, Lr6/f;->s:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lr6/f;->q:Lr6/g;

    iget-object v1, p0, Lr6/f;->r:Ljava/lang/String;

    iget-object p0, p0, Lr6/f;->s:Landroid/os/Bundle;

    invoke-static {v0, v1, p0}, Lr6/g;->a(Lr6/g;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
